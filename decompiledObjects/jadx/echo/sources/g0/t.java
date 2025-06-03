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
import android.telephony.TelephonyDisplayInfo;
import android.telephony.TelephonyManager;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: e, reason: collision with root package name */
    public static t f14334e;

    /* renamed from: a, reason: collision with root package name */
    public final Handler f14335a = new Handler(Looper.getMainLooper());

    /* renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f14336b = new CopyOnWriteArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final Object f14337c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public int f14338d = 0;

    public static final class b {

        public static final class a extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {

            /* renamed from: a, reason: collision with root package name */
            public final t f14339a;

            public a(t tVar) {
                this.f14339a = tVar;
            }

            public void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
                int overrideNetworkType;
                overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
                this.f14339a.k(overrideNetworkType == 3 || overrideNetworkType == 4 || overrideNetworkType == 5 ? 10 : 5);
            }
        }

        public static void a(Context context, t tVar) {
            Executor mainExecutor;
            try {
                TelephonyManager telephonyManager = (TelephonyManager) AbstractC1297a.e((TelephonyManager) context.getSystemService("phone"));
                a aVar = new a(tVar);
                mainExecutor = context.getMainExecutor();
                telephonyManager.registerTelephonyCallback(mainExecutor, aVar);
                telephonyManager.unregisterTelephonyCallback(aVar);
            } catch (RuntimeException unused) {
                tVar.k(5);
            }
        }
    }

    public interface c {
        void a(int i7);
    }

    public final class d extends BroadcastReceiver {
        public d() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            int g7 = t.g(context);
            if (M.f14261a < 31 || g7 != 5) {
                t.this.k(g7);
            } else {
                b.a(context, t.this);
            }
        }
    }

    public t(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new d(), intentFilter);
    }

    public static synchronized t d(Context context) {
        t tVar;
        synchronized (t.class) {
            try {
                if (f14334e == null) {
                    f14334e = new t(context);
                }
                tVar = f14334e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return tVar;
    }

    public static int e(NetworkInfo networkInfo) {
        switch (networkInfo.getSubtype()) {
            case 1:
            case 2:
                return 3;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case N4.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
            case 14:
            case 15:
            case 17:
                return 4;
            case N4.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                return 5;
            case 16:
            case 19:
            default:
                return 6;
            case 18:
                return 2;
            case 20:
                return M.f14261a >= 29 ? 9 : 0;
        }
    }

    public static int g(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        int i7 = 0;
        if (connectivityManager == null) {
            return 0;
        }
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            i7 = 1;
            if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                int type = activeNetworkInfo.getType();
                if (type != 0) {
                    if (type == 1) {
                        return 2;
                    }
                    if (type != 4 && type != 5) {
                        if (type != 6) {
                            return type != 9 ? 8 : 7;
                        }
                        return 5;
                    }
                }
                return e(activeNetworkInfo);
            }
        } catch (SecurityException unused) {
        }
        return i7;
    }

    public int f() {
        int i7;
        synchronized (this.f14337c) {
            i7 = this.f14338d;
        }
        return i7;
    }

    public final /* synthetic */ void h(c cVar) {
        cVar.a(f());
    }

    public void i(final c cVar) {
        j();
        this.f14336b.add(new WeakReference(cVar));
        this.f14335a.post(new Runnable() { // from class: g0.s
            @Override // java.lang.Runnable
            public final void run() {
                t.this.h(cVar);
            }
        });
    }

    public final void j() {
        Iterator it = this.f14336b.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            if (weakReference.get() == null) {
                this.f14336b.remove(weakReference);
            }
        }
    }

    public final void k(int i7) {
        synchronized (this.f14337c) {
            try {
                if (this.f14338d == i7) {
                    return;
                }
                this.f14338d = i7;
                Iterator it = this.f14336b.iterator();
                while (it.hasNext()) {
                    WeakReference weakReference = (WeakReference) it.next();
                    c cVar = (c) weakReference.get();
                    if (cVar != null) {
                        cVar.a(i7);
                    } else {
                        this.f14336b.remove(weakReference);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
