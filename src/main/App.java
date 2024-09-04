package main;

// import Test file 
import test.BankAccountTest;
import test.VectorTest;

public class App {
    public static void main(String[] args) throws Exception {
        // Run tests 

        // Create an instance of the test class
        BankAccountTest test = new BankAccountTest();
        test.testDeposit();
        test.testWithdraw();
        test.testAddInterest();
        test.testWithdrawOverdraft();
        test.testDepositNegative();
        test.testWithdrawNegative();

        System.out.println("Q1: All tests passed :)");

        VectorTest q2 = new VectorTest();
        q2.testConstructor();
        q2.testRead();
        q2.testUpdate();
        q2.testDelete();
        q2.testAdd();
        q2.testSubtract();
        q2.testMax();
        q2.testMaxEmpty();
        q2.testMaxNegative();
        q2.testMaxMixed();
        q2.testMaxSingle();
        q2.testMaxZero();
        q2.testMaxNegativeZero();
        q2.testMaxNegativeSingle();
        q2.testMaxNegativeMixed();
        q2.testMaxMixedZero();
        q2.testMaxMixedSingle();
        q2.testMin();
        q2.testMinEmpty();
        q2.testMinNegative();
        q2.testMinMixed();
        q2.testMinSingle();
        q2.testMinZero();
        q2.testMinNegativeZero();
        q2.testAverage();
        q2.testAverageEmpty();
        q2.testSearch();
        q2.testSearchEmpty();
        q2.testSearchNotFound();
        q2.testSearchNegative();
        q2.testSearchMixed();
        q2.testSearchFast();
        q2.testSearchFastNotFound();
        q2.testSearchFastNegative();
        q2.testSearchFastMixed();
        q2.testSort();
        q2.testSortEmpty();
        q2.testSortSingle();
        q2.testSortNegative();
        q2.testSortMixed();

        System.out.println("Q2: All tests passed :)");
    }
}
