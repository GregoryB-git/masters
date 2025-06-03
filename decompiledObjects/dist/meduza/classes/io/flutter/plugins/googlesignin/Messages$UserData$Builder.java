package io.flutter.plugins.googlesignin;

public final class Messages$UserData$Builder
{
  private String displayName;
  private String email;
  private String id;
  private String idToken;
  private String photoUrl;
  private String serverAuthCode;
  
  public Messages.UserData build()
  {
    Messages.UserData localUserData = new Messages.UserData();
    localUserData.setDisplayName(displayName);
    localUserData.setEmail(email);
    localUserData.setId(id);
    localUserData.setPhotoUrl(photoUrl);
    localUserData.setIdToken(idToken);
    localUserData.setServerAuthCode(serverAuthCode);
    return localUserData;
  }
  
  public Builder setDisplayName(String paramString)
  {
    displayName = paramString;
    return this;
  }
  
  public Builder setEmail(String paramString)
  {
    email = paramString;
    return this;
  }
  
  public Builder setId(String paramString)
  {
    id = paramString;
    return this;
  }
  
  public Builder setIdToken(String paramString)
  {
    idToken = paramString;
    return this;
  }
  
  public Builder setPhotoUrl(String paramString)
  {
    photoUrl = paramString;
    return this;
  }
  
  public Builder setServerAuthCode(String paramString)
  {
    serverAuthCode = paramString;
    return this;
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.googlesignin.Messages.UserData.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */