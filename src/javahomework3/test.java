package javahomework3;
import java.io.*;
	
public class test {
	

	public static void main(String[] args)throws IOException 
	{
		// TODO Auto-generated method stub
		/*
		//sample3_1 3_2
		
		Car car1;
		car1 = new Car();
		
		car1.num =1234;
		car1.gas = 20.5;
		
		System.out.println("車號是" +car1.num);
		System.out.println("汽油量是"+car1.gas);
		
		//sample3-3
		Car car1;
		car1 = new Car();
		
		car1.num =1234;
		car1.gas = 20.5;
		
		Car car2;
		car2 = new Car();
		
		car2.num = 2345;
		car2.gas = 30.5;
		
		System.out.println("車號是" +car1.num);
		System.out.println("汽油量是"+car1.gas);
		System.out.println("車號是" +car2.num);
		System.out.println("汽油量是"+car2.gas);
	
		//Sample 3-4
		Car car1;
		car1 = new Car();
		
		car1.num =1234;
		car1.gas = 20.5;
		
		car1.show();
		car1.show();
		
		//sample 3-5
		Car car1;
		car1 = new Car();
		
		car1.num =1234;
		car1.gas = 20.5;
		
		car1.showCar();
		
		//sample3-6
		Car car1;
		car1 = new Car();
		
		car1.setNum(1234);
		car1.setGas(20.5);
		
		//sample3-7
		Car car1;
		car1 = new Car();
		
		int number = 1234;
		double gasoline = 20.5;
		
		car1.setNumGas(number,gasoline);
		
		//sample 3-8
		Car car1;
		car1 = new Car();
		car1.setNumGas(1234, 20.5);
		int number = car1.getNum();
		double gasoline = car1.getGas();
		System.out.println("調查樣品車時得知");
		System.out.println("車號是"+number+",汽油量是"+gasoline);		
		
		//sample 3-9
		Car car1;
		car1 = new Car();
		
		car1.num =1234;
		car1.gas = -10;
		
		car1.show();
		
		//sample 3-10
		Car car1;
		car1 = new Car();
		
		car1.setNumGas(1234,20.5);
		car1.show();
		
		System.out.println("指定不正確的汽油量(-10.0)看看");
		
		car1.setNumGas(1234,-10.0);
		car1.show();
		
		//sample 3-11
		Car car1;
		car1 = new Car();
		
		car1.setCar(1234,20.5);
		car1.show();
		
		System.out.println("只變更車號");
		car1.setCar(2345);
		car1.show();
		
		System.out.println("只變更汽油量");
		car1.setCar(30.5);
		car1.show();
	
		//sample 3-12
		Car car1;
		car1 = new Car();
		
		car1.show();
		
		//Sample 3-13
		Car car1;
		car1 = new Car();
		
		car1.show();
		
		Car car2;
		car2 = new Car(1234,25.0);
		car2.show();
		
		//sample 3-14
		Car car1;
		car1 = new Car();
		car1.show();
		
		Car car2;
		car2 = new Car(1234,25.0);
		car2.show();
	
		//sample 3-15
		Car.showSum();
		
		Car car1;
		car1 = new Car();
		car1.setCar(1234,20.5);
		
		Car.showSum();
		
		Car car2;
		car2 = new Car();
		car2.setCar(2345,30.5);
		
		//Sample 3-16
		System.out.println("請輸入一個整數");
		
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		   
		int num = Integer.parseInt(str);
		
		System.out.println("您輸入的數字是 "+num);
		
		//sample 3-17
		String str = "Hello";
		
		char ch1 = str.charAt(0);
		char ch2 = str.charAt(1);
		
		int len = str.length();
		
		System.out.println(str+"的第一個字元是"+ch1);
		System.out.println(str+"的第二個字元是"+ch2);
		System.out.println(str+"的長度是"+len);
		
		//sample 3-18
		System.out.println("請輸入英文字母");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				
		String str = br.readLine();
		
		String stru = str.toUpperCase();
		String strl = str.toLowerCase();
		
		System.out.println("轉換成大寫時為"+stru);
		System.out.println("轉換成小寫時為"+strl);
		
		//sample 3-19
		System.out.println("請輸入字串");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str1 = br.readLine();
		
		System.out.println("請輸入要檢索的文字");
		
		String str2 = br.readLine();
		char ch = str2.charAt(0);
		
		int num = str1.indexOf(ch);
		
		if(num!=-1)
			System.out.println(str1+"的第"+(num+1)+"個字就是「"+ch+"」");
		else
			System.out.println(str1+"中沒有「"+ch+"」這個字");
		
		//sample 3-20
		System.out.println("請輸入字串");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str1 = br.readLine();
		
		System.out.println("請輸入要新增的字串");
		
		String str2 = br.readLine();
		
		StringBuffer sb = new StringBuffer(str1);
		sb.append(str2);		
		
		System.out.println("在「"+str1+"」後新增「"+str2+"」的話,就會變成「"+sb+"」");
		
		//sample 3-21
		System.out.println("請輸入兩個整數");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str1 = br.readLine();
		String str2 = br.readLine();
		
		int num1 = Integer.parseInt(str1);
		int num2 = Integer.parseInt(str2);
		
		int ans = Math.max(num1, num2);
		
		System.out.println(num1+"與"+num2+"中較大的是"+ans);
		
		//sample 3-22
		System.out.println("宣告car1");
		Car car1;
		car1 = new Car();
		car1.setCar(1234,20.5);
		
		System.out.println("宣告car2");
		Car car2;
		
		System.out.println("將car1指定給car2");
		car2 = car1;
		
		System.out.print("car1的");
		car1.show();
		
		System.out.println("car2的");
		car2.show();
		
		System.out.println("改變car1的相關資料");
		car1.setCar(2345, 30.5);
		
		System.out.println("car1的");
		car1.show();
		
		System.out.println("car2的");
		car2.show();
		
		//sample3-23
		Car car1;
		car1 = new Car();
		
		car1.show();
		
		int number =1234;
		double gasoline = 20.5;
		String str = "1號車";
		
		car1.setCar(number,gasoline);
		car1.setName(str);
		
		car1.show()
		*/
		//sample 3-24
		Car[]car1;
		car1 = new Car[3];
		
		for (int i =0;i<car1.length;i++)
		{
			car1[i]=new Car();
		}
		car1[0].setCar(1234,20.5);
		car1[1].setCar(2345,30.5);
		car1[2].setCar(3456,40.5);
		
		for(int i =0; i< car1.length; i++)
		{
			car1[i].show();
		}
	}
}

