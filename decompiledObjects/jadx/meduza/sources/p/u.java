package p;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.os.Bundle;
import android.support.customtabs.ICustomTabsCallback;
import android.support.customtabs.ICustomTabsService;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: b, reason: collision with root package name */
    public final ICustomTabsService f12745b;

    /* renamed from: c, reason: collision with root package name */
    public final ICustomTabsCallback f12746c;

    /* renamed from: d, reason: collision with root package name */
    public final ComponentName f12747d;

    /* renamed from: a, reason: collision with root package name */
    public final Object f12744a = new Object();

    /* renamed from: e, reason: collision with root package name */
    public final PendingIntent f12748e = null;

    public u(ICustomTabsService iCustomTabsService, m mVar, ComponentName componentName) {
        this.f12745b = iCustomTabsService;
        this.f12746c = mVar;
        this.f12747d = componentName;
    }

    public final Bundle a(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            bundle2.putAll(bundle);
        }
        PendingIntent pendingIntent = this.f12748e;
        if (pendingIntent != null) {
            bundle2.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
        }
        return bundle2;
    }
}
