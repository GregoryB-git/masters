package io.flutter.plugins.firebase.auth;

import java.util.ArrayList;

public final class GeneratedAndroidFirebaseAuth$PigeonActionCodeInfo
{
  private GeneratedAndroidFirebaseAuth.PigeonActionCodeInfoData data;
  private GeneratedAndroidFirebaseAuth.ActionCodeInfoOperation operation;
  
  public static PigeonActionCodeInfo fromList(ArrayList<Object> paramArrayList)
  {
    PigeonActionCodeInfo localPigeonActionCodeInfo = new PigeonActionCodeInfo();
    Object localObject = paramArrayList.get(0);
    localPigeonActionCodeInfo.setOperation(GeneratedAndroidFirebaseAuth.ActionCodeInfoOperation.values()[((Integer)localObject).intValue()]);
    localPigeonActionCodeInfo.setData((GeneratedAndroidFirebaseAuth.PigeonActionCodeInfoData)paramArrayList.get(1));
    return localPigeonActionCodeInfo;
  }
  
  public GeneratedAndroidFirebaseAuth.PigeonActionCodeInfoData getData()
  {
    return data;
  }
  
  public GeneratedAndroidFirebaseAuth.ActionCodeInfoOperation getOperation()
  {
    return operation;
  }
  
  public void setData(GeneratedAndroidFirebaseAuth.PigeonActionCodeInfoData paramPigeonActionCodeInfoData)
  {
    if (paramPigeonActionCodeInfoData != null)
    {
      data = paramPigeonActionCodeInfoData;
      return;
    }
    throw new IllegalStateException("Nonnull field \"data\" is null.");
  }
  
  public void setOperation(GeneratedAndroidFirebaseAuth.ActionCodeInfoOperation paramActionCodeInfoOperation)
  {
    if (paramActionCodeInfoOperation != null)
    {
      operation = paramActionCodeInfoOperation;
      return;
    }
    throw new IllegalStateException("Nonnull field \"operation\" is null.");
  }
  
  public ArrayList<Object> toList()
  {
    ArrayList localArrayList = new ArrayList(2);
    Object localObject = operation;
    if (localObject == null) {
      localObject = null;
    } else {
      localObject = Integer.valueOf(index);
    }
    localArrayList.add(localObject);
    localArrayList.add(data);
    return localArrayList;
  }
  
  public static final class Builder
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
}

/* Location:
 * Qualified Name:     io.flutter.plugins.firebase.auth.GeneratedAndroidFirebaseAuth.PigeonActionCodeInfo
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */