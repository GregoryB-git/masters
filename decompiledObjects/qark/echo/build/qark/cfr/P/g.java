/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.List
 */
package P;

import P.b;
import P.e;
import P.f;
import P.k;
import P.m;
import Q.a;
import g6.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import p6.I;

public final class g {
    public static final g a = new g();

    public final f a(k k8, Q.b b8, List list, I i8, g6.a a8) {
        Intrinsics.checkNotNullParameter(k8, "serializer");
        Intrinsics.checkNotNullParameter((Object)list, "migrations");
        Intrinsics.checkNotNullParameter(i8, "scope");
        Intrinsics.checkNotNullParameter(a8, "produceFile");
        b8 = new a();
        return new m(a8, k8, W5.m.b(e.a.b(list)), b8, i8);
    }
}

