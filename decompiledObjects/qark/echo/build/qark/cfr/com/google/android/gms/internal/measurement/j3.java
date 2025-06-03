/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.io.IOException
 *  java.lang.Class
 *  java.lang.Iterable
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Iterator
 *  java.util.List
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.I4;
import com.google.android.gms.internal.measurement.J3;
import com.google.android.gms.internal.measurement.S4;
import com.google.android.gms.internal.measurement.Z4;
import com.google.android.gms.internal.measurement.a4;
import com.google.android.gms.internal.measurement.n4;
import com.google.android.gms.internal.measurement.q3;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public abstract class j3
implements I4 {
    protected int zza = 0;

    public static void e(Iterable object, List object2) {
        a4.e(object);
        if (object instanceof n4) {
            Object object3 = ((n4)object).b();
            object = (n4)object2;
            int n8 = object2.size();
            object2 = object3.iterator();
            while (object2.hasNext()) {
                object3 = object2.next();
                if (object3 == null) {
                    int n9 = object.size();
                    object2 = new StringBuilder("Element at index ");
                    object2.append(n9 - n8);
                    object2.append(" is null.");
                    object2 = object2.toString();
                    for (n9 = object.size() - 1; n9 >= n8; --n9) {
                        object.remove(n9);
                    }
                    throw new NullPointerException((String)object2);
                }
                if (object3 instanceof q3) {
                    object.K((q3)object3);
                    continue;
                }
                object.add((Object)((String)object3));
            }
            return;
        }
        if (object instanceof S4) {
            object2.addAll((Collection)object);
            return;
        }
        if (object2 instanceof ArrayList && object instanceof Collection) {
            ((ArrayList)object2).ensureCapacity(object2.size() + ((Collection)object).size());
        }
        int n10 = object2.size();
        object = object.iterator();
        while (object.hasNext()) {
            Object object4 = object.next();
            if (object4 == null) {
                int n11 = object2.size();
                object = new StringBuilder("Element at index ");
                object.append(n11 - n10);
                object.append(" is null.");
                object = object.toString();
                for (n11 = object2.size() - 1; n11 >= n10; --n11) {
                    object2.remove(n11);
                }
                throw new NullPointerException((String)object);
            }
            object2.add(object4);
        }
    }

    public abstract int c(Z4 var1);

    public abstract int g();

    public final byte[] h() {
        try {
            byte[] arrby = new byte[this.a()];
            J3 j32 = J3.D(arrby);
            this.f(j32);
            j32.E();
            return arrby;
        }
        catch (IOException iOException) {
            String string2 = this.getClass().getName();
            StringBuilder stringBuilder = new StringBuilder("Serializing ");
            stringBuilder.append(string2);
            stringBuilder.append(" to a ");
            stringBuilder.append("byte array");
            stringBuilder.append(" threw an IOException (should never happen).");
            throw new RuntimeException(stringBuilder.toString(), (Throwable)iOException);
        }
    }

    public abstract void j(int var1);
}

