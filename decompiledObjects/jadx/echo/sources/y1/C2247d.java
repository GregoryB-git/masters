package y1;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.util.Log;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import x1.C2146B;

/* renamed from: y1.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2247d {

    /* renamed from: a, reason: collision with root package name */
    public static final C2247d f21354a = new C2247d();

    /* renamed from: b, reason: collision with root package name */
    public static final String f21355b = C2247d.class.getSimpleName();

    /* renamed from: c, reason: collision with root package name */
    public static final ReentrantReadWriteLock f21356c = new ReentrantReadWriteLock();

    /* renamed from: d, reason: collision with root package name */
    public static String f21357d;

    /* renamed from: e, reason: collision with root package name */
    public static volatile boolean f21358e;

    public static final String c() {
        if (!f21358e) {
            Log.w(f21355b, "initStore should have been called before calling setUserID");
            f21354a.d();
        }
        ReentrantReadWriteLock reentrantReadWriteLock = f21356c;
        reentrantReadWriteLock.readLock().lock();
        try {
            String str = f21357d;
            reentrantReadWriteLock.readLock().unlock();
            return str;
        } catch (Throwable th) {
            f21356c.readLock().unlock();
            throw th;
        }
    }

    public static final void e() {
        if (f21358e) {
            return;
        }
        C2237F.f21324b.b().execute(new Runnable() { // from class: y1.c
            @Override // java.lang.Runnable
            public final void run() {
                C2247d.f();
            }
        });
    }

    public static final void f() {
        f21354a.d();
    }

    public static final void g(final String str) {
        G1.g.b();
        if (!f21358e) {
            Log.w(f21355b, "initStore should have been called before calling setUserID");
            f21354a.d();
        }
        C2237F.f21324b.b().execute(new Runnable() { // from class: y1.b
            @Override // java.lang.Runnable
            public final void run() {
                C2247d.h(str);
            }
        });
    }

    public static final void h(String str) {
        ReentrantReadWriteLock reentrantReadWriteLock = f21356c;
        reentrantReadWriteLock.writeLock().lock();
        try {
            f21357d = str;
            SharedPreferences.Editor edit = PreferenceManager.getDefaultSharedPreferences(C2146B.l()).edit();
            edit.putString("com.facebook.appevents.AnalyticsUserIDStore.userID", f21357d);
            edit.apply();
            reentrantReadWriteLock.writeLock().unlock();
        } catch (Throwable th) {
            f21356c.writeLock().unlock();
            throw th;
        }
    }

    public final void d() {
        if (f21358e) {
            return;
        }
        ReentrantReadWriteLock reentrantReadWriteLock = f21356c;
        reentrantReadWriteLock.writeLock().lock();
        try {
            if (f21358e) {
                reentrantReadWriteLock.writeLock().unlock();
                return;
            }
            f21357d = PreferenceManager.getDefaultSharedPreferences(C2146B.l()).getString("com.facebook.appevents.AnalyticsUserIDStore.userID", null);
            f21358e = true;
            reentrantReadWriteLock.writeLock().unlock();
        } catch (Throwable th) {
            f21356c.writeLock().unlock();
            throw th;
        }
    }
}
