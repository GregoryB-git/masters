package D5;

import E5.k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;
import t5.AbstractC1995b;
import w5.C2105a;

/* loaded from: classes.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    public final E5.k f1305a;

    /* renamed from: b, reason: collision with root package name */
    public b f1306b;

    /* renamed from: c, reason: collision with root package name */
    public final k.c f1307c;

    public class a implements k.c {
        public a() {
        }

        @Override // E5.k.c
        public void onMethodCall(E5.j jVar, k.d dVar) {
            if (l.this.f1306b == null) {
                return;
            }
            String str = jVar.f1670a;
            str.hashCode();
            if (!str.equals("Localization.getStringResource")) {
                dVar.c();
                return;
            }
            JSONObject jSONObject = (JSONObject) jVar.b();
            try {
                dVar.a(l.this.f1306b.a(jSONObject.getString("key"), jSONObject.has("locale") ? jSONObject.getString("locale") : null));
            } catch (JSONException e7) {
                dVar.b("error", e7.getMessage(), null);
            }
        }
    }

    public interface b {
        String a(String str, String str2);
    }

    public l(C2105a c2105a) {
        a aVar = new a();
        this.f1307c = aVar;
        E5.k kVar = new E5.k(c2105a, "flutter/localization", E5.g.f1669a);
        this.f1305a = kVar;
        kVar.e(aVar);
    }

    public void b(List list) {
        AbstractC1995b.f("LocalizationChannel", "Sending Locales to Flutter.");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Locale locale = (Locale) it.next();
            AbstractC1995b.f("LocalizationChannel", "Locale (Language: " + locale.getLanguage() + ", Country: " + locale.getCountry() + ", Variant: " + locale.getVariant() + ")");
            arrayList.add(locale.getLanguage());
            arrayList.add(locale.getCountry());
            arrayList.add(locale.getScript());
            arrayList.add(locale.getVariant());
        }
        this.f1305a.c("setLocale", arrayList);
    }

    public void c(b bVar) {
        this.f1306b = bVar;
    }
}
