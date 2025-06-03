/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.util.Log
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 */
package E3;

import android.util.Log;

public class f {
    public static final f c = new f("FirebaseCrashlytics");
    public final String a;
    public int b;

    public f(String string2) {
        this.a = string2;
        this.b = 4;
    }

    public static f f() {
        return c;
    }

    public final boolean a(int n8) {
        if (this.b > n8 && !Log.isLoggable((String)this.a, (int)n8)) {
            return false;
        }
        return true;
    }

    public void b(String string2) {
        this.c(string2, null);
    }

    public void c(String string2, Throwable throwable) {
        if (this.a(3)) {
            Log.d((String)this.a, (String)string2, (Throwable)throwable);
        }
    }

    public void d(String string2) {
        this.e(string2, null);
    }

    public void e(String string2, Throwable throwable) {
        if (this.a(6)) {
            Log.e((String)this.a, (String)string2, (Throwable)throwable);
        }
    }

    public void g(String string2) {
        this.h(string2, null);
    }

    public void h(String string2, Throwable throwable) {
        if (this.a(4)) {
            Log.i((String)this.a, (String)string2, (Throwable)throwable);
        }
    }

    public void i(String string2) {
        this.j(string2, null);
    }

    public void j(String string2, Throwable throwable) {
        if (this.a(2)) {
            Log.v((String)this.a, (String)string2, (Throwable)throwable);
        }
    }

    public void k(String string2) {
        this.l(string2, null);
    }

    public void l(String string2, Throwable throwable) {
        if (this.a(5)) {
            Log.w((String)this.a, (String)string2, (Throwable)throwable);
        }
    }
}

