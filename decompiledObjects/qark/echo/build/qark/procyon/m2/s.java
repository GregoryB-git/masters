// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package m2;

import n2.c;
import java.util.concurrent.Executor;
import n2.d;
import g2.e;
import android.content.Context;
import U5.a;
import h2.b;

public final class s implements b
{
    public final a a;
    public final a b;
    public final a c;
    public final a d;
    public final a e;
    public final a f;
    public final a g;
    public final a h;
    public final a i;
    
    public s(final a a, final a b, final a c, final a d, final a e, final a f, final a g, final a h, final a i) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
    }
    
    public static s a(final a a, final a a2, final a a3, final a a4, final a a5, final a a6, final a a7, final a a8, final a a9) {
        return new s(a, a2, a3, a4, a5, a6, a7, a8, a9);
    }
    
    public static r c(final Context context, final e e, final d d, final x x, final Executor executor, final o2.b b, final p2.a a, final p2.a a2, final c c) {
        return new r(context, e, d, x, executor, b, a, a2, c);
    }
    
    public r b() {
        return c((Context)this.a.get(), (e)this.b.get(), (d)this.c.get(), (x)this.d.get(), (Executor)this.e.get(), (o2.b)this.f.get(), (p2.a)this.g.get(), (p2.a)this.h.get(), (c)this.i.get());
    }
}
