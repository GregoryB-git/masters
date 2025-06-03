package b1;

import android.app.Activity;
import android.os.Bundle;
import b1.c0;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicBoolean f1756a = new AtomicBoolean(false);

    public static final class a extends f {
        @Override // b1.f, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            ec.i.e(activity, "activity");
            int i10 = c0.f1719b;
            c0.b.b(activity);
        }
    }
}
