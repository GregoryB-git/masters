/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  java.lang.Boolean
 *  java.lang.Object
 *  java.lang.String
 *  java.util.HashSet
 */
package com.yandex.metrica.impl.ob;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.impl.ob.A2;
import java.util.HashSet;

public class s2 {
    private final a a;
    @Nullable
    private Boolean b;
    private final HashSet<String> c = new HashSet();
    private final HashSet<String> d = new HashSet();

    public s2(@NonNull a a2) {
        this.a = a2;
        this.b = (a2).a();
    }

    private boolean b() {
        Boolean bl = this.b;
        boolean bl2 = bl == null ? !this.c.isEmpty() || this.d.isEmpty() : bl;
        return bl2;
    }

    public void a(@Nullable Boolean bl) {
        s2 s22 = this;
        synchronized (s22) {
            if (A2.a(bl) || this.b == null) {
                this.b = bl = Boolean.valueOf((boolean)Boolean.FALSE.equals((Object)bl));
                a a2 = this.a;
                boolean bl2 = bl;
                (a2).a(bl2);
            }
            return;
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void a(@NonNull String string, @Nullable Boolean bl) {
        s2 s22 = this;
        synchronized (s22) {
            void var2_2;
            if (A2.a(var2_2) || !this.d.contains((Object)string) && !this.c.contains((Object)string)) {
                Boolean bl2 = Boolean.TRUE;
                Boolean bl3 = var2_2;
                if (var2_2 == null) {
                    bl3 = bl2;
                }
                if (bl3.booleanValue()) {
                    this.d.add((Object)string);
                    this.c.remove((Object)string);
                } else {
                    this.c.add((Object)string);
                    this.d.remove((Object)string);
                }
            }
            return;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean a() {
        s2 s22 = this;
        synchronized (s22) {
            Boolean bl = this.b;
            if (bl != null) return bl;
            return this.d.isEmpty();
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean c() {
        s2 s22 = this;
        synchronized (s22) {
            Boolean bl;
            block5: {
                bl = this.b;
                if (bl != null) break block5;
                if (!this.d.isEmpty()) return false;
                if (!this.c.isEmpty()) return false;
                return true;
            }
            return bl;
        }
    }

    public boolean d() {
        s2 s22 = this;
        synchronized (s22) {
            boolean bl = this.b();
            return bl;
        }
    }

    public boolean e() {
        s2 s22 = this;
        synchronized (s22) {
            boolean bl = this.b();
            return bl;
        }
    }

    public static interface a {
    }
}

