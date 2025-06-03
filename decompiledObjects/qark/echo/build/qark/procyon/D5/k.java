// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package D5;

import t5.b;
import java.util.Locale;
import E5.i;
import E5.c;
import E5.r;
import E5.a;

public class k
{
    public b a;
    public b b;
    public boolean c;
    public final a d;
    
    public k(final a d) {
        this.a = null;
        this.b = null;
        this.c = true;
        this.d = d;
    }
    
    public k(final w5.a a) {
        this(new a(a, "flutter/lifecycle", r.b));
    }
    
    public void a() {
        this.g(this.a, true);
    }
    
    public void b() {
        this.g(k.b.o, this.c);
    }
    
    public void c() {
        this.g(k.b.q, this.c);
    }
    
    public void d() {
        this.g(k.b.s, this.c);
    }
    
    public void e() {
        this.g(k.b.p, this.c);
    }
    
    public void f() {
        this.g(this.a, false);
    }
    
    public final void g(final b a, final boolean b) {
        final b a2 = this.a;
        if (a2 == a && b == this.c) {
            return;
        }
        if (a == null && a2 == null) {
            this.c = b;
            return;
        }
        final int n = k$a.a[a.ordinal()];
        b b2;
        if (n != 1) {
            if (n != 2 && n != 3 && n != 4 && n != 5) {
                b2 = null;
            }
            else {
                b2 = a;
            }
        }
        else if (b) {
            b2 = k.b.p;
        }
        else {
            b2 = k.b.q;
        }
        this.a = a;
        this.c = b;
        if (b2 == this.b) {
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("AppLifecycleState.");
        sb.append(b2.name().toLowerCase(Locale.ROOT));
        final String string = sb.toString();
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("Sending ");
        sb2.append(string);
        sb2.append(" message.");
        b.f("LifecycleChannel", sb2.toString());
        this.d.c(string);
        this.b = b2;
    }
    
    public enum b
    {
        o("DETACHED", 0), 
        p("RESUMED", 1), 
        q("INACTIVE", 2), 
        r("HIDDEN", 3), 
        s("PAUSED", 4);
        
        static {
            t = c();
        }
        
        public b(final String name, final int ordinal) {
        }
        
        public static /* synthetic */ b[] c() {
            return new b[] { b.o, b.p, b.q, b.r, b.s };
        }
    }
}
