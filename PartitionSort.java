import java.lang.Math;
public class PartitionSort{
  public static int partition(int[] data,int start, int end){
    int x=(int)(Math.random()*100%data.length);
    int y=data[x];
    System.out.println(x);
    int pos=0;
    int temp=data[0];
    //System.out.println(temp+"temp");
    data[0]=y;
    //System.out.println(data[0]+"temp");
    data[x]=temp;
    //System.out.println(data[x]+"temp");
    for (int i=start+1;i<end;i++ ) {
      for (int h=0;h<data.length ;h++ ) {
        System.out.print(data[h]);
      }
      System.out.println(" ");
      if (data[i]>y){
        //System.out.println(data[i]);
        temp=data[end];
        data[end]=data[start+1];
        data[i]=temp;
        end--;
      }
      if (data[i]<=y){
        temp=data[start];
        data[start]=data[i];
        data[i]=temp;
        start++;
        pos++;
    }
  }
  return pos;
}
  public static void main(String[] args) {
    int[] hi={2,3,6,2,4,1};
    System.out.println(partition(hi,0,5));
  }
}
