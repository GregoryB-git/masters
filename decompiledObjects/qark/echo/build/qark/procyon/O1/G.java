// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package O1;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import java.util.concurrent.ConcurrentHashMap;

public final class G
{
    public static final G a;
    public static final ConcurrentHashMap b;
    
    static {
        a = new G();
        b = new ConcurrentHashMap();
    }
    
    public static final JSONObject a(final String key) {
        Intrinsics.checkNotNullParameter(key, "accessToken");
        return G.b.get(key);
    }
    
    public static final void b(final String s, final JSONObject jsonObject) {
        Intrinsics.checkNotNullParameter(s, "key");
        Intrinsics.checkNotNullParameter(jsonObject, "value");
        G.b.put(s, jsonObject);
    }
}
