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
package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.M;
import androidx.datastore.preferences.protobuf.N;
import androidx.datastore.preferences.protobuf.w;

public class v
implements N {
    public static final v a = new v();

    public static v c() {
        return a;
    }

    @Override
    public M a(Class class_) {
        if (w.class.isAssignableFrom(class_)) {
            try {
                M m8 = (M)w.u(class_.asSubclass(w.class)).n();
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
        return w.class.isAssignableFrom(class_);
    }
}

