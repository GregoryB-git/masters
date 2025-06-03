/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.reflect.Field
 *  java.security.PrivilegedExceptionAction
 *  sun.misc.Unsafe
 */
package com.google.android.gms.internal.measurement;

import java.lang.reflect.Field;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

public final class C5
implements PrivilegedExceptionAction {
    public final /* synthetic */ Object run() {
        for (Field field : Unsafe.class.getDeclaredFields()) {
            field.setAccessible(true);
            Object object = field.get((Object)null);
            if (!Unsafe.class.isInstance(object)) continue;
            return (Unsafe)Unsafe.class.cast(object);
        }
        return null;
    }
}

