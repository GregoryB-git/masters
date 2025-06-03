package io.flutter.plugins.firebase.auth;

import android.net.Uri;
import android.text.TextUtils;
import b8.c;
import b8.c0;
import b8.c1;
import b8.h0;
import b8.i0;
import b8.n0;
import b8.o0;
import b8.r;
import c8.i1;
import io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public class PigeonParser {
    public static b8.c getActionCodeSettings(GeneratedAndroidFirebaseAuth.PigeonActionCodeSettings pigeonActionCodeSettings) {
        c.a aVar = new c.a();
        aVar.f2047a = pigeonActionCodeSettings.getUrl();
        if (pigeonActionCodeSettings.getDynamicLinkDomain() != null) {
            aVar.f2052g = pigeonActionCodeSettings.getDynamicLinkDomain();
        }
        if (pigeonActionCodeSettings.getLinkDomain() != null) {
            aVar.f2053h = pigeonActionCodeSettings.getLinkDomain();
        }
        aVar.f = pigeonActionCodeSettings.getHandleCodeInApp().booleanValue();
        if (pigeonActionCodeSettings.getAndroidPackageName() != null) {
            String androidPackageName = pigeonActionCodeSettings.getAndroidPackageName();
            boolean booleanValue = pigeonActionCodeSettings.getAndroidInstallApp().booleanValue();
            String androidMinimumVersion = pigeonActionCodeSettings.getAndroidMinimumVersion();
            aVar.f2049c = androidPackageName;
            aVar.f2050d = booleanValue;
            aVar.f2051e = androidMinimumVersion;
        }
        if (pigeonActionCodeSettings.getIOSBundleId() != null) {
            aVar.f2048b = pigeonActionCodeSettings.getIOSBundleId();
        }
        if (aVar.f2047a != null) {
            return new b8.c(aVar);
        }
        throw new IllegalArgumentException("Cannot build ActionCodeSettings with null URL. Call #setUrl(String) before calling build()");
    }

    public static b8.f getCredential(Map<String, Object> map) {
        String str;
        String str2;
        String str3;
        String str4;
        if (map.get("token") != null) {
            b8.f fVar = FlutterFirebaseAuthPlugin.authCredentials.get(Integer.valueOf(((Integer) map.get("token")).intValue()));
            if (fVar != null) {
                return fVar;
            }
            throw FlutterFirebaseAuthPluginException.invalidCredential();
        }
        Object obj = map.get(Constants.SIGN_IN_METHOD);
        Objects.requireNonNull(obj);
        String str5 = (String) obj;
        str = (String) map.get(Constants.SECRET);
        str2 = (String) map.get(Constants.ID_TOKEN);
        str3 = (String) map.get(Constants.ACCESS_TOKEN);
        str4 = (String) map.get(Constants.RAW_NONCE);
        switch (str5) {
            case "twitter.com":
                Objects.requireNonNull(str3);
                Objects.requireNonNull(str);
                return new n0(str3, str);
            case "playgames.google.com":
                Object obj2 = map.get(Constants.SERVER_AUTH_CODE);
                Objects.requireNonNull(obj2);
                return new i0((String) obj2);
            case "google.com":
                return new b8.u(str2, str3);
            case "facebook.com":
                Objects.requireNonNull(str3);
                return new b8.i(str3);
            case "oauth":
                Object obj3 = map.get(Constants.PROVIDER_ID);
                Objects.requireNonNull(obj3);
                String str6 = (String) obj3;
                m6.j.e(str6);
                String str7 = str3 != null ? str3 : null;
                Objects.requireNonNull(str2);
                String str8 = str4 == null ? null : str4;
                m6.j.f("Must specify a non-empty providerId", str6);
                if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str7)) {
                    throw new IllegalArgumentException("Must specify an idToken or an accessToken.");
                }
                return new c1(str6, str2, str7, null, null, null, str8);
            case "phone":
                Object obj4 = map.get(Constants.VERIFICATION_ID);
                Objects.requireNonNull(obj4);
                Object obj5 = map.get(Constants.SMS_CODE);
                Objects.requireNonNull(obj5);
                return c0.G((String) obj4, (String) obj5);
            case "password":
                Object obj6 = map.get(Constants.EMAIL);
                Objects.requireNonNull(obj6);
                String str9 = (String) obj6;
                Objects.requireNonNull(str);
                m6.j.e(str9);
                m6.j.e(str);
                return new b8.h(str9, str, null, null, false);
            case "github.com":
                Objects.requireNonNull(str3);
                return new b8.t(str3);
            case "emailLink":
                Object obj7 = map.get(Constants.EMAIL);
                Objects.requireNonNull(obj7);
                Object obj8 = map.get("emailLink");
                Objects.requireNonNull(obj8);
                return va.a.c((String) obj7, (String) obj8);
            default:
                return null;
        }
    }

    public static List<Object> manuallyToList(GeneratedAndroidFirebaseAuth.PigeonUserDetails pigeonUserDetails) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(pigeonUserDetails.getUserInfo().toList());
        arrayList.add(pigeonUserDetails.getProviderData());
        return arrayList;
    }

    public static List<List<Object>> multiFactorInfoToMap(List<b8.x> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<GeneratedAndroidFirebaseAuth.PigeonMultiFactorInfo> it = multiFactorInfoToPigeon(list).iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().toList());
        }
        return arrayList;
    }

    public static List<GeneratedAndroidFirebaseAuth.PigeonMultiFactorInfo> multiFactorInfoToPigeon(List<b8.x> list) {
        ArrayList arrayList = new ArrayList();
        for (b8.x xVar : list) {
            arrayList.add((xVar instanceof h0 ? new GeneratedAndroidFirebaseAuth.PigeonMultiFactorInfo.Builder().setPhoneNumber(((h0) xVar).f2088d) : new GeneratedAndroidFirebaseAuth.PigeonMultiFactorInfo.Builder()).setDisplayName(xVar.o()).setEnrollmentTimestamp(Double.valueOf(xVar.D())).setUid(xVar.a()).setFactorId(xVar.E()).build());
        }
        return arrayList;
    }

    public static GeneratedAndroidFirebaseAuth.PigeonActionCodeInfo parseActionCodeResult(b8.b bVar) {
        GeneratedAndroidFirebaseAuth.ActionCodeInfoOperation actionCodeInfoOperation;
        n7.f b10;
        GeneratedAndroidFirebaseAuth.PigeonActionCodeInfo.Builder builder = new GeneratedAndroidFirebaseAuth.PigeonActionCodeInfo.Builder();
        GeneratedAndroidFirebaseAuth.PigeonActionCodeInfoData.Builder builder2 = new GeneratedAndroidFirebaseAuth.PigeonActionCodeInfoData.Builder();
        int a10 = bVar.a();
        if (a10 == 0) {
            actionCodeInfoOperation = GeneratedAndroidFirebaseAuth.ActionCodeInfoOperation.PASSWORD_RESET;
        } else if (a10 == 1) {
            actionCodeInfoOperation = GeneratedAndroidFirebaseAuth.ActionCodeInfoOperation.VERIFY_EMAIL;
        } else if (a10 == 2) {
            actionCodeInfoOperation = GeneratedAndroidFirebaseAuth.ActionCodeInfoOperation.RECOVER_EMAIL;
        } else if (a10 == 4) {
            actionCodeInfoOperation = GeneratedAndroidFirebaseAuth.ActionCodeInfoOperation.EMAIL_SIGN_IN;
        } else {
            if (a10 != 5) {
                if (a10 == 6) {
                    actionCodeInfoOperation = GeneratedAndroidFirebaseAuth.ActionCodeInfoOperation.REVERT_SECOND_FACTOR_ADDITION;
                }
                b10 = bVar.b();
                if ((b10 == null && a10 == 1) || a10 == 0) {
                    builder2.setEmail(b10.b());
                } else if (a10 != 2 || a10 == 5) {
                    Objects.requireNonNull(b10);
                    b8.a aVar = (b8.a) b10;
                    builder2.setEmail(aVar.f11287a);
                    builder2.setPreviousEmail(aVar.c());
                }
                builder.setData(builder2.build());
                return builder.build();
            }
            actionCodeInfoOperation = GeneratedAndroidFirebaseAuth.ActionCodeInfoOperation.VERIFY_AND_CHANGE_EMAIL;
        }
        builder.setOperation(actionCodeInfoOperation);
        b10 = bVar.b();
        if (b10 == null) {
        }
        if (a10 != 2) {
        }
        Objects.requireNonNull(b10);
        b8.a aVar2 = (b8.a) b10;
        builder2.setEmail(aVar2.f11287a);
        builder2.setPreviousEmail(aVar2.c());
        builder.setData(builder2.build());
        return builder.build();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static GeneratedAndroidFirebaseAuth.PigeonAdditionalUserInfo parseAdditionalUserInfo(b8.e eVar) {
        r.b bVar;
        String str;
        String str2 = null;
        if (eVar == null) {
            return null;
        }
        GeneratedAndroidFirebaseAuth.PigeonAdditionalUserInfo.Builder builder = new GeneratedAndroidFirebaseAuth.PigeonAdditionalUserInfo.Builder();
        i1 i1Var = (i1) eVar;
        builder.setIsNewUser(Boolean.valueOf(i1Var.f2467d));
        builder.setProfile(i1Var.f2466c);
        builder.setProviderId(i1Var.f2464a);
        if (!Constants.SIGN_IN_METHOD_GITHUB.equals(i1Var.f2464a)) {
            if (Constants.SIGN_IN_METHOD_TWITTER.equals(i1Var.f2464a)) {
                bVar = i1Var.f2466c;
                str = "screen_name";
            }
            builder.setUsername(str2);
            return builder.build();
        }
        bVar = i1Var.f2466c;
        str = "login";
        str2 = (String) bVar.getOrDefault(str, null);
        builder.setUsername(str2);
        return builder.build();
    }

    public static GeneratedAndroidFirebaseAuth.PigeonAuthCredential parseAuthCredential(b8.f fVar) {
        if (fVar == null) {
            return null;
        }
        int hashCode = fVar.hashCode();
        FlutterFirebaseAuthPlugin.authCredentials.put(Integer.valueOf(hashCode), fVar);
        GeneratedAndroidFirebaseAuth.PigeonAuthCredential.Builder builder = new GeneratedAndroidFirebaseAuth.PigeonAuthCredential.Builder();
        builder.setProviderId(fVar.D());
        builder.setSignInMethod(fVar.E());
        builder.setNativeId(Long.valueOf(hashCode));
        if (fVar instanceof b8.a0) {
            builder.setAccessToken(((b8.a0) fVar).G());
        }
        return builder.build();
    }

    public static GeneratedAndroidFirebaseAuth.PigeonUserCredential parseAuthResult(b8.g gVar) {
        GeneratedAndroidFirebaseAuth.PigeonUserCredential.Builder builder = new GeneratedAndroidFirebaseAuth.PigeonUserCredential.Builder();
        builder.setAdditionalUserInfo(parseAdditionalUserInfo(gVar.s()));
        builder.setCredential(parseAuthCredential(gVar.t()));
        builder.setUser(parseFirebaseUser(gVar.z()));
        return builder.build();
    }

    public static GeneratedAndroidFirebaseAuth.PigeonUserDetails parseFirebaseUser(r rVar) {
        if (rVar == null) {
            return null;
        }
        GeneratedAndroidFirebaseAuth.PigeonUserDetails.Builder builder = new GeneratedAndroidFirebaseAuth.PigeonUserDetails.Builder();
        GeneratedAndroidFirebaseAuth.PigeonUserInfo.Builder builder2 = new GeneratedAndroidFirebaseAuth.PigeonUserInfo.Builder();
        builder2.setDisplayName(rVar.o());
        builder2.setEmail(rVar.A());
        builder2.setIsEmailVerified(Boolean.valueOf(((c8.i) rVar).f2454b.f2436p));
        builder2.setIsAnonymous(Boolean.valueOf(rVar.H()));
        if (rVar.D() != null) {
            builder2.setCreationTimestamp(Long.valueOf(rVar.D().f2473b));
            builder2.setLastSignInTimestamp(Long.valueOf(rVar.D().f2472a));
        }
        builder2.setPhoneNumber(rVar.m());
        builder2.setPhotoUrl(parsePhotoUrl(rVar.h()));
        builder2.setUid(rVar.a());
        builder2.setTenantId(rVar.G());
        builder.setUserInfo(builder2.build());
        builder.setProviderData(parseUserInfoList(rVar.F()));
        return builder.build();
    }

    private static String parsePhotoUrl(Uri uri) {
        if (uri == null) {
            return null;
        }
        String uri2 = uri.toString();
        if ("".equals(uri2)) {
            return null;
        }
        return uri2;
    }

    public static GeneratedAndroidFirebaseAuth.PigeonIdTokenResult parseTokenResult(b8.s sVar) {
        GeneratedAndroidFirebaseAuth.PigeonIdTokenResult.Builder builder = new GeneratedAndroidFirebaseAuth.PigeonIdTokenResult.Builder();
        builder.setToken(sVar.f2137a);
        Map map = (Map) sVar.f2138b.get("firebase");
        builder.setSignInProvider(map != null ? (String) map.get("sign_in_provider") : null);
        builder.setAuthTimestamp(Long.valueOf(sVar.a("auth_time") * 1000));
        builder.setExpirationTimestamp(Long.valueOf(sVar.a("exp") * 1000));
        builder.setIssuedAtTimestamp(Long.valueOf(sVar.a("iat") * 1000));
        builder.setClaims(sVar.f2138b);
        Map map2 = (Map) sVar.f2138b.get("firebase");
        builder.setSignInSecondFactor(map2 != null ? (String) map2.get("sign_in_second_factor") : null);
        return builder.build();
    }

    private static List<Map<Object, Object>> parseUserInfoList(List<? extends o0> list) {
        ArrayList arrayList = new ArrayList();
        if (list == null) {
            return null;
        }
        Iterator it = new ArrayList(list).iterator();
        while (it.hasNext()) {
            o0 o0Var = (o0) it.next();
            if (o0Var != null && !"firebase".equals(o0Var.q())) {
                arrayList.add(parseUserInfoToMap(o0Var));
            }
        }
        return arrayList;
    }

    private static Map<Object, Object> parseUserInfoToMap(o0 o0Var) {
        HashMap hashMap = new HashMap();
        hashMap.put("displayName", o0Var.o());
        hashMap.put(Constants.EMAIL, o0Var.A());
        hashMap.put("isEmailVerified", Boolean.valueOf(o0Var.k()));
        hashMap.put("phoneNumber", o0Var.m());
        hashMap.put("photoUrl", parsePhotoUrl(o0Var.h()));
        hashMap.put("uid", o0Var.a() == null ? "" : o0Var.a());
        hashMap.put(Constants.PROVIDER_ID, o0Var.q());
        hashMap.put("isAnonymous", Boolean.FALSE);
        return hashMap;
    }
}
