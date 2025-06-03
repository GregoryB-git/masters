package b1;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import b1.k;
import b1.z;

/* loaded from: classes.dex */
public final class a0 extends f {
    public final /* synthetic */ z this$0;

    public static final class a extends f {
        public final /* synthetic */ z this$0;

        public a(z zVar) {
            this.this$0 = zVar;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            ec.i.e(activity, "activity");
            this.this$0.a();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            ec.i.e(activity, "activity");
            z zVar = this.this$0;
            int i10 = zVar.f1803a + 1;
            zVar.f1803a = i10;
            if (i10 == 1 && zVar.f1806d) {
                zVar.f.f(k.a.ON_START);
                zVar.f1806d = false;
            }
        }
    }

    public a0(z zVar) {
        this.this$0 = zVar;
    }

    @Override // b1.f, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        ec.i.e(activity, "activity");
        if (Build.VERSION.SDK_INT < 29) {
            int i10 = c0.f1719b;
            Fragment findFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            ec.i.c(findFragmentByTag, "null cannot be cast to non-null type androidx.lifecycle.ReportFragment");
            ((c0) findFragmentByTag).f1720a = this.this$0.f1809p;
        }
    }

    @Override // b1.f, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        ec.i.e(activity, "activity");
        z zVar = this.this$0;
        int i10 = zVar.f1804b - 1;
        zVar.f1804b = i10;
        if (i10 == 0) {
            Handler handler = zVar.f1807e;
            ec.i.b(handler);
            handler.postDelayed(zVar.f1808o, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        ec.i.e(activity, "activity");
        z.a.a(activity, new a(this.this$0));
    }

    @Override // b1.f, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        ec.i.e(activity, "activity");
        z zVar = this.this$0;
        int i10 = zVar.f1803a - 1;
        zVar.f1803a = i10;
        if (i10 == 0 && zVar.f1805c) {
            zVar.f.f(k.a.ON_STOP);
            zVar.f1806d = true;
        }
    }
}
