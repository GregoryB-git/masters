/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 *  android.preference.PreferenceManager
 *  android.util.Log
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.concurrent.Executor
 *  java.util.concurrent.locks.ReentrantReadWriteLock
 *  java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock
 *  java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock
 */
package y1;

import G1.g;
import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.util.Log;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import x1.B;
import y1.F;
import y1.b;
import y1.c;

public final class d {
    public static final d a = new d();
    public static final String b = d.class.getSimpleName();
    public static final ReentrantReadWriteLock c = new ReentrantReadWriteLock();
    public static String d;
    public static volatile boolean e;

    public static /* synthetic */ void a() {
        d.f();
    }

    public static /* synthetic */ void b(String string2) {
        d.h(string2);
    }

    public static final String c() {
        String string2;
        if (!e) {
            Log.w((String)b, (String)"initStore should have been called before calling setUserID");
            a.d();
        }
        ReentrantReadWriteLock reentrantReadWriteLock = c;
        reentrantReadWriteLock.readLock().lock();
        try {
            string2 = d;
        }
        catch (Throwable throwable) {
            c.readLock().unlock();
            throw throwable;
        }
        reentrantReadWriteLock.readLock().unlock();
        return string2;
    }

    public static final void e() {
        if (e) {
            return;
        }
        F.b.b().execute((Runnable)new c());
    }

    public static final void f() {
        a.d();
    }

    public static final void g(String string2) {
        g.b();
        if (!e) {
            Log.w((String)b, (String)"initStore should have been called before calling setUserID");
            a.d();
        }
        F.b.b().execute((Runnable)new b(string2));
    }

    public static final void h(String string2) {
        ReentrantReadWriteLock reentrantReadWriteLock = c;
        reentrantReadWriteLock.writeLock().lock();
        try {
            d = string2;
            string2 = PreferenceManager.getDefaultSharedPreferences((Context)B.l()).edit();
            string2.putString("com.facebook.appevents.AnalyticsUserIDStore.userID", d);
            string2.apply();
        }
        catch (Throwable throwable) {
            c.writeLock().unlock();
            throw throwable;
        }
        reentrantReadWriteLock.writeLock().unlock();
    }

    public final void d() {
        ReentrantReadWriteLock reentrantReadWriteLock;
        block4 : {
            if (e) {
                return;
            }
            reentrantReadWriteLock = c;
            reentrantReadWriteLock.writeLock().lock();
            try {
                boolean bl = e;
                if (!bl) break block4;
            }
            catch (Throwable throwable) {
                c.writeLock().unlock();
                throw throwable;
            }
            reentrantReadWriteLock.writeLock().unlock();
            return;
        }
        d = PreferenceManager.getDefaultSharedPreferences((Context)B.l()).getString("com.facebook.appevents.AnalyticsUserIDStore.userID", null);
        e = true;
        reentrantReadWriteLock.writeLock().unlock();
    }
}

