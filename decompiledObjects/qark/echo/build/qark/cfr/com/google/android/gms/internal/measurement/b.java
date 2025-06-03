/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Double
 *  java.lang.IllegalStateException
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Collections
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Set
 *  java.util.TreeMap
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C2;
import com.google.android.gms.internal.measurement.X5;
import com.google.android.gms.internal.measurement.d;
import com.google.android.gms.internal.measurement.e;
import com.google.android.gms.internal.measurement.f3;
import com.google.android.gms.internal.measurement.k;
import com.google.android.gms.internal.measurement.s;
import com.google.android.gms.internal.measurement.t;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;

public final class b {
    public final TreeMap a = new TreeMap();
    public final TreeMap b = new TreeMap();

    public static int a(f3 object, t t8, s s8) {
        if ((object = t8.b((f3)object, Collections.singletonList((Object)s8))) instanceof k) {
            return C2.i(object.f());
        }
        return -1;
    }

    public final void b(f3 f32, d d8) {
        X5 x52 = new X5(d8);
        for (Integer n8 : this.a.keySet()) {
            e e8 = (e)d8.d().clone();
            int n9 = b.a(f32, (t)this.a.get((Object)n8), x52);
            if (n9 != 2 && n9 != -1) continue;
            d8.e(e8);
        }
        for (Iterator iterator : this.b.keySet()) {
            b.a(f32, (t)this.b.get((Object)iterator), x52);
        }
    }

    public final void c(String string2, int n8, t t8, String string3) {
        block6 : {
            block5 : {
                block4 : {
                    if (!"create".equals((Object)string3)) break block4;
                    string2 = this.b;
                    break block5;
                }
                if (!"edit".equals((Object)string3)) break block6;
                string2 = this.a;
            }
            int n9 = n8;
            if (string2.containsKey((Object)n8)) {
                n9 = (Integer)string2.lastKey() + 1;
            }
            string2.put((Object)n9, (Object)t8);
            return;
        }
        string2 = new StringBuilder("Unknown callback type: ");
        string2.append(string3);
        throw new IllegalStateException(string2.toString());
    }
}

