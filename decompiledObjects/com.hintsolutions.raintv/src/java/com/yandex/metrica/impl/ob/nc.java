/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package com.yandex.metrica.impl.ob;

import androidx.annotation.NonNull;
import com.yandex.metrica.impl.ob.Eb;
import com.yandex.metrica.impl.ob.Zb;
import com.yandex.metrica.impl.ob.x2;

public abstract class Nc<T>
implements Eb<T> {
    @NonNull
    private final x2 a;
    @NonNull
    private final Zb b;

    public Nc(@NonNull Zb zb2, @NonNull x2 x22) {
        this.b = zb2;
        this.a = x22;
    }

    @NonNull
    public abstract String a();

    @Override
    public boolean a(long l4) {
        x2 x22 = this.a;
        long l6 = this.b.getLastAttemptTimeSeconds();
        StringBuilder stringBuilder = z2.t("last ");
        stringBuilder.append(this.a());
        stringBuilder.append(" scan attempt");
        return x22.b(l6, l4, stringBuilder.toString());
    }
}

