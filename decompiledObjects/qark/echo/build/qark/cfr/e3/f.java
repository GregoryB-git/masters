/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.nio.Buffer
 *  java.nio.ByteBuffer
 *  java.nio.ByteOrder
 *  java.security.GeneralSecurityException
 *  javax.crypto.AEADBadTagException
 */
package e3;

import e3.d;
import e3.i;
import h3.b;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import javax.crypto.AEADBadTagException;

public abstract class f {
    public static final b.b c = b.b.o;
    public final d a;
    public final d b;

    public f(byte[] arrby) {
        if (c.c()) {
            this.a = this.e(arrby, 1);
            this.b = this.e(arrby, 0);
            return;
        }
        throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
    }

    public static byte[] d(byte[] arrby, ByteBuffer byteBuffer) {
        int n8 = arrby.length % 16 == 0 ? arrby.length : arrby.length + 16 - arrby.length % 16;
        int n9 = byteBuffer.remaining();
        int n10 = n9 % 16;
        n10 = n10 == 0 ? n9 : n9 + 16 - n10;
        ByteBuffer byteBuffer2 = ByteBuffer.allocate((int)((n10 += n8) + 16)).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer2.put(arrby);
        byteBuffer2.position(n8);
        byteBuffer2.put(byteBuffer);
        byteBuffer2.position(n10);
        byteBuffer2.putLong((long)arrby.length);
        byteBuffer2.putLong((long)n9);
        return byteBuffer2.array();
    }

    public byte[] a(ByteBuffer byteBuffer, byte[] arrby, byte[] arrby2) {
        if (byteBuffer.remaining() >= 16) {
            int n8 = byteBuffer.position();
            byte[] arrby3 = new byte[16];
            byteBuffer.position(byteBuffer.limit() - 16);
            byteBuffer.get(arrby3);
            byteBuffer.position(n8);
            byteBuffer.limit(byteBuffer.limit() - 16);
            byte[] arrby4 = arrby2;
            if (arrby2 == null) {
                arrby4 = new byte[]{};
            }
            try {
                i.f(this.c(arrby), f.d(arrby4, byteBuffer), arrby3);
            }
            catch (GeneralSecurityException generalSecurityException) {
                throw new AEADBadTagException(generalSecurityException.toString());
            }
            byteBuffer.position(n8);
            return this.a.c(arrby, byteBuffer);
        }
        throw new GeneralSecurityException("ciphertext too short");
    }

    public void b(ByteBuffer byteBuffer, byte[] arrby, byte[] arrby2, byte[] arrby3) {
        if (byteBuffer.remaining() >= arrby2.length + 16) {
            int n8 = byteBuffer.position();
            this.a.d(byteBuffer, arrby, arrby2);
            byteBuffer.position(n8);
            byteBuffer.limit(byteBuffer.limit() - 16);
            arrby2 = arrby3;
            if (arrby3 == null) {
                arrby2 = new byte[]{};
            }
            arrby = i.a(this.c(arrby), f.d(arrby2, byteBuffer));
            byteBuffer.limit(byteBuffer.limit() + 16);
            byteBuffer.put(arrby);
            return;
        }
        throw new IllegalArgumentException("Given ByteBuffer output is too small");
    }

    public final byte[] c(byte[] byteBuffer) {
        byteBuffer = this.b.a((byte[])byteBuffer, 0);
        byte[] arrby = new byte[32];
        byteBuffer.get(arrby);
        return arrby;
    }

    public abstract d e(byte[] var1, int var2);
}

