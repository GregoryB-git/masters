// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package s0;

import k0.Z0;
import g0.M;
import d0.z;
import d0.q;
import j0.h;
import java.nio.ByteBuffer;
import d0.A;
import java.io.IOException;
import android.graphics.BitmapFactory$Options;
import android.graphics.Bitmap;
import j0.j;
import j0.i;
import j0.k;

public final class a extends k implements s0.c
{
    public final b o;
    
    public a(final b o) {
        super(new i[1], new f[1]);
        this.o = o;
    }
    
    public static Bitmap B(final byte[] array, final int i) {
        try {
            return i0.c.a(array, i, null);
        }
        catch (IOException ex) {
            throw new d(ex);
        }
        catch (A a) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Could not decode image data with BitmapFactory. (data.length = ");
            sb.append(array.length);
            sb.append(", input length = ");
            sb.append(i);
            sb.append(")");
            throw new d(sb.toString(), a);
        }
    }
    
    public d A(final Throwable t) {
        return new d("Unexpected decode error", t);
    }
    
    public d C(final i i, final f f, final boolean b) {
        while (true) {
            while (true) {
                try {
                    final ByteBuffer byteBuffer = (ByteBuffer)g0.a.e(i.r);
                    g0.a.f(byteBuffer.hasArray());
                    if (byteBuffer.arrayOffset() == 0) {
                        final boolean b2 = true;
                        g0.a.a(b2);
                        f.s = this.o.a(byteBuffer.array(), byteBuffer.remaining());
                        f.p = i.t;
                        return null;
                    }
                }
                catch (d d) {
                    return d;
                }
                final boolean b2 = false;
                continue;
            }
        }
    }
    
    @Override
    public i i() {
        return new i(1);
    }
    
    public f z() {
        return new f() {
            @Override
            public void x() {
                j0.k.this.t(this);
            }
        };
    }
    
    public interface b
    {
        Bitmap a(final byte[] p0, final int p1);
    }
    
    public static final class c implements s0.c.a
    {
        public final b b;
        
        public c() {
            this.b = new s0.b();
        }
        
        @Override
        public int a(final q q) {
            final String n = q.n;
            if (n != null && z.p(n)) {
                int n2;
                if (M.y0(q.n)) {
                    n2 = 4;
                }
                else {
                    n2 = 1;
                }
                return Z0.a(n2);
            }
            return Z0.a(0);
        }
        
        public a d() {
            return new a(this.b, null);
        }
    }
}
