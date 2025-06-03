/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.net.URI
 */
package M4;

import F4.a;
import android.content.Context;
import android.content.res.Resources;
import java.net.URI;

public abstract class m {
    public static String[] a;

    public static boolean a(URI object, Context arrstring) {
        Resources resources = arrstring.getResources();
        int n8 = resources.getIdentifier("firebase_performance_whitelisted_domains", "array", arrstring.getPackageName());
        if (n8 == 0) {
            return true;
        }
        a.e().a("Detected domain allowlist, only allowlisted domains will be measured.");
        if (a == null) {
            a = resources.getStringArray(n8);
        }
        if ((object = object.getHost()) == null) {
            return true;
        }
        arrstring = a;
        int n9 = arrstring.length;
        for (n8 = 0; n8 < n9; ++n8) {
            if (!object.contains((CharSequence)arrstring[n8])) continue;
            return true;
        }
        return false;
    }
}

