package g0;

import android.text.TextUtils;
import android.util.Log;
import java.net.UnknownHostException;

/* loaded from: classes.dex */
public abstract class o {

    /* renamed from: b, reason: collision with root package name */
    public static int f14321b = 0;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f14322c = true;

    /* renamed from: a, reason: collision with root package name */
    public static final Object f14320a = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static a f14323d = a.f14324a;

    public interface a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f14324a = new C0208a();

        /* renamed from: g0.o$a$a, reason: collision with other inner class name */
        public class C0208a implements a {
            @Override // g0.o.a
            public void a(String str, String str2, Throwable th) {
                Log.d(str, o.a(str2, th));
            }

            @Override // g0.o.a
            public void b(String str, String str2, Throwable th) {
                Log.w(str, o.a(str2, th));
            }

            @Override // g0.o.a
            public void c(String str, String str2, Throwable th) {
                Log.i(str, o.a(str2, th));
            }

            @Override // g0.o.a
            public void d(String str, String str2, Throwable th) {
                Log.e(str, o.a(str2, th));
            }
        }

        void a(String str, String str2, Throwable th);

        void b(String str, String str2, Throwable th);

        void c(String str, String str2, Throwable th);

        void d(String str, String str2, Throwable th);
    }

    public static String a(String str, Throwable th) {
        String e7 = e(th);
        if (TextUtils.isEmpty(e7)) {
            return str;
        }
        return str + "\n  " + e7.replace("\n", "\n  ") + '\n';
    }

    public static void b(String str, String str2) {
        synchronized (f14320a) {
            try {
                if (f14321b == 0) {
                    f14323d.a(str, str2, null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void c(String str, String str2) {
        synchronized (f14320a) {
            try {
                if (f14321b <= 3) {
                    f14323d.d(str, str2, null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void d(String str, String str2, Throwable th) {
        synchronized (f14320a) {
            try {
                if (f14321b <= 3) {
                    f14323d.d(str, str2, th);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static String e(Throwable th) {
        if (th == null) {
            return null;
        }
        synchronized (f14320a) {
            try {
                if (g(th)) {
                    return "UnknownHostException (no network)";
                }
                if (f14322c) {
                    return Log.getStackTraceString(th).trim().replace("\t", "    ");
                }
                return th.getMessage();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void f(String str, String str2) {
        synchronized (f14320a) {
            try {
                if (f14321b <= 1) {
                    f14323d.c(str, str2, null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static boolean g(Throwable th) {
        while (th != null) {
            if (th instanceof UnknownHostException) {
                return true;
            }
            th = th.getCause();
        }
        return false;
    }

    public static void h(String str, String str2) {
        synchronized (f14320a) {
            try {
                if (f14321b <= 2) {
                    f14323d.b(str, str2, null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void i(String str, String str2, Throwable th) {
        synchronized (f14320a) {
            try {
                if (f14321b <= 2) {
                    f14323d.b(str, str2, th);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
