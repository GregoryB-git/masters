package p3;

import com.google.crypto.tink.shaded.protobuf.AbstractC1110z;

/* loaded from: classes.dex */
public enum u implements AbstractC1110z.a {
    UNKNOWN_HASH(0),
    SHA1(1),
    SHA384(2),
    SHA256(3),
    SHA512(4),
    SHA224(5),
    UNRECOGNIZED(-1);


    /* renamed from: w, reason: collision with root package name */
    public static final AbstractC1110z.b f18403w = new AbstractC1110z.b() { // from class: p3.u.a
    };

    /* renamed from: o, reason: collision with root package name */
    public final int f18405o;

    u(int i7) {
        this.f18405o = i7;
    }

    public static u c(int i7) {
        if (i7 == 0) {
            return UNKNOWN_HASH;
        }
        if (i7 == 1) {
            return SHA1;
        }
        if (i7 == 2) {
            return SHA384;
        }
        if (i7 == 3) {
            return SHA256;
        }
        if (i7 == 4) {
            return SHA512;
        }
        if (i7 != 5) {
            return null;
        }
        return SHA224;
    }

    public final int g() {
        if (this != UNRECOGNIZED) {
            return this.f18405o;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
