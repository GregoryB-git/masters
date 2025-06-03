/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.UnsupportedOperationException
 *  java.util.AbstractList
 *  java.util.Iterator
 *  java.util.List
 *  java.util.ListIterator
 *  java.util.RandomAccess
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.A5;
import com.google.android.gms.internal.measurement.B5;
import com.google.android.gms.internal.measurement.n4;
import com.google.android.gms.internal.measurement.q3;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public final class y5
extends AbstractList
implements n4,
RandomAccess {
    public final n4 o;

    public y5(n4 n42) {
        this.o = n42;
    }

    @Override
    public final void K(q3 q32) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final List b() {
        return this.o.b();
    }

    public final /* synthetic */ Object get(int n8) {
        return (String)this.o.get(n8);
    }

    public final Iterator iterator() {
        return new A5(this);
    }

    @Override
    public final Object l(int n8) {
        return this.o.l(n8);
    }

    public final ListIterator listIterator(int n8) {
        return new B5(this, n8);
    }

    public final int size() {
        return this.o.size();
    }

    @Override
    public final n4 w() {
        return this;
    }
}

