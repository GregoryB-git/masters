/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.StackTraceElement
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.concurrent.CancellationException
 */
package p6;

import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.Intrinsics;
import p6.q0;

public final class r0
extends CancellationException {
    public final transient q0 o;

    public r0(String string2, Throwable throwable, q0 q02) {
        super(string2);
        this.o = q02;
        if (throwable != null) {
            this.initCause(throwable);
        }
    }

    public boolean equals(Object object) {
        if (!(object == this || object instanceof r0 && Intrinsics.a((object = (r0)((Object)object)).getMessage(), this.getMessage()) && Intrinsics.a(object.o, this.o) && Intrinsics.a((Object)object.getCause(), (Object)this.getCause()))) {
            return false;
        }
        return true;
    }

    public Throwable fillInStackTrace() {
        this.setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public int hashCode() {
        String string2 = this.getMessage();
        Intrinsics.b(string2);
        int n8 = string2.hashCode();
        int n9 = this.o.hashCode();
        string2 = this.getCause();
        int n10 = string2 != null ? string2.hashCode() : 0;
        return (n8 * 31 + n9) * 31 + n10;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString());
        stringBuilder.append("; job=");
        stringBuilder.append((Object)this.o);
        return stringBuilder.toString();
    }
}

