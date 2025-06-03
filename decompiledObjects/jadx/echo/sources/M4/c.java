package M4;

/* loaded from: classes.dex */
public enum c {
    APP_START_TRACE_NAME("_as"),
    ON_CREATE_TRACE_NAME("_astui"),
    ON_START_TRACE_NAME("_astfd"),
    ON_RESUME_TRACE_NAME("_asti"),
    FOREGROUND_TRACE_NAME("_fs"),
    BACKGROUND_TRACE_NAME("_bs");


    /* renamed from: o, reason: collision with root package name */
    public String f3534o;

    c(String str) {
        this.f3534o = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f3534o;
    }
}
