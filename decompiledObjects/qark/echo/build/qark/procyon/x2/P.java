// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package x2;

public abstract class P
{
    public static int a(final int n) {
        for (int i = 0; i < 6; ++i) {
            final int n2 = (new int[] { 1, 2, 3, 4, 5, 6 })[i];
            if (n2 == 0) {
                throw null;
            }
            if (n2 - 1 == n) {
                return n2;
            }
        }
        return 1;
    }
}
