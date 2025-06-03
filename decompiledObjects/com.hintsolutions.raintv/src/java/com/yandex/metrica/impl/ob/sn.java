/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package com.yandex.metrica.impl.ob;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.impl.ob.vn;
import com.yandex.metrica.impl.ob.xn;

public class sn
implements xn<String> {
    private final String a;

    public sn(@NonNull String string) {
        this.a = string;
    }

    @Override
    public vn a(@Nullable Object object) {
        if (TextUtils.isEmpty((CharSequence)((String)object))) {
            object = new StringBuilder();
            object.append(this.a);
            object.append(" is empty.");
            object = vn.a(this, object.toString());
        } else {
            object = vn.a(this);
        }
        return object;
    }
}

