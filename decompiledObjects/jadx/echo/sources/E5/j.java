package E5;

import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final String f1670a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f1671b;

    public j(String str, Object obj) {
        this.f1670a = str;
        this.f1671b = obj;
    }

    public Object a(String str) {
        Object obj = this.f1671b;
        if (obj == null) {
            return null;
        }
        if (obj instanceof Map) {
            return ((Map) obj).get(str);
        }
        if (obj instanceof JSONObject) {
            return ((JSONObject) obj).opt(str);
        }
        throw new ClassCastException();
    }

    public Object b() {
        return this.f1671b;
    }

    public boolean c(String str) {
        Object obj = this.f1671b;
        if (obj == null) {
            return false;
        }
        if (obj instanceof Map) {
            return ((Map) obj).containsKey(str);
        }
        if (obj instanceof JSONObject) {
            return ((JSONObject) obj).has(str);
        }
        throw new ClassCastException();
    }
}
