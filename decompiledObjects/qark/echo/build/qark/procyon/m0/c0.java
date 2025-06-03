// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package m0;

import java.nio.ByteOrder;
import g0.M;
import F0.K;
import g0.a;
import java.util.List;
import j0.i;
import e0.b;
import java.nio.ByteBuffer;

public final class c0
{
    public static final byte[] d;
    public static final byte[] e;
    public ByteBuffer a;
    public int b;
    public int c;
    
    static {
        d = new byte[] { 79, 103, 103, 83, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 28, -43, -59, -9, 1, 19, 79, 112, 117, 115, 72, 101, 97, 100, 1, 2, 56, 1, -128, -69, 0, 0, 0, 0, 0 };
        e = new byte[] { 79, 103, 103, 83, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 11, -103, 87, 83, 1, 16, 79, 112, 117, 115, 84, 97, 103, 115, 0, 0, 0, 0, 0, 0, 0, 0 };
    }
    
    public c0() {
        this.a = e0.b.a;
        this.c = 0;
        this.b = 2;
    }
    
    public void a(final i i, final List list) {
        g0.a.e(i.r);
        if (i.r.limit() - i.r.position() == 0) {
            return;
        }
        byte[] array;
        if (this.b == 2 && (list.size() == 1 || list.size() == 3)) {
            array = list.get(0);
        }
        else {
            array = null;
        }
        this.a = this.b(i.r, array);
        i.m();
        i.z(this.a.remaining());
        i.r.put(this.a);
        i.C();
    }
    
    public final ByteBuffer b(final ByteBuffer byteBuffer, byte[] e) {
        final int position = byteBuffer.position();
        final int limit = byteBuffer.limit();
        final int n = limit - position;
        final int n2 = (n + 255) / 255;
        int n3 = n2 + 27 + n;
        int n4;
        if (this.b == 2) {
            int length;
            if (e != null) {
                length = e.length + 28;
            }
            else {
                length = c0.d.length;
            }
            n3 += c0.e.length + length;
            n4 = length;
        }
        else {
            n4 = 0;
        }
        final ByteBuffer c = this.c(n3);
        if (this.b == 2) {
            if (e != null) {
                this.e(c, e);
            }
            else {
                c.put(c0.d);
            }
            c.put(c0.e);
        }
        final int c2 = this.c + K.j(byteBuffer);
        this.c = c2;
        this.f(c, c2, this.b, n2, false);
        int n5 = 0;
        int n6 = n;
        int i;
        while (true) {
            i = position;
            if (n5 >= n2) {
                break;
            }
            if (n6 >= 255) {
                c.put((byte)(-1));
                n6 -= 255;
            }
            else {
                c.put((byte)n6);
                n6 = 0;
            }
            ++n5;
        }
        while (i < limit) {
            c.put(byteBuffer.get(i));
            ++i;
        }
        byteBuffer.position(byteBuffer.limit());
        c.flip();
        final int b = this.b;
        final int n7 = 22;
        int n8;
        int n9;
        if (b == 2) {
            final byte[] array = c.array();
            final int arrayOffset = c.arrayOffset();
            e = c0.e;
            n8 = M.x(array, arrayOffset + n4 + e.length, c.limit() - c.position(), 0);
            n9 = n4 + e.length + 22;
        }
        else {
            n8 = M.x(c.array(), c.arrayOffset(), c.limit() - c.position(), 0);
            n9 = n7;
        }
        c.putInt(n9, n8);
        ++this.b;
        return c;
    }
    
    public final ByteBuffer c(final int capacity) {
        if (this.a.capacity() < capacity) {
            this.a = ByteBuffer.allocate(capacity).order(ByteOrder.LITTLE_ENDIAN);
        }
        else {
            this.a.clear();
        }
        return this.a;
    }
    
    public void d() {
        this.a = e0.b.a;
        this.c = 0;
        this.b = 2;
    }
    
    public final void e(final ByteBuffer byteBuffer, final byte[] src) {
        this.f(byteBuffer, 0L, 0, 1, true);
        byteBuffer.put(a3.i.a(src.length));
        byteBuffer.put(src);
        byteBuffer.putInt(22, M.x(byteBuffer.array(), byteBuffer.arrayOffset(), src.length + 28, 0));
        byteBuffer.position(src.length + 28);
    }
    
    public final void f(final ByteBuffer byteBuffer, final long n, final int n2, final int n3, final boolean b) {
        byteBuffer.put((byte)79);
        byteBuffer.put((byte)103);
        byteBuffer.put((byte)103);
        byteBuffer.put((byte)83);
        byteBuffer.put((byte)0);
        byte b2;
        if (b) {
            b2 = 2;
        }
        else {
            b2 = 0;
        }
        byteBuffer.put(b2);
        byteBuffer.putLong(n);
        byteBuffer.putInt(0);
        byteBuffer.putInt(n2);
        byteBuffer.putInt(0);
        byteBuffer.put(a3.i.a(n3));
    }
}
