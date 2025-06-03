// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R;

import p6.J;
import X5.g;
import p6.q0;
import p6.J0;
import p6.W;
import kotlin.jvm.internal.Intrinsics;
import p6.I;
import g6.l;
import Q.b;

public abstract class a
{
    public static final i6.a a(final String s, final b b, final l l, final I i) {
        Intrinsics.checkNotNullParameter(s, "name");
        Intrinsics.checkNotNullParameter(l, "produceMigrations");
        Intrinsics.checkNotNullParameter(i, "scope");
        return new c(s, b, l, i);
    }
}
