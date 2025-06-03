/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.util.Set
 */
package com.yandex.metrica.impl.ob;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.impl.ob.N7;
import com.yandex.metrica.impl.ob.R7;
import java.util.Set;

class fa
implements N7 {
    @NonNull
    private final N7 a;

    public fa(@NonNull Context context, @NonNull R7 r72, @NonNull N7 n72) {
        this.a = n72;
    }

    @Override
    public int a(String string, int n2) {
        return this.a.a(string, n2);
    }

    @Override
    public long a(String string, long l2) {
        return this.a.a(string, l2);
    }

    @Override
    public N7 a(String string, String string2) {
        this.a.a(string, string2);
        return this;
    }

    @Override
    public N7 a(String string, boolean bl2) {
        this.a.a(string, bl2);
        return this;
    }

    @Override
    @NonNull
    public Set<String> a() {
        return this.a.a();
    }

    @Override
    public boolean a(@NonNull String string) {
        return this.a.a(string);
    }

    @Override
    public N7 b(String string) {
        this.a.b(string);
        return this;
    }

    @Override
    public N7 b(String string, int n2) {
        this.a.b(string, n2);
        return this;
    }

    @Override
    public N7 b(String string, long l2) {
        this.a.b(string, l2);
        return this;
    }

    @Override
    @Nullable
    public String b(String string, String string2) {
        return this.a.b(string, string2);
    }

    @Override
    public void b() {
        this.a.b();
    }

    @Override
    public boolean b(String string, boolean bl2) {
        return this.a.b(string, bl2);
    }
}

