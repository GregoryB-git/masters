/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.IndexOutOfBoundsException
 *  java.lang.NegativeArraySizeException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.nio.BufferUnderflowException
 *  java.nio.ByteBuffer
 *  java.security.GeneralSecurityException
 */
package d3;

import c3.a;
import c3.x;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import p3.A;

public final class E
implements a {
    public static final byte[] c = new byte[0];
    public final A a;
    public final a b;

    public E(A a8, a a9) {
        this.a = a8;
        this.b = a9;
    }

    @Override
    public byte[] a(byte[] arrby, byte[] arrby2) {
        byte[] arrby3 = x.j(this.a).f();
        return this.c(this.b.a(arrby3, c), ((a)x.f(this.a.a0(), arrby3, a.class)).a(arrby, arrby2));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public byte[] b(byte[] arrby, byte[] arrby2) {
        void var1_2;
        byte[] arrby3 = ByteBuffer.wrap((byte[])arrby);
        int n8 = arrby3.getInt();
        if (n8 <= 0) throw new GeneralSecurityException("invalid ciphertext");
        try {
            if (n8 > arrby.length - 4) throw new GeneralSecurityException("invalid ciphertext");
            byte[] arrby4 = new byte[n8];
            arrby3.get(arrby4, 0, n8);
            arrby = new byte[arrby3.remaining()];
            arrby3.get(arrby, 0, arrby3.remaining());
            arrby3 = this.b.b(arrby4, c);
            return ((a)x.f(this.a.a0(), arrby3, a.class)).b(arrby, arrby2);
        }
        catch (NegativeArraySizeException negativeArraySizeException) {
            throw new GeneralSecurityException("invalid ciphertext", (Throwable)var1_2);
        }
        catch (BufferUnderflowException bufferUnderflowException) {
            throw new GeneralSecurityException("invalid ciphertext", (Throwable)var1_2);
        }
        catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            throw new GeneralSecurityException("invalid ciphertext", (Throwable)var1_2);
        }
    }

    public final byte[] c(byte[] arrby, byte[] arrby2) {
        return ByteBuffer.allocate((int)(arrby.length + 4 + arrby2.length)).putInt(arrby.length).put(arrby).put(arrby2).array();
    }
}

