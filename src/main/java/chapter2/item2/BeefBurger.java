package chapter2.item2;

import java.util.Objects;

public class BeefBurger extends Hamburger{

    public enum Option {NORMAL, SET}

    private final Option option;

    public static class Builder extends Hamburger.Builder<Builder> {
        private final Option option;

        public Builder(Option option) {
            this.option = Objects.requireNonNull(option);
        }

        @Override
        Hamburger build() {
            return new BeefBurger(this);
        }

        @Override
        protected Builder self() {
            return this;
        }
    }


    private BeefBurger(Builder builder) {
        super(builder);
        option = builder.option;
    }
}
