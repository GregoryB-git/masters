// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package E3;

import android.util.Log;

public class f
{
    public static final f c;
    public final String a;
    public int b;
    
    static {
        c = new f("FirebaseCrashlytics");
    }
    
    public f(final String a) {
        this.a = a;
        this.b = 4;
    }
    
    public static f f() {
        return f.c;
    }
    
    public final boolean a(final int n) {
        return this.b <= n || Log.isLoggable(this.a, n);
    }
    
    public void b(final String s) {
        this.c(s, null);
    }
    
    public void c(final String s, final Throwable t) {
        if (this.a(3)) {
            Log.d(this.a, s, t);
        }
    }
    
    public void d(final String s) {
        this.e(s, null);
    }
    
    public void e(final String s, final Throwable t) {
        if (this.a(6)) {
            Log.e(this.a, s, t);
        }
    }
    
    public void g(final String s) {
        this.h(s, null);
    }
    
    public void h(final String s, final Throwable t) {
        if (this.a(4)) {
            Log.i(this.a, s, t);
        }
    }
    
    public void i(final String s) {
        this.j(s, null);
    }
    
    public void j(final String s, final Throwable t) {
        if (this.a(2)) {
            Log.v(this.a, s, t);
        }
    }
    
    public void k(final String s) {
        this.l(s, null);
    }
    
    public void l(final String s, final Throwable t) {
        if (this.a(5)) {
            Log.w(this.a, s, t);
        }
    }
}
