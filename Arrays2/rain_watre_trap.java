package Arrays2;

public class rain_watre_trap {
    public static int rain_water(int height[]){
        int n = height.length;
        // calcuate left max boundary - array
        int leftmax[] = new int[n];
        leftmax[0] = height[0];
        for(int i=1; i<n; i++){
            leftmax[i] = Math.max(height[i], leftmax[i-1]);
        }
        
        // calculate right max bundary - array
        int rightmax[] = new int[n];
        rightmax[n-1] = height[n-1];
        for(int j=n-2; j>=0; j--){
            rightmax[j] = Math.max(height[j], rightmax[j+1]);
        }

        // trapped water = waterlevel - height
        int trapped_water = 0;
        // loop
        for(int k=0; k<n; k++){
            // waterlevel = min(left max boundary , right max boundary)
            int waterlevel = Math.min(leftmax[k],rightmax[k]);
            trapped_water += waterlevel - height[k];
        }
        return trapped_water;
    }

    public static void main(String[] args) {
        int height[] = {4, 2, 0, 6, 3, 2, 5};
        System.out.println(rain_water(height));
    }
}
