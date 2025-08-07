import java.util.LinkedList;

public class Implementation {
    static class HashMap<K,V>{

        private class Node{
            K key;
            V value;
             public Node(K key, V value){
                 this.key = key;
                 this.value = value;
             }
        }

        private int n;
        private int N;
        private LinkedList<Node>[] buckets;
        @SuppressWarnings("unchecked")
        public HashMap(){
                this.N = 4;
                buckets =  new LinkedList[N];
                for(int i =0; i < 4; i++){
                    buckets[i] = new LinkedList<>();
                }
        }
private int hashFn(K key){
            int hashedKey = key.hashCode();
            hashedKey = Math.abs(hashedKey) % N;
            return hashedKey;
};
private int searchInLL(K key, int hashedKey){
    LinkedList<Node> ll = buckets[hashedKey];
    for (int i = 0; i < ll.size(); i++) {
        if(ll.get(i).key == key){
            return i;
        }
    }
    return -1;
};

private void reHashing(){
    LinkedList<Node>[] oldBucket = buckets ;
    N = N*2;
    buckets = new LinkedList[N];
    for (int i = 0; i < buckets.length; i++) {
        buckets[i] = new LinkedList<>();
    }

    for (int i = 0; i < oldBucket.length; i++) {
        for (int j = 0; j < oldBucket[i].size(); j++) {
            Node node = oldBucket[i].get(j);
            put(node.key, node.value);
        }
    }
}

public void put(K key, V value){
    int hashedKey = hashFn(key);
    int indexInLinkedList = searchInLL(key, hashedKey);
    if( indexInLinkedList == -1){
        buckets[hashedKey].add(new Node(key, value));
        n++;
    }
    else {
        Node node =  buckets[hashedKey].get(indexInLinkedList);
        node.value = value;
    }
    double lambda = (double) n/N;
    if(lambda > 2.0){
        reHashing();
    }
}

public  V get(K key){
    int hashedKey = hashFn(key);
    int indexInLinkedList = searchInLL(key, hashedKey);
    if( indexInLinkedList == -1){
        return null;
    }
    else {
        Node node =  buckets[hashedKey].get(indexInLinkedList);
        return node.value;
    }
}

public boolean containsKey(K key){
    int hashedKey = hashFn(key);
    int indexInLinkedList = searchInLL(key, hashedKey);
    return indexInLinkedList != -1;
}

public V remove (K key){
   int hashKey = hashFn(key);
   int indexInLinkedList = searchInLL(key, hashKey);
   if(indexInLinkedList == -1){
       return null;
   }
   else {
       Node node = buckets[hashKey].remove(indexInLinkedList);
       n--;
       return node.value;
   }

}

public int size(){
            return n;
}
    }
    public static void main (String[] args){
    HashMap<String,Integer> map = new HashMap<>();
    map.put("india", 10);
        System.out.println(map.containsKey("india"));
    int value = map.get("india");
        System.out.println(map.size());
        System.out.println(value);
    }
}
