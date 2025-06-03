// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package Q4;

import android.os.BaseBundle;
import org.json.JSONObject;
import android.os.Bundle;
import w3.a;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import r4.b;

public class r
{
    public final b a;
    public final Map b;
    
    public r(final b a) {
        this.b = Collections.synchronizedMap(new HashMap<Object, Object>());
        this.a = a;
    }
    
    public void a(final String s, final com.google.firebase.remoteconfig.internal.b b) {
        final a a = (a)this.a.get();
        if (a == null) {
            return;
        }
        final JSONObject h = b.h();
        if (h.length() < 1) {
            return;
        }
        final JSONObject f = b.f();
        if (f.length() < 1) {
            return;
        }
        final JSONObject optJSONObject = h.optJSONObject(s);
        if (optJSONObject == null) {
            return;
        }
        final String optString = optJSONObject.optString("choiceId");
        if (optString.isEmpty()) {
            return;
        }
        Object b2 = this.b;
        // monitorenter(b2)
        while (true) {
            try {
                if (optString.equals(this.b.get(s))) {
                    // monitorexit(b2)
                    return;
                }
                this.b.put(s, optString);
                // monitorexit(b2)
                b2 = new Bundle();
                ((BaseBundle)b2).putString("arm_key", s);
                ((BaseBundle)b2).putString("arm_value", f.optString(s));
                ((BaseBundle)b2).putString("personalization_id", optJSONObject.optString("personalizationId"));
                ((BaseBundle)b2).putInt("arm_index", optJSONObject.optInt("armIndex", -1));
                ((BaseBundle)b2).putString("group", optJSONObject.optString("group"));
                a.e("fp", "personalization_assignment", (Bundle)b2);
                final Bundle bundle = new Bundle();
                ((BaseBundle)bundle).putString("_fpid", optString);
                a.e("fp", "_fpc", bundle);
                return;
                // monitorexit(b2)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
}