class Car
{
	int num;
	double gas;
	
	public Car()
		{
			num = 0;
			gas = 0.0;
			System.out.println("生產了車子");
		}
	public void setCar(int n,double g)
	{
		num = n;
		gas = g;
		System.out.println("將車號設為"+num+",汽油量設為"+gas);
	}
	public void show()
		{
			System.out.println("車號是"+num);
			System.out.println("汽油量是"+gas);
		}
}

/*
class Car
{
	private int num;
	private double gas;
	
	public void setCar(int n)
		{
			num = n;
			System.out.println("將車號設為"+num);
		}
	public void setCar(double g)
		{
			gas = g;
			System.out.println("將汽油量設為"+gas);
		}
	public void setCar(int n,double g)
	{
		num = n ;
		gas = g ;
		System.out.println("將車號設為"+num+"汽油量設為"+gas);
	}
	public void show()
	{
		System.out.println("車號是"+this.num);
		System.out.println("汽油量是"+this.gas);
	}
}
*/
/*
class Car
{
	int num;
	double gas;
	
	void setNum(int n)
	{
		num = n;
		System.out.println("將車號設為"+num);
	}
	void setGas(double g)
	{
		gas = g;
		System.out.println("將汽油量設為"+gas);
	}
}
*/
/*
class Car
{
	int num;
	double gas;
	int getNum()
	{
		System.out.println("調查車號");
		return num;
	}
	double getGas()
	{
		System.out.println("調查汽油量");
		return gas;
	}
	void setNumGas(int n,double g)
	{
		num = n ;
		gas = g;
		System.out.println("將車號設為"+num+",汽油量設為"+gas);
	}
}
*/