package com.company.Lec23;

import java.util.ArrayList;
import java.util.LinkedList;

public class MapusingArraylist {

    private ArrayList<LinkedList<Entity>> list = new ArrayList<>();

    private int size=0;

    private float lf= 0.5f;

    public MapusingArraylist() {

        for (int i = 0; i <100 ; i++) {
            list.add(new LinkedList<>());
        }
    }

    public void put(String key, String value){

        int hashcode= Math.abs(key.hashCode()%list.size());

        LinkedList<Entity> entity = list.get(hashcode);
        for (Entity e: entity) {
            if(e.key.equals(key)){
                e.value=value;
                return;
            }
        }

        if(((float)(size))/list.size()>lf){

            rehash();
        }

        entity.add(new Entity(key,value));
        size++;
    }

    private void rehash() {

        ArrayList<LinkedList<Entity>> old= list;

        list= new ArrayList<>();
        System.out.println("double up");

        for (int i = 0; i <old.size()*2 ; i++) {
            list.add(new LinkedList<>());
        }
        size=0;
        for (LinkedList<Entity> list: old) {

            for (Entity entity: list) {

                put(entity.key,entity.value);
            }

        }
    }

    public String get(String key){

        int hashcode=Math.abs(key.hashCode()%list.size());

        LinkedList<Entity> entity = list.get(hashcode);

        for (Entity e: entity) {

            if(e.key.equals(key)){
                return e.value;
            }
        }
        return null;
    }

    public void remove(String key){

        int hashcode=Math.abs(key.hashCode()%list.size());

        LinkedList<Entity> entity = list.get(hashcode);

        Entity temp=null;

        for (Entity e: entity) {
            if(e.key.equals(key)){
                temp=e;
            }
        }
        list.remove(temp);
        size--;
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

