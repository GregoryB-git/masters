package io.flutter.plugins.firebase.auth;

import android.net.Uri;
import android.text.TextUtils;
import b8.a0;
import b8.c;
import b8.c.a;
import b8.c0;
import b8.c1;
import b8.g;
import b8.h0;
import b8.i0;
import b8.n0;
import b8.o0;
import b8.r;
import b8.s;
import b8.t;
import b8.u;
import b8.x;
import c8.i1;
import c8.k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import m6.j;

public class PigeonParser
{
  public static c getActionCodeSettings(GeneratedAndroidFirebaseAuth.PigeonActionCodeSettings paramPigeonActionCodeSettings)
  {
    c.a locala = new c.a();
    a = paramPigeonActionCodeSettings.getUrl();
    if (paramPigeonActionCodeSettings.getDynamicLinkDomain() != null) {
      g = paramPigeonActionCodeSettings.getDynamicLinkDomain();
    }
    if (paramPigeonActionCodeSettings.getLinkDomain() != null) {
      h = paramPigeonActionCodeSettings.getLinkDomain();
    }
    f = paramPigeonActionCodeSettings.getHandleCodeInApp().booleanValue();
    if (paramPigeonActionCodeSettings.getAndroidPackageName() != null)
    {
      String str1 = paramPigeonActionCodeSettings.getAndroidPackageName();
      boolean bool = paramPigeonActionCodeSettings.getAndroidInstallApp().booleanValue();
      String str2 = paramPigeonActionCodeSettings.getAndroidMinimumVersion();
      c = str1;
      d = bool;
      e = str2;
    }
    if (paramPigeonActionCodeSettings.getIOSBundleId() != null) {
      b = paramPigeonActionCodeSettings.getIOSBundleId();
    }
    if (a != null) {
      return new c(locala);
    }
    throw new IllegalArgumentException("Cannot build ActionCodeSettings with null URL. Call #setUrl(String) before calling build()");
  }
  
  public static b8.f getCredential(Map<String, Object> paramMap)
  {
    if (paramMap.get("token") != null)
    {
      i = ((Integer)paramMap.get("token")).intValue();
      paramMap = (b8.f)FlutterFirebaseAuthPlugin.authCredentials.get(Integer.valueOf(i));
      if (paramMap != null) {
        return paramMap;
      }
      throw FlutterFirebaseAuthPluginException.invalidCredential();
    }
    Object localObject = paramMap.get("signInMethod");
    Objects.requireNonNull(localObject);
    String str1 = (String)localObject;
    String str2 = (String)paramMap.get("secret");
    String str3 = (String)paramMap.get("idToken");
    String str4 = (String)paramMap.get("accessToken");
    localObject = (String)paramMap.get("rawNonce");
    int i = -1;
    switch (str1.hashCode())
    {
    default: 
      break;
    case 2120171958: 
      if (str1.equals("emailLink")) {
        i = 8;
      }
      break;
    case 1985010934: 
      if (str1.equals("github.com")) {
        i = 7;
      }
      break;
    case 1216985755: 
      if (str1.equals("password")) {
        i = 6;
      }
      break;
    case 106642798: 
      if (str1.equals("phone")) {
        i = 5;
      }
      break;
    case 105516695: 
      if (str1.equals("oauth")) {
        i = 4;
      }
      break;
    case -364826023: 
      if (str1.equals("facebook.com")) {
        i = 3;
      }
      break;
    case -1536293812: 
      if (str1.equals("google.com")) {
        i = 2;
      }
      break;
    case -1551433523: 
      if (str1.equals("playgames.google.com")) {
        i = 1;
      }
      break;
    case -1830313082: 
      if (str1.equals("twitter.com")) {
        i = 0;
      }
      break;
    }
    switch (i)
    {
    default: 
      return null;
    case 8: 
      localObject = paramMap.get("email");
      Objects.requireNonNull(localObject);
      localObject = (String)localObject;
      paramMap = paramMap.get("emailLink");
      Objects.requireNonNull(paramMap);
      return va.a.c((String)localObject, (String)paramMap);
    case 7: 
      Objects.requireNonNull(str4);
      return new t(str4);
    case 6: 
      paramMap = paramMap.get("email");
      Objects.requireNonNull(paramMap);
      paramMap = (String)paramMap;
      Objects.requireNonNull(str2);
      j.e(paramMap);
      j.e(str2);
      return new b8.h(paramMap, str2, null, null, false);
    case 5: 
      localObject = paramMap.get("verificationId");
      Objects.requireNonNull(localObject);
      localObject = (String)localObject;
      paramMap = paramMap.get("smsCode");
      Objects.requireNonNull(paramMap);
      return c0.G((String)localObject, (String)paramMap);
    case 4: 
      paramMap = paramMap.get("providerId");
      Objects.requireNonNull(paramMap);
      str2 = (String)paramMap;
      j.e(str2);
      if (str4 != null) {
        paramMap = str4;
      } else {
        paramMap = null;
      }
      Objects.requireNonNull(str3);
      if (localObject == null) {
        localObject = null;
      }
      j.f("Must specify a non-empty providerId", str2);
      if ((TextUtils.isEmpty(str3)) && (TextUtils.isEmpty(paramMap))) {
        throw new IllegalArgumentException("Must specify an idToken or an accessToken.");
      }
      return new c1(str2, str3, paramMap, null, null, null, (String)localObject);
    case 3: 
      Objects.requireNonNull(str4);
      return new b8.i(str4);
    case 2: 
      return new u(str3, str4);
    case 1: 
      paramMap = paramMap.get("serverAuthCode");
      Objects.requireNonNull(paramMap);
      return new i0((String)paramMap);
    }
    Objects.requireNonNull(str4);
    Objects.requireNonNull(str2);
    return new n0(str4, str2);
  }
  
