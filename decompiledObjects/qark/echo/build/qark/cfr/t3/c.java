/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  java.lang.IllegalArgumentException
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayDeque
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 */
package t3;

import android.content.Context;
import android.os.Bundle;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import t3.a;
import t3.b;
import w3.a;

public class c {
    public final r4.b a;
    public final String b;
    public Integer c;

    public c(Context context, r4.b b8, String string2) {
        this.a = b8;
        this.b = string2;
        this.c = null;
    }

    public static List c(List list) {
        ArrayList arrayList = new ArrayList();
        list = list.iterator();
        while (list.hasNext()) {
            arrayList.add((Object)b.b((Map)list.next()));
        }
        return arrayList;
    }

    public final void a(a.c c8) {
        ((w3.a)this.a.get()).b(c8);
    }

    public final void b(List list) {
        ArrayDeque arrayDeque = new ArrayDeque((Collection)this.f());
        int n8 = this.i();
        list = list.iterator();
        while (list.hasNext()) {
            Object object = (b)list.next();
            while (arrayDeque.size() >= n8) {
                this.k(((a.c)arrayDeque.pollFirst()).b);
            }
            object = object.f(this.b);
            this.a((a.c)object);
            arrayDeque.offer(object);
        }
    }

    public final boolean d(List list, b object) {
        String string2 = object.c();
        object = object.e();
        for (b b8 : list) {
            if (!b8.c().equals((Object)string2) || !b8.e().equals(object)) continue;
            return true;
        }
        return false;
    }

    public List e() {
        this.o();
        List list = this.f();
        ArrayList arrayList = new ArrayList();
        list = list.iterator();
        while (list.hasNext()) {
            arrayList.add((Object)b.a((a.c)list.next()));
        }
        return arrayList;
    }

    public final List f() {
        return ((w3.a)this.a.get()).c(this.b, "");
    }

    public final ArrayList g(List list, List list2) {
        ArrayList arrayList = new ArrayList();
        for (b b8 : list) {
            if (this.d(list2, b8)) continue;
            arrayList.add((Object)b8);
        }
        return arrayList;
    }

    public final ArrayList h(List list, List list2) {
        ArrayList arrayList = new ArrayList();
        for (b b8 : list) {
            if (this.d(list2, b8)) continue;
            arrayList.add((Object)b8.f(this.b));
        }
        return arrayList;
    }

    public final int i() {
        if (this.c == null) {
            this.c = ((w3.a)this.a.get()).f(this.b);
        }
        return this.c;
    }

    public void j() {
        this.o();
        this.l((Collection)this.f());
    }

    public final void k(String string2) {
        ((w3.a)this.a.get()).clearConditionalUserProperty(string2, null, null);
    }

    public final void l(Collection collection) {
        collection = collection.iterator();
        while (collection.hasNext()) {
            this.k(((a.c)collection.next()).b);
        }
    }

    public void m(List list) {
        this.o();
        if (list != null) {
            this.n(c.c(list));
            return;
        }
        throw new IllegalArgumentException("The replacementExperiments list is null.");
    }

    public final void n(List list) {
        if (list.isEmpty()) {
            this.j();
            return;
        }
        List list2 = this.e();
        this.l((Collection)this.h(list2, list));
        this.b((List)this.g(list, list2));
    }

    public final void o() {
        if (this.a.get() != null) {
            return;
        }
        throw new a("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
    }
}

