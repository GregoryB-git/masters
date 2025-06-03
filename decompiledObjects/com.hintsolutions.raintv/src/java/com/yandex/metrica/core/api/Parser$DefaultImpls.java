/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Throwable
 *  kotlin.Result
 *  kotlin.ResultKt
 */
package com.yandex.metrica.core.api;

import com.yandex.metrica.core.api.Parser;
import kotlin.Result;
import kotlin.ResultKt;

public final class Parser$DefaultImpls {
    public static Object parseOrNull(Parser object, Object object2) {
        try {
            object = Result.constructor-impl((Object)object.parse(object2));
        }
        catch (Throwable throwable) {
            object = Result.constructor-impl((Object)ResultKt.createFailure((Throwable)throwable));
        }
        object2 = object;
        if (Result.isFailure-impl((Object)object)) {
            object2 = null;
        }
        return object2;
    }
}

