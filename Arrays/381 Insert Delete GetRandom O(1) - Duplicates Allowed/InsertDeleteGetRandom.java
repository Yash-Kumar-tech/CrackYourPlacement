class RandomizedCollection {
    ArrayList<Integer> list ;
    HashMap<Integer, Set<Integer>> indices ;
    Random random ;
    public RandomizedCollection() {
        list = new ArrayList<>() ;
        indices = new HashMap<>();
        random = new Random();
    }
    
    public boolean insert(int val) {
        if(!indices.containsKey(val))   indices.put(val, new HashSet<Integer>());
        indices.get(val).add(list.size());
        list.add(val) ;
        return indices.get(val).size() == 1;
    }
    
    public boolean remove(int val) {
        if(!indices.containsKey(val) || indices.get(val).size() == 0)   return false; 
        int remInd = indices.get(val).iterator().next();
        indices.get(val).remove(remInd) ;
        int last = list.get(list.size() - 1) ;
        list.set(remInd, last) ;
        indices.get(last).add(remInd) ;
        indices.get(last).remove(list.size() - 1) ;
        list.remove(list.size() - 1) ;
        return true ;
    }
    
    public int getRandom() {
        return list.get(random.nextInt(list.size()));
    }
}

/**
 * Your RandomizedCollection object will be instantiated and called as such:
 * RandomizedCollection obj = new RandomizedCollection();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */