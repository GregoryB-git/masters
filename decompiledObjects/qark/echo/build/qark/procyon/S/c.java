// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package S;

import P.k;
import java.io.File;
import kotlin.jvm.internal.l;
import P.g;
import kotlin.jvm.internal.Intrinsics;
import P.f;
import g6.a;
import p6.I;
import java.util.List;
import Q.b;

public final class c
{
    public static final c a;
    
    static {
        a = new c();
    }
    
    public final f a(final b b, final List list, final I i, final a a) {
        Intrinsics.checkNotNullParameter(list, "migrations");
        Intrinsics.checkNotNullParameter(i, "scope");
        Intrinsics.checkNotNullParameter(a, "produceFile");
        return new S.b(g.a.a(h.a, b, list, i, new a() {
            public final File a() {
                final File obj = (File)a.invoke();
                final String k = e6.g.k(obj);
                final S.h a = S.h.a;
                if (Intrinsics.a(k, a.f())) {
                    return obj;
                }
                final StringBuilder sb = new StringBuilder();
                sb.append("File extension for file: ");
                sb.append(obj);
                sb.append(" does not match required extension for Preferences file: ");
                sb.append(a.f());
                throw new IllegalStateException(sb.toString().toString());
            }
        }));
    }
}
