package x2;

import java.util.Arrays;

/* renamed from: x2.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC2172B extends AbstractBinderC2171A {

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f21135c;

    public BinderC2172B(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.f21135c = bArr;
    }

    @Override // x2.AbstractBinderC2171A
    public final byte[] Z0() {
        return this.f21135c;
    }
}
