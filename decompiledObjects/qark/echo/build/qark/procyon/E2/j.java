// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package E2;

public abstract class j
{
    public static final char[] a;
    public static final char[] b;
    
    static {
        a = new char[] { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
        b = new char[] { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f' };
    }
    
    public static String a(final byte[] array) {
        final int length = array.length;
        final char[] value = new char[length + length];
        int n = 0;
        int n2 = 0;
        while (true) {
            final int n3 = n2;
            if (n >= array.length) {
                break;
            }
            final byte b = array[n];
            final char[] b2 = j.b;
            value[n3] = b2[(b & 0xFF) >>> 4];
            n2 = n3 + 2;
            value[n3 + 1] = b2[b & 0xF];
            ++n;
        }
        return new String(value);
    }
    
    public static String b(final byte[] array, final boolean b) {
        final int length = array.length;
        final StringBuilder sb = new StringBuilder(length + length);
        for (int n = 0; n < length && (!b || n != length - 1 || (array[n] & 0xFF) != 0x0); ++n) {
            final char[] a = j.a;
            sb.append(a[(array[n] & 0xF0) >>> 4]);
            sb.append(a[array[n] & 0xF]);
        }
        return sb.toString();
    }
}
