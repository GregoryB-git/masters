// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package c5;

public abstract class a extends m
{
    public static final char[] a;
    public static final int[] b;
    public static final char[] c;
    
    static {
        a = "0123456789-$:/.+ABCD".toCharArray();
        b = new int[] { 3, 6, 9, 96, 18, 66, 33, 36, 48, 72, 12, 24, 69, 81, 84, 21, 26, 41, 11, 14 };
        c = new char[] { 'A', 'B', 'C', 'D' };
    }
    
    public static boolean a(final char[] array, final char c) {
        if (array != null) {
            for (int length = array.length, i = 0; i < length; ++i) {
                if (array[i] == c) {
                    return true;
                }
            }
        }
        return false;
    }
}
