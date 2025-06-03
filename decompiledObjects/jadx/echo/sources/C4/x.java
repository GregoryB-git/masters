package C4;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import s3.C1947e;

/* loaded from: classes.dex */
public class x {

    /* renamed from: c, reason: collision with root package name */
    public static final F4.a f1019c = F4.a.e();

    /* renamed from: d, reason: collision with root package name */
    public static x f1020d;

    /* renamed from: a, reason: collision with root package name */
    public volatile SharedPreferences f1021a;

    /* renamed from: b, reason: collision with root package name */
    public final ExecutorService f1022b;

    public x(ExecutorService executorService) {
        this.f1022b = executorService;
    }

    public static synchronized x f() {
        x xVar;
        synchronized (x.class) {
            try {
                if (f1020d == null) {
                    f1020d = new x(Executors.newSingleThreadExecutor());
                }
                xVar = f1020d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return xVar;
    }

    public void b(String str) {
        if (str == null) {
            f1019c.a("Key is null. Cannot clear nullable key");
        } else {
            this.f1021a.edit().remove(str).apply();
        }
    }

    public M4.g c(String str) {
        if (str == null) {
            f1019c.a("Key is null when getting boolean value on device cache.");
        } else {
            if (this.f1021a == null) {
                j(e());
                if (this.f1021a == null) {
                    return M4.g.a();
                }
            }
            if (!this.f1021a.contains(str)) {
                return M4.g.a();
            }
            try {
                return M4.g.e(Boolean.valueOf(this.f1021a.getBoolean(str, false)));
            } catch (ClassCastException e7) {
                f1019c.b("Key %s from sharedPreferences has type other than long: %s", str, e7.getMessage());
            }
        }
        return M4.g.a();
    }

    public M4.g d(String str) {
        if (str == null) {
            f1019c.a("Key is null when getting double value on device cache.");
        } else {
            if (this.f1021a == null) {
                j(e());
                if (this.f1021a == null) {
                    return M4.g.a();
                }
            }
            if (!this.f1021a.contains(str)) {
                return M4.g.a();
            }
            try {
                try {
                    return M4.g.e(Double.valueOf(Double.longBitsToDouble(this.f1021a.getLong(str, 0L))));
                } catch (ClassCastException e7) {
                    f1019c.b("Key %s from sharedPreferences has type other than double: %s", str, e7.getMessage());
                }
            } catch (ClassCastException unused) {
                return M4.g.e(Double.valueOf(Float.valueOf(this.f1021a.getFloat(str, 0.0f)).doubleValue()));
            }
        }
        return M4.g.a();
    }

    public final Context e() {
        try {
            C1947e.o();
            return C1947e.o().m();
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    public M4.g g(String str) {
        if (str == null) {
            f1019c.a("Key is null when getting long value on device cache.");
        } else {
            if (this.f1021a == null) {
                j(e());
                if (this.f1021a == null) {
                    return M4.g.a();
                }
            }
            if (!this.f1021a.contains(str)) {
                return M4.g.a();
            }
            try {
                return M4.g.e(Long.valueOf(this.f1021a.getLong(str, 0L)));
            } catch (ClassCastException e7) {
                f1019c.b("Key %s from sharedPreferences has type other than long: %s", str, e7.getMessage());
            }
        }
        return M4.g.a();
    }

    public M4.g h(String str) {
        if (str == null) {
            f1019c.a("Key is null when getting String value on device cache.");
        } else {
            if (this.f1021a == null) {
                j(e());
                if (this.f1021a == null) {
                    return M4.g.a();
                }
            }
            if (!this.f1021a.contains(str)) {
                return M4.g.a();
            }
            try {
                return M4.g.e(this.f1021a.getString(str, ""));
            } catch (ClassCastException e7) {
                f1019c.b("Key %s from sharedPreferences has type other than String: %s", str, e7.getMessage());
            }
        }
        return M4.g.a();
    }

    public final /* synthetic */ void i(Context context) {
        if (this.f1021a != null || context == null) {
            return;
        }
        this.f1021a = context.getSharedPreferences("FirebasePerfSharedPrefs", 0);
    }

    public synchronized void j(final Context context) {
        if (this.f1021a == null && context != null) {
            this.f1022b.execute(new Runnable() { // from class: C4.w
                @Override // java.lang.Runnable
                public final void run() {
                    x.this.i(context);
                }
            });
        }
    }

    public boolean k(String str, double d7) {
        if (str == null) {
            f1019c.a("Key is null when setting double value on device cache.");
            return false;
        }
        if (this.f1021a == null) {
            j(e());
            if (this.f1021a == null) {
                return false;
            }
        }
        this.f1021a.edit().putLong(str, Double.doubleToRawLongBits(d7)).apply();
        return true;
    }

    public boolean l(String str, long j7) {
        if (str == null) {
            f1019c.a("Key is null when setting long value on device cache.");
            return false;
        }
        if (this.f1021a == null) {
            j(e());
            if (this.f1021a == null) {
                return false;
            }
        }
        this.f1021a.edit().putLong(str, j7).apply();
        return true;
    }

    public boolean m(String str, String str2) {
        if (str == null) {
            f1019c.a("Key is null when setting String value on device cache.");
            return false;
        }
        if (this.f1021a == null) {
            j(e());
            if (this.f1021a == null) {
                return false;
            }
        }
        if (str2 == null) {
            this.f1021a.edit().remove(str).apply();
            return true;
        }
        this.f1021a.edit().putString(str, str2).apply();
        return true;
    }

    public boolean n(String str, boolean z7) {
        if (str == null) {
            f1019c.a("Key is null when setting boolean value on device cache.");
            return false;
        }
        if (this.f1021a == null) {
            j(e());
            if (this.f1021a == null) {
                return false;
            }
        }
        this.f1021a.edit().putBoolean(str, z7).apply();
        return true;
    }
}
