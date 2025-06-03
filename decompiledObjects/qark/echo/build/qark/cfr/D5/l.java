/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.List
 *  java.util.Locale
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package D5;

import E5.c;
import E5.g;
import E5.j;
import E5.k;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;
import w5.a;

public class l {
    public final k a;
    public b b;
    public final k.c c;

    public l(a object) {
        k.c c8;
        this.c = c8 = new k.c(){

            /*
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             */
            @Override
            public void onMethodCall(j object, k.d d8) {
                if (l.this.b == null) {
                    return;
                }
                String string2 = object.a;
                string2.hashCode();
                if (!string2.equals((Object)"Localization.getStringResource")) {
                    d8.c();
                    return;
                }
                object = (JSONObject)object.b();
                try {
                    string2 = object.getString("key");
                    object = object.has("locale") ? object.getString("locale") : null;
                }
                catch (JSONException jSONException) {}
                d8.b("error", jSONException.getMessage(), null);
                return;
                d8.a(l.this.b.a(string2, (String)object));
            }
        };
        this.a = object = new k((c)object, "flutter/localization", g.a);
        object.e(c8);
    }

    public void b(List list) {
        t5.b.f("LocalizationChannel", "Sending Locales to Flutter.");
        ArrayList arrayList = new ArrayList();
        for (Locale locale : list) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Locale (Language: ");
            stringBuilder.append(locale.getLanguage());
            stringBuilder.append(", Country: ");
            stringBuilder.append(locale.getCountry());
            stringBuilder.append(", Variant: ");
            stringBuilder.append(locale.getVariant());
            stringBuilder.append(")");
            t5.b.f("LocalizationChannel", stringBuilder.toString());
            arrayList.add((Object)locale.getLanguage());
            arrayList.add((Object)locale.getCountry());
            arrayList.add((Object)locale.getScript());
            arrayList.add((Object)locale.getVariant());
        }
        this.a.c("setLocale", (Object)arrayList);
    }

    public void c(b b8) {
        this.b = b8;
    }

    public static interface b {
        public String a(String var1, String var2);
    }

}

