// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package m0;

import e0.b;
import g0.a;
import java.nio.ByteBuffer;
import e0.d;

public final class C extends d
{
    public int[] i;
    public int[] j;
    
    @Override
    public void f(final ByteBuffer byteBuffer) {
        final int[] array = (int[])g0.a.e(this.j);
        int i = byteBuffer.position();
        final int limit = byteBuffer.limit();
        final ByteBuffer m = this.m((limit - i) / super.b.d * super.c.d);
        while (i < limit) {
            for (int length = array.length, j = 0; j < length; ++j) {
                m.putShort(byteBuffer.getShort(array[j] * 2 + i));
            }
            i += super.b.d;
        }
        byteBuffer.position(limit);
        m.flip();
    }
    
    @Override
    public a i(final a a) {
        final int[] i = this.i;
        if (i == null) {
            return e0.b.a.e;
        }
        if (a.c != 2) {
            throw new b.b(a);
        }
        boolean b = a.b != i.length;
        for (int j = 0; j < i.length; ++j) {
            final int n = i[j];
            if (n >= a.b) {
                throw new b.b(a);
            }
            b |= (n != j);
        }
        if (b) {
            return new a(a.a, i.length, 2);
        }
        return e0.b.a.e;
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
    
    public void n(final int[] i) {
        this.i = i;
    }
}
