package com.facebook.internal;

 enum FetchedAppSettingsManager$FetchAppSettingState
{
  static
  {
    FetchAppSettingState localFetchAppSettingState1 = new FetchAppSettingState("NOT_LOADED", 0);
    NOT_LOADED = localFetchAppSettingState1;
    FetchAppSettingState localFetchAppSettingState2 = new FetchAppSettingState("LOADING", 1);
    LOADING = localFetchAppSettingState2;
    FetchAppSettingState localFetchAppSettingState3 = new FetchAppSettingState("SUCCESS", 2);
    SUCCESS = localFetchAppSettingState3;
    FetchAppSettingState localFetchAppSettingState4 = new FetchAppSettingState("ERROR", 3);
    ERROR = localFetchAppSettingState4;
    $VALUES = new FetchAppSettingState[] { localFetchAppSettingState1, localFetchAppSettingState2, localFetchAppSettingState3, localFetchAppSettingState4 };
  }
  
  private FetchedAppSettingsManager$FetchAppSettingState() {}
}

/* Location:
 * Qualified Name:     com.facebook.internal.FetchedAppSettingsManager.FetchAppSettingState
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */