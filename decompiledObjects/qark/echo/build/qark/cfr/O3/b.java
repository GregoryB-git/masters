/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  org.json.JSONObject
 */
package O3;

import H3.x;
import O3.d;
import O3.h;
import org.json.JSONObject;

public class b
implements h {
    public static d b(x x8) {
        d.b b8 = new d.b(8, 4);
        d.a a8 = new d.a(true, false, false);
        return new d(x8.a() + (long)3600000, b8, a8, 0, 3600, 10.0, 1.2, 60);
    }

    @Override
    public d a(x x8, JSONObject jSONObject) {
        return b.b(x8);
    }
}

