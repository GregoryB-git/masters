package com.google.android.play.core.integrity;

import com.google.android.play.core.integrity.StandardIntegrityManager;

/* loaded from: classes.dex */
final class c extends StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder {

    /* renamed from: a, reason: collision with root package name */
    private long f3012a;

    /* renamed from: b, reason: collision with root package name */
    private byte f3013b;

    public final StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder a(int i10) {
        this.f3013b = (byte) (this.f3013b | 2);
        return this;
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder
    public final StandardIntegrityManager.PrepareIntegrityTokenRequest build() {
        if (this.f3013b == 3) {
            return new e(this.f3012a, 0, null);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.f3013b & 1) == 0) {
            sb2.append(" cloudProjectNumber");
        }
        if ((this.f3013b & 2) == 0) {
            sb2.append(" webViewRequestMode");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder
    public final StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder setCloudProjectNumber(long j10) {
        this.f3012a = j10;
        this.f3013b = (byte) (this.f3013b | 1);
        return this;
    }
}
