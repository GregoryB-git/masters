/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Double
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Iterator
 *  java.util.List
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.f3;
import com.google.android.gms.internal.measurement.h;
import com.google.android.gms.internal.measurement.l;
import com.google.android.gms.internal.measurement.q;
import com.google.android.gms.internal.measurement.u;
import com.google.android.gms.internal.measurement.z;
import java.util.Iterator;
import java.util.List;

public interface s {
    public static final s d = new z();
    public static final s e = new q();
    public static final s f = new l("continue");
    public static final s g = new l("break");
    public static final s h = new l("return");
    public static final s i = new h(Boolean.TRUE);
    public static final s j = new h(Boolean.FALSE);
    public static final s k = new u("");

    public s c();

    public Boolean d();

    public Double f();

    public String g();

    public Iterator k();

    public s s(String var1, f3 var2, List var3);
}

