/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package kotlin.jvm.internal;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.d;

public final class m
implements d {
    public final Class o;
    public final String p;

    public m(Class class_, String string2) {
        Intrinsics.checkNotNullParameter((Object)class_, "jClass");
        Intrinsics.checkNotNullParameter(string2, "moduleName");
        this.o = class_;
        this.p = string2;
    }

    @Override
    public Class b() {
        return this.o;
    }

    public boolean equals(Object object) {
        if (object instanceof m && Intrinsics.a((Object)this.b(), (Object)((m)object).b())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.b().hashCode();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.b().toString());
        stringBuilder.append(" (Kotlin reflection is not available)");
        return stringBuilder.toString();
    }
}

