/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.nio.ByteBuffer
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package E5;

import E5.e;
import E5.f;
import E5.h;
import E5.j;
import E5.l;
import java.nio.ByteBuffer;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class g
implements l {
    public static final g a = new g();

    @Override
    public ByteBuffer a(Object object) {
        return f.a.a((Object)new JSONArray().put(h.a(object)));
    }

    @Override
    public ByteBuffer b(String string2, String string3, Object object, String string4) {
        return f.a.a((Object)new JSONArray().put((Object)string2).put(h.a(string3)).put(h.a(object)).put(h.a(string4)));
    }

    @Override
    public ByteBuffer c(j j8) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("method", (Object)j8.a);
            jSONObject.put("args", h.a(j8.b));
            j8 = f.a.a((Object)jSONObject);
            return j8;
        }
        catch (JSONException jSONException) {
            throw new IllegalArgumentException("Invalid JSON", (Throwable)jSONException);
        }
    }

    @Override
    public ByteBuffer d(String string2, String string3, Object object) {
        return f.a.a((Object)new JSONArray().put((Object)string2).put(h.a(string3)).put(h.a(object)));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public j e(ByteBuffer object) {
        try {
            Object object2;
            object = f.a.b((ByteBuffer)object);
            if (object instanceof JSONObject) {
                Object object3 = (JSONObject)object;
                object2 = object3.get("method");
                object3 = this.g(object3.opt("args"));
                if (object2 instanceof String) {
                    return new j((String)object2, object3);
                }
            }
            object2 = new StringBuilder();
            object2.append("Invalid method call: ");
            object2.append(object);
            throw new IllegalArgumentException(object2.toString());
        }
        catch (JSONException jSONException) {
            throw new IllegalArgumentException("Invalid JSON", (Throwable)jSONException);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public Object f(ByteBuffer object) {
        try {
            Object object2;
            object = f.a.b((ByteBuffer)object);
            if (object instanceof JSONArray) {
                Object object3 = (JSONArray)object;
                if (object3.length() == 1) {
                    return this.g(object3.opt(0));
                }
                if (object3.length() == 3) {
                    object2 = object3.get(0);
                    Object object4 = this.g(object3.opt(1));
                    object3 = this.g(object3.opt(2));
                    if (object2 instanceof String) {
                        if (object4 == null) throw new e((String)object2, (String)object4, object3);
                        if (object4 instanceof String) {
                            throw new e((String)object2, (String)object4, object3);
                        }
                    }
                }
            }
            object2 = new StringBuilder();
            object2.append("Invalid envelope: ");
            object2.append(object);
            throw new IllegalArgumentException(object2.toString());
        }
        catch (JSONException jSONException) {
            throw new IllegalArgumentException("Invalid JSON", (Throwable)jSONException);
        }
    }

    public Object g(Object object) {
        Object object2 = object;
        if (object == JSONObject.NULL) {
            object2 = null;
        }
        return object2;
    }
}

