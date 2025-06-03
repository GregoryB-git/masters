package io.flutter.plugins.firebase.firestore;

public final class GeneratedAndroidFirebaseFirestore$PigeonDocumentChange$Builder
{
  private GeneratedAndroidFirebaseFirestore.PigeonDocumentSnapshot document;
  private Long newIndex;
  private Long oldIndex;
  private GeneratedAndroidFirebaseFirestore.DocumentChangeType type;
  
  public GeneratedAndroidFirebaseFirestore.PigeonDocumentChange build()
  {
    GeneratedAndroidFirebaseFirestore.PigeonDocumentChange localPigeonDocumentChange = new GeneratedAndroidFirebaseFirestore.PigeonDocumentChange();
    localPigeonDocumentChange.setType(type);
    localPigeonDocumentChange.setDocument(document);
    localPigeonDocumentChange.setOldIndex(oldIndex);
    localPigeonDocumentChange.setNewIndex(newIndex);
    return localPigeonDocumentChange;
  }
  
  public Builder setDocument(GeneratedAndroidFirebaseFirestore.PigeonDocumentSnapshot paramPigeonDocumentSnapshot)
  {
    document = paramPigeonDocumentSnapshot;
    return this;
  }
  
  public Builder setNewIndex(Long paramLong)
  {
    newIndex = paramLong;
    return this;
  }
  
  public Builder setOldIndex(Long paramLong)
  {
    oldIndex = paramLong;
    return this;
  }
  
  public Builder setType(GeneratedAndroidFirebaseFirestore.DocumentChangeType paramDocumentChangeType)
  {
    type = paramDocumentChangeType;
    return this;
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.firebase.firestore.GeneratedAndroidFirebaseFirestore.PigeonDocumentChange.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */