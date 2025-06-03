/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Integer
 *  java.lang.Object
 *  java.util.Comparator
 *  java.util.Iterator
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.q3;
import com.google.android.gms.internal.measurement.w3;
import java.util.Comparator;
import java.util.Iterator;

public final class s3
implements Comparator {
    public final /* synthetic */ int compare(Object object, Object object2) {
        object = (q3)object;
        object2 = (q3)object2;
        w3 w32 = (w3)object.iterator();
        w3 w33 = (w3)object2.iterator();
        while (w32.hasNext() && w33.hasNext()) {
            int n8 = Integer.valueOf((int)q3.f(w32.a())).compareTo(Integer.valueOf((int)q3.f(w33.a())));
            if (n8 == 0) continue;
            return n8;
        }
        return Integer.valueOf((int)object.S()).compareTo(Integer.valueOf((int)object2.S()));
    }
}

