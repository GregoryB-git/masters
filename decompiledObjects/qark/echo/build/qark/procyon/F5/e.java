// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package F5;

import java.util.Iterator;
import android.os.LocaleList;
import java.util.Collection;
import g0.J;
import java.util.ArrayList;
import android.os.Build$VERSION;
import java.util.List;
import java.util.Locale;
import android.content.res.Configuration;
import android.content.Context;
import D5.l;

public class e
{
    public final l a;
    public final Context b;
    public final l.b c;
    
    public e(final Context b, final l a) {
        final l.b c = new l.b() {
            @Override
            public String a(final String s, String packageName) {
                Context context = e.a(e.this);
                if (packageName != null) {
                    final Locale b = e.b(packageName);
                    final Configuration configuration = new Configuration(e.a(e.this).getResources().getConfiguration());
                    configuration.setLocale(b);
                    context = e.a(e.this).createConfigurationContext(configuration);
                }
                packageName = e.a(e.this).getPackageName();
                final int identifier = context.getResources().getIdentifier(s, "string", packageName);
                if (identifier != 0) {
                    return context.getResources().getString(identifier);
                }
                return null;
            }
        };
        this.c = c;
        this.b = b;
        (this.a = a).c((l.b)c);
    }
    
    public static /* synthetic */ Context a(final e e) {
        return e.b;
    }
    
    public static Locale b(String variant) {
        final String[] split = variant.replace('_', '-').split("-", -1);
        final String language = split[0];
        final int length = split.length;
        final String s = "";
        int n = 1;
        if (length > 1 && split[1].length() == 4) {
            variant = split[1];
            n = 2;
        }
        else {
            variant = "";
        }
        String country = s;
        if (split.length > n) {
            country = s;
            if (split[n].length() >= 2) {
                country = s;
                if (split[n].length() <= 3) {
                    country = split[n];
                }
            }
        }
        return new Locale(language, country, variant);
    }
    
    public Locale c(final List list) {
        if (list != null && !list.isEmpty()) {
            final int sdk_INT = Build$VERSION.SDK_INT;
            if (sdk_INT >= 26) {
                final ArrayList<Locale.LanguageRange> list2 = new ArrayList<Locale.LanguageRange>();
                final LocaleList a = J.a(this.b.getResources().getConfiguration());
                for (int a2 = F5.a.a(a), i = 0; i < a2; ++i) {
                    final Locale a3 = E.l.a(a, i);
                    String str2;
                    final String str = str2 = a3.getLanguage();
                    if (!a3.getScript().isEmpty()) {
                        final StringBuilder sb = new StringBuilder();
                        sb.append(str);
                        sb.append("-");
                        sb.append(a3.getScript());
                        str2 = sb.toString();
                    }
                    String string = str2;
                    if (!a3.getCountry().isEmpty()) {
                        final StringBuilder sb2 = new StringBuilder();
                        sb2.append(str2);
                        sb2.append("-");
                        sb2.append(a3.getCountry());
                        string = sb2.toString();
                    }
                    list2.add(F5.c.a(string));
                    d.a();
                    list2.add(F5.c.a(a3.getLanguage()));
                    d.a();
                    final StringBuilder sb3 = new StringBuilder();
                    sb3.append(a3.getLanguage());
                    sb3.append("-*");
                    list2.add(F5.c.a(sb3.toString()));
                }
                final Locale a4 = F5.b.a((List)list2, (Collection)list);
                if (a4 != null) {
                    return a4;
                }
            }
            else if (sdk_INT >= 24) {
                final LocaleList a5 = J.a(this.b.getResources().getConfiguration());
                for (int j = 0; j < F5.a.a(a5); ++j) {
                    final Locale a6 = E.l.a(a5, j);
                    for (final Locale obj : list) {
                        if (a6.equals(obj)) {
                            return obj;
                        }
                    }
                    for (final Locale locale : list) {
                        if (a6.getLanguage().equals(locale.toLanguageTag())) {
                            return locale;
                        }
                    }
                    for (final Locale locale2 : list) {
                        if (a6.getLanguage().equals(locale2.getLanguage())) {
                            return locale2;
                        }
                    }
                }
            }
            else {
                final Locale locale3 = this.b.getResources().getConfiguration().locale;
                if (locale3 != null) {
                    for (final Locale obj2 : list) {
                        if (locale3.equals(obj2)) {
                            return obj2;
                        }
                    }
                    for (final Locale locale4 : list) {
                        if (locale3.getLanguage().equals(locale4.toString())) {
                            return locale4;
                        }
                    }
                }
            }
            return list.get(0);
        }
        return null;
    }
    
    public void d(final Configuration configuration) {
        final ArrayList<Locale> list = new ArrayList<Locale>();
        if (Build$VERSION.SDK_INT >= 24) {
            final LocaleList a = J.a(configuration);
            for (int a2 = F5.a.a(a), i = 0; i < a2; ++i) {
                list.add(E.l.a(a, i));
            }
        }
        else {
            list.add(configuration.locale);
        }
        this.a.b(list);
    }
}
