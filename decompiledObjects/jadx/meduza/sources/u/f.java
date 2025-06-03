package u;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final Class<?> f14794a;

    /* renamed from: b, reason: collision with root package name */
    public static final Field f14795b;

    /* renamed from: c, reason: collision with root package name */
    public static final Field f14796c;

    /* renamed from: d, reason: collision with root package name */
    public static final Method f14797d;

    /* renamed from: e, reason: collision with root package name */
    public static final Method f14798e;
    public static final Method f;

    /* renamed from: g, reason: collision with root package name */
    public static final Handler f14799g = new Handler(Looper.getMainLooper());

    public static final class a implements Application.ActivityLifecycleCallbacks {

        /* renamed from: a, reason: collision with root package name */
        public Object f14800a;

        /* renamed from: b, reason: collision with root package name */
        public Activity f14801b;

        /* renamed from: c, reason: collision with root package name */
        public final int f14802c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f14803d = false;

        /* renamed from: e, reason: collision with root package name */
        public boolean f14804e = false;
        public boolean f = false;

        public a(Activity activity) {
            this.f14801b = activity;
            this.f14802c = activity.hashCode();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
            if (this.f14801b == activity) {
                this.f14801b = null;
                this.f14804e = true;
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x003d, code lost:
        
            r5.f = true;
            r5.f14800a = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0042, code lost:
        
            return;
         */
        @Override // android.app.Application.ActivityLifecycleCallbacks
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void onActivityPaused(android.app.Activity r6) {
            /*
                r5 = this;
                boolean r0 = r5.f14804e
                if (r0 == 0) goto L42
                boolean r0 = r5.f
                if (r0 != 0) goto L42
                boolean r0 = r5.f14803d
                if (r0 != 0) goto L42
                java.lang.Object r0 = r5.f14800a
                int r1 = r5.f14802c
                r2 = 0
                r3 = 1
                java.lang.reflect.Field r4 = u.f.f14796c     // Catch: java.lang.Throwable -> L33
                java.lang.Object r4 = r4.get(r6)     // Catch: java.lang.Throwable -> L33
                if (r4 != r0) goto L3b
                int r0 = r6.hashCode()     // Catch: java.lang.Throwable -> L33
                if (r0 == r1) goto L21
                goto L3b
            L21:
                java.lang.reflect.Field r0 = u.f.f14795b     // Catch: java.lang.Throwable -> L33
                java.lang.Object r6 = r0.get(r6)     // Catch: java.lang.Throwable -> L33
                android.os.Handler r0 = u.f.f14799g     // Catch: java.lang.Throwable -> L33
                u.e r1 = new u.e     // Catch: java.lang.Throwable -> L33
                r1.<init>(r6, r4)     // Catch: java.lang.Throwable -> L33
                r0.postAtFrontOfQueue(r1)     // Catch: java.lang.Throwable -> L33
                r2 = r3
                goto L3b
            L33:
                r6 = move-exception
                java.lang.String r0 = "ActivityRecreator"
                java.lang.String r1 = "Exception while fetching field values"
                android.util.Log.e(r0, r1, r6)
            L3b:
                if (r2 == 0) goto L42
                r5.f = r3
                r6 = 0
                r5.f14800a = r6
            L42:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: u.f.a.onActivityPaused(android.app.Activity):void");
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(Activity activity) {
            if (this.f14801b == activity) {
                this.f14803d = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0082 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static {
        /*
            java.lang.Class<android.app.Activity> r0 = android.app.Activity.class
            android.os.Handler r1 = new android.os.Handler
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            r1.<init>(r2)
            u.f.f14799g = r1
            r1 = 0
            java.lang.String r2 = "android.app.ActivityThread"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch: java.lang.Throwable -> L15
            goto L16
        L15:
            r2 = r1
        L16:
            u.f.f14794a = r2
            r2 = 1
            java.lang.String r3 = "mMainThread"
            java.lang.reflect.Field r3 = r0.getDeclaredField(r3)     // Catch: java.lang.Throwable -> L23
            r3.setAccessible(r2)     // Catch: java.lang.Throwable -> L23
            goto L24
        L23:
            r3 = r1
        L24:
            u.f.f14795b = r3
            java.lang.String r3 = "mToken"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r3)     // Catch: java.lang.Throwable -> L30
            r0.setAccessible(r2)     // Catch: java.lang.Throwable -> L30
            goto L31
        L30:
            r0 = r1
        L31:
            u.f.f14796c = r0
            java.lang.Class<?> r0 = u.f.f14794a
            r3 = 3
            java.lang.String r4 = "performStopActivity"
            r5 = 2
            r6 = 0
            if (r0 != 0) goto L3d
            goto L53
        L3d:
            java.lang.Class[] r7 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L53
            java.lang.Class<android.os.IBinder> r8 = android.os.IBinder.class
            r7[r6] = r8     // Catch: java.lang.Throwable -> L53
            java.lang.Class r8 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> L53
            r7[r2] = r8     // Catch: java.lang.Throwable -> L53
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            r7[r5] = r8     // Catch: java.lang.Throwable -> L53
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r4, r7)     // Catch: java.lang.Throwable -> L53
            r0.setAccessible(r2)     // Catch: java.lang.Throwable -> L53
            goto L54
        L53:
            r0 = r1
        L54:
            u.f.f14797d = r0
            java.lang.Class<?> r0 = u.f.f14794a
            if (r0 != 0) goto L5b
            goto L6d
        L5b:
            java.lang.Class[] r7 = new java.lang.Class[r5]     // Catch: java.lang.Throwable -> L6d
            java.lang.Class<android.os.IBinder> r8 = android.os.IBinder.class
            r7[r6] = r8     // Catch: java.lang.Throwable -> L6d
            java.lang.Class r8 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> L6d
            r7[r2] = r8     // Catch: java.lang.Throwable -> L6d
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r4, r7)     // Catch: java.lang.Throwable -> L6d
            r0.setAccessible(r2)     // Catch: java.lang.Throwable -> L6d
            goto L6e
        L6d:
            r0 = r1
        L6e:
            u.f.f14798e = r0
            java.lang.Class<?> r0 = u.f.f14794a
            int r4 = android.os.Build.VERSION.SDK_INT
            r7 = 26
            if (r4 == r7) goto L7f
            r7 = 27
            if (r4 != r7) goto L7d
            goto L7f
        L7d:
            r4 = r6
            goto L80
        L7f:
            r4 = r2
        L80:
            if (r4 == 0) goto Lb9
            if (r0 != 0) goto L85
            goto Lb9
        L85:
            java.lang.String r4 = "requestRelaunchActivity"
            r7 = 9
            java.lang.Class[] r7 = new java.lang.Class[r7]     // Catch: java.lang.Throwable -> Lb9
            java.lang.Class<android.os.IBinder> r8 = android.os.IBinder.class
            r7[r6] = r8     // Catch: java.lang.Throwable -> Lb9
            java.lang.Class<java.util.List> r6 = java.util.List.class
            r7[r2] = r6     // Catch: java.lang.Throwable -> Lb9
            java.lang.Class<java.util.List> r6 = java.util.List.class
            r7[r5] = r6     // Catch: java.lang.Throwable -> Lb9
            java.lang.Class r5 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> Lb9
            r7[r3] = r5     // Catch: java.lang.Throwable -> Lb9
            r3 = 4
            java.lang.Class r5 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> Lb9
            r7[r3] = r5     // Catch: java.lang.Throwable -> Lb9
            r3 = 5
            java.lang.Class<android.content.res.Configuration> r6 = android.content.res.Configuration.class
            r7[r3] = r6     // Catch: java.lang.Throwable -> Lb9
            r3 = 6
            java.lang.Class<android.content.res.Configuration> r6 = android.content.res.Configuration.class
            r7[r3] = r6     // Catch: java.lang.Throwable -> Lb9
            r3 = 7
            r7[r3] = r5     // Catch: java.lang.Throwable -> Lb9
            r3 = 8
            r7[r3] = r5     // Catch: java.lang.Throwable -> Lb9
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r4, r7)     // Catch: java.lang.Throwable -> Lb9
            r0.setAccessible(r2)     // Catch: java.lang.Throwable -> Lb9
            r1 = r0
        Lb9:
            u.f.f = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: u.f.<clinit>():void");
    }
}
