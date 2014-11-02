package rs.in.jmax.scb.data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SCBContent {

    public static List<Apartman> ITEMS = new ArrayList<Apartman>();

    public static Map<String, Apartman> ITEM_MAP = new HashMap<String, Apartman>();

    private static int id = 1;

    static {
        addItem(new Apartman("", "Stan Servis", "", "+381 64 1068200", "COM"));
        addItem(new Apartman("", "Grossi Servis", "", "+381 63 219631", "COM"));
        addItem(new Apartman("1", "Moravka", "Radojkovic", "+381 64 1507773", "PER"));
        addItem(new Apartman("2", "Vladan", "Lukovic", "+381 60 1300704", "PER"));
        addItem(new Apartman("3", "Gordana", "Kalicanin", "N/A", "PER"));
        addItem(new Apartman("4", "Janos", "Siklosi", "+381 64 9085744", "PER"));
        addItem(new Apartman("5", "Masa", "Petrovic", "+381 65 3817821", "PER"));
//        addItem(new Apartman("6", "", "", "N/A", "PER"));
        addItem(new Apartman("7", "Nikola", "Kostic", "+381 64 2939229", "PER"));
        addItem(new Apartman("8", "Ljubisa", "Jovanovic", "+381 63 363136", "PER"));
        addItem(new Apartman("9", "Zarko", "Brzakovic", "+381 64 6629753", "PER"));
        addItem(new Apartman("10", "Nenad", "Stamenkovic", "+381 64 1204455", "PER"));
        addItem(new Apartman("11", "Marija", "Lazic", "+381 64 2116835", "PER"));
        addItem(new Apartman("12", "Vladimir", "Nikolic", "+381 64 2401797", "PER"));
        addItem(new Apartman("13", "Milan", "Bakic", "+381 63 1152201" , "PER"));
        addItem(new Apartman("14", "Goran", "Despotovski", "+381 62 303866", "PER"));
        addItem(new Apartman("15", "Ana", "Vasiljevic", "+381 63 7223357", "PER"));
        addItem(new Apartman("16", "Marija", "Blagojevic", "+381 64 1858145", "PER"));
        addItem(new Apartman("17", "Ljubomir", "Simovic", "+381 64 2655363", "PER"));
        addItem(new Apartman("18", "Maja", "Laketic", "N/A", "PER"));
        addItem(new Apartman("19", "Milica", "Joksic", "+381 62 371442", "PER"));
        addItem(new Apartman("20", "Andrijana", "Mijailovic", "N/A", "PER"));
//        addItem(new Apartman("21", "", "", "N/A", "PER"));
        addItem(new Apartman("22", "Aleksandar", "Djordjevic", "+381 60 4729368", "PER"));
        addItem(new Apartman("23", "Nevena", "Djokic", "+381 64 4206681", "PER"));
        addItem(new Apartman("24", "Vlade", "Maksimovic", "+381 69 711070", "PER"));
        addItem(new Apartman("25", "Goran", "Jelic", "+381 63 1267192", "PER"));
//        addItem(new Apartman("26", "", "", "N/A", "PER"));
        addItem(new Apartman("27", "Marija", "Krstic", "+381 64 2608991", "PER"));
        addItem(new Apartman("28", "Ivan", "Dobrosavljevic", "+381 65 9494994", "PER"));
        addItem(new Apartman("29", "Sasa", "Pokimica", "+381 63 1104951", "PER"));
        addItem(new Apartman("30", "Darko", "Andric", "+381 64 3048124", "PER"));
        addItem(new Apartman("31", "Vladimir", "Josifovic", "+381 64 2444013", "PER"));
        addItem(new Apartman("32", "Sandra", "Cadjenovic", "+381 62 228560", "PER"));
        addItem(new Apartman("33", "Dusan", "Radunovic", "+381 64 3467373", "PER"));
        addItem(new Apartman("34", "Vidinka", "Krstic", "+381 62 287202", "PER"));
        addItem(new Apartman("35", "Bogoljub", "Jankovic", "+381 64 6413625", "PER"));
        addItem(new Apartman("36", "Mladen", "Ranitovic", "+381 63 8120924", "PER"));
        addItem(new Apartman("37", "Tanja", "Nikolic", "+381 61 7216622", "PER"));
//        addItem(new Apartman("38", "", "", "N/A", "PER"));
        addItem(new Apartman("39", "Danijel", "Pesic", "+381 60 6224266", "PER"));
//        addItem(new Apartman("40", "", "", "N/A", "PER"));
//        addItem(new Apartman("41", "", "", "N/A", "PER"));
//        addItem(new Apartman("42", "", "", "N/A", "PER"));
//        addItem(new Apartman("43", "", "", "N/A", "PER"));
//        addItem(new Apartman("44", "", "", "N/A", "PER"));
//        addItem(new Apartman("45", "", "", "N/A", "PER"));
//        addItem(new Apartman("46", "", "", "N/A", "PER"));
        addItem(new Apartman("47", "Marko", "Pantic", "+381 66 5508282", "PER"));
//        addItem(new Apartman("48", "", "", "N/A", "PER"));
//        addItem(new Apartman("49", "", "", "N/A", "PER"));
    }

    private static void addItem(Apartman item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    public static class Apartman {
        public String id;
        public String number;
        public String ownerFirstName;
        public String ownerLastName;
        public String ownerPhone;
        public String type;

        public Apartman(String number, String ownerFirstName, String ownerLastName, String ownerPhone, String type) {
            this.id = String.valueOf(SCBContent.id);
            this.number = number;
            this.ownerFirstName = ownerFirstName;
            this.ownerLastName = ownerLastName;
            this.ownerPhone = ownerPhone;
            this.type = type;
            SCBContent.id++;
        }

        @Override
        public String toString() {
            if (type.equals("COM")) {
                return ownerFirstName;
            } else {
                return number + ". " + ownerFirstName + " " + ownerLastName;
            }
        }
    }
}