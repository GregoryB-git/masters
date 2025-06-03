package io.flutter.plugins.firebase.firestore;

import java.util.ArrayList;
import java.util.Map;

public final class GeneratedAndroidFirebaseFirestore$PigeonTransactionCommand
{
  private Map<String, Object> data;
  private GeneratedAndroidFirebaseFirestore.PigeonDocumentOption option;
  private String path;
  private GeneratedAndroidFirebaseFirestore.PigeonTransactionType type;
  
  public static PigeonTransactionCommand fromList(ArrayList<Object> paramArrayList)
  {
    PigeonTransactionCommand localPigeonTransactionCommand = new PigeonTransactionCommand();
    Object localObject = paramArrayList.get(0);
    localPigeonTransactionCommand.setType(GeneratedAndroidFirebaseFirestore.PigeonTransactionType.values()[((Integer)localObject).intValue()]);
    localPigeonTransactionCommand.setPath((String)paramArrayList.get(1));
    localPigeonTransactionCommand.setData((Map)paramArrayList.get(2));
    paramArrayList = paramArrayList.get(3);
    if (paramArrayList == null) {
      paramArrayList = null;
    } else {
      paramArrayList = GeneratedAndroidFirebaseFirestore.PigeonDocumentOption.fromList((ArrayList)paramArrayList);
    }
    localPigeonTransactionCommand.setOption(paramArrayList);
    return localPigeonTransactionCommand;
  }
  
  public Map<String, Object> getData()
  {
    return data;
  }
  
  public GeneratedAndroidFirebaseFirestore.PigeonDocumentOption getOption()
  {
    return option;
  }
  
  public String getPath()
  {
    return path;
  }
  
  public GeneratedAndroidFirebaseFirestore.PigeonTransactionType getType()
  {
    return type;
  }
  
  public void setData(Map<String, Object> paramMap)
  {
    data = paramMap;
  }
  
  public void setOption(GeneratedAndroidFirebaseFirestore.PigeonDocumentOption paramPigeonDocumentOption)
  {
    option = paramPigeonDocumentOption;
  }
  
  public void setPath(String paramString)
  {
    if (paramString != null)
    {
      path = paramString;
      return;
    }
    throw new IllegalStateException("Nonnull field \"path\" is null.");
  }
  
  public void setType(GeneratedAndroidFirebaseFirestore.PigeonTransactionType paramPigeonTransactionType)
  {
    if (paramPigeonTransactionType != null)
    {
      type = paramPigeonTransactionType;
      return;
    }
    throw new IllegalStateException("Nonnull field \"type\" is null.");
  }
  
  public ArrayList<Object> toList()
  {
    ArrayList localArrayList = new ArrayList(4);
    Object localObject1 = type;
    Object localObject2 = null;
    if (localObject1 == null) {
      localObject1 = null;
    } else {
      localObject1 = Integer.valueOf(index);
    }
    localArrayList.add(localObject1);
    localArrayList.add(path);
    localArrayList.add(data);
    localObject1 = option;
    if (localObject1 == null) {
      localObject1 = localObject2;
    } else {
      localObject1 = ((GeneratedAndroidFirebaseFirestore.PigeonDocumentOption)localObject1).toList();
    }
    localArrayList.add(localObject1);
    return localArrayList;
  }
  
  public static final class Builder
  {
    private Map<String, Object> data;
    private GeneratedAndroidFirebaseFirestore.PigeonDocumentOption option;
    private String path;
    private GeneratedAndroidFirebaseFirestore.PigeonTransactionType type;
    
    public GeneratedAndroidFirebaseFirestore.PigeonTransactionCommand build()
    {
      GeneratedAndroidFirebaseFirestore.PigeonTransactionCommand localPigeonTransactionCommand = new GeneratedAndroidFirebaseFirestore.PigeonTransactionCommand();
      localPigeonTransactionCommand.setType(type);
      localPigeonTransactionCommand.setPath(path);
      localPigeonTransactionCommand.setData(data);
      localPigeonTransactionCommand.setOption(option);
      return localPigeonTransactionCommand;
    }
    
    public Builder setData(Map<String, Object> paramMap)
    {
      data = paramMap;
      return this;
    }
    
    public Builder setOption(GeneratedAndroidFirebaseFirestore.PigeonDocumentOption paramPigeonDocumentOption)
    {
      option = paramPigeonDocumentOption;
      return this;
    }
    
    public Builder setPath(String paramString)
    {
      path = paramString;
      return this;
    }
    
    public Builder setType(GeneratedAndroidFirebaseFirestore.PigeonTransactionType paramPigeonTransactionType)
    {
      type = paramPigeonTransactionType;
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.firebase.firestore.GeneratedAndroidFirebaseFirestore.PigeonTransactionCommand
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */