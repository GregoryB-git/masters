package aa;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayDeque;
import x0.q0;

/* loaded from: classes.dex */
public final class k implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayDeque f323a = new ArrayDeque(10);

    /* JADX WARN: Removed duplicated region for block: B:18:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(android.content.Intent r6) {
        /*
            r5 = this;
            java.lang.String r0 = "FirebaseMessaging"
            android.os.Bundle r6 = r6.getExtras()     // Catch: java.lang.RuntimeException -> L31
            if (r6 == 0) goto L37
            java.lang.String r1 = "google.message_id"
            java.lang.String r1 = r6.getString(r1)     // Catch: java.lang.RuntimeException -> L31
            if (r1 != 0) goto L16
            java.lang.String r1 = "message_id"
            java.lang.String r1 = r6.getString(r1)     // Catch: java.lang.RuntimeException -> L31
        L16:
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.RuntimeException -> L31
            if (r2 != 0) goto L2a
            java.util.ArrayDeque r2 = r5.f323a     // Catch: java.lang.RuntimeException -> L31
            boolean r2 = r2.contains(r1)     // Catch: java.lang.RuntimeException -> L31
            if (r2 == 0) goto L25
            return
        L25:
            java.util.ArrayDeque r2 = r5.f323a     // Catch: java.lang.RuntimeException -> L31
            r2.add(r1)     // Catch: java.lang.RuntimeException -> L31
        L2a:
            java.lang.String r1 = "gcm.n.analytics_data"
            android.os.Bundle r6 = r6.getBundle(r1)     // Catch: java.lang.RuntimeException -> L31
            goto L38
        L31:
            r6 = move-exception
            java.lang.String r1 = "Failed trying to get analytics data from Intent extras."
            android.util.Log.w(r0, r1, r6)
        L37:
            r6 = 0
        L38:
            java.lang.String r1 = "1"
            if (r6 != 0) goto L3e
            r2 = 0
            goto L48
        L3e:
            java.lang.String r2 = "google.c.a.e"
            java.lang.String r2 = r6.getString(r2)
            boolean r2 = r1.equals(r2)
        L48:
            if (r2 == 0) goto Lb2
            if (r6 != 0) goto L4d
            goto Lad
        L4d:
            java.lang.String r2 = "google.c.a.tc"
            java.lang.String r2 = r6.getString(r2)
            boolean r1 = r1.equals(r2)
            r2 = 3
            if (r1 == 0) goto La2
            u7.f r1 = u7.f.e()
            java.lang.Class<w7.a> r3 = w7.a.class
            java.lang.Object r1 = r1.c(r3)
            w7.a r1 = (w7.a) r1
            boolean r2 = android.util.Log.isLoggable(r0, r2)
            if (r2 == 0) goto L71
            java.lang.String r2 = "Received event with track-conversion=true. Setting user property and reengagement event"
            android.util.Log.d(r0, r2)
        L71:
            if (r1 == 0) goto L9c
            java.lang.String r0 = "google.c.a.c_id"
            java.lang.String r0 = r6.getString(r0)
            r1.c(r0)
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            java.lang.String r3 = "source"
            java.lang.String r4 = "Firebase"
            r2.putString(r3, r4)
            java.lang.String r3 = "medium"
            java.lang.String r4 = "notification"
            r2.putString(r3, r4)
            java.lang.String r3 = "campaign"
            r2.putString(r3, r0)
            java.lang.String r0 = "fcm"
            java.lang.String r3 = "_cmp"
            r1.b(r0, r3, r2)
            goto Lad
        L9c:
            java.lang.String r1 = "Unable to set user property for conversion tracking:  analytics library is missing"
            android.util.Log.w(r0, r1)
            goto Lad
        La2:
            boolean r1 = android.util.Log.isLoggable(r0, r2)
            if (r1 == 0) goto Lad
            java.lang.String r1 = "Received event with track-conversion=false. Do not set user property"
            android.util.Log.d(r0, r1)
        Lad:
            java.lang.String r0 = "_no"
            aa.q.c(r6, r0)
        Lb2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: aa.k.a(android.content.Intent):void");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Intent intent = activity.getIntent();
        if (intent == null) {
            return;
        }
        if (Build.VERSION.SDK_INT <= 25) {
            new Handler(Looper.getMainLooper()).post(new q0(16, this, intent));
        } else {
            a(intent);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
