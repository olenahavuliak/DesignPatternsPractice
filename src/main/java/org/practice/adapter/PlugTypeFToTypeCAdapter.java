package org.practice.adapter;

public class PlugTypeFToTypeCAdapter extends PlugTypeC{
    private final PlugTypeF plugTypeF;
    PlugTypeFToTypeCAdapter(PlugTypeF plugTypeF){
        this.plugTypeF = plugTypeF;
    }
    @Override
    void connectToPlugTypeC(){
        plugTypeF.connectToPlugTypeF();
        System.out.println("Adapted: Type F plug adapted to Type C.");
    }

}
