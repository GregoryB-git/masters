/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.UnsupportedOperationException
 *  java.nio.charset.Charset
 *  kotlin.jvm.internal.Intrinsics
 *  kotlin.text.Charsets
 *  org.jetbrains.annotations.NotNull
 */
package com.yandex.metrica.impl.ob;

import com.yandex.metrica.core.api.Converter;
import java.nio.charset.Charset;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

public final class L6
implements Converter {
    @NotNull
    public byte[] a(@NotNull String object) {
        String string2 = object;
        if (Intrinsics.areEqual((Object)"native", (Object)object)) {
            string2 = "JVM";
        }
        object = Charsets.UTF_8;
        if (string2 != null) {
            object = string2.getBytes((Charset)object);
            Intrinsics.checkNotNullExpressionValue((Object)object, (String)"(this as java.lang.String).getBytes(charset)");
            return object;
        }
        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
    }

    @Override
    public Object toModel(Object object) {
        object = (byte[])object;
        throw new UnsupportedOperationException();
    }
}

