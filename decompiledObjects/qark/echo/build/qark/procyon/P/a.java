// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package P;

import kotlin.jvm.internal.g;
import kotlin.jvm.internal.Intrinsics;
import java.io.IOException;

public final class a extends IOException
{
    public a(final String message, final Throwable cause) {
        Intrinsics.checkNotNullParameter(message, "message");
        super(message, cause);
    }
}
