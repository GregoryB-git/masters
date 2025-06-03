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
package com.google.protobuf;

import com.google.protobuf.I;
import com.google.protobuf.J;
import com.google.protobuf.r;

public class q
implements J {
    public static final q a = new q();

    public static q c() {
        return a;
    }

    @Override
    public I a(Class class_) {
        if (r.class.isAssignableFrom(class_)) {
            try {
                I i8 = (I)r.A(class_.asSubclass(r.class)).m();
                return i8;
            }
            catch (Exception exception) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unable to get message info for ");
                stringBuilder.append(class_.getName());
                throw new RuntimeException(stringBuilder.toString(), (Throwable)exception);
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unsupported message type: ");
        stringBuilder.append(class_.getName());
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    @Override
    public boolean b(Class class_) {
        return r.class.isAssignableFrom(class_);
    }
}

