/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package p6;

import g6.l;
import kotlin.jvm.internal.Intrinsics;

public final class A {
    public final Object a;
    public final l b;

    public A(Object object, l l8) {
        this.a = object;
        this.b = l8;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof A)) {
            return false;
        }
        object = (A)object;
        if (!Intrinsics.a(this.a, object.a)) {
            return false;
        }
        if (!Intrinsics.a(this.b, object.b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        Object object = this.a;
        int n8 = object == null ? 0 : object.hashCode();
        return n8 * 31 + this.b.hashCode();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("CompletedWithCancellation(result=");
        stringBuilder.append(this.a);
        stringBuilder.append(", onCancellation=");
        stringBuilder.append((Object)this.b);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

