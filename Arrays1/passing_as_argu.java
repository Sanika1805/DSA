// pass by value
// pass by referance -> array lies here
public class passing_as_argu {
    public static void update(int marks[], int nonChangable){
        nonChangable = 5;
        for(int i=0; i<marks.length; i++){
                marks[i] = marks[i] + 1;
        }

    }

    public static void main(String[] args) {
        int marks[] = {97, 99, 87};
        int nonChangable = 5; //this cannot change 
        update(marks, nonChangable);
        System.out.println(nonChangable);

        for(int i=0; i<marks.length; i++){
            System.out.print(marks[i] + " ");
        }
    }
}
