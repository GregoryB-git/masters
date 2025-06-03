package H3;

/* renamed from: H3.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC0403z {
    DEVELOPER(1),
    USER_SIDELOAD(2),
    TEST_DISTRIBUTION(3),
    APP_STORE(4);


    /* renamed from: o, reason: collision with root package name */
    public final int f2394o;

    EnumC0403z(int i7) {
        this.f2394o = i7;
    }

    public static EnumC0403z c(String str) {
        return str != null ? APP_STORE : DEVELOPER;
    }

    public int e() {
        return this.f2394o;
    }

    @Override // java.lang.Enum
    public String toString() {
        return Integer.toString(this.f2394o);
    }
}
