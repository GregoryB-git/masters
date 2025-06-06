// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package q3;

public abstract class k
{
    public static byte[] a(final String s) {
        if (s.length() % 2 == 0) {
            final int n = s.length() / 2;
            final byte[] array = new byte[n];
            for (int i = 0; i < n; ++i) {
                final int index = i * 2;
                final int digit = Character.digit(s.charAt(index), 16);
                final int digit2 = Character.digit(s.charAt(index + 1), 16);
                if (digit == -1 || digit2 == -1) {
                    throw new IllegalArgumentException("input is not hexadecimal");
                }
                array[i] = (byte)(digit * 16 + digit2);
            }
            return array;
        }
        throw new IllegalArgumentException("Expected a string of even length");
    }
    
    public static String b(final byte[] array) {
        final StringBuilder sb = new StringBuilder(array.length * 2);
        for (int length = array.length, i = 0; i < length; ++i) {
            final int n = array[i] & 0xFF;
            sb.append("0123456789abcdef".charAt(n / 16));
            sb.append("0123456789abcdef".charAt(n % 16));
        }
        return sb.toString();
    }
}
