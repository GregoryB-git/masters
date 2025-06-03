// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package S;

import V5.o;
import V5.t;
import Z5.k;
import X5.d;
import g6.p;
import kotlin.jvm.internal.Intrinsics;
import P.f;

public final class b implements f
{
    public final f a;
    
    public b(final f a) {
        Intrinsics.checkNotNullParameter(a, "delegate");
        this.a = a;
    }
    
    @Override
    public Object a(final p p2, final d d) {
        return this.a.a(new p() {
            public int o;
            public /* synthetic */ Object p;
            public final /* synthetic */ p q;
            
            public final Object a(final S.d d, final X5.d d2) {
                return ((b$a)this.create(d, d2)).invokeSuspend(t.a);
            }
            
            @Override
            public final X5.d create(final Object p2, final X5.d d) {
                final p p3 = new p() {
                    public int o;
                    public /* synthetic */ Object p;
                    public final /* synthetic */ p q = this.q;
                    
                    public final Object a(final S.d d, final X5.d d2) {
                        return ((b$a)this.create(d, d2)).invokeSuspend(t.a);
                    }
                };
                p3.p = p2;
                return p3;
            }
            
            @Override
            public final Object invokeSuspend(Object invoke) {
                final Object c = Y5.b.c();
                final int o = this.o;
                if (o != 0) {
                    if (o != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    V5.o.b(invoke);
                }
                else {
                    V5.o.b(invoke);
                    final S.d d = (S.d)this.p;
                    final p q = this.q;
                    this.o = 1;
                    if ((invoke = q.invoke(d, this)) == c) {
                        return c;
                    }
                }
                final S.d d2 = (S.d)invoke;
                ((S.a)d2).f();
                return d2;
            }
        }, d);
    }
    
    @Override
    public s6.b b() {
        return this.a.b();
    }
}
