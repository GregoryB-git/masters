package io.flutter.plugins.firebase.firestore;

import java.util.Map;

public final class GeneratedAndroidFirebaseFirestore$PigeonDocumentSnapshot$Builder
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

/* Location:
 * Qualified Name:     io.flutter.plugins.firebase.firestore.GeneratedAndroidFirebaseFirestore.PigeonDocumentSnapshot.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */