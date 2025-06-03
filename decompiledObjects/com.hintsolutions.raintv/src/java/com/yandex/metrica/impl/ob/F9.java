/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.Throwable
 */
package com.yandex.metrica.impl.ob;

import androidx.annotation.NonNull;
import com.yandex.metrica.core.api.ProtobufConverter;
import com.yandex.metrica.core.api.ProtobufStateSerializer;
import com.yandex.metrica.core.api.ProtobufStateStorage;
import com.yandex.metrica.impl.ob.A2;
import com.yandex.metrica.impl.ob.M7;

public class f9
implements ProtobufStateStorage {
    @NonNull
    private final String a;
    @NonNull
    private final M7 b;
    @NonNull
    private final ProtobufStateSerializer c;
    @NonNull
    private final ProtobufConverter d;

    public f9(@NonNull String string, @NonNull M7 m7, @NonNull ProtobufStateSerializer protobufStateSerializer, @NonNull ProtobufConverter protobufConverter) {
        this.a = string;
        this.b = m7;
        this.c = protobufStateSerializer;
        this.d = protobufConverter;
    }

    @Override
    public void delete() {
        this.b.b(this.a);
    }

    @Override
    @NonNull
    public Object read() {
        try {
            Object object = this.b.a(this.a);
            if (A2.a(object)) {
                return this.d.toModel(this.c.defaultValue());
            }
            object = this.d.toModel(this.c.toState((byte[])object));
            return object;
        }
        catch (Throwable throwable) {
            return this.d.toModel(this.c.defaultValue());
        }
    }

    @Override
    public void save(@NonNull Object object) {
        this.b.a(this.a, this.c.toByteArray(this.d.fromModel(object)));
    }
}

