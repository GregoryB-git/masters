// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package A2;

import android.net.Uri$Builder;
import android.text.TextUtils;
import android.content.Intent;
import android.net.Uri;

public abstract class l0
{
    public static final Uri a;
    public static final Uri b;
    
    static {
        b = (a = Uri.parse("https://plus.google.com/")).buildUpon().appendPath("circles").appendPath("find").build();
    }
    
    public static Intent a() {
        final Intent intent = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
        intent.setPackage("com.google.android.wearable.app");
        return intent;
    }
    
    public static Intent b(final String s, final String s2) {
        final Intent intent = new Intent("android.intent.action.VIEW");
        final Uri$Builder appendQueryParameter = Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.gms");
        if (!TextUtils.isEmpty((CharSequence)s2)) {
            appendQueryParameter.appendQueryParameter("pcampaignid", s2);
        }
        intent.setData(appendQueryParameter.build());
        intent.setPackage("com.android.vending");
        intent.addFlags(524288);
        return intent;
    }
    
    public static Intent c(final String s) {
        final Uri fromParts = Uri.fromParts("package", "com.google.android.gms", (String)null);
        final Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(fromParts);
        return intent;
    }
}
