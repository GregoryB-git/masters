/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  java.lang.Object
 *  java.util.List
 */
package com.yandex.metrica.impl.ob;

import androidx.annotation.NonNull;
import com.yandex.metrica.impl.ob.D5;
import java.util.List;

public abstract class w5<BaseHandler> {
    private final D5 a;

    public w5(D5 d5) {
        this.a = d5;
    }

    public D5 a() {
        return this.a;
    }

    public abstract void a(@NonNull List<BaseHandler> var1);
}

