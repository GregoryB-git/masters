package io.flutter.plugins.firebase.auth;

public final class GeneratedAndroidFirebaseAuth$PigeonActionCodeInfo$Builder
{
  private GeneratedAndroidFirebaseAuth.PigeonActionCodeInfoData data;
  private GeneratedAndroidFirebaseAuth.ActionCodeInfoOperation operation;
  
  public GeneratedAndroidFirebaseAuth.PigeonActionCodeInfo build()
  {
    GeneratedAndroidFirebaseAuth.PigeonActionCodeInfo localPigeonActionCodeInfo = new GeneratedAndroidFirebaseAuth.PigeonActionCodeInfo();
    localPigeonActionCodeInfo.setOperation(operation);
    localPigeonActionCodeInfo.setData(data);
    return localPigeonActionCodeInfo;
  }
  
  public Builder setData(GeneratedAndroidFirebaseAuth.PigeonActionCodeInfoData paramPigeonActionCodeInfoData)
  {
    data = paramPigeonActionCodeInfoData;
    return this;
  }
  
  public Builder setOperation(GeneratedAndroidFirebaseAuth.ActionCodeInfoOperation paramActionCodeInfoOperation)
  {
    operation = paramActionCodeInfoOperation;
    return this;
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.PigeonActionCodeInfo.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */