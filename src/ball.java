public class ball {
    private String type;
    private float radius;
    private String color;

    public String toString()  {
        String s = "тип мяча" + type +"\n" + "радиус мяча" + radius + "\n" + "цвет мяча" + color;
        return s;
    }

    public String getType() {
        return type;
    }

    public void setType(String type){
        this.type = type;
    }
     public float getRadius (){
        return radius;
     }

    public void setRadius(Float radius){
        this.radius = radius;
    }
    public String getColor() {
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }
}
