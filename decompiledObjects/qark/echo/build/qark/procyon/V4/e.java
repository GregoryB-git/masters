// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package V4;

import c5.k;
import c5.s;
import c5.j;
import c5.o;
import c5.f;
import c5.h;
import c5.d;
import c5.l;
import Y4.b;
import java.util.Map;

public final class e implements g
{
    @Override
    public b a(final String s, final a obj, final int n, final int n2, final Map map) {
        g g = null;
        switch (e$a.a[obj.ordinal()]) {
            default: {
                throw new IllegalArgumentException("No encoder available for format ".concat(String.valueOf(obj)));
            }
            case 13: {
                g = new W4.a();
                break;
            }
            case 12: {
                g = new a5.a();
                break;
            }
            case 11: {
                g = new c5.b();
                break;
            }
            case 10: {
                g = new d5.a();
                break;
            }
            case 9: {
                g = new l();
                break;
            }
            case 8: {
                g = new d();
                break;
            }
            case 7: {
                g = new h();
                break;
            }
            case 6: {
                g = new f();
                break;
            }
            case 5: {
                g = new f5.a();
                break;
            }
            case 4: {
                g = new o();
                break;
            }
            case 3: {
                g = new j();
                break;
            }
            case 2: {
                g = new s();
                break;
            }
            case 1: {
                g = new k();
                break;
            }
        }
        return g.a(s, obj, n, n2, map);
    }
}
