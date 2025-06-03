package io.flutter.plugins.firebase.firestore;

import java.util.ArrayList;
import java.util.Map;

public final class GeneratedAndroidFirebaseFirestore$PigeonDocumentSnapshot
{
  private Map<String, Object> data;
  private GeneratedAndroidFirebaseFirestore.PigeonSnapshotMetadata metadata;
  private String path;
  
  public static PigeonDocumentSnapshot fromList(ArrayList<Object> paramArrayList)
  {
    PigeonDocumentSnapshot localPigeonDocumentSnapshot = new PigeonDocumentSnapshot();
    localPigeonDocumentSnapshot.setPath((String)paramArrayList.get(0));
    localPigeonDocumentSnapshot.setData((Map)paramArrayList.get(1));
    paramArrayList = paramArrayList.get(2);
    if (paramArrayList == null) {
      paramArrayList = null;
    } else {
      paramArrayList = GeneratedAndroidFirebaseFirestore.PigeonSnapshotMetadata.fromList((ArrayList)paramArrayList);
    }
    localPigeonDocumentSnapshot.setMetadata(paramArrayList);
    return localPigeonDocumentSnapshot;
  }
  
  public Map<String, Object> getData()
  {
    return data;
  }
  
  public GeneratedAndroidFirebaseFirestore.PigeonSnapshotMetadata getMetadata()
  {
    return metadata;
  }
  
  public String getPath()
  {
    return path;
  }
  
  public void setData(Map<String, Object> paramMap)
  {
    data = paramMap;
  }
  
  public void setMetadata(GeneratedAndroidFirebaseFirestore.PigeonSnapshotMetadata paramPigeonSnapshotMetadata)
  {
    if (paramPigeonSnapshotMetadata != null)
    {
      metadata = paramPigeonSnapshotMetadata;
      return;
    }
    throw new IllegalStateException("Nonnull field \"metadata\" is null.");
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
  
  public ArrayList<Object> toList()
  {
    ArrayList localArrayList = new ArrayList(3);
    localArrayList.add(path);
    localArrayList.add(data);
    Object localObject = metadata;
    if (localObject == null) {
      localObject = null;
    } else {
      localObject = ((GeneratedAndroidFirebaseFirestore.PigeonSnapshotMetadata)localObject).toList();
    }
    localArrayList.add(localObject);
    return localArrayList;
  }
  
  public static final class Builder
  {
    private Map<String, Object> data;
    private GeneratedAndroidFirebaseFirestore.PigeonSnapshotMetadata metadata;
    private String path;
    
    public GeneratedAndroidFirebaseFirestore.PigeonDocumentSnapshot build()
    {
      GeneratedAndroidFirebaseFirestore.PigeonDocumentSnapshot localPigeonDocumentSnapshot = new GeneratedAndroidFirebaseFirestore.PigeonDocumentSnapshot();
      localPigeonDocumentSnapshot.setPath(path);
      localPigeonDocumentSnapshot.setData(data);
      localPigeonDocumentSnapshot.setMetadata(metadata);
      return localPigeonDocumentSnapshot;
    }
    
    public Builder setData(Map<String, Object> paramMap)
    {
      data = paramMap;
      return this;
    }
    
    public Builder setMetadata(GeneratedAndroidFirebaseFirestore.PigeonSnapshotMetadata paramPigeonSnapshotMetadata)
    {
      metadata = paramPigeonSnapshotMetadata;
      return this;
    }
    
    public Builder setPath(String paramString)
    {
      path = paramString;
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.firebase.firestore.GeneratedAndroidFirebaseFirestore.PigeonDocumentSnapshot
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */