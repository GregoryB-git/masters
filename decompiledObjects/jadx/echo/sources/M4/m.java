package M4;

import android.content.Context;
import android.content.res.Resources;
import java.net.URI;

/* loaded from: classes.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    public static String[] f3562a;

    public static boolean a(URI uri, Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("firebase_performance_whitelisted_domains", "array", context.getPackageName());
        if (identifier == 0) {
            return true;
        }
        F4.a.e().a("Detected domain allowlist, only allowlisted domains will be measured.");
        if (f3562a == null) {
            f3562a = resources.getStringArray(identifier);
        }
        String host = uri.getHost();
        if (host == null) {
            return true;
        }
        for (String str : f3562a) {
            if (host.contains(str)) {
                return true;
            }
        }
        return false;
    }
}
