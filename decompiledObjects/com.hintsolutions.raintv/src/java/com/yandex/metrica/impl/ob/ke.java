/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  com.yandex.metrica.impl.ob.nf$a
 *  com.yandex.metrica.impl.ob.nf$b
 *  com.yandex.metrica.impl.ob.nf$c
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package com.yandex.metrica.impl.ob;

import androidx.annotation.NonNull;
import com.yandex.metrica.impl.ob.Ae;
import com.yandex.metrica.impl.ob.Ce;
import com.yandex.metrica.impl.ob.Hl;
import com.yandex.metrica.impl.ob.Pl;
import com.yandex.metrica.impl.ob.Re;
import com.yandex.metrica.impl.ob.Te;
import com.yandex.metrica.impl.ob.nf;
import com.yandex.metrica.impl.ob.vn;
import com.yandex.metrica.impl.ob.xn;

public abstract class Ke
implements Te,
Ae {
    @NonNull
    private final String a;
    private final int b;
    @NonNull
    private final xn<String> c;
    @NonNull
    private final Ce d;
    @NonNull
    private Pl e;

    public Ke(int n2, @NonNull String string2, @NonNull xn<String> xn2, @NonNull Ce ce) {
        this.b = n2;
        this.a = string2;
        this.c = xn2;
        this.d = ce;
        this.e = Hl.a();
    }

    @NonNull
    public final nf.a a() {
        nf.a a2 = new nf.a();
        a2.b = this.b;
        a2.a = this.a.getBytes();
        a2.d = new nf.c();
        a2.c = new nf.b();
        return a2;
    }

    public void a(@NonNull Pl pl2) {
        this.e = pl2;
    }

    @NonNull
    public Ce b() {
        return this.d;
    }

    @NonNull
    public String c() {
        return this.a;
    }

    public int d() {
        return this.b;
    }

    public boolean e() {
        vn vn2 = this.c.a(this.a);
        if (vn2.b()) {
            return true;
        }
        if (this.e.isEnabled()) {
            Pl pl2 = this.e;
            StringBuilder stringBuilder = z2.t("Attribute ");
            stringBuilder.append(this.a);
            stringBuilder.append(" of type ");
            stringBuilder.append(Re.a(this.b));
            stringBuilder.append(" is skipped because ");
            stringBuilder.append(vn2.a());
            pl2.w(stringBuilder.toString());
        }
        return false;
    }
}

