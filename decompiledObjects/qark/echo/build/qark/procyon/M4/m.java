// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package M4;

import android.content.res.Resources;
import F4.a;
import android.content.Context;
import java.net.URI;

public abstract class m
{
    public static String[] a;
    
    public static boolean a(final URI uri, final Context context) {
        final Resources resources = context.getResources();
        final int identifier = resources.getIdentifier("firebase_performance_whitelisted_domains", "array", context.getPackageName());
        if (identifier == 0) {
            return true;
        }
        F4.a.e().a("Detected domain allowlist, only allowlisted domains will be measured.");
        if (m.a == null) {
            m.a = resources.getStringArray(identifier);
        }
        final String host = uri.getHost();
        if (host == null) {
            return true;
        }
        final String[] a = m.a;
        for (int length = a.length, i = 0; i < length; ++i) {
            if (host.contains(a[i])) {
                return true;
            }
        }
        return false;
    }
}
