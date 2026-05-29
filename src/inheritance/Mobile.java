package inheritance;

public class Mobile extends Object {
    public int size;

    public String color;

    public String model;

public int getSize() {
        return size;
    }
public void setSize(int size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }
        public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

public String parentModel(){
    System.out.println("iphoneModelName");
    return "ModelName";
}

//public static void main(String[] args) {
  //  System.out.println();
}


