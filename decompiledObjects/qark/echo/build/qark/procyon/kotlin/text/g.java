// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package kotlin.text;

import java.util.regex.MatchResult;
import g6.l;
import java.util.Collection;
import W5.m;
import java.util.Iterator;
import l6.c;
import W5.a;
import kotlin.jvm.internal.Intrinsics;
import java.util.regex.Matcher;

public final class g implements f
{
    public final Matcher a;
    public final CharSequence b;
    public final e c;
    
    public g(final Matcher a, final CharSequence b) {
        Intrinsics.checkNotNullParameter(a, "matcher");
        Intrinsics.checkNotNullParameter(b, "input");
        this.a = a;
        this.b = b;
        this.c = new e() {
            @Override
            public int a() {
                return g.this.c().groupCount() + 1;
            }
            
            @Override
            public final /* bridge */ boolean contains(final Object o) {
                if (o != null) {
                    if (!(o instanceof d)) {
                        return false;
                    }
                }
                return this.d((d)o);
            }
            
            public /* bridge */ boolean d(final d d) {
                return super.contains(d);
            }
            
            @Override
            public d get(final int n) {
                final c b = h.b(g.this.c(), n);
                if (b.q() >= 0) {
                    final String group = g.this.c().group(n);
                    Intrinsics.checkNotNullExpressionValue(group, "group(...)");
                    return new d(group, b);
                }
                return null;
            }
            
            @Override
            public boolean isEmpty() {
                return false;
            }
            
            @Override
            public Iterator iterator() {
                return n6.c.d(m.n(m.g(this)), new l() {
                    public final /* synthetic */ g$a o;
                    
                    public final d a(final int n) {
                        return this.o.get(n);
                    }
                }).iterator();
            }
        };
    }
    
    @Override
    public e a() {
        return this.c;
    }
    
    public final MatchResult c() {
        return this.a;
    }
}
