/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.util.Log
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 */
package x2;

import android.util.Log;
import x2.N;

public class O {
    public static final O e = new O(true, 3, 1, null, null);
    public final boolean a;
    public final String b;
    public final Throwable c;
    public final int d;

    public O(boolean bl, int n8, int n9, String string2, Throwable throwable) {
        this.a = bl;
        this.d = n8;
        this.b = string2;
        this.c = throwable;
    }

    public /* synthetic */ O(boolean bl, int n8, int n9, String string2, Throwable throwable, N n10) {
        this(false, 1, 5, null, null);
    }

    public static O b() {
        return e;
    }

    public static O c(String string2) {
        return new O(false, 1, 5, string2, null);
    }

    public static O d(String string2, Throwable throwable) {
        return new O(false, 1, 5, string2, throwable);
    }

    public static O f(int n8) {
        return new O(true, n8, 1, null, null);
    }

    public static O g(int n8, int n9, String string2, Throwable throwable) {
        return new O(false, n8, n9, string2, throwable);
    }

    public String a() {
        return this.b;
    }

    public final void e() {
        if (!this.a && Log.isLoggable((String)"GoogleCertificatesRslt", (int)3)) {
            if (this.c != null) {
                Log.d((String)"GoogleCertificatesRslt", (String)this.a(), (Throwable)this.c);
                return;
            }
            Log.d((String)"GoogleCertificatesRslt", (String)this.a());
        }
    }
}

