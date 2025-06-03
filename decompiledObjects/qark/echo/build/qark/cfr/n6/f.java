/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.Iterator
 */
package n6;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import n6.a;
import n6.b;
import n6.c;
import n6.e;

public abstract class f
extends e {
    public static b a(final Iterator iterator) {
        Intrinsics.checkNotNullParameter((Object)iterator, "<this>");
        return c.b(new b(){

            @Override
            public Iterator iterator() {
                return iterator;
            }
        });
    }

    public static b b(b b8) {
        Intrinsics.checkNotNullParameter(b8, "<this>");
        if (b8 instanceof a) {
            return b8;
        }
        return new a(b8);
    }

}

