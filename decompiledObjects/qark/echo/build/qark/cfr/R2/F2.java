/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Map
 */
package R2;

import R2.x2;
import com.google.android.gms.internal.measurement.y6;
import java.util.Map;

public final class F2
implements y6 {
    public final /* synthetic */ String a;
    public final /* synthetic */ x2 b;

    public F2(x2 x22, String string2) {
        this.b = x22;
        this.a = string2;
    }

    @Override
    public final String i(String string2) {
        Map map = (Map)x2.D(this.b).get((Object)this.a);
        if (map != null && map.containsKey((Object)string2)) {
            return (String)map.get((Object)string2);
        }
        return null;
    }
}

