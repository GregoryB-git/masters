package ma;

import java.io.Serializable;

/* loaded from: classes.dex */
public enum w1 {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(0.0f)),
    DOUBLE(Double.valueOf(0.0d)),
    BOOLEAN(Boolean.FALSE),
    STRING(""),
    BYTE_STRING(h.f10961b),
    ENUM(null),
    MESSAGE(null);


    /* renamed from: a, reason: collision with root package name */
    public final Object f11142a;

    w1(Serializable serializable) {
        this.f11142a = serializable;
    }
}
