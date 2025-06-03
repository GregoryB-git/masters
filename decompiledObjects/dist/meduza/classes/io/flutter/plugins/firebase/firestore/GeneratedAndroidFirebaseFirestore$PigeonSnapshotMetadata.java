package io.flutter.plugins.firebase.firestore;

import java.util.ArrayList;

public final class GeneratedAndroidFirebaseFirestore$PigeonSnapshotMetadata
{
  private Boolean hasPendingWrites;
  private Boolean isFromCache;
  
  public static PigeonSnapshotMetadata fromList(ArrayList<Object> paramArrayList)
  {
    PigeonSnapshotMetadata localPigeonSnapshotMetadata = new PigeonSnapshotMetadata();
    localPigeonSnapshotMetadata.setHasPendingWrites((Boolean)paramArrayList.get(0));
    localPigeonSnapshotMetadata.setIsFromCache((Boolean)paramArrayList.get(1));
    return localPigeonSnapshotMetadata;
  }
  
  public Boolean getHasPendingWrites()
  {
    return hasPendingWrites;
  }
  
  public Boolean getIsFromCache()
  {
    return isFromCache;
  }
  
  public void setHasPendingWrites(Boolean paramBoolean)
  {
    if (paramBoolean != null)
    {
      hasPendingWrites = paramBoolean;
      return;
    }
    throw new IllegalStateException("Nonnull field \"hasPendingWrites\" is null.");
  }
  
  public void setIsFromCache(Boolean paramBoolean)
  {
    if (paramBoolean != null)
    {
      isFromCache = paramBoolean;
      return;
    }
    throw new IllegalStateException("Nonnull field \"isFromCache\" is null.");
  }
  
  public ArrayList<Object> toList()
  {
    ArrayList localArrayList = new ArrayList(2);
    localArrayList.add(hasPendingWrites);
    localArrayList.add(isFromCache);
    return localArrayList;
  }
  
  public static final class Builder
  {
    private Boolean hasPendingWrites;
    private Boolean isFromCache;
    
    public GeneratedAndroidFirebaseFirestore.PigeonSnapshotMetadata build()
    {
      GeneratedAndroidFirebaseFirestore.PigeonSnapshotMetadata localPigeonSnapshotMetadata = new GeneratedAndroidFirebaseFirestore.PigeonSnapshotMetadata();
      localPigeonSnapshotMetadata.setHasPendingWrites(hasPendingWrites);
      localPigeonSnapshotMetadata.setIsFromCache(isFromCache);
      return localPigeonSnapshotMetadata;
    }
    
    public Builder setHasPendingWrites(Boolean paramBoolean)
    {
      hasPendingWrites = paramBoolean;
      return this;
    }
    
    public Builder setIsFromCache(Boolean paramBoolean)
    {
      isFromCache = paramBoolean;
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.firebase.firestore.GeneratedAndroidFirebaseFirestore.PigeonSnapshotMetadata
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */