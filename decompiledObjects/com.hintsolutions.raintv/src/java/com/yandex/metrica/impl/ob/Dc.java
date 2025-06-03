/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.VisibleForTesting
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package com.yandex.metrica.impl.ob;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.impl.ob.G1;
import com.yandex.metrica.impl.ob.Ib;
import com.yandex.metrica.impl.ob.Y8;
import com.yandex.metrica.impl.ob.Zb;
import com.yandex.metrica.impl.ob.rd;
import com.yandex.metrica.impl.ob.sd;
import com.yandex.metrica.impl.ob.vc;

public class dc
extends Ib {
    public dc(@NonNull vc vc2, @NonNull Y8 y82) {
        this(vc2, y82, new G1());
    }

    @VisibleForTesting
    public dc(@NonNull vc vc2, @NonNull Y8 y82, @NonNull G1 g1) {
        super(vc2, y82, g1);
    }

    @Override
    @NonNull
    public Zb a() {
        return new Zb(this){
            public final dc a;
            {
                this.a = dc2;
            }

            @Override
            public void a(long l2) {
                this.a.a.j(l2);
            }

            @Override
            public long getLastAttemptTimeSeconds() {
                return this.a.a.e(0L);
            }
        };
    }

    @Override
    @NonNull
    public sd a(@NonNull rd rd2) {
        return this.c.a(rd2);
    }

    @Override
    @NonNull
    public String b() {
        return "network";
    }

    @Override
    @NonNull
    public String c() {
        return "lbs";
    }
}

