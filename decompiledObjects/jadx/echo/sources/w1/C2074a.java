package w1;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;

/* renamed from: w1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2074a {

    /* renamed from: w1.a$a, reason: collision with other inner class name */
    public interface InterfaceC0287a {
        void a(boolean z7);
    }

    public void a(Context context, InterfaceC0287a interfaceC0287a, b bVar) {
        if (context == null) {
            Log.d("permissions_handler", "Context cannot be null.");
            bVar.a("PermissionHandler.AppSettingsManager", "Android context cannot be null.");
            return;
        }
        try {
            Intent intent = new Intent();
            intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.addCategory("android.intent.category.DEFAULT");
            intent.setData(Uri.parse("package:" + context.getPackageName()));
            intent.addFlags(268435456);
            intent.addFlags(1073741824);
            intent.addFlags(8388608);
            context.startActivity(intent);
            interfaceC0287a.a(true);
        } catch (Exception unused) {
            interfaceC0287a.a(false);
        }
    }
}
