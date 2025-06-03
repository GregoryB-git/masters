package R2;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;

/* renamed from: R2.k4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0544k4 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C3 f5377o;

    public C0544k4(C3 c32) {
        this.f5377o = c32;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00c8 A[Catch: RuntimeException -> 0x0028, TRY_ENTER, TryCatch #0 {RuntimeException -> 0x0028, blocks: (B:3:0x000b, B:5:0x0018, B:8:0x002c, B:10:0x0032, B:13:0x0043, B:19:0x00c8, B:21:0x00d4, B:24:0x00e5, B:26:0x00eb, B:29:0x0100, B:31:0x0106, B:34:0x0113, B:36:0x0119, B:37:0x012e, B:40:0x013a, B:44:0x0141, B:48:0x0164, B:49:0x0180, B:51:0x0171, B:52:0x0187, B:54:0x018d, B:56:0x0193, B:58:0x0199, B:60:0x019f, B:62:0x01a7, B:64:0x01af, B:66:0x01b5, B:69:0x01bb, B:71:0x0057, B:74:0x005f, B:76:0x0067, B:78:0x006d, B:80:0x0073, B:82:0x0079, B:84:0x0081, B:86:0x0089, B:89:0x0093, B:91:0x009b, B:92:0x00a7, B:94:0x00bf), top: B:2:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0140 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0141 A[Catch: RuntimeException -> 0x0028, TRY_LEAVE, TryCatch #0 {RuntimeException -> 0x0028, blocks: (B:3:0x000b, B:5:0x0018, B:8:0x002c, B:10:0x0032, B:13:0x0043, B:19:0x00c8, B:21:0x00d4, B:24:0x00e5, B:26:0x00eb, B:29:0x0100, B:31:0x0106, B:34:0x0113, B:36:0x0119, B:37:0x012e, B:40:0x013a, B:44:0x0141, B:48:0x0164, B:49:0x0180, B:51:0x0171, B:52:0x0187, B:54:0x018d, B:56:0x0193, B:58:0x0199, B:60:0x019f, B:62:0x01a7, B:64:0x01af, B:66:0x01b5, B:69:0x01bb, B:71:0x0057, B:74:0x005f, B:76:0x0067, B:78:0x006d, B:80:0x0073, B:82:0x0079, B:84:0x0081, B:86:0x0089, B:89:0x0093, B:91:0x009b, B:92:0x00a7, B:94:0x00bf), top: B:2:0x000b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ void a(R2.C0544k4 r17, boolean r18, android.net.Uri r19, java.lang.String r20, java.lang.String r21) {
        /*
            Method dump skipped, instructions count: 473
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: R2.C0544k4.a(R2.k4, boolean, android.net.Uri, java.lang.String, java.lang.String):void");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        try {
            try {
                this.f5377o.j().K().a("onActivityCreated");
                Intent intent = activity.getIntent();
                if (intent != null) {
                    Uri data = intent.getData();
                    if (data == null || !data.isHierarchical()) {
                        Bundle extras = intent.getExtras();
                        if (extras != null) {
                            String string = extras.getString("com.android.vending.referral_url");
                            if (!TextUtils.isEmpty(string)) {
                                data = Uri.parse(string);
                            }
                        }
                        data = null;
                    }
                    Uri uri = data;
                    if (uri != null && uri.isHierarchical()) {
                        this.f5377o.k();
                        this.f5377o.e().D(new RunnableC0572o4(this, bundle == null, uri, S5.e0(intent) ? "gs" : "auto", uri.getQueryParameter("referrer")));
                    }
                }
            } catch (RuntimeException e7) {
                this.f5377o.j().G().b("Throwable caught in onActivityCreated", e7);
            }
        } finally {
            this.f5377o.s().M(activity, bundle);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        this.f5377o.s().K(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        this.f5377o.s().Q(activity);
        C0552l5 u7 = this.f5377o.u();
        u7.e().D(new RunnableC0566n5(u7, u7.b().b()));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        C0552l5 u7 = this.f5377o.u();
        u7.e().D(new RunnableC0573o5(u7, u7.b().b()));
        this.f5377o.s().S(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        this.f5377o.s().R(activity, bundle);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
