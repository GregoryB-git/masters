/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Collections
 *  java.util.List
 */
package T3;

import java.util.Collections;
import java.util.List;

public class a {
    public final List a;
    public final List b;

    public a(List list, List list2) {
        if (list.size() == list2.size() - 1) {
            this.a = list;
            this.b = list2;
            return;
        }
        throw new IllegalArgumentException("Number of posts need to be n-1 for n hashes in CompoundHash");
    }

    public List a() {
        return Collections.unmodifiableList((List)this.b);
    }

    public List b() {
        return Collections.unmodifiableList((List)this.a);
    }
}

