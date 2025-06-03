package R4;

import l4.InterfaceC1612f;

/* loaded from: classes.dex */
public enum j implements InterfaceC1612f {
    EVENT_TYPE_UNKNOWN(0),
    SESSION_START(1);


    /* renamed from: o, reason: collision with root package name */
    public final int f5724o;

    j(int i7) {
        this.f5724o = i7;
    }

    @Override // l4.InterfaceC1612f
    public int g() {
        return this.f5724o;
    }
}
