package g0;

import android.media.MediaFormat;
import d0.C1185h;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes.dex */
public abstract class r {
    public static void a(MediaFormat mediaFormat, String str, byte[] bArr) {
        if (bArr != null) {
            mediaFormat.setByteBuffer(str, ByteBuffer.wrap(bArr));
        }
    }

    public static void b(MediaFormat mediaFormat, C1185h c1185h) {
        if (c1185h != null) {
            d(mediaFormat, "color-transfer", c1185h.f12630c);
            d(mediaFormat, "color-standard", c1185h.f12628a);
            d(mediaFormat, "color-range", c1185h.f12629b);
            a(mediaFormat, "hdr-static-info", c1185h.f12631d);
        }
    }

    public static void c(MediaFormat mediaFormat, String str, float f7) {
        if (f7 != -1.0f) {
            mediaFormat.setFloat(str, f7);
        }
    }

    public static void d(MediaFormat mediaFormat, String str, int i7) {
        if (i7 != -1) {
            mediaFormat.setInteger(str, i7);
        }
    }

    public static void e(MediaFormat mediaFormat, List list) {
        for (int i7 = 0; i7 < list.size(); i7++) {
            mediaFormat.setByteBuffer("csd-" + i7, ByteBuffer.wrap((byte[]) list.get(i7)));
        }
    }
}
