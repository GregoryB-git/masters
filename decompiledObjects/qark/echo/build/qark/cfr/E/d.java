/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.res.Configuration
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.LocaleList
 *  java.lang.Object
 *  java.util.Locale
 */
package E;

import E.g;
import android.content.res.Configuration;
import android.os.Build;
import android.os.LocaleList;
import java.util.Locale;

public abstract class d {
    public static g a(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 24) {
            return g.d(a.a(configuration));
        }
        return g.a(configuration.locale);
    }

    public static abstract class a {
        public static LocaleList a(Configuration configuration) {
            return configuration.getLocales();
        }
    }

}

