// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package k3;

import java.security.SecureRandom;
import java.util.Objects;
import java.nio.charset.Charset;

public abstract class t
{
    public static final Charset a;
    
    static {
        a = Charset.forName("UTF-8");
    }
    
    public static Integer a() {
        if (!b()) {
            return null;
        }
        return k3.a.a();
    }
    
    public static boolean b() {
        return Objects.equals(System.getProperty("java.vendor"), "The Android Project");
    }
    
    public static int c() {
        final SecureRandom secureRandom = new SecureRandom();
        byte[] bytes;
        int i;
        for (bytes = new byte[4], i = 0; i == 0; i = ((bytes[0] & 0x7F) << 24 | (bytes[1] & 0xFF) << 16 | (bytes[2] & 0xFF) << 8 | (bytes[3] & 0xFF))) {
            secureRandom.nextBytes(bytes);
        }
        return i;
    }
    
    public static final byte d(final char c) {
        if (c >= '!' && c <= '~') {
            return (byte)c;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Not a printable ASCII character: ");
        sb.append(c);
        throw new s(sb.toString());
    }
    
    public static final r3.a e(final String s) {
        final byte[] array = new byte[s.length()];
        for (int i = 0; i < s.length(); ++i) {
            array[i] = d(s.charAt(i));
        }
        return r3.a.a(array);
    }
}
