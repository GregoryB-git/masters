/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.List
 */
package A0;

import A0.c;
import d0.J;
import java.util.List;
import y0.n;

public final class z
extends c {
    public final int h;
    public final Object i;

    public z(J j8, int n8, int n9) {
        this(j8, n8, n9, 0, null);
    }

    public z(J j8, int n8, int n9, int n10, Object object) {
        super(j8, new int[]{n8}, n9);
        this.h = n10;
        this.i = object;
    }

    @Override
    public int n() {
        return this.h;
    }

    @Override
    public int o() {
        return 0;
    }

    @Override
    public Object s() {
        return this.i;
    }

    @Override
    public void v(long l8, long l9, long l10, List list, n[] arrn) {
    }
}

