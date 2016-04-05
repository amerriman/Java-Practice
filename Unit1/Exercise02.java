public class Exercise02 {


  public static void main(String [] args){
    Exercise02 myExercise = new Exercise02();
    int[] input = {4, 2, 3, 6, 8};
    int sum = myExercise.sumArray(input);
    System.out.println(sum);

  }

  int sumArray(int[] input){
    int sum = 0;
    for(int i = 0; i < input.length; i++){
      sum += input[i];
    }
    return sum;
  }

}
