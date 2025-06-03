// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package kotlin.text;

import java.util.NoSuchElementException;
import V5.m;
import l6.d;
import h6.a;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import g6.p;
import n6.b;

public final class c implements b
{
    public final CharSequence a;
    public final int b;
    public final int c;
    public final p d;
    
    public c(final CharSequence a, final int b, final int c, final p d) {
        Intrinsics.checkNotNullParameter(a, "input");
        Intrinsics.checkNotNullParameter(d, "getNextMatch");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public static final /* synthetic */ p a(final c c) {
        return c.d;
    }
    
    public static final /* synthetic */ CharSequence b(final c c) {
        return c.a;
    }
    
    public static final /* synthetic */ int c(final c c) {
        return c.c;
    }
    
    public static final /* synthetic */ int d(final c c) {
        return c.b;
    }
    
    @Override
    public Iterator iterator() {
        return new Iterator() {
            public int o = -1;
            public int p;
            public int q;
            public l6.c r;
            public int s;
            public final /* synthetic */ c t;
            
            {
                final int d = l6.d.d(c.d(c.this), 0, c.b(c.this).length());
                this.p = d;
                this.q = d;
            }
            
            public final void b() {
                final int q = this.q;
                int n = 0;
                if (q < 0) {
                    this.o = 0;
                    this.r = null;
                    return;
                }
                final int c = kotlin.text.c.c(this.t);
                final int n2 = -1;
                int q2 = 0;
                Label_0109: {
                    l6.c r;
                    if ((c > 0 && ++this.s >= kotlin.text.c.c(this.t)) || this.q > kotlin.text.c.b(this.t).length()) {
                        r = new l6.c(this.p, kotlin.text.s.x(kotlin.text.c.b(this.t)));
                    }
                    else {
                        final m m = (m)kotlin.text.c.a(this.t).invoke(kotlin.text.c.b(this.t), this.q);
                        if (m != null) {
                            final int intValue = ((Number)m.a()).intValue();
                            final int intValue2 = ((Number)m.b()).intValue();
                            this.r = l6.d.g(this.p, intValue);
                            final int p = intValue + intValue2;
                            this.p = p;
                            if (intValue2 == 0) {
                                n = 1;
                            }
                            q2 = p + n;
                            break Label_0109;
                        }
                        r = new l6.c(this.p, kotlin.text.s.x(kotlin.text.c.b(this.t)));
                    }
                    this.r = r;
                    q2 = n2;
                }
                this.q = q2;
                this.o = 1;
            }
            
            public l6.c d() {
                if (this.o == -1) {
                    this.b();
                }
                if (this.o != 0) {
                    final l6.c r = this.r;
                    Intrinsics.c(r, "null cannot be cast to non-null type kotlin.ranges.IntRange");
                    this.r = null;
                    this.o = -1;
                    return r;
                }
                throw new NoSuchElementException();
            }
            
            @Override
            public boolean hasNext() {
                if (this.o == -1) {
                    this.b();
                }
                return this.o == 1;
            }
            
            @Override
            public void remove() {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }
        };
    }
}
