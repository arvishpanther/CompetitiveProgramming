package selfpractice.array;

public class DistinctArray2 {

static String str = "wewillrockyoufucker";
static String distinct = "";
static char[] charary = str.toCharArray();
static StringBuilder hello = new StringBuilder("");
static char[] tempcharary = new char[charary.length];
static int i;
static int count;
public static char[] getDistinctLetter()
{
int incr = 0;

for ( i = 0; i < charary.length; i++)
{
if (!(DistinctArray2.isletteroccure(charary[i])))
{

tempcharary[incr] = charary[i];
hello.append( tempcharary[incr]);
++incr;


}
}
char[] distinctresult = hello.toString().toCharArray();

for (int j = 0; j < distinctresult.length; j++)
{
for (int k = 0; k < charary.length; k++)
{
if (distinctresult[j] == charary[k])
{
++count;
}

}

System.out.println("LETTER " + tempcharary[j] + " OCCURE " + count + " TIMES ");
count = 0;

}

return tempcharary;

}



public static Boolean isletteroccure(char ch)
{
for (int j = 0; j < charary.length; j++)
{
if (ch == tempcharary[j])
{
return true;
}
}

return false;
}
public static void main(String[] args) {

DistinctArray2.getDistinctLetter();


}
}
