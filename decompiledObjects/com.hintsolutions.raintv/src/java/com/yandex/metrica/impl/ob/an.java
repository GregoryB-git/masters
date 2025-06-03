/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.Nullable
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.StringBuilder
 */
package com.yandex.metrica.impl.ob;

import androidx.annotation.Nullable;
import com.yandex.metrica.impl.ob.vn;
import com.yandex.metrica.impl.ob.xn;

class An
implements xn<Integer> {
    @Override
    public vn a(@Nullable Integer n) {
        if (n != null && n <= 0) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Invalid quantity value ");
            stringBuilder.append((Object)n);
            return vn.a(this, stringBuilder.toString());
        }
        return vn.a(this);
    }
}

