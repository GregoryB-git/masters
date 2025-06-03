// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package g0;

import java.util.List;
import d0.h;
import java.nio.ByteBuffer;
import android.media.MediaFormat;

public abstract class r
{
    public static void a(final MediaFormat mediaFormat, final String s, final byte[] array) {
        if (array != null) {
            mediaFormat.setByteBuffer(s, ByteBuffer.wrap(array));
        }
    }
    
    public static void b(final MediaFormat mediaFormat, final h h) {
        if (h != null) {
            d(mediaFormat, "color-transfer", h.c);
            d(mediaFormat, "color-standard", h.a);
            d(mediaFormat, "color-range", h.b);
            a(mediaFormat, "hdr-static-info", h.d);
        }
    }
    
    public static void c(final MediaFormat mediaFormat, final String s, final float n) {
        if (n != -1.0f) {
            mediaFormat.setFloat(s, n);
        }
    }
    
    public static void d(final MediaFormat mediaFormat, final String s, final int n) {
        if (n != -1) {
            mediaFormat.setInteger(s, n);
        }
    }
    
    public static void e(final MediaFormat mediaFormat, final List list) {
        for (int i = 0; i < list.size(); ++i) {
            final StringBuilder sb = new StringBuilder();
            sb.append("csd-");
            sb.append(i);
            mediaFormat.setByteBuffer(sb.toString(), ByteBuffer.wrap(list.get(i)));
        }
    }
}
