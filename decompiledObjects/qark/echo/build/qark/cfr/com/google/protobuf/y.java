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
package com.google.protobuf;

import com.google.protobuf.c;
import com.google.protobuf.f;
import com.google.protobuf.j0;
import com.google.protobuf.t;
import com.google.protobuf.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

public class y
extends c
implements z,
RandomAccess {
    public static final y q;
    public static final z r;
    public final List p;

    static {
        y y8;
        q = y8 = new y();
        y8.j();
        r = y8;
    }

    public y() {
        this(10);
    }

    public y(int n8) {
        this(new ArrayList(n8));
    }

    public y(ArrayList arrayList) {
        this.p = arrayList;
    }

    public static String f(Object object) {
        if (object instanceof String) {
            return (String)object;
        }
        if (object instanceof f) {
            return ((f)object).Y();
        }
        return t.i((byte[])object);
    }

    @Override
    public boolean addAll(int n8, Collection collection) {
        this.a();
        Collection collection2 = collection;
        if (collection instanceof z) {
            collection2 = ((z)collection).o();
        }
        boolean bl = this.p.addAll(n8, collection2);
        ++this.modCount;
        return bl;
    }

    @Override
    public boolean addAll(Collection collection) {
        return this.addAll(this.size(), collection);
    }

    @Override
    public void clear() {
        this.a();
        this.p.clear();
        ++this.modCount;
    }

    public void d(int n8, String string2) {
        this.a();
        this.p.add(n8, (Object)string2);
        ++this.modCount;
    }

    public String g(int n8) {
        byte[] arrby = this.p.get(n8);
        if (arrby instanceof String) {
            return (String)arrby;
        }
        if (arrby instanceof f) {
            arrby = (f)arrby;
            String string2 = arrby.Y();
            if (arrby.s()) {
                this.p.set(n8, (Object)string2);
            }
            return string2;
        }
        arrby = arrby;
        String string3 = t.i(arrby);
        if (t.g(arrby)) {
            this.p.set(n8, (Object)string3);
        }
        return string3;
    }

    public y i(int n8) {
        if (n8 >= this.size()) {
            ArrayList arrayList = new ArrayList(n8);
            arrayList.addAll((Collection)this.p);
            return new y(arrayList);
        }
        throw new IllegalArgumentException();
    }

    public String k(int n8) {
        this.a();
        Object object = this.p.remove(n8);
        ++this.modCount;
        return y.f(object);
    }

    @Override
    public z m() {
        if (this.p()) {
            return new j0(this);
        }
        return this;
    }

    @Override
    public Object n(int n8) {
        return this.p.get(n8);
    }

    @Override
    public List o() {
        return Collections.unmodifiableList((List)this.p);
    }

    public String q(int n8, String string2) {
        this.a();
        return y.f(this.p.set(n8, (Object)string2));
    }

    public int size() {
        return this.p.size();
    }

    @Override
    public void x(f f8) {
        this.a();
        this.p.add((Object)f8);
        ++this.modCount;
    }
}