  public static List<Object> manuallyToList(GeneratedAndroidFirebaseAuth.PigeonUserDetails paramPigeonUserDetails)
  {
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(paramPigeonUserDetails.getUserInfo().toList());
    localArrayList.add(paramPigeonUserDetails.getProviderData());
    return localArrayList;
  }
  
  public static List<List<Object>> multiFactorInfoToMap(List<x> paramList)
  {
    ArrayList localArrayList = new ArrayList();
    paramList = multiFactorInfoToPigeon(paramList).iterator();
    while (paramList.hasNext()) {
      localArrayList.add(((GeneratedAndroidFirebaseAuth.PigeonMultiFactorInfo)paramList.next()).toList());
    }
    return localArrayList;
  }
  
  public static List<GeneratedAndroidFirebaseAuth.PigeonMultiFactorInfo> multiFactorInfoToPigeon(List<x> paramList)
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      x localx = (x)localIterator.next();
      if ((localx instanceof h0)) {
        paramList = new GeneratedAndroidFirebaseAuth.PigeonMultiFactorInfo.Builder().setPhoneNumber(d);
      } else {
        paramList = new GeneratedAndroidFirebaseAuth.PigeonMultiFactorInfo.Builder();
      }
      localArrayList.add(paramList.setDisplayName(localx.o()).setEnrollmentTimestamp(Double.valueOf(localx.D())).setUid(localx.a()).setFactorId(localx.E()).build());
    }
    return localArrayList;
  }
  
  public static GeneratedAndroidFirebaseAuth.PigeonActionCodeInfo parseActionCodeResult(b8.b paramb)
  {
    GeneratedAndroidFirebaseAuth.PigeonActionCodeInfo.Builder localBuilder = new GeneratedAndroidFirebaseAuth.PigeonActionCodeInfo.Builder();
    GeneratedAndroidFirebaseAuth.PigeonActionCodeInfoData.Builder localBuilder1 = new GeneratedAndroidFirebaseAuth.PigeonActionCodeInfoData.Builder();
    int i = paramb.a();
    GeneratedAndroidFirebaseAuth.ActionCodeInfoOperation localActionCodeInfoOperation;
    if (i != 0)
    {
      if (i != 1)
      {
        if (i != 2)
        {
          if (i != 4)
          {
            if (i != 5)
            {
              if (i != 6) {
                break label108;
              }
              localActionCodeInfoOperation = GeneratedAndroidFirebaseAuth.ActionCodeInfoOperation.REVERT_SECOND_FACTOR_ADDITION;
            }
            else
            {
              localActionCodeInfoOperation = GeneratedAndroidFirebaseAuth.ActionCodeInfoOperation.VERIFY_AND_CHANGE_EMAIL;
            }
          }
          else {
            localActionCodeInfoOperation = GeneratedAndroidFirebaseAuth.ActionCodeInfoOperation.EMAIL_SIGN_IN;
          }
        }
        else {
          localActionCodeInfoOperation = GeneratedAndroidFirebaseAuth.ActionCodeInfoOperation.RECOVER_EMAIL;
        }
      }
      else {
        localActionCodeInfoOperation = GeneratedAndroidFirebaseAuth.ActionCodeInfoOperation.VERIFY_EMAIL;
      }
    }
    else {
      localActionCodeInfoOperation = GeneratedAndroidFirebaseAuth.ActionCodeInfoOperation.PASSWORD_RESET;
    }
    localBuilder.setOperation(localActionCodeInfoOperation);
    label108:
    paramb = paramb.b();
    if (((paramb != null) && (i == 1)) || (i == 0))
    {
      localBuilder1.setEmail(paramb.b());
    }
    else if ((i == 2) || (i == 5))
    {
      Objects.requireNonNull(paramb);
      paramb = (b8.a)paramb;
      localBuilder1.setEmail(a);
      localBuilder1.setPreviousEmail(paramb.c());
    }
    localBuilder.setData(localBuilder1.build());
    return localBuilder.build();
  }
  
  private static GeneratedAndroidFirebaseAuth.PigeonAdditionalUserInfo parseAdditionalUserInfo(b8.e parame)
  {
    r.b localb = null;
    if (parame == null) {
      return null;
    }
    GeneratedAndroidFirebaseAuth.PigeonAdditionalUserInfo.Builder localBuilder = new GeneratedAndroidFirebaseAuth.PigeonAdditionalUserInfo.Builder();
    i1 locali1 = (i1)parame;
    localBuilder.setIsNewUser(Boolean.valueOf(d));
    localBuilder.setProfile(c);
    localBuilder.setProviderId(a);
    if ("github.com".equals(a))
    {
      localb = c;
      parame = "login";
    }
    else
    {
      parame = localb;
      if (!"twitter.com".equals(a)) {
        break label108;
      }
      localb = c;
      parame = "screen_name";
    }
    parame = (String)localb.getOrDefault(parame, null);
    label108:
    localBuilder.setUsername(parame);
    return localBuilder.build();
  }
  
  public static GeneratedAndroidFirebaseAuth.PigeonAuthCredential parseAuthCredential(b8.f paramf)
  {
    if (paramf == null) {
      return null;
    }
    int i = paramf.hashCode();
    FlutterFirebaseAuthPlugin.authCredentials.put(Integer.valueOf(i), paramf);
    GeneratedAndroidFirebaseAuth.PigeonAuthCredential.Builder localBuilder = new GeneratedAndroidFirebaseAuth.PigeonAuthCredential.Builder();
    localBuilder.setProviderId(paramf.D());
    localBuilder.setSignInMethod(paramf.E());
    localBuilder.setNativeId(Long.valueOf(i));
    if ((paramf instanceof a0)) {
      localBuilder.setAccessToken(((a0)paramf).G());
    }
    return localBuilder.build();
  }
  
  public static GeneratedAndroidFirebaseAuth.PigeonUserCredential parseAuthResult(g paramg)
  {
    GeneratedAndroidFirebaseAuth.PigeonUserCredential.Builder localBuilder = new GeneratedAndroidFirebaseAuth.PigeonUserCredential.Builder();
    localBuilder.setAdditionalUserInfo(parseAdditionalUserInfo(paramg.s()));
    localBuilder.setCredential(parseAuthCredential(paramg.t()));
    localBuilder.setUser(parseFirebaseUser(paramg.z()));
    return localBuilder.build();
  }
  
  public static GeneratedAndroidFirebaseAuth.PigeonUserDetails parseFirebaseUser(r paramr)
  {
    if (paramr == null) {
      return null;
    }
    GeneratedAndroidFirebaseAuth.PigeonUserDetails.Builder localBuilder = new GeneratedAndroidFirebaseAuth.PigeonUserDetails.Builder();
    GeneratedAndroidFirebaseAuth.PigeonUserInfo.Builder localBuilder1 = new GeneratedAndroidFirebaseAuth.PigeonUserInfo.Builder();
    localBuilder1.setDisplayName(paramr.o());
    localBuilder1.setEmail(paramr.A());
    localBuilder1.setIsEmailVerified(Boolean.valueOf(b.p));
    localBuilder1.setIsAnonymous(Boolean.valueOf(paramr.H()));
    if (paramr.D() != null)
    {
      localBuilder1.setCreationTimestamp(Long.valueOf(Db));
      localBuilder1.setLastSignInTimestamp(Long.valueOf(Da));
    }
    localBuilder1.setPhoneNumber(paramr.m());
    localBuilder1.setPhotoUrl(parsePhotoUrl(paramr.h()));
    localBuilder1.setUid(paramr.a());
    localBuilder1.setTenantId(paramr.G());
    localBuilder.setUserInfo(localBuilder1.build());
    localBuilder.setProviderData(parseUserInfoList(paramr.F()));
    return localBuilder.build();
  }
  
  private static String parsePhotoUrl(Uri paramUri)
  {
    Object localObject = null;
    if (paramUri == null) {
      return null;
    }
    paramUri = paramUri.toString();
    if ("".equals(paramUri)) {
      paramUri = (Uri)localObject;
    }
    return paramUri;
  }
  
  public static GeneratedAndroidFirebaseAuth.PigeonIdTokenResult parseTokenResult(s params)
  {
    GeneratedAndroidFirebaseAuth.PigeonIdTokenResult.Builder localBuilder = new GeneratedAndroidFirebaseAuth.PigeonIdTokenResult.Builder();
    localBuilder.setToken(a);
    Object localObject1 = (Map)b.get("firebase");
    Object localObject2 = null;
    if (localObject1 != null) {
      localObject1 = (String)((Map)localObject1).get("sign_in_provider");
    } else {
      localObject1 = null;
    }
    localBuilder.setSignInProvider((String)localObject1);
    localBuilder.setAuthTimestamp(Long.valueOf(params.a("auth_time") * 1000L));
    localBuilder.setExpirationTimestamp(Long.valueOf(params.a("exp") * 1000L));
    localBuilder.setIssuedAtTimestamp(Long.valueOf(params.a("iat") * 1000L));
    localBuilder.setClaims(b);
    localObject1 = (Map)b.get("firebase");
    params = (s)localObject2;
    if (localObject1 != null) {
      params = (String)((Map)localObject1).get("sign_in_second_factor");
    }
    localBuilder.setSignInSecondFactor(params);
    return localBuilder.build();
  }
  
  private static List<Map<Object, Object>> parseUserInfoList(List<? extends o0> paramList)
  {
    ArrayList localArrayList = new ArrayList();
    if (paramList == null) {
      return null;
    }
    paramList = new ArrayList(paramList).iterator();
    while (paramList.hasNext())
    {
      o0 localo0 = (o0)paramList.next();
      if ((localo0 != null) && (!"firebase".equals(localo0.q()))) {
        localArrayList.add(parseUserInfoToMap(localo0));
      }
    }
    return localArrayList;
  }
  
  private static Map<Object, Object> parseUserInfoToMap(o0 paramo0)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("displayName", paramo0.o());
    localHashMap.put("email", paramo0.A());
    localHashMap.put("isEmailVerified", Boolean.valueOf(paramo0.k()));
    localHashMap.put("phoneNumber", paramo0.m());
    localHashMap.put("photoUrl", parsePhotoUrl(paramo0.h()));
    String str;
    if (paramo0.a() == null) {
      str = "";
    } else {
      str = paramo0.a();
    }
    localHashMap.put("uid", str);
    localHashMap.put("providerId", paramo0.q());
    localHashMap.put("isAnonymous", Boolean.FALSE);
    return localHashMap;
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.firebase.auth.PigeonParser
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */