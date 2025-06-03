/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  android.net.Uri
 *  android.net.Uri$Builder
 *  android.text.TextUtils
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 */
package A2;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;

public abstract class l0 {
    public static final Uri a;
    public static final Uri b;

    static {
        Uri uri;
        a = uri = Uri.parse((String)"https://plus.google.com/");
        b = uri.buildUpon().appendPath("circles").appendPath("find").build();
    }

    public static Intent a() {
        Intent intent = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
        intent.setPackage("com.google.android.wearable.app");
        return intent;
    }

    public static Intent b(String string2, String string3) {
        string2 = new Intent("android.intent.action.VIEW");
        Uri.Builder builder = Uri.parse((String)"market://details").buildUpon().appendQueryParameter("id", "com.google.android.gms");
        if (!TextUtils.isEmpty((CharSequence)string3)) {
            builder.appendQueryParameter("pcampaignid", string3);
        }
        string2.setData(builder.build());
        string2.setPackage("com.android.vending");
        string2.addFlags(524288);
        return string2;
    }

    public static Intent c(String string2) {
        string2 = Uri.fromParts((String)"package", (String)"com.google.android.gms", (String)null);
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData((Uri)string2);
        return intent;
    }
}

