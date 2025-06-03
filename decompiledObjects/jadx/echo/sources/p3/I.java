package p3;

import com.google.crypto.tink.shaded.protobuf.AbstractC1110z;

/* loaded from: classes.dex */
public enum I implements AbstractC1110z.a {
    UNKNOWN_PREFIX(0),
    TINK(1),
    LEGACY(2),
    RAW(3),
    CRUNCHY(4),
    UNRECOGNIZED(-1);


    /* renamed from: v, reason: collision with root package name */
    public static final AbstractC1110z.b f18370v = new AbstractC1110z.b() { // from class: p3.I.a
    };

    /* renamed from: o, reason: collision with root package name */
    public final int f18372o;

    I(int i7) {
        this.f18372o = i7;
    }

    public static I c(int i7) {
        if (i7 == 0) {
            return UNKNOWN_PREFIX;
        }
        if (i7 == 1) {
            return TINK;
        }
        if (i7 == 2) {
            return LEGACY;
        }
        if (i7 == 3) {
            return RAW;
        }
        if (i7 != 4) {
            return null;
        }
        return CRUNCHY;
    }

    public final int g() {
        if (this != UNRECOGNIZED) {
            return this.f18372o;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
