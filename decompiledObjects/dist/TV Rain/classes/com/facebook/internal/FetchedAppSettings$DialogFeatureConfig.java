package com.facebook.internal;

import android.net.Uri;
import org.json.JSONArray;
import org.json.JSONObject;

public class FetchedAppSettings$DialogFeatureConfig
{
  private static final String DIALOG_CONFIG_DIALOG_NAME_FEATURE_NAME_SEPARATOR = "\\|";
  private static final String DIALOG_CONFIG_NAME_KEY = "name";
  private static final String DIALOG_CONFIG_URL_KEY = "url";
  private static final String DIALOG_CONFIG_VERSIONS_KEY = "versions";
  private String dialogName;
  private Uri fallbackUrl;
  private String featureName;
  private int[] featureVersionSpec;
  
  private FetchedAppSettings$DialogFeatureConfig(String paramString1, String paramString2, Uri paramUri, int[] paramArrayOfInt)
  {
    dialogName = paramString1;
    featureName = paramString2;
    fallbackUrl = paramUri;
    featureVersionSpec = paramArrayOfInt;
  }
  
  public static DialogFeatureConfig parseDialogConfig(JSONObject paramJSONObject)
  {
    String str1 = paramJSONObject.optString("name");
    boolean bool = Utility.isNullOrEmpty(str1);
    Uri localUri = null;
    if (bool) {
      return null;
    }
    Object localObject = str1.split("\\|");
    if (localObject.length != 2) {
      return null;
    }
    str1 = localObject[0];
    localObject = localObject[1];
    if ((!Utility.isNullOrEmpty(str1)) && (!Utility.isNullOrEmpty((String)localObject)))
    {
      String str2 = paramJSONObject.optString("url");
      if (!Utility.isNullOrEmpty(str2)) {
        localUri = Uri.parse(str2);
      }
      return new DialogFeatureConfig(str1, (String)localObject, localUri, parseVersionSpec(paramJSONObject.optJSONArray("versions")));
    }
    return null;
  }
  
  private static int[] parseVersionSpec(JSONArray paramJSONArray)
  {
    if (paramJSONArray != null)
    {
      int i = paramJSONArray.length();
      int[] arrayOfInt1 = new int[i];
      for (int j = 0;; j++)
      {
        Object localObject = arrayOfInt1;
        if (j >= i) {
          break;
        }
        int k = -1;
        int m = paramJSONArray.optInt(j, -1);
        if (m == -1)
        {
          localObject = paramJSONArray.optString(j);
          if (!Utility.isNullOrEmpty((String)localObject)) {
            try
            {
              m = Integer.parseInt((String)localObject);
              k = m;
            }
            catch (NumberFormatException localNumberFormatException)
            {
              Utility.logd("FacebookSDK", localNumberFormatException);
            }
          }
        }
        k = m;
        arrayOfInt1[j] = k;
      }
    }
    int[] arrayOfInt2 = null;
    return arrayOfInt2;
  }
  
  public String getDialogName()
  {
    return dialogName;
  }
  
  public Uri getFallbackUrl()
  {
    return fallbackUrl;
  }
  
  public String getFeatureName()
  {
    return featureName;
  }
  
  public int[] getVersionSpec()
  {
    return featureVersionSpec;
  }
}

/* Location:
 * Qualified Name:     com.facebook.internal.FetchedAppSettings.DialogFeatureConfig
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */