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
import kotlin.jvm.internal.c;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.v;
import m6.b;
import m6.d;
import m6.e;

public abstract class i
extends c
implements h,
e {
    private final int arity;
    private final int flags;

    public i(int n8, Object object, Class class_, String string2, String string3, int n9) {
        boolean bl = (n9 & 1) == 1;
        super(object, class_, string2, string3, bl);
        this.arity = n8;
        this.flags = n9 >> 1;
    }

    @Override
    public b computeReflected() {
        return v.a(this);
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof i) {
            object = (i)object;
            if (this.getName().equals((Object)object.getName()) && this.getSignature().equals((Object)object.getSignature()) && this.flags == object.flags && this.arity == object.arity && Intrinsics.a(this.getBoundReceiver(), object.getBoundReceiver()) && Intrinsics.a(this.getOwner(), object.getOwner())) {
                return true;
            }
            return false;
        }
        if (object instanceof e) {
            return object.equals((Object)this.compute());
        }
        return false;
    }

    @Override
    public int getArity() {
        return this.arity;
    }

    @Override
    public e getReflected() {
        return (e)super.getReflected();
    }

    public int hashCode() {
        int n8 = this.getOwner() == null ? 0 : this.getOwner().hashCode() * 31;
        return (n8 + this.getName().hashCode()) * 31 + this.getSignature().hashCode();
    }

    @Override
    public boolean isExternal() {
        return this.getReflected().isExternal();
    }

    @Override
    public boolean isInfix() {
        return this.getReflected().isInfix();
    }

    @Override
    public boolean isInline() {
        return this.getReflected().isInline();
    }

    @Override
    public boolean isOperator() {
        return this.getReflected().isOperator();
    }

    @Override
    public boolean isSuspend() {
        return this.getReflected().isSuspend();
    }

    public String toString() {
        b b8 = this.compute();
        if (b8 != this) {
            return b8.toString();
        }
        if ("<init>".equals((Object)this.getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        b8 = new StringBuilder();
        b8.append("function ");
        b8.append(this.getName());
        b8.append(" (Kotlin reflection is not available)");
        return b8.toString();
    }
}

