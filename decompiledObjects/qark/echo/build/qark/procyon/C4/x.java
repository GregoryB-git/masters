// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package C4;

import s3.e;
import M4.g;
import java.util.concurrent.Executors;
import android.content.Context;
import java.util.concurrent.ExecutorService;
import android.content.SharedPreferences;
import F4.a;

public class x
{
    public static final a c;
    public static x d;
    public volatile SharedPreferences a;
    public final ExecutorService b;
    
    static {
        c = a.e();
    }
    
    public x(final ExecutorService b) {
        this.b = b;
    }
    
    public static x f() {
        // monitorenter(x.class)
        while (true) {
            try {
                if (x.d == null) {
                    x.d = new x(Executors.newSingleThreadExecutor());
                }
                // monitorexit(x.class)
                return x.d;
                // monitorexit(x.class)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public void b(final String s) {
        if (s == null) {
            x.c.a("Key is null. Cannot clear nullable key");
            return;
        }
        this.a.edit().remove(s).apply();
    }
    
    public g c(final String s) {
        if (s == null) {
            x.c.a("Key is null when getting boolean value on device cache.");
        }
        else {
            if (this.a == null) {
                this.j(this.e());
                if (this.a == null) {
                    return g.a();
                }
            }
            if (!this.a.contains(s)) {
                return g.a();
            }
            try {
                return g.e(this.a.getBoolean(s, false));
            }
            catch (ClassCastException ex) {
                x.c.b("Key %s from sharedPreferences has type other than long: %s", s, ex.getMessage());
            }
        }
        return g.a();
    }
    
    public g d(final String s) {
        if (s == null) {
            x.c.a("Key is null when getting double value on device cache.");
        }
        else {
            if (this.a == null) {
                this.j(this.e());
                if (this.a == null) {
                    return g.a();
                }
            }
            if (!this.a.contains(s)) {
                return g.a();
            }
            while (true) {
                try {
                    return g.e(Double.longBitsToDouble(this.a.getLong(s, 0L)));
                    try {
                        return g.e((double)this.a.getFloat(s, 0.0f));
                    }
                    catch (ClassCastException ex) {
                        x.c.b("Key %s from sharedPreferences has type other than double: %s", s, ex.getMessage());
                    }
                }
                catch (ClassCastException ex2) {
                    continue;
                }
                break;
            }
        }
        return g.a();
    }
    
    public final Context e() {
        try {
            e.o();
            return e.o().m();
        }
        catch (IllegalStateException ex) {
            return null;
        }
    }
    
    public g g(final String s) {
        if (s == null) {
            x.c.a("Key is null when getting long value on device cache.");
        }
        else {
            if (this.a == null) {
                this.j(this.e());
                if (this.a == null) {
                    return g.a();
                }
            }
            if (!this.a.contains(s)) {
                return g.a();
            }
            try {
                return g.e(this.a.getLong(s, 0L));
            }
            catch (ClassCastException ex) {
                x.c.b("Key %s from sharedPreferences has type other than long: %s", s, ex.getMessage());
            }
        }
        return g.a();
    }
    
    public g h(final String s) {
        if (s == null) {
            x.c.a("Key is null when getting String value on device cache.");
        }
        else {
            if (this.a == null) {
                this.j(this.e());
                if (this.a == null) {
                    return g.a();
                }
            }
            if (!this.a.contains(s)) {
                return g.a();
            }
            try {
                return g.e(this.a.getString(s, ""));
            }
            catch (ClassCastException ex) {
                x.c.b("Key %s from sharedPreferences has type other than String: %s", s, ex.getMessage());
            }
        }
        return g.a();
    }
    
    public void j(final Context context) {
        // monitorenter(this)
        // monitorexit(this)
        Label_0041: {
            try {
                if (this.a == null && context != null) {
                    this.b.execute(new w(this, context));
                }
            }
            finally {
                break Label_0041;
            }
            return;
        }
    }
    // monitorexit(this)
    
    public boolean k(final String s, final double n) {
        if (s == null) {
            x.c.a("Key is null when setting double value on device cache.");
            return false;
        }
        if (this.a == null) {
            this.j(this.e());
            if (this.a == null) {
                return false;
            }
        }
        this.a.edit().putLong(s, Double.doubleToRawLongBits(n)).apply();
        return true;
    }
    
    public boolean l(final String s, final long n) {
        if (s == null) {
            x.c.a("Key is null when setting long value on device cache.");
            return false;
        }
        if (this.a == null) {
            this.j(this.e());
            if (this.a == null) {
                return false;
            }
        }
        this.a.edit().putLong(s, n).apply();
        return true;
    }
    
    public boolean m(final String s, final String s2) {
        if (s == null) {
            x.c.a("Key is null when setting String value on device cache.");
            return false;
        }
        if (this.a == null) {
            this.j(this.e());
            if (this.a == null) {
                return false;
            }
        }
        if (s2 == null) {
            this.a.edit().remove(s).apply();
            return true;
        }
        this.a.edit().putString(s, s2).apply();
        return true;
    }
    
    public boolean n(final String s, final boolean b) {
        if (s == null) {
            x.c.a("Key is null when setting boolean value on device cache.");
            return false;
        }
        if (this.a == null) {
            this.j(this.e());
            if (this.a == null) {
                return false;
            }
        }
        this.a.edit().putBoolean(s, b).apply();
        return true;
    }
}
