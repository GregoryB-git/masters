/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.util.Iterator
 *  java.util.Map
 *  java.util.Map$Entry
 */
package com.google.android.gms.internal.measurement;

import android.support.v4.media.a;
import com.google.android.gms.internal.measurement.d5;
import com.google.android.gms.internal.measurement.q5;
import java.util.Iterator;
import java.util.Map;

public final class c5
extends d5 {
    public c5(int n8) {
        super(n8, null);
    }

    @Override
    public final void f() {
        if (!this.o()) {
            if (this.g() <= 0) {
                Iterator iterator = this.j().iterator();
                if (iterator.hasNext()) {
                    a.a(((Map.Entry)iterator.next()).getKey());
                    throw null;
                }
            } else {
                a.a(this.h(0).getKey());
                throw null;
            }
        }
        super.f();
    }
}

