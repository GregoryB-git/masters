// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package S;

import V5.o;
import Y5.b;
import V5.t;
import Z5.k;
import X5.d;
import g6.p;
import P.f;

public abstract class g
{
    public static final Object a(final f f, final p p3, final d d) {
        return f.a(new p() {
            public int o;
            public /* synthetic */ Object p;
            public final /* synthetic */ p q;
            
            public final Object a(final S.d d, final X5.d d2) {
                return ((g$a)this.create(d, d2)).invokeSuspend(t.a);
            }
            
            @Override
            public final X5.d create(final Object p2, final X5.d d) {
                final p p3 = new p() {
                    public int o;
                    public /* synthetic */ Object p;
                    public final /* synthetic */ p q = this.q;
                    
                    public final Object a(final S.d d, final X5.d d2) {
                        return ((g$a)this.create(d, d2)).invokeSuspend(t.a);
                    }
                };
                p3.p = p2;
                return p3;
            }
            
            @Override
            public final Object invokeSuspend(final Object o) {
                final Object c = b.c();
                final int o2 = this.o;
                if (o2 != 0) {
                    if (o2 == 1) {
                        final S.a a = (S.a)this.p;
                        o.b(o);
                        return a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                else {
                    o.b(o);
                    final S.a c2 = ((S.d)this.p).c();
                    final p q = this.q;
                    this.p = c2;
                    this.o = 1;
                    if (q.invoke(c2, this) == c) {
                        return c;
                    }
                    return c2;
                }
            }
        }, d);
    }
}
