/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.ThreadLocal
 *  java.util.Random
 */
package j6;

import j6.a;
import java.util.Random;
import kotlin.jvm.internal.Intrinsics;

public final class b
extends a {
    public final  q = new ThreadLocal(){

        public Random a() {
            return new Random();
        }
    };

    @Override
    public Random d() {
        Object object = this.q.get();
        Intrinsics.checkNotNullExpressionValue(object, "get(...)");
        return (Random)object;
    }

}

