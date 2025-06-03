/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.nio.Buffer
 *  java.nio.ByteBuffer
 */
package m0;

import e0.b;
import e0.d;
import g0.a;
import java.nio.Buffer;
import java.nio.ByteBuffer;

public final class C
extends d {
    public int[] i;
    public int[] j;

    @Override
    public void f(ByteBuffer byteBuffer) {
        int n8;
        int[] arrn = (int[])a.e(this.j);
        int n9 = byteBuffer.limit();
        ByteBuffer byteBuffer2 = this.m((n9 - n8) / this.b.d * this.c.d);
        for (n8 = byteBuffer.position(); n8 < n9; n8 += this.b.d) {
            int n10 = arrn.length;
            for (int i8 = 0; i8 < n10; ++i8) {
                byteBuffer2.putShort(byteBuffer.getShort(arrn[i8] * 2 + n8));
            }
        }
        byteBuffer.position(n9);
        byteBuffer2.flip();
    }

    @Override
    public b.a i(b.a a8) {
        int[] arrn = this.i;
        if (arrn == null) {
            return b.a.e;
        }
        if (a8.c == 2) {
            int n8 = a8.b != arrn.length ? 1 : 0;
            for (int i8 = 0; i8 < arrn.length; ++i8) {
                int n9 = arrn[i8];
                if (n9 < a8.b) {
                    n9 = n9 != i8 ? 1 : 0;
                    n8 |= n9;
                    continue;
                }
                throw new b.b(a8);
            }
            if (n8 != 0) {
                return new b.a(a8.a, arrn.length, 2);
            }
            return b.a.e;
        }
        throw new b.b(a8);
    }

    @Override
    public void j() {
        this.j = this.i;
    }

    @Override
    public void l() {
        this.j = null;
        this.i = null;
    }

    public void n(int[] arrn) {
        this.i = arrn;
    }
}

