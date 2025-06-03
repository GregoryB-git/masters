// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package a3;

public abstract class a
{
    public static int a(final boolean b, final boolean b2) {
        if (b == b2) {
            return 0;
        }
        if (b) {
            return 1;
        }
        return -1;
    }
    
    public static boolean b(final boolean[] array, final boolean b) {
        for (int length = array.length, i = 0; i < length; ++i) {
            if (array[i] == b) {
                return true;
            }
        }
        return false;
    }
}
