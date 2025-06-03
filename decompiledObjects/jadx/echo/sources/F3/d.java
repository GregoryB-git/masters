package F3;

import android.os.Bundle;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class d implements b, G3.b {

    /* renamed from: a, reason: collision with root package name */
    public G3.a f1982a;

    public static String b(String str, Bundle bundle) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (String str2 : bundle.keySet()) {
            jSONObject2.put(str2, bundle.get(str2));
        }
        jSONObject.put("name", str);
        jSONObject.put("parameters", jSONObject2);
        return jSONObject.toString();
    }

    @Override // G3.b
    public void a(G3.a aVar) {
        this.f1982a = aVar;
        E3.f.f().b("Registered Firebase Analytics event receiver for breadcrumbs");
    }

    @Override // F3.b
    public void t(String str, Bundle bundle) {
        G3.a aVar = this.f1982a;
        if (aVar != null) {
            try {
                aVar.a("$A$:" + b(str, bundle));
            } catch (JSONException unused) {
                E3.f.f().k("Unable to serialize Firebase Analytics event to breadcrumb.");
            }
        }
    }
}
