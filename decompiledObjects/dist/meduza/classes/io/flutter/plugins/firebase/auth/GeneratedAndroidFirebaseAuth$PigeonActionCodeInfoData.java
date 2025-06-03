package io.flutter.plugins.firebase.auth;

import java.util.ArrayList;

public final class GeneratedAndroidFirebaseAuth$PigeonActionCodeInfoData
{
  private String email;
  private String previousEmail;
  
  public static PigeonActionCodeInfoData fromList(ArrayList<Object> paramArrayList)
  {
    PigeonActionCodeInfoData localPigeonActionCodeInfoData = new PigeonActionCodeInfoData();
    localPigeonActionCodeInfoData.setEmail((String)paramArrayList.get(0));
    localPigeonActionCodeInfoData.setPreviousEmail((String)paramArrayList.get(1));
    return localPigeonActionCodeInfoData;
  }
  
  public String getEmail()
  {
    return email;
  }
  
  public String getPreviousEmail()
  {
    return previousEmail;
  }
  
  public void setEmail(String paramString)
  {
    email = paramString;
  }
  
  public void setPreviousEmail(String paramString)
  {
    previousEmail = paramString;
  }
  
  public ArrayList<Object> toList()
  {
    ArrayList localArrayList = new ArrayList(2);
    localArrayList.add(email);
    localArrayList.add(previousEmail);
    return localArrayList;
  }
  
  public static final class Builder
  {
    private String email;
    private String previousEmail;
    
    public GeneratedAndroidFirebaseAuth.PigeonActionCodeInfoData build()
    {
      GeneratedAndroidFirebaseAuth.PigeonActionCodeInfoData localPigeonActionCodeInfoData = new GeneratedAndroidFirebaseAuth.PigeonActionCodeInfoData();
      localPigeonActionCodeInfoData.setEmail(email);
      localPigeonActionCodeInfoData.setPreviousEmail(previousEmail);
      return localPigeonActionCodeInfoData;
    }
    
    public Builder setEmail(String paramString)
    {
      email = paramString;
      return this;
    }
    
    public Builder setPreviousEmail(String paramString)
    {
      previousEmail = paramString;
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.PigeonActionCodeInfoData
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */