package io.flutter.plugins.firebase.auth;

import java.util.ArrayList;

public final class GeneratedAndroidFirebaseAuth$PigeonUserProfile
{
  private String displayName;
  private Boolean displayNameChanged;
  private String photoUrl;
  private Boolean photoUrlChanged;
  
  public static PigeonUserProfile fromList(ArrayList<Object> paramArrayList)
  {
    PigeonUserProfile localPigeonUserProfile = new PigeonUserProfile();
    localPigeonUserProfile.setDisplayName((String)paramArrayList.get(0));
    localPigeonUserProfile.setPhotoUrl((String)paramArrayList.get(1));
    localPigeonUserProfile.setDisplayNameChanged((Boolean)paramArrayList.get(2));
    localPigeonUserProfile.setPhotoUrlChanged((Boolean)paramArrayList.get(3));
    return localPigeonUserProfile;
  }
  
  public String getDisplayName()
  {
    return displayName;
  }
  
  public Boolean getDisplayNameChanged()
  {
    return displayNameChanged;
  }
  
  public String getPhotoUrl()
  {
    return photoUrl;
  }
  
  public Boolean getPhotoUrlChanged()
  {
    return photoUrlChanged;
  }
  
  public void setDisplayName(String paramString)
  {
    displayName = paramString;
  }
  
  public void setDisplayNameChanged(Boolean paramBoolean)
  {
    if (paramBoolean != null)
    {
      displayNameChanged = paramBoolean;
      return;
    }
    throw new IllegalStateException("Nonnull field \"displayNameChanged\" is null.");
  }
  
  public void setPhotoUrl(String paramString)
  {
    photoUrl = paramString;
  }
  
  public void setPhotoUrlChanged(Boolean paramBoolean)
  {
    if (paramBoolean != null)
    {
      photoUrlChanged = paramBoolean;
      return;
    }
    throw new IllegalStateException("Nonnull field \"photoUrlChanged\" is null.");
  }
  
  public ArrayList<Object> toList()
  {
    ArrayList localArrayList = new ArrayList(4);
    localArrayList.add(displayName);
    localArrayList.add(photoUrl);
    localArrayList.add(displayNameChanged);
    localArrayList.add(photoUrlChanged);
    return localArrayList;
  }
  
  public static final class Builder
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
}

/* Location:
 * Qualified Name:     io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.PigeonUserProfile
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */