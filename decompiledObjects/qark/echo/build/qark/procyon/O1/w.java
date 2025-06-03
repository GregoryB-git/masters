// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package O1;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

public enum w
{
    p("ContextChoose", 0, "context_choose"), 
    q("JoinTournament", 1, "join_tournament");
    
    public final String o;
    
    static {
        r = c();
    }
    
    public w(final String name, final int ordinal, final String o) {
        this.o = o;
    }
    
    public static final /* synthetic */ w[] c() {
        return new w[] { w.p, w.q };
    }
    
    public final String e() {
        return this.o;
    }
}
