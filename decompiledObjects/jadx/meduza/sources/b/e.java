package b;

import android.app.Activity;
import android.content.Intent;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements dc.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1591a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Activity f1592b;

    public /* synthetic */ e(Activity activity, int i10) {
        this.f1591a = i10;
        this.f1592b = activity;
    }

    @Override // dc.a
    public final Object invoke() {
        rb.h lambda$new$0;
        switch (this.f1591a) {
            case 0:
                lambda$new$0 = ((j) this.f1592b).lambda$new$0();
                return lambda$new$0;
            default:
                Activity activity = this.f1592b;
                Intent launchIntentForPackage = activity.getPackageManager().getLaunchIntentForPackage(activity.getPackageName());
                if (launchIntentForPackage != null) {
                    launchIntentForPackage.setPackage(null);
                }
                if (launchIntentForPackage != null) {
                    launchIntentForPackage.setFlags(67108864);
                }
                activity.startActivity(launchIntentForPackage);
                return rb.h.f13851a;
        }
    }
}
