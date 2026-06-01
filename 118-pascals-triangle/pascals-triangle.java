class Solution {
    public List<List<Integer>> generate(int n) {


        List<List<Integer>> result=new ArrayList<>();


        //if the number of rows is 0
        if(n==0) return result;
        //creating the first row
        List<Integer> firstRow=new ArrayList<>();
        firstRow.add(1);
        result.add(firstRow);

        //if num of rows=1
        if(n==1) return result;

        //for all the oether rows

        for(int i=1;i<n;i++){
            //prev row
            List<Integer> prevRow=result.get(i-1);

            //other rows
            List<Integer> row=new ArrayList<>();
            row.add(1);
            //only the middle values calculation  as 1st and last element will be added as one i  the pascals triangle

            for(int j=0;j<i-1;j++){
                row.add(prevRow.get(j)+prevRow.get(j+1));
            }
            //last element also 1
            row.add(1);
        result.add(row);


        }

        return result;
    }
}