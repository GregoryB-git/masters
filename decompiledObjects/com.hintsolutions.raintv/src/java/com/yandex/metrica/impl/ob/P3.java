/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  java.lang.Object
 */
package com.yandex.metrica.impl.ob;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.impl.ob.m3;
import com.yandex.metrica.impl.ob.n3;
import com.yandex.metrica.impl.ob.o3;

public class p3<T extends n3> {
    @NonNull
    private final o3<T> a;
    @Nullable
    private final m3<T> b;

    private p3(@NonNull b b2) {
        this.a = b2.a;
        this.b = b2.b;
    }

    public /* synthetic */ p3(b b2, a a2) {
        this(b2);
    }

    @NonNull
    public static <T extends n3> b<T> a(@NonNull o3<T> o32) {
        return new b<T>(o32);
    }

    public final boolean a(@NonNull n3 n32) {
        m3<n3> m32 = this.b;
        if (m32 == null) {
            return false;
        }
        return m32.a(n32);
    }

    public void b(@NonNull n3 n32) {
        this.a.a(n32);
    }

    public static final class b<T extends n3> {
        @NonNull
        public final o3<T> a;
        @Nullable
        public m3<T> b;

        public b(@NonNull o3<T> o32) {
            this.a = o32;
        }

        @NonNull
        public b<T> a(@NonNull m3<T> m32) {
            this.b = m32;
            return this;
        }

        @NonNull
        public p3<T> a() {
            return new p3(this, null);
        }
    }
}

