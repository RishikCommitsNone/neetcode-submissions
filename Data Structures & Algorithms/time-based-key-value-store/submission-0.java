class TimeMap {
    Map<String, List<Data>> m;
    public TimeMap() {
        m = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        if(!m.containsKey(key)){
            m.put(key, new ArrayList<>());
            
        }
        m.get(key).add(new Data(value, timestamp));
    }
    
    public String get(String key, int timestamp) {
        if(!m.containsKey(key)){
            return "";
        }
        else{
            List<Data> d = m.get(key);
            return findNo(d, key, timestamp);
        }
        //return "";
    }
}

public String findNo(List<Data> data, String key, int timestamp){
    int l = 0;
    int r = data.size() - 1;

    String ans = "";

    while(l <= r){
        int mid = l + (r - l)/2;

        if(data.get(mid).timestamp <= timestamp){
            ans = data.get(mid).key;
            l = mid + 1;
        }
        else{
            r = mid - 1;
        }
    }
    return ans;
}

class Data{
    String key;
    int timestamp;

    Data(String key, int timestamp){
        this.key = key;
        this.timestamp = timestamp;
    }
}
