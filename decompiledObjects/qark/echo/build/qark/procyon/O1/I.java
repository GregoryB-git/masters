// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package O1;

import java.util.Iterator;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g;
import java.util.EnumSet;

public enum I
{
    public static final a p;
    public static final EnumSet q;
    
    r("None", 0, 0L), 
    s("Enabled", 1, 1L), 
    t("RequireConfirm", 2, 2L);
    
    public final long o;
    
    static {
        u = c();
        p = new a(null);
        final EnumSet<I> all = EnumSet.allOf(I.class);
        Intrinsics.checkNotNullExpressionValue(all, "allOf(SmartLoginOption::class.java)");
        q = all;
    }
    
    public I(final String name, final int ordinal, final long o) {
        this.o = o;
    }
    
    public static final /* synthetic */ I[] c() {
        return new I[] { I.r, I.s, I.t };
    }
    
    public static final /* synthetic */ EnumSet e() {
        return I.q;
    }
    
    public final long h() {
        return this.o;
    }
    
    public static final class a
    {
        public final EnumSet a(final long n) {
            final EnumSet<I> none = EnumSet.noneOf(I.class);
            for (final I e : I.e()) {
                if ((e.h() & n) != 0x0L) {
                    none.add(e);
                }
            }
            Intrinsics.checkNotNullExpressionValue(none, "result");
            return none;
        }
    }
}
