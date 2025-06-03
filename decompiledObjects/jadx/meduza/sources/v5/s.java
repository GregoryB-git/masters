package v5;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.Looper;
import android.telephony.TelephonyManager;
import io.flutter.plugins.firebase.auth.Constants;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: e, reason: collision with root package name */
    public static s f15962e;

    /* renamed from: a, reason: collision with root package name */
    public final Handler f15963a = new Handler(Looper.getMainLooper());

    /* renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList<WeakReference<a>> f15964b = new CopyOnWriteArrayList<>();

    /* renamed from: c, reason: collision with root package name */
    public final Object f15965c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public int f15966d = 0;

    public interface a {
        void a(int i10);
    }

    public final class b extends BroadcastReceiver {
        public b() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            int i10;
            Executor mainExecutor;
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager != null) {
                try {
                    NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                    i10 = 1;
                    if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                        int type = activeNetworkInfo.getType();
                        if (type != 0) {
                            if (type != 1) {
                                if (type != 4 && type != 5) {
                                    if (type != 6) {
                                        i10 = type != 9 ? 8 : 7;
                                    }
                                    i10 = 5;
                                }
                            }
                            i10 = 2;
                        }
                        switch (activeNetworkInfo.getSubtype()) {
                            case 1:
                            case 2:
                                i10 = 3;
                                break;
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
                            case 17:
                                i10 = 4;
                                break;
                            case 13:
                                i10 = 5;
                                break;
                            case 16:
                            case 19:
                            default:
                                i10 = 6;
                                break;
                            case 18:
                                i10 = 2;
                                break;
                            case 20:
                                if (e0.f15881a >= 29) {
                                    i10 = 9;
                                    break;
                                }
                                break;
                        }
                    }
                } catch (SecurityException unused) {
                }
                if (e0.f15881a >= 31 || i10 != 5) {
                    s.a(s.this, i10);
                }
                s sVar = s.this;
                try {
                    TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService(Constants.SIGN_IN_METHOD_PHONE);
                    telephonyManager.getClass();
                    r rVar = new r(sVar);
                    mainExecutor = context.getMainExecutor();
                    telephonyManager.registerTelephonyCallback(mainExecutor, rVar);
                    telephonyManager.unregisterTelephonyCallback(rVar);
                    return;
                } catch (RuntimeException unused2) {
                    s.a(sVar, 5);
                    return;
                }
            }
            i10 = 0;
            if (e0.f15881a >= 31) {
            }
            s.a(s.this, i10);
        }
    }

    public s(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new b(), intentFilter);
    }

    public static void a(s sVar, int i10) {
        synchronized (sVar.f15965c) {
            if (sVar.f15966d == i10) {
                return;
            }
            sVar.f15966d = i10;
            Iterator<WeakReference<a>> it = sVar.f15964b.iterator();
            while (it.hasNext()) {
                WeakReference<a> next = it.next();
                a aVar = next.get();
                if (aVar != null) {
                    aVar.a(i10);
                } else {
                    sVar.f15964b.remove(next);
                }
            }
        }
    }

    public static synchronized s b(Context context) {
        s sVar;
        synchronized (s.class) {
            if (f15962e == null) {
                f15962e = new s(context);
            }
            sVar = f15962e;
        }
        return sVar;
    }
}
