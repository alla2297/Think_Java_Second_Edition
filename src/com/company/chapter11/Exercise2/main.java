package com.company.chapter11.Exercise2;

public class main {
    public static void main(String[] args) {
        Tile tile1 = new Tile(10,'c');
        printTile(tile1);
        Tile tile2 = new Tile(10,'c');
        Tile tile3 = new Tile(5,'z');

        System.out.println("Is tile1 equal to tile2: "+tile1.equals(tile2));
        System.out.println("Is tile1 equal to tile3: "+tile1.equals(tile3));
    }
    static void printTile(Tile tile){
        System.out.println(tile);
    }

}
