/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  com.yandex.metrica.core.api.ProtobufConverter
 *  com.yandex.metrica.impl.ob.of$a
 *  com.yandex.metrica.impl.ob.z
 *  com.yandex.metrica.impl.ob.z$a
 *  java.lang.Boolean
 *  java.lang.Object
 */
package com.yandex.metrica.impl.ob;

import androidx.annotation.NonNull;
import com.yandex.metrica.core.api.ProtobufConverter;
import com.yandex.metrica.impl.ob.of;
import com.yandex.metrica.impl.ob.z;

public class o9
implements ProtobufConverter {
    @NonNull
    public of.a a(@NonNull z z5) {
        of.a a8 = new of.a();
        z.a a10 = z5.a;
        if (a10 != null) {
            int n2 = a10.ordinal();
            if (n2 != 0) {
                if (n2 != 1) {
                    if (n2 != 2) {
                        if (n2 != 3) {
                            if (n2 == 4) {
                                a8.a = 5;
                            }
                        } else {
                            a8.a = 4;
                        }
                    } else {
                        a8.a = 3;
                    }
                } else {
                    a8.a = 2;
                }
            } else {
                a8.a = 1;
            }
        }
        if ((z5 = z5.b) != null) {
            a8.b = z5.booleanValue() ? 1 : 0;
        }
        return a8;
    }

    @NonNull
    public z a(@NonNull of.a object) {
        int n2 = object.a;
        Object var4_3 = null;
        Object object2 = n2 != 1 ? (n2 != 2 ? (n2 != 3 ? (n2 != 4 ? (n2 != 5 ? null : z.a.e) : z.a.d) : z.a.c) : z.a.b) : z.a.a;
        n2 = object.b;
        object = n2 != 0 ? (n2 != 1 ? var4_3 : Boolean.TRUE) : Boolean.FALSE;
        return new z(object2, (Boolean)object);
    }
}

