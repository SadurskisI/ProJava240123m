package javaPro.homeworks.homework1;

public class Phone {
    private int number;
    private String model;
    private int weight;
    public Phone(int number, String model, int weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }
    void receiveCall(String whoCallName){
        System.out.println("Звонит " +whoCallName);
    }
    int getNumber() {
        return number;
    }
    public static void main(String[] args) {

        Phone phone1 = new Phone(123456," Iphone X ", 50);
        System.out.println(phone1.number + phone1.model + phone1.weight+"g");
        phone1.receiveCall("Ivan");
        phone1.getNumber();

        Phone phone2 = new Phone(654321, " Iphone 14PRO ", 45);
        System.out.println(phone2.number + phone2.model + phone2.weight+"g");
        phone2.receiveCall("Oleg");
        phone2.getNumber();

        Phone phone3 = new Phone(456123, " Samsung ", 75);
        System.out.println(phone3.number + phone3.model + phone3.weight+"g");
        phone3.receiveCall("Alex");
        phone3.getNumber();
    }
}
