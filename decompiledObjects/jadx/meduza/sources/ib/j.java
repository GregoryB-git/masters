package ib;

/* loaded from: classes.dex */
public enum j {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2");


    /* renamed from: a, reason: collision with root package name */
    public final String f7938a;

    j(String str) {
        this.f7938a = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f7938a;
    }
}
