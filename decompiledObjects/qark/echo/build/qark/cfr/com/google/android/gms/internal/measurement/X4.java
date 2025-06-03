/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Exception
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.HashMap
 *  java.util.Map
 *  java.util.concurrent.Callable
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.s;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

public final class X4 {
    public Map a = new HashMap();

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final s a(String string2) {
        if (!this.a.containsKey((Object)string2)) {
            return s.d;
        }
        Callable callable = (Callable)this.a.get((Object)string2);
        try {
            return (s)callable.call();
        }
        catch (Exception exception) {}
        StringBuilder stringBuilder = new StringBuilder("Failed to create API implementation: ");
        stringBuilder.append(string2);
        throw new IllegalStateException(stringBuilder.toString());
    }

    public final void b(String string2, Callable callable) {
        this.a.put((Object)string2, (Object)callable);
    }
}

