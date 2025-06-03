package com.google.android.play.core.integrity.model;

import a0.j;
import java.util.HashMap;
import java.util.Map;

public final class b
{
  private static final Map a;
  private static final Map b;
  
  static
  {
    HashMap localHashMap1 = new HashMap();
    a = localHashMap1;
    HashMap localHashMap2 = new HashMap();
    b = localHashMap2;
    Integer localInteger1 = Integer.valueOf(-1);
    localHashMap1.put(localInteger1, "Standard Integrity API is not available.\nStandard Integrity API is not enabled, or the Play Store version might be old.\nRecommended actions:\n1) Make sure to be allowlisted to use Standard Integrity API.\n2) Make sure that Integrity API is enabled in Google Play Console.\n3) Ask the user to update Play Store.\n");
    Integer localInteger2 = Integer.valueOf(-2);
    localHashMap1.put(localInteger2, "The Play Store app is either not installed or not the official version.\nAsk the user to install an official and recent version of Play Store.\n");
    Integer localInteger3 = Integer.valueOf(-3);
    localHashMap1.put(localInteger3, "Network error: unable to obtain integrity details.\nAsk the user to check for a connection.\n");
    Integer localInteger4 = Integer.valueOf(-5);
    localHashMap1.put(localInteger4, "PackageManager could not find this app.\nSomething is wrong (possibly an attack). Non-actionable.\n");
    Integer localInteger5 = Integer.valueOf(-6);
    localHashMap1.put(localInteger5, "Google Play Services is not available or version is too old.\nAsk the user to Install or Update Play Services.\n");
    Integer localInteger6 = Integer.valueOf(-7);
    localHashMap1.put(localInteger6, "The calling app UID (user id) does not match the one from Package Manager.\nSomething is wrong (possibly an attack). Non-actionable.\n");
    Integer localInteger7 = Integer.valueOf(-8);
    localHashMap1.put(localInteger7, "The calling app is making too many requests to the API and hence is throttled.\nRetry with an exponential backoff.\n");
    Integer localInteger8 = Integer.valueOf(-9);
    localHashMap1.put(localInteger8, "Binding to the service in the Play Store has failed. This can be due to having an old Play Store version installed on the device.\nAsk the user to update Play Store.\n");
    Integer localInteger9 = Integer.valueOf(-12);
    localHashMap1.put(localInteger9, "Unknown internal Google server error.\nRetry with an exponential backoff. Consider filing a bug if fails consistently.\n");
    Integer localInteger10 = Integer.valueOf(-14);
    localHashMap1.put(localInteger10, "The Play Store needs to be updated.\nAsk the user to update the Google Play Store.\n");
    Integer localInteger11 = Integer.valueOf(-15);
    localHashMap1.put(localInteger11, "Play Services needs to be updated.\nAsk the user to update Google Play Services.\n");
    Integer localInteger12 = Integer.valueOf(-16);
    localHashMap1.put(localInteger12, "The provided cloud project number is invalid.\nUse the cloud project number which can be found in Project info in your Google Cloud Console for the cloud project where Play Integrity API is enabled.\n");
    Integer localInteger13 = Integer.valueOf(-17);
    localHashMap1.put(localInteger13, "The provided request hash is too long. The request hash length must be less than 500 bytes.\nRetry with a shorter request hash.");
    Integer localInteger14 = Integer.valueOf(-18);
    localHashMap1.put(localInteger14, "There is a transient error on the calling device.\nRetry with an exponential backoff.\n");
    Integer localInteger15 = Integer.valueOf(-19);
    localHashMap1.put(localInteger15, "The StandardIntegrityTokenProvider is invalid (e.g. it is outdated).\nRequest a new integrity token provider by calling StandardIntegrityManager#prepareIntegrityToken.");
    Integer localInteger16 = Integer.valueOf(-100);
    localHashMap1.put(localInteger16, "Unknown error processing integrity request.\nRetry with an exponential backoff. Consider filing a bug if fails consistently.\n");
    localHashMap2.put(localInteger1, "API_NOT_AVAILABLE");
    localHashMap2.put(localInteger3, "NETWORK_ERROR");
    localHashMap2.put(localInteger2, "PLAY_STORE_NOT_FOUND");
    localHashMap2.put(localInteger10, "PLAY_STORE_VERSION_OUTDATED");
    localHashMap2.put(localInteger4, "APP_NOT_INSTALLED");
    localHashMap2.put(localInteger5, "PLAY_SERVICES_NOT_FOUND");
    localHashMap2.put(localInteger11, "PLAY_SERVICES_VERSION_OUTDATED");
    localHashMap2.put(localInteger6, "APP_UID_MISMATCH");
    localHashMap2.put(localInteger7, "TOO_MANY_REQUESTS");
    localHashMap2.put(localInteger8, "CANNOT_BIND_TO_SERVICE");
    localHashMap2.put(localInteger12, "CLOUD_PROJECT_NUMBER_IS_INVALID");
    localHashMap2.put(localInteger13, "REQUEST_HASH_TOO_LONG");
    localHashMap2.put(localInteger9, "GOOGLE_SERVER_UNAVAILABLE");
    localHashMap2.put(localInteger14, "CLIENT_TRANSIENT_ERROR");
    localHashMap2.put(localInteger15, "INTEGRITY_TOKEN_PROVIDER_INVALID");
    localHashMap2.put(localInteger16, "INTERNAL_ERROR");
  }
  
  public static String a(int paramInt)
  {
    Map localMap1 = a;
    Integer localInteger = Integer.valueOf(paramInt);
    if (localMap1.containsKey(localInteger))
    {
      Map localMap2 = b;
      if (localMap2.containsKey(localInteger)) {
        return j.k((String)localMap1.get(localInteger), " (https://developer.android.com/google/play/integrity/reference/com/google/android/play/core/integrity/model/StandardIntegrityErrorCode.html#", (String)localMap2.get(localInteger), ")");
      }
    }
    return "";
  }
}

/* Location:
 * Qualified Name:     com.google.android.play.core.integrity.model.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */