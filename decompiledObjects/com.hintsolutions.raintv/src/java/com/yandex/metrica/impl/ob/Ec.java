/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  java.lang.Long
 *  java.lang.Object
 *  org.json.JSONArray
 */
package com.yandex.metrica.impl.ob;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.impl.ob.E;
import com.yandex.metrica.impl.ob.hc;
import org.json.JSONArray;

public class ec {
    @Nullable
    private Long a;
    private long b;
    private long c;
    @Nullable
    private JSONArray d;
    @Nullable
    private JSONArray e;
    @Nullable
    private E.b.a f;
    @Nullable
    private hc.a g;

    @Nullable
    public JSONArray a() {
        return this.e;
    }

    public void a(long l5) {
        this.c = l5;
    }

    public void a(@NonNull E.b.a a2) {
        this.f = a2;
    }

    public void a(@NonNull hc.a a2) {
        this.g = a2;
    }

    public void a(@Nullable Long l5) {
        this.a = l5;
    }

    public void a(@Nullable JSONArray jSONArray) {
        this.e = jSONArray;
    }

    @Nullable
    public E.b.a b() {
        return this.f;
    }

    public void b(long l5) {
        this.b = l5;
    }

    public void b(@Nullable JSONArray jSONArray) {
        this.d = jSONArray;
    }

    public long c() {
        return this.c;
    }

    public long d() {
        return this.b;
    }

    @Nullable
    public hc.a e() {
        return this.g;
    }

    @Nullable
    public Long f() {
        return this.a;
    }

    @Nullable
    public JSONArray g() {
        return this.d;
    }
}

