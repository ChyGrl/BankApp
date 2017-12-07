# BankApp
Scenario 
You are a back-end developer and need to create an application to handle new customer account requests.

Your application should do the following:

Read a CSV file of names, social security numbers, account type and initial deposit.

Use a proper data structure to hold all these accounts.

Both saving a checking account share the following properties:
deposit()
withdrawal()
transfer()
showInfo()

Both will have an 11 digit account number (generated with the following process: 1 or 2 depending on the Savings or Checking, last two digits of the social security number, unique 5 digit number and random 3 digit number)

Savings account holders are given a safety deposit box, identified by a 3 digit number and accessed with a 4 digit code.

Checking account holders are assigned a debit card with a 12 digit number and 4 digit pin. 
Both accounts will use an interface that determines the base interest rate

Savings accounts will use .25 less than the base rate. 
Checking accounts will use 15% of the base rate

The show info method should reveal relevant account info as well as information specific to the Checking account or savings account.
