class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
      Stack<Integer> s=new Stack<>();
      int res[]=new int[nums1.length];
      HashMap<Integer,Integer> map=new HashMap<>();
      for(int i=nums2.length-1;i>=0;i--) {
        while(s.size()>0 && s.peek()<=nums2[i]) {
          s.pop();
        }
        if(s.size()==0){
          map.put(nums2[i],-1);
        }else{
          map.put(nums2[i],s.peek());
        }
        s.push(nums2[i]);
      }

      for(int i=0;i<res.length;i++) {
        if(map.containsKey(nums1[i])){
            res[i]=map.get(nums1[i]);
        }
      }
      return res;
      
    }
}