/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.jakewharton.rxbinding.internal.Functions$Always
 *  java.lang.AssertionError
 *  java.lang.Boolean
 *  java.lang.Object
 *  rx.functions.Func0
 *  rx.functions.Func1
 */
package com.jakewharton.rxbinding.internal;

import com.jakewharton.rxbinding.internal.Functions;
import rx.functions.Func0;
import rx.functions.Func1;

public final class Functions {
    private static final Always<Boolean> ALWAYS_TRUE;
    public static final Func0<Boolean> FUNC0_ALWAYS_TRUE;
    public static final Func1<Object, Boolean> FUNC1_ALWAYS_TRUE;

    static {
        Always always;
        ALWAYS_TRUE = always = new /* Unavailable Anonymous Inner Class!! */;
        FUNC0_ALWAYS_TRUE = always;
        FUNC1_ALWAYS_TRUE = always;
    }

    private Functions() {
        throw new AssertionError((Object)"No instances.");
    }
}

