package F4;

import android.util.Log;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public static c f1987a;

    public static synchronized c c() {
        c cVar;
        synchronized (c.class) {
            try {
                if (f1987a == null) {
                    f1987a = new c();
                }
                cVar = f1987a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return cVar;
    }

    public void a(String str) {
        Log.d("FirebasePerformance", str);
    }

    public void b(String str) {
        Log.e("FirebasePerformance", str);
    }

    public void d(String str) {
        Log.i("FirebasePerformance", str);
    }

    public void e(String str) {
        Log.w("FirebasePerformance", str);
    }
}
