/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Double
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Arrays
 *  java.util.Comparator
 *  java.util.List
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C2;
import com.google.android.gms.internal.measurement.f3;
import com.google.android.gms.internal.measurement.n;
import com.google.android.gms.internal.measurement.s;
import com.google.android.gms.internal.measurement.z;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public final class K
implements Comparator {
    public final /* synthetic */ n o;
    public final /* synthetic */ f3 p;

    public K(n n8, f3 f32) {
        this.o = n8;
        this.p = f32;
    }

    public final /* synthetic */ int compare(Object object, Object object2) {
        object = (s)object;
        object2 = (s)object2;
        n n8 = this.o;
        f3 f32 = this.p;
        if (object instanceof z) {
            if (!(object2 instanceof z)) {
                return 1;
            }
            return 0;
        }
        if (object2 instanceof z) {
            return -1;
        }
        if (n8 == null) {
            return object.g().compareTo(object2.g());
        }
        return (int)C2.a(n8.b(f32, Arrays.asList((Object[])new s[]{object, object2})).f());
    }
}

