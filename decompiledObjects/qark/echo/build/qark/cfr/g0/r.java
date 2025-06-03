/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.media.MediaFormat
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.nio.ByteBuffer
 *  java.util.List
 */
package g0;

import android.media.MediaFormat;
import d0.h;
import java.nio.ByteBuffer;
import java.util.List;

public abstract class r {
    public static void a(MediaFormat mediaFormat, String string2, byte[] arrby) {
        if (arrby != null) {
            mediaFormat.setByteBuffer(string2, ByteBuffer.wrap((byte[])arrby));
        }
    }

    public static void b(MediaFormat mediaFormat, h h8) {
        if (h8 != null) {
            r.d(mediaFormat, "color-transfer", h8.c);
            r.d(mediaFormat, "color-standard", h8.a);
            r.d(mediaFormat, "color-range", h8.b);
            r.a(mediaFormat, "hdr-static-info", h8.d);
        }
    }

    public static void c(MediaFormat mediaFormat, String string2, float f8) {
        if (f8 != -1.0f) {
            mediaFormat.setFloat(string2, f8);
        }
    }

    public static void d(MediaFormat mediaFormat, String string2, int n8) {
        if (n8 != -1) {
            mediaFormat.setInteger(string2, n8);
        }
    }

    public static void e(MediaFormat mediaFormat, List list) {
        for (int i8 = 0; i8 < list.size(); ++i8) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("csd-");
            stringBuilder.append(i8);
            mediaFormat.setByteBuffer(stringBuilder.toString(), ByteBuffer.wrap((byte[])((byte[])list.get(i8))));
        }
    }
}

