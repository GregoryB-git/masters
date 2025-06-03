/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  androidx.annotation.NonNull
 *  com.yandex.metrica.impl.ob.p1
 *  java.lang.Object
 */
package com.yandex.metrica.impl.ob;

import android.os.Bundle;
import androidx.annotation.NonNull;
import com.yandex.metrica.impl.ob.p1;

public class k2 {
    @NonNull
    private final p1 a;

    public k2(@NonNull p1 p12) {
        this.a = p12;
    }

    public void a(Bundle bundle) {
        this.a.reportData(bundle);
    }
}

