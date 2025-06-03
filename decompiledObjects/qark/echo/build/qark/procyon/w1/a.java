// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package w1;

import android.net.Uri;
import android.content.Intent;
import android.util.Log;
import android.content.Context;

public final class a
{
    public void a(final Context context, final a a, final b b) {
        if (context == null) {
            Log.d("permissions_handler", "Context cannot be null.");
            b.a("PermissionHandler.AppSettingsManager", "Android context cannot be null.");
            return;
        }
        while (true) {
            try {
                final Intent intent = new Intent();
                intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
                intent.addCategory("android.intent.category.DEFAULT");
                final StringBuilder sb = new StringBuilder();
                sb.append("package:");
                sb.append(context.getPackageName());
                intent.setData(Uri.parse(sb.toString()));
                intent.addFlags(268435456);
                intent.addFlags(1073741824);
                intent.addFlags(8388608);
                context.startActivity(intent);
                a.a(true);
                return;
                a.a(false);
            }
            catch (Exception ex) {
                continue;
            }
            break;
        }
    }
    
    public interface a
    {
        void a(final boolean p0);
    }
}
