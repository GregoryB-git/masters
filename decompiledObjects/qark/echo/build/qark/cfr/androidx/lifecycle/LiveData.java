/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  androidx.lifecycle.LiveData.c
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.Map
 *  java.util.Map$Entry
 */
package androidx.lifecycle;

import androidx.lifecycle.d;
import androidx.lifecycle.f;
import androidx.lifecycle.g;
import androidx.lifecycle.h;
import androidx.lifecycle.m;
import java.util.Map;
import m.a;
import n.b;

public abstract class LiveData {
    public static final Object k = new Object();
    public final Object a = new Object();
    public n.b b = new n.b();
    public int c = 0;
    public boolean d;
    public volatile Object e;
    public volatile Object f;
    public int g;
    public boolean h;
    public boolean i;
    public final Runnable j;

    public LiveData() {
        Object object;
        this.f = object = k;
        this.j = new Runnable(){

            /*
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             */
            public void run() {
                Object object;
                Object object2 = LiveData.this.a;
                synchronized (object2) {
                    object = LiveData.this.f;
                    LiveData.this.f = LiveData.k;
                }
                LiveData.this.j(object);
            }
        };
        this.e = object;
        this.g = -1;
    }

    public static void a(String string2) {
        if (a.d().b()) {
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Cannot invoke ");
        stringBuilder.append(string2);
        stringBuilder.append(" on a background thread");
        throw new IllegalStateException(stringBuilder.toString());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void b(int n8) {
        int n9 = this.c;
        this.c = n8 + n9;
        if (this.d) {
            return;
        }
        this.d = true;
        try {
            do {
                int n10;
                if (n9 != (n10 = this.c)) {
                    n8 = n9 == 0 && n10 > 0 ? 1 : 0;
                }
                this.d = false;
                return;
                n9 = n9 > 0 && n10 == 0 ? 1 : 0;
                if (n8 != 0) {
                    this.f();
                } else {
                    this.g();
                }
                n9 = n10;
            } while (true);
        }
        catch (Throwable throwable) {}
        this.d = false;
        throw throwable;
    }

    public final void c(c c8) {
        if (!c8.p) {
            return;
        }
        if (!c8.d()) {
            c8.b(false);
            return;
        }
        int n8 = c8.q;
        int n9 = this.g;
        if (n8 >= n9) {
            return;
        }
        c8.q = n9;
        c8.o.a(this.e);
    }

    public void d(c c8) {
        if (this.h) {
            this.i = true;
            return;
        }
        this.h = true;
        do {
            c c9;
            block5 : {
                this.i = false;
                if (c8 != null) {
                    this.c(c8);
                    c9 = null;
                } else {
                    b.d d8 = this.b.f();
                    do {
                        c9 = c8;
                        if (!d8.hasNext()) break block5;
                        this.c((c)((Map.Entry)d8.next()).getValue());
                    } while (!this.i);
                    c9 = c8;
                }
            }
            c8 = c9;
        } while (this.i);
        this.h = false;
    }

    public void e(m object) {
        LiveData.a("observeForever");
        b b8 = new b((m)object);
        object = (c)this.b.k(object, b8);
        if (!(object instanceof LifecycleBoundObserver)) {
            if (object != null) {
                return;
            }
            b8.b(true);
            return;
        }
        throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
    }

    public void f() {
    }

    public void g() {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public void h(Object object) {
        Object object2 = this.a;
        // MONITORENTER : object2
        boolean bl = this.f == k;
        this.f = object;
        // MONITOREXIT : object2
        if (!bl) {
            return;
        }
        a.d().c(this.j);
    }

    public void i(m object) {
        LiveData.a("removeObserver");
        object = (c)this.b.q(object);
        if (object == null) {
            return;
        }
        object.c();
        object.b(false);
    }

    public void j(Object object) {
        LiveData.a("setValue");
        ++this.g;
        this.e = object;
        this.d(null);
    }

    public class LifecycleBoundObserver
    extends androidx.lifecycle.LiveData.c
    implements f {
        public final h s;
        public final /* synthetic */ LiveData t;

        @Override
        public void a(h object, d.b object2) {
            object = this.s.g().b();
            if (object == d.c.o) {
                this.t.i(this.o);
                return;
            }
            object2 = null;
            while (object2 != object) {
                this.b(this.d());
                d.c c8 = this.s.g().b();
                object2 = object;
                object = c8;
            }
        }

        public void c() {
            this.s.g().c(this);
        }

        public boolean d() {
            return this.s.g().b().c(d.c.r);
        }
    }

    public class b
    extends c {
        public b(m m8) {
            super(m8);
        }

        @Override
        public boolean d() {
            return true;
        }
    }

    public abstract class c {
        public final m o;
        public boolean p;
        public int q;

        public c(m m8) {
            this.q = -1;
            this.o = m8;
        }

        public void b(boolean bl) {
            if (bl == this.p) {
                return;
            }
            this.p = bl;
            LiveData liveData = LiveData.this;
            int n8 = bl ? 1 : -1;
            liveData.b(n8);
            if (this.p) {
                LiveData.this.d(this);
            }
        }

        public void c() {
        }

        public abstract boolean d();
    }

}

