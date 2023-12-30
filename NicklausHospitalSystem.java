/* *********************************************ITM 1214-COMPUTER PROGRAMMING**********************************************************
***************************************************ASSIGNMENT 03***********************************************************************
**********************************************MGT/2019/010- AADKN ABEYSINGHE***********************************************************
**********************************************SYSTEM TYPE- HOSPITAL SYSTEM*************************************************************
**********************************************(C)ALL RIGHTS RESERVED(C)****************************************************************
 */

import java.util.Scanner;
class NicklausHospitalSystem
{
	 public static void main(String[]args)
	 {

			System.out.println("***************************************************************************************");
			System.out.println("*                   Welcome to Nicklaus hospital                                      *");
			System.out.println("*                          Who Are We?                                                *");
			System.out.println("*                       Our mission : To provide a high quality service to you        *");
			System.out.println("*                          Our vision : To keeping you to a better health             *");
			System.out.println("*                                                                                     *");
			System.out.println("*                                             Contact us- 01189965475, 0112255693     *");
			System.out.println("*                                              Visit us- President Rd, Colombo 01     *");	
			System.out.println("*                                                                                     *");
			System.out.println("***************************************************************************************"); 
				
		 Scanner menuInput = new Scanner (System.in);
			System.out.println("*              Make your selection                                                    *");    
				
			System.out.println("*                       1- Channel your doctor                                        *");
			System.out.println("*                       2- Online Pharmacy                                            *");
			System.out.println("*                       3- BMI calculator                                             *");
			System.out.println("*                       4- Exit                                                       *");
			
			
		int choice1 = 1;
		int choice2 = 2;
		int choice3 = 3;
			System.out.println("*Choice :                                                                             *");
			 int choice = menuInput.nextInt();
		
		if (choice==choice1)
		{	
		eChannelling();
		
				Scanner doc = new Scanner(System.in);
			
					System.out.println("Do you want to channel more doctors?   ");
					System.out.println("                                                                             "); 
					System.out.println("If yes,press 1,otherwise any number  ");
					Scanner cc = new Scanner(System.in);
					int o =doc.nextInt();
					if( o==1){
					eChannelling();
						}
					else{
					System.out.println("  Would you like to try out our other services?  ");  
					System.out.println("                     2- Online Pharmacy          ");
					System.out.println("*                    3- BMI calculator           ");
					System.out.println("*                    4- Exit                     ");  
					
			int c = menuInput.nextInt();
				if(c==2)
				{
					Scanner ck = new Scanner(System.in);
					onlinePharmacy();
					System.out.println("Do you want to check out our BMI calculator?   ");
					System.out.println("If yes,press 1,otherwise any number        ");
					int r =ck.nextInt();
					if( r==1){
					bmiCalculater();	
					}
					else{
						System.out.println("    Thank you for using our online Pharmacy....Stay Safe!!!!.....                                          ");  
					}
					
				}
				else if(c==3)
				{	Scanner mv = new Scanner(System.in);
					 bmiCalculater();	
			
					System.out.println("Do you want to check our Online Pharmacy?   ");
					System.out.println("If yes,press 1, otherwise any number        ");
					int ui = mv.nextInt();
					if( ui==1){
					onlinePharmacy();	
					}
					else{
						System.out.println("    Thank you for using our online pharmacy....Stay Safe!!!!.....                                          ");  
					}
				}
		
				else
				{
				System.out.println("    Thank you....Stay Safe!!!!.....                                          ");  
				}
			}
		}
		else if(choice==choice2)
		{
			onlinePharmacy();
			Scanner m = new Scanner(System.in);
			System.out.println("");  
			System.out.println("  To check out our other services to press 1 or any number to exit the system ");  
			int k = m.nextInt();
			if(k==1){
			System.out.println("  1- Channel your doctor.");
			System.out.println("  3- BMI Calculator");
				int j = m.nextInt();
				if(j==1)
				{
					eChannelling();
					System.out.println("Do you want to channel more doctors?   ");
					System.out.println("If yes,press 2,or press 3 to load BMI calculator or 4 to exit the system");
					int A = m.nextInt();
					if( A==2)
					{
					eChannelling();
					Scanner g = new Scanner(System.in);
					System.out.println("To check out BMI calculator press 3  or press 4 to exit the system");
					int L= g.nextInt();
					if( L==3)
					{
					bmiCalculater();
					
					}
					else{
						System.out.println("   Thank you for using our service....Stay Safe!...."); 
					}
					}
					else if(A==3){
					bmiCalculater();
					}
					
					else{
						System.out.println("   Thank you for using our service....Stay Safe!...."); 
					}
					
				}
				else if(j==3){
					bmiCalculater();
					}
				else{
					System.out.println("   Thank you for using our service....Stay Safe!...."); 
				}
			}				
			else{
					System.out.println("   Thank you for using our service....Stay Safe!...."); 
				}
		}
	 
		else if(choice==choice3)
		{
			bmiCalculater();
			Scanner toto = new Scanner(System.in);
			System.out.println("Thank you for using our BMI calculator. Hope you liked the experience.......");
			System.out.println("");
			System.out.println("If you want to try out our other services,enter 1, otherwise enter any number..");  
			int mn = toto.nextInt();
			if(mn==1){
			System.out.println("  1 - Channel your doctor.");
			System.out.println("  2 - Online Pharmacy.");
				int h = toto.nextInt();
				if(h==1)
				{
					eChannelling();
					System.out.println("Do you want to channel more doctors?   ");
					System.out.println("If yes,press 1,otherwise any number  ");
					int k =toto.nextInt();
					if( k==1){
					eChannelling();
					}
					else{
					System.out.println("    Thank you....Stay Safe!!!!.....");  
					}
				}
				else if(h==2)
				{
					onlinePharmacy();
				}
			}	
			else{
			System.out.println("    Thank you....Stay Safe!!!!..... ");  
			    } 
		 }
		else{
			System.out.println("    Thank you....Stay Safe!!!!..... ");  
		 }
	  }
		public static void eChannelling()	
		{
				System.out.println(">>>>>                       WELCOME TO E-CHANELLING SYSTEM                   <<<<<<<<<<");
				System.out.println("   ");
				System.out.println("   ");
				Scanner confirm = new Scanner(System.in);
				Scanner sc = new Scanner(System.in);
				System.out.println("*                                                                                          ");
				System.out.println("*.......        Find your specialist below          .............   ");
				System.out.println("   ");
				String[]specialist ={"1.Dental Surgeon", "2.Dermotologist", "3.Ent Surgeon", "4.Eye Surgeon", "5.General Surgeon"}; 
				System.out.println("   ");
				for (String s:specialist)
				{
					System.out.print(s+ ",   ");
				}
				System.out.println("   ");
				System.out.println("   ");
				System.out.println("                         Choose Your Specialist ........                               ");
				System.out.println("*To select  a specialist,enter the number infront of the specialist                   *");
				System.out.println("*To channel a doctor,enter the ID infront of his/her name(EX:Dr Amitha Perera - 1.1). *");
				System.out.println("   ");
				int num = sc.nextInt();
				int a = 500;
				int b = 300;
					if(num == 1)
					{
					System.out.println("                              1.Dental Surgeon                                         ");
					System.out.println("   ");
					System.out.println("                             1.1)  DR AMITHA FERNANDO                                  ");
					
					 System.out.println("                                                                                     ");
					 System.out.println("                            1.2)  DR SHENOLI KARIYAWASAM                              ");
					
					 System.out.println("*                                                                                      *");
					 System.out.println("*................................Choose your Doctor....................................*");
					 
					 System.out.println("*                                                                                      *");
						 double number1= 1.1;
						  double number = sc.nextDouble();
							if(number==number1)
							{
								System.out.println("*                            1.1)..DR AMITHA FERNANDO                                  *");
								System.out.println("*                                    DENTIST                                           *");
								System.out.println("*                             Nicklaus hospital - Colombo                              *");
								System.out.println("*                                                                                      *");
								System.out.println("                                                 Available time - weekdays from 7pm-10pm");
								int u = 1500;
								int v = a+b+u;
								System.out.println("*                                                                                      *");
								System.out.println("              Your chanelling fee-Rs. 500/=");
								System.out.println("              Hospital fee       -Rs. 300/=");
								System.out.println("              Doctor's fee       -Rs.1500/=");
								System.out.println("              Your total fee is Rs. "+v ); 
								System.out.println("     To confirm booking,enter your national ID number..and full name........          "); 
								System.out.println(" Enter your national ID number.........          "); 
								String id = confirm.nextLine();
								System.out.println(" Enter your full name.........          "); 
								String namee = confirm.nextLine();
								System.out.println(" Dear  "+namee+",                                         "); 
								System.out.println(" Your reservation code is 123R. Please keep it with you,  you will need it to get a number");
							System.out.println("                                       Thank you for trusting us....Stay Safe!.....                                 "); 
							System.out.println("   ");
							
							}
							
							else{
								System.out.println("                           1.2)..DR SHENOLI KARIYAWASAM                                ");
								System.out.println("                                    DENTIST                                            ");
								System.out.println("                              Nicklaus hospital - Colombo                              ");
								System.out.println("                                                                                       ");
								System.out.println("                                                 Available time - weekdays from 3pm-7pm");
								int c = 1650;
								int d = a+b+c;
								System.out.println("              Your chanelling fee-Rs. 500/=");
								System.out.println("              Hospital fee       -Rs. 300/=");
								System.out.println("              Doctor's fee       -Rs.1650/=");
								System.out.println("                  Your total fee is Rs. "+d ); 
								System.out.println("     To confirm booking,enter your national ID number..and full name........          "); 
								System.out.println(" Enter your national ID number.........          "); 
								String id1 = confirm.nextLine();
								System.out.println(" Enter your full name.........          "); 
								String name1 = confirm.nextLine();
								System.out.println(" Dear  "+name1+",                                         "); 
								System.out.println(" Your reservation code is 148AR. Please keep it with you, you will need it to get a number");
								System.out.println("                                       Thank you for trusting us....Stay Safe!.......  "); 
								System.out.println("   ");
							}
					}
			  else if(num == 2)
					{
							System.out.println("*                               2.1)..DR NELUM WICKRAMASINGHE                            *");
							System.out.println("*                                                                                        *");
							System.out.println("*                               2.2)...DR SOBITHA KARUNARATHNA.                          *");
							System.out.println("*                                                                                        *");
							System.out.println("*................................Choose your Doctor......................................*");
						double number2= 2.1;
						  double number = sc.nextDouble();
						  if(number==number2)
						  
						{
							System.out.println("*                               2.1)..DR NELUM WICKRAMASINGHE                            *");
							System.out.println("*                                       DERMOTOLOGIST                                    *");
							System.out.println("*                                Nicklaus hospital - Colombo                             *");
							System.out.println("*                                                                                        *");
							System.out.println("                                                   Available time - weekends from 7pm-10pm");
							int e = 1700;
							int f = a+b+e;
							System.out.println("                     Your chanelling fee-Rs. 500/=");
							System.out.println("                     Hospital fee       -Rs. 300/=");
							System.out.println("                     Doctor's fee       -Rs.1700/=");
							System.out.println("                         Your total fee is Rs. "+f ); 
							System.out.println("*                                                                                        *");
							System.out.println("     To confirm booking,enter your national ID number..and full name........          "); 
								System.out.println(" Enter your national ID number.........          "); 
								String id2 = confirm.nextLine();
								System.out.println(" Enter your full name.........          "); 
								String name2 = confirm.nextLine();
								System.out.println(" Dear  "+name2+",                                         "); 
								System.out.println(" Your reservation code is 178kR. Please keep it with you, you will need it to get a number");
								System.out.println("                                       Thank you for trusting us....Stay Safe!.......  "); 
								System.out.println("   ");
						  }
						else{
							System.out.println("*                               2.2)...DR SOBITHA KARUNARATHNA.                          *");
							System.out.println("*                                      DERMOTOLOGIST                                     *");
							System.out.println("*                                   Nicklaus hospital - Colombo                          *");
							 System.out.println("                                                Available time - weekdays from 4.30pm-9pm");
							 System.out.println("   ");
							int g = 1450;
							int h = a+b+g;
							System.out.println("                     Your chanelling fee-Rs. 500/=");
							System.out.println("                     Hospital fee       -Rs. 300/=");
							System.out.println("                     Doctor's fee       -Rs.1450/=");
							System.out.println("                         Your total fee is Rs. "+h ); 
							System.out.println("*                                                                                        *");
							System.out.println("      To confirm booking,enter your national ID number..and full name........          "); 
								System.out.println("      Enter your national ID number.........          "); 
								String id3 = confirm.nextLine();
								System.out.println("      Enter your full name.........          "); 
								String name3 = confirm.nextLine();
								System.out.println("      Dear  "+name3+",                                         "); 
								System.out.println("       Your reservation code is 001AR. Please keep it with you, you will need it to get a number");
								System.out.println("                                       Thank you for trusting us....Stay Safe!.......  "); 
								System.out.println("   ");
						}
			  
					}	
				else if(num==3)		
					{
						System.out.println("*                                   3.1)..DR ROHAN RANASINGHE                               *");
						System.out.println("*                                                                                           *");
						System.out.println("*                                   3.2)..DR SARACHCHANDRA                                  *");
						System.out.println("*                                                                                           *");
						System.out.println("*................................Choose your Doctor.........................................*");
						double number3= 3.1;
						  double number = sc.nextDouble();
						  if(number==number3)
						{
							System.out.println("*                                   3.1)..DR ROHAN RANASINGHE                               *");
							System.out.println("*                                         Ent Surgeon                                       *");
							System.out.println("*                                    Nicklaus hospital - Colombo                            *");
							System.out.println("                                                      Available time - weekdays from 7pm-10pm");
							int i = 1500;
							int j = a+b+i;
							System.out.println("                          Your chanelling fee-Rs. 500/=");
							System.out.println("                          Hospital fee       -Rs. 300/=");
							System.out.println("                          Doctor's fee       -Rs.1500/=");
							System.out.println("                          Your total fee is Rs. "+j ); 
							System.out.println("     To confirm booking,enter your national ID number..and full name........          "); 
								System.out.println(" Enter your national ID number.........          "); 
								String id4 = confirm.nextLine();
								System.out.println(" Enter your full name.........          "); 
								String name4 = confirm.nextLine();
								System.out.println("      Dear  "+name4+",                                         "); 
								System.out.println("       Your reservation code is 136AN. Please keep it with you, you will need it to get a number");
								System.out.println("                                Thank you for trusting us....Stay Safe!.......  "); 
								System.out.println("   ");  
						  }
						else{
							System.out.println("*                                   3.2)..DR SARACHCHANDRA                                  *");
							System.out.println("*                                         Ent Surgeon                                       *");
							System.out.println("*                                    Nicklaus hospital - Colombo                            *");
							System.out.println("*                                                                                           *");
							System.out.println("                                                       Available time - weekdays from 3pm-7pm");
							int k = 1750;
							int l = a+b+k;
							System.out.println("                            Your chanelling fee-Rs. 500/=");
							System.out.println("                            Hospital fee       -Rs. 300/=");
							System.out.println("                            Doctor's fee       -Rs.1750/=");
							System.out.println("                            Your total fee is Rs. "+l ); 
							System.out.println("*                                                                                           *");
							System.out.println("     To confirm booking,enter your national ID number..and full name........          "); 
								System.out.println("     Enter your national ID number.........          "); 
								String iid = confirm.nextLine();
								System.out.println("     Enter your full name.........          "); 
								String naame = confirm.nextLine();
								System.out.println("       Dear  "+naame+",                                         "); 
								System.out.println("           Your reservation code is 148AR. Please keep it with you, you will need it to get a number");
								System.out.println("                                       Thank you for trusting us....Stay Safe!.......  "); 
								System.out.println("   ");
						}
					}
						else if(num==4)		
						{
						System.out.println("*                                    4.1)..DR DILSHA PERERA                                     *");
						System.out.println("*                                                                                               *");
						System.out.println("*                                    4.2)..DR Sunil Kariywasam                                  *");
						System.out.println("*                                                                                               *");
						System.out.println("*....................................Choose your Doctor.........................................*");
						double number4= 4.1;
						  double number = sc.nextDouble();
						  if(number==number4)
							{
							System.out.println("*                                    4.1)..DR DILSHA PERERA                                     *");
							System.out.println("*                                          Eye Surgeon                                          *");
							System.out.println("*                                     Nicklaus hospital - Colombo                               *");
							System.out.println("*                                                                                               *");
							System.out.println("                                                          Available time - weekdays from 7pm-10pm");
							int m = 1500;
							int n = a+b+m ;
							System.out.println("                             Your chanelling fee-Rs. 500/=");
							System.out.println("                             Hospital fee       -Rs. 300/=");
							System.out.println("                             Doctor's fee       -Rs.1500/=");
							System.out.println("                                 Your total fee is Rs. "+m ); 
							System.out.println("                                                                                           ");
							System.out.println("     To confirm booking,enter your national ID number..and full name........          "); 
								System.out.println("     Enter your national ID number.........          "); 
								String id5 = confirm.nextLine();
								System.out.println("     Enter your full name.........          "); 
								String name5 = confirm.nextLine();
								System.out.println("    Dear  "+name5+",                                         "); 
								System.out.println("          Your reservation code is 118AR. Please keep it with you, you will need it to get a number");
								System.out.println("                             Thank you for trusting us....Stay Safe!.......  "); 
								System.out.println("   ");
							}
							else{
								System.out.println("*                                  4.2)..DR Sunil Kariywasam                                    *");
								System.out.println("*                                          Eye Surgeon                                          *");
								System.out.println("*                                     Nicklaus hospital - Colombo                               *");
								System.out.println("*                                                                                               *");
							System.out.println("                                                          Available time - weekdays from 3pm-7pm");
							int o = 1650;
							int p = a+b+o;
							System.out.println("                             Your chanelling fee-Rs. 500/=");
							System.out.println("                             Hospital fee       -Rs. 300/=");
							System.out.println("                             Doctor's fee       -Rs.1650/=");
							System.out.println("                                 Your total fee is Rs. "+p ); 
							System.out.println("                                                                                              ");
							System.out.println("          To confirm booking,enter your national ID number..and full name........          "); 
								System.out.println("            Enter your national ID number.........          "); 
								String id6 = confirm.nextLine();
								System.out.println("            Enter your full name.........          "); 
								String name6 = confirm.nextLine();
								System.out.println("   Dear  "+name6+",                                         "); 
								System.out.println("       Your reservation code is 047WR. Please keep it with you, you will need it to get a number");
								System.out.println("                                       Thank you for trusting us....Stay Safe!.......  "); 
								System.out.println("   ");
							}
					}
	
					else if(num==5)		
						{
						System.out.println("*                                    5.1)..DR SOMASIRI                                               *");
						System.out.println("*                                                                                                    *");
						System.out.println("*                                    5.2)..DR Weththasinghe                                          *");
						System.out.println("*                                                                                                    *");
						System.out.println("*.......................................Choose your Doctor...........................................*");
					    double number5= 5.1;
						  double number = sc.nextDouble();
						  if(number==number5)
							{
								System.out.println("*                                    5.1)..DR SOMASIRI                                               *");
								System.out.println("*                                      General Surgeon.                                              *");
								System.out.println("*                                  Nicklaus hospital - Colombo                                       *");
								System.out.println("*                                                                                                    *");
							System.out.println("                                                             Available time - weekdays from 7pm-10pm");
							System.out.println("                                                                              weekends from 3pm-8pm");
							int q = 1500;
							int r = a+b+q;
								System.out.println("                              Your chanelling fee-Rs. 500/=");
								System.out.println("                              Hospital fee       -Rs. 300/=");
								System.out.println("                              Doctor's fee       -Rs.1500/=");
								System.out.println("                              Your total fee is Rs. "+r ); 
								System.out.println("          To confirm booking,enter your national ID number..and full name........          "); 
								System.out.println("          Enter your national ID number.........          "); 
								String id7 = confirm.nextLine();
								System.out.println("          Enter your full name.........          "); 
								String name7 = confirm.nextLine();
								System.out.println("      Dear  "+name7+",                                         "); 
								System.out.println("          Your reservation code is 981IP. Please keep it with you, you will need it to get a number");
								System.out.println("                                       Thank you for trusting us....Stay Safe!.......  "); 
								System.out.println("   ");
								}
							else{
								System.out.println("*                                    5.2)..DR Weththasinghe                                          *");
								System.out.println("*                                        General Surgeon                                             *");
								System.out.println("*                                  Nicklaus hospital - Colombo                                       *");
								System.out.println("*                                                                                                    *");
								System.out.println("                                                      Available time - weekdays from 3pm-7pm");
									int s = 1650;
									int t = a+b+s;
									System.out.println("*                                                                                                    *");
										System.out.println("                   Your chanelling fee-Rs. 500/=");
										System.out.println("                   Hospital fee       -Rs. 300/=");
										System.out.println("                   Doctor's fee       -Rs.1650/=");
										System.out.println("                       Your total fee is Rs. "+t ); 
										System.out.println("*                                                                                           *");
										System.out.println("     To confirm booking,enter your national ID number..and full name........          "); 
								System.out.println(" Enter your national ID number.........          "); 
								String id8 = confirm.nextLine();
								System.out.println(" Enter your full name.........          "); 
								String name8= confirm.nextLine();
								System.out.println(" Dear  "+name8+",                                         "); 
								System.out.println(" Your reservation code is 173VB. Please keep it with you, you will need it to get a number");
								System.out.println("                                       Thank you for trusting us....Stay Safe!.......  "); 
								System.out.println("   ");
										System.out.println("You have booked successfully...Please be kind enough to arrive hospital on time...Thank you for trusting us. ..."); 
								}
								
						}
						
		
		}	
		
