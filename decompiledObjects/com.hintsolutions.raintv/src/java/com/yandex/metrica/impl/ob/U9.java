/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  androidx.annotation.VisibleForTesting
 *  com.yandex.metrica.core.api.ProtobufConverter
 *  com.yandex.metrica.impl.ob.ja
 *  com.yandex.metrica.impl.ob.ka
 *  com.yandex.metrica.impl.ob.xf$e
 *  com.yandex.metrica.impl.ob.xf$f
 *  java.lang.Object
 */
package com.yandex.metrica.impl.ob;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.core.api.ProtobufConverter;
import com.yandex.metrica.impl.ob.ja;
import com.yandex.metrica.impl.ob.ka;
import com.yandex.metrica.impl.ob.t9;
import com.yandex.metrica.impl.ob.xf;

public class u9
implements ProtobufConverter {
    @NonNull
    private final t9 a;

    public u9() {
        this(new t9());
    }

    @VisibleForTesting
    public u9(@NonNull t9 t92) {
        this.a = t92;
    }

    @Nullable
    private ja a(@Nullable xf.e object) {
        object = object == null ? null : this.a.a((xf.e)object);
        return object;
    }

    @Nullable
    private xf.e a(@Nullable ja ja2) {
        if (ja2 == null) {
            ja2 = null;
        } else {
            this.a.getClass();
            xf.e e8 = new xf.e();
            e8.a = ja2.a;
            e8.b = ja2.b;
            ja2 = e8;
        }
        return ja2;
    }

    @NonNull
    public ka a(@NonNull xf.f f2) {
        return new ka(this.a(f2.a), this.a(f2.b), this.a(f2.c));
    }

    @NonNull
    public xf.f a(@NonNull ka ka2) {
        xf.f f2 = new xf.f();
        f2.a = this.a(ka2.a);
        f2.b = this.a(ka2.b);
        f2.c = this.a(ka2.c);
        return f2;
    }

    @NonNull
    public Object toModel(@NonNull Object object) {
        object = (xf.f)object;
        return new ka(this.a(((xf.f)object).a), this.a(((xf.f)object).b), this.a(((xf.f)object).c));
    }
}

