/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package w6;

import p6.M;
import w6.h;
import w6.i;

public final class k
extends h {
    public final Runnable q;

    public k(Runnable runnable, long l8, i i8) {
        super(l8, i8);
        this.q = runnable;
    }

    public void run() {
        try {
            this.q.run();
            return;
        }
        finally {
            this.p.a();
        }
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Task[");
        stringBuilder.append(M.a((Object)this.q));
        stringBuilder.append('@');
        stringBuilder.append(M.b((Object)this.q));
        stringBuilder.append(", ");
        stringBuilder.append(this.o);
        stringBuilder.append(", ");
        stringBuilder.append((Object)this.p);
        stringBuilder.append(']');
        return stringBuilder.toString();
    }
}

