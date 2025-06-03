/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.List
 *  java.util.RandomAccess
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.a4;
import com.google.android.gms.internal.measurement.h4;
import com.google.android.gms.internal.measurement.l3;
import com.google.android.gms.internal.measurement.n4;
import com.google.android.gms.internal.measurement.q3;
import com.google.android.gms.internal.measurement.y5;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

public final class o4
extends l3
implements n4,
RandomAccess {
    public static final o4 q;
    public static final n4 r;
    public final List p;

    static {
        o4 o42;
        q = o42 = new o4(false);
        r = o42;
    }

    public o4(int n8) {
        this(new ArrayList(n8));
    }

    public o4(ArrayList arrayList) {
        this.p = arrayList;
    }

    public o4(boolean bl) {
        super(false);
        this.p = Collections.emptyList();
    }

    public static String d(Object object) {
        if (object instanceof String) {
            return (String)object;
        }
        if (object instanceof q3) {
            return ((q3)object).V();
        }
        return a4.h((byte[])object);
    }

    @Override
    public final void K(q3 q32) {
        this.a();
        this.p.add((Object)q32);
        ++this.modCount;
    }

    public final /* synthetic */ void add(int n8, Object object) {
        object = (String)object;
        this.a();
        this.p.add(n8, object);
        ++this.modCount;
    }

    @Override
    public final boolean addAll(int n8, Collection collection) {
        this.a();
        Collection collection2 = collection;
        if (collection instanceof n4) {
            collection2 = ((n4)collection).b();
        }
        boolean bl = this.p.addAll(n8, collection2);
        ++this.modCount;
        return bl;
    }

    @Override
    public final boolean addAll(Collection collection) {
        return this.addAll(this.size(), collection);
    }

    @Override
    public final List b() {
        return Collections.unmodifiableList((List)this.p);
    }

    @Override
    public final void clear() {
        this.a();
        this.p.clear();
        ++this.modCount;
    }

    @Override
    public final /* synthetic */ h4 e(int n8) {
        if (n8 >= this.size()) {
            ArrayList arrayList = new ArrayList(n8);
            arrayList.addAll((Collection)this.p);
            return new o4(arrayList);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ Object get(int n8) {
        byte[] arrby = this.p.get(n8);
        if (arrby instanceof String) {
            return (String)arrby;
        }
        if (arrby instanceof q3) {
            arrby = (q3)arrby;
            String string2 = arrby.V();
            if (arrby.W()) {
                this.p.set(n8, (Object)string2);
            }
            return string2;
        }
        arrby = arrby;
        String string3 = a4.h(arrby);
        if (a4.i(arrby)) {
            this.p.set(n8, (Object)string3);
        }
        return string3;
    }

    @Override
    public final Object l(int n8) {
        return this.p.get(n8);
    }

    @Override
    public final /* synthetic */ Object remove(int n8) {
        this.a();
        Object object = this.p.remove(n8);
        ++this.modCount;
        return o4.d(object);
    }

    public final /* synthetic */ Object set(int n8, Object object) {
        object = (String)object;
        this.a();
        return o4.d(this.p.set(n8, object));
    }

    public final int size() {
        return this.p.size();
    }

    @Override
    public final n4 w() {
        if (this.c()) {
            return new y5(this);
        }
        return this;
    }
}

