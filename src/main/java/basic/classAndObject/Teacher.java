package basic.classAndObject;

public class Teacher extends Person {
    private String subject; // 教师特有属性

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    // 创建 Teacher 的 Builder
    public static Teacher.Builder builder() {
        return new Teacher.Builder();
    }

    // Teacher 的 Builder 类
    static class Builder extends Person.Builder {
        private String subject;

        public Builder subject(String subject) {
            this.subject = subject;
            return this;
        }

        // 重写继承自 Person.Builder 的方法以返回 Teacher.Builder
        @Override
        public Builder name(String name) {
            super.name(name);
            return this;
        }

        @Override
        public Builder age(int age) {
            super.age(age);
            return this;
        }

        // 重写 build 方法以返回 Teacher 实例
        @Override
        public Teacher build() {
            return new Teacher(this);
        }
    }

    // Teacher 的构造方法
    Teacher(Builder builder) {
        super(builder); // 调用父类构造器处理继承的属性
        this.subject = builder.subject;
    }
}
