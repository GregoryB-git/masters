/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.Set
 *  java.util.concurrent.atomic.AtomicBoolean
 */
package x1;

import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import x1.F;
import x1.K;
import x1.g;

public final class d
implements F.b {
    public final /* synthetic */ AtomicBoolean a;
    public final /* synthetic */ Set b;
    public final /* synthetic */ Set c;
    public final /* synthetic */ Set d;

    public /* synthetic */ d(AtomicBoolean atomicBoolean, Set set, Set set2, Set set3) {
        this.a = atomicBoolean;
        this.b = set;
        this.c = set2;
        this.d = set3;
    }

    @Override
    public final void a(K k8) {
        g.d(this.a, this.b, this.c, this.d, k8);
    }
}

