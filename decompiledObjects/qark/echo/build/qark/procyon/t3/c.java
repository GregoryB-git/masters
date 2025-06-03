// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package t3;

import android.os.Bundle;
import java.util.Collection;
import java.util.ArrayDeque;
import w3.a;
import java.util.Iterator;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;
import android.content.Context;
import r4.b;

public class c
{
    public final b a;
    public final String b;
    public Integer c;
    
    public c(final Context context, final b a, final String b) {
        this.a = a;
        this.b = b;
        this.c = null;
    }
    
    public static List c(final List list) {
        final ArrayList<t3.b> list2 = new ArrayList<t3.b>();
        final Iterator<Map> iterator = list.iterator();
        while (iterator.hasNext()) {
            list2.add(t3.b.b(iterator.next()));
        }
        return list2;
    }
    
    public final void a(final a.c c) {
        ((a)this.a.get()).b(c);
    }
    
    public final void b(final List list) {
        final ArrayDeque<a.c> arrayDeque = new ArrayDeque<a.c>(this.f());
        final int i = this.i();
        for (final t3.b b : list) {
            while (arrayDeque.size() >= i) {
                this.k(((a.c)arrayDeque.pollFirst()).b);
            }
            final a.c f = b.f(this.b);
            this.a(f);
            arrayDeque.offer(f);
        }
    }
    
    public final boolean d(final List list, final t3.b b) {
        final String c = b.c();
        final String e = b.e();
        for (final t3.b b2 : list) {
            if (b2.c().equals(c) && b2.e().equals(e)) {
                return true;
            }
        }
        return false;
    }
    
    public List e() {
        this.o();
        final List f = this.f();
        final ArrayList<t3.b> list = new ArrayList<t3.b>();
        final Iterator<a.c> iterator = f.iterator();
        while (iterator.hasNext()) {
            list.add(t3.b.a(iterator.next()));
        }
        return list;
    }
    
    public final List f() {
        return ((a)this.a.get()).c(this.b, "");
    }
    
    public final ArrayList g(final List list, final List list2) {
        final ArrayList<t3.b> list3 = new ArrayList<t3.b>();
        for (final t3.b e : list) {
            if (!this.d(list2, e)) {
                list3.add(e);
            }
        }
        return list3;
    }
    
    public final ArrayList h(final List list, final List list2) {
        final ArrayList<a.c> list3 = new ArrayList<a.c>();
        for (final t3.b b : list) {
            if (!this.d(list2, b)) {
                list3.add(b.f(this.b));
            }
        }
        return list3;
    }
    
    public final int i() {
        if (this.c == null) {
            this.c = ((a)this.a.get()).f(this.b);
        }
        return this.c;
    }
    
    public void j() {
        this.o();
        this.l(this.f());
    }
    
    public final void k(final String s) {
        ((a)this.a.get()).clearConditionalUserProperty(s, null, null);
    }
    
    public final void l(final Collection collection) {
        final Iterator<a.c> iterator = collection.iterator();
        while (iterator.hasNext()) {
            this.k(iterator.next().b);
        }
    }
    
    public void m(final List list) {
        this.o();
        if (list != null) {
            this.n(c(list));
            return;
        }
        throw new IllegalArgumentException("The replacementExperiments list is null.");
    }
    
    public final void n(final List list) {
        if (list.isEmpty()) {
            this.j();
            return;
        }
        final List e = this.e();
        this.l(this.h(e, list));
        this.b(this.g(list, e));
    }
    
    public final void o() {
        if (this.a.get() != null) {
            return;
        }
        throw new t3.a("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
    }
}
