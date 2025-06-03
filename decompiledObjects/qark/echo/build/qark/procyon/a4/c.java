// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package a4;

import d4.n;
import d4.b;
import d4.i;

public class c
{
    public final e.a a;
    public final i b;
    public final i c;
    public final b d;
    public final b e;
    
    public c(final e.a a, final i b, final b d, final b e, final i c) {
        this.a = a;
        this.b = b;
        this.d = d;
        this.e = e;
        this.c = c;
    }
    
    public static c b(final b b, final i i) {
        return new c(e.a.p, i, b, null, null);
    }
    
    public static c c(final b b, final n n) {
        return b(b, i.d(n));
    }
    
    public static c d(final b b, final i i, final i j) {
        return new c(e.a.r, i, b, null, j);
    }
    
    public static c e(final b b, final n n, final n n2) {
        return d(b, i.d(n), i.d(n2));
    }
    
    public static c f(final b b, final i i) {
        return new c(e.a.q, i, b, null, null);
    }
    
    public static c g(final b b, final i i) {
        return new c(e.a.o, i, b, null, null);
    }
    
    public static c h(final b b, final n n) {
        return g(b, i.d(n));
    }
    
    public static c n(final i i) {
        return new c(e.a.s, i, null, null, null);
    }
    
    public c a(final b b) {
        return new c(this.a, this.b, this.d, b, this.c);
    }
    
    public b i() {
        return this.d;
    }
    
    public e.a j() {
        return this.a;
    }
    
    public i k() {
        return this.b;
    }
    
    public i l() {
        return this.c;
    }
    
    public b m() {
        return this.e;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Change: ");
        sb.append(this.a);
        sb.append(" ");
        sb.append(this.d);
        return sb.toString();
    }
}
