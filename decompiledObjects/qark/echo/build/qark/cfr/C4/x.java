/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 *  java.lang.ClassCastException
 *  java.lang.Double
 *  java.lang.Float
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.concurrent.ExecutorService
 *  java.util.concurrent.Executors
 */
package C4;

import C4.w;
import F4.a;
import M4.g;
import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import s3.e;

public class x {
    public static final a c = a.e();
    public static x d;
    public volatile SharedPreferences a;
    public final ExecutorService b;

    public x(ExecutorService executorService) {
        this.b = executorService;
    }

    public static /* synthetic */ void a(x x8, Context context) {
        x8.i(context);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static x f() {
        synchronized (x.class) {
            try {
                if (d != null) return d;
                d = new x(Executors.newSingleThreadExecutor());
                return d;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public void b(String string2) {
        if (string2 == null) {
            c.a("Key is null. Cannot clear nullable key");
            return;
        }
        this.a.edit().remove(string2).apply();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public g c(String string2) {
        if (string2 == null) {
            c.a("Key is null when getting boolean value on device cache.");
            do {
                return g.a();
                break;
            } while (true);
        }
        if (this.a == null) {
            this.j(this.e());
            if (this.a == null) {
                return g.a();
            }
        }
        if (!this.a.contains(string2)) {
            return g.a();
        }
        try {
            return g.e(this.a.getBoolean(string2, false));
        }
        catch (ClassCastException classCastException) {
            c.b("Key %s from sharedPreferences has type other than long: %s", string2, classCastException.getMessage());
            return g.a();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public g d(String string2) {
        if (string2 == null) {
            c.a("Key is null when getting double value on device cache.");
            return g.a();
        }
        if (this.a == null) {
            this.j(this.e());
            if (this.a == null) {
                return g.a();
            }
        }
        if (!this.a.contains(string2)) {
            return g.a();
        }
        try {
            return g.e(Double.longBitsToDouble((long)this.a.getLong(string2, 0L)));
        }
        catch (ClassCastException classCastException) {}
        try {
            return g.e(Float.valueOf((float)this.a.getFloat(string2, 0.0f)).doubleValue());
        }
        catch (ClassCastException classCastException) {
            c.b("Key %s from sharedPreferences has type other than double: %s", string2, classCastException.getMessage());
            return g.a();
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final Context e() {
        try {
            e.o();
        }
        catch (IllegalStateException illegalStateException) {
            return null;
        }
        return e.o().m();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public g g(String string2) {
        if (string2 == null) {
            c.a("Key is null when getting long value on device cache.");
            do {
                return g.a();
                break;
            } while (true);
        }
        if (this.a == null) {
            this.j(this.e());
            if (this.a == null) {
                return g.a();
            }
        }
        if (!this.a.contains(string2)) {
            return g.a();
        }
        try {
            return g.e(this.a.getLong(string2, 0L));
        }
        catch (ClassCastException classCastException) {
            c.b("Key %s from sharedPreferences has type other than long: %s", string2, classCastException.getMessage());
            return g.a();
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public g h(String string2) {
        if (string2 == null) {
            c.a("Key is null when getting String value on device cache.");
            do {
                return g.a();
                break;
            } while (true);
        }
        if (this.a == null) {
            this.j(this.e());
            if (this.a == null) {
                return g.a();
            }
        }
        if (!this.a.contains(string2)) {
            return g.a();
        }
        try {
            return g.e(this.a.getString(string2, ""));
        }
        catch (ClassCastException classCastException) {
            c.b("Key %s from sharedPreferences has type other than String: %s", string2, classCastException.getMessage());
            return g.a();
        }
    }

    public final /* synthetic */ void i(Context context) {
        if (this.a == null && context != null) {
            this.a = context.getSharedPreferences("FirebasePerfSharedPrefs", 0);
        }
    }

    public void j(Context context) {
        synchronized (this) {
            Throwable throwable2;
            block5 : {
                block4 : {
                    try {
                        if (this.a != null || context == null) break block4;
                    }
                    catch (Throwable throwable2) {
                        break block5;
                    }
                    this.b.execute((Runnable)new w(this, context));
                }
                return;
            }
            throw throwable2;
        }
    }

    public boolean k(String string2, double d8) {
        if (string2 == null) {
            c.a("Key is null when setting double value on device cache.");
            return false;
        }
        if (this.a == null) {
            this.j(this.e());
            if (this.a == null) {
                return false;
            }
        }
        this.a.edit().putLong(string2, Double.doubleToRawLongBits((double)d8)).apply();
        return true;
    }

    public boolean l(String string2, long l8) {
        if (string2 == null) {
            c.a("Key is null when setting long value on device cache.");
            return false;
        }
        if (this.a == null) {
            this.j(this.e());
            if (this.a == null) {
                return false;
            }
        }
        this.a.edit().putLong(string2, l8).apply();
        return true;
    }

    public boolean m(String string2, String string3) {
        if (string2 == null) {
            c.a("Key is null when setting String value on device cache.");
            return false;
        }
        if (this.a == null) {
            this.j(this.e());
            if (this.a == null) {
                return false;
            }
        }
        if (string3 == null) {
            this.a.edit().remove(string2).apply();
            return true;
        }
        this.a.edit().putString(string2, string3).apply();
        return true;
    }

    public boolean n(String string2, boolean bl) {
        if (string2 == null) {
            c.a("Key is null when setting boolean value on device cache.");
            return false;
        }
        if (this.a == null) {
            this.j(this.e());
            if (this.a == null) {
                return false;
            }
        }
        this.a.edit().putBoolean(string2, bl).apply();
        return true;
    }
}

