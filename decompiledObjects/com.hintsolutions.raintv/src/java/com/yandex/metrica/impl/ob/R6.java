/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Collections
 *  java.util.List
 */
package com.yandex.metrica.impl.ob;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.impl.ob.A2;
import com.yandex.metrica.impl.ob.z6;
import java.util.Collections;
import java.util.List;

public class r6 {
    @Nullable
    public final z6 a;
    @NonNull
    public final List<z6> b;
    @Nullable
    public final String c;

    public r6(@Nullable z6 object, @Nullable List<z6> list, @Nullable String string) {
        this.a = object;
        object = list == null ? Collections.emptyList() : A2.c(list);
        this.b = object;
        this.c = string;
    }
}

