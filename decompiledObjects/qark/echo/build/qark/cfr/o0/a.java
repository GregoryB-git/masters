/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.Collections
 *  java.util.List
 */
package o0;

import java.util.Collections;
import java.util.List;

public class a {
    public final long a;
    public final int b;
    public final List c;
    public final List d;
    public final List e;
    public final List f;

    public a(long l8, int n8, List list, List list2, List list3, List list4) {
        this.a = l8;
        this.b = n8;
        this.c = Collections.unmodifiableList((List)list);
        this.d = Collections.unmodifiableList((List)list2);
        this.e = Collections.unmodifiableList((List)list3);
        this.f = Collections.unmodifiableList((List)list4);
    }
}

