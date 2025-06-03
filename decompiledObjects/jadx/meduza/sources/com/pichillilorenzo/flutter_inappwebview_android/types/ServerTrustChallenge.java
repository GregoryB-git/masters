package com.pichillilorenzo.flutter_inappwebview_android.types;

import defpackage.f;

/* loaded from: classes.dex */
public class ServerTrustChallenge extends URLAuthenticationChallenge {
    public ServerTrustChallenge(URLProtectionSpace uRLProtectionSpace) {
        super(uRLProtectionSpace);
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.URLAuthenticationChallenge
    public String toString() {
        StringBuilder l10 = f.l("ServerTrustChallenge{} ");
        l10.append(super.toString());
        return l10.toString();
    }
}
