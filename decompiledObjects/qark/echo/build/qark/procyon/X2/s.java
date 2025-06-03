// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package X2;

public abstract class s
{
    public static int a(int max, final double n) {
        max = Math.max(max, 2);
        final int highestOneBit = Integer.highestOneBit(max);
        if (max <= (int)(n * highestOneBit)) {
            return highestOneBit;
        }
        max = highestOneBit << 1;
        if (max > 0) {
            return max;
        }
        return 1073741824;
    }
    
    public static int b(final int n) {
        return (int)(Integer.rotateLeft((int)(n * -862048943L), 15) * 461845907L);
    }
    
    public static int c(final Object o) {
        int hashCode;
        if (o == null) {
            hashCode = 0;
        }
        else {
            hashCode = o.hashCode();
        }
        return b(hashCode);
    }
}
