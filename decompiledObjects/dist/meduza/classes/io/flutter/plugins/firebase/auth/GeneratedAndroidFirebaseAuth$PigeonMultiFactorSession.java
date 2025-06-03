package io.flutter.plugins.firebase.auth;

import java.util.ArrayList;

public final class GeneratedAndroidFirebaseAuth$PigeonMultiFactorSession
{
  private String id;
  
  public static PigeonMultiFactorSession fromList(ArrayList<Object> paramArrayList)
  {
    PigeonMultiFactorSession localPigeonMultiFactorSession = new PigeonMultiFactorSession();
    localPigeonMultiFactorSession.setId((String)paramArrayList.get(0));
    return localPigeonMultiFactorSession;
  }
  
  public String getId()
  {
    return id;
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
  
  public ArrayList<Object> toList()
  {
    ArrayList localArrayList = new ArrayList(1);
    localArrayList.add(id);
    return localArrayList;
  }
  
  public static final class Builder
  {
    private String id;
    
    public GeneratedAndroidFirebaseAuth.PigeonMultiFactorSession build()
    {
      GeneratedAndroidFirebaseAuth.PigeonMultiFactorSession localPigeonMultiFactorSession = new GeneratedAndroidFirebaseAuth.PigeonMultiFactorSession();
      localPigeonMultiFactorSession.setId(id);
      return localPigeonMultiFactorSession;
    }
    
    public Builder setId(String paramString)
    {
      id = paramString;
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.PigeonMultiFactorSession
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */