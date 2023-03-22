class Solution {
    public List<List<Integer>> generate(int numRows) {
        if(numRows==0) return new ArrayList();
        List<List<Integer>> al= new ArrayList<>();
        for(int i=0;i<numRows;i++){
            List<Integer> row=new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0 || j == i) row.add(1);
                else row.add(al.get(i-1).get(j)+al.get(i-1).get(j-1));
            }
            al.add(row);
        }
        return al;
    }

}
