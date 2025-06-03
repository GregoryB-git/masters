package io.flutter.plugins.firebase.firestore;

public final class GeneratedAndroidFirebaseFirestore$FirestorePigeonFirebaseApp$Builder
{
  private String appName;
  private String databaseURL;
  private GeneratedAndroidFirebaseFirestore.PigeonFirebaseSettings settings;
  
  public GeneratedAndroidFirebaseFirestore.FirestorePigeonFirebaseApp build()
  {
    GeneratedAndroidFirebaseFirestore.FirestorePigeonFirebaseApp localFirestorePigeonFirebaseApp = new GeneratedAndroidFirebaseFirestore.FirestorePigeonFirebaseApp();
    localFirestorePigeonFirebaseApp.setAppName(appName);
    localFirestorePigeonFirebaseApp.setSettings(settings);
    localFirestorePigeonFirebaseApp.setDatabaseURL(databaseURL);
    return localFirestorePigeonFirebaseApp;
  }
  
  public Builder setAppName(String paramString)
  {
    appName = paramString;
    return this;
  }
  
  public Builder setDatabaseURL(String paramString)
  {
    databaseURL = paramString;
    return this;
  }
  
  public Builder setSettings(GeneratedAndroidFirebaseFirestore.PigeonFirebaseSettings paramPigeonFirebaseSettings)
  {
    settings = paramPigeonFirebaseSettings;
    return this;
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.firebase.firestore.GeneratedAndroidFirebaseFirestore.FirestorePigeonFirebaseApp.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */