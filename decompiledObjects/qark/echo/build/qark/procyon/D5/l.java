// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package D5;

import java.util.Iterator;
import java.util.Locale;
import java.util.ArrayList;
import t5.b;
import java.util.List;
import E5.c;
import E5.g;
import org.json.JSONException;
import org.json.JSONObject;
import E5.j;
import w5.a;
import E5.k;

public class l
{
    public final k a;
    public b b;
    public final k.c c;
    
    public l(final a a) {
        final k.c c = new k.c() {
            @Override
            public void onMethodCall(final j j, final d d) {
                if (l.a(l.this) == null) {
                    return;
                }
                final String a = j.a;
                a.hashCode();
                if (!a.equals("Localization.getStringResource")) {
                    d.c();
                    return;
                }
                while (true) {
                    final JSONObject jsonObject = (JSONObject)j.b();
                    while (true) {
                        Label_0110: {
                            while (true) {
                                try {
                                    final String string = jsonObject.getString("key");
                                    if (jsonObject.has("locale")) {
                                        final String string2 = jsonObject.getString("locale");
                                        d.a(l.a(l.this).a(string, string2));
                                        return;
                                    }
                                    break Label_0110;
                                    final JSONException ex;
                                    d.b("error", ((Throwable)ex).getMessage(), null);
                                    return;
                                }
                                catch (JSONException ex) {
                                    continue;
                                }
                                break;
                            }
                        }
                        final String string2 = null;
                        continue;
                    }
                }
            }
        };
        this.c = c;
        (this.a = new k(a, "flutter/localization", g.a)).e((k.c)c);
    }
    
    public static /* synthetic */ b a(final l l) {
        return l.b;
    }
    
    public void b(final List list) {
        t5.b.f("LocalizationChannel", "Sending Locales to Flutter.");
        final ArrayList<String> list2 = new ArrayList<String>();
        for (final Locale locale : list) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Locale (Language: ");
            sb.append(locale.getLanguage());
            sb.append(", Country: ");
            sb.append(locale.getCountry());
            sb.append(", Variant: ");
            sb.append(locale.getVariant());
            sb.append(")");
            t5.b.f("LocalizationChannel", sb.toString());
            list2.add(locale.getLanguage());
            list2.add(locale.getCountry());
            list2.add(locale.getScript());
            list2.add(locale.getVariant());
        }
        this.a.c("setLocale", list2);
    }
    
    public void c(final b b) {
        this.b = b;
    }
    
    public interface b
    {
        String a(final String p0, final String p1);
    }
}
