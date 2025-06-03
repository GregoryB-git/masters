/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  androidx.annotation.VisibleForTesting
 *  java.lang.Object
 *  java.lang.Override
 *  java.util.Comparator
 *  java.util.concurrent.TimeUnit
 */
package com.yandex.metrica.impl.ob;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.coreutils.services.TimeProvider;
import com.yandex.metrica.impl.ob.jn;
import com.yandex.metrica.impl.ob.mn;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

public class ln<D>
implements jn<D> {
    @NonNull
    private final Comparator<D> a;
    private final int b;
    @NonNull
    private final TimeProvider c;
    @VisibleForTesting
    public final long d;
    @Nullable
    private D e;
    private int f;
    private long g;

    public ln(@NonNull Comparator<D> comparator, @NonNull TimeProvider timeProvider, int n2, long l4) {
        this.a = comparator;
        this.b = n2;
        this.c = timeProvider;
        this.d = TimeUnit.SECONDS.toMillis(l4);
    }

    private void a() {
        this.f = 0;
        this.g = this.c.elapsedRealtime();
    }

    /*
     * Unable to fully structure code
     */
    @Override
    @NonNull
    public mn<D> get(@Nullable D var1_1) {
        var4_2 = this.e;
        var3_3 = 1;
        if (var4_2 == var1_1) lbl-1000:
        // 2 sources

        {
            while (true) {
                var2_4 = 0;
                break;
            }
        } else {
            if (this.a.compare(var4_2, var1_1) == 0) {
                this.e = var1_1;
                ** continue;
            }
            this.e = var1_1;
            var2_4 = 1;
        }
        if (var2_4 != 0) {
            this.a();
            return new mn<D>(mn.a.a, this.e);
        }
        this.f = var2_4 = this.f + 1;
        this.f = var2_4 % this.b;
        var2_4 = this.c.elapsedRealtime() - this.g >= this.d ? var3_3 : 0;
        if (var2_4 != 0) {
            this.a();
            return new mn<D>(mn.a.c, this.e);
        }
        if (this.f == 0) {
            this.a();
            return new mn<D>(mn.a.c, this.e);
        }
        return new mn<D>(mn.a.b, this.e);
    }
}

