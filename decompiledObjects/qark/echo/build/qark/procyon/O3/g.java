// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package O3;

import org.json.JSONObject;
import E3.f;
import H3.x;

public class g
{
    public final x a;
    
    public g(final x a) {
        this.a = a;
    }
    
    public static h a(final int i) {
        if (i != 3) {
            final f f = E3.f.f();
            final StringBuilder sb = new StringBuilder();
            sb.append("Could not determine SettingsJsonTransform for settings version ");
            sb.append(i);
            sb.append(". Using default settings values.");
            f.d(sb.toString());
            return new b();
        }
        return new l();
    }
    
    public d b(final JSONObject jsonObject) {
        return a(jsonObject.getInt("settings_version")).a(this.a, jsonObject);
    }
}
