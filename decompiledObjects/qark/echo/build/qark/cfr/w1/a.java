/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.net.Uri
 *  android.util.Log
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package w1;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import w1.b;

public final class a {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void a(Context context, a a8, b b8) {
        if (context == null) {
            Log.d((String)"permissions_handler", (String)"Context cannot be null.");
            b8.a("PermissionHandler.AppSettingsManager", "Android context cannot be null.");
            return;
        }
        try {
            b8 = new Intent();
            b8.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
            b8.addCategory("android.intent.category.DEFAULT");
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("package:");
            stringBuilder.append(context.getPackageName());
            b8.setData(Uri.parse((String)stringBuilder.toString()));
            b8.addFlags(268435456);
            b8.addFlags(1073741824);
            b8.addFlags(8388608);
            context.startActivity((Intent)b8);
            a8.a(true);
            return;
        }
        catch (Exception exception) {}
        a8.a(false);
    }

    public static interface a {
        public void a(boolean var1);
    }

}

