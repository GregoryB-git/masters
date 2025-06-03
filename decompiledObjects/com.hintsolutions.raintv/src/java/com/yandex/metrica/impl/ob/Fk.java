/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.SparseIntArray
 *  androidx.annotation.NonNull
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.Override
 */
package com.yandex.metrica.impl.ob;

import android.util.SparseIntArray;
import androidx.annotation.NonNull;
import com.yandex.metrica.impl.ob.Dk;
import com.yandex.metrica.impl.ob.el;

public class fk
implements Dk {
    private final SparseIntArray a = new SparseIntArray();
    private final int b;

    public fk(int n2) {
        this.b = n2;
    }

    public int a(int n2) {
        Integer n3;
        int n5 = this.b;
        Integer n6 = n3 = Integer.valueOf((int)this.a.get(n2));
        if (n3 == null) {
            n6 = 0;
        }
        return n5 - n6;
    }

    @Override
    public void a(@NonNull el el2) {
        SparseIntArray sparseIntArray = this.a;
        int n2 = el2.d;
        sparseIntArray.put(n2, sparseIntArray.get(n2) + 1);
    }
}

