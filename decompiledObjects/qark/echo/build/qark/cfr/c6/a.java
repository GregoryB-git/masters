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
package c6;

import java.lang.reflect.Field;
import kotlin.jvm.internal.Intrinsics;

public abstract class a
extends b6.a {
    private final boolean c(int n8) {
        Integer n9 = a.b;
        if (n9 != null && n9 < n8) {
            return false;
        }
        return true;
    }

    @Override
    public void a(Throwable throwable, Throwable throwable2) {
        Intrinsics.checkNotNullParameter((Object)throwable, "cause");
        Intrinsics.checkNotNullParameter((Object)throwable2, "exception");
        if (this.c(19)) {
            throwable.addSuppressed(throwable2);
            return;
        }
        super.a(throwable, throwable2);
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

