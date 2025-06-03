// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package t0;

import android.media.MediaCodec$CodecException;
import g0.M;
import j0.h;

public class o extends h
{
    public final p o;
    public final String p;
    public final int q;
    
    public o(final Throwable t, final p o) {
        final StringBuilder sb = new StringBuilder();
        sb.append("Decoder failed: ");
        final String s = null;
        String a;
        if (o == null) {
            a = null;
        }
        else {
            a = o.a;
        }
        sb.append(a);
        super(sb.toString(), t);
        this.o = o;
        final int a2 = M.a;
        String a3 = s;
        if (a2 >= 21) {
            a3 = a(t);
        }
        this.p = a3;
        int q;
        if (a2 >= 23) {
            q = b(t);
        }
        else {
            q = M.X(a3);
        }
        this.q = q;
    }
    
    public static String a(final Throwable t) {
        if (t instanceof MediaCodec$CodecException) {
            return ((MediaCodec$CodecException)t).getDiagnosticInfo();
        }
        return null;
    }
    
    public static int b(final Throwable t) {
        if (t instanceof MediaCodec$CodecException) {
            return ((MediaCodec$CodecException)t).getErrorCode();
        }
        return 0;
    }
}
