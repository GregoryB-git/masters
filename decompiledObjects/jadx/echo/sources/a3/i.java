package a3;

import W2.m;

/* loaded from: classes.dex */
public abstract class i {
    public static byte a(long j7) {
        m.g((j7 >> 8) == 0, "out of range: %s", j7);
        return (byte) j7;
    }

    public static int b(byte b7) {
        return b7 & 255;
    }
}
