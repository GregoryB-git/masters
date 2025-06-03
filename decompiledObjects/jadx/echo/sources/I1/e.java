package I1;

import G1.g;
import O1.C0448k;
import O1.P;
import W5.o;
import Z1.a;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import x1.C2146B;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final e f2497a = new e();

    /* renamed from: b, reason: collision with root package name */
    public static final String f2498b = e.class.getSimpleName();

    /* renamed from: c, reason: collision with root package name */
    public static Boolean f2499c;

    public enum a {
        MOBILE_APP_INSTALL("MOBILE_APP_INSTALL"),
        CUSTOM_APP_EVENTS("CUSTOM_APP_EVENTS");


        /* renamed from: o, reason: collision with root package name */
        public final String f2503o;

        a(String str) {
            this.f2503o = str;
        }

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            a[] valuesCustom = values();
            return (a[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.f2503o;
        }
    }

    public static final class b implements ServiceConnection {

        /* renamed from: a, reason: collision with root package name */
        public final CountDownLatch f2504a = new CountDownLatch(1);

        /* renamed from: b, reason: collision with root package name */
        public IBinder f2505b;

        public final IBinder a() {
            this.f2504a.await(5L, TimeUnit.SECONDS);
            return this.f2505b;
        }

        @Override // android.content.ServiceConnection
        public void onNullBinding(ComponentName name) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.f2504a.countDown();
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName name, IBinder serviceBinder) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(serviceBinder, "serviceBinder");
            this.f2505b = serviceBinder;
            this.f2504a.countDown();
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName name) {
            Intrinsics.checkNotNullParameter(name, "name");
        }
    }

    public enum c {
        OPERATION_SUCCESS,
        SERVICE_NOT_AVAILABLE,
        SERVICE_ERROR;

        /* renamed from: values, reason: to resolve conflict with enum method */
        public static c[] valuesCustom() {
            c[] valuesCustom = values();
            return (c[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
        }
    }

    public static final boolean b() {
        if (T1.a.d(e.class)) {
            return false;
        }
        try {
            if (f2499c == null) {
                f2499c = Boolean.valueOf(f2497a.a(C2146B.l()) != null);
            }
            Boolean bool = f2499c;
            if (bool == null) {
                return false;
            }
            return bool.booleanValue();
        } catch (Throwable th) {
            T1.a.b(th, e.class);
            return false;
        }
    }

    public static final c c(String applicationId, List appEvents) {
        if (T1.a.d(e.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(applicationId, "applicationId");
            Intrinsics.checkNotNullParameter(appEvents, "appEvents");
            return f2497a.d(a.CUSTOM_APP_EVENTS, applicationId, appEvents);
        } catch (Throwable th) {
            T1.a.b(th, e.class);
            return null;
        }
    }

    public static final c e(String applicationId) {
        if (T1.a.d(e.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(applicationId, "applicationId");
            return f2497a.d(a.MOBILE_APP_INSTALL, applicationId, o.f());
        } catch (Throwable th) {
            T1.a.b(th, e.class);
            return null;
        }
    }

    public final Intent a(Context context) {
        if (T1.a.d(this)) {
            return null;
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                Intent intent = new Intent("ReceiverService");
                intent.setPackage("com.facebook.katana");
                if (packageManager.resolveService(intent, 0) != null && C0448k.a(context, "com.facebook.katana")) {
                    return intent;
                }
                Intent intent2 = new Intent("ReceiverService");
                intent2.setPackage("com.facebook.wakizashi");
                if (packageManager.resolveService(intent2, 0) != null) {
                    if (C0448k.a(context, "com.facebook.wakizashi")) {
                        return intent2;
                    }
                }
            }
            return null;
        } catch (Throwable th) {
            T1.a.b(th, this);
            return null;
        }
    }

    public final c d(a aVar, String str, List list) {
        c cVar;
        String str2;
        if (T1.a.d(this)) {
            return null;
        }
        try {
            c cVar2 = c.SERVICE_NOT_AVAILABLE;
            g.b();
            Context l7 = C2146B.l();
            Intent a7 = a(l7);
            if (a7 == null) {
                return cVar2;
            }
            b bVar = new b();
            try {
                if (!l7.bindService(a7, bVar, 1)) {
                    return c.SERVICE_ERROR;
                }
                try {
                    try {
                        IBinder a8 = bVar.a();
                        if (a8 != null) {
                            Z1.a n7 = a.AbstractBinderC0136a.n(a8);
                            Bundle a9 = d.a(aVar, str, list);
                            if (a9 != null) {
                                n7.O(a9);
                                P p7 = P.f3756a;
                                P.j0(f2498b, Intrinsics.i("Successfully sent events to the remote service: ", a9));
                            }
                            cVar2 = c.OPERATION_SUCCESS;
                        }
                        l7.unbindService(bVar);
                        P p8 = P.f3756a;
                        P.j0(f2498b, "Unbound from the remote service");
                        return cVar2;
                    } catch (InterruptedException e7) {
                        cVar = c.SERVICE_ERROR;
                        P p9 = P.f3756a;
                        str2 = f2498b;
                        P.i0(str2, e7);
                        l7.unbindService(bVar);
                        P.j0(str2, "Unbound from the remote service");
                        return cVar;
                    }
                } catch (RemoteException e8) {
                    cVar = c.SERVICE_ERROR;
                    P p10 = P.f3756a;
                    str2 = f2498b;
                    P.i0(str2, e8);
                    l7.unbindService(bVar);
                    P.j0(str2, "Unbound from the remote service");
                    return cVar;
                }
            } catch (Throwable th) {
                l7.unbindService(bVar);
                P p11 = P.f3756a;
                P.j0(f2498b, "Unbound from the remote service");
                throw th;
            }
        } catch (Throwable th2) {
            T1.a.b(th2, this);
            return null;
        }
    }
}
