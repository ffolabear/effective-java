package chapter2.item2;

import java.time.LocalDateTime;

public class Member {

    private Long id;
    private String name;
    private String nickName;
    private String email;
    private String phone;
    private String github;
    private String blog;

    private Grade grade;
    private LocalDateTime regDate;
    private Boolean isDeleted;

    public static class Builder {

        //필수 매개변수
        private Long id;
        private String name;

        //선택 매개변수
        private String nickName = "";
        private String email = "";
        private String phone = "";
        private String github = "";
        private String blog = "";
        private Grade grade = Grade.NORMAL;
        private LocalDateTime regDate = LocalDateTime.now();
        private Boolean isDeleted = false;


        public Builder(Long id, String name, String nickName, String email, String phone, String github, String blog,
                       Grade grade, LocalDateTime regDate, Boolean isDeleted) {
            this.id = id;
            this.name = name;
            this.nickName = nickName;
            this.email = email;
            this.phone = phone;
            this.github = github;
            this.blog = blog;
            this.grade = grade;
            this.regDate = regDate;
            this.isDeleted = isDeleted;
        }

        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder nickName(String nickName) {
            this.nickName = nickName;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public Builder github(String github) {
            this.github = github;
            return this;
        }

        public Builder blog(String blog) {
            this.blog = blog;
            return this;
        }

        public Builder grade(Grade grade) {
            this.grade = grade;
            return this;
        }

        public Builder regDate(LocalDateTime regDate) {
            this.regDate = regDate;
            return this;
        }

        public Builder isDeleted(boolean isDeleted) {
            this.isDeleted = isDeleted;
            return this;
        }

        public Member build() {
            return new Member(this);
        }

    }

    public Member(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.nickName = builder.nickName;
        this.email = builder.email;
        this.phone = builder.phone;
        this.github = builder.github;
        this.blog = builder.blog;
        this.regDate = builder.regDate;
        this.isDeleted = builder.isDeleted;
    }
}
