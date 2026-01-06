package com.kl;
class Bank {
    double getInterestRate() {
        return 0.0; 
    }
}
class SBI extends Bank {
    @Override
    double getInterestRate() {
        return 5.5;
    }
}
class HDFC extends Bank {
    @Override 
    double getInterestRate() {
        return 10.5; 
    }
}

public class methodoverriding {
	public static void main(String[] args) {
        Bank b1 = new SBI();   
        Bank b2 = new HDFC();  
        
        System.out.println("SBI Interest Rate: " + b1.getInterestRate() + "%");
        System.out.println("HDFC Interest Rate: " + b2.getInterestRate() + "%");
    }
}