// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package s4;

import java.nio.ByteBuffer;
import java.util.UUID;
import java.nio.charset.Charset;
import android.util.Base64;

public class o
{
    public static final byte a;
    public static final byte b;
    
    static {
        a = Byte.parseByte("01110000", 2);
        b = Byte.parseByte("00001111", 2);
    }
    
    public static String b(final byte[] array) {
        return new String(Base64.encode(array, 11), Charset.defaultCharset()).substring(0, 22);
    }
    
    public static byte[] c(final UUID uuid, final byte[] array) {
        final ByteBuffer wrap = ByteBuffer.wrap(array);
        wrap.putLong(uuid.getMostSignificantBits());
        wrap.putLong(uuid.getLeastSignificantBits());
        return wrap.array();
    }
    
    public String a() {
        final byte[] c = c(UUID.randomUUID(), new byte[17]);
        final byte b = c[0];
        c[16] = b;
        c[0] = (byte)((b & o.b) | o.a);
        return b(c);
    }
}
