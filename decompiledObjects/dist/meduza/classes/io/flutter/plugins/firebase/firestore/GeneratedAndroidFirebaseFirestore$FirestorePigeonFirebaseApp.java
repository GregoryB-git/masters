package io.flutter.plugins.firebase.firestore;

import java.util.ArrayList;

public final class GeneratedAndroidFirebaseFirestore$FirestorePigeonFirebaseApp
{
  private String appName;
  private String databaseURL;
  private GeneratedAndroidFirebaseFirestore.PigeonFirebaseSettings settings;
  
  public static FirestorePigeonFirebaseApp fromList(ArrayList<Object> paramArrayList)
  {
    FirestorePigeonFirebaseApp localFirestorePigeonFirebaseApp = new FirestorePigeonFirebaseApp();
    localFirestorePigeonFirebaseApp.setAppName((String)paramArrayList.get(0));
    Object localObject = paramArrayList.get(1);
    if (localObject == null) {
      localObject = null;
    } else {
      localObject = GeneratedAndroidFirebaseFirestore.PigeonFirebaseSettings.fromList((ArrayList)localObject);
    }
    localFirestorePigeonFirebaseApp.setSettings((GeneratedAndroidFirebaseFirestore.PigeonFirebaseSettings)localObject);
    localFirestorePigeonFirebaseApp.setDatabaseURL((String)paramArrayList.get(2));
    return localFirestorePigeonFirebaseApp;
  }
  
  public String getAppName()
  {
    return appName;
  }
  
  public String getDatabaseURL()
  {
    return databaseURL;
  }
  
  public GeneratedAndroidFirebaseFirestore.PigeonFirebaseSettings getSettings()
  {
    return settings;
  }
  
  public void setAppName(String paramString)
  {
    if (paramString != null)
    {
      appName = paramString;
      return;
    }
    throw new IllegalStateException("Nonnull field \"appName\" is null.");
  }
  
  public void setDatabaseURL(String paramString)
  {
    if (paramString != null)
    {
      databaseURL = paramString;
      return;
    }
    throw new IllegalStateException("Nonnull field \"databaseURL\" is null.");
  }
  
  public void setSettings(GeneratedAndroidFirebaseFirestore.PigeonFirebaseSettings paramPigeonFirebaseSettings)
  {
    if (paramPigeonFirebaseSettings != null)
    {
      settings = paramPigeonFirebaseSettings;
      return;
    }
    throw new IllegalStateException("Nonnull field \"settings\" is null.");
  }
  
  public ArrayList<Object> toList()
  {
    ArrayList localArrayList = new ArrayList(3);
    localArrayList.add(appName);
    Object localObject = settings;
    if (localObject == null) {
      localObject = null;
    } else {
      localObject = ((GeneratedAndroidFirebaseFirestore.PigeonFirebaseSettings)localObject).toList();
    }
    localArrayList.add(localObject);
    localArrayList.add(databaseURL);
    return localArrayList;
  }
  
  public static final class Builder
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
}

/* Location:
 * Qualified Name:     io.flutter.plugins.firebase.firestore.GeneratedAndroidFirebaseFirestore.FirestorePigeonFirebaseApp
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */