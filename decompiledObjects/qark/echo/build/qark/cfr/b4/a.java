/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.HashMap
 *  java.util.List
 *  java.util.Map
 */
package b4;

import Y3.m;
import a4.c;
import a4.e;
import d4.b;
import d4.i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class a {
    public final Map a = new HashMap();

    public List a() {
        return new ArrayList(this.a.values());
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public void b(c var1_1) {
        var3_2 = var1_1.j();
        var4_3 = var1_1.i();
        var6_4 = e.a.p;
        var2_5 = var3_2 == var6_4 || var3_2 == e.a.r || var3_2 == e.a.o;
        m.g(var2_5, "Only child changes supported for tracking");
        m.f(true ^ var1_1.i().s());
        if (!this.a.containsKey((Object)var4_3)) ** GOTO lbl38
        var5_6 = (c)this.a.get((Object)var4_3);
        var7_8 = var5_6.j();
        if (var3_2 == var6_4 && var7_8 == e.a.o) {
            this.a.put((Object)var1_1.i(), (Object)c.d(var4_3, var1_1.k(), var5_6.k()));
            return;
        }
        var8_9 = e.a.o;
        if (var3_2 == var8_9 && var7_8 == var6_4) {
            this.a.remove((Object)var4_3);
            return;
        }
        if (var3_2 == var8_9 && var7_8 == e.a.r) {
            this.a.put((Object)var4_3, (Object)c.g(var4_3, var5_6.l()));
            return;
        }
        var8_9 = e.a.r;
        if (var3_2 == var8_9 && var7_8 == var6_4) {
            var5_6 = this.a;
            var3_2 = c.b(var4_3, var1_1.k());
            var1_1 = var5_6;
        } else if (var3_2 == var8_9 && var7_8 == var8_9) {
            var3_2 = this.a;
            var5_6 = c.d(var4_3, var1_1.k(), var5_6.l());
            var1_1 = var3_2;
            var3_2 = var5_6;
        } else {
            var3_2 = new StringBuilder();
            var3_2.append("Illegal combination of changes: ");
            var3_2.append(var1_1);
            var3_2.append(" occurred after ");
            var3_2.append((Object)var5_6);
            throw new IllegalStateException(var3_2.toString());
lbl38: // 1 sources:
            var5_7 = this.a;
            var4_3 = var1_1.i();
            var3_2 = var1_1;
            var1_1 = var5_7;
        }
        var1_1.put((Object)var4_3, var3_2);
    }
}

