/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.UnsupportedOperationException
 */
package y6;

import X5.d;

public interface a {
    public Object a(Object var1, d var2);

    public void b(Object var1);

    public boolean c();

    public static final abstract class a {
        public static /* synthetic */ void a(a a8, Object object, int n8, Object object2) {
            if (object2 == null) {
                if ((n8 & 1) != 0) {
                    object = null;
                }
                a8.b(object);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: unlock");
        }
    }

}

