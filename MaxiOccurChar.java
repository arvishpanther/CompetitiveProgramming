public class MaxiOccurChar {

public static void main(String[] args) {
int count;
String s="Java";
int a[]=new int[s.length()];
int max=a[0];
int pos=0;
// for counting char occurence
for (int i = 0; i < s.length(); i++) {
count=0;
for (int j = i; j < s.length(); j++) {
if(s.charAt(i)==s.charAt(j))
{
count++;
}
}
a[i]=count;
System.out.println(a[i]+" Count of chararcter "+s.charAt(i));
// maximum occured char

if(a[i]>max){
max=a[i];
pos=i;
}
}
System.out.println("Maximum occur: "+max+" times for char: "+s.charAt(pos));


}

}