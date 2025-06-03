/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.util.Collection
 */
package W5;

import W5.o;
import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;

public class p
extends o {
    public static int l(Iterable iterable, int n8) {
        Intrinsics.checkNotNullParameter((Object)iterable, "<this>");
        if (iterable instanceof Collection) {
            n8 = ((Collection)iterable).size();
        }
        return n8;
    }
}

