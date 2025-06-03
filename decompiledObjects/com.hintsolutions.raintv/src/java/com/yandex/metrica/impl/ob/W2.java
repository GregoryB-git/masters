/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  java.lang.Object
 *  java.lang.Override
 */
package com.yandex.metrica.impl.ob;

import androidx.annotation.NonNull;
import com.yandex.metrica.impl.ob.P3;
import com.yandex.metrica.impl.ob.l2;
import com.yandex.metrica.impl.ob.li;

public class w2<C extends P3>
implements l2 {
    @NonNull
    private C a;
    public final Object b = new Object();
    public boolean c = false;
    @NonNull
    private final li d;

    public w2(@NonNull C c9, @NonNull li li2) {
        this.a = c9;
        this.d = li2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void a() {
        Object object;
        Object object2 = object = this.b;
        synchronized (object2) {
            if (this.c) {
                this.c = false;
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void b() {
        Object object;
        Object object2 = object = this.b;
        synchronized (object2) {
            if (!this.c) {
                this.c();
                this.c = true;
            }
            return;
        }
    }

    public void c() {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void d() {
        Object object;
        Object object2 = object = this.b;
        synchronized (object2) {
            if (!this.c) {
                Object object3;
                Object object4 = object3 = this.b;
                synchronized (object4) {
                    if (!this.c) {
                        this.f();
                    }
                }
                this.c();
            }
            return;
        }
    }

    @NonNull
    public C e() {
        return this.a;
    }

    public void f() {
        this.d.a();
    }
}