			public static void onlinePharmacy()
			{			
			System.out.println("                                                                  ");
			System.out.println(".............................Welcome to our online Pharmacy...........................................");
				System.out.println(" Our fully equipped 24/7 pharmacy offer medicine for many types of illnesses as prescribed by our doctors & medicine delivery facility is also available");
				Scanner p = new Scanner(System.in);
				System.out.println("                    Please submit your  5 numbers prescription code   (code:55487)          ");
				int code = 55487;
				code= p.nextInt( );  //code:55487
					if(code==55487)
					{
						Scanner add = new Scanner (System.in);
					System.out.println("                        Your prescription is checking.........                                   ");
					System.out.println("                 Your prescription has been found.....Your prescription id is: 55487VF           ");
					String address;
					System.out.println("---Please enter the address you want to get delivered your medicine(without any symbols(,/.-))....");
					System.out.println("           Ex:34A Church rd Wishakawatta Borella ");
					address= add.nextLine();
					System.out.println("  ");
					System.out.println("Your address is: "+address+" ");
					System.out.println("         We work on our best to deliver your medicine as soon as possible to your doorstep       ");
					System.out.println("...........................Thank you for using our service, Stay Safe...!........................");
					System.out.println(".........................Nicklaus Hospital(Pvt)Ltd...............................................");
					}
					else{
						
						System.out.println("...........?????????Invalid code??????????........... ");
						System.out.println("  ");
						System.out.println("*         Please TRY AGAIN entering your code CORRECTLY  (**CODE: 55487**)");
						int code1 = p.nextInt();
									System.out.println("                        Your prescription is checking.........                                   ");
									System.out.println("                 Your prescription has been found.....Your prescription id is: 55487VF           ");
									String address1;
									System.out.println("---Please enter the address you want to get delivered your medicine(without any symbols(,/.-))....");
									System.out.println("           Ex:34A Church rd Wishakawatta Borella ");
									Scanner ads =new Scanner (System.in);
									address1 = ads.nextLine();
									System.out.println("Your address is: "+address1+" ");
									System.out.println("         We work on our best to deliver your medicine as soon as possible to your doorstep       ");
									System.out.println("...........................Thank you for using our service, Stay Safe...!........................");
									System.out.println(".........................Nicklaus Hospital(Pvt)Ltd...............................................");
					}
			}
			
			
			public static void bmiCalculater()	
			{
				System.out.println("                     >>>>>>  BMI CALCULATOR   <<<<<<<<<<    ");
				
				System.out.println("  ");
				Scanner bmi = new Scanner (System.in);
				Scanner print = new Scanner (System.in);
				System.out.print("Input your weight in kilogram: ");
				double weight = bmi.nextDouble();
				System.out.println("  ");
				System.out.println("Enter your height in meters: ");
				double height = bmi.nextDouble();
				System.out.println("  ");
				double BMI = weight/ (height*height);
				System.out.println(" Your Body Mass Index is :  "+BMI+"  ");
				System.out.println("");
				String word = "yes";
				Scanner b = new Scanner (System.in);
				System.out.println("Do you want to print a report?If yes enter 'yes',Otherwise 'no'");
				word= b.nextLine();
				System.out.println("  ");
				if(word.equals("yes"))
				{
					System.out.println("What is your name?");
					String username=b.nextLine();
					System.out.println("Enter your BMI HERE");
					double result= print.nextDouble();	
					if(result<18.5)
					{
					System.out.println("Dear, "+username+" , ");
					System.out.println(" Your Body Mass Index is :  "+BMI+"  ");
					System.out.println("A BMI of less than 18.5 indicates that you are underweight, so you may need to put on some weight.");
					System.out.println("");
					System.out.println("Please consider these things when you consume foods again.......");
					System.out.println("");
					System.out.println(".....Eating at least 5 portions of a variety of fruit and vegetables every day.");
					System.out.println(".....Having some dairy or dairy alternatives (such as soya drinks and yoghurts)");
					System.out.println(".....Have whole (full-fat) milk until you build your weight back up.");
					System.out.println("");
					System.out.println(".....Eating some beans, pulses, fish, eggs, meat and other protein. Aim for 2 portions of fish every week – 1 of which should be oily, such as salmon or mackerel.");
					System.out.println(".....Choosing unsaturated oils and spreads, such as sunflower or rapeseed, and eating them in small amounts.");
					System.out.println(".....Drinking plenty of fluids.recommends 6 to 8 glasses a day. But try not to have drinks just before meals to avoid feeling too full to eat.");
					System.out.println(".....If you're having foods and drinks that are high in fat, salt and sugar, have these less often and in small amounts.");	
					System.out.println("");
					System.out.println(".................................Nicklaus Hospital(Pvt)Ltd..............................................................");
					
				}
				else if(result>=18.5 && result<25)
				{
					System.out.println("Dear, "+username+" , ");
					System.out.println(" Your Body Mass Index is :  "+BMI+"  ");
					System.out.println("Congratulations!!Your BMI is in the range of 18.5 to 25 indicates that you are in the normal range, so you may need to maintain that BMI.");
					System.out.println("");
					System.out.println("Please consider these things.......");
					System.out.println("");
					System.out.println(".....Eating at least 5 portions of a variety of fruit and vegetables every day.");
					System.out.println(".....Reduce consuming diary products.");
					System.out.println(".....Eat balanced lunch-red protien,yellow and green vegitables, rice should be 1 cup size, the rest of the plate should filled with vegitables.. ");
					System.out.println(".....Reduce sugary and high salted foods.");
					System.out.println("");
					System.out.println(".....Drinking plenty of fluids. 6 to 8 glasses a day.");
					System.out.println(".....If you're having foods and drinks that are high in fat, salt and sugar,have these less often and in small amounts.");
					System.out.println(".....Don't forget to excersice daily for at least 30 mins");
					System.out.println("");
					System.out.println("...............................Nicklaus Hospital(Pvt)Ltd................................................................");
					
				}
				else 
				{
				
					System.out.println("Dear, "+username+" , ");
					System.out.println(" Your Body Mass Index is :  "+BMI+"  ");
					System.out.println("Oh! You are overweight;that means you have a high risk to have obesity,high-blood pressure....");
					System.out.println("");
					System.out.println("Please consider these things.......");
					System.out.println("");
					System.out.println(".....Eating at least 5 portions of a variety of fruit and vegetables every day.");
					System.out.println(".....Consume fat free or low fat instead of full fat diary products.");
					System.out.println(".....Eat balanced lunch-red protien,yellow and green vegitables, rice should be 1cup size, the rest of the plate should filled with vegitables.. ");
					System.out.println(".....Avoid sugary and high salted foods.");
					System.out.println("");
					System.out.println(".....Drink plenty of fluids. 6 to 8 glasses a day.");
					System.out.println(".....Stop having foods and drinks that are high in fat, salt and sugar.");
					System.out.println(".....Excersice daily for at least 40 mins");	
					System.out.println("");	
					System.out.println(".........................Nicklaus Hospital(Pvt)Ltd..................................................................");
				
					
				}

			}
			
			else {
			System.out.println("*......................Thank you for using our service, Stay Safe...!...............................*");
			System.out.println(".........................Nicklaus Hospital(Pvt)Ltd...................................................");
			
		          }
			}
		
	 }
		
	