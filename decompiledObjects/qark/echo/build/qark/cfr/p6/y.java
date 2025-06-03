/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 */
package p6;

import g6.l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g;
import p6.j;
import p6.m;

public final class y {
    public final Object a;
    public final j b;
    public final l c;
    public final Object d;
    public final Throwable e;

    public y(Object object, j j8, l l8, Object object2, Throwable throwable) {
        this.a = object;
        this.b = j8;
        this.c = l8;
        this.d = object2;
        this.e = throwable;
    }

    public /* synthetic */ y(Object object, j j8, l l8, Object object2, Throwable throwable, int n8, g g8) {
        if ((n8 & 2) != 0) {
            j8 = null;
        }
        if ((n8 & 4) != 0) {
            l8 = null;
        }
        if ((n8 & 8) != 0) {
            object2 = null;
        }
        if ((n8 & 16) != 0) {
            throwable = null;
        }
        this(object, j8, l8, object2, throwable);
    }

    public static /* synthetic */ y b(y y8, Object object, j j8, l l8, Object object2, Throwable throwable, int n8, Object object3) {
        if ((n8 & 1) != 0) {
            object = y8.a;
        }
        if ((n8 & 2) != 0) {
            j8 = y8.b;
        }
        if ((n8 & 4) != 0) {
            l8 = y8.c;
        }
        if ((n8 & 8) != 0) {
            object2 = y8.d;
        }
        if ((n8 & 16) != 0) {
            throwable = y8.e;
        }
        return y8.a(object, j8, l8, object2, throwable);
    }

    public final y a(Object object, j j8, l l8, Object object2, Throwable throwable) {
        return new y(object, j8, l8, object2, throwable);
    }

    public final boolean c() {
        if (this.e != null) {
            return true;
        }
        return false;
    }

    public final void d(m m8, Throwable throwable) {
        l l8 = this.b;
        if (l8 != null) {
            m8.l((j)l8, throwable);
        }
        if ((l8 = this.c) != null) {
            m8.m(l8, throwable);
        }
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof y)) {
            return false;
        }
        object = (y)object;
        if (!Intrinsics.a(this.a, object.a)) {
            return false;
        }
        if (!Intrinsics.a(this.b, object.b)) {
            return false;
        }
        if (!Intrinsics.a(this.c, object.c)) {
            return false;
        }
        if (!Intrinsics.a(this.d, object.d)) {
            return false;
        }
        if (!Intrinsics.a((Object)this.e, (Object)object.e)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        Object object = this.a;
        int n8 = 0;
        int n9 = object == null ? 0 : object.hashCode();
        object = this.b;
        int n10 = object == null ? 0 : object.hashCode();
        object = this.c;
        int n11 = object == null ? 0 : object.hashCode();
        object = this.d;
        int n12 = object == null ? 0 : object.hashCode();
        object = this.e;
        if (object != null) {
            n8 = object.hashCode();
        }
        return (((n9 * 31 + n10) * 31 + n11) * 31 + n12) * 31 + n8;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("CompletedContinuation(result=");
        stringBuilder.append(this.a);
        stringBuilder.append(", cancelHandler=");
        stringBuilder.append((Object)this.b);
        stringBuilder.append(", onCancellation=");
        stringBuilder.append((Object)this.c);
        stringBuilder.append(", idempotentResume=");
        stringBuilder.append(this.d);
        stringBuilder.append(", cancelCause=");
        stringBuilder.append((Object)this.e);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

