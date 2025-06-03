/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.Iterator
 *  java.util.concurrent.CopyOnWriteArrayList
 */
package androidx.activity;

import androidx.activity.a;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public abstract class b {
    public boolean a;
    public CopyOnWriteArrayList b = new CopyOnWriteArrayList();

    public b(boolean bl) {
        this.a = bl;
    }

    public void a(a a8) {
        this.b.add((Object)a8);
    }

    public abstract void b();

    public final boolean c() {
        return this.a;
    }

    public final void d() {
        Iterator iterator = this.b.iterator();
        while (iterator.hasNext()) {
            ((a)iterator.next()).cancel();
        }
    }

    public void e(a a8) {
        this.b.remove((Object)a8);
    }

    public final void f(boolean bl) {
        this.a = bl;
    }
}

