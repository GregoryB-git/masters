/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.nio.Buffer
 *  java.nio.ByteBuffer
 *  java.nio.ByteOrder
 *  java.util.List
 */
package m0;

import F0.K;
import e0.b;
import g0.M;
import g0.a;
import j0.i;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;

public final class c0 {
    public static final byte[] d = new byte[]{79, 103, 103, 83, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 28, -43, -59, -9, 1, 19, 79, 112, 117, 115, 72, 101, 97, 100, 1, 2, 56, 1, -128, -69, 0, 0, 0, 0, 0};
    public static final byte[] e = new byte[]{79, 103, 103, 83, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 11, -103, 87, 83, 1, 16, 79, 112, 117, 115, 84, 97, 103, 115, 0, 0, 0, 0, 0, 0, 0, 0};
    public ByteBuffer a = b.a;
    public int b = 2;
    public int c = 0;

    public void a(i i8, List arrby) {
        a.e((Object)i8.r);
        if (i8.r.limit() - i8.r.position() == 0) {
            return;
        }
        arrby = this.b == 2 && (arrby.size() == 1 || arrby.size() == 3) ? (byte[])arrby.get(0) : null;
        this.a = this.b(i8.r, arrby);
        i8.m();
        i8.z(this.a.remaining());
        i8.r.put(this.a);
        i8.C();
    }

    /*
     * Enabled aggressive block sorting
     */
    public final ByteBuffer b(ByteBuffer arrby, byte[] arrby2) {
        int n8;
        int n9;
        int n10 = arrby.position();
        int n11 = arrby.limit();
        int n12 = n11 - n10;
        int n13 = (n12 + 255) / 255;
        int n14 = n13 + 27 + n12;
        if (this.b == 2) {
            n8 = arrby2 != null ? arrby2.length + 28 : d.length;
            n14 += e.length + n8;
            n9 = n8;
        } else {
            n9 = 0;
        }
        ByteBuffer byteBuffer = this.c(n14);
        if (this.b == 2) {
            if (arrby2 != null) {
                this.e(byteBuffer, arrby2);
            } else {
                byteBuffer.put(d);
            }
            byteBuffer.put(e);
        }
        n8 = K.j((ByteBuffer)arrby);
        this.c = n8 = this.c + n8;
        this.f(byteBuffer, n8, this.b, n13, false);
        n14 = 0;
        n8 = n12;
        do {
            if (n14 >= n13) break;
            if (n8 >= 255) {
                byteBuffer.put((byte)-1);
                n8 -= 255;
            } else {
                byteBuffer.put((byte)n8);
                n8 = 0;
            }
            ++n14;
        } while (true);
        for (n12 = n10; n12 < n11; ++n12) {
            byteBuffer.put(arrby.get(n12));
        }
        arrby.position(arrby.limit());
        byteBuffer.flip();
        n8 = this.b;
        n14 = 22;
        if (n8 == 2) {
            arrby = byteBuffer.array();
            n8 = byteBuffer.arrayOffset();
            arrby2 = e;
            n8 = M.x(arrby, n8 + n9 + arrby2.length, byteBuffer.limit() - byteBuffer.position(), 0);
            n9 = n9 + arrby2.length + 22;
        } else {
            n8 = M.x(byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.limit() - byteBuffer.position(), 0);
            n9 = n14;
        }
        byteBuffer.putInt(n9, n8);
        ++this.b;
        return byteBuffer;
    }

    public final ByteBuffer c(int n8) {
        if (this.a.capacity() < n8) {
            this.a = ByteBuffer.allocate((int)n8).order(ByteOrder.LITTLE_ENDIAN);
        } else {
            this.a.clear();
        }
        return this.a;
    }

    public void d() {
        this.a = b.a;
        this.c = 0;
        this.b = 2;
    }

    public final void e(ByteBuffer byteBuffer, byte[] arrby) {
        this.f(byteBuffer, 0L, 0, 1, true);
        byteBuffer.put(a3.i.a(arrby.length));
        byteBuffer.put(arrby);
        byteBuffer.putInt(22, M.x(byteBuffer.array(), byteBuffer.arrayOffset(), arrby.length + 28, 0));
        byteBuffer.position(arrby.length + 28);
    }

    public final void f(ByteBuffer byteBuffer, long l8, int n8, int n9, boolean bl) {
        byteBuffer.put((byte)79);
        byteBuffer.put((byte)103);
        byteBuffer.put((byte)103);
        byteBuffer.put((byte)83);
        byteBuffer.put((byte)0);
        byte by = bl ? 2 : 0;
        byteBuffer.put(by);
        byteBuffer.putLong(l8);
        byteBuffer.putInt(0);
        byteBuffer.putInt(n8);
        byteBuffer.putInt(0);
        byteBuffer.put(a3.i.a(n9));
    }
}

