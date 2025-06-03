package ea;

/* loaded from: classes.dex */
public enum r implements a9.g {
    /* JADX INFO: Fake field, exist only in values array */
    LOG_ENVIRONMENT_UNKNOWN(0),
    /* JADX INFO: Fake field, exist only in values array */
    LOG_ENVIRONMENT_AUTOPUSH(1),
    /* JADX INFO: Fake field, exist only in values array */
    LOG_ENVIRONMENT_STAGING(2),
    LOG_ENVIRONMENT_PROD(3);


    /* renamed from: a, reason: collision with root package name */
    public final int f4970a;

    r(int i10) {
        this.f4970a = i10;
    }

    @Override // a9.g
    public final int a() {
        return this.f4970a;
    }
}
