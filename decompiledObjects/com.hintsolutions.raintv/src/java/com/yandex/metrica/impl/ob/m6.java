/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.UnsupportedOperationException
 *  java.util.Map
 *  java.util.Map$Entry
 *  kotlin.jvm.internal.Intrinsics
 *  kotlin.text.Charsets
 *  org.jetbrains.annotations.NotNull
 */
package com.yandex.metrica.impl.ob;

import com.yandex.metrica.core.api.Converter;
import com.yandex.metrica.impl.ob.Xe;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

public final class M6
implements Converter {
    @NotNull
    public Xe[] a(@NotNull Map<String, String> iterator) {
        int n2;
        int n3 = iterator.size();
        Xe[] xeArray = new Xe[n3];
        int n6 = 0;
        for (n2 = 0; n2 < n3; ++n2) {
            xeArray[n2] = new Xe();
        }
        iterator = iterator.entrySet().iterator();
        n2 = n6;
        while (iterator.hasNext()) {
            Object object = (Map.Entry)iterator.next();
            Xe xe = xeArray[n2];
            Object object2 = (String)object.getKey();
            Object object3 = Charsets.UTF_8;
            if (object2 != null) {
                object2 = object2.getBytes(object3);
                Intrinsics.checkNotNullExpressionValue((Object)object2, (String)"(this as java.lang.String).getBytes(charset)");
                xe.a = (byte[])object2;
                xe = xeArray[n2];
                object = (String)object.getValue();
                if (object != null) {
                    object3 = object.getBytes(object3);
                    Intrinsics.checkNotNullExpressionValue((Object)object3, (String)"(this as java.lang.String).getBytes(charset)");
                    xe.b = (byte[])object3;
                    ++n2;
                    continue;
                }
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        return xeArray;
    }

    @Override
    public Object toModel(Object xeArray) {
        xeArray = xeArray;
        throw new UnsupportedOperationException();
    }
}

