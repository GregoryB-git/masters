// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package P;

import W5.m;
import kotlin.jvm.internal.Intrinsics;
import g6.a;
import p6.I;
import java.util.List;
import Q.b;

public final class g
{
    public static final g a;
    
    static {
        a = new g();
    }
    
    public final f a(final k k, final b b, final List list, final I i, final a a) {
        Intrinsics.checkNotNullParameter(k, "serializer");
        Intrinsics.checkNotNullParameter(list, "migrations");
        Intrinsics.checkNotNullParameter(i, "scope");
        Intrinsics.checkNotNullParameter(a, "produceFile");
        return new P.m(a, k, m.b(e.a.b(list)), new Q.a(), i);
    }
}
