package R2;

/* renamed from: R2.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC0539k {
    UNSET('0'),
    REMOTE_DEFAULT('1'),
    REMOTE_DELEGATION('2'),
    MANIFEST('3'),
    INITIALIZATION('4'),
    API('5'),
    CHILD_ACCOUNT('6'),
    FAILSAFE('9');


    /* renamed from: o, reason: collision with root package name */
    public final char f5365o;

    EnumC0539k(char c7) {
        this.f5365o = c7;
    }

    public static EnumC0539k e(char c7) {
        for (EnumC0539k enumC0539k : values()) {
            if (enumC0539k.f5365o == c7) {
                return enumC0539k;
            }
        }
        return UNSET;
    }
}
