/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalArgumentException
 *  java.lang.NoSuchFieldError
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Map
 */
package V4;

import V4.a;
import V4.g;
import Y4.b;
import c5.d;
import c5.f;
import c5.h;
import c5.j;
import c5.k;
import c5.l;
import c5.o;
import c5.s;
import java.util.Map;

public final class e
implements g {
    @Override
    public b a(String string2, a a8, int n8, int n9, Map map) {
        g g8;
        switch (.a[a8.ordinal()]) {
            default: {
                throw new IllegalArgumentException("No encoder available for format ".concat(String.valueOf((Object)((Object)a8))));
            }
            case 13: {
                g8 = new W4.a();
                break;
            }
            case 12: {
                g8 = new a5.a();
                break;
            }
            case 11: {
                g8 = new c5.b();
                break;
            }
            case 10: {
                g8 = new d5.a();
                break;
            }
            case 9: {
                g8 = new l();
                break;
            }
            case 8: {
                g8 = new d();
                break;
            }
            case 7: {
                g8 = new h();
                break;
            }
            case 6: {
                g8 = new f();
                break;
            }
            case 5: {
                g8 = new f5.a();
                break;
            }
            case 4: {
                g8 = new o();
                break;
            }
            case 3: {
                g8 = new j();
                break;
            }
            case 2: {
                g8 = new s();
                break;
            }
            case 1: {
                g8 = new k();
                break;
            }
        }
        return g8.a(string2, a8, n8, n9, map);
    }

}

