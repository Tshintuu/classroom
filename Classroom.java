public class Classroom {

    public static void main(String[] args) {
        Wilder loup = new Wilder ("Loup", true);
        Wilder patrice = new Wilder ("Patrice", false);
        Wilder julien = new Wilder ("Julien", true);
        Wilder aurelien = new Wilder ("Aurélien", false);
        Wilder arthur = new Wilder ("Arthur", true);
        Wilder lyne = new Wilder ("Lyne", false);

        System.out.println(loup.whoAmI());
        System.out.println(patrice.whoAmI());
        System.out.println(julien.whoAmI());
        System.out.println(aurelien.whoAmI());
        System.out.println(arthur.whoAmI());
        System.out.println(lyne.whoAmI());
    }
}