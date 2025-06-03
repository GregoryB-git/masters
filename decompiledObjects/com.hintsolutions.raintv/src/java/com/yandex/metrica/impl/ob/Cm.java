/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.util.Pair
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.LinkedHashMap
 *  java.util.Map$Entry
 */
package com.yandex.metrica.impl.ob;

import android.annotation.SuppressLint;
import android.util.Pair;
import com.yandex.metrica.impl.ob.b;
import com.yandex.metrica.impl.ob.jk;
import java.util.LinkedHashMap;
import java.util.Map;

@SuppressLint(value={"all"})
public class cm<K, V> {
    private final LinkedHashMap<K, V> a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;

    public cm(int n4) {
        if (n4 > 0) {
            this.c = n4;
            this.a = new LinkedHashMap(0, 0.75f, true);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    private void a(int n4) {
        Object object;
        Object object2;
        while (this.b > n4 && !this.a.isEmpty() && (object2 = (Map.Entry)this.a.entrySet().iterator().next()) != null) {
            object = object2.getKey();
            object2 = object2.getValue();
            this.a.remove(object);
            this.b -= this.b(object, object2);
            ++this.e;
        }
        if (!(this.b < 0 || this.a.isEmpty() && this.b != 0)) {
            return;
        }
        object = new StringBuilder();
        object.append(this.getClass().getName());
        object.append(".sizeOf() is reporting inconsistent results!");
        throw new IllegalStateException(object.toString());
    }

    private int b(K k5, V v2) {
        jk jk2 = (jk)k5;
        Pair pair = (Pair)v2;
        int n4 = com.yandex.metrica.impl.ob.b.b(jk2.b).length + 4 + 4 + 4;
        if (n4 >= 0) {
            return n4;
        }
        pair = new StringBuilder();
        pair.append("Negative size: ");
        pair.append(k5);
        pair.append("=");
        pair.append(v2);
        throw new IllegalStateException(pair.toString());
    }

    public final V a(K object) {
        cm cm2 = this;
        synchronized (cm2) {
            block5: {
                object = this.a.get(object);
                if (object == null) break block5;
                ++this.f;
                return (V)object;
            }
            ++this.g;
            return null;
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final V a(K k5, V object) {
        cm cm2 = this;
        synchronized (cm2) {
            void var2_2;
            ++this.d;
            this.b += this.b(k5, var2_2);
            object = this.a.put(k5, (Object)var2_2);
            if (object != null) {
                this.b -= this.b(k5, object);
            }
            this.a(this.c);
            return object;
        }
    }

    public final void a() {
        cm cm2 = this;
        synchronized (cm2) {
            this.a(-1);
            return;
        }
    }

    public final String toString() {
        cm cm2 = this;
        synchronized (cm2) {
            int n4;
            block6: {
                block5: {
                    n4 = this.f;
                    int n5 = this.g + n4;
                    if (n5 == 0) break block5;
                    n4 = n4 * 100 / n5;
                    break block6;
                }
                n4 = 0;
            }
            String string = String.format((String)"LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", (Object[])new Object[]{this.c, this.f, this.g, n4});
            return string;
        }
    }
}

