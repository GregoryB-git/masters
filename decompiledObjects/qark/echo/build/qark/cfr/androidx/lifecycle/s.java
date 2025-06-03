/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package androidx.lifecycle;

import androidx.lifecycle.r;
import androidx.lifecycle.t;

public class s {
    public final a a;
    public final t b;

    public s(t t8, a a8) {
        this.a = a8;
        this.b = t8;
    }

    public r a(Class class_) {
        String string2 = class_.getCanonicalName();
        if (string2 != null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("androidx.lifecycle.ViewModelProvider.DefaultKey:");
            stringBuilder.append(string2);
            return this.b(stringBuilder.toString(), class_);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public r b(String string2, Class object) {
        r r8 = this.b.b(string2);
        if (object.isInstance((Object)r8)) {
            return r8;
        }
        object = this.a.a((Class)object);
        this.b.d(string2, (r)object);
        return object;
    }

    public static interface a {
        public r a(Class var1);
    }

}

