package io.flutter.plugins.firebase.firestore;

import java.util.List;

public final class GeneratedAndroidFirebaseFirestore$PigeonQuerySnapshot$Builder
{
  private List<GeneratedAndroidFirebaseFirestore.PigeonDocumentChange> documentChanges;
  private List<GeneratedAndroidFirebaseFirestore.PigeonDocumentSnapshot> documents;
  private GeneratedAndroidFirebaseFirestore.PigeonSnapshotMetadata metadata;
  
  public GeneratedAndroidFirebaseFirestore.PigeonQuerySnapshot build()
  {
    GeneratedAndroidFirebaseFirestore.PigeonQuerySnapshot localPigeonQuerySnapshot = new GeneratedAndroidFirebaseFirestore.PigeonQuerySnapshot();
    localPigeonQuerySnapshot.setDocuments(documents);
    localPigeonQuerySnapshot.setDocumentChanges(documentChanges);
    localPigeonQuerySnapshot.setMetadata(metadata);
    return localPigeonQuerySnapshot;
  }
  
  public Builder setDocumentChanges(List<GeneratedAndroidFirebaseFirestore.PigeonDocumentChange> paramList)
  {
    documentChanges = paramList;
    return this;
  }
  
  public Builder setDocuments(List<GeneratedAndroidFirebaseFirestore.PigeonDocumentSnapshot> paramList)
  {
    documents = paramList;
    return this;
  }
  
  public Builder setMetadata(GeneratedAndroidFirebaseFirestore.PigeonSnapshotMetadata paramPigeonSnapshotMetadata)
  {
    metadata = paramPigeonSnapshotMetadata;
    return this;
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.firebase.firestore.GeneratedAndroidFirebaseFirestore.PigeonQuerySnapshot.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */