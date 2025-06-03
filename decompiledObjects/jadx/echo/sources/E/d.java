package E;

import android.content.res.Configuration;
import android.os.Build;
import android.os.LocaleList;

/* loaded from: classes.dex */
public abstract class d {

    public static class a {
        public static LocaleList a(Configuration configuration) {
            return configuration.getLocales();
        }
    }

    public static g a(Configuration configuration) {
        return Build.VERSION.SDK_INT >= 24 ? g.d(a.a(configuration)) : g.a(configuration.locale);
    }
}
