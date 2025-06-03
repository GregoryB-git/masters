/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.Override
 */
package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.gn;
import com.yandex.metrica.impl.ob.hj;
import com.yandex.metrica.impl.ob.hn;

public class bn
extends gn<hj> {
    public bn(hj hj2) {
        super(hj2);
    }

    @Override
    public boolean a(gn<hj> object) {
        object = (hj)((gn)object).a;
        Object t3 = this.a;
        boolean bl2 = true;
        if (t3 == object) {
            return true;
        }
        if (((hj)t3).c() != ((hj)object).c()) {
            return false;
        }
        if (((hj)this.a).k() != null ? !((hj)this.a).k().equals((Object)((hj)object).k()) : ((hj)object).k() != null) {
            return false;
        }
        if (((hj)this.a).l() != null ? !((hj)this.a).l().equals((Object)((hj)object).l()) : ((hj)object).l() != null) {
            return false;
        }
        if (((hj)this.a).e() != null ? !((hj)this.a).e().equals((Object)((hj)object).e()) : ((hj)object).e() != null) {
            return false;
        }
        if (((hj)this.a).b() != null ? !((hj)this.a).b().equals((Object)((hj)object).b()) : ((hj)object).b() != null) {
            return false;
        }
        if (((hj)this.a).m() != null ? !((hj)this.a).m().equals((Object)((hj)object).m()) : ((hj)object).m() != null) {
            return false;
        }
        if (((hj)this.a).o() != null) {
            bl2 = ((hj)this.a).o().equals((Object)((hj)object).o());
        } else if (((hj)object).o() != null) {
            bl2 = false;
        }
        return bl2;
    }

    public int hashCode() {
        Integer n2 = ((hj)this.a).k();
        int n3 = 0;
        int n5 = n2 != null ? ((hj)this.a).k().hashCode() : 0;
        int n6 = ((hj)this.a).l() != null ? ((hj)this.a).l().hashCode() : 0;
        int n9 = ((hj)this.a).e() != null ? ((hj)this.a).e().hashCode() : 0;
        int n10 = ((hj)this.a).b() != null ? ((hj)this.a).b().hashCode() : 0;
        int n11 = ((hj)this.a).m() != null ? ((hj)this.a).m().hashCode() : 0;
        int n12 = ((hj)this.a).c();
        if (((hj)this.a).o() != null) {
            n3 = ((hj)this.a).o().hashCode();
        }
        return (n12 + ((((n5 * 31 + n6) * 31 + n9) * 31 + n10) * 31 + n11) * 31) * 31 + n3;
    }

    public static class a
    implements hn<hj> {
        @Override
        public gn a(Object object) {
            return new bn((hj)object);
        }
    }
}

