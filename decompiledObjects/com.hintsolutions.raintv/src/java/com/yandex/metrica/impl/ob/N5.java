/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  androidx.annotation.NonNull
 *  com.yandex.metrica.impl.ob.X4
 *  com.yandex.metrica.impl.ob.c0
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 */
package com.yandex.metrica.impl.ob;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.yandex.metrica.impl.ob.L3;
import com.yandex.metrica.impl.ob.X4;
import com.yandex.metrica.impl.ob.c0;

public class n5
extends X4 {
    public n5(@NonNull L3 l32) {
        super(l32);
    }

    public boolean a(@NonNull c0 object) {
        if (!TextUtils.isEmpty((CharSequence)(object = object.l()))) {
            this.a().b((String)object);
        }
        return false;
    }
}

