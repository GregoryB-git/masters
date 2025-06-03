// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package O1;

import android.database.Cursor;
import android.content.ComponentName;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import android.os.Parcel;
import android.os.IBinder;
import android.os.IInterface;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import x1.o;
import android.os.Looper;
import kotlin.jvm.internal.Intrinsics;
import android.content.ServiceConnection;
import android.content.Intent;
import java.lang.reflect.Method;
import android.content.Context;
import x1.B;
import kotlin.jvm.internal.g;

public final class a
{
    public static final a f;
    public static final String g;
    public static a h;
    public String a;
    public long b;
    public String c;
    public String d;
    public boolean e;
    
    static {
        f = new a(null);
        g = a.class.getCanonicalName();
    }
    
    public static final /* synthetic */ long a(final a a) {
        return a.b;
    }
    
    public static final /* synthetic */ String b() {
        return a.g;
    }
    
    public static final /* synthetic */ void c(final a a, final String a2) {
        a.a = a2;
    }
    
    public static final /* synthetic */ void d(final a a, final String d) {
        a.d = d;
    }
    
    public static final /* synthetic */ void e(final a a, final String c) {
        a.c = c;
    }
    
    public static final /* synthetic */ void f(final a a, final long b) {
        a.b = b;
    }
    
    public static final /* synthetic */ void g(final a a, final boolean e) {
        a.e = e;
    }
    
    public final String h() {
        if (B.F() && B.k()) {
            return this.a;
        }
        return null;
    }
    
    public final String i() {
        return this.d;
    }
    
    public final String j() {
        return this.c;
    }
    
    public final boolean k() {
        return this.e;
    }
    
    public static final class a
    {
        public final O1.a a(final O1.a h) {
            O1.a.f(h, System.currentTimeMillis());
            return O1.a.h = h;
        }
        
        public final O1.a b(final Context context) {
            O1.a a;
            if ((a = this.c(context)) == null && (a = this.d(context)) == null) {
                a = new O1.a();
            }
            return a;
        }
        
        public final O1.a c(final Context context) {
            boolean booleanValue = false;
            Label_0161: {
                try {
                    if (!this.g(context)) {
                        return null;
                    }
                    final Method l = P.L("com.google.android.gms.ads.identifier.AdvertisingIdClient", "getAdvertisingIdInfo", Context.class);
                    if (l == null) {
                        return null;
                    }
                    final Object t = P.T(null, l, context);
                    if (t == null) {
                        return null;
                    }
                    final Method k = P.K(t.getClass(), "getId", new Class[0]);
                    final Method i = P.K(t.getClass(), "isLimitAdTrackingEnabled", new Class[0]);
                    if (k != null) {
                        if (i == null) {
                            return null;
                        }
                        final O1.a a = new O1.a();
                        O1.a.c(a, (String)P.T(t, k, new Object[0]));
                        final Boolean b = (Boolean)P.T(t, i, new Object[0]);
                        if (b != null) {
                            booleanValue = b;
                        }
                        O1.a.g(a, booleanValue);
                        return a;
                    }
                }
                catch (Exception ex) {
                    break Label_0161;
                }
                return null;
            }
            final Exception ex;
            P.i0("android_id", ex);
            return null;
        }
        
        public final O1.a d(final Context context) {
            if (!this.g(context)) {
                return null;
            }
            final c c = new c();
            final Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
            intent.setPackage("com.google.android.gms");
            try {
                if (!context.bindService(intent, (ServiceConnection)c, 1)) {
                    return null;
                }
                try {
                    try {
                        final b b = new b(c.a());
                        final O1.a a = new O1.a();
                        O1.a.c(a, b.n());
                        O1.a.g(a, b.o());
                        context.unbindService((ServiceConnection)c);
                        return a;
                    }
                    finally {}
                }
                catch (Exception ex) {
                    P.i0("android_id", ex);
                    context.unbindService((ServiceConnection)c);
                    return null;
                }
                context.unbindService((ServiceConnection)c);
            }
            catch (SecurityException ex2) {
                return null;
            }
        }
        
