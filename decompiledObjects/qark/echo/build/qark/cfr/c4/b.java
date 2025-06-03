/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.NoSuchFieldError
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.util.Collection
 *  java.util.HashSet
 *  java.util.List
 *  java.util.Set
 */
package c4;

import c4.d;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public abstract class b
implements d {
    public final Set a;
    public final d.a b;

    public b(d.a a8, List list) {
        this.a = list != null ? new HashSet((Collection)list) : null;
        this.b = a8;
    }

    @Override
    public void a(d.a a8, String string2, String string3, long l8) {
        if (this.g(a8, string2)) {
            string3 = this.c(a8, string2, string3, l8);
            int n8 = .a[a8.ordinal()];
            if (n8 != 1) {
                if (n8 != 2) {
                    if (n8 != 3) {
                        if (n8 == 4) {
                            this.d(string2, string3);
                            return;
                        }
                        throw new RuntimeException("Should not reach here!");
                    }
                    this.f(string2, string3);
                    return;
                }
                this.h(string2, string3);
                return;
            }
            this.e(string2, string3);
        }
    }

    @Override
    public d.a b() {
        return this.b;
    }

    public abstract String c(d.a var1, String var2, String var3, long var4);

    public abstract void d(String var1, String var2);

    public abstract void e(String var1, String var2);

    public abstract void f(String var1, String var2);

    public boolean g(d.a a8, String string2) {
        if (a8.ordinal() >= this.b.ordinal() && (this.a == null || a8.ordinal() > d.a.o.ordinal() || this.a.contains((Object)string2))) {
            return true;
        }
        return false;
    }

    public abstract void h(String var1, String var2);

}

