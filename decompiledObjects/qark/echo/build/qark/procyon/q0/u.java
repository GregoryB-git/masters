// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package q0;

import java.io.IOException;

public final class u extends IOException
{
    public u(final String str) {
        final StringBuilder sb = new StringBuilder();
        sb.append("Unable to bind a sample queue to TrackGroup with MIME type ");
        sb.append(str);
        sb.append(".");
        super(sb.toString());
    }
}
