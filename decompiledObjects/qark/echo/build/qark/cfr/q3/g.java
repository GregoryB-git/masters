/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.nio.ByteBuffer
 *  java.security.GeneralSecurityException
 *  java.util.Arrays
 */
package q3;

import c3.a;
import e3.e;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import q3.p;

public final class g
implements a {
    public final e a;

    public g(byte[] arrby) {
        this.a = new e(arrby);
    }

    @Override
    public byte[] a(byte[] arrby, byte[] arrby2) {
        ByteBuffer byteBuffer = ByteBuffer.allocate((int)(arrby.length + 28));
        byte[] arrby3 = p.c(12);
        byteBuffer.put(arrby3);
        this.a.b(byteBuffer, arrby3, arrby, arrby2);
        return byteBuffer.array();
    }

    @Override
    public byte[] b(byte[] byteBuffer, byte[] arrby) {
        if (byteBuffer.length >= 28) {
            byte[] arrby2 = Arrays.copyOf((byte[])byteBuffer, (int)12);
            byteBuffer = ByteBuffer.wrap((byte[])byteBuffer, (int)12, (int)(byteBuffer.length - 12));
            return this.a.a(byteBuffer, arrby2, arrby);
        }
        throw new GeneralSecurityException("ciphertext too short");
    }
}

