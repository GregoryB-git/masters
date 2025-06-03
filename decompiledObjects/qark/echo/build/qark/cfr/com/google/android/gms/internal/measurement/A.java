/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.UnsupportedOperationException
 *  java.util.ArrayList
 *  java.util.List
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C2;
import com.google.android.gms.internal.measurement.f3;
import com.google.android.gms.internal.measurement.s;
import java.util.ArrayList;
import java.util.List;

public abstract class A {
    public final List a = new ArrayList();

    public final s a(String string2) {
        if (this.a.contains((Object)C2.c(string2))) {
            StringBuilder stringBuilder = new StringBuilder("Command not implemented: ");
            stringBuilder.append(string2);
            throw new UnsupportedOperationException(stringBuilder.toString());
        }
        throw new IllegalArgumentException("Command not supported");
    }

    public abstract s b(String var1, f3 var2, List var3);
}

