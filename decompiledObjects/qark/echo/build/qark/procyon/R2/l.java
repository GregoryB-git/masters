// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R2;

import java.util.Map;
import java.util.EnumMap;

public final class l
{
    public final EnumMap a;
    
    public l() {
        this.a = new EnumMap((Class<K>)q3.a.class);
    }
    
    public l(final EnumMap m) {
        (this.a = new EnumMap((Class<K>)q3.a.class)).putAll(m);
    }
    
    public static l b(final String s) {
        final EnumMap<q3.a, k> enumMap = new EnumMap<q3.a, k>(q3.a.class);
        if (s.length() >= q3.a.values().length) {
            int i = 0;
            if (s.charAt(0) == '1') {
                final q3.a[] values = q3.a.values();
                for (int length = values.length, index = 1; i < length; ++i, ++index) {
                    enumMap.put(values[i], k.e(s.charAt(index)));
                }
                return new l(enumMap);
            }
        }
        return new l();
    }
    
    public final k a(final q3.a key) {
        k p;
        if ((p = this.a.get(key)) == null) {
            p = k.p;
        }
        return p;
    }
    
    public final void c(final q3.a key, final int n) {
        k value = k.p;
        Label_0047: {
            if (n != -20) {
                if (n == -10) {
                    value = k.s;
                    break Label_0047;
                }
                if (n != 0) {
                    if (n != 30) {
                        break Label_0047;
                    }
                    value = k.t;
                    break Label_0047;
                }
            }
            value = k.u;
        }
        this.a.put(key, value);
    }
    
    public final void d(final q3.a key, final k value) {
        this.a.put(key, value);
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("1");
        final q3.a[] values = q3.a.values();
        for (int length = values.length, i = 0; i < length; ++i) {
            k p;
            if ((p = this.a.get(values[i])) == null) {
                p = k.p;
            }
            sb.append(k.c(p));
        }
        return sb.toString();
    }
}
