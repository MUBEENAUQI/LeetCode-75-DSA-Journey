class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int size = candies.length;
        int max =0;
        List<Boolean> newList = new ArrayList<>();
      for (int i=0;i<size;i++){
        if(max<candies[i])
        max = candies[i];
      }  

      for (int i=0;i<size;i++){
        if(candies[i]+extraCandies >= max)
        newList.add(Boolean.TRUE);
        else
        newList.add(Boolean.FALSE);
      } 
      return newList;
    }
}