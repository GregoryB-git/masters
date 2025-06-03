package a0;

import android.content.res.Configuration;
import android.os.LocaleList;

/* loaded from: classes.dex */
public final class f {
    public static LocaleList a(Configuration configuration) {
        LocaleList locales;
        locales = configuration.getLocales();
        return locales;
    }

    public static void b(Configuration configuration, i iVar) {
        configuration.setLocales((LocaleList) iVar.f7a.b());
    }
}
