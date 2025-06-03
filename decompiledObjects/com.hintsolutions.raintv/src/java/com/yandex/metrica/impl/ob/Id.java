/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  org.jetbrains.annotations.NotNull
 */
package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.Y8;
import com.yandex.metrica.impl.ob.jd;
import com.yandex.metrica.networktasks.api.HostRetryInfoProvider;
import org.jetbrains.annotations.NotNull;

public final class id
implements HostRetryInfoProvider {
    private final Y8 a;
    private final jd b;

    public id(@NotNull Y8 y82, @NotNull jd jd2) {
        this.a = y82;
        this.b = jd2;
    }

    @Override
    public long getLastAttemptTimeSeconds() {
        return this.a.a(this.b, 0L);
    }

    @Override
    public int getNextSendAttemptNumber() {
        return this.a.a(this.b, 1);
    }

    @Override
    public void saveLastAttemptTimeSeconds(long l2) {
        this.a.b(this.b, l2);
    }

    @Override
    public void saveNextSendAttemptNumber(int n2) {
        this.a.b(this.b, n2);
    }
}

