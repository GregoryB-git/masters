/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.VisibleForTesting
 *  com.yandex.metrica.impl.ob.im
 *  com.yandex.metrica.impl.ob.jm
 *  java.lang.Deprecated
 *  java.lang.Object
 */
package com.yandex.metrica.impl.ob;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.core.api.ProtobufStateSerializer;
import com.yandex.metrica.impl.ob.Sd;
import com.yandex.metrica.impl.ob.Z2;
import com.yandex.metrica.impl.ob.a9;
import com.yandex.metrica.impl.ob.ae;
import com.yandex.metrica.impl.ob.c9;
import com.yandex.metrica.impl.ob.d9;
import com.yandex.metrica.impl.ob.e9;
import com.yandex.metrica.impl.ob.g9;
import com.yandex.metrica.impl.ob.i9;
import com.yandex.metrica.impl.ob.im;
import com.yandex.metrica.impl.ob.j9;
import com.yandex.metrica.impl.ob.jm;

public class X9 {
    private im a;

    @VisibleForTesting
    public X9(im im2) {
        this.a = im2;
    }

    @NonNull
    public ProtobufStateSerializer a() {
        return new d9(new a9(), new jm("AES/CBC/PKCS5Padding", this.a.b(), this.a.a()));
    }

    @NonNull
    public ProtobufStateSerializer b() {
        return new d9(new Z2(), new jm("AES/CBC/PKCS5Padding", this.a.b(), this.a.a()));
    }

    @NonNull
    public ProtobufStateSerializer c() {
        return new d9(new c9(), new jm("AES/CBC/PKCS5Padding", this.a.b(), this.a.a()));
    }

    @NonNull
    public ProtobufStateSerializer d() {
        return new d9(new e9(), new jm("AES/CBC/PKCS5Padding", this.a.b(), this.a.a()));
    }

    @NonNull
    public ProtobufStateSerializer e() {
        return new d9(new Sd(), new jm("AES/CBC/PKCS5Padding", this.a.b(), this.a.a()));
    }

    @Deprecated
    @NonNull
    public ProtobufStateSerializer f() {
        return new d9(new ae(), new jm("AES/CBC/PKCS5Padding", this.a.b(), this.a.a()));
    }

    public ProtobufStateSerializer g() {
        return new d9(new g9(), new jm("AES/CBC/PKCS5Padding", this.a.b(), this.a.a()));
    }

    @NonNull
    public ProtobufStateSerializer h() {
        return new d9(new i9(), new jm("AES/CBC/PKCS5Padding", this.a.b(), this.a.a()));
    }

    public ProtobufStateSerializer i() {
        return new d9(new j9(), new jm("AES/CBC/PKCS5Padding", this.a.b(), this.a.a()));
    }
}

