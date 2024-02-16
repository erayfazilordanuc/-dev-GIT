class carclass {
    // Nitelikler
    String type,model,color;
    int speed;

    // Metotlar
    carclass(String type,String model,String color,int speed){
        System.out.println("\nDeğişkenli nesne oluşturuldu\n");
        this.type = type;
        this.model = model;
        this.color = color;
        this.speed = speed;
    }
    carclass(){
      System.out.println("\nBoş nesne oluşturuldu\n");
    }
    void increasing(int increment){
        int spd = this.speed;
        if(spd+increment<=250){
         spd+=increment;
        }
    }
    void decreasing(int decrease){
        int spd = this.speed;
        if(spd-decrease>=0){
        spd-=decrease;
        }
    }
    void printInfo(){
        System.out.println("Type : "+this.type);
        System.out.println("Model : "+this.model);
        System.out.println("Color : "+this.color);
        System.out.println("Speed : "+this.speed+"\n");
    }
}
