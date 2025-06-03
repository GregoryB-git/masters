package io.flutter.plugins.googlesignin;

import java.util.ArrayList;

public final class Messages$UserData
{
  private String displayName;
  private String email;
  private String id;
  private String idToken;
  private String photoUrl;
  private String serverAuthCode;
  
  public static UserData fromList(ArrayList<Object> paramArrayList)
  {
    UserData localUserData = new UserData();
    localUserData.setDisplayName((String)paramArrayList.get(0));
    localUserData.setEmail((String)paramArrayList.get(1));
    localUserData.setId((String)paramArrayList.get(2));
    localUserData.setPhotoUrl((String)paramArrayList.get(3));
    localUserData.setIdToken((String)paramArrayList.get(4));
    localUserData.setServerAuthCode((String)paramArrayList.get(5));
    return localUserData;
  }
  
  public String getDisplayName()
  {
    return displayName;
  }
  
  public String getEmail()
  {
    return email;
  }
  
  public String getId()
  {
    return id;
  }
  
  public String getIdToken()
  {
    return idToken;
  }
  
  public String getPhotoUrl()
  {
    return photoUrl;
  }
  
  public String getServerAuthCode()
  {
    return serverAuthCode;
  }
  
  public void setDisplayName(String paramString)
  {
    displayName = paramString;
  }
  
  public void setEmail(String paramString)
  {
    if (paramString != null)
    {
      email = paramString;
      return;
    }
    throw new IllegalStateException("Nonnull field \"email\" is null.");
  }
  
  public void setId(String paramString)
  {
    if (paramString != null)
    {
      id = paramString;
      return;
    }
    throw new IllegalStateException("Nonnull field \"id\" is null.");
  }
  
  public void setIdToken(String paramString)
  {
    idToken = paramString;
  }
  
  public void setPhotoUrl(String paramString)
  {
    photoUrl = paramString;
  }
  
  public void setServerAuthCode(String paramString)
  {
    serverAuthCode = paramString;
  }
  
  public ArrayList<Object> toList()
  {
    ArrayList localArrayList = new ArrayList(6);
    localArrayList.add(displayName);
    localArrayList.add(email);
    localArrayList.add(id);
    localArrayList.add(photoUrl);
    localArrayList.add(idToken);
    localArrayList.add(serverAuthCode);
    return localArrayList;
  }
  
  public static final class Builder
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
}

/* Location:
 * Qualified Name:     io.flutter.plugins.googlesignin.Messages.UserData
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */