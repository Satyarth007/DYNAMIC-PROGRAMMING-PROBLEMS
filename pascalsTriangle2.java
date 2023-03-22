class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> al= new ArrayList<>();
        for(int i=1;i<=rowIndex+1;i++){
            List<Integer> row = new ArrayList<>();
            for(int j=0;j<i;j++){
                if(j==0 || j==i-1) row.add(1);
                else{
                    row.add(al.get(i-2).get(j)+al.get(i-2).get(j-1));
                }
            }
            al.add(row);
        }
        return al.get(rowIndex);
    }
}
