/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.util.Random
 */
package j6;

import j6.c;
import j6.d;
import java.util.Random;

public abstract class a
extends c {
    @Override
    public int b(int n8) {
        return d.a(this.d().nextInt(), n8);
    }

    @Override
    public int c() {
        return this.d().nextInt();
    }

    public abstract Random d();
}

