/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.HashSet
 *  java.util.Iterator
 *  java.util.List
 */
package d4;

import V3.k;
import d4.b;
import d4.g;
import d4.m;
import d4.n;
import d4.o;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class s {
    public final k a;
    public final k b;
    public final n c;

    public s(T3.o o8) {
        Object object = o8.a();
        Object var3_3 = null;
        object = object != null ? new k((List)object) : null;
        this.a = object;
        List list = o8.b();
        object = var3_3;
        if (list != null) {
            object = new k(list);
        }
        this.b = object;
        this.c = o.a(o8.c());
    }

    public n a(n n8) {
        return this.b(k.Y(), n8, this.c);
    }

    public final n b(k k8, n n8, n n9) {
        Object object = this.a;
        boolean bl = true;
        int n10 = object == null ? 1 : k8.V((k)object);
        object = this.b;
        int n11 = object == null ? -1 : k8.V((k)object);
        object = this.a;
        boolean bl2 = object != null && k8.W((k)object);
        object = this.b;
        boolean bl3 = object != null && k8.W((k)object);
        if (n10 > 0 && n11 < 0 && !bl3) {
            return n9;
        }
        if (n10 > 0 && bl3 && n9.B()) {
            return n9;
        }
        if (n10 > 0 && n11 == 0) {
            Y3.m.f(bl3);
            Y3.m.f(n9.B() ^ true);
            if (n8.B()) {
                return g.W();
            }
            return n8;
        }
        if (!bl2 && !bl3) {
            bl3 = bl;
            if (n11 <= 0) {
                bl3 = n10 <= 0 ? bl : false;
            }
            Y3.m.f(bl3);
            return n8;
        }
        object = new HashSet();
        Iterator iterator = n8.iterator();
        while (iterator.hasNext()) {
            object.add((Object)((m)iterator.next()).c());
        }
        iterator = n9.iterator();
        while (iterator.hasNext()) {
            object.add((Object)((m)iterator.next()).c());
        }
        iterator = new ArrayList(object.size() + 1);
        iterator.addAll((Collection)object);
        if (!n9.t().isEmpty() || !n8.t().isEmpty()) {
            iterator.add((Object)b.o());
        }
        iterator = iterator.iterator();
        object = n8;
        while (iterator.hasNext()) {
            b b8 = (b)iterator.next();
            n n12 = n8.v(b8);
            n n13 = this.b(k8.U(b8), n8.v(b8), n9.v(b8));
            if (n13 == n12) continue;
            object = object.N(b8, n13);
        }
        return object;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("RangeMerge{optExclusiveStart=");
        stringBuilder.append((Object)this.a);
        stringBuilder.append(", optInclusiveEnd=");
        stringBuilder.append((Object)this.b);
        stringBuilder.append(", snap=");
        stringBuilder.append((Object)this.c);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

