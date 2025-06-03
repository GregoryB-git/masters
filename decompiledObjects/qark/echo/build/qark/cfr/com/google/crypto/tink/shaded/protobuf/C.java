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
package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.D;
import com.google.crypto.tink.shaded.protobuf.c;
import com.google.crypto.tink.shaded.protobuf.h;
import com.google.crypto.tink.shaded.protobuf.n0;
import com.google.crypto.tink.shaded.protobuf.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

public class C
extends c
implements D,
RandomAccess {
    public static final C q;
    public static final D r;
    public final List p;

    static {
        C c8;
        q = c8 = new C();
        c8.j();
        r = c8;
    }

    public C() {
        this(10);
    }

    public C(int n8) {
        this(new ArrayList(n8));
    }

    public C(ArrayList arrayList) {
        this.p = arrayList;
    }

    public static String f(Object object) {
        if (object instanceof String) {
            return (String)object;
        }
        if (object instanceof h) {
            return ((h)object).c0();
        }
        return z.i((byte[])object);
    }

    @Override
    public void C(h h8) {
        this.a();
        this.p.add((Object)h8);
        ++this.modCount;
    }

    @Override
    public boolean addAll(int n8, Collection collection) {
        this.a();
        Collection collection2 = collection;
        if (collection instanceof D) {
            collection2 = ((D)collection).o();
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
        if (arrby instanceof h) {
            arrby = (h)arrby;
            String string2 = arrby.c0();
            if (arrby.M()) {
                this.p.set(n8, (Object)string2);
            }
            return string2;
        }
        arrby = arrby;
        String string3 = z.i(arrby);
        if (z.g(arrby)) {
            this.p.set(n8, (Object)string3);
        }
        return string3;
    }

    public C i(int n8) {
        if (n8 >= this.size()) {
            ArrayList arrayList = new ArrayList(n8);
            arrayList.addAll((Collection)this.p);
            return new C(arrayList);
        }
        throw new IllegalArgumentException();
    }

    public String k(int n8) {
        this.a();
        Object object = this.p.remove(n8);
        ++this.modCount;
        return C.f(object);
    }

    @Override
    public D m() {
        if (this.p()) {
            return new n0(this);
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
        return C.f(this.p.set(n8, (Object)string2));
    }

    public int size() {
        return this.p.size();
    }
}

