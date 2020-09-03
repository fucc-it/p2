public class Louader {
    public static void main (String[]args){
        ball a = new ball();

        a.setColor("Blue");
        a.setRadius(5.1f);
        a.setType("Foootbaaalll");

        ball b = new ball();

        b.color = "RED";
        b.radius = 3.4f;
        b.type = "Baseball";

        System.out.println(a.getColor());
        System.out.println();
        System.out.println(a);
    }
}
