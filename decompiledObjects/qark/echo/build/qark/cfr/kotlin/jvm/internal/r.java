/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.UnsupportedOperationException
 */
package kotlin.jvm.internal;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.c;
import m6.b;
import m6.d;
import m6.h;

public abstract class r
extends c
implements h {
    public final boolean o;

    public r(Object object, Class class_, String string2, String string3, int n8) {
        boolean bl = false;
        boolean bl2 = (n8 & 1) == 1;
        super(object, class_, string2, string3, bl2);
        bl2 = bl;
        if ((n8 & 2) == 2) {
            bl2 = true;
        }
        this.o = bl2;
    }

    public h b() {
        if (!this.o) {
            return (h)super.getReflected();
        }
        throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
    }

    @Override
    public b compute() {
        if (this.o) {
            return this;
        }
        return super.compute();
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof r) {
            object = (r)object;
            if (this.getOwner().equals((Object)object.getOwner()) && this.getName().equals((Object)object.getName()) && this.getSignature().equals((Object)object.getSignature()) && Intrinsics.a(this.getBoundReceiver(), object.getBoundReceiver())) {
                return true;
            }
            return false;
        }
        if (object instanceof h) {
            return object.equals((Object)this.compute());
        }
        return false;
    }

    public int hashCode() {
        return (this.getOwner().hashCode() * 31 + this.getName().hashCode()) * 31 + this.getSignature().hashCode();
    }

    public String toString() {
        b b8 = this.compute();
        if (b8 != this) {
            return b8.toString();
        }
        b8 = new StringBuilder();
        b8.append("property ");
        b8.append(this.getName());
        b8.append(" (Kotlin reflection is not available)");
        return b8.toString();
    }
}

