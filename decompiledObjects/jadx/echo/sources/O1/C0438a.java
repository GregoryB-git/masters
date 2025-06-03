package O1;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.lang.reflect.Method;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import x1.C2146B;

/* renamed from: O1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0438a {

    /* renamed from: f, reason: collision with root package name */
    public static final C0070a f3802f = new C0070a(null);

    /* renamed from: g, reason: collision with root package name */
    public static final String f3803g = C0438a.class.getCanonicalName();

    /* renamed from: h, reason: collision with root package name */
    public static C0438a f3804h;

    /* renamed from: a, reason: collision with root package name */
    public String f3805a;

    /* renamed from: b, reason: collision with root package name */
    public long f3806b;

    /* renamed from: c, reason: collision with root package name */
    public String f3807c;

    /* renamed from: d, reason: collision with root package name */
    public String f3808d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3809e;

    /* renamed from: O1.a$a, reason: collision with other inner class name */
    public static final class C0070a {
        public C0070a() {
        }

        public /* synthetic */ C0070a(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final C0438a a(C0438a c0438a) {
            c0438a.f3806b = System.currentTimeMillis();
            C0438a.f3804h = c0438a;
            return c0438a;
        }

        public final C0438a b(Context context) {
            C0438a c7 = c(context);
            if (c7 != null) {
                return c7;
            }
            C0438a d7 = d(context);
            return d7 == null ? new C0438a() : d7;
        }

        public final C0438a c(Context context) {
            Method L6;
            Object T6;
            boolean z7 = false;
            try {
                if (!g(context) || (L6 = P.L("com.google.android.gms.ads.identifier.AdvertisingIdClient", "getAdvertisingIdInfo", Context.class)) == null || (T6 = P.T(null, L6, context)) == null) {
                    return null;
                }
                Method K6 = P.K(T6.getClass(), "getId", new Class[0]);
                Method K7 = P.K(T6.getClass(), "isLimitAdTrackingEnabled", new Class[0]);
                if (K6 != null && K7 != null) {
                    C0438a c0438a = new C0438a();
                    c0438a.f3805a = (String) P.T(T6, K6, new Object[0]);
                    Boolean bool = (Boolean) P.T(T6, K7, new Object[0]);
                    if (bool != null) {
                        z7 = bool.booleanValue();
                    }
                    c0438a.f3809e = z7;
                    return c0438a;
                }
                return null;
            } catch (Exception e7) {
                P.i0("android_id", e7);
                return null;
            }
        }

        public final C0438a d(Context context) {
            if (!g(context)) {
                return null;
            }
            c cVar = new c();
            Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
            intent.setPackage("com.google.android.gms");
            try {
                try {
                    if (context.bindService(intent, cVar, 1)) {
                        b bVar = new b(cVar.a());
                        C0438a c0438a = new C0438a();
                        c0438a.f3805a = bVar.n();
                        c0438a.f3809e = bVar.o();
                        return c0438a;
                    }
                } catch (Exception e7) {
                    P.i0("android_id", e7);
                } finally {
                    context.unbindService(cVar);
                }
            } catch (SecurityException unused) {
            }
            return null;
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x008e A[Catch: all -> 0x0033, Exception -> 0x0036, TryCatch #4 {Exception -> 0x0036, all -> 0x0033, blocks: (B:3:0x0010, B:5:0x001e, B:7:0x0022, B:11:0x003a, B:13:0x005c, B:16:0x006d, B:17:0x0088, B:19:0x008e, B:21:0x0093, B:23:0x0098, B:57:0x0075, B:61:0x00f8, B:62:0x00ff), top: B:2:0x0010 }] */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0093 A[Catch: all -> 0x0033, Exception -> 0x0036, TryCatch #4 {Exception -> 0x0036, all -> 0x0033, blocks: (B:3:0x0010, B:5:0x001e, B:7:0x0022, B:11:0x003a, B:13:0x005c, B:16:0x006d, B:17:0x0088, B:19:0x008e, B:21:0x0093, B:23:0x0098, B:57:0x0075, B:61:0x00f8, B:62:0x00ff), top: B:2:0x0010 }] */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0098 A[Catch: all -> 0x0033, Exception -> 0x0036, TRY_LEAVE, TryCatch #4 {Exception -> 0x0036, all -> 0x0033, blocks: (B:3:0x0010, B:5:0x001e, B:7:0x0022, B:11:0x003a, B:13:0x005c, B:16:0x006d, B:17:0x0088, B:19:0x008e, B:21:0x0093, B:23:0x0098, B:57:0x0075, B:61:0x00f8, B:62:0x00ff), top: B:2:0x0010 }] */
        /* JADX WARN: Removed duplicated region for block: B:52:0x011b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final O1.C0438a e(android.content.Context r14) {
            /*
                Method dump skipped, instructions count: 287
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: O1.C0438a.C0070a.e(android.content.Context):O1.a");
        }

        public final String f(Context context) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return null;
            }
            return packageManager.getInstallerPackageName(context.getPackageName());
        }

        public final boolean g(Context context) {
            Method L6 = P.L("com.google.android.gms.common.GooglePlayServicesUtil", "isGooglePlayServicesAvailable", Context.class);
            if (L6 == null) {
                return false;
            }
            Object T6 = P.T(null, L6, context);
            return (T6 instanceof Integer) && Intrinsics.a(T6, 0);
        }

        public final boolean h(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            C0438a e7 = e(context);
            return e7 != null && e7.k();
        }
    }

    /* renamed from: O1.a$b */
    public static final class b implements IInterface {

        /* renamed from: c, reason: collision with root package name */
        public static final C0071a f3810c = new C0071a(null);

        /* renamed from: b, reason: collision with root package name */
        public final IBinder f3811b;

        /* renamed from: O1.a$b$a, reason: collision with other inner class name */
        public static final class C0071a {
            public C0071a() {
            }

            public /* synthetic */ C0071a(kotlin.jvm.internal.g gVar) {
                this();
            }
        }

        public b(IBinder binder) {
            Intrinsics.checkNotNullParameter(binder, "binder");
            this.f3811b = binder;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this.f3811b;
        }

        public final String n() {
            Parcel obtain = Parcel.obtain();
            Intrinsics.checkNotNullExpressionValue(obtain, "obtain()");
            Parcel obtain2 = Parcel.obtain();
            Intrinsics.checkNotNullExpressionValue(obtain2, "obtain()");
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.f3811b.transact(1, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readString();
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }

        public final boolean o() {
            Parcel obtain = Parcel.obtain();
            Intrinsics.checkNotNullExpressionValue(obtain, "obtain()");
            Parcel obtain2 = Parcel.obtain();
            Intrinsics.checkNotNullExpressionValue(obtain2, "obtain()");
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                obtain.writeInt(1);
                this.f3811b.transact(2, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readInt() != 0;
            } finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }
    }

    public final String h() {
        if (C2146B.F() && C2146B.k()) {
            return this.f3805a;
        }
        return null;
    }

    public final String i() {
        return this.f3808d;
    }

    public final String j() {
        return this.f3807c;
    }

    public final boolean k() {
        return this.f3809e;
    }

    /* renamed from: O1.a$c */
    public static final class c implements ServiceConnection {

        /* renamed from: a, reason: collision with root package name */
        public final AtomicBoolean f3812a = new AtomicBoolean(false);

        /* renamed from: b, reason: collision with root package name */
        public final BlockingQueue f3813b = new LinkedBlockingDeque();

        public final IBinder a() {
            if (!(!this.f3812a.compareAndSet(true, true))) {
                throw new IllegalStateException("Binder already consumed".toString());
            }
            Object take = this.f3813b.take();
            Intrinsics.checkNotNullExpressionValue(take, "queue.take()");
            return (IBinder) take;
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (iBinder != null) {
                try {
                    this.f3813b.put(iBinder);
                } catch (InterruptedException unused) {
                }
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }
}
