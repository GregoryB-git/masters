package io.flutter.plugins.firebase.firestore;

import java.util.ArrayList;
import java.util.Map;

public final class GeneratedAndroidFirebaseFirestore$DocumentReferenceRequest
{
  private Map<Object, Object> data;
  private GeneratedAndroidFirebaseFirestore.PigeonDocumentOption option;
  private String path;
  private GeneratedAndroidFirebaseFirestore.ServerTimestampBehavior serverTimestampBehavior;
  private GeneratedAndroidFirebaseFirestore.Source source;
  
  public static DocumentReferenceRequest fromList(ArrayList<Object> paramArrayList)
  {
    DocumentReferenceRequest localDocumentReferenceRequest = new DocumentReferenceRequest();
    localDocumentReferenceRequest.setPath((String)paramArrayList.get(0));
    localDocumentReferenceRequest.setData((Map)paramArrayList.get(1));
    Object localObject1 = paramArrayList.get(2);
    Object localObject2 = null;
    if (localObject1 == null) {
      localObject1 = null;
    } else {
      localObject1 = GeneratedAndroidFirebaseFirestore.PigeonDocumentOption.fromList((ArrayList)localObject1);
    }
    localDocumentReferenceRequest.setOption((GeneratedAndroidFirebaseFirestore.PigeonDocumentOption)localObject1);
    localObject1 = paramArrayList.get(3);
    if (localObject1 == null) {
      localObject1 = null;
    } else {
      localObject1 = GeneratedAndroidFirebaseFirestore.Source.values()[((Integer)localObject1).intValue()];
    }
    localDocumentReferenceRequest.setSource((GeneratedAndroidFirebaseFirestore.Source)localObject1);
    paramArrayList = paramArrayList.get(4);
    if (paramArrayList == null) {
      paramArrayList = (ArrayList<Object>)localObject2;
    } else {
      paramArrayList = GeneratedAndroidFirebaseFirestore.ServerTimestampBehavior.values()[((Integer)paramArrayList).intValue()];
    }
    localDocumentReferenceRequest.setServerTimestampBehavior(paramArrayList);
    return localDocumentReferenceRequest;
  }
  
  public Map<Object, Object> getData()
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
  
  public GeneratedAndroidFirebaseFirestore.ServerTimestampBehavior getServerTimestampBehavior()
  {
    return serverTimestampBehavior;
  }
  
  public GeneratedAndroidFirebaseFirestore.Source getSource()
  {
    return source;
  }
  
  public void setData(Map<Object, Object> paramMap)
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
  
  public void setServerTimestampBehavior(GeneratedAndroidFirebaseFirestore.ServerTimestampBehavior paramServerTimestampBehavior)
  {
    serverTimestampBehavior = paramServerTimestampBehavior;
  }
  
  public void setSource(GeneratedAndroidFirebaseFirestore.Source paramSource)
  {
    source = paramSource;
  }
  
  public ArrayList<Object> toList()
  {
    ArrayList localArrayList = new ArrayList(5);
    localArrayList.add(path);
    localArrayList.add(data);
    Object localObject1 = option;
    Object localObject2 = null;
    if (localObject1 == null) {
      localObject1 = null;
    } else {
      localObject1 = ((GeneratedAndroidFirebaseFirestore.PigeonDocumentOption)localObject1).toList();
    }
    localArrayList.add(localObject1);
    localObject1 = source;
    if (localObject1 == null) {
      localObject1 = null;
    } else {
      localObject1 = Integer.valueOf(index);
    }
    localArrayList.add(localObject1);
    localObject1 = serverTimestampBehavior;
    if (localObject1 == null) {
      localObject1 = localObject2;
    } else {
      localObject1 = Integer.valueOf(index);
    }
    localArrayList.add(localObject1);
    return localArrayList;
  }
  
  public static final class Builder
  {
    private Map<Object, Object> data;
    private GeneratedAndroidFirebaseFirestore.PigeonDocumentOption option;
    private String path;
    private GeneratedAndroidFirebaseFirestore.ServerTimestampBehavior serverTimestampBehavior;
    private GeneratedAndroidFirebaseFirestore.Source source;
    
    public GeneratedAndroidFirebaseFirestore.DocumentReferenceRequest build()
    {
      GeneratedAndroidFirebaseFirestore.DocumentReferenceRequest localDocumentReferenceRequest = new GeneratedAndroidFirebaseFirestore.DocumentReferenceRequest();
      localDocumentReferenceRequest.setPath(path);
      localDocumentReferenceRequest.setData(data);
      localDocumentReferenceRequest.setOption(option);
      localDocumentReferenceRequest.setSource(source);
      localDocumentReferenceRequest.setServerTimestampBehavior(serverTimestampBehavior);
      return localDocumentReferenceRequest;
    }
    
    public Builder setData(Map<Object, Object> paramMap)
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
}

/* Location:
 * Qualified Name:     io.flutter.plugins.firebase.firestore.GeneratedAndroidFirebaseFirestore.DocumentReferenceRequest
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */