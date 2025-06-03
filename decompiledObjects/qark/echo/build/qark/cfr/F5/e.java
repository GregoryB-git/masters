/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Configuration
 *  android.content.res.Resources
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.LocaleList
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Locale
 */
package F5;

import D5.l;
import E.l;
import F5.a;
import F5.b;
import F5.c;
import F5.d;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.LocaleList;
import g0.J;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public class e {
    public final D5.l a;
    public final Context b;
    public final l.b c;

    public e(Context context, D5.l l8) {
        l.b b8;
        this.c = b8 = new l.b(){

            @Override
            public String a(String string2, String string3) {
                Context context = e.this.b;
                if (string3 != null) {
                    string3 = e.b(string3);
                    context = new Configuration(e.this.b.getResources().getConfiguration());
                    context.setLocale((Locale)string3);
                    context = e.this.b.createConfigurationContext((Configuration)context);
                }
                string3 = e.this.b.getPackageName();
                int n8 = context.getResources().getIdentifier(string2, "string", string3);
                if (n8 != 0) {
                    return context.getResources().getString(n8);
                }
                return null;
            }
        };
        this.b = context;
        this.a = l8;
        l8.c(b8);
    }

    public static Locale b(String string2) {
        String[] arrstring = string2.replace('_', '-').split("-", -1);
        String string3 = arrstring[0];
        int n8 = arrstring.length;
        String string4 = "";
        int n9 = 1;
        if (n8 > 1 && arrstring[1].length() == 4) {
            string2 = arrstring[1];
            n9 = 2;
        } else {
            string2 = "";
        }
        String string5 = string4;
        if (arrstring.length > n9) {
            string5 = string4;
            if (arrstring[n9].length() >= 2) {
                string5 = string4;
                if (arrstring[n9].length() <= 3) {
                    string5 = arrstring[n9];
                }
            }
        }
        return new Locale(string3, string5, string2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public Locale c(List list) {
        if (list == null) return null;
        if (list.isEmpty()) {
            return null;
        }
        int n8 = Build.VERSION.SDK_INT;
        if (n8 >= 26) {
            ArrayList arrayList = new ArrayList();
            LocaleList localeList = J.a(this.b.getResources().getConfiguration());
            int n9 = a.a(localeList);
            n8 = 0;
            do {
                Object object;
                Object object2;
                if (n8 >= n9) {
                    object2 = b.a((List)arrayList, (Collection)list);
                    if (object2 == null) return (Locale)list.get(0);
                    return object2;
                }
                Locale locale = l.a(localeList, n8);
                object2 = object = locale.getLanguage();
                if (!locale.getScript().isEmpty()) {
                    object2 = new StringBuilder();
                    object2.append((String)object);
                    object2.append("-");
                    object2.append(locale.getScript());
                    object2 = object2.toString();
                }
                object = object2;
                if (!locale.getCountry().isEmpty()) {
                    object = new StringBuilder();
                    object.append((String)object2);
                    object.append("-");
                    object.append(locale.getCountry());
                    object = object.toString();
                }
                arrayList.add((Object)c.a((String)object));
                d.a();
                arrayList.add((Object)c.a(locale.getLanguage()));
                d.a();
                object2 = new StringBuilder();
                object2.append(locale.getLanguage());
                object2.append("-*");
                arrayList.add((Object)c.a(object2.toString()));
                ++n8;
            } while (true);
        }
        if (n8 < 24) {
            Locale locale3;
            Locale locale2 = this.b.getResources().getConfiguration().locale;
            if (locale2 == null) return (Locale)list.get(0);
            for (Locale locale3 : list) {
                if (!locale2.equals((Object)locale3)) continue;
                return locale3;
            }
            Iterator iterator = list.iterator();
            do {
                if (!iterator.hasNext()) return (Locale)list.get(0);
                locale3 = (Locale)iterator.next();
            } while (!locale2.getLanguage().equals((Object)locale3.toString()));
            return locale3;
        }
        LocaleList localeList = J.a(this.b.getResources().getConfiguration());
        n8 = 0;
        while (n8 < a.a(localeList)) {
            Locale locale = l.a(localeList, n8);
            for (Locale locale4 : list) {
                if (!locale.equals((Object)locale4)) continue;
                return locale4;
            }
            for (Locale locale4 : list) {
                if (!locale.getLanguage().equals((Object)locale4.toLanguageTag())) continue;
                return locale4;
            }
            for (Locale locale4 : list) {
                if (!locale.getLanguage().equals((Object)locale4.getLanguage())) continue;
                return locale4;
            }
            ++n8;
        }
        return (Locale)list.get(0);
    }

    public void d(Configuration configuration) {
        ArrayList arrayList = new ArrayList();
        if (Build.VERSION.SDK_INT >= 24) {
            configuration = J.a(configuration);
            int n8 = a.a((LocaleList)configuration);
            for (int i8 = 0; i8 < n8; ++i8) {
                arrayList.add((Object)l.a((LocaleList)configuration, i8));
            }
        } else {
            arrayList.add((Object)configuration.locale);
        }
        this.a.b((List)arrayList);
    }

}

