public class StackHeapTest {
    public int n = 5;
    public static void changeInt(int nValue, int nRefN, StackHeapTest nRef) {
        System.out.println("nValue: "+nValue+"\tnRefN: "+ nRefN + "\tnRef.n: " + nRef.n);
        nValue += 10;
        nRefN += 10;
        nRef.n += 10;
        System.out.println("nValue: "+nValue+"\tnRefN: "+ nRefN + "\tnRef.n: " + nRef.n);
    }

    public static void main(String[] args) {
        int n = 5; //primitive type on stack

        StackHeapTest nRef = new StackHeapTest();
        System.out.println("nValue = "+ n +"\n"+"hash = "+System.identityHashCode(n)+"\n");
        System.out.println("nRefN = "+ nRef.n +"\n"+"hash = "+System.identityHashCode(n)+"\n");
        System.out.println("nRef = "+ nRef +"\n"+"hash = "+System.identityHashCode(n)+"\n");
        changeInt(n,nRef.n,nRef);
        System.out.println("");
        System.out.println("nValue = "+ n +"\n"+"hash = "+System.identityHashCode(n)+"\n");
        System.out.println("nRefN = "+ nRef.n +"\n"+"hash = "+System.identityHashCode(n)+"\n");
        System.out.println("nRef = "+ nRef +"\n"+"hash = "+System.identityHashCode(n)+"\n");
    }
}