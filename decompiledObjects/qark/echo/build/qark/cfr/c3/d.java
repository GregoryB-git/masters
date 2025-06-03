/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.NoSuchFieldError
 *  java.lang.Object
 *  java.lang.String
 *  java.nio.ByteBuffer
 *  java.security.GeneralSecurityException
 */
package c3;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import p3.C;
import p3.I;

public abstract class d {
    public static final byte[] a = new byte[0];

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static byte[] a(C.c c8) {
        ByteBuffer byteBuffer;
        int n8 = .a[c8.b0().ordinal()];
        if (n8 != 1 && n8 != 2) {
            if (n8 != 3) {
                if (n8 != 4) throw new GeneralSecurityException("unknown output prefix type");
                return a;
            }
            byteBuffer = ByteBuffer.allocate((int)5).put((byte)1);
            do {
                return byteBuffer.putInt(c8.a0()).array();
                break;
            } while (true);
        }
        byteBuffer = ByteBuffer.allocate((int)5).put((byte)0);
        return byteBuffer.putInt(c8.a0()).array();
    }

}

