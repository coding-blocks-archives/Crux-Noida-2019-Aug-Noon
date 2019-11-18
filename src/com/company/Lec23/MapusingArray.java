package com.company.Lec23;

public class MapusingArray {

    private Entity entity[] = new Entity[100];

    public void put(String Key, String value){

        int hashcode= Math.abs(Key.hashCode()%entity.length);
        entity[hashcode]=new Entity(Key,value);
    }

    public String get(String key){
        int hashcode= Math.abs(key.hashCode()%entity.length);

        if(entity[hashcode]!=null && entity[hashcode].key.equals(key)){
            return entity[hashcode].value;
        }
        return null;
    }

    public void remove(String key){

        int hashcode= Math.abs(key.hashCode()%entity.length);
        if(entity[hashcode]!=null && entity[hashcode].key.equals(key)){
            entity[hashcode]=null;
        }

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
