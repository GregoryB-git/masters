/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.nio.ByteBuffer
 *  java.nio.ByteOrder
 *  java.nio.IntBuffer
 *  java.security.GeneralSecurityException
 *  java.security.InvalidKeyException
 */
package e3;

import e3.a;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import q3.f;

public abstract class d {
    public int[] a;
    public final int b;

    public d(byte[] arrby, int n8) {
        if (arrby.length == 32) {
            this.a = a.e(arrby);
            this.b = n8;
            return;
        }
        throw new InvalidKeyException("The key length in bytes must be 32.");
    }

    public ByteBuffer a(byte[] arrby, int n8) {
        arrby = this.b(a.e(arrby), n8);
        ByteBuffer byteBuffer = (ByteBuffer)arrby.clone();
        a.d((int[])byteBuffer);
        for (n8 = 0; n8 < arrby.length; ++n8) {
            arrby[n8] = arrby[n8] + byteBuffer[n8];
        }
        byteBuffer = ByteBuffer.allocate((int)64).order(ByteOrder.LITTLE_ENDIAN);
        byteBuffer.asIntBuffer().put((int[])arrby, 0, 16);
        return byteBuffer;
    }

    public abstract int[] b(int[] var1, int var2);

    public byte[] c(byte[] arrby, ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2 = ByteBuffer.allocate((int)byteBuffer.remaining());
        this.f(arrby, byteBuffer2, byteBuffer);
        return byteBuffer2.array();
    }

    public void d(ByteBuffer byteBuffer, byte[] arrby, byte[] arrby2) {
        if (byteBuffer.remaining() >= arrby2.length) {
            this.f(arrby, byteBuffer, ByteBuffer.wrap((byte[])arrby2));
            return;
        }
        throw new IllegalArgumentException("Given ByteBuffer output is too small");
    }

    public abstract int e();

    public final void f(byte[] stringBuilder, ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        if (stringBuilder.length == this.e()) {
            int n8 = byteBuffer2.remaining();
            int n9 = n8 / 64;
            for (int i8 = 0; i8 < n9 + 1; ++i8) {
                ByteBuffer byteBuffer3 = this.a((byte[])stringBuilder, this.b + i8);
                int n10 = 64;
                if (i8 == n9) {
                    n10 = n8 % 64;
                }
                f.c(byteBuffer, byteBuffer2, byteBuffer3, n10);
            }
            return;
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append("The nonce length (in bytes) must be ");
        stringBuilder.append(this.e());
        throw new GeneralSecurityException(stringBuilder.toString());
    }
}

