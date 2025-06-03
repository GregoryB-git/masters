// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package e0;

import java.util.ArrayList;
import java.nio.ByteBuffer;
import java.util.List;
import X2.v;

public final class a
{
    public final v a;
    public final List b;
    public ByteBuffer[] c;
    public b.a d;
    public b.a e;
    public boolean f;
    
    public a(final v a) {
        this.a = a;
        this.b = new ArrayList();
        this.c = new ByteBuffer[0];
        final b.a e = e0.b.a.e;
        this.d = e;
        this.e = e;
        this.f = false;
    }
    
    public b.a a(b.a e) {
        if (!e.equals(e0.b.a.e)) {
            for (int i = 0; i < this.a.size(); ++i) {
                final b b = this.a.get(i);
                final Object g = b.g(e);
                if (b.a()) {
                    g0.a.f(((b.a)g).equals(e0.b.a.e) ^ true);
                    e = (b.a)g;
                }
            }
            return this.e = e;
        }
        throw new b.b(e);
    }
    
    public void b() {
        this.b.clear();
        this.d = this.e;
        final int n = 0;
        this.f = false;
        for (int i = 0; i < this.a.size(); ++i) {
            final b b = this.a.get(i);
            b.flush();
            if (b.a()) {
                this.b.add(b);
            }
        }
        this.c = new ByteBuffer[this.b.size()];
        for (int j = n; j <= this.c(); ++j) {
            this.c[j] = ((b)this.b.get(j)).d();
        }
    }
    
    public final int c() {
        return this.c.length - 1;
    }
    
    public ByteBuffer d() {
        if (!this.f()) {
            return e0.b.a;
        }
        final ByteBuffer byteBuffer = this.c[this.c()];
        if (byteBuffer.hasRemaining()) {
            return byteBuffer;
        }
        this.g(e0.b.a);
        return this.c[this.c()];
    }
    
    public boolean e() {
        return this.f && this.b.get(this.c()).c() && !this.c[this.c()].hasRemaining();
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof a)) {
            return false;
        }
        final a a = (a)o;
        if (this.a.size() != a.a.size()) {
            return false;
        }
        for (int i = 0; i < this.a.size(); ++i) {
            if (this.a.get(i) != a.a.get(i)) {
                return false;
            }
        }
        return true;
    }
    
    public boolean f() {
        return this.b.isEmpty() ^ true;
    }
    
    public final void g(final ByteBuffer byteBuffer) {
        boolean b;
        do {
            boolean b2;
            for (int i = (b = false) ? 1 : 0; i <= this.c(); ++i, b = b2) {
                if (this.c[i].hasRemaining()) {
                    b2 = b;
                }
                else {
                    final b b3 = this.b.get(i);
                    if (b3.c()) {
                        b2 = b;
                        if (!this.c[i].hasRemaining()) {
                            b2 = b;
                            if (i < this.c()) {
                                ((b)this.b.get(i + 1)).e();
                                b2 = b;
                            }
                        }
                    }
                    else {
                        ByteBuffer a;
                        if (i > 0) {
                            a = this.c[i - 1];
                        }
                        else if (byteBuffer.hasRemaining()) {
                            a = byteBuffer;
                        }
                        else {
                            a = e0.b.a;
                        }
                        final long n = a.remaining();
                        b3.f(a);
                        this.c[i] = b3.d();
                        b2 = (b | (n - a.remaining() > 0L || this.c[i].hasRemaining()));
                    }
                }
            }
        } while (b);
    }
    
    public void h() {
        if (this.f()) {
            if (this.f) {
                return;
            }
            this.f = true;
            this.b.get(0).e();
        }
    }
    
    @Override
    public int hashCode() {
        return this.a.hashCode();
    }
    
    public void i(final ByteBuffer byteBuffer) {
        if (this.f()) {
            if (this.f) {
                return;
            }
            this.g(byteBuffer);
        }
    }
    
    public void j() {
        for (int i = 0; i < this.a.size(); ++i) {
            final b b = this.a.get(i);
            b.flush();
            b.b();
        }
        this.c = new ByteBuffer[0];
        final b.a e = e0.b.a.e;
        this.d = e;
        this.e = e;
        this.f = false;
    }
}
