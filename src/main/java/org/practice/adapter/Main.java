package org.practice.adapter;

public class Main {
    public static void main(String[] args) {
        PlugTypeF plugTypeF = new PlugTypeF();
        PlugTypeFToTypeCAdapter adapter = new PlugTypeFToTypeCAdapter(plugTypeF);

        usePlugTypeC(adapter);
    }

    static void usePlugTypeC(PlugTypeC plugTypeC) {
        plugTypeC.connectToPlugTypeC();
    }
}
