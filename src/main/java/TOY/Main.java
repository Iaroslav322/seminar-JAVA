package TOY;
public class Main {
    public static int chance = 50;
    public static void main(String[] args) {

        Toy doll = new Toy(1, "Кукла");
        Toy car = new Toy(2, "Машина");
        Toy radio_controlled = new Toy(3, "Р/У игрушка");
        Toy lego = new Toy(4, "Lego");
        Toy monopoly = new Toy(5, "Монополия");
        Toy kitchen = new Toy(6, "Кухня");
        Toy kids_gun = new Toy(7, "Детское ружье");


        Lottery lot = new Lottery();
        lot.add_toy_in_listToy(doll);
        lot.add_toy_in_listToy(car);
        lot.add_toy_in_listToy(radio_controlled);
        lot.add_toy_in_listToy(lego);
        lot.add_toy_in_listToy(monopoly);
        lot.add_toy_in_listToy(kitchen);
        lot.add_toy_in_listToy(kids_gun);

        while (true) {
            if (lot.getToy_count() == 0) {
                break;
            }


            lot.lotToy();


            lot.getToys();


            lot.getToy_count_print();
        }
    }
}
