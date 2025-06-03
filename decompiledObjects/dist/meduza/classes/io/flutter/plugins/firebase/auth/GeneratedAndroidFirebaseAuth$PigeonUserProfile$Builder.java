package io.flutter.plugins.firebase.auth;

public final class GeneratedAndroidFirebaseAuth$PigeonUserProfile$Builder
{
  private String displayName;
  private Boolean displayNameChanged;
  private String photoUrl;
  private Boolean photoUrlChanged;
  
  public GeneratedAndroidFirebaseAuth.PigeonUserProfile build()
  {
    GeneratedAndroidFirebaseAuth.PigeonUserProfile localPigeonUserProfile = new GeneratedAndroidFirebaseAuth.PigeonUserProfile();
    localPigeonUserProfile.setDisplayName(displayName);
    localPigeonUserProfile.setPhotoUrl(photoUrl);
    localPigeonUserProfile.setDisplayNameChanged(displayNameChanged);
    localPigeonUserProfile.setPhotoUrlChanged(photoUrlChanged);
    return localPigeonUserProfile;
  }
  
  public Builder setDisplayName(String paramString)
  {
    displayName = paramString;
    return this;
  }
  
  public Builder setDisplayNameChanged(Boolean paramBoolean)
  {
    displayNameChanged = paramBoolean;
    return this;
  }
  
  public Builder setPhotoUrl(String paramString)
  {
    photoUrl = paramString;
    return this;
  }
  
  public Builder setPhotoUrlChanged(Boolean paramBoolean)
  {
    photoUrlChanged = paramBoolean;
    return this;
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.PigeonUserProfile.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */