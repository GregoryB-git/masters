// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package s6;

import V5.t;
import V5.o;
import t6.i;
import X5.d;

public abstract class a implements b
{
    @Override
    public final Object a(c o, final d d) {
        Z5.d d3 = null;
        Label_0051: {
            if (d instanceof a$a) {
                final Z5.d d2 = (a$a)d;
                final int r = d2.r;
                if ((r & Integer.MIN_VALUE) != 0x0) {
                    d2.r = r + Integer.MIN_VALUE;
                    d3 = d2;
                    break Label_0051;
                }
            }
            d3 = new Z5.d(d) {
                public Object o;
                public /* synthetic */ Object p;
                public final /* synthetic */ a q;
                public int r;
                
                @Override
                public final Object invokeSuspend(final Object p) {
                    this.p = p;
                    this.r |= Integer.MIN_VALUE;
                    return this.q.a(null, this);
                }
            };
        }
        final Object p2 = d3.p;
        final Object c = Y5.b.c();
        final int r2 = d3.r;
        Label_0152: {
            if (r2 != 0) {
                if (r2 == 1) {
                    o = (i)d3.o;
                    try {
                        o.b(p2);
                        break Label_0152;
                    }
                    finally {
                        break Label_0152;
                    }
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(p2);
            o = new i(o, d3.getContext());
            try {
                d3.o = o;
                d3.r = 1;
                if (this.b(o, d3) == c) {
                    return c;
                }
                ((i)o).releaseIntercepted();
                return t.a;
            }
            finally {}
        }
        ((i)o).releaseIntercepted();
        throw;
    }
    
    public abstract Object b(final c p0, final d p1);
}
