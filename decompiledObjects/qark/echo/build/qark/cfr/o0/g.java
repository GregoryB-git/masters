/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Collections
 *  java.util.List
 */
package o0;

import java.util.Collections;
import java.util.List;
import o0.a;
import o0.e;

public class g {
    public final String a;
    public final long b;
    public final List c;
    public final List d;
    public final e e;

    public g(String string2, long l8, List list, List list2) {
        this(string2, l8, list, list2, null);
    }

    public g(String string2, long l8, List list, List list2, e e8) {
        this.a = string2;
        this.b = l8;
        this.c = Collections.unmodifiableList((List)list);
        this.d = Collections.unmodifiableList((List)list2);
        this.e = e8;
    }

    public int a(int n8) {
        int n9 = this.c.size();
        for (int i8 = 0; i8 < n9; ++i8) {
            if (((a)this.c.get((int)i8)).b != n8) continue;
            return i8;
        }
        return -1;
    }
}

