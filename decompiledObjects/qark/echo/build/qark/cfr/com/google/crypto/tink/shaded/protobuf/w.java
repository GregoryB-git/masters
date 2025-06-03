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
package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.M;
import com.google.crypto.tink.shaded.protobuf.N;
import com.google.crypto.tink.shaded.protobuf.x;

public class w
implements N {
    public static final w a = new w();

    public static w c() {
        return a;
    }

    @Override
    public M a(Class class_) {
        if (x.class.isAssignableFrom(class_)) {
            try {
                M m8 = (M)x.v(class_.asSubclass(x.class)).k();
                return m8;
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
        return x.class.isAssignableFrom(class_);
    }
}

