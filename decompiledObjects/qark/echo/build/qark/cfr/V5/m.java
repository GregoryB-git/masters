/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.io.Serializable
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package V5;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

public final class m
implements Serializable {
    public final Object o;
    public final Object p;

    public m(Object object, Object object2) {
        this.o = object;
        this.p = object2;
    }

    public final Object a() {
        return this.o;
    }

    public final Object b() {
        return this.p;
    }

    public final Object c() {
        return this.o;
    }

    public final Object d() {
        return this.p;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof m)) {
            return false;
        }
        object = (m)object;
        if (!Intrinsics.a(this.o, object.o)) {
            return false;
        }
        if (!Intrinsics.a(this.p, object.p)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        Object object = this.o;
        int n8 = 0;
        int n9 = object == null ? 0 : object.hashCode();
        object = this.p;
        if (object != null) {
            n8 = object.hashCode();
        }
        return n9 * 31 + n8;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('(');
        stringBuilder.append(this.o);
        stringBuilder.append(", ");
        stringBuilder.append(this.p);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

