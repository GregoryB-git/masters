/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 */
package u6;

import V5.a;
import V5.t;
import X5.g;
import g6.l;
import p6.H;
import u6.O;

public abstract class x {
    public static final l a(final l l8, final Object object, final g g8) {
        return new l(){

            public final void a(Throwable throwable) {
                x.b(l8, object, g8);
            }
        };
    }

    public static final void b(l object, Object object2, g g8) {
        if ((object = x.c((l)object, object2, null)) != null) {
            H.a(g8, (Throwable)object);
        }
    }

    public static final O c(l l8, Object object, O o8) {
        try {
            l8.invoke(object);
            return o8;
        }
        catch (Throwable throwable) {
            if (o8 != null && o8.getCause() != throwable) {
                a.a((Throwable)o8, throwable);
                return o8;
            }
            o8 = new StringBuilder();
            o8.append("Exception in undelivered element handler for ");
            o8.append(object);
            return new O(o8.toString(), throwable);
        }
    }

    public static /* synthetic */ O d(l l8, Object object, O o8, int n8, Object object2) {
        if ((n8 & 2) != 0) {
            o8 = null;
        }
        return x.c(l8, object, o8);
    }

}

