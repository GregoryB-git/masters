// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package E;

import android.os.LocaleList;
import java.util.Locale;
import android.os.Build$VERSION;
import android.content.res.Configuration;

public abstract class d
{
    public static g a(final Configuration configuration) {
        if (Build$VERSION.SDK_INT >= 24) {
            return g.d(a.a(configuration));
        }
        return g.a(configuration.locale);
    }
    
    public abstract static class a
    {
        public static LocaleList a(final Configuration configuration) {
            return configuration.getLocales();
        }
    }
}
