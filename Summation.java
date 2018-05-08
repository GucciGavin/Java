class SumObject{
  int sumMethod(int v){
    if (v <=1){
      return 1;
      }else{
        Syste,.out.print(".");
        return (v+(sumMethod(v-1)));
      }
    }
  }
  // save file as summation.java obviously
  class Summation{
    public static void main (String a[]){
      int sumvalue = 0;
      int n = 30;
      SumObject s = new SumObject();
      int n - 30;
      SumObject s =new SumObject();
      sumvalue = s.sumMethod(n);
      System.out.println("\n"+sumvalue);
}
