/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.Random
 */
package x1;

import O1.n;
import U1.e;
import java.util.Random;
import kotlin.jvm.internal.g;
import x1.B;
import x1.n;

public class o
extends RuntimeException {
    public static final a o = new a(null);
    public static final long serialVersionUID = 1L;

    public o() {
    }

    public o(String string2) {
        super(string2);
        Object object = new Random();
        if (string2 != null && B.F() && object.nextInt(100) > 50) {
            object = O1.n.a;
            O1.n.a(n.b.M, new n(string2));
        }
    }

    public o(String string2, Throwable throwable) {
        super(string2, throwable);
    }

    public o(Throwable throwable) {
        super(throwable);
    }

    public static /* synthetic */ void a(String string2, boolean bl) {
        o.b(string2, bl);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static final void b(String string2, boolean bl) {
        if (!bl) return;
        try {
            e.g(string2);
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    public String toString() {
        String string2;
        String string3 = string2 = this.getMessage();
        if (string2 == null) {
            string3 = "";
        }
        return string3;
    }

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(g g8) {
            this();
        }
    }

}

