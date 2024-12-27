public class Phone {
    private String number;
    private String model;
    private int weight;

    Phone(){
        this.number = "+70000000000";
        this.model = "NONE";
        this.weight = 0;
    }
    Phone(String number){
        this.number = number;
    }
    Phone(String number, String model){
        this.number = number;
        this.model = model;
    }
    Phone(String number, String model, int weight){
        this(number, model);
        this.weight = weight;
    }
    public void showPhone(){
        System.out.println("Phone model: " + model);
        System.out.println("Phone number: " + number);
        System.out.println("Phone weight: " + weight);
    }
    public void setNumber(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }
    public void receiveCall(String name){
        System.out.println("Calls " + name);
    }
    public void receiveCall(String name, String number){
        System.out.println("Calls " + name + "Number: " + number);
    }

    public void sendMessage(String... numbers) {
        System.out.println("The message has been sent: ");
        if (numbers.length == 0) {
            System.out.println("This number does not exist.");
        } else {
            for (String number : numbers) {
                System.out.println(number);
            }
        }
    }
}