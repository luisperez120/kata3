/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata3;

import java.util.HashMap;

/**
 *
 * @author Luis Pérez
 */
public class Histogram<T> {
    
    Map<T, Integer> map = new HashMap<>();
    
    public Integer get(T key){
        return map.get(key);
    }
    
    public Set<T> keySet(){
        return map.keySet();
    }
    
    public vois increment (T key){
        map.put(key, map.containsKey(key) ? );
    }
    
    
    
}
