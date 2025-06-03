/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  androidx.annotation.NonNull
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.Override
 */
package com.yandex.metrica.impl.ob;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.yandex.metrica.impl.ob.b;
import com.yandex.metrica.impl.ob.je;
import com.yandex.metrica.impl.ob.ye;
import com.yandex.metrica.impl.ob.yg;

public class we
implements ye {
    @Override
    @NonNull
    public byte[] a(@NonNull je je2, @NonNull yg yg2) {
        if (!TextUtils.isEmpty((CharSequence)je2.b)) {
            return b.b(je2.b);
        }
        return new byte[0];
    }
}

