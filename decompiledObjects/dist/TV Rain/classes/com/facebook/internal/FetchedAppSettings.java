package com.facebook.internal;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.util.EnumSet;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public final class FetchedAppSettings
{
  private boolean IAPAutomaticLoggingEnabled;
  private boolean automaticLoggingEnabled;
  private boolean codelessEventsEnabled;
  private Map<String, Map<String, DialogFeatureConfig>> dialogConfigMap;
  private FacebookRequestErrorClassification errorClassification;
  private JSONArray eventBindings;
  private boolean monitorViaDialogEnabled;
  private String nuxContent;
  private boolean nuxEnabled;
  @Nullable
  private String rawAamRules;
  @Nullable
  private String restrictiveDataSetting;
  private String sdkUpdateMessage;
  private int sessionTimeoutInSeconds;
  private String smartLoginBookmarkIconURL;
  private String smartLoginMenuIconURL;
  private EnumSet<SmartLoginOption> smartLoginOptions;
  @Nullable
  private String suggestedEventsSetting;
  private boolean supportsImplicitLogging;
  private boolean trackUninstallEnabled;
  
  public FetchedAppSettings(boolean paramBoolean1, String paramString1, boolean paramBoolean2, int paramInt, EnumSet<SmartLoginOption> paramEnumSet, Map<String, Map<String, DialogFeatureConfig>> paramMap, boolean paramBoolean3, FacebookRequestErrorClassification paramFacebookRequestErrorClassification, String paramString2, String paramString3, boolean paramBoolean4, boolean paramBoolean5, JSONArray paramJSONArray, String paramString4, boolean paramBoolean6, boolean paramBoolean7, @Nullable String paramString5, @Nullable String paramString6, @Nullable String paramString7)
  {
    supportsImplicitLogging = paramBoolean1;
    nuxContent = paramString1;
    nuxEnabled = paramBoolean2;
    dialogConfigMap = paramMap;
    errorClassification = paramFacebookRequestErrorClassification;
    sessionTimeoutInSeconds = paramInt;
    automaticLoggingEnabled = paramBoolean3;
    smartLoginOptions = paramEnumSet;
    smartLoginBookmarkIconURL = paramString2;
    smartLoginMenuIconURL = paramString3;
    IAPAutomaticLoggingEnabled = paramBoolean4;
    codelessEventsEnabled = paramBoolean5;
    eventBindings = paramJSONArray;
    sdkUpdateMessage = paramString4;
    trackUninstallEnabled = paramBoolean6;
    monitorViaDialogEnabled = paramBoolean7;
    rawAamRules = paramString5;
    suggestedEventsSetting = paramString6;
    restrictiveDataSetting = paramString7;
  }
  
  public static DialogFeatureConfig getDialogFeatureConfig(String paramString1, String paramString2, String paramString3)
  {
    if ((!Utility.isNullOrEmpty(paramString2)) && (!Utility.isNullOrEmpty(paramString3)))
    {
      paramString1 = FetchedAppSettingsManager.getAppSettingsWithoutQuery(paramString1);
      if (paramString1 != null)
      {
        paramString1 = (Map)paramString1.getDialogConfigurations().get(paramString2);
        if (paramString1 != null) {
          return (DialogFeatureConfig)paramString1.get(paramString3);
        }
      }
    }
    return null;
  }
  
  public boolean getAutomaticLoggingEnabled()
  {
    return automaticLoggingEnabled;
  }
  
  public boolean getCodelessEventsEnabled()
  {
    return codelessEventsEnabled;
  }
  
  public Map<String, Map<String, DialogFeatureConfig>> getDialogConfigurations()
  {
    return dialogConfigMap;
  }
  
  public FacebookRequestErrorClassification getErrorClassification()
  {
    return errorClassification;
  }
  
  public JSONArray getEventBindings()
  {
    return eventBindings;
  }
  
  public boolean getIAPAutomaticLoggingEnabled()
  {
    return IAPAutomaticLoggingEnabled;
  }
  
  public boolean getMonitorViaDialogEnabled()
  {
    return monitorViaDialogEnabled;
  }
  
  public String getNuxContent()
  {
    return nuxContent;
  }
  
  public boolean getNuxEnabled()
  {
    return nuxEnabled;
  }
  
  @Nullable
  public String getRawAamRules()
  {
    return rawAamRules;
  }
  
  @Nullable
  public String getRestrictiveDataSetting()
  {
    return restrictiveDataSetting;
  }
  
  public String getSdkUpdateMessage()
  {
    return sdkUpdateMessage;
  }
  
  public int getSessionTimeoutInSeconds()
  {
    return sessionTimeoutInSeconds;
  }
  
  public String getSmartLoginBookmarkIconURL()
  {
    return smartLoginBookmarkIconURL;
  }
  
  public String getSmartLoginMenuIconURL()
  {
    return smartLoginMenuIconURL;
  }
  
  public EnumSet<SmartLoginOption> getSmartLoginOptions()
  {
    return smartLoginOptions;
  }
  
  @Nullable
  public String getSuggestedEventsSetting()
  {
    return suggestedEventsSetting;
  }
  
  public boolean getTrackUninstallEnabled()
  {
    return trackUninstallEnabled;
  }
  
  public boolean supportsImplicitLogging()
  {
    return supportsImplicitLogging;
  }
  
  public static class DialogFeatureConfig
  {
    private static final String DIALOG_CONFIG_DIALOG_NAME_FEATURE_NAME_SEPARATOR = "\\|";
    private static final String DIALOG_CONFIG_NAME_KEY = "name";
    private static final String DIALOG_CONFIG_URL_KEY = "url";
    private static final String DIALOG_CONFIG_VERSIONS_KEY = "versions";
    private String dialogName;
    private Uri fallbackUrl;
    private String featureName;
    private int[] featureVersionSpec;
    
    private DialogFeatureConfig(String paramString1, String paramString2, Uri paramUri, int[] paramArrayOfInt)
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
}

/* Location:
 * Qualified Name:     com.facebook.internal.FetchedAppSettings
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */