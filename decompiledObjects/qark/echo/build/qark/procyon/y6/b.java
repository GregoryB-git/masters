// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package y6;

import X5.g;
import u6.C;
import p6.P0;
import p6.M;
import p6.m;
import Z5.h;
import p6.l;
import p6.o;
import u6.F;
import V5.t;
import g6.q;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public class b extends d implements y6.a
{
    public static final AtomicReferenceFieldUpdater i;
    public final q h;
    private volatile Object owner;
    
    static {
        i = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "owner");
    }
    
    public b(final boolean b) {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }
    
    public static final /* synthetic */ AtomicReferenceFieldUpdater m() {
        return b.i;
    }
    
    public static /* synthetic */ Object o(final b b, final Object o, final X5.d d) {
        if (b.q(o)) {
            return t.a;
        }
        final Object p3 = b.p(o, d);
        if (p3 == b.c()) {
            return p3;
        }
        return t.a;
    }
    
    @Override
    public Object a(final Object o, final X5.d d) {
        return o(this, o, d);
    }
    
    @Override
    public void b(final Object obj) {
        while (this.c()) {
            final AtomicReferenceFieldUpdater i = b.i;
            final F value = i.get(this);
            if (value != y6.c.c()) {
                if (value != obj && obj != null) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("This mutex is locked by ");
                    sb.append(value);
                    sb.append(", but ");
                    sb.append(obj);
                    sb.append(" is expected");
                    throw new IllegalStateException(sb.toString().toString());
                }
                if (u.b.a(i, this, value, y6.c.c())) {
                    this.i();
                    return;
                }
                continue;
            }
        }
        throw new IllegalStateException("This mutex is not locked".toString());
    }
    
    @Override
    public boolean c() {
        return this.h() == 0;
    }
    
    public boolean n(final Object o) {
        F value;
        boolean b;
        do {
            final boolean c = this.c();
            b = false;
            if (!c) {
                return false;
            }
            value = y6.b.i.get(this);
        } while (value == y6.c.c());
        if (value == o) {
            b = true;
        }
        return b;
    }
    
    public final Object p(Object w, final X5.d d) {
        final m b = o.b(Y5.b.b(d));
        try {
            this.d(new a(b, w));
            w = b.w();
            if (w == Y5.b.c()) {
                Z5.h.c(d);
            }
            if (w == Y5.b.c()) {
                return w;
            }
            return t.a;
        }
        finally {
            b.I();
        }
    }
    
    public boolean q(final Object obj) {
        final int r = this.r(obj);
        boolean b = true;
        if (r != 0) {
            if (r != 1) {
                if (r != 2) {
                    throw new IllegalStateException("unexpected".toString());
                }
                final StringBuilder sb = new StringBuilder();
                sb.append("This mutex is already locked by the specified owner: ");
                sb.append(obj);
                throw new IllegalStateException(sb.toString().toString());
            }
            else {
                b = false;
            }
        }
        return b;
    }
    
    public final int r(final Object o) {
        while (!this.j()) {
            if (o != null) {
                if (this.n(o)) {
                    return 2;
                }
                if (!this.c()) {
                    continue;
                }
            }
            return 1;
        }
        b.i.set(this, o);
        return 0;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Mutex@");
        sb.append(M.b(this));
        sb.append("[isLocked=");
        sb.append(this.c());
        sb.append(",owner=");
        sb.append(b.i.get(this));
        sb.append(']');
        return sb.toString();
    }
    
    public final class a implements l, P0
    {
        public final m o;
        public final Object p;
        public final /* synthetic */ b q;
        
        public a(final m o, final Object p3) {
            this.o = o;
            this.p = p3;
        }
        
        @Override
        public void a(final C c, final int n) {
            this.o.a(c, n);
        }
        
        public void b(final t t, final g6.l l) {
            b.m().set(b.this, this.p);
            this.o.j(t, new g6.l() {
                public final /* synthetic */ b o = a.this.q;
                public final /* synthetic */ a p;
                
                public final void a(final Throwable t) {
                    this.o.b(this.p.p);
                }
            });
        }
        
        public Object c(final t t, final Object o, final g6.l l) {
            final Object g = this.o.g(t, o, new g6.l() {
                public final /* synthetic */ b o = a.this.q;
                public final /* synthetic */ a p;
                
                public final void a(final Throwable t) {
                    b.m().set(this.o, this.p.p);
                    this.o.b(this.p.p);
                }
            });
            if (g != null) {
                b.m().set(b.this, this.p);
            }
            return g;
        }
        
        @Override
        public void d(final g6.l l) {
            this.o.d(l);
        }
        
        @Override
        public g getContext() {
            return this.o.getContext();
        }
        
        @Override
        public boolean o(final Throwable t) {
            return this.o.o(t);
        }
        
        @Override
        public void p(final Object o) {
            this.o.p(o);
        }
        
        @Override
        public void resumeWith(final Object o) {
            this.o.resumeWith(o);
        }
    }
}
