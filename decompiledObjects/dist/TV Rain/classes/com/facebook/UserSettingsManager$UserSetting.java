package com.facebook;

class UserSettingsManager$UserSetting
{
  public boolean defaultVal;
  public String key;
  public long lastTS;
  public Boolean value;
  
  public UserSettingsManager$UserSetting(boolean paramBoolean, String paramString)
  {
    defaultVal = paramBoolean;
    key = paramString;
  }
  
  public boolean getValue()
  {
    Boolean localBoolean = value;
    boolean bool;
    if (localBoolean == null) {
      bool = defaultVal;
    } else {
      bool = localBoolean.booleanValue();
    }
    return bool;
  }
}

/* Location:
 * Qualified Name:     com.facebook.UserSettingsManager.UserSetting
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */