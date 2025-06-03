/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.ref.WeakReference
 *  java.util.ArrayList
 *  java.util.Iterator
 *  java.util.Map
 *  java.util.Map$Entry
 */
package androidx.lifecycle;

import androidx.lifecycle.d;
import androidx.lifecycle.f;
import androidx.lifecycle.g;
import androidx.lifecycle.h;
import androidx.lifecycle.j;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import n.b;

public class i
extends d {
    public n.a b = new n.a();
    public d.c c;
    public final WeakReference d;
    public int e = 0;
    public boolean f = false;
    public boolean g = false;
    public ArrayList h = new ArrayList();
    public final boolean i;

    public i(h h8) {
        this(h8, true);
    }

    public i(h h8, boolean bl) {
        this.d = new WeakReference((Object)h8);
        this.c = d.c.p;
        this.i = bl;
    }

    public static d.c k(d.c c8, d.c c9) {
        d.c c10 = c8;
        if (c9 != null) {
            c10 = c8;
            if (c9.compareTo((Enum)c8) < 0) {
                c10 = c9;
            }
        }
        return c10;
    }

    @Override
    public void a(g g8) {
        this.f("addObserver");
        Object object = this.c;
        Enum enum_ = d.c.o;
        if (object != enum_) {
            enum_ = d.c.p;
        }
        object = new a(g8, (d.c)enum_);
        if ((a)this.b.k(g8, object) != null) {
            return;
        }
        h h8 = (h)this.d.get();
        if (h8 == null) {
            return;
        }
        boolean bl = this.e != 0 || this.f;
        enum_ = this.e(g8);
        ++this.e;
        while (object.a.compareTo(enum_) < 0 && this.b.contains(g8)) {
            this.n(object.a);
            enum_ = d.b.h(object.a);
            if (enum_ != null) {
                object.a(h8, (d.b)enum_);
                this.m();
                enum_ = this.e(g8);
                continue;
            }
            g8 = new StringBuilder();
            g8.append("no event up from ");
            g8.append((Object)object.a);
            throw new IllegalStateException(g8.toString());
        }
        if (!bl) {
            this.p();
        }
        --this.e;
    }

    @Override
    public d.c b() {
        return this.c;
    }

    @Override
    public void c(g g8) {
        this.f("removeObserver");
        this.b.q(g8);
    }

    public final void d(h h8) {
        Iterator iterator = this.b.descendingIterator();
        while (iterator.hasNext() && !this.g) {
            Map.Entry entry = (Map.Entry)iterator.next();
            a a8 = (a)entry.getValue();
            while (a8.a.compareTo((Enum)this.c) > 0 && !this.g && this.b.contains(entry.getKey())) {
                d.b b8 = d.b.c(a8.a);
                if (b8 != null) {
                    this.n(b8.e());
                    a8.a(h8, b8);
                    this.m();
                    continue;
                }
                h8 = new StringBuilder();
                h8.append("no event down from ");
                h8.append((Object)a8.a);
                throw new IllegalStateException(h8.toString());
            }
        }
    }

    public final d.c e(g object) {
        object = this.b.s(object);
        Object object2 = null;
        object = object != null ? ((a)object.getValue()).a : null;
        if (!this.h.isEmpty()) {
            object2 = this.h;
            object2 = (d.c)((Object)object2.get(object2.size() - 1));
        }
        return i.k(i.k(this.c, (d.c)((Object)object)), (d.c)((Object)object2));
    }

    public final void f(String string2) {
        if (this.i) {
            if (m.a.d().b()) {
                return;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Method ");
            stringBuilder.append(string2);
            stringBuilder.append(" must be called on the main thread");
            throw new IllegalStateException(stringBuilder.toString());
        }
    }

    public final void g(h h8) {
        b.d d8 = this.b.f();
        while (d8.hasNext() && !this.g) {
            Map.Entry entry = (Map.Entry)d8.next();
            a a8 = (a)entry.getValue();
            while (a8.a.compareTo((Enum)this.c) < 0 && !this.g && this.b.contains(entry.getKey())) {
                this.n(a8.a);
                d.b b8 = d.b.h(a8.a);
                if (b8 != null) {
                    a8.a(h8, b8);
                    this.m();
                    continue;
                }
                h8 = new StringBuilder();
                h8.append("no event up from ");
                h8.append((Object)a8.a);
                throw new IllegalStateException(h8.toString());
            }
        }
    }

    public void h(d.b b8) {
        this.f("handleLifecycleEvent");
        this.l(b8.e());
    }

    public final boolean i() {
        if (this.b.size() == 0) {
            return true;
        }
        d.c c8 = ((a)this.b.a().getValue()).a;
        d.c c9 = ((a)this.b.g().getValue()).a;
        if (c8 == c9 && this.c == c9) {
            return true;
        }
        return false;
    }

    public void j(d.c c8) {
        this.f("markState");
        this.o(c8);
    }

    public final void l(d.c c8) {
        if (this.c == c8) {
            return;
        }
        this.c = c8;
        if (!this.f && this.e == 0) {
            this.f = true;
            this.p();
            this.f = false;
            return;
        }
        this.g = true;
    }

    public final void m() {
        ArrayList arrayList = this.h;
        arrayList.remove(arrayList.size() - 1);
    }

    public final void n(d.c c8) {
        this.h.add((Object)c8);
    }

    public void o(d.c c8) {
        this.f("setCurrentState");
        this.l(c8);
    }

    public final void p() {
        h h8 = (h)this.d.get();
        if (h8 != null) {
            do {
                boolean bl = this.i();
                this.g = false;
                if (bl) break;
                if (this.c.compareTo((Enum)((a)this.b.a().getValue()).a) < 0) {
                    this.d(h8);
                }
                Map.Entry entry = this.b.g();
                if (this.g || entry == null || this.c.compareTo((Enum)((a)entry.getValue()).a) <= 0) continue;
                this.g(h8);
            } while (true);
            return;
        }
        throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is alreadygarbage collected. It is too late to change lifecycle state.");
    }

    public static class a {
        public d.c a;
        public f b;

        public a(g g8, d.c c8) {
            this.b = j.f(g8);
            this.a = c8;
        }

        public void a(h h8, d.b b8) {
            d.c c8 = b8.e();
            this.a = i.k(this.a, c8);
            this.b.a(h8, b8);
            this.a = c8;
        }
    }

}

