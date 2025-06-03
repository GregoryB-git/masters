package R4;

import l4.InterfaceC1612f;

/* loaded from: classes.dex */
public enum n implements InterfaceC1612f {
    LOG_ENVIRONMENT_UNKNOWN(0),
    LOG_ENVIRONMENT_AUTOPUSH(1),
    LOG_ENVIRONMENT_STAGING(2),
    LOG_ENVIRONMENT_PROD(3);


    /* renamed from: o, reason: collision with root package name */
    public final int f5747o;

    n(int i7) {
        this.f5747o = i7;
    }

    @Override // l4.InterfaceC1612f
    public int g() {
        return this.f5747o;
    }
}
