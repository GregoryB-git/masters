// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package n0;

import o0.b;
import i0.k;
import java.util.Map;
import o0.i;
import o0.j;

public abstract class h
{
    public static k a(final j j, final String s, final i i, final int n, final Map map) {
        return new k.b().i(i.b(s)).h(i.a).g(i.b).f(b(j, i)).b(n).e(map).a();
    }
    
    public static String b(final j j, final i i) {
        final String k = j.k();
        if (k != null) {
            return k;
        }
        return i.b(j.c.get(0).a).toString();
    }
}
