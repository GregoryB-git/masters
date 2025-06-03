/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.Intent
 *  android.content.ServiceConnection
 *  android.content.pm.PackageManager
 *  android.os.IBinder
 *  android.os.IInterface
 *  android.os.Parcel
 *  java.lang.Boolean
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.IllegalStateException
 *  java.lang.Integer
 *  java.lang.InterruptedException
 *  java.lang.Object
 *  java.lang.SecurityException
 *  java.lang.String
 *  java.lang.System
 *  java.lang.Throwable
 *  java.lang.reflect.Method
 *  java.util.concurrent.BlockingQueue
 *  java.util.concurrent.LinkedBlockingDeque
 *  java.util.concurrent.atomic.AtomicBoolean
 */
package O1;

import O1.P;
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
import kotlin.jvm.internal.g;
import x1.B;

public final class a {
    public static final a f = new a(null);
    public static final String g = a.class.getCanonicalName();
    public static a h;
    public String a;
    public long b;
    public String c;
    public String d;
    public boolean e;

    public static final /* synthetic */ long a(a a8) {
        return a8.b;
    }

    public static final /* synthetic */ String b() {
        return g;
    }

    public static final /* synthetic */ void c(a a8, String string2) {
        a8.a = string2;
    }

    public static final /* synthetic */ void d(a a8, String string2) {
        a8.d = string2;
    }

    public static final /* synthetic */ void e(a a8, String string2) {
        a8.c = string2;
    }

    public static final /* synthetic */ void f(a a8, long l8) {
        a8.b = l8;
    }

    public static final /* synthetic */ void g(a a8, boolean bl) {
        a8.e = bl;
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

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(g g8) {
            this();
        }

        public final a a(a a8) {
            a.f(a8, System.currentTimeMillis());
            a.h = a8;
            return a8;
        }

        public final a b(Context object) {
            a a8 = this.c((Context)object);
            Object object2 = a8;
            if (a8 == null) {
                object2 = object = this.d((Context)object);
                if (object == null) {
                    object2 = new a();
                }
            }
            return object2;
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public final a c(Context object) {
            boolean bl = false;
            try {
                if (!this.g((Context)object)) {
                    return null;
                }
                Object object2 = P.L("com.google.android.gms.ads.identifier.AdvertisingIdClient", "getAdvertisingIdInfo", Context.class);
                if (object2 == null) {
                    return null;
                }
                if ((object2 = P.T(null, (Method)object2, object)) == null) {
                    return null;
                }
                Method method = P.K(object2.getClass(), "getId", new Class[0]);
                Method method2 = P.K(object2.getClass(), "isLimitAdTrackingEnabled", new Class[0]);
                if (method == null) return null;
                {
                    if (method2 == null) {
                        return null;
                    }
                    object = new a();
                    a.c((a)object, (String)P.T(object2, method, new Object[0]));
                    object2 = (Boolean)P.T(object2, method2, new Object[0]);
                    if (object2 != null) {
                        bl = object2.booleanValue();
                    }
                    a.g((a)object, bl);
                    return object;
                }
            }
            catch (Exception exception) {}
            P.i0("android_id", exception);
            return null;
        }

        /*
         * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
         * Loose catch block
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         * Lifted jumps to return sites
         */
        public final a d(Context context) {
            Throwable throwable222;
            if (!this.g(context)) {
                return null;
            }
            c c8 = new c();
            Object object = new Intent("com.google.android.gms.ads.identifier.service.START");
            object.setPackage("com.google.android.gms");
            try {
                boolean bl = context.bindService((Intent)object, (ServiceConnection)c8, 1);
                if (!bl) return null;
            }
            catch (SecurityException securityException) {
                return null;
            }
            object = new b(c8.a());
            a a8 = new a();
            a.c(a8, object.n());
            a.g(a8, object.o());
            context.unbindService((ServiceConnection)c8);
            return a8;
            {
                catch (Throwable throwable222) {
                }
                catch (Exception exception) {}
                {
                    P.i0("android_id", exception);
                }
                context.unbindService((ServiceConnection)c8);
                return null;
            }
            context.unbindService((ServiceConnection)c8);
            throw throwable222;
        }

        /*
         * Exception decompiling
         */
        public final a e(Context var1_1) {
            // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
            // java.lang.IllegalStateException: Backjump on non jumping statement [] lbl54 : TryStatement: try { 2[TRYBLOCK]

            // org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.Cleaner$1.call(Cleaner.java:44)
            // org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.Cleaner$1.call(Cleaner.java:22)
            // org.benf.cfr.reader.util.graph.GraphVisitorDFS.process(GraphVisitorDFS.java:68)
            // org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.Cleaner.removeUnreachableCode(Cleaner.java:54)
            // org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.RemoveDeterministicJumps.apply(RemoveDeterministicJumps.java:35)
            // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:517)
            // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:217)
            // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:162)
            // org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:95)
            // org.benf.cfr.reader.entities.Method.analyse(Method.java:357)
            // org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:769)
            // org.benf.cfr.reader.entities.ClassFile.analyseInnerClassesPass1(ClassFile.java:682)
            // org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:765)
            // org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:701)
            // org.benf.cfr.reader.Main.doJar(Main.java:134)
            // org.benf.cfr.reader.Main.main(Main.java:189)
            throw new IllegalStateException("Decompilation failed");
        }

        public final String f(Context context) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return null;
            }
            return packageManager.getInstallerPackageName(context.getPackageName());
        }

