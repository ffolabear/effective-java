package chapter2.item2;

import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;

public abstract class Hamburger {

    public enum Ingredient {
        BUN, LETTUCE, PATTY, SAUCE
    }

    final Set<Ingredient> ingredients;

    abstract static class Builder<T extends Builder<T>> {
        EnumSet<Ingredient> ingredients = EnumSet.noneOf(Ingredient.class);

        public T addIngredient(Ingredient ingredient) {
            ingredients.add(Objects.requireNonNull(ingredient));
            return self();
        }

        abstract Hamburger build();

        protected abstract T self();
    }

    public Hamburger(Builder<?> builder) {
        ingredients = builder.ingredients.clone();
    }
}
