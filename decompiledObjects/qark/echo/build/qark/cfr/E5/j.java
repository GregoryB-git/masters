/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.ClassCastException
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Map
 *  org.json.JSONObject
 */
package E5;

import java.util.Map;
import org.json.JSONObject;

public final class j {
    public final String a;
    public final Object b;

    public j(String string2, Object object) {
        this.a = string2;
        this.b = object;
    }

    public Object a(String string2) {
        Object object = this.b;
        if (object == null) {
            return null;
        }
        if (object instanceof Map) {
            return ((Map)object).get((Object)string2);
        }
        if (object instanceof JSONObject) {
            return ((JSONObject)object).opt(string2);
        }
        throw new ClassCastException();
    }

    public Object b() {
        return this.b;
    }

    public boolean c(String string2) {
        Object object = this.b;
        if (object == null) {
            return false;
        }
        if (object instanceof Map) {
            return ((Map)object).containsKey((Object)string2);
        }
        if (object instanceof JSONObject) {
            return ((JSONObject)object).has(string2);
        }
        throw new ClassCastException();
    }
}

