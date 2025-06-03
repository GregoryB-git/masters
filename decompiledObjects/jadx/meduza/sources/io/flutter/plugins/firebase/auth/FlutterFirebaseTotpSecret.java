package io.flutter.plugins.firebase.auth;

import b8.m0;
import io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth;

/* loaded from: classes.dex */
public class FlutterFirebaseTotpSecret implements GeneratedAndroidFirebaseAuth.MultiFactorTotpSecretHostApi {
    public static final /* synthetic */ boolean $assertionsDisabled = false;

    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.MultiFactorTotpSecretHostApi
    public void generateQrCodeUrl(String str, String str2, String str3, GeneratedAndroidFirebaseAuth.Result<String> result) {
        m0 m0Var = FlutterFirebaseTotpMultiFactor.multiFactorSecret.get(str);
        result.success((str2 == null || str3 == null) ? m0Var.d() : m0Var.c(str2, str3));
    }

    @Override // io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.MultiFactorTotpSecretHostApi
    public void openInOtpApp(String str, String str2, GeneratedAndroidFirebaseAuth.VoidResult voidResult) {
        FlutterFirebaseTotpMultiFactor.multiFactorSecret.get(str).g(str2);
        voidResult.success();
    }
}
