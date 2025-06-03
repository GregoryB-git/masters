/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.HashMap
 *  java.util.HashSet
 *  java.util.List
 */
package V3;

import V3.h;
import V3.i;
import V3.k;
import Y3.m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class H
implements i {
    public static H b = new H();
    public final HashMap a = new HashMap();

    public static H b() {
        return b;
    }

    @Override
    public void a(h h8) {
        this.d(h8);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void c(h h8) {
        HashMap hashMap = this.a;
        synchronized (hashMap) {
            try {
                List list;
                List list2 = list = (List)this.a.get((Object)h8);
                if (list == null) {
                    list2 = new ArrayList();
                    this.a.put((Object)h8, (Object)list2);
                }
                list2.add((Object)h8);
                if (!h8.e().f()) {
                    h h9 = h8.a(a4.i.a(h8.e().e()));
                    list2 = list = (List)this.a.get((Object)h9);
                    if (list == null) {
                        list2 = new ArrayList();
                        this.a.put((Object)h9, (Object)list2);
                    }
                    list2.add((Object)h8);
                }
                h8.j(true);
                h8.k(this);
                return;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void d(h h8) {
        HashMap hashMap = this.a;
        synchronized (hashMap) {
            block16 : {
                List list;
                Object object;
                int n8;
                int n9;
                boolean bl;
                block15 : {
                    boolean bl2;
                    block12 : {
                        block14 : {
                            block13 : {
                                try {
                                    object = (List)this.a.get((Object)h8);
                                    bl2 = true;
                                    n8 = 0;
                                    if (object == null) break block12;
                                    break block13;
                                }
                                catch (Throwable throwable) {}
                                throw throwable;
                            }
                            for (n9 = 0; n9 < object.size(); ++n9) {
                                if (object.get(n9) != h8) continue;
                                object.remove(n9);
                                n9 = 1;
                                break block14;
                            }
                            n9 = 0;
                        }
                        if (object.isEmpty()) {
                            this.a.remove((Object)h8);
                        }
                        bl = bl2;
                        if (n9 != 0) break block15;
                    }
                    bl = !h8.g() ? bl2 : false;
                }
                m.f(bl);
                if (h8.e().f() || (list = (List)this.a.get(object = h8.a(a4.i.a(h8.e().e())))) == null) break block16;
                n9 = n8;
                do {
                    block18 : {
                        block17 : {
                            if (n9 >= list.size()) break block17;
                            if (list.get(n9) != h8) break block18;
                            list.remove(n9);
                        }
                        if (!list.isEmpty()) break;
                        this.a.remove(object);
                        break;
                    }
                    ++n9;
                } while (true);
            }
            return;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public void e(h var1_1) {
        block8 : {
            var3_3 = this.a;
            // MONITORENTER : var3_3
            var4_4 = (List)this.a.get((Object)var1_1);
            if (var4_4 != null && !var4_4.isEmpty()) {
                if (var1_1.e().f()) {
                    var1_1 = new HashSet();
                    var2_5 = var4_4.size() - 1;
                    break block8;
                }
                ((h)var4_4.get(0)).l();
            }
            do {
                // MONITOREXIT : var3_3
                return;
                break;
            } while (true);
        }
        do {
            if (var2_5 < 0) ** continue;
            var5_6 = (h)var4_4.get(var2_5);
            if (!var1_1.contains((Object)var5_6.e())) {
                var1_1.add((Object)var5_6.e());
                var5_6.l();
            }
            --var2_5;
        } while (true);
    }
}

