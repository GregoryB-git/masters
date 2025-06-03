package f8;

import android.os.Bundle;
import android.util.Log;
import java.util.Locale;
import w7.a;

/* loaded from: classes.dex */
public final class b implements a.InterfaceC0254a {

    /* renamed from: a, reason: collision with root package name */
    public h8.b f5480a;

    /* renamed from: b, reason: collision with root package name */
    public h8.b f5481b;

    public final void a(int i10, Bundle bundle) {
        String format = String.format(Locale.US, "Analytics listener received message. ID: %d, Extras: %s", Integer.valueOf(i10), bundle);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", format, null);
        }
        String string = bundle.getString("name");
        if (string != null) {
            Bundle bundle2 = bundle.getBundle("params");
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            h8.b bVar = "clx".equals(bundle2.getString("_o")) ? this.f5480a : this.f5481b;
            if (bVar == null) {
                return;
            }
            bVar.b(bundle2, string);
        }
    }
}
