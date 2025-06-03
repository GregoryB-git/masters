package E5;

import java.nio.ByteBuffer;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* loaded from: classes.dex */
public final class f implements i {

    /* renamed from: a, reason: collision with root package name */
    public static final f f1668a = new f();

    @Override // E5.i
    public ByteBuffer a(Object obj) {
        r rVar;
        String obj2;
        if (obj == null) {
            return null;
        }
        Object a7 = h.a(obj);
        if (a7 instanceof String) {
            rVar = r.f1688b;
            obj2 = JSONObject.quote((String) a7);
        } else {
            rVar = r.f1688b;
            obj2 = a7.toString();
        }
        return rVar.a(obj2);
    }

    @Override // E5.i
    public Object b(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return null;
        }
        try {
            JSONTokener jSONTokener = new JSONTokener(r.f1688b.b(byteBuffer));
            Object nextValue = jSONTokener.nextValue();
            if (jSONTokener.more()) {
                throw new IllegalArgumentException("Invalid JSON");
            }
            return nextValue;
        } catch (JSONException e7) {
            throw new IllegalArgumentException("Invalid JSON", e7);
        }
    }
}
