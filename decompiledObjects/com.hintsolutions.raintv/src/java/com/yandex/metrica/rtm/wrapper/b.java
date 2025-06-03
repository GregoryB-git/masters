/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  com.yandex.metrica.rtm.client.DataSender
 *  java.lang.Object
 */
package com.yandex.metrica.rtm.wrapper;

import androidx.annotation.NonNull;
import com.yandex.metrica.rtm.client.DataSender;

class b {
    @NonNull
    private final DataSender a;

    public b(@NonNull DataSender dataSender) {
        this.a = dataSender;
    }

    @NonNull
    public DataSender a() {
        return this.a;
    }
}

