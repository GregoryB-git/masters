/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
 *  java.util.Map
 */
package Q2;

import R2.u3;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.J0;
import java.util.List;
import java.util.Map;

public class a {
    public final J0 a;

    public a(J0 j02) {
        this.a = j02;
    }

    public void a(String string2, String string3, Bundle bundle) {
        this.a.u(string2, string3, bundle);
    }

    public List b(String string2, String string3) {
        return this.a.g(string2, string3);
    }

    public int c(String string2) {
        return this.a.a(string2);
    }

    public Map d(String string2, String string3, boolean bl) {
        return this.a.h(string2, string3, bl);
    }

    public void e(String string2, String string3, Bundle bundle) {
        this.a.D(string2, string3, bundle);
    }

    public void f(a a8) {
        this.a.k(a8);
    }

    public void g(Bundle bundle) {
        this.a.m(bundle);
    }

    public void h(String string2, String string3, Object object) {
        this.a.w(string2, string3, object, true);
    }

    public final void i(boolean bl) {
        this.a.x(bl);
    }

    public static interface a
    extends u3 {
    }

}

