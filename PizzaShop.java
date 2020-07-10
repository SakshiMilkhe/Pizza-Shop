/*
 * Deepika S Pomendkar
 */
package dsp1;
import java.util.*;
import java.util.Random;
public class Pitjja {
	String type;
	String size;
	String crust;
	Vector v5=new Vector(10,5);
	Vector v2=new Vector(10,5);
	Vector v=new Vector(3,5);
	int c,c1,c2,c3,c4,c5,c6,y=0,count=0,b,l=0,l1=0,coup;
	int a[]=new int[150];
	int a1[]=new int[50];
	int count1=0;
	int b2[]=new int[10];
	int b3[]=new int[10];
	int k=0;
	Random r=new Random();
	int n1=r.nextInt(5);

	
	void read()
	{
		
		Vector v1=new Vector(3,5);
		Vector v4=new Vector(3,5);
		int r=1,x=0,z=1,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to DELICACY PIZZA\n\n");
		do{
			System.out.println("Do you have a Coupon? Enter 1 for Yes 0 for No");
			
			coup=sc.nextInt();
			if(coup==1)
			{
				break;
			}
			else if(coup==0)
			{
				break;
			}
			else
			{
				System.out.println("You Entered the wrong Option Try Again");
			}
		}while(coup!=0||coup!=1);
		if(coup!=1)
		{
			if(n1==1)
			{
				System.out.println("Todays Special offer***** \n"+"Get 50% off on Purchase of 1000 and above");
			}
			else if(n1==2)
			{
				System.out.println("Todays Special offer***** \n"+"Get 25% off on Purchase of 600 and above");
	
			}
			else if(n1==3)
			{
				
			}
			else if(n1==4)
			{
				System.out.println("Todays Special offer***** \n"+"Get any small Pizza of your choice FREE!! on Purchase of 700 and above");
			}
		}
		do
		{
			x=0;
			
			while(x==0)//proofing
			{
				y=y+1;
				System.out.println("Enter 1 for VEG Pizza 2 for NON-VEG Pizza");
				c=sc.nextInt();
				switch(c)
				{		
				case 1:
						v2.addElement(new String("Veg"));//1
						count=count+1;
						do
						{
							System.out.println("Enter\n1 for MARGHERITA-240Rs\n2 for FARM HOUSE-300RS\n3 for PEPPY PANEER-220Rs\n4 for MEXICAN GREEN WAVE-250Rs\n5 for DEULUX VEGGIE-300Rs\n6 for VEGGIE PARADISE-230Rs");
							c2=sc.nextInt();
							v.addElement(new String("MARGHERITA"));
							v.addElement(new String("FARM HOUSE"));
							v.addElement(new String("PEPPY PANEER"));
							v.addElement(new String("MEXICAN GREEN WAVE"));
							v.addElement(new String("DEULUX VEGGIE"));
							v.addElement(new String("VEGGIE PARADISE"));
							if(c2>6)
							{
								System.out.println("Wrong Choice try again");
							}
						}while(c2>6);
						v2.addElement(v.elementAt(c2-1));//2
						count=count+1;
						System.out.println("For Medium pizza +50Rs" + " for Large Pizza +100Rs");
						System.out.println("Enter 1 for small 2 for med 3 for large");
						c1=sc.nextInt();
						if(c1==1)
						{
							size="small";
							v2.addElement(new String("Small"));//3
							count=count+1;
							a[0]=240;
							a[1]=300;
							a[2]=220;
							a[3]=250;
							a[4]=300;
							a[5]=230;
							b=b+a[c2-1];
							v2.addElement(new Integer(a[c2-1]));//4
							count=count+1;
						}
						else if(c1==2)
						{		
							size="medium";
							v2.addElement(size);//3
							count=count+1;
							a[0]=240+50;
							a[1]=300+50;
							a[2]=220+50;
							a[3]=250+50;
							a[4]=300+50;
							a[5]=230+50;
							b=b+a[c2-1];
							v2.addElement(new Integer(a[c2-1]));//4
							count=count+1;
						}
						else
						{
							v2.addElement(size);//3
							count=count+1;
							size="Large";
							a[0]=240+100;
							a[1]=300+100;
							a[2]=220+100;
							a[3]=250+100;
							a[4]=300+100;
							a[5]=230+100;
							b=b+a[c2-1];
							v2.addElement(new Integer(a[c2-1]));//4
							count=count+1;
						}
						System.out.println("Enter 1 for thin and 2 for thick crust");
						c3=sc.nextInt();
						if(c3==1)
						{
							crust="thin";
							v2.addElement(crust);//5
							count=count+1;
						}
						else
						{
							crust="thick";
							v2.addElement(crust);//5
							count=count+1;
						}
						
						do//proofing
						{
							System.out.println("Do you want to Add extra toppings 1 for yes 0 for no");
							b2[l]=sc.nextInt();
							if(b2[l]==1)
							{
								count1=0;
								l=l+1;
								r=1;
								while(r==1)
								{
									
									count1=count1+1;
									System.out.println("Enter\n1 for Tomatoe-20Rs \n2 for Chesse-50Rs\n3 for Red Pepper-30Rs \n4 for Golden Corn-40Rs\n5 for Mushroom-20Rs \n6 for Jalapeno-30Rs  ");
									c5=sc.nextInt();
									a1[0]=20;
									a1[1]=50;
									a1[2]=30;
									a1[3]=40;
									a1[4]=20;
									a1[5]=30;
									b=b+a1[c5-1];
									if(c5==1)
									{
										
										v2.addElement(new String("Tomatoe"));
										count=count+1;
										v2.addElement(new Integer(a1[c5-1]));
										count=count+1;
										
									}
									else if(c5==2)
									{
										
										v2.addElement(new String("Cheese"));
										count=count+1;
										v2.addElement(new Integer(a1[c5-1]));
										count=count+1;
									}
									else if(c5==3)
									{
										
										v2.addElement(new String("RedPepper"));
										count=count+1;
										v2.addElement(new Integer(a1[c5-1]));
										count=count+1;
									}
									else if(c5==4)
									{
										
										v2.addElement(new String("Golden Corn"));
										count=count+1;
										v2.addElement(new Integer(a1[c5-1]));
										count=count+1;
									}
									else if(c5==5)
									{
									
										v2.addElement(new String("Jalapeno"));
										count=count+1;
										v2.addElement(new Integer(a1[c5-1]));
										count=count+1;
									}
									else if(c5==6)
									{
										v2.addElement(new String("Mushroom"));
										count=count+1;
										v2.addElement(new Integer(a1[c5-1]));
										count=count+1;
									}
									System.out.println("If you want to add more extra topping enter 1");
									r=sc.nextInt();
								}
								b3[l1]=count1;
							}
							else if(c4==0)
							{
								break;
							}
							else
							{
								System.out.println("You Entered the wrong option");
								c4=2;
							}
							l1=l1+1;
						}while(c4>2);
						x=1;
						break;
					case 2: 
						v2.addElement(new String("Non-Veg"));
						count=count+1;
						System.out.println("Enter\n1 for CHICKEN TIKKA-260Rs\n2 for Turkey Pizza-360Rs\n3 for PEPPER BARBEQUE CHICKEN-280Rs\n4 for CHICKEN SAUSAGE-280Rs\n5 for CHICKEN GOLDEN DELIGHT-320Rs\n6 for NON VEG SUPREME-250Rs");
						c2=sc.nextInt();
						do
						{
							v4.addElement(new String("CHICKEN TIKKA"));
							v4.addElement(new String("TURKEY PIZZA"));
							v4.addElement(new String("PEPPER BARBEQUE-CHICKEN"));
							v4.addElement(new String("CHICKEN SAUSAGE"));
							v4.addElement(new String("CHICKEN GOLDEN-DELIGHT"));
							v4.addElement(new String("NON VEGSUPREME"));
							if(c2>6)
							{
								System.out.println("Wrong option try again");
							}
						}while(c2>6);
						v2.addElement(v4.elementAt(c2-1));
						count=count+1;
						
						System.out.println("For Medium pizza +50Rs" + " for Large Pizza +100Rs");
						System.out.println("Enter 1 for small 2 for med 3 for large");
						c1=sc.nextInt();
						if(c1==1)
						{
							size="small";
							v2.addElement(new String("Small"));
							count=count+1;
							a[0]=260;
							a[1]=360;
							a[2]=280;
							a[3]=280;
							a[4]=320;
							a[5]=250;
							b=b+a[c2-1];
						v2.addElement(new Integer(a[c2-1]));
						count=count+1;
						
						}
						else if(c1==2)
						{		
							size="medium";
							v2.addElement(size);//3
							count=count+1;
							
							
							a[0]=260+50;
							a[1]=360+50;
							a[2]=280+50;
							a[3]=280+50;
							a[4]=320+50;
							a[5]=250+50;
							b=b+a[c2-1];
							v2.addElement(new Integer(a[c2-1]));//4
							
							count=count+1;
						}
						else
						{
							v2.addElement(size);//3
							count=count+1;
							size="Large";
							
							
							a[0]=260+100;
							a[1]=360+100;
							a[2]=280+100;
							a[3]=280+100;
							a[4]=320+100;
							a[5]=250+100;
							b=b+a[c2-1];
							v2.addElement(new Integer(a[c2-1]));//4
							count=count+1;
						}
							System.out.println("Enter 1 for thin and 2 for thick crust");
							c3=sc.nextInt();
							if(c3==1)
							{
								crust="thin";
								v2.addElement(crust);//5
								count=count+1;
								
							}
							else
							{
								crust="thick";
								v2.addElement(crust);//5
								count=count+1;
							}
							
						do//proofing
						{
							System.out.println("Do you want to Add extra toppings 1 for yes 0 for no");
							b2[l]=sc.nextInt();
							if(b2[l]==1)
							{
								count1=0;
								l=l+1;
								r=1;
								while(r==1)
								{
									count1=count1+1;
									System.out.println("Enter\n1 for Tomatoe-20Rs \n2 for Chesse-50Rs\n3 for Red Pepper-30Rs \n4 for Golden Corn-40Rs\n5 for Mushroom-20Rs \n6 for Jalapeno-30Rs  ");
									c5=sc.nextInt();
									a1[0]=20;
									a1[1]=50;
									b=b+a1[c5-1];
									if(c5==1)
									{
										v2.addElement(new String("Tomatoe"));//6
										count=count+1;
										v2.addElement(new Integer(a1[c5-1]));//7
										count=count+1;
									}
									else if(c5==2)
									{
										v2.addElement(new String("Cheese"));//6
										count=count+1;
										v2.addElement(new Integer(a1[c5-1]));//7
										count=count+1;
									}
									else if(c5==3)
									{
										v2.addElement(new String("RedPepper"));//6
										count=count+1;
										v2.addElement(new Integer(a1[c5-1]));//7
										count=count+1;
									}
									else if(c5==4)
									{
										v2.addElement(new String("GoldenCorn"));//6
										count=count+1;
										v2.addElement(new Integer(a1[c5-1]));//7
										count=count+1;
									}
									else if(c5==5)
									{
										v2.addElement(new String("Jalapeno"));//6
										count=count+1;
										v2.addElement(new Integer(a1[c5-1]));//7
										count=count+1;
									}
									else if(c5==6)
									{
										v2.addElement(new String("Mushroom"));//6
										count=count+1;
										v2.addElement(new Integer(a1[c5-1]));//7
										count=count+1;
									}
									System.out.println("If you want to add more extra topping enter 1 else enter 0");
									r=sc.nextInt();
								}
								b3[l1]=count1;
								
							}
							else if(c4==0)
							{
								break;
							}
							else
							{
								System.out.println("You Entered the wrong option");
								c4=2;
							}
							l1=l1+1;
						}while(c4>2);
						x=1;
						break;
						default: System.out.println("You have entered the wrong chioce Please try again");
						x=0;
					}
			}
			System.out.println("If you want to buy more pizza enter 1 else 0");
			z=sc.nextInt();
		}while(z==1);
	}
	
	
	void display()
	{
		Scanner sc=new Scanner(System.in);
		int i,j,tb=0,per = 0,d1=0;
		float g;
		float b1=0;
		
		float f;
		
		if(coup==1)
		{
			System.out.println("Enter the persentage of coupon you have");
			per=sc.nextInt();
		}
		/*for(j=1;j<=50;j++)
		{
			System.out.print("_");
		}*/
		l=0;
		l1=0;
		
		if(b>700&&n1==4)
		{
			System.out.println("Which among the small Pizzas do you wish to have for free?");
			System.out.println("Enter\n1 for MARGHERITA-240Rs\n2 for FARM HOUSE-300RS\n3 for PEPPY PANEER-220Rs\n4 for MEXICAN GREEN WAVE-250Rs\n5 for DEULUX VEGGIE-300Rs\n6 for VEGGIE PARADISE-230Rs");
			c6=sc.nextInt();
			v5.addElement(v.elementAt(c6-1));
		}
		for(j=1;j<=50;j++)
		{
			System.out.print("_");
		}
		System.out.println("\n\n");
		
		System.out.println("DELICACY PIZZA\n");
		for(j=1;j<=50;j++)
		{
			System.out.print("_");
		}
		System.out.println("\nOrder Reciept");
		for(i=0;i<50;i++)
		{
			System.out.print("-");
		}
		for(j=0;j<y;j++)
		{
			System.out.println();
			System.out.println("Type\t"+v2.elementAt(k));//1//0
			k=k+1;//1
			System.out.println("Pizza\t"+"*"+v2.elementAt(k)+"("+v2.elementAt(k+1)+")\t"+v2.elementAt(k+2));//4//2//3
			k=k+3;//4
			System.out.print("Crust\t"+v2.elementAt(k));//5//4
			k=k+1;//5
			if(b2[l]==1)
			{
				l=l+1;
				System.out.println("\n------------------");
				System.out.println("Extra Topping");
				
				for(i=0;i<b3[l1];i++)
				{
					System.out.print(""+v2.elementAt(k)+"\t\t\t\t");
					k=k+1;
					System.out.print(""+v2.elementAt(k));
					k=k+1;
					System.out.println();
					
				}
				l1=l1+1;
			}
			else 
			{
				System.out.println("\nNo extra toppings");
				l=l+1;
			}
		
		}
		if(b>700&&n1==4&&coup!=1)
		{
			
			System.out.println("Special Offer\n"+"Free small Pizza\n"+"*"+v5.firstElement());
			
		}
		System.out.println("Amount is\t\t\t"+b);
		f=b*(float)2.5/100;
		System.out.println("CGST	 2.5%\t\t\t"+f);
		System.out.println("SGST	 2.5%\t\t\t"+f);
		g=f;
		b=(int)(b+2*g);
		System.out.println("Total Amount is\t\t\t"+b);
		
		if(b>=1000&&n1==1&&coup!=1)
		{
			System.out.println("50% off");
			d1= b*50/100;
		}
		else if(b>=600&&n1==2&&coup!=1)
		{
			System.out.println("25% off");
			d1=b*25/100;
		}
		
		if(coup==1)
		{
			f=b*(float)per/100;
			b=(int)b;
			b1=(b-f);
			System.out.println("The bill is\t\t\t"+b);
			System.out.println("Coupon of"+per+" %");
			for(i=0;i<50;i++)
			{
				System.out.print("-");
			}
			System.out.println("\nThe total bill is\t\t"+b1+" Rs");
			for(i=0;i<50;i++)
			{
				System.out.print("-");
			}
		}
		else
		{
			for(i=0;i<50;i++)
			{
				System.out.print("-");
			}
			System.out.println("\nThe total bill is\t\t"+(b-d1)+" Rs");
			for(i=0;i<50;i++)
			{
				System.out.print("-");
			}
			
		}
		System.out.println("\nNet Amount is inclusive of all taxes.");
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int i;
		Pitjja p1=new Pitjja();
		p1.read();
		p1.display();
	}

}
