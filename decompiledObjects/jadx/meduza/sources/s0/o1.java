package s0;

import java.io.Serializable;

/* loaded from: classes.dex */
public enum o1 {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(0.0f)),
    DOUBLE(Double.valueOf(0.0d)),
    BOOLEAN(Boolean.FALSE),
    STRING(""),
    BYTE_STRING(g.f13982b),
    ENUM(null),
    MESSAGE(null);


    /* renamed from: a, reason: collision with root package name */
    public final Object f14069a;

    o1(Serializable serializable) {
        this.f14069a = serializable;
    }
}
