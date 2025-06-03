package j6;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class v extends u {

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f8516b;

    public v(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.f8516b = bArr;
    }

    @Override // j6.u
    public final byte[] r() {
        return this.f8516b;
    }
}
