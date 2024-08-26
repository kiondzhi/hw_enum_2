import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Вася", 18, Person.Type.MAN));
        personList.add(new Person("Олег", 21, Person.Type.MAN));
        personList.add(new Person("Василиса", 8, Person.Type.WOMAN));
        personList.add(new Person("Варя", 35, Person.Type.WOMAN));
        personList.add(new Person("Дима", 38, Person.Type.MAN));
        personList.add(new Person("Антон", 23, Person.Type.MAN));
        personList.add(new Person("Александра", 23, Person.Type.WOMAN));
        personList.add(new Person("Настя", 18, Person.Type.WOMAN));
        personList.add(new Person("Витя", 19, Person.Type.MAN));
        personList.add(new Person("Коля", 27, Person.Type.MAN));

        Person.Type input = Person.Type.WOMAN;
        for (int i = 0; i < personList.size(); i++) {
            if (personList.get(i).gender.equals(input)) {
                System.out.println(personList.get(i));
            }
        }
    }
}