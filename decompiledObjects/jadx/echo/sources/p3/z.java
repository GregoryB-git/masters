package p3;

import com.google.crypto.tink.shaded.protobuf.AbstractC1110z;

/* loaded from: classes.dex */
public enum z implements AbstractC1110z.a {
    UNKNOWN_STATUS(0),
    ENABLED(1),
    DISABLED(2),
    DESTROYED(3),
    UNRECOGNIZED(-1);


    /* renamed from: u, reason: collision with root package name */
    public static final AbstractC1110z.b f18424u = new AbstractC1110z.b() { // from class: p3.z.a
    };

    /* renamed from: o, reason: collision with root package name */
    public final int f18426o;

    z(int i7) {
        this.f18426o = i7;
    }

    public static z c(int i7) {
        if (i7 == 0) {
            return UNKNOWN_STATUS;
        }
        if (i7 == 1) {
            return ENABLED;
        }
        if (i7 == 2) {
            return DISABLED;
        }
        if (i7 != 3) {
            return null;
        }
        return DESTROYED;
    }

    public final int g() {
        if (this != UNRECOGNIZED) {
            return this.f18426o;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
