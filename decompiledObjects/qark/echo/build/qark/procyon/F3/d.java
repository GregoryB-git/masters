// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package F3;

import android.os.BaseBundle;
import org.json.JSONException;
import E3.f;
import java.util.Iterator;
import org.json.JSONObject;
import android.os.Bundle;
import G3.a;

public class d implements b, G3.b
{
    public a a;
    
    public static String b(final String s, final Bundle bundle) {
        final JSONObject jsonObject = new JSONObject();
        final JSONObject jsonObject2 = new JSONObject();
        for (final String s2 : ((BaseBundle)bundle).keySet()) {
            jsonObject2.put(s2, ((BaseBundle)bundle).get(s2));
        }
        jsonObject.put("name", (Object)s);
        jsonObject.put("parameters", (Object)jsonObject2);
        return jsonObject.toString();
    }
    
    @Override
    public void a(final a a) {
        this.a = a;
        f.f().b("Registered Firebase Analytics event receiver for breadcrumbs");
    }
    
    @Override
    public void t(final String s, final Bundle bundle) {
        final a a = this.a;
        if (a == null) {
            return;
        }
        while (true) {
            while (true) {
                try {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("$A$:");
                    sb.append(b(s, bundle));
                    a.a(sb.toString());
                    return;
                    f.f().k("Unable to serialize Firebase Analytics event to breadcrumb.");
                    return;
                }
                catch (JSONException ex) {}
                continue;
            }
        }
    }
}
