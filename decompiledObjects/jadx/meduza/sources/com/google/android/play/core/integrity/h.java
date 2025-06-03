package com.google.android.play.core.integrity;

import com.google.android.play.core.integrity.StandardIntegrityManager;

/* loaded from: classes.dex */
final class h extends StandardIntegrityManager.StandardIntegrityTokenRequest {

    /* renamed from: a, reason: collision with root package name */
    private final String f3016a;

    public /* synthetic */ h(String str, g gVar) {
        this.f3016a = str;
    }

    @Override // com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenRequest
    public final String a() {
        return this.f3016a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StandardIntegrityManager.StandardIntegrityTokenRequest)) {
            return false;
        }
        String str = this.f3016a;
        String a10 = ((StandardIntegrityManager.StandardIntegrityTokenRequest) obj).a();
        return str == null ? a10 == null : str.equals(a10);
    }

    public final int hashCode() {
        String str = this.f3016a;
        return (str == null ? 0 : str.hashCode()) ^ 1000003;
    }

    public final String toString() {
        return defpackage.g.f(defpackage.f.l("StandardIntegrityTokenRequest{requestHash="), this.f3016a, "}");
    }
}
