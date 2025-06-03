package e7;

/* loaded from: classes.dex */
public enum g3 {
    UNINITIALIZED("uninitialized"),
    POLICY("eu_consent_policy"),
    DENIED("denied"),
    GRANTED("granted");


    /* renamed from: a, reason: collision with root package name */
    public final String f4218a;

    g3(String str) {
        this.f4218a = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f4218a;
    }
}
