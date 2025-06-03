/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.Override
 *  java.util.HashSet
 *  java.util.Set
 *  java.util.concurrent.CopyOnWriteArraySet
 */
package com.yandex.metrica.impl.ob;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.impl.ob.l2;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

public class w
implements l2 {
    private final Set<Integer> a = new HashSet();
    private final Set<Integer> b = new HashSet();
    @NonNull
    private volatile a c = com.yandex.metrica.impl.ob.w$a.a;
    private final Set<b> d = new CopyOnWriteArraySet();

    private void d() {
        a a2 = com.yandex.metrica.impl.ob.w$a.a;
        if (!this.a.isEmpty()) {
            a2 = com.yandex.metrica.impl.ob.w$a.c;
        } else if (!this.b.isEmpty()) {
            a2 = com.yandex.metrica.impl.ob.w$a.b;
        }
        if (this.c != a2) {
            this.c = a2;
            a2 = this.d.iterator();
            while (a2.hasNext()) {
                (a2.next()).a(this.c);
            }
        }
    }

    @NonNull
    public a a(@Nullable b b4) {
        this.d.add((Object)b4);
        return this.c;
    }

    @Override
    public void a() {
        this.d();
    }

    public void a(int n2) {
        this.a.remove((Object)n2);
        this.d();
    }

    @Override
    public void b() {
        if (this.c == com.yandex.metrica.impl.ob.w$a.c) {
            this.c = com.yandex.metrica.impl.ob.w$a.b;
        }
    }

    public void b(int n2) {
        this.b.add((Object)n2);
        this.a.remove((Object)n2);
        this.d();
    }

    @NonNull
    public a c() {
        return this.c;
    }

    public void c(int n2) {
        this.a.add((Object)n2);
        this.b.remove((Object)n2);
        this.d();
    }
}

