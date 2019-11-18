package com.company.Lec23;

import java.util.LinkedList;

public class MapusingList {

   private LinkedList<Entity> list;

   public MapusingList() {
        this.list = new LinkedList<>();
    }

    public void put(String key, String value){

        for (Entity entity: list) {
            if(entity.key.equals(key)){
                entity.value=value;
                return;
            }
        }
        list.add(new Entity(key,value));

    }

    public String get(String key){

        for (Entity entity: list) {

            if(entity.key.equals(key)){
                return entity.value;
            }
        }
        return null;
    }

    public void remove(String key ){

       Entity temp=null;

        for (Entity entity: list) {
            if(entity.key.equals(key)){
                temp=entity;
            }
        }
        list.remove(temp);
    }

    public void keySet(){
        for (Entity entity:list) {
            System.out.println(entity.key);
        }
    }

    @Override
    public String toString() {

       String s="";

       s+="[";

        for (Entity entity: list) {
            s+=(entity.key+" -> "+entity.value+",");
        }
        s+="]";

        return s;

    }

    class Entity{

        String key;
        String value;

        public Entity(String key, String value) {
            this.key = key;
            this.value = value;
        }
    }
}
