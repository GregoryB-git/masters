/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.G4;
import com.google.android.gms.internal.measurement.J4;
import com.google.android.gms.internal.measurement.Y3;

public final class Z3
implements J4 {
    public static final Z3 a = new Z3();

    public static Z3 c() {
        return a;
    }

    @Override
    public final G4 a(Class object) {
        if (Y3.class.isAssignableFrom((Class)object)) {
            try {
                G4 g42 = (G4)Y3.l(object.asSubclass(Y3.class)).p(Y3.c.c, null, null);
                return g42;
            }
            catch (Exception exception) {
                object = object.getName();
                StringBuilder stringBuilder = new StringBuilder("Unable to get message info for ");
                stringBuilder.append((String)object);
                throw new RuntimeException(stringBuilder.toString(), (Throwable)exception);
            }
        }
        object = object.getName();
        StringBuilder stringBuilder = new StringBuilder("Unsupported message type: ");
        stringBuilder.append((String)object);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    @Override
    public final boolean b(Class class_) {
        return Y3.class.isAssignableFrom(class_);
    }
}

