/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  java.lang.Long
 *  java.lang.Object
 */
package com.yandex.metrica.impl.ob;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.coreutils.services.SystemTimeProvider;
import com.yandex.metrica.coreutils.services.TimeProvider;

public class E4 {
    @Nullable
    private Long a;
    private int b;
    @NonNull
    private TimeProvider c;

    public E4() {
        this(new SystemTimeProvider());
    }

    public E4(@NonNull TimeProvider timeProvider) {
        this.c = timeProvider;
    }

    public a a() {
        if (this.a == null) {
            this.a = this.c.currentTimeSeconds();
        }
        long l2 = this.a;
        long l3 = this.a;
        int n2 = this.b;
        a a2 = new a(l2, l3, n2);
        this.b = n2 + 1;
        return a2;
    }

    public static class a {
        public final long a;
        public final long b;
        public final int c;

        public a(long l2, long l3, int n2) {
            this.a = l2;
            this.c = n2;
            this.b = l3;
        }
    }
}

