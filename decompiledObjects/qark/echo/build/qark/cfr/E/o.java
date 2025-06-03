/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.LocaleList
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Locale
 */
package E;

import E.i;
import E.j;
import E.k;
import E.l;
import E.m;
import E.n;
import android.os.LocaleList;
import java.util.Locale;

public final class o
implements i {
    public final LocaleList a;

    public o(Object object) {
        this.a = n.a(object);
    }

    @Override
    public Object a() {
        return this.a;
    }

    public boolean equals(Object object) {
        return j.a(this.a, ((i)object).a());
    }

    @Override
    public Locale get(int n8) {
        return l.a(this.a, n8);
    }

    public int hashCode() {
        return m.a(this.a);
    }

    public String toString() {
        return k.a(this.a);
    }
}

