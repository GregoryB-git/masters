// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package E5;

import org.json.JSONException;
import org.json.JSONTokener;
import org.json.JSONObject;
import java.nio.ByteBuffer;

public final class f implements i
{
    public static final f a;
    
    static {
        a = new f();
    }
    
    @Override
    public ByteBuffer a(final Object o) {
        if (o == null) {
            return null;
        }
        final Object a = h.a(o);
        r r;
        String s;
        if (a instanceof String) {
            r = E5.r.b;
            s = JSONObject.quote((String)a);
        }
        else {
            r = E5.r.b;
            s = a.toString();
        }
        return r.d(s);
    }
    
    @Override
    public Object b(final ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return null;
        }
        try {
            final JSONTokener jsonTokener = new JSONTokener(r.b.c(byteBuffer));
            final Object nextValue = jsonTokener.nextValue();
            if (!jsonTokener.more()) {
                return nextValue;
            }
            throw new IllegalArgumentException("Invalid JSON");
        }
        catch (JSONException cause) {
            throw new IllegalArgumentException("Invalid JSON", (Throwable)cause);
        }
    }
}
