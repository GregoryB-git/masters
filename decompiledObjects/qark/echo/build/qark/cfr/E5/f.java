/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.nio.ByteBuffer
 *  org.json.JSONException
 *  org.json.JSONObject
 *  org.json.JSONTokener
 */
package E5;

import E5.h;
import E5.i;
import E5.r;
import java.nio.ByteBuffer;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

public final class f
implements i {
    public static final f a = new f();

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public ByteBuffer a(Object object) {
        if (object == null) {
            return null;
        }
        Object object2 = h.a(object);
        if (object2 instanceof String) {
            object = r.b;
            object2 = JSONObject.quote((String)((String)object2));
            do {
                return object.d((String)object2);
                break;
            } while (true);
        }
        object = r.b;
        object2 = object2.toString();
        return object.d((String)object2);
    }

    @Override
    public Object b(ByteBuffer byteBuffer) {
        block4 : {
            if (byteBuffer == null) {
                return null;
            }
            try {
                byteBuffer = new JSONTokener(r.b.c(byteBuffer));
                Object object = byteBuffer.nextValue();
                if (byteBuffer.more()) break block4;
                return object;
            }
            catch (JSONException jSONException) {
                throw new IllegalArgumentException("Invalid JSON", (Throwable)jSONException);
            }
        }
        throw new IllegalArgumentException("Invalid JSON");
    }
}

