// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package g0;

import android.content.Intent;
import android.telephony.TelephonyDisplayInfo;
import android.telephony.TelephonyCallback$DisplayInfoListener;
import android.telephony.TelephonyCallback;
import android.telephony.TelephonyManager;
import java.util.Iterator;
import java.lang.ref.WeakReference;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.os.Looper;
import android.content.Context;
import java.util.concurrent.CopyOnWriteArrayList;
import android.os.Handler;

public final class t
{
    public static t e;
    public final Handler a;
    public final CopyOnWriteArrayList b;
    public final Object c;
    public int d;
    
    public t(final Context context) {
        this.a = new Handler(Looper.getMainLooper());
        this.b = new CopyOnWriteArrayList();
        this.c = new Object();
        this.d = 0;
        final IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver((BroadcastReceiver)new d(null), intentFilter);
    }
    
    public static t d(final Context context) {
        // monitorenter(t.class)
        while (true) {
            try {
                if (t.e == null) {
                    t.e = new t(context);
                }
                // monitorexit(t.class)
                return t.e;
                // monitorexit(t.class)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public static int e(final NetworkInfo networkInfo) {
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
            case 2: {
                return 3;
            }
        }
    }
    
    public static int g(final Context context) {
        final ConnectivityManager connectivityManager = (ConnectivityManager)context.getSystemService("connectivity");
        if (connectivityManager == null) {
            return 0;
        }
        try {
            final NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                return 1;
            }
            if (!activeNetworkInfo.isConnected()) {
                return 1;
            }
            final int type = activeNetworkInfo.getType();
            if (type != 0) {
                if (type == 1) {
                    return 2;
                }
                if (type != 4 && type != 5) {
                    if (type == 6) {
                        return 5;
                    }
                    if (type != 9) {
                        return 8;
                    }
                    return 7;
                }
            }
            return e(activeNetworkInfo);
        }
        catch (SecurityException ex) {
            return 0;
        }
    }
    
    public int f() {
        synchronized (this.c) {
            return this.d;
        }
    }
    
    public void i(final c referent) {
        this.j();
        this.b.add(new WeakReference<c>(referent));
        this.a.post((Runnable)new s(this, referent));
    }
    
    public final void j() {
        for (final WeakReference o : this.b) {
            if (o.get() == null) {
                this.b.remove(o);
            }
        }
    }
    
    public final void k(final int d) {
        Object o = this.c;
        // monitorenter(o)
        while (true) {
            try {
                if (this.d == d) {
                    // monitorexit(o)
                    return;
                }
                this.d = d;
                // monitorexit(o)
                o = this.b.iterator();
                while (((Iterator)o).hasNext()) {
                    final WeakReference<c> o2 = ((Iterator<WeakReference<c>>)o).next();
                    final c c = o2.get();
                    if (c != null) {
                        c.a(d);
                    }
                    else {
                        this.b.remove(o2);
                    }
                }
                return;
                // monitorexit(o)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public abstract static final class b
    {
        public static void a(final Context context, final t t) {
            while (true) {
                try {
                    final TelephonyManager telephonyManager = (TelephonyManager)g0.a.e(context.getSystemService("phone"));
                    final a a = new a(t);
                    v.a(telephonyManager, u.a(context), (TelephonyCallback)a);
                    w.a(telephonyManager, (TelephonyCallback)a);
                    return;
                    t.k(5);
                }
                catch (RuntimeException ex) {
                    continue;
                }
                break;
            }
        }
        
        public static final class a extends TelephonyCallback implements TelephonyCallback$DisplayInfoListener
        {
            public final t a;
            
            public a(final t a) {
                this.a = a;
            }
            
            public void onDisplayInfoChanged(final TelephonyDisplayInfo telephonyDisplayInfo) {
                final int a = x.a(telephonyDisplayInfo);
                int n = 5;
                final boolean b = a == 3 || a == 4 || a == 5;
                final t a2 = this.a;
                if (b) {
                    n = 10;
                }
                a2.k(n);
            }
        }
    }
    
    public interface c
    {
        void a(final int p0);
    }
    
    public final class d extends BroadcastReceiver
    {
        public void onReceive(final Context context, final Intent intent) {
            final int b = g(context);
            if (M.a >= 31 && b == 5) {
                t.b.a(context, t.this);
                return;
            }
            t.this.k(b);
        }
    }
}
