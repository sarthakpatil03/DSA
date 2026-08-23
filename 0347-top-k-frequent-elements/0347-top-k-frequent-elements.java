class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int val:nums) {
            map.put(val,map.getOrDefault(val,0)+1);
        }

        List<Integer>[] bucket=new List[nums.length+1];
        for(int n:map.keySet()) {
            int frequency=map.get(n);
            if(bucket[frequency]==null) {
                bucket[frequency]=new ArrayList<>();
            }
            bucket[frequency].add(n);
        }

        int res[]=new int[k];
        int index=0;

        for(int i=bucket.length-1;i>=0;i--) {
            if(bucket[i]!=null){
                for(int val:bucket[i]) {
                    res[index]=val;
                    index++;
                    if(index==k) {
                        return res;
                    }
                }
            }
        }
        return res;
    }
}