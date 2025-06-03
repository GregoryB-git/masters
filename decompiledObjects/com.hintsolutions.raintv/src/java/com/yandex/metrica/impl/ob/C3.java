/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  androidx.annotation.NonNull
 *  androidx.annotation.VisibleForTesting
 *  java.lang.Object
 *  java.util.List
 */
package com.yandex.metrica.impl.ob;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.billing_interface.a;
import com.yandex.metrica.core.api.ProtobufStateStorage;
import com.yandex.metrica.impl.ob.X2;
import com.yandex.metrica.impl.ob.Y9;
import com.yandex.metrica.impl.ob.n;
import java.util.List;

public class c3
implements n {
    @NonNull
    private final ProtobufStateStorage a;
    @NonNull
    private X2 b;

    public c3(@NonNull Context context) {
        this(Y9.b.a(X2.class).a(context));
    }

    @VisibleForTesting
    public c3(@NonNull ProtobufStateStorage protobufStateStorage) {
        this.a = protobufStateStorage;
        this.b = (X2)protobufStateStorage.read();
    }

    @NonNull
    public List<a> a() {
        return this.b.a;
    }

    public void a(@NonNull List<a> object, boolean bl2) {
        for (a a2 : object) {
        }
        this.b = object = new X2((List<a>)object, bl2);
        this.a.save(object);
    }

    public boolean b() {
        return this.b.b;
    }
}

