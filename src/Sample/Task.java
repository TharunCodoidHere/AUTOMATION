package Sample;

import jdk.internal.org.objectweb.asm.tree.MultiANewArrayInsnNode;

public class Task {
    public static void main(String[] args) {
    int n=510;
    int m=410;
    int o=250;
    int p=10;

    int q=n/p;
    int r=m/p;
    int x=o/p;
    int y=q+r+x;


        System.out.println("Total Average is " +y);
    }
}
