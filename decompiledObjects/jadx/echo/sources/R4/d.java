package R4;

import l4.InterfaceC1612f;

/* loaded from: classes.dex */
public enum d implements InterfaceC1612f {
    COLLECTION_UNKNOWN(0),
    COLLECTION_SDK_NOT_INSTALLED(1),
    COLLECTION_ENABLED(2),
    COLLECTION_DISABLED(3),
    COLLECTION_DISABLED_REMOTE(4),
    COLLECTION_SAMPLED(5);


    /* renamed from: o, reason: collision with root package name */
    public final int f5714o;

    d(int i7) {
        this.f5714o = i7;
    }

    @Override // l4.InterfaceC1612f
    public int g() {
        return this.f5714o;
    }
}
