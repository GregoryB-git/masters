package io.flutter.plugins.firebase.firestore;

public final class GeneratedAndroidFirebaseFirestore$PigeonSnapshotMetadata$Builder
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

/* Location:
 * Qualified Name:     io.flutter.plugins.firebase.firestore.GeneratedAndroidFirebaseFirestore.PigeonSnapshotMetadata.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */