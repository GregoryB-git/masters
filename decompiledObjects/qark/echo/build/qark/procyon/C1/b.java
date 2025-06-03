// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package C1;

import org.json.JSONArray;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import kotlin.jvm.internal.g;
import java.util.List;

public final class b
{
    public static final a e;
    public final String a;
    public final String b;
    public final List c;
    public final String d;
    
    static {
        e = new a(null);
    }
    
    public b(final JSONObject jsonObject) {
        Intrinsics.checkNotNullParameter(jsonObject, "component");
        final String string = jsonObject.getString("name");
        Intrinsics.checkNotNullExpressionValue(string, "component.getString(PARAMETER_NAME_KEY)");
        this.a = string;
        final String optString = jsonObject.optString("value");
        Intrinsics.checkNotNullExpressionValue(optString, "component.optString(PARAMETER_VALUE_KEY)");
        this.b = optString;
        final String optString2 = jsonObject.optString("path_type", "absolute");
        Intrinsics.checkNotNullExpressionValue(optString2, "component.optString(Constants.EVENT_MAPPING_PATH_TYPE_KEY, Constants.PATH_TYPE_ABSOLUTE)");
        this.d = optString2;
        final ArrayList<c> c = new ArrayList<c>();
        final JSONArray optJSONArray = jsonObject.optJSONArray("path");
        if (optJSONArray != null) {
            final int length = optJSONArray.length();
            if (length > 0) {
                int n = 0;
                while (true) {
                    final int n2 = n + 1;
                    final JSONObject jsonObject2 = optJSONArray.getJSONObject(n);
                    Intrinsics.checkNotNullExpressionValue(jsonObject2, "jsonPathArray.getJSONObject(i)");
                    c.add(new c(jsonObject2));
                    if (n2 >= length) {
                        break;
                    }
                    n = n2;
                }
            }
        }
        this.c = c;
    }
    
    public final String a() {
        return this.a;
    }
    
    public final List b() {
        return this.c;
    }
    
    public final String c() {
        return this.d;
    }
    
    public final String d() {
        return this.b;
    }
    
    public static final class a
    {
    }
}
