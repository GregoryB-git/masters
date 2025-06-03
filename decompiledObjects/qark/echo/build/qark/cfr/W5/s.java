/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.Collections
 *  java.util.Comparator
 *  java.util.List
 */
package W5;

import W5.r;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public class s
extends r {
    public static void m(List list, Comparator comparator) {
        Intrinsics.checkNotNullParameter((Object)list, "<this>");
        Intrinsics.checkNotNullParameter((Object)comparator, "comparator");
        if (list.size() > 1) {
            Collections.sort((List)list, (Comparator)comparator);
        }
    }
}

