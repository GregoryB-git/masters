// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package y1;

import android.content.SharedPreferences$Editor;
import android.preference.PreferenceManager;
import x1.B;
import G1.g;
import android.util.Log;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public final class d
{
    public static final d a;
    public static final String b;
    public static final ReentrantReadWriteLock c;
    public static String d;
    public static volatile boolean e;
    
    static {
        a = new d();
        b = d.class.getSimpleName();
        c = new ReentrantReadWriteLock();
    }
    
    public static final String c() {
        if (!y1.d.e) {
            Log.w(y1.d.b, "initStore should have been called before calling setUserID");
            y1.d.a.d();
        }
        final ReentrantReadWriteLock c = y1.d.c;
        c.readLock().lock();
        try {
            final String d = y1.d.d;
            c.readLock().unlock();
            return d;
        }
        finally {
            y1.d.c.readLock().unlock();
        }
    }
    
    public static final void e() {
        if (y1.d.e) {
            return;
        }
        F.b.b().execute(new c());
    }
    
    public static final void f() {
        y1.d.a.d();
    }
    
    public static final void g(final String s) {
        g.b();
        if (!y1.d.e) {
            Log.w(y1.d.b, "initStore should have been called before calling setUserID");
            y1.d.a.d();
        }
        F.b.b().execute(new b(s));
    }
    
    public static final void h(final String d) {
        final ReentrantReadWriteLock c = d.c;
        c.writeLock().lock();
        try {
            d.d = d;
            final SharedPreferences$Editor edit = PreferenceManager.getDefaultSharedPreferences(B.l()).edit();
            edit.putString("com.facebook.appevents.AnalyticsUserIDStore.userID", d.d);
            edit.apply();
            c.writeLock().unlock();
        }
        finally {
            d.c.writeLock().unlock();
        }
    }
    
    public final void d() {
        if (y1.d.e) {
            return;
        }
        final ReentrantReadWriteLock c = y1.d.c;
        c.writeLock().lock();
        try {
            if (y1.d.e) {
                c.writeLock().unlock();
                return;
            }
            y1.d.d = PreferenceManager.getDefaultSharedPreferences(B.l()).getString("com.facebook.appevents.AnalyticsUserIDStore.userID", (String)null);
            y1.d.e = true;
            c.writeLock().unlock();
        }
        finally {
            y1.d.c.writeLock().unlock();
        }
    }
}
