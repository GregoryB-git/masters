/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.util.ArrayDeque
 *  java.util.Iterator
 */
package androidx.activity;

import androidx.activity.b;
import androidx.lifecycle.d;
import androidx.lifecycle.f;
import androidx.lifecycle.g;
import androidx.lifecycle.h;
import java.util.ArrayDeque;
import java.util.Iterator;

public final class OnBackPressedDispatcher {
    public final Runnable a;
    public final ArrayDeque b = new ArrayDeque();

    public OnBackPressedDispatcher(Runnable runnable) {
        this.a = runnable;
    }

    public void a(h object, b b8) {
        if ((object = object.g()).b() == d.c.o) {
            return;
        }
        b8.a(new LifecycleOnBackPressedCancellable((d)object, b8));
    }

    public androidx.activity.a b(b b8) {
        this.b.add((Object)b8);
        a a8 = new a(b8);
        b8.a(a8);
        return a8;
    }

    public void c() {
        Iterator iterator = this.b.descendingIterator();
        while (iterator.hasNext()) {
            b b8 = (b)iterator.next();
            if (!b8.c()) continue;
            b8.b();
            return;
        }
        iterator = this.a;
        if (iterator != null) {
            iterator.run();
        }
    }

    public class LifecycleOnBackPressedCancellable
    implements f,
    androidx.activity.a {
        public final d o;
        public final b p;
        public androidx.activity.a q;

        public LifecycleOnBackPressedCancellable(d d8, b b8) {
            this.o = d8;
            this.p = b8;
            d8.a(this);
        }

        @Override
        public void a(h object, d.b b8) {
            if (b8 == d.b.ON_START) {
                this.q = OnBackPressedDispatcher.this.b(this.p);
                return;
            }
            if (b8 == d.b.ON_STOP) {
                object = this.q;
                if (object != null) {
                    object.cancel();
                    return;
                }
            } else if (b8 == d.b.ON_DESTROY) {
                this.cancel();
            }
        }

        @Override
        public void cancel() {
            this.o.c(this);
            this.p.e(this);
            androidx.activity.a a8 = this.q;
            if (a8 != null) {
                a8.cancel();
                this.q = null;
            }
        }
    }

    public class a
    implements androidx.activity.a {
        public final b o;

        public a(b b8) {
            this.o = b8;
        }

        @Override
        public void cancel() {
            OnBackPressedDispatcher.this.b.remove((Object)this.o);
            this.o.e(this);
        }
    }

}

