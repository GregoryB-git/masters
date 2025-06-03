/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.ArrayIndexOutOfBoundsException
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.List
 */
package F0;

import d0.A;
import g0.z;
import h0.d;
import java.util.ArrayList;
import java.util.List;

public final class d {
    public final List a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final float k;
    public final String l;

    public d(List list, int n8, int n9, int n10, int n11, int n12, int n13, int n14, int n15, int n16, float f8, String string2) {
        this.a = list;
        this.b = n8;
        this.c = n9;
        this.d = n10;
        this.e = n11;
        this.f = n12;
        this.g = n13;
        this.h = n14;
        this.i = n15;
        this.j = n16;
        this.k = f8;
        this.l = string2;
    }

    public static byte[] a(z z8) {
        int n8 = z8.M();
        int n9 = z8.f();
        z8.U(n8);
        return g0.d.d(z8.e(), n9, n8);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static d b(z object) {
        int n8;
        float f8;
        int n9;
        int n10;
        int n11;
        int n12;
        int n13;
        int n14;
        int n15;
        int n16;
        ArrayList arrayList;
        block8 : {
            block7 : {
                try {
                    object.U(4);
                    n9 = (object.G() & 3) + 1;
                    if (n9 == 3) throw new IllegalStateException();
                    arrayList = new ArrayList();
                    n14 = object.G() & 31;
                    for (n10 = 0; n10 < n14; ++n10) {
                        arrayList.add((Object)d.a((z)object));
                    }
                    n12 = object.G();
                    for (n10 = 0; n10 < n12; ++n10) {
                        arrayList.add((Object)d.a((z)object));
                    }
                    if (n14 <= 0) break block7;
                }
                catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
                    throw A.a("Error parsing AVC config", (Throwable)arrayIndexOutOfBoundsException);
                }
                object = (byte[])arrayList.get(0);
                object = h0.d.l((byte[])arrayList.get(0), n9, object.length);
                n15 = object.f;
                n8 = object.g;
                n11 = object.i;
                n13 = object.j;
                n12 = object.q;
                int n17 = object.r;
                n10 = object.s;
                n14 = object.t;
                f8 = object.h;
                object = g0.d.a(object.a, object.b, object.c);
                n13 += 8;
                n11 += 8;
                n16 = n17;
                break block8;
            }
            int n18 = n10 = (n14 = (n12 = (n11 = (n8 = (n15 = -1)))));
            f8 = 1.0f;
            object = null;
            int n19 = 16;
            n13 = n12;
            n12 = n14;
            n16 = n10;
            n10 = n18;
            n14 = n19;
        }
        return new d((List)arrayList, n9, n15, n8, n11, n13, n12, n16, n10, n14, f8, (String)object);
    }
}

