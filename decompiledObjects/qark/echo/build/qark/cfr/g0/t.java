/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 *  android.content.IntentFilter
 *  android.net.ConnectivityManager
 *  android.net.NetworkInfo
 *  android.os.Handler
 *  android.os.Looper
 *  android.telephony.TelephonyDisplayInfo
 *  android.telephony.TelephonyManager
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.RuntimeException
 *  java.lang.SecurityException
 *  java.lang.String
 *  java.lang.Throwable
 *  java.lang.ref.WeakReference
 *  java.util.Iterator
 *  java.util.concurrent.CopyOnWriteArrayList
 */
package g0;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.Looper;
import android.telephony.TelephonyCallback;
import android.telephony.TelephonyCallback$DisplayInfoListener;
import android.telephony.TelephonyDisplayInfo;
import android.telephony.TelephonyManager;
import g0.M;
import g0.a;
import g0.s;
import g0.u;
import g0.v;
import g0.w;
import g0.x;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public final class t {
    public static t e;
    public final Handler a = new Handler(Looper.getMainLooper());
    public final CopyOnWriteArrayList b = new CopyOnWriteArrayList();
    public final Object c = new Object();
    public int d = 0;

    public t(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver((BroadcastReceiver)new d(null), intentFilter);
    }

    public static /* synthetic */ void a(t t8, c c8) {
        t8.h(c8);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static t d(Context object) {
        synchronized (t.class) {
            try {
                if (e != null) return e;
                e = new t((Context)object);
                return e;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public static int e(NetworkInfo networkInfo) {
        switch (networkInfo.getSubtype()) {
            default: {
                return 6;
            }
            case 20: {
                if (M.a >= 29) {
                    return 9;
                }
                return 0;
            }
            case 18: {
                return 2;
            }
            case 13: {
                return 5;
            }
            case 3: 
            case 4: 
            case 5: 
            case 6: 
            case 7: 
            case 8: 
            case 9: 
            case 10: 
            case 11: 
            case 12: 
            case 14: 
            case 15: 
            case 17: {
                return 4;
            }
            case 1: 
            case 2: 
        }
        return 3;
    }

    public static int g(Context context) {
        block10 : {
            if ((context = (ConnectivityManager)context.getSystemService("connectivity")) == null) {
                return 0;
            }
            try {
                context = context.getActiveNetworkInfo();
                if (context == null) break block10;
            }
            catch (SecurityException securityException) {
                return 0;
            }
            if (!context.isConnected()) {
                return 1;
            }
            int n8 = context.getType();
            if (n8 != 0) {
                if (n8 != 1) {
                    if (n8 != 4 && n8 != 5) {
                        if (n8 != 6) {
                            if (n8 != 9) {
                                return 8;
                            }
                            return 7;
                        }
                        return 5;
                    }
                } else {
                    return 2;
                }
            }
            return t.e((NetworkInfo)context);
        }
        return 1;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public int f() {
        Object object = this.c;
        synchronized (object) {
            return this.d;
        }
    }

    public final /* synthetic */ void h(c c8) {
        c8.a(this.f());
    }

    public void i(c c8) {
        this.j();
        this.b.add((Object)new WeakReference((Object)c8));
        this.a.post((Runnable)new s(this, c8));
    }

    public final void j() {
        for (WeakReference weakReference : this.b) {
            if (weakReference.get() != null) continue;
            this.b.remove((Object)weakReference);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void k(int n8) {
        Object object = this.c;
        // MONITORENTER : object
        if (this.d == n8) {
            // MONITOREXIT : object
            return;
        }
        this.d = n8;
        // MONITOREXIT : object
        object = this.b.iterator();
        while (object.hasNext()) {
            WeakReference weakReference = (WeakReference)object.next();
            c c8 = (c)weakReference.get();
            if (c8 != null) {
                c8.a(n8);
                continue;
            }
            this.b.remove((Object)weakReference);
        }
    }

    public static final abstract class b {
        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public static void a(Context context, t t8) {
            try {
                TelephonyManager telephonyManager = (TelephonyManager)g0.a.e((Object)((TelephonyManager)context.getSystemService("phone")));
                a a8 = new a(t8);
                v.a(telephonyManager, u.a(context), a8);
                w.a(telephonyManager, a8);
                return;
            }
            catch (RuntimeException runtimeException) {}
            t8.k(5);
        }

        public static final class a
        extends TelephonyCallback
        implements TelephonyCallback$DisplayInfoListener {
            public final t a;

            public a(t t8) {
                this.a = t8;
            }

            public void onDisplayInfoChanged(TelephonyDisplayInfo object) {
                int n8 = x.a((TelephonyDisplayInfo)object);
                int n9 = 5;
                n8 = n8 != 3 && n8 != 4 && n8 != 5 ? 0 : 1;
                object = this.a;
                if (n8 != 0) {
                    n9 = 10;
                }
                ((t)object).k(n9);
            }
        }

    }

    public static interface c {
        public void a(int var1);
    }

    public final class d
    extends BroadcastReceiver {
        public d() {
        }

        public /* synthetic */ d( a8) {
            this();
        }

        public void onReceive(Context context, Intent intent) {
            int n8 = t.g(context);
            if (M.a >= 31 && n8 == 5) {
                b.a(context, t.this);
                return;
            }
            t.this.k(n8);
        }
    }

}

