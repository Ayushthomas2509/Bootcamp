package com.company;

public class q9 {
enum house{
    flat(1000),
    bhk(2000),
    home(3000);
private int p;
house(int p){
    this.p=p;
}
public int getPrice(){
    return this.p;
}
}

q9(){
    for (house h : house.values())
    {
    System.out.println(h+" Price "+h.getPrice());
}
}


}
