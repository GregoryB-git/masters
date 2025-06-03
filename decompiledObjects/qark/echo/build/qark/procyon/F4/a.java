// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package F4;

import java.util.Locale;

public class a
{
    public static volatile a c;
    public final c a;
    public boolean b;
    
    public a() {
        this(null);
    }
    
    public a(final c c) {
        this.b = false;
        c c2 = c;
        if (c == null) {
            c2 = F4.c.c();
        }
        this.a = c2;
    }
    
    public static a e() {
        while (true) {
            if (a.c == null) {
                // monitorenter(a.class)
                while (true) {
                    try {
                        if (a.c == null) {
                            a.c = new a();
                        }
                        // monitorexit(a.class)
                        return a.c;
                    }
                    // monitorexit(a.class)
                    finally {}
                    continue;
                }
            }
            continue;
        }
    }
    
    public void a(final String s) {
        if (this.b) {
            this.a.a(s);
        }
    }
    
    public void b(final String format, final Object... args) {
        if (this.b) {
            this.a.a(String.format(Locale.ENGLISH, format, args));
        }
    }
    
    public void c(final String s) {
        if (this.b) {
            this.a.b(s);
        }
    }
    
    public void d(final String format, final Object... args) {
        if (this.b) {
            this.a.b(String.format(Locale.ENGLISH, format, args));
        }
    }
    
    public void f(final String s) {
        if (this.b) {
            this.a.d(s);
        }
    }
    
    public void g(final String format, final Object... args) {
        if (this.b) {
            this.a.d(String.format(Locale.ENGLISH, format, args));
        }
    }
    
    public boolean h() {
        return this.b;
    }
    
    public void i(final boolean b) {
        this.b = b;
    }
    
    public void j(final String s) {
        if (this.b) {
            this.a.e(s);
        }
    }
    
    public void k(final String format, final Object... args) {
        if (this.b) {
            this.a.e(String.format(Locale.ENGLISH, format, args));
        }
    }
}
