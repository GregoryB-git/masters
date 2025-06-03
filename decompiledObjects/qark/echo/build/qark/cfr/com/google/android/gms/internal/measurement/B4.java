/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.UnsupportedOperationException
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.G4;
import com.google.android.gms.internal.measurement.J4;

public final class B4
implements J4 {
    public J4[] a;

    public /* varargs */ B4(J4 ... arrj4) {
        this.a = arrj4;
    }

    @Override
    public final G4 a(Class object) {
        for (J4 j42 : this.a) {
            if (!j42.b((Class)object)) continue;
            return j42.a((Class)object);
        }
        object = object.getName();
        StringBuilder stringBuilder = new StringBuilder("No factory is available for message type: ");
        stringBuilder.append((String)object);
        throw new UnsupportedOperationException(stringBuilder.toString());
    }

    @Override
    public final boolean b(Class class_) {
        J4[] arrj4 = this.a;
        int n8 = arrj4.length;
        for (int i8 = 0; i8 < n8; ++i8) {
            if (!arrj4[i8].b(class_)) continue;
            return true;
        }
        return false;
    }
}

