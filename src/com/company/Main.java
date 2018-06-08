package com.company;


public class Main {

    public static void main(String[] args) {
        OffItem[] setNewcomer = new OffItem[4]; /* у нас 4 предмета максимум*/
	Pen p = new Pen ();
	p.setName("ssss");
	p.setPrice(5);
	setNewcomer[0]=p;
	Pencil pe=new Pencil();
	pe.setName("ttt");
	pe.setPrice(8);
	setNewcomer[1]=pe;
	Notepad n = new Notepad();
	n.setName("bbb");
	n.setPrice(7);
	setNewcomer[2]=n;
	LedgerBook led = new LedgerBook();
	led.setName("lala");
	led.setPrice(225);

        System.out.println("Получившийся набор:");
        for (int i =0; i<4; i++) {
            if (setNewcomer[i]!=null) {
                System.out.println(setNewcomer[i].getName());
                System.out.println(setNewcomer[i].getPrice());
            }
        }
        System.out.println(led.getName() + " не для новичка, потому что стоит аж " + led.getPrice());
    }
}
