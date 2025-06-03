package com.google.android.gms.internal.firebase_auth_api;

import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import b8.h0;
import b8.l;
import b8.l0;
import b8.o;
import b8.p;
import b8.q;
import b8.r;
import b8.x;
import c8.n;
import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.FirebaseAuth;
import g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import u7.c;
import u7.h;
import z9.a;

public final class zzadr
{
  private static final SparseArray<Pair<String, String>> zza;
  
  static
  {
    SparseArray localSparseArray = new SparseArray();
    zza = localSparseArray;
    localSparseArray.put(17000, new Pair("ERROR_INVALID_CUSTOM_TOKEN", "The custom token format is incorrect. Please check the documentation."));
    localSparseArray.put(17002, new Pair("ERROR_CUSTOM_TOKEN_MISMATCH", "The custom token corresponds to a different audience."));
    localSparseArray.put(17004, new Pair("ERROR_INVALID_CREDENTIAL", "The supplied auth credential is incorrect, malformed or has expired."));
    localSparseArray.put(17008, new Pair("ERROR_INVALID_EMAIL", "The email address is badly formatted."));
    localSparseArray.put(17009, new Pair("ERROR_WRONG_PASSWORD", "The password is invalid or the user does not have a password."));
    localSparseArray.put(17024, new Pair("ERROR_USER_MISMATCH", "The supplied credentials do not correspond to the previously signed in user."));
    localSparseArray.put(17014, new Pair("ERROR_REQUIRES_RECENT_LOGIN", "This operation is sensitive and requires recent authentication. Log in again before retrying this request."));
    localSparseArray.put(17012, new Pair("ERROR_ACCOUNT_EXISTS_WITH_DIFFERENT_CREDENTIAL", "An account already exists with the same email address but different sign-in credentials. Sign in using a provider associated with this email address."));
    localSparseArray.put(17007, new Pair("ERROR_EMAIL_ALREADY_IN_USE", "The email address is already in use by another account."));
    localSparseArray.put(17025, new Pair("ERROR_CREDENTIAL_ALREADY_IN_USE", "This credential is already associated with a different user account."));
    localSparseArray.put(17005, new Pair("ERROR_USER_DISABLED", "The user account has been disabled by an administrator."));
    localSparseArray.put(17021, new Pair("ERROR_USER_TOKEN_EXPIRED", "The user's credential is no longer valid. The user must sign in again."));
    localSparseArray.put(17011, new Pair("ERROR_USER_NOT_FOUND", "There is no user record corresponding to this identifier. The user may have been deleted."));
    localSparseArray.put(17017, new Pair("ERROR_INVALID_USER_TOKEN", "This user's credential isn't valid for this project. This can happen if the user's token has been tampered with, or if the user isn't for the project associated with this API key."));
    localSparseArray.put(17006, new Pair("ERROR_OPERATION_NOT_ALLOWED", "This operation is not allowed. This may be because the given sign-in provider is disabled for this Firebase project. Enable it in the Firebase console, under the sign-in method tab of the Auth section."));
    localSparseArray.put(17026, new Pair("ERROR_WEAK_PASSWORD", "The given password is invalid."));
    localSparseArray.put(17029, new Pair("ERROR_EXPIRED_ACTION_CODE", "The out of band code has expired."));
    localSparseArray.put(17030, new Pair("ERROR_INVALID_ACTION_CODE", "The out of band code is invalid. This can happen if the code is malformed, expired, or has already been used."));
    localSparseArray.put(17031, new Pair("ERROR_INVALID_MESSAGE_PAYLOAD", "The email template corresponding to this action contains invalid characters in its message. Please fix by going to the Auth email templates section in the Firebase Console."));
    localSparseArray.put(17033, new Pair("ERROR_INVALID_RECIPIENT_EMAIL", "The email corresponding to this action failed to send as the provided recipient email address is invalid."));
    localSparseArray.put(17032, new Pair("ERROR_INVALID_SENDER", "The email template corresponding to this action contains an invalid sender email or name. Please fix by going to the Auth email templates section in the Firebase Console."));
    localSparseArray.put(17034, new Pair("ERROR_MISSING_EMAIL", "An email address must be provided."));
    localSparseArray.put(17035, new Pair("ERROR_MISSING_PASSWORD", "A password must be provided."));
    localSparseArray.put(17041, new Pair("ERROR_MISSING_PHONE_NUMBER", "To send verification codes, provide a phone number for the recipient."));
    localSparseArray.put(17042, new Pair("ERROR_INVALID_PHONE_NUMBER", "The format of the phone number provided is incorrect. Please enter the phone number in a format that can be parsed into E.164 format. E.164 phone numbers are written in the format [+][country code][subscriber number including area code]."));
    localSparseArray.put(17043, new Pair("ERROR_MISSING_VERIFICATION_CODE", "The verification code from SMS/TOTP is empty. Please enter the verification code."));
    localSparseArray.put(17044, new Pair("ERROR_INVALID_VERIFICATION_CODE", "The verification code from SMS/TOTP is invalid. Please check and enter the correct verification code again."));
    localSparseArray.put(17045, new Pair("ERROR_MISSING_VERIFICATION_ID", "The Phone Auth Credential was created with an empty verification ID."));
    localSparseArray.put(17046, new Pair("ERROR_INVALID_VERIFICATION_ID", "The verification ID used to create the phone auth credential is invalid."));
    localSparseArray.put(17049, new Pair("ERROR_RETRY_PHONE_AUTH", "An error occurred during authentication using the PhoneAuthCredential. Please retry authentication."));
    localSparseArray.put(17051, new Pair("ERROR_SESSION_EXPIRED", "The sms code has expired. Please re-send the verification code to try again."));
    localSparseArray.put(17052, new Pair("ERROR_QUOTA_EXCEEDED", "This project's quota for this operation has been exceeded."));
    localSparseArray.put(17028, new Pair("ERROR_APP_NOT_AUTHORIZED", "This app is not authorized to use Firebase Authentication. Please verify that the correct package name, SHA-1, and SHA-256 are configured in the Firebase Console."));
    localSparseArray.put(17063, new Pair("ERROR_API_NOT_AVAILABLE_WITHOUT_GOOGLE_PLAY", "The API that you are calling is not available on devices without Google Play services."));
    localSparseArray.put(17062, new Pair("ERROR_WEB_INTERNAL_ERROR", "There was an internal error in the web widget."));
    localSparseArray.put(17064, new Pair("ERROR_INVALID_CERT_HASH", "There was an error while trying to get your package certificate hash."));
    localSparseArray.put(17065, new Pair("ERROR_WEB_STORAGE_UNSUPPORTED", "This browser is not supported or 3rd party cookies and data may be disabled."));
    localSparseArray.put(17038, new Pair("ERROR_UNAUTHORIZED_DOMAIN", "The configured custom domain is not allowlisted. Please allowlist the domain in the Firebase console -> Authentication -> Settings -> Authorized domains tab."));
    localSparseArray.put(17040, new Pair("ERROR_MISSING_CONTINUE_URI", "A continue URL must be provided in the request."));
    localSparseArray.put(17068, new Pair("ERROR_DYNAMIC_LINK_NOT_ACTIVATED", "Please activate Dynamic Links in the Firebase Console and agree to the terms and conditions."));
    localSparseArray.put(17071, new Pair("ERROR_INVALID_PROVIDER_ID", "The provider ID provided for the attempted web operation is invalid."));
    localSparseArray.put(17057, new Pair("ERROR_WEB_CONTEXT_ALREADY_PRESENTED", "A headful operation is already in progress. Please wait for that to finish."));
    localSparseArray.put(17058, new Pair("ERROR_WEB_CONTEXT_CANCELED", "The web operation was canceled by the user."));
    localSparseArray.put(17072, new Pair("ERROR_TENANT_ID_MISMATCH", "The provided tenant ID does not match the Auth instance's tenant ID."));
    localSparseArray.put(17073, new Pair("ERROR_UNSUPPORTED_TENANT_OPERATION", "This operation is not supported in a multi-tenant context."));
    localSparseArray.put(17074, new Pair("ERROR_INVALID_DYNAMIC_LINK_DOMAIN", "The provided dynamic link domain is not configured or authorized for the current project."));
    localSparseArray.put(17214, new Pair("ERROR_INVALID_HOSTING_LINK_DOMAIN", "The provided hosting link domain is not configured in Firebase Hosting or is not owned by the current project. This cannot be a default hosting domain (web.app or firebaseapp.com). "));
    localSparseArray.put(17075, new Pair("ERROR_REJECTED_CREDENTIAL", "The request contains malformed or mismatching credentials."));
    localSparseArray.put(17077, new Pair("ERROR_PHONE_NUMBER_NOT_FOUND", "The provided phone number does not match any of the second factor phone numbers associated with this user."));
    localSparseArray.put(17079, new Pair("ERROR_INVALID_TENANT_ID", "The Auth instance's tenant ID is invalid."));
    localSparseArray.put(17078, new Pair("ERROR_SECOND_FACTOR_REQUIRED", "Please complete a second factor challenge to finish signing into this account."));
    localSparseArray.put(17080, new Pair("ERROR_API_NOT_AVAILABLE", "The API that you are calling is not available."));
    localSparseArray.put(17081, new Pair("ERROR_MISSING_MULTI_FACTOR_SESSION", "The request is missing proof of first factor successful sign-in."));
    localSparseArray.put(17082, new Pair("ERROR_MISSING_MULTI_FACTOR_INFO", "No second factor identifier is provided."));
    localSparseArray.put(17083, new Pair("ERROR_INVALID_MULTI_FACTOR_SESSION", "The request does not contain a valid proof of first factor successful sign-in."));
    localSparseArray.put(17084, new Pair("ERROR_MULTI_FACTOR_INFO_NOT_FOUND", "The user does not have a second factor matching the identifier provided."));
    localSparseArray.put(17085, new Pair("ERROR_ADMIN_RESTRICTED_OPERATION", "This operation is restricted to administrators only."));
    localSparseArray.put(17086, new Pair("ERROR_UNVERIFIED_EMAIL", "This operation requires a verified email."));
    localSparseArray.put(17087, new Pair("ERROR_SECOND_FACTOR_ALREADY_ENROLLED", "The second factor is already enrolled on this account."));
    localSparseArray.put(17088, new Pair("ERROR_MAXIMUM_SECOND_FACTOR_COUNT_EXCEEDED", "The maximum allowed number of second factors on a user has been exceeded."));
    localSparseArray.put(17089, new Pair("ERROR_UNSUPPORTED_FIRST_FACTOR", "Enrolling a second factor or signing in with a multi-factor account requires sign-in with a supported first factor."));
    localSparseArray.put(17090, new Pair("ERROR_EMAIL_CHANGE_NEEDS_VERIFICATION", "Multi-factor users must always have a verified email."));
    localSparseArray.put(17091, new Pair("ERROR_INTERNAL_SUCCESS_SIGN_OUT", "This is an internal error code indicating that the operation was successful but the user needs to be signed out."));
    localSparseArray.put(17093, new Pair("ERROR_MISSING_CLIENT_IDENTIFIER", "This request is missing a valid app identifier, meaning that Play Integrity checks, and reCAPTCHA checks were unsuccessful. Please try again, or check the logcat for more details."));
    localSparseArray.put(17209, new Pair("ERROR_PASSKEY_ENROLLMENT_NOT_FOUND", "Cannot find the passkey linked to the current account."));
    localSparseArray.put(17210, new Pair("ERROR_INVALID_AUTHENTICATOR_RESPONSE", "The response from Credential Manager is either not parseable, missing required fields or has invalid values for certain fields."));
    localSparseArray.put(18002, new Pair("ERROR_ALTERNATE_CLIENT_IDENTIFIER_REQUIRED", "This request contains an app identifier which could not be verified. Please try again with a different identifier(like reCAPTCHA). Check the logcat for more details."));
    localSparseArray.put(17094, new Pair("ERROR_MISSING_OR_INVALID_NONCE", "The request does not contain a valid nonce. This can occur if the SHA-256 hash of the provided raw nonce does not match the hashed nonce in the ID token payload."));
    localSparseArray.put(18001, new Pair("ERROR_USER_CANCELLED", "The user did not grant your application the permissions it requested."));
    localSparseArray.put(17095, new Pair("ERROR_UNSUPPORTED_PASSTHROUGH_OPERATION", "This operation is not supported while in passthrough mode."));
    localSparseArray.put(17096, new Pair("ERROR_TOKEN_REFRESH_UNAVAILABLE", "No refresh token is available."));
    localSparseArray.put(17201, new Pair("ERROR_MISSING_RECAPTCHA_TOKEN", "The request is missing a reCAPTCHA token."));
    localSparseArray.put(17202, new Pair("ERROR_INVALID_RECAPTCHA_TOKEN", "The request contains an invalid reCAPTCHA token."));
    localSparseArray.put(17203, new Pair("ERROR_INVALID_RECAPTCHA_ACTION", "The request contains an invalid ReCAPTCHA action."));
    localSparseArray.put(17200, new Pair("ERROR_RECAPTCHA_NOT_ENABLED", "ReCAPTCHA is not enabled."));
    localSparseArray.put(17204, new Pair("ERROR_MISSING_CLIENT_TYPE", "The request is missing the ReCAPTCHA client type."));
    localSparseArray.put(17205, new Pair("ERROR_MISSING_RECAPTCHA_VERSION", "The request is missing the ReCAPTCHA version."));
    localSparseArray.put(17206, new Pair("ERROR_INVALID_RECAPTCHA_VERSION", "The request contains an invalid ReCAPTCHA version."));
    localSparseArray.put(17207, new Pair("ERROR_INVALID_REQ_TYPE", "The request is invalid. This can occur if input parameters are missing or malformed."));
    localSparseArray.put(17056, new Pair("ERROR_CAPTCHA_CHECK_FAILED", "The ReCAPTCHA assessment failed for this request."));
  }
  
