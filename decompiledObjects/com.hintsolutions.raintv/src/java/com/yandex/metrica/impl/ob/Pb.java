/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  androidx.annotation.NonNull
 *  java.lang.Object
 *  java.lang.Override
 */
package com.yandex.metrica.impl.ob;

import android.content.Context;
import androidx.annotation.NonNull;
import com.yandex.metrica.impl.ob.U0;
import com.yandex.metrica.impl.ob.dm;
import com.yandex.metrica.impl.ob.mb;
import com.yandex.metrica.impl.ob.nb;
import com.yandex.metrica.impl.ob.ob;
import com.yandex.metrica.impl.ob.zb;

public class pb
implements ob {
    private final ob a;

    public pb(@NonNull ob ob2) {
        this.a = ob2;
    }

    @NonNull
    private nb a(@NonNull dm<nb> object) {
        nb nb2 = object.a();
        mb mb2 = nb2.a;
        object = nb2;
        if (mb2 != null) {
            object = nb2;
            if ("00000000-0000-0000-0000-000000000000".equals((Object)mb2.b)) {
                object = new nb(null, U0.d, "AdvId is invalid: 00000000-0000-0000-0000-000000000000");
            }
        }
        return object;
    }

    @Override
    @NonNull
    public nb a(@NonNull Context context) {
        return this.a(new dm<nb>(){
            public final Context a;
            public final pb b;
            {
                this.b = pb2;
                this.a = context;
            }

            public nb b() {
                return this.b.a.a(this.a);
            }
        });
    }

    @Override
    @NonNull
    public nb a(@NonNull Context context, @NonNull zb zb2) {
        return this.a(new dm<nb>(){
            public final Context a;
            public final zb b;
            public final pb c;
            {
                this.c = pb2;
                this.a = context;
                this.b = zb2;
            }

            @Override
            public Object a() {
                return this.c.a.a(this.a, this.b);
            }
        });
    }
}

