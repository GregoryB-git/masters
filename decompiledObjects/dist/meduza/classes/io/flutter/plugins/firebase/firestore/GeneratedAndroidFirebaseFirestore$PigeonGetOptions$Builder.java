package io.flutter.plugins.firebase.firestore;

public final class GeneratedAndroidFirebaseFirestore$PigeonGetOptions$Builder
{
  private GeneratedAndroidFirebaseFirestore.ServerTimestampBehavior serverTimestampBehavior;
  private GeneratedAndroidFirebaseFirestore.Source source;
  
  public GeneratedAndroidFirebaseFirestore.PigeonGetOptions build()
  {
    GeneratedAndroidFirebaseFirestore.PigeonGetOptions localPigeonGetOptions = new GeneratedAndroidFirebaseFirestore.PigeonGetOptions();
    localPigeonGetOptions.setSource(source);
    localPigeonGetOptions.setServerTimestampBehavior(serverTimestampBehavior);
    return localPigeonGetOptions;
  }
  
  public Builder setServerTimestampBehavior(GeneratedAndroidFirebaseFirestore.ServerTimestampBehavior paramServerTimestampBehavior)
  {
    serverTimestampBehavior = paramServerTimestampBehavior;
    return this;
  }
  
  public Builder setSource(GeneratedAndroidFirebaseFirestore.Source paramSource)
  {
    source = paramSource;
    return this;
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.firebase.firestore.GeneratedAndroidFirebaseFirestore.PigeonGetOptions.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */