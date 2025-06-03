// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package P;

import p6.K;
import p6.J;
import V5.o;
import Y5.b;
import r6.k;
import V5.t;
import X5.g;
import p6.q0;
import r6.a;
import r6.f;
import kotlin.jvm.internal.Intrinsics;
import java.util.concurrent.atomic.AtomicInteger;
import r6.d;
import g6.p;
import p6.I;

public final class l
{
    public final I a;
    public final p b;
    public final d c;
    public final AtomicInteger d;
    
    public l(final I a, final g6.l l, final p p4, final p b) {
        Intrinsics.checkNotNullParameter(a, "scope");
        Intrinsics.checkNotNullParameter(l, "onComplete");
        Intrinsics.checkNotNullParameter(p4, "onUndeliveredElement");
        Intrinsics.checkNotNullParameter(b, "consumeMessage");
        this.a = a;
        this.b = b;
        this.c = f.b(Integer.MAX_VALUE, null, null, 6, null);
        this.d = new AtomicInteger(0);
        final q0 q0 = (q0)a.f().b((g.c)p6.q0.n);
        if (q0 == null) {
            return;
        }
        q0.e(new g6.l() {
            public final /* synthetic */ l p;
            
            public final void a(final Throwable t) {
                l.invoke(t);
                l.b(this.p).b(t);
                t a;
                do {
                    final Object d = r6.g.d(l.b(this.p).c());
                    if (d == null) {
                        a = null;
                    }
                    else {
                        p4.invoke(d, t);
                        a = t.a;
                    }
                } while (a != null);
            }
        });
    }
    
    public static final /* synthetic */ p a(final l l) {
        return l.b;
    }
    
    public static final /* synthetic */ d b(final l l) {
        return l.c;
    }
    
    public static final /* synthetic */ AtomicInteger c(final l l) {
        return l.d;
    }
    
    public static final /* synthetic */ I d(final l l) {
        return l.a;
    }
    
    public final void e(Object d) {
        d = this.c.d(d);
        if (d instanceof r6.g.a) {
            Throwable c;
            if ((c = r6.g.c(d)) == null) {
                c = new k("Channel was closed normally");
            }
            throw c;
        }
        if (r6.g.f(d)) {
            if (this.d.getAndIncrement() == 0) {
                p6.g.d(this.a, null, null, new p() {
                    public Object o;
                    public int p;
                    public final /* synthetic */ l q;
                    
                    @Override
                    public final X5.d create(final Object o, final X5.d d) {
                        return new p() {
                            public Object o;
                            public int p;
                            public final /* synthetic */ l q = this.q;
                        };
                    }
                    
                    public final Object invoke(final I i, final X5.d d) {
                        return ((l$b)this.create(i, d)).invokeSuspend(t.a);
                    }
                    
                    @Override
                    public final Object invokeSuspend(Object a) {
                        final Object c = Y5.b.c();
                        final int p = this.p;
                        while (true) {
                            Label_0168: {
                                p a2 = null;
                                Label_0142: {
                                    if (p != 0) {
                                        if (p == 1) {
                                            a2 = (p)this.o;
                                            V5.o.b(a);
                                            break Label_0142;
                                        }
                                        if (p == 2) {
                                            V5.o.b(a);
                                            break Label_0168;
                                        }
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    else {
                                        V5.o.b(a);
                                        if (l.c(this.q).get() <= 0) {
                                            throw new IllegalStateException("Check failed.".toString());
                                        }
                                    }
                                    J.b(l.d(this.q));
                                    a2 = l.a(this.q);
                                    final r6.d b = l.b(this.q);
                                    this.o = a2;
                                    this.p = 1;
                                    if ((a = b.a(this)) == c) {
                                        return c;
                                    }
                                }
                                this.o = null;
                                this.p = 2;
                                if (a2.invoke(a, this) == c) {
                                    return c;
                                }
                            }
                            if (l.c(this.q).decrementAndGet() == 0) {
                                return t.a;
                            }
                            continue;
                        }
                    }
                }, 3, null);
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }
}
