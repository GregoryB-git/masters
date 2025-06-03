// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package e6;

import kotlin.jvm.internal.Intrinsics;
import java.io.File;
import java.io.IOException;

public abstract class d extends IOException
{
    public final File o;
    public final File p;
    public final String q;
    
    public d(final File o, final File p3, final String q) {
        Intrinsics.checkNotNullParameter(o, "file");
        super(c.a(o, p3, q));
        this.o = o;
        this.p = p3;
        this.q = q;
    }
}
