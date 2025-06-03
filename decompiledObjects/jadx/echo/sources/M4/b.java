package M4;

/* loaded from: classes.dex */
public enum b {
    TRACE_EVENT_RATE_LIMITED("_fstec"),
    NETWORK_TRACE_EVENT_RATE_LIMITED("_fsntc"),
    TRACE_STARTED_NOT_STOPPED("_tsns"),
    FRAMES_TOTAL("_fr_tot"),
    FRAMES_SLOW("_fr_slo"),
    FRAMES_FROZEN("_fr_fzn");


    /* renamed from: o, reason: collision with root package name */
    public String f3526o;

    b(String str) {
        this.f3526o = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f3526o;
    }
}
