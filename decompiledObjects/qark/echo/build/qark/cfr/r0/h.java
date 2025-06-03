/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Collections
 *  java.util.List
 */
package r0;

import java.util.Collections;
import java.util.List;
import v0.a;

public abstract class h
implements a {
    public final String a;
    public final List b;
    public final boolean c;

    public h(String string2, List list, boolean bl) {
        this.a = string2;
        this.b = Collections.unmodifiableList((List)list);
        this.c = bl;
    }
}

