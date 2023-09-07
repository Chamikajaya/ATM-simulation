# ABC Bank ATM Simulation

Welcome to the ABC Bank ATM simulation project! This Java-based project leverages object-oriented programming (OOP) concepts to create a virtual ATM system for ABC Bank. This system allows clients to perform various banking transactions, manage their accounts, and access their funds securely. 

## Table of Contents

- [Project Overview](#project-overview)
- [Client and Account Information](#client-and-account-information)
- [Transactions](#transactions)
- [User Experience](#user-experience)



## Project Overview

ABC Bank's ATM project aims to provide a seamless banking experience to its clients. Here's an overview of the key features and functionalities:

### Client and Account Information

- Clients have unique IDs and personal details, including name, nationality, occupation, address, age, and gender.
- Each client is assigned a Personal Identification Number (PIN) for ATM access.
- Clients can hold multiple bank accounts.
- Account details include account numbers, operating currencies, branch information, and balances.
- Saving accounts accrue interest, and all client accounts must operate in a single currency.
- Clients can request loans, which are linked to their accounts and include loan amount, interest rate, duration, and payment method.

### Transactions

- All transactions are recorded with a unique transaction ID, account ID, date, and status (success, failure, or cancellation).
- Supported transactions include deposits, withdrawals, and balance inquiries.
- Deposit and withdrawal transactions record the transaction amount.
- Balance inquiries display the account balance.

### User Experience

Upon accessing the ABC Bank ATM:

1. Clients are greeted with a "Welcome!" message and prompted to enter their PIN.
2. Clients view their accounts and select one to proceed.
3. Clients are presented with the main menu options:
   - View Balance
   - Withdraw Money
   - Deposit Money
   - Exit
4. Clients choose an option, and if it involves a transaction, they are asked to enter the amount. After completing the transaction, the remaining balance is displayed.

