/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.lang.reflect.Field
 */
package d6;

import j6.c;
import java.lang.reflect.Field;

public class a
extends c6.a {
    @Override
    public c b() {
        if (this.c(34)) {
            return new k6.a();
        }
        return b6.a.super.b();
    }

    public final boolean c(int n8) {
        Integer n9 = a.b;
        if (n9 != null && n9 < n8) {
            return false;
        }
        return true;
    }

    public static final class a {
        public static final a a;
        public static final Integer b;

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        static {
            Object object;
            Object object2;
            block5 : {
                block4 : {
                    a = new a();
                    object = null;
                    try {
                        object2 = Class.forName((String)"android.os.Build$VERSION").getField("SDK_INT").get((Object)null);
                        if (!(object2 instanceof Integer)) break block4;
                        object2 = (Integer)object2;
                        break block5;
                    }
                    catch (Throwable throwable) {}
                }
                object2 = null;
            }
            Object object3 = object;
            if (object2 != null) {
                object3 = object;
                if (object2.intValue() > 0) {
                    object3 = object2;
                }
            }
            b = object3;
        }
    }

}

