/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  androidx.annotation.Nullable
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.UUID
 */
package com.yandex.metrica.impl.ob;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.yandex.metrica.impl.ob.vn;
import com.yandex.metrica.impl.ob.xn;
import java.util.UUID;

public class yn
implements xn<String> {
    @Override
    public vn a(@Nullable Object object) {
        String string = (String)object;
        if (TextUtils.isEmpty((CharSequence)string)) {
            object = vn.a(this, "ApiKey is empty. Please, read official documentation how to obtain one: https://yandex.com/dev/appmetrica/doc/mobile-sdk-dg/concepts/android-initialize.html");
        } else {
            try {
                UUID.fromString((String)string);
                object = vn.a(this);
            }
            catch (Throwable throwable) {
                object = a.t("Invalid ApiKey=", string, ". ", "Please, read official documentation how to obtain one:", " ");
                object.append("https://yandex.com/dev/appmetrica/doc/mobile-sdk-dg/concepts/android-initialize.html");
                object = vn.a(this, object.toString());
            }
        }
        return object;
    }
}

