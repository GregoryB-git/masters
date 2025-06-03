/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.util.LinkedList
 *  java.util.List
 */
package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.H4;
import com.yandex.metrica.impl.ob.J5;
import com.yandex.metrica.impl.ob.K4;
import com.yandex.metrica.impl.ob.L3;
import com.yandex.metrica.impl.ob.X4;
import com.yandex.metrica.impl.ob.a1;
import com.yandex.metrica.impl.ob.d5;
import com.yandex.metrica.impl.ob.h5;
import java.util.LinkedList;
import java.util.List;

public class J4
extends K4<X4> {
    private final h5 a;
    private final J5 b;
    private final d5 c;

    public J4(L3 l32) {
        this.a = new h5(l32);
        this.b = new J5(l32);
        this.c = new d5(l32);
    }

    @Override
    public H4 a(int n2) {
        LinkedList linkedList = new LinkedList();
        if ((n2 = a1.a(n2).ordinal()) != 1) {
            if (n2 != 3) {
                if (n2 == 40) {
                    linkedList.add((Object)this.b);
                    linkedList.add((Object)this.a);
                }
            } else {
                linkedList.add((Object)this.c);
            }
        } else {
            linkedList.add((Object)this.a);
        }
        return new H4((List<Object>)linkedList);
    }
}

