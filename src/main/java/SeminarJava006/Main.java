package SeminarJava006;

public class Main {
    public static void main(String[] args) {
        cat();
    }
    private static void cat(){
        Cat catVasya = new Cat();
        Cat catMatilda = new Cat();
        catVasya.addInfo("Василий", "Черный", 10, "Мальчик", "Дворовый");
        catMatilda.addInfo("Матильда", "Серая", 5, "Девочка", "Британская");
//        catVasya.Miu();
        System.out.println(catMatilda);
        System.out.println(catVasya);
        catVasya.showInfo();
        catMatilda.showInfo();
    }
}
