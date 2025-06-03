/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.util.SparseArray
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.HashMap
 *  java.util.Set
 */
package q2;

import android.util.SparseArray;
import c2.d;
import java.util.HashMap;
import java.util.Set;

public abstract class a {
    public static SparseArray a;
    public static HashMap b;

    static {
        HashMap hashMap;
        a = new SparseArray();
        b = hashMap = new HashMap();
        hashMap.put((Object)d.o, (Object)0);
        b.put((Object)d.p, (Object)1);
        b.put((Object)d.q, (Object)2);
        for (d d8 : b.keySet()) {
            a.append(((Integer)b.get((Object)d8)).intValue(), (Object)d8);
        }
    }

    public static int a(d d8) {
        Integer n8 = (Integer)b.get((Object)d8);
        if (n8 != null) {
            return n8;
        }
        n8 = new StringBuilder();
        n8.append("PriorityMapping is missing known Priority value ");
        n8.append((Object)d8);
        throw new IllegalStateException(n8.toString());
    }

    public static d b(int n8) {
        d d8 = (d)((Object)a.get(n8));
        if (d8 != null) {
            return d8;
        }
        d8 = new StringBuilder();
        d8.append("Unknown Priority for value ");
        d8.append(n8);
        throw new IllegalArgumentException(d8.toString());
    }
}

