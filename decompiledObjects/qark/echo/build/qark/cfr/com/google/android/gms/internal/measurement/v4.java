/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.reflect.Method
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.B4;
import com.google.android.gms.internal.measurement.G4;
import com.google.android.gms.internal.measurement.H4;
import com.google.android.gms.internal.measurement.I4;
import com.google.android.gms.internal.measurement.J4;
import com.google.android.gms.internal.measurement.M4;
import com.google.android.gms.internal.measurement.O4;
import com.google.android.gms.internal.measurement.P3;
import com.google.android.gms.internal.measurement.P4;
import com.google.android.gms.internal.measurement.Q4;
import com.google.android.gms.internal.measurement.V4;
import com.google.android.gms.internal.measurement.Y3;
import com.google.android.gms.internal.measurement.Z3;
import com.google.android.gms.internal.measurement.Z4;
import com.google.android.gms.internal.measurement.a4;
import com.google.android.gms.internal.measurement.a5;
import com.google.android.gms.internal.measurement.b5;
import com.google.android.gms.internal.measurement.q4;
import com.google.android.gms.internal.measurement.x4;
import com.google.android.gms.internal.measurement.x5;
import com.google.android.gms.internal.measurement.z4;
import java.lang.reflect.Method;

public final class v4
implements b5 {
    public static final J4 b = new z4();
    public final J4 a;

    public v4() {
        this(new B4(Z3.c(), v4.b()));
    }

    public v4(J4 j42) {
        this.a = (J4)a4.f(j42, "messageInfoFactory");
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static J4 b() {
        try {
            return (J4)Class.forName((String)"com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke((Object)null, new Object[0]);
        }
        catch (Exception exception) {
            return b;
        }
    }

    public static boolean c(G4 g42) {
        if (x4.a[g42.b().ordinal()] != 1) {
            return true;
        }
        return false;
    }

    @Override
    public final Z4 a(Class class_) {
        a5.o(class_);
        G4 g42 = this.a.a(class_);
        if (g42.c()) {
            if (Y3.class.isAssignableFrom(class_)) {
                return O4.j(a5.u(), P3.b(), g42.a());
            }
            return O4.j(a5.f(), P3.a(), g42.a());
        }
        if (Y3.class.isAssignableFrom(class_)) {
            boolean bl = v4.c(g42);
            P4 p42 = Q4.b();
            q4 q42 = q4.c();
            x5 x52 = a5.u();
            if (bl) {
                return M4.n(class_, g42, p42, q42, x52, P3.b(), H4.b());
            }
            return M4.n(class_, g42, p42, q42, x52, null, H4.b());
        }
        boolean bl = v4.c(g42);
        P4 p43 = Q4.a();
        q4 q43 = q4.a();
        x5 x53 = a5.f();
        if (bl) {
            return M4.n(class_, g42, p43, q43, x53, P3.a(), H4.a());
        }
        return M4.n(class_, g42, p43, q43, x53, null, H4.a());
    }
}

