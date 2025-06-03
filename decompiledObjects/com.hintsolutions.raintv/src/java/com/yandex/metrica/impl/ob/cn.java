/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.Comparator
 */
package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.hj;
import java.util.Comparator;

public class cn
implements Comparator<hj> {
    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public int compare(Object object, Object object2) {
        object = (hj)object;
        object2 = (hj)object2;
        int n4 = 0;
        if (object == object2) {
            return n4;
        }
        int n5 = 1;
        int n7 = object == null ? 1 : 0;
        if (object2 != null) {
            n5 = 0;
        }
        if ((n5 ^ n7) != 0 || ((hj)object).q() != ((hj)object2).q() || ((hj)object).c() != ((hj)object2).c() || (((hj)object).k() == null ? ((hj)object2).k() != null : !((hj)object).k().equals((Object)((hj)object2).k())) || (((hj)object).l() == null ? ((hj)object2).l() != null : !((hj)object).l().equals((Object)((hj)object2).l())) || (((hj)object).e() == null ? ((hj)object2).e() != null : !((hj)object).e().equals((Object)((hj)object2).e())) || (((hj)object).b() == null ? ((hj)object2).b() != null : !((hj)object).b().equals((Object)((hj)object2).b())) || (((hj)object).n() == null ? ((hj)object2).n() != null : !((hj)object).n().equals((Object)((hj)object2).n())) || (((hj)object).m() == null ? ((hj)object2).m() != null : !((hj)object).m().equals((Object)((hj)object2).m()))) return 10;
        if (((hj)object).o() != null) {
            if (!((hj)object).o().equals((Object)((hj)object2).o())) return 10;
            return n4;
        }
        if (((hj)object2).o() != null) return 10;
        return n4;
    }
}

