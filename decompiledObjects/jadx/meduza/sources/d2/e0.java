package d2;

import java.util.Objects;
import org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface;

/* loaded from: classes.dex */
public final class e0 implements WebMessagePayloadBoundaryInterface {

    /* renamed from: a, reason: collision with root package name */
    public final int f3355a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3356b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f3357c;

    public e0(String str) {
        this.f3355a = 0;
        this.f3356b = str;
        this.f3357c = null;
    }

    public e0(byte[] bArr) {
        this.f3355a = 1;
        this.f3356b = null;
        this.f3357c = bArr;
    }

    public final void a(int i10) {
        if (this.f3355a == i10) {
            return;
        }
        StringBuilder n2 = a0.j.n("Expected ", i10, ", but type is ");
        n2.append(this.f3355a);
        throw new IllegalStateException(n2.toString());
    }

    @Override // org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface
    public final byte[] getAsArrayBuffer() {
        a(1);
        byte[] bArr = this.f3357c;
        Objects.requireNonNull(bArr);
        return bArr;
    }

    @Override // org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface
    public final String getAsString() {
        a(0);
        return this.f3356b;
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public final String[] getSupportedFeatures() {
        return new String[0];
    }

    @Override // org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface
    public final int getType() {
        return this.f3355a;
    }
}
