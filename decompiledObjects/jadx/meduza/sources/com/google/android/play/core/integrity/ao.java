package com.google.android.play.core.integrity;

/* loaded from: classes.dex */
final class ao extends IntegrityTokenRequest {

    /* renamed from: a, reason: collision with root package name */
    private final String f2946a;

    /* renamed from: b, reason: collision with root package name */
    private final Long f2947b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f2948c = null;

    public /* synthetic */ ao(String str, Long l10, Object obj, an anVar) {
        this.f2946a = str;
        this.f2947b = l10;
    }

    private static boolean a() {
        return true;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest
    public final Long cloudProjectNumber() {
        return this.f2947b;
    }

    public final boolean equals(Object obj) {
        boolean z10;
        if (obj == this) {
            return true;
        }
        if (obj instanceof IntegrityTokenRequest) {
            IntegrityTokenRequest integrityTokenRequest = (IntegrityTokenRequest) obj;
            if (this.f2946a.equals(integrityTokenRequest.nonce())) {
                Long l10 = this.f2947b;
                Long cloudProjectNumber = integrityTokenRequest.cloudProjectNumber();
                if (l10 != null ? l10.equals(cloudProjectNumber) : cloudProjectNumber == null) {
                    z10 = true;
                    if ((obj instanceof ao) || !a()) {
                        return z10;
                    }
                    ao aoVar = (ao) obj;
                    if (!z10) {
                        return false;
                    }
                    Object obj2 = aoVar.f2948c;
                    return true;
                }
            }
        }
        z10 = false;
        if (obj instanceof ao) {
        }
        return z10;
    }

    public final int hashCode() {
        int hashCode = this.f2946a.hashCode() ^ 1000003;
        Long l10 = this.f2947b;
        int hashCode2 = (hashCode * 1000003) ^ (l10 == null ? 0 : l10.hashCode());
        return a() ? hashCode2 * 1000003 : hashCode2;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest
    public final String nonce() {
        return this.f2946a;
    }

    public final String toString() {
        StringBuilder l10 = defpackage.f.l("IntegrityTokenRequest{nonce=");
        l10.append(this.f2946a);
        l10.append(", cloudProjectNumber=");
        l10.append(this.f2947b);
        String sb2 = l10.toString();
        if (a()) {
            sb2 = sb2.concat(", network=null");
        }
        return sb2.concat("}");
    }
}
