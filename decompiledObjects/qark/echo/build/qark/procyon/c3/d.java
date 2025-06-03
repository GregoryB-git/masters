// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package c3;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import p3.C;

public abstract class d
{
    public static final byte[] a;
    
    static {
        a = new byte[0];
    }
    
    public static byte[] a(final C.c c) {
        final int n = d$a.a[c.b0().ordinal()];
        ByteBuffer byteBuffer;
        if (n != 1 && n != 2) {
            if (n != 3) {
                if (n == 4) {
                    return d.a;
                }
                throw new GeneralSecurityException("unknown output prefix type");
            }
            else {
                byteBuffer = ByteBuffer.allocate(5).put((byte)1);
            }
        }
        else {
            byteBuffer = ByteBuffer.allocate(5).put((byte)0);
        }
        return byteBuffer.putInt(c.a0()).array();
    }
}
