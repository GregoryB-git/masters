// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R2;

import java.util.Map;
import com.google.android.gms.internal.measurement.y6;

public final class F2 implements y6
{
    public final /* synthetic */ String a;
    public final /* synthetic */ x2 b;
    
    public F2(final x2 b, final String a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final String i(final String s) {
        final Map<Object, String> map = x2.D(this.b).get(this.a);
        if (map != null && map.containsKey(s)) {
            return map.get(s);
        }
        return null;
    }
}
