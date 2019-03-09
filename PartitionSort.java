import java.lang.Math;
public class PartitionSort{
  public static int partition(int[] data,int start, int end){
    int pos=start;
    int x=(int)(Math.random()*100%(end-start+1))+start;
    //System.out.println(x);
    //holds index of chosen pivot point
    int temp=data[start];
    //temporary used during switching
    data[start]=data[x];
    data[x]=temp;
    //switch values to make pivot first one
    for (int i=start+1;i<end+1;i++ ) {
      /*for (int h=0;h<data.length ;h++ ) {
        System.out.print(data[h]+" ");
      }
      System.out.println(" ");*/
      if (data[i]<data[start]){
        pos++;
        temp=data[pos];
        data[pos]=data[i];
        data[i]=temp;
    }
    //if the number is less than pivot, increase the position and then switch
  }
  /*for (int h=0;h<data.length ;h++ ) {
    System.out.print(data[h]+" ");
  }
  System.out.println(" ");*/
  temp=data[start];
  data[start]=data[pos];
  data[pos]=temp;
  //switch pivot point to the pos
  /*for (int h=0;h<data.length ;h++ ) {
    System.out.print(data[h]+" ");
  }
  System.out.println(" ");*/
  return pos;
}
  /*public static void main(String[] args) {
    int[] hi={1,43,2,23,8,-4,23};
    System.out.println(partition(hi,0,5));
  }*/
}
