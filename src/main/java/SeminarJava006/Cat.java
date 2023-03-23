package SeminarJava006;

//1 Продумайте структуру класса Кот. Какие поля и методы будут актуальны для приложения, которое является
//а) информационной системой ветеринарной клиники
//б) архивом выставки котов
//в) информационной системой Театра кошек Ю. Д. Куклачёва
//Можно записать в текстовом виде, не обязательно реализовывать в java.
//2 Реализуйте 1 из вариантов класса Cat из предыдущего задания, можно использовать не все придуманные поля и методы.
// Создайте несколько экземпляров этого класса, выведите их в консоль.
//Добейтесь того, чтобы при выводе в консоль объекта типа Cat, выводилась его кличка, цвет и возраст
// (или другие параметры на ваше усмотрение)
public class Cat {
    String name;
    String breed;
    Integer age;
    String sex;
    String color;

    @Override
    public String toString() {
        return "Cat{" +
                "Кличка='" + name + '\'' +
                ", Порода='" + breed + '\'' +
                ", Возраст=" + age +
                ", Пол='" + sex + '\'' +
                ", Цвет='" + color + '\'' +
                '}';
    }

    public void showInfo() {
        System.out.println("Имя: " + name + "\nПорода: " + breed + "\nВозраст: " + age + "\nПол: " + sex +
                "\nЦвет: " + color);
    }

    public void eat() {
        System.out.println("Котик кушает");
    }

    public void Miu() {
        System.out.println("Мяу!");
    }

    public void addInfo(String name, String color, int age, String sex, String breed) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.sex = sex;
        this.breed = breed;
    }

}
