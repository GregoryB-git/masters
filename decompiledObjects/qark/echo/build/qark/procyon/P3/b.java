// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package P3;

public class b implements d
{
    public final int a;
    
    public b(final int a) {
        this.a = a;
    }
    
    @Override
    public StackTraceElement[] a(final StackTraceElement[] array) {
        final int length = array.length;
        final int a = this.a;
        if (length <= a) {
            return array;
        }
        final int n = a / 2;
        final int n2 = a - n;
        final StackTraceElement[] array2 = new StackTraceElement[a];
        System.arraycopy(array, 0, array2, 0, n2);
        System.arraycopy(array, array.length - n, array2, n2, n);
        return array2;
    }
}
