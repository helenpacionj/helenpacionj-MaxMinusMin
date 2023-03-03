
import java.util.List;

public class MaxMinusMin {
    /**
     * Return the difference between the highest and lowest values of the List.
     * This will require you to know some of the List interface methods.
     *
     * @param nums an List<Integer> containing varying nums.
     * @return the max value of nums minus the min value of nums.
     */
    public int difference(List<Integer> nums){
        //return 0;
        int intMax=0,intMin=0;

        intMax=nums.get(0);
        intMin=nums.get(0);

        for (int ctr=1; ctr < nums.size(); ctr++) {
            if (nums.get(ctr) >= intMax) {
                intMax = nums.get(ctr);
            }
            if (nums.get(ctr) <= intMin) {
                intMin= nums.get(ctr);
            }
        }

        return(intMax-intMin);
    }
}
