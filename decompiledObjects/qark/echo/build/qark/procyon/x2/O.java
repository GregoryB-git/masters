// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package x2;

import android.util.Log;

public class O
{
    public static final O e;
    public final boolean a;
    public final String b;
    public final Throwable c;
    public final int d;
    
    static {
        e = new O(true, 3, 1, null, null);
    }
    
    public O(final boolean a, final int d, final int n, final String b, final Throwable c) {
        this.a = a;
        this.d = d;
        this.b = b;
        this.c = c;
    }
    
    public static O b() {
        return O.e;
    }
    
    public static O c(final String s) {
        return new O(false, 1, 5, s, null);
    }
    
    public static O d(final String s, final Throwable t) {
        return new O(false, 1, 5, s, t);
    }
    
    public static O f(final int n) {
        return new O(true, n, 1, null, null);
    }
    
    public static O g(final int n, final int n2, final String s, final Throwable t) {
        return new O(false, n, n2, s, t);
    }
    
    public String a() {
        return this.b;
    }
    
    public final void e() {
        if (!this.a && Log.isLoggable("GoogleCertificatesRslt", 3)) {
            if (this.c != null) {
                Log.d("GoogleCertificatesRslt", this.a(), this.c);
                return;
            }
            Log.d("GoogleCertificatesRslt", this.a());
        }
    }
}
