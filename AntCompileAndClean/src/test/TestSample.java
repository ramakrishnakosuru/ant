package test;

import sample.Sample;

public class TestSample {
    public static void main(String[] args) {
	Sample sample = new Sample();
	int result = sample.add(1, 2);
	System.out.println("result = " + result);
    }
}
