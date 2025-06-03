// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package c5;

import Y4.b;
import java.util.Map;
import V4.a;
import V4.g;

public final class o implements g
{
    public final j a;
    
    public o() {
        this.a = new j();
    }
    
    @Override
    public b a(final String obj, final a obj2, final int n, final int n2, final Map map) {
        if (obj2 == V4.a.C) {
            return this.a.a("0".concat(String.valueOf(obj)), V4.a.v, n, n2, map);
        }
        throw new IllegalArgumentException("Can only encode UPC-A, but got ".concat(String.valueOf(obj2)));
    }
}
