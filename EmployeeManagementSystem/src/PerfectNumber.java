
public class PerfectNumber {

	public static void main(String[] args) {
int n=28;
if(isItPerfect(n)){
System.out.print("IS perfect");
}

else
System.out.print("Not perfect");

}
static boolean isItPerfect(int input) {
int i=1;
int sum=0;
while(i <= input/2) {
if(input%i == 0) {
sum=sum+i;
}
i++;
}
return input == sum;
}
	}