        public final boolean g(Context object) {
            Method method = P.L("com.google.android.gms.common.GooglePlayServicesUtil", "isGooglePlayServicesAvailable", Context.class);
            if (method == null) {
                return false;
            }
            Object[] arrobject = new Object[]{object};
            object = P.T(null, method, arrobject);
            if (object instanceof Integer && Intrinsics.a(object, 0)) {
                return true;
            }
            return false;
        }

        public final boolean h(Context object) {
            Intrinsics.checkNotNullParameter(object, "context");
            object = this.e((Context)object);
            if (object != null && object.k()) {
                return true;
            }
            return false;
        }
    }

    public static final class b
    implements IInterface {
        public static final a c = new a(null);
        public final IBinder b;

        public b(IBinder iBinder) {
            Intrinsics.checkNotNullParameter((Object)iBinder, "binder");
            this.b = iBinder;
        }

        public IBinder asBinder() {
            return this.b;
        }

        public final String n() {
            Parcel parcel = Parcel.obtain();
            Intrinsics.checkNotNullExpressionValue((Object)parcel, "obtain()");
            Parcel parcel2 = Parcel.obtain();
            Intrinsics.checkNotNullExpressionValue((Object)parcel2, "obtain()");
            try {
                parcel.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                this.b.transact(1, parcel, parcel2, 0);
                parcel2.readException();
                String string2 = parcel2.readString();
                return string2;
            }
            finally {
                parcel2.recycle();
                parcel.recycle();
            }
        }

        public final boolean o() {
            Parcel parcel;
            boolean bl;
            Parcel parcel2;
            block3 : {
                parcel = Parcel.obtain();
                Intrinsics.checkNotNullExpressionValue((Object)parcel, "obtain()");
                parcel2 = Parcel.obtain();
                Intrinsics.checkNotNullExpressionValue((Object)parcel2, "obtain()");
                try {
                    parcel.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
                    bl = true;
                }
                catch (Throwable throwable) {
                    parcel2.recycle();
                    parcel.recycle();
                    throw throwable;
                }
                parcel.writeInt(1);
                this.b.transact(2, parcel, parcel2, 0);
                parcel2.readException();
                int n8 = parcel2.readInt();
                if (n8 != 0) break block3;
                bl = false;
            }
            parcel2.recycle();
            parcel.recycle();
            return bl;
        }

        public static final class a {
            public a() {
            }

            public /* synthetic */ a(g g8) {
                this();
            }
        }

    }

    public static final class c
    implements ServiceConnection {
        public final AtomicBoolean a = new AtomicBoolean(false);
        public final BlockingQueue b = new LinkedBlockingDeque();

        public final IBinder a() {
            if (this.a.compareAndSet(true, true) ^ true) {
                Object object = this.b.take();
                Intrinsics.checkNotNullExpressionValue(object, "queue.take()");
                return (IBinder)object;
            }
            throw new IllegalStateException("Binder already consumed".toString());
        }

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (iBinder == null) return;
            try {
                this.b.put((Object)iBinder);
                return;
            }
            catch (InterruptedException interruptedException) {
                return;
            }
        }

        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

}

