// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package Y1;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

public enum e
{
    p("NONE", 0, (String)null), 
    q("ONLY_ME", 1, "only_me"), 
    r("FRIENDS", 2, "friends"), 
    s("EVERYONE", 3, "everyone");
    
    public final String o;
    
    static {
        t = c();
    }
    
    public e(final String name, final int ordinal, final String o) {
        this.o = o;
    }
    
    public static final /* synthetic */ e[] c() {
        return new e[] { e.p, e.q, e.r, e.s };
    }
    
    public final String e() {
        return this.o;
    }
}
