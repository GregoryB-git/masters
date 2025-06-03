// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package s6;

import V5.t;
import t6.h;
import kotlin.jvm.internal.Intrinsics;
import p6.u0;
import X5.g;
import V5.o;
import p6.q0;
import X5.d;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import t6.b;

public final class l extends b implements j, b
{
    public static final AtomicReferenceFieldUpdater s;
    private volatile Object _state;
    public int r;
    
    static {
        s = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, "_state");
    }
    
    public l(final Object state) {
        this._state = state;
    }
    
    @Override
    public Object a(c c, d d) {
        Z5.d d2 = null;
        Label_0049: {
            if (d instanceof l$a) {
                d2 = (l$a)d;
                final int v = d2.v;
                if ((v & Integer.MIN_VALUE) != 0x0) {
                    d2.v = v + Integer.MIN_VALUE;
                    break Label_0049;
                }
            }
            d2 = new Z5.d(d) {
                public Object o;
                public Object p;
                public Object q;
                public Object r;
                public Object s;
                public /* synthetic */ Object t;
                public final /* synthetic */ l u;
                public int v;
                
                @Override
                public final Object invokeSuspend(final Object t) {
                    this.t = t;
                    this.v |= Integer.MIN_VALUE;
                    return this.u.a(null, this);
                }
            };
        }
        Object t = d2.t;
        final Object c2 = Y5.b.c();
        final int v2 = d2.v;
        while (true) {
            Object s2 = null;
            q0 r2 = null;
            c p2 = null;
            l o2 = null;
            Object o3 = null;
            n q2 = null;
            Label_0539: {
                Object q;
                Object o;
                c c3;
                if (v2 != 0) {
                    if (v2 != 1) {
                        if (v2 != 2) {
                            if (v2 == 3) {
                                final Object s = d2.s;
                                final q0 r = (q0)d2.r;
                                q = d2.q;
                                final c p = (c)d2.p;
                                o = d2.o;
                                c = (c)q;
                                d = (d)o;
                                Label_0703: {
                                    try {
                                        V5.o.b(t);
                                        t = d2;
                                        break Label_0340;
                                    }
                                    finally {
                                        break Label_0703;
                                    }
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ((b)d).e((t6.d)c);
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        s2 = d2.s;
                        r2 = (q0)d2.r;
                        final n n = (n)d2.q;
                        p2 = (c)d2.p;
                        o2 = (l)d2.o;
                        V5.o.b(t);
                        o3 = d2;
                        q2 = n;
                        break Label_0539;
                    }
                    else {
                        q = d2.q;
                        c3 = (c)d2.p;
                        o = d2.o;
                        V5.o.b(t);
                    }
                }
                else {
                    V5.o.b(t);
                    q = this.b();
                    o = this;
                    c3 = c;
                }
                final q0 q3 = (q0)d2.getContext().b((g.c)q0.n);
                final c p = c3;
                final q0 r = q3;
                final Object s = null;
                t = d2;
                final Object value = l.s.get(o);
                if (r != null) {
                    u0.e(r);
                }
                if (s != null) {
                    o3 = t;
                    r2 = r;
                    q2 = (n)q;
                    p2 = p;
                    o2 = (l)o;
                    s2 = s;
                    if (Intrinsics.a(s, value)) {
                        break Label_0539;
                    }
                }
                Object o4;
                if (value == h.a) {
                    o4 = null;
                }
                else {
                    o4 = value;
                }
                ((l$a)t).o = o;
                ((l$a)t).p = p;
                ((l$a)t).q = q;
                ((l$a)t).r = r;
                ((l$a)t).s = value;
                ((l$a)t).v = 2;
                if (p.emit(o4, (d)t) == c2) {
                    return c2;
                }
                s2 = value;
                o3 = t;
                r2 = r;
                q2 = (n)q;
                p2 = p;
                o2 = (l)o;
            }
            t = o3;
            q0 r = r2;
            Object q = q2;
            c p = p2;
            Object o = o2;
            Object s = s2;
            if (q2.h()) {
                continue;
            }
            ((l$a)o3).o = o2;
            ((l$a)o3).p = p2;
            ((l$a)o3).q = q2;
            ((l$a)o3).r = r2;
            ((l$a)o3).s = s2;
            ((l$a)o3).v = 3;
            final Object e = q2.e((d)o3);
            t = o3;
            r = r2;
            q = q2;
            p = p2;
            o = o2;
            s = s2;
            if (e == c2) {
                return c2;
            }
            continue;
        }
    }
    
    @Override
    public Object emit(final Object value, final d d) {
        this.setValue(value);
        return t.a;
    }
    
    public n g() {
        return new n();
    }
    
    @Override
    public Object getValue() {
        Object value;
        if ((value = l.s.get(this)) == h.a) {
            value = null;
        }
        return value;
    }
    
    public n[] h(final int n) {
        return new n[n];
    }
    
    public final boolean i(final Object o, final Object o2) {
        // monitorenter(this)
        // monitorexit(this)
        // monitorexit(this)
        Label_0201: {
            AtomicReferenceFieldUpdater s;
            Object value;
            try {
                s = l.s;
                value = s.get(this);
                if (o != null && !Intrinsics.a(value, o)) {
                    // monitorexit(this)
                    return false;
                }
            }
            finally {
                break Label_0201;
            }
            if (Intrinsics.a(value, o2)) {
                // monitorexit(this)
                return true;
            }
            s.set(this, o2);
            final int r = this.r;
            if ((r & 0x1) != 0x0) {
                this.r = r + 2;
                // monitorexit(this)
                return true;
            }
            int r2 = r + 1;
            this.r = r2;
            t6.d[] array = this.f();
            final t a = t.a;
            while (true) {
                final n[] array2 = (n[])array;
                if (array2 != null) {
                    for (int length = array2.length, i = 0; i < length; ++i) {
                        final n n = array2[i];
                        if (n != null) {
                            n.g();
                        }
                    }
                }
                // monitorenter(this)
                int i;
                try {
                    i = this.r;
                    if (i == r2) {
                        this.r = r2 + 1;
                        // monitorexit(this)
                        return true;
                    }
                }
                finally {
                    break;
                }
                array = this.f();
                final t a2 = t.a;
                // monitorexit(this)
                r2 = i;
            }
        }
    }
    // monitorexit(this)
    
    @Override
    public void setValue(final Object o) {
        Object a = o;
        if (o == null) {
            a = h.a;
        }
        this.i(null, a);
    }
}
