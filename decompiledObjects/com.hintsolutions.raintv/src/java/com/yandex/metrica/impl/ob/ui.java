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
 */
package com.yandex.metrica.impl.ob;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.impl.ob.Oi;
import com.yandex.metrica.impl.ob.V8;
import com.yandex.metrica.impl.ob.W0;

public class Ui
implements Oi {
    @NonNull
    private final V8 a;

    public Ui(@NonNull V8 v8) {
        this.a = v8;
    }

    @Override
    @Nullable
    public String a() {
        Object object = this.a.u();
        object = !TextUtils.isEmpty((CharSequence)((W0)object).a) ? ((W0)object).a : null;
        Object object2 = object;
        if (object == null) {
            String string2 = this.a.n(null);
            object2 = object;
            if (!TextUtils.isEmpty((CharSequence)string2)) {
                object2 = string2;
            }
        }
        return object2;
    }
}

