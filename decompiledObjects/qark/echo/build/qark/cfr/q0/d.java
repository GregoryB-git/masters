/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.text.TextUtils
 *  java.io.EOFException
 *  java.lang.CharSequence
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.Collections
 *  java.util.List
 *  java.util.Map
 */
package q0;

import F0.T;
import F0.r;
import X2.v;
import Z0.s;
import a3.f;
import android.net.Uri;
import android.text.TextUtils;
import c1.t;
import d0.o;
import d0.q;
import d0.x;
import d0.z;
import g0.E;
import g0.a;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import l0.y1;
import l1.J;
import l1.K;
import l1.e;
import l1.j;
import q0.b;
import q0.h;
import q0.k;
import q0.t;
import q0.w;

public final class d
implements h {
    public static final int[] f = new int[]{8, 13, 11, 2, 0, 1, 7};
    public final int b;
    public t.a c;
    public boolean d;
    public final boolean e;

    public d() {
        this(0, true);
    }

    public d(int n8, boolean bl) {
        this.b = n8;
        this.e = bl;
        this.c = new c1.h();
    }

    public static void d(int n8, List list) {
        if (f.j(f, n8) != -1) {
            if (list.contains((Object)n8)) {
                return;
            }
            list.add((Object)n8);
        }
    }

    public static Z0.h g(t.a a8, boolean bl, E e8, q q8, List list) {
        int n8;
        block1 : {
            int n9 = d.j(q8) ? 4 : 0;
            n8 = n9;
            if (!bl) {
                a8 = t.a.a;
                n8 = n9 | 32;
            }
            if (list != null) break block1;
            list = v.Y();
        }
        return new Z0.h(a8, n8, e8, null, list, null);
    }

    public static J h(int n8, boolean bl, q object, List list, E e8, t.a a8, boolean bl2) {
        int n9;
        n9 = n8 | 16;
        if (list != null) {
            n8 |= 48;
        } else if (bl) {
            list = Collections.singletonList((Object)new q.b().o0("application/cea-608").K());
            n8 = n9;
        } else {
            list = Collections.emptyList();
            n8 = n9;
        }
        object = object.j;
        n9 = n8;
        if (!TextUtils.isEmpty((CharSequence)object)) {
            int n10 = n8;
            if (!z.b((String)object, "audio/mp4a-latm")) {
                n10 = n8 | 2;
            }
            n9 = n10;
            if (!z.b((String)object, "video/avc")) {
                n9 = n10 | 4;
            }
        }
        if (!bl2) {
            a8 = t.a.a;
            n8 = 1;
        } else {
            n8 = 0;
        }
        return new J(2, n8, a8, e8, new j(n9, list), 112800);
    }

    public static boolean j(q object) {
        object = object.k;
        if (object == null) {
            return false;
        }
        for (int i8 = 0; i8 < object.e(); ++i8) {
            x.b b8 = object.d(i8);
            if (!(b8 instanceof t)) continue;
            return ((t)b8).q.isEmpty() ^ true;
        }
        return false;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive exception aggregation
     */
    public static boolean k(r var0, F0.s var1_3) {
        try {
            var2_4 = var0.e(var1_3);
        }
        catch (Throwable var0_1) {
            var1_3.h();
            throw var0_1;
        }
        var1_3.h();
        return var2_4;
lbl8: // 1 sources:
        do {
            var1_3.h();
            return false;
            break;
        } while (true);
        catch (EOFException var0_2) {
            ** continue;
        }
    }

    @Override
    public q b(q object) {
        Object object2 = object;
        if (this.d) {
            object2 = object;
            if (this.c.a((q)object)) {
                object2 = object.a().o0("application/x-media3-cues").S(this.c.c((q)object));
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(object.n);
                if (object.j != null) {
                    StringBuilder stringBuilder2 = new StringBuilder();
                    stringBuilder2.append(" ");
                    stringBuilder2.append(object.j);
                    object = stringBuilder2.toString();
                } else {
                    object = "";
                }
                stringBuilder.append((String)object);
                object2 = object2.O(stringBuilder.toString()).s0(Long.MAX_VALUE).K();
            }
        }
        return object2;
    }

    public b e(Uri object, q q8, List list, E e8, Map object2, F0.s s8, y1 object3) {
        int n8;
        int n9 = o.a(q8.n);
        int n10 = o.b((Map)object2);
        int n11 = o.c((Uri)object);
        object = f;
        ArrayList arrayList = new ArrayList(object.length);
        d.d(n9, (List)arrayList);
        d.d(n10, (List)arrayList);
        d.d(n11, (List)arrayList);
        int n12 = object.length;
        int n13 = 0;
        for (n8 = 0; n8 < n12; ++n8) {
            d.d(object[n8], (List)arrayList);
        }
        s8.h();
        object = null;
        for (n8 = n13; n8 < arrayList.size(); ++n8) {
            block6 : {
                block7 : {
                    n13 = (Integer)arrayList.get(n8);
                    object3 = (r)a.e(this.f(n13, q8, list, e8));
                    if (d.k((r)object3, s8)) {
                        return new b((r)object3, q8, e8, this.c, this.d);
                    }
                    object2 = object;
                    if (object != null) break block6;
                    if (n13 == n9 || n13 == n10 || n13 == n11) break block7;
                    object2 = object;
                    if (n13 != 11) break block6;
                }
                object2 = object3;
            }
            object = object2;
        }
        return new b((r)a.e(object), q8, e8, this.c, this.d);
    }

    public final r f(int n8, q q8, List list, E e8) {
        if (n8 != 0) {
            if (n8 != 1) {
                if (n8 != 2) {
                    if (n8 != 7) {
                        if (n8 != 8) {
                            if (n8 != 11) {
                                if (n8 != 13) {
                                    return null;
                                }
                                return new w(q8.d, e8, this.c, this.d);
                            }
                            return d.h(this.b, this.e, q8, list, e8, this.c, this.d);
                        }
                        return d.g(this.c, this.d, e8, q8, list);
                    }
                    return new Y0.f(0, 0L);
                }
                return new l1.h();
            }
            return new e();
        }
        return new l1.b();
    }

    public d i(boolean bl) {
        this.d = bl;
        return this;
    }
}

