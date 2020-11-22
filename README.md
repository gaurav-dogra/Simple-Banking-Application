# Simple Banking Application
A Hard category project from hyperskill.org

### How to run the project
1. clone/download the project to your system
2. Execute Simple-Banking-Application/Main.java with command line arguments _**-fileName fileName**_
3. The fileName given above is used to store the records on the hard drive

### Methodologies / Tools used in the system
1. JDBC 
2. DAO
3. SQLite
4. Java

### User interface

### Program execution example 1

**1. Create an account<br>
2. Log into account<br>
0. Exit**<br>
>1

Your card have been created
Your card number:
4000009455296122
Your card PIN:
1961

**1. Create an account<br>
2. Log into account<br>
0. Exit**<br>
1

Your card have been created
Your card number:
4000003305160034
Your card PIN:
5639

**1. Create an account<br>
2. Log into account<br>
0. Exit**<br>
>2

Enter your card number:
>4000009455296122
Enter your PIN:
>1961

You have successfully logged in!

**1. Balance<br>
2. Add income<br>
3. Do transfer<br>
4. Close account<br>
5. Log out<br>
0. Exit**<br>
>2

Enter income:
>10000
Income was added!

**1. Balance<br>
2. Add income<br>
3. Do transfer<br>
4. Close account<br>
5. Log out<br>
0. Exit**<br>
>1

Balance: 10000

**1. Balance<br>
2. Add income<br>
3. Do transfer<br>
4. Close account<br>
5. Log out<br>
0. Exit**<br>
>3

Transfer
Enter card number:
>4000003305160035
Probably you made mistake in the card number. Please try again!

**1. Balance<br>
2. Add income<br>
3. Do transfer<br>
4. Close account<br>
5. Log out<br>
0. Exit**<br>
>3

Transfer
Enter card number:
>4000003305061034
Such a card does not exist.

**1. Balance<br>
2. Add income<br>
3. Do transfer<br>
4. Close account<br>
5. Log out<br>
0. Exit**<br>
>3

Transfer
Enter card number:
>4000003305160034
Enter how much money you want to transfer:
>15000
Not enough money!

**1. Balance<br>
2. Add income<br>
3. Do transfer<br>
4. Close account<br>
5. Log out<br>
0. Exit**<br>
>3

Transfer
Enter card number:
>4000003305160034
Enter how much money you want to transfer:
>5000
Success!

**1. Balance<br>
2. Add income<br>
3. Do transfer<br>
4. Close account<br>
5. Log out<br>
0. Exit**<br>
>1

Balance: 5000

**1. Balance<br>
2. Add income<br>
3. Do transfer<br>
4. Close account<br>
5. Log out<br>
0. Exit**<br>

>0
Bye!



### Program execution example 2

**1. Create an account<br>
2. Log into account<br>
0. Exit**<br>
>1

Your card has been created
Your card number:
4000007916053702
Your card PIN:
6263

**1. Create an account<br>
2. Log into account<br>
0. Exit**<br>
>2

Enter your card number:
>4000007916053702
Enter your PIN:
>6263

You have successfully logged in!

**1. Balance<br>
2. Add income<br>
3. Do transfer<br>
4. Close account<br>
5. Log out<br>
0. Exit**<br>
>4

The account has been closed!

**1. Create an account<br>
2. Log into account<br>
0. Exit**<br>
>2

Enter your card number:
>4000007916053702
Enter your PIN:
>6263

Wrong card number or PIN!

**1. Create an account<br>
2. Log into account<br>
0. Exit**<br>
>0

Bye!
