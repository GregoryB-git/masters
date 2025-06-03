/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.util.Collection
 *  java.util.LinkedList
 */
package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.hj;
import com.yandex.metrica.impl.ob.i0;
import com.yandex.metrica.impl.ob.ij;
import java.util.Collection;
import java.util.LinkedList;

class h0
implements ij {
    public final LinkedList a;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public h0(i0 i02, LinkedList linkedList) {
        this.a = linkedList;
    }

    @Override
    public void a(Collection<hj> collection) {
        this.a.add(collection);
    }
}