        public final O1.a e(Context query) {
        Label_0168_Outer:
            while (true) {
                Intrinsics.checkNotNullParameter(query, "context");
                final O1.a b = this.b(query);
                Object a = null;
                while (true) {
                Label_0393:
                    while (true) {
                    Label_0428:
                        while (true) {
                            try {
                                if (Intrinsics.a(Looper.myLooper(), Looper.getMainLooper())) {
                                    throw new o("getAttributionIdentifiers cannot be called on the main thread.");
                                }
                                final O1.a h = O1.a.h;
                                if (h != null && System.currentTimeMillis() - O1.a.a(h) < 3600000L) {
                                    return h;
                                }
                                final ProviderInfo resolveContentProvider = query.getPackageManager().resolveContentProvider("com.facebook.katana.provider.AttributionIdProvider", 0);
                                final ProviderInfo resolveContentProvider2 = query.getPackageManager().resolveContentProvider("com.facebook.wakizashi.provider.AttributionIdProvider", 0);
                                while (true) {
                                    Label_0128: {
                                        if (resolveContentProvider == null) {
                                            break Label_0128;
                                        }
                                        final k a2 = k.a;
                                        final String packageName = resolveContentProvider.packageName;
                                        Intrinsics.checkNotNullExpressionValue(packageName, "contentProviderInfo.packageName");
                                        if (!k.a(query, packageName)) {
                                            break Label_0128;
                                        }
                                        final String s = "content://com.facebook.katana.provider.AttributionIdProvider";
                                        final Uri parse = Uri.parse(s);
                                        final String f = this.f(query);
                                        if (f != null) {
                                            O1.a.d(b, f);
                                        }
                                        if (parse == null) {
                                            return this.a(b);
                                        }
                                        query = (Context)query.getContentResolver().query(parse, new String[] { "aid", "androidid", "limit_tracking" }, (String)null, (String[])null, (String)null);
                                        Label_0358: {
                                            if (query != null) {
                                                try {
                                                    if (!((Cursor)query).moveToFirst()) {
                                                        break Label_0358;
                                                    }
                                                    final int columnIndex = ((Cursor)query).getColumnIndex("aid");
                                                    final int columnIndex2 = ((Cursor)query).getColumnIndex("androidid");
                                                    final int columnIndex3 = ((Cursor)query).getColumnIndex("limit_tracking");
                                                    O1.a.e(b, ((Cursor)query).getString(columnIndex));
                                                    if (columnIndex2 > 0 && columnIndex3 > 0 && b.h() == null) {
                                                        O1.a.c(b, ((Cursor)query).getString(columnIndex2));
                                                        O1.a.g(b, Boolean.parseBoolean(((Cursor)query).getString(columnIndex3)));
                                                    }
                                                }
                                                catch (Exception ex) {
                                                    break Label_0393;
                                                }
                                                finally {
                                                    break Label_0428;
                                                }
                                                ((Cursor)query).close();
                                                return this.a(b);
                                                final Throwable t;
                                                try {
                                                    a = P.a;
                                                    P.j0(O1.a.b(), Intrinsics.i("Caught unexpected exception in getAttributionId(): ", t));
                                                    if (query == null) {
                                                        return null;
                                                    }
                                                    ((Cursor)query).close();
                                                    return null;
                                                }
                                                finally {}
                                                if (query != null) {
                                                    ((Cursor)query).close();
                                                }
                                                throw t;
                                            }
                                        }
                                        final O1.a a3 = this.a(b);
                                        if (query == null) {
                                            return a3;
                                        }
                                        ((Cursor)query).close();
                                        return a3;
                                    }
                                    if (resolveContentProvider2 != null) {
                                        final k a4 = k.a;
                                        final String packageName2 = resolveContentProvider2.packageName;
                                        Intrinsics.checkNotNullExpressionValue(packageName2, "wakizashiProviderInfo.packageName");
                                        if (k.a(query, packageName2)) {
                                            final String s = "content://com.facebook.wakizashi.provider.AttributionIdProvider";
                                            continue Label_0168_Outer;
                                        }
                                    }
                                    break;
                                }
                            }
                            catch (Exception ex2) {
                                continue Label_0393;
                            }
                            finally {
                                query = (Context)a;
                                continue Label_0428;
                            }
                            break;
                        }
                        break;
                    }
                    final Uri parse = null;
                    continue;
                }
            }
        }
        
        public final String f(final Context context) {
            final PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return null;
            }
            return packageManager.getInstallerPackageName(context.getPackageName());
        }
        
        public final boolean g(final Context context) {
            final Method l = P.L("com.google.android.gms.common.GooglePlayServicesUtil", "isGooglePlayServicesAvailable", Context.class);
            if (l == null) {
                return false;
            }
            final Object t = P.T(null, l, context);
            return t instanceof Integer && Intrinsics.a(t, 0);
        }
        
        public final boolean h(final Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            final O1.a e = this.e(context);
            return e != null && e.k();
        }
    }
    
    public static final class b implements IInterface
    {
        public static final a c;
        public final IBinder b;
        
        static {
            c = new a(null);
        }
        
        public b(final IBinder b) {
            Intrinsics.checkNotNullParameter(b, "binder");
            this.b = b;
        }
        
        public IBinder asBinder() {
            return this.b;
        }
        
        public final String n() {
            final Parcel obtain = Parcel.obtain();
            Intrinsics.checkNotNullExpressionValue(obtain, "obtain()");
            final Parcel obtain2 = Parcel.obtain();
            Intrinsics.checkNotNullExpressionValue(obtain2, "obtain()");
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.b.transact(1, obtain, obtain2, 0);
                obtain2.readException();
                return obtain2.readString();
            }
            finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }
        
        public final boolean o() {
            final Parcel obtain = Parcel.obtain();
            Intrinsics.checkNotNullExpressionValue(obtain, "obtain()");
            final Parcel obtain2 = Parcel.obtain();
            Intrinsics.checkNotNullExpressionValue(obtain2, "obtain()");
            try {
                obtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                boolean b = true;
                obtain.writeInt(1);
                this.b.transact(2, obtain, obtain2, 0);
                obtain2.readException();
                if (obtain2.readInt() == 0) {
                    b = false;
                }
                return b;
            }
            finally {
                obtain2.recycle();
                obtain.recycle();
            }
        }
        
        public static final class a
        {
        }
    }
    
    public static final class c implements ServiceConnection
    {
        public final AtomicBoolean a;
        public final BlockingQueue b;
        
        public c() {
            this.a = new AtomicBoolean(false);
            this.b = new LinkedBlockingDeque();
        }
        
        public final IBinder a() {
            if (this.a.compareAndSet(true, true) ^ true) {
                final IBinder take = this.b.take();
                Intrinsics.checkNotNullExpressionValue(take, "queue.take()");
                return take;
            }
            throw new IllegalStateException("Binder already consumed".toString());
        }
        
        public void onServiceConnected(final ComponentName componentName, final IBinder binder) {
            if (binder == null) {
                return;
            }
            try {
                this.b.put(binder);
            }
            catch (InterruptedException ex) {}
        }
        
        public void onServiceDisconnected(final ComponentName componentName) {
        }
    }
}