  public static o zza(FirebaseAuth paramFirebaseAuth, com.google.android.gms.internal.firebase-auth-api.zzzs paramzzzs, r paramr)
  {
    zzw.zza(paramFirebaseAuth);
    zzw.zza(paramzzzs);
    Object localObject1 = (Pair)zza.get(17078);
    String str1 = (String)first;
    String str2 = (String)second;
    localObject1 = paramzzzs.zzc();
    ArrayList localArrayList1 = new ArrayList();
    localObject1 = ((List)localObject1).iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (x)((Iterator)localObject1).next();
      if ((localObject2 instanceof h0)) {
        localArrayList1.add((h0)localObject2);
      }
    }
    localObject1 = paramzzzs.zzc();
    ArrayList localArrayList2 = new ArrayList();
    Object localObject2 = ((List)localObject1).iterator();
    while (((Iterator)localObject2).hasNext())
    {
      localObject1 = (x)((Iterator)localObject2).next();
      if ((localObject1 instanceof l0)) {
        localArrayList2.add((l0)localObject1);
      }
    }
    localObject1 = paramzzzs.zzc();
    String str3 = paramzzzs.zzb();
    m6.j.i(localObject1);
    m6.j.e(str3);
    n localn = new n();
    c = new ArrayList();
    d = new ArrayList();
    Iterator localIterator = ((List)localObject1).iterator();
    while (localIterator.hasNext())
    {
      localObject1 = (x)localIterator.next();
      if ((localObject1 instanceof h0))
      {
        localObject2 = c;
        localObject1 = (h0)localObject1;
      }
      else
      {
        if (!(localObject1 instanceof l0)) {
          break label302;
        }
        localObject2 = d;
        localObject1 = (l0)localObject1;
      }
      ((List)localObject2).add(localObject1);
      continue;
      label302:
      throw new IllegalArgumentException(f.j("MultiFactorInfo must be either PhoneMultiFactorInfo or TotpMultiFactorInfo. The factorId of this MultiFactorInfo: ", ((x)localObject1).E()));
    }
    b = str3;
    paramFirebaseAuth = a;
    paramFirebaseAuth.a();
    return new o(str1, str2, new c8.m(localArrayList1, localn, b, paramzzzs.zza(), (c8.i)paramr, localArrayList2));
  }
  
  private static String zza(int paramInt)
  {
    Pair localPair = (Pair)zza.get(paramInt);
    if (localPair != null) {
      return (String)first;
    }
    return "INTERNAL_ERROR";
  }
  
  private static String zza(String paramString, Status paramStatus)
  {
    if (TextUtils.isEmpty(b)) {
      return paramString;
    }
    return String.format(g.d(paramString, " [ %s ]"), new Object[] { b });
  }
  
  public static h zza(Status paramStatus)
  {
    int i = a;
    String str = zza(zzb(i), paramStatus);
    if (i != 17020)
    {
      if (i != 17021)
      {
        if (i != 17051) {
          if (i == 17052) {}
        }
        switch (i)
        {
        default: 
          switch (i)
          {
          default: 
            switch (i)
            {
            default: 
              switch (i)
              {
              default: 
                switch (i)
                {
                default: 
                  switch (i)
                  {
                  default: 
                    switch (i)
                    {
                    default: 
                      switch (i)
                      {
                      default: 
                        return new h("An internal error has occurred.");
                      }
                    case 17061: 
                      return new u7.i(zza("There was a failure in the connection between the web widget and the Firebase Auth backend.", paramStatus));
                    }
                  case 17057: 
                  case 17058: 
                    return new b8.k(zza(i), str);
                  }
                  return new b8.j(zza(i), str);
                }
              case 17031: 
              case 17032: 
              case 17033: 
                return new b8.k(zza(i), str);
              case 17029: 
              case 17030: 
                return new b8.j(zza(i), str);
              }
            case 17026: 
              return new q(zza(i), str, b);
            }
          case 17016: 
            return new h(zza("User was not linked to an account with the given provider.", paramStatus));
          case 17015: 
            return new h(zza("User has already been linked to the given provider.", paramStatus));
          case 17014: 
            return new b8.j(zza(i), str);
          }
        case 17499: 
          return new h(zza("An internal error has occurred.", paramStatus));
        case 17495: 
          return new a(zza("Please sign in before trying to get a token.", paramStatus));
        case 17200: 
          return new b8.j(zza(i), str);
        case 17080: 
          return new c(str);
        case 17010: 
          return new u7.k(zza("We have blocked all requests from this device due to unusual activity. Try again later.", paramStatus));
        case 17007: 
        case 17012: 
          return new p(zza(i), str);
        case 17006: 
        case 17038: 
        case 17068: 
        case 17079: 
        case 17085: 
        case 17086: 
        case 17087: 
        case 17088: 
        case 17089: 
        case 17090: 
        case 17091: 
        case 17093: 
        case 17095: 
        case 17096: 
        case 17201: 
        case 17202: 
        case 17203: 
        case 17204: 
        case 17205: 
        case 17206: 
        case 17207: 
        case 17209: 
        case 17210: 
        case 17214: 
        case 18001: 
        case 18002: 
          return new l(zza(i), str);
          return new u7.k(str);
        case 17000: 
        case 17002: 
        case 17004: 
        case 17008: 
        case 17009: 
        case 17049: 
        case 17077: 
        case 17081: 
        case 17082: 
        case 17083: 
        case 17084: 
        case 17094: 
          return new b8.m(zza(i), str);
        }
      }
      return new b8.j(zza(i), str);
    }
    return new u7.i(zza("A network error (such as timeout, interrupted connection or unreachable host) has occurred.", paramStatus));
  }
  
  public static h zza(Status paramStatus, b8.f paramf, String paramString1, String paramString2)
  {
    int i = a;
    int j;
    if ((i != 17012) && (i != 17007) && (i != 17025)) {
      j = 0;
    } else {
      j = 1;
    }
    if (j != 0)
    {
      paramStatus = zza(zzb(i), paramStatus);
      paramStatus = new p(zza(i), paramStatus);
      b = paramf;
      c = paramString1;
      return paramStatus;
    }
    return zza(paramStatus);
  }
  
  public static boolean zza(Exception paramException)
  {
    if ((paramException instanceof l)) {
      return a.endsWith("ALTERNATE_CLIENT_IDENTIFIER_REQUIRED");
    }
    return false;
  }
  
  private static String zzb(int paramInt)
  {
    Pair localPair = (Pair)zza.get(paramInt);
    if (localPair != null) {
      return (String)second;
    }
    return "An internal error has occurred.";
  }
  
  public static boolean zzb(Exception paramException)
  {
    if ((paramException instanceof l)) {
      return a.endsWith("APP_NOT_AUTHORIZED");
    }
    return false;
  }
  
  public static boolean zzc(Exception paramException)
  {
    if ((paramException instanceof l)) {
      return a.endsWith("INVALID_RECAPTCHA_TOKEN");
    }
    return false;
  }
  
  public static boolean zzd(Exception paramException)
  {
    if ((paramException instanceof l)) {
      return a.endsWith("MISSING_RECAPTCHA_TOKEN");
    }
    return false;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzadr
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */