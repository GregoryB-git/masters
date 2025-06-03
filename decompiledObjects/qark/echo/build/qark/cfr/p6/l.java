/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.lang.UnsupportedOperationException
 */
package p6;

import X5.d;

public interface l
extends d {
    public void d(g6.l var1);

    public Object g(Object var1, Object var2, g6.l var3);

    public void j(Object var1, g6.l var2);

    public boolean o(Throwable var1);

    public void p(Object var1);

    public static final abstract class a {
        public static /* synthetic */ boolean a(l l8, Throwable throwable, int n8, Object object) {
            if (object == null) {
                if ((n8 & 1) != 0) {
                    throwable = null;
                }
                return l8.o(throwable);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
        }
    }

}

