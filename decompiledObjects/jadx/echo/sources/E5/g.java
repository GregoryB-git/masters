package E5;

import java.nio.ByteBuffer;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class g implements l {

    /* renamed from: a, reason: collision with root package name */
    public static final g f1669a = new g();

    @Override // E5.l
    public ByteBuffer a(Object obj) {
        return f.f1668a.a(new JSONArray().put(h.a(obj)));
    }

    @Override // E5.l
    public ByteBuffer b(String str, String str2, Object obj, String str3) {
        return f.f1668a.a(new JSONArray().put(str).put(h.a(str2)).put(h.a(obj)).put(h.a(str3)));
    }

    @Override // E5.l
    public ByteBuffer c(j jVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("method", jVar.f1670a);
            jSONObject.put("args", h.a(jVar.f1671b));
            return f.f1668a.a(jSONObject);
        } catch (JSONException e7) {
            throw new IllegalArgumentException("Invalid JSON", e7);
        }
    }

    @Override // E5.l
    public ByteBuffer d(String str, String str2, Object obj) {
        return f.f1668a.a(new JSONArray().put(str).put(h.a(str2)).put(h.a(obj)));
    }

    @Override // E5.l
    public j e(ByteBuffer byteBuffer) {
        try {
            Object b7 = f.f1668a.b(byteBuffer);
            if (b7 instanceof JSONObject) {
                JSONObject jSONObject = (JSONObject) b7;
                Object obj = jSONObject.get("method");
                Object g7 = g(jSONObject.opt("args"));
                if (obj instanceof String) {
                    return new j((String) obj, g7);
                }
            }
            throw new IllegalArgumentException("Invalid method call: " + b7);
        } catch (JSONException e7) {
            throw new IllegalArgumentException("Invalid JSON", e7);
        }
    }

    @Override // E5.l
    public Object f(ByteBuffer byteBuffer) {
        try {
            Object b7 = f.f1668a.b(byteBuffer);
            if (b7 instanceof JSONArray) {
                JSONArray jSONArray = (JSONArray) b7;
                if (jSONArray.length() == 1) {
                    return g(jSONArray.opt(0));
                }
                if (jSONArray.length() == 3) {
                    Object obj = jSONArray.get(0);
                    Object g7 = g(jSONArray.opt(1));
                    Object g8 = g(jSONArray.opt(2));
                    if ((obj instanceof String) && (g7 == null || (g7 instanceof String))) {
                        throw new e((String) obj, (String) g7, g8);
                    }
                }
            }
            throw new IllegalArgumentException("Invalid envelope: " + b7);
        } catch (JSONException e7) {
            throw new IllegalArgumentException("Invalid JSON", e7);
        }
    }

    public Object g(Object obj) {
        if (obj == JSONObject.NULL) {
            return null;
        }
        return obj;
    }
}
