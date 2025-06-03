/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  androidx.annotation.Keep
 *  androidx.annotation.NonNull
 *  java.lang.Object
 *  java.lang.String
 */
package com.yandex.metrica.identifiers;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.yandex.metrica.identifiers.impl.h;

@Keep
public class AdsIdentifiersProvider {
    public static final int a = 0;
    private static final h retriever = new h(null, 1);

    public static Bundle requestIdentifiers(@NonNull Context context, @NonNull Bundle object) {
        object = object.getString("com.yandex.metrica.identifiers.extra.PROVIDER");
        return retriever.a(context, (String)object);
    }
}

