// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package V2;

import java.util.concurrent.ExecutionException;

public final class r implements q
{
    public final Object a;
    public final int b;
    public final K c;
    public int d;
    public int e;
    public int f;
    public Exception g;
    public boolean h;
    
    public r(final int b, final K c) {
        this.a = new Object();
        this.b = b;
        this.c = c;
    }
    
    private final void c() {
        if (this.d + this.e + this.f == this.b) {
            if (this.g != null) {
                final K c = this.c;
                final int e = this.e;
                final int b = this.b;
                final StringBuilder sb = new StringBuilder();
                sb.append(e);
                sb.append(" out of ");
                sb.append(b);
                sb.append(" underlying tasks failed");
                c.q(new ExecutionException(sb.toString(), this.g));
                return;
            }
            if (this.h) {
                this.c.s();
                return;
            }
            this.c.r(null);
        }
    }
    
    @Override
    public final void a(final Object o) {
        synchronized (this.a) {
            ++this.d;
            this.c();
        }
    }
    
    @Override
    public final void b() {
        synchronized (this.a) {
            ++this.f;
            this.h = true;
            this.c();
        }
    }
    
    @Override
    public final void d(final Exception g) {
        synchronized (this.a) {
            ++this.e;
            this.g = g;
            this.c();
        }
    }
}
