/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.Collection
 *  java.util.HashMap
 *  java.util.HashSet
 *  java.util.Iterator
 *  java.util.LinkedList
 *  java.util.ListIterator
 *  java.util.Map
 *  java.util.Set
 */
package n5;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import n5.k;
import n5.m;
import n5.o;
import n5.p;
import n5.q;
import n5.r;

public class s
implements q {
    public final String a;
    public final int b;
    public final int c;
    public final LinkedList d = new LinkedList();
    public final Set e = new HashSet();
    public final Set f = new HashSet();
    public final Map g = new HashMap();

    public s(String string2, int n8, int n9) {
        this.a = string2;
        this.b = n8;
        this.c = n9;
    }

    public static /* synthetic */ void d(s s8, o o8) {
        s8.g(o8);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void a() {
        synchronized (this) {
            try {
                Iterator iterator = this.e.iterator();
                while (iterator.hasNext()) {
                    ((o)iterator.next()).f();
                }
                iterator = this.f.iterator();
                do {
                    if (!iterator.hasNext()) {
                        return;
                    }
                    ((o)iterator.next()).f();
                } while (true);
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    @Override
    public /* synthetic */ void b(k k8, Runnable runnable) {
        p.a(this, k8, runnable);
    }

    @Override
    public void c(m m8) {
        synchronized (this) {
            Throwable throwable2;
            block4 : {
                try {
                    this.d.add((Object)m8);
                    m8 = new HashSet((Collection)this.e).iterator();
                    while (m8.hasNext()) {
                        this.i((o)m8.next());
                    }
                }
                catch (Throwable throwable2) {
                    break block4;
                }
                return;
            }
            throw throwable2;
        }
    }

    public o e(String string2, int n8) {
        return new o(string2, n8);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final m f(o o8) {
        synchronized (this) {
            m m8;
            o o9;
            ListIterator listIterator;
            block4 : {
                try {
                    listIterator = this.d.listIterator();
                    break block4;
                }
                catch (Throwable throwable) {}
                throw throwable;
            }
            do {
                boolean bl = listIterator.hasNext();
                o9 = null;
                if (!bl) return null;
                m8 = (m)listIterator.next();
                if (m8.a() == null) continue;
                o9 = (o)this.g.get((Object)m8.a());
            } while (o9 != null && o9 != o8);
            listIterator.remove();
            return m8;
        }
    }

    public final /* synthetic */ void g(o o8) {
        this.h(o8);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void h(o o8) {
        synchronized (this) {
            try {
                HashSet hashSet = new HashSet((Collection)this.e);
                this.f.remove((Object)o8);
                this.e.add((Object)o8);
                if (!o8.b() && o8.d() != null) {
                    this.g.remove((Object)o8.d());
                }
                this.i(o8);
                o8 = hashSet.iterator();
                do {
                    if (!o8.hasNext()) {
                        return;
                    }
                    this.i((o)o8.next());
                } while (true);
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void i(o o8) {
        synchronized (this) {
            try {
                m m8 = this.f(o8);
                if (m8 != null) {
                    this.f.add((Object)o8);
                    this.e.remove((Object)o8);
                    if (m8.a() != null) {
                        this.g.put((Object)m8.a(), (Object)o8);
                    }
                    o8.e(m8);
                }
                return;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void start() {
        synchronized (this) {
            Throwable throwable2;
            block4 : {
                try {
                    for (int i8 = 0; i8 < this.b; ++i8) {
                        Object object = new StringBuilder();
                        object.append(this.a);
                        object.append(i8);
                        object = this.e(object.toString(), this.c);
                        object.g(new r(this, (o)object));
                        this.e.add(object);
                    }
                }
                catch (Throwable throwable2) {
                    break block4;
                }
                return;
            }
            throw throwable2;
        }
    }
}

