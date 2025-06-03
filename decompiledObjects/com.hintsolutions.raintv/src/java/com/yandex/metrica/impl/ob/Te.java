/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  android.util.Base64
 *  androidx.annotation.NonNull
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package com.yandex.metrica.impl.ob;

import android.text.TextUtils;
import android.util.Base64;
import androidx.annotation.NonNull;
import com.yandex.metrica.impl.ob.he;
import com.yandex.metrica.impl.ob.je;
import com.yandex.metrica.impl.ob.rm;
import com.yandex.metrica.impl.ob.ye;
import com.yandex.metrica.impl.ob.yg;

public class te
implements ye,
he {
    @Override
    public int a(@NonNull rm rm2) {
        return 2;
    }

    @Override
    @NonNull
    public byte[] a(@NonNull je je2, @NonNull yg yg2) {
        if (TextUtils.isEmpty((CharSequence)je2.b)) {
            return new byte[0];
        }
        return Base64.decode((String)je2.b, (int)0);
    }
}

