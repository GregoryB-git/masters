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
import c3.t;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import q3.f;
import q3.l;

public final class h
implements a {
    public final l a;
    public final t b;
    public final int c;

    public h(l l8, t t8, int n8) {
        this.a = l8;
        this.b = t8;
        this.c = n8;
    }

    @Override
    public byte[] a(byte[] arrby, byte[] arrby2) {
        byte[] arrby3 = this.a.a(arrby);
        arrby = arrby2;
        if (arrby2 == null) {
            arrby = new byte[]{};
        }
        arrby2 = Arrays.copyOf((byte[])ByteBuffer.allocate((int)8).putLong((long)arrby.length * 8L).array(), (int)8);
        return f.a(arrby3, this.b.b(f.a(arrby, arrby3, arrby2)));
    }

    @Override
    public byte[] b(byte[] arrby, byte[] arrby2) {
        int n8 = arrby.length;
        int n9 = this.c;
        if (n8 >= n9) {
            byte[] arrby3 = Arrays.copyOfRange((byte[])arrby, (int)0, (int)(arrby.length - n9));
            byte[] arrby4 = Arrays.copyOfRange((byte[])arrby, (int)(arrby.length - this.c), (int)arrby.length);
            arrby = arrby2;
            if (arrby2 == null) {
                arrby = new byte[]{};
            }
            arrby2 = Arrays.copyOf((byte[])ByteBuffer.allocate((int)8).putLong((long)arrby.length * 8L).array(), (int)8);
            this.b.a(arrby4, f.a(arrby, arrby3, arrby2));
            return this.a.b(arrby3);
        }
        throw new GeneralSecurityException("ciphertext too short");
    }
}

