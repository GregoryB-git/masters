package R2;

import A2.AbstractC0328n;
import android.content.Context;
import android.content.Intent;

/* renamed from: R2.v2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0618v2 {

    /* renamed from: a, reason: collision with root package name */
    public final a f5552a;

    /* renamed from: R2.v2$a */
    public interface a {
        void a(Context context, Intent intent);
    }

    public C0618v2(a aVar) {
        AbstractC0328n.i(aVar);
        this.f5552a = aVar;
    }

    public final void a(Context context, Intent intent) {
        Y1 j7 = N2.c(context, null, null).j();
        if (intent == null) {
            j7.L().a("Receiver called with null intent");
            return;
        }
        String action = intent.getAction();
        j7.K().b("Local receiver got", action);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(action)) {
            if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
                j7.L().a("Install Referrer Broadcasts are deprecated");
            }
        } else {
            Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
            className.setAction("com.google.android.gms.measurement.UPLOAD");
            j7.K().a("Starting wakeful intent.");
            this.f5552a.a(context, className);
        }
    }
}
