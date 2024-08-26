public class Person {
    String name;
    int age;
    Type gender;

    public Person(String name, int age, Type gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;

    }

    @Override
    public String toString() {
        return "Person{" +
                " name= " + name + " age= " + age + " gender= " + gender + "}";
    }

    enum Type {
        WOMAN("Женщина"),
        MAN("Мужчина");

        private String gender;

        Type(String gender) {
            this.gender = gender;
        }

        public String getType() {
            return gender;
        }
    }
}
