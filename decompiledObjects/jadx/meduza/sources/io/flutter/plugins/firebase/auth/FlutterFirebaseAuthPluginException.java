package io.flutter.plugins.firebase.auth;

import io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

/* loaded from: classes.dex */
public class FlutterFirebaseAuthPluginException {
    public static GeneratedAndroidFirebaseAuth.FlutterError alreadyLinkedProvider() {
        return new GeneratedAndroidFirebaseAuth.FlutterError("PROVIDER_ALREADY_LINKED", "User has already been linked to the given provider.", null);
    }

    public static GeneratedAndroidFirebaseAuth.FlutterError invalidCredential() {
        return new GeneratedAndroidFirebaseAuth.FlutterError("INVALID_CREDENTIAL", "The supplied auth credential is malformed, has expired or is not currently supported.", null);
    }

    public static GeneratedAndroidFirebaseAuth.FlutterError noSuchProvider() {
        return new GeneratedAndroidFirebaseAuth.FlutterError("NO_SUCH_PROVIDER", "User was not linked to an account with the given provider.", null);
    }

    public static GeneratedAndroidFirebaseAuth.FlutterError noUser() {
        return new GeneratedAndroidFirebaseAuth.FlutterError("NO_CURRENT_USER", "No user currently signed in.", null);
    }

    public static GeneratedAndroidFirebaseAuth.FlutterError parserExceptionToFlutter(Exception exc) {
        if (exc == null) {
            return new GeneratedAndroidFirebaseAuth.FlutterError("UNKNOWN", null, null);
        }
        String message = exc.getMessage();
        HashMap hashMap = new HashMap();
        if (exc instanceof b8.o) {
            b8.o oVar = (b8.o) exc;
            HashMap hashMap2 = new HashMap();
            b8.y yVar = oVar.f2121b;
            ArrayList E = yVar.E();
            c8.n F = yVar.F();
            String uuid = UUID.randomUUID().toString();
            FlutterFirebaseMultiFactor.multiFactorSessionMap.put(uuid, F);
            String uuid2 = UUID.randomUUID().toString();
            FlutterFirebaseMultiFactor.multiFactorResolverMap.put(uuid2, yVar);
            List<List<Object>> multiFactorInfoToMap = PigeonParser.multiFactorInfoToMap(E);
            u7.f fVar = oVar.f2121b.D().f3057a;
            fVar.a();
            hashMap2.put("appName", fVar.f15085b);
            hashMap2.put(Constants.MULTI_FACTOR_HINTS, multiFactorInfoToMap);
            hashMap2.put(Constants.MULTI_FACTOR_SESSION_ID, uuid);
            hashMap2.put(Constants.MULTI_FACTOR_RESOLVER_ID, uuid2);
            return new GeneratedAndroidFirebaseAuth.FlutterError(oVar.f2106a, oVar.getLocalizedMessage(), hashMap2);
        }
        if ((exc instanceof u7.i) || (exc.getCause() != null && (exc.getCause() instanceof u7.i))) {
            return new GeneratedAndroidFirebaseAuth.FlutterError("network-request-failed", "A network error (such as timeout, interrupted connection or unreachable host) has occurred.", null);
        }
        if ((exc instanceof u7.c) || (exc.getCause() != null && (exc.getCause() instanceof u7.c))) {
            return new GeneratedAndroidFirebaseAuth.FlutterError("api-not-available", "The requested API is not available.", null);
        }
        if ((exc instanceof u7.k) || (exc.getCause() != null && (exc.getCause() instanceof u7.k))) {
            return new GeneratedAndroidFirebaseAuth.FlutterError("too-many-requests", "We have blocked all requests from this device due to unusual activity. Try again later.", null);
        }
        if (exc.getMessage() != null && exc.getMessage().startsWith("Cannot create PhoneAuthCredential without either verificationProof")) {
            return new GeneratedAndroidFirebaseAuth.FlutterError("invalid-verification-code", "The verification ID used to create the phone auth credential is invalid.", null);
        }
        if (message != null && message.contains("User has already been linked to the given provider.")) {
            return alreadyLinkedProvider();
        }
        String str = exc instanceof b8.l ? ((b8.l) exc).f2106a : "UNKNOWN";
        if (exc instanceof b8.q) {
            message = ((b8.q) exc).f2131b;
        }
        if (exc instanceof b8.p) {
            b8.p pVar = (b8.p) exc;
            String str2 = pVar.f2124c;
            if (str2 != null) {
                hashMap.put(Constants.EMAIL, str2);
            }
            b8.f fVar2 = pVar.f2123b;
            if (fVar2 != null) {
                hashMap.put("authCredential", PigeonParser.parseAuthCredential(fVar2));
            }
        }
        return new GeneratedAndroidFirebaseAuth.FlutterError(str, message, hashMap);
    }
}
