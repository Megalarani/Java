// NAME : MEGALA S
// BATCH CODE : 2576
// HasMap , LinkedHashMap and TreeMap collections

import java.util.*;  
class HashMap1{  
public static void main(String args[])
{  
HashMap<Integer,String> hm=new HashMap<Integer,String>();    
System.out.println("HASHMAP......");  
System.out.println("Initial list of elements: "+hm);  
hm.put(501,"Aakash");    
hm.put(502,"Vinoth");    
hm.put(503,"Ravi");          
for(Map.Entry m:hm.entrySet())
{    
System.out.println(m.getKey()+" "+m.getValue());    
}  
// Insertion
hm.putIfAbsent(504, "Gowry");  
System.out.println("After Insertion ");  
for(Map.Entry m:hm.entrySet())
{    
System.out.println(m.getKey()+" "+m.getValue());    
} 
// Deletion
System.out.println("After Deletion ");
hm.remove(502);
//Updation
System.out.println("Updated List of Elements: "+hm);

LinkedHashMap<Integer,String> lhm=new LinkedHashMap<Integer,String>();  
System.out.println(" LINKEDHASHMAP......");  
System.out.println("Initial list of elements: "+hm);  
lhm.put(601,"Balu");    
lhm.put(602,"Vani");    
lhm.put(603,"Rohit");  
//Fetching Key
System.out.println("Keys : "+lhm.keySet());
// Deletion
System.out.println("After Deletion ");
lhm.remove(601);
//Updation
System.out.println("Updated List of Elements: "+lhm);


TreeMap<Integer,String> tmap=new TreeMap<Integer,String>(); 
System.out.println("TREEMAP......");     
tmap.put(701,"Subash");    
tmap.put(703,"Sona");    
tmap.put(704,"Elango");    
tmap.put(702,"Robin");    
//Maintains descending order  
System.out.println("descendingMap: "+tmap.descendingMap());  
//Returns key-value pairs whose keys are less than or equal to the specified key.  
System.out.println("headMap: "+tmap.headMap(703,true));  
//Returns key-value pairs whose keys are greater than or equal to the specified key.  
System.out.println("tailMap: "+tmap.tailMap(703,true));  
//Returns key-value pairs exists in between the specified key.  
System.out.println("subMap: "+tmap.subMap(701, false, 703, true));
}  
}  
