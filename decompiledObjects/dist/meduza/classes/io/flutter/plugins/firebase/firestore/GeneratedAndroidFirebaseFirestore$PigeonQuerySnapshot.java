package io.flutter.plugins.firebase.firestore;

import java.util.ArrayList;
import java.util.List;

public final class GeneratedAndroidFirebaseFirestore$PigeonQuerySnapshot
{
  private List<GeneratedAndroidFirebaseFirestore.PigeonDocumentChange> documentChanges;
  private List<GeneratedAndroidFirebaseFirestore.PigeonDocumentSnapshot> documents;
  private GeneratedAndroidFirebaseFirestore.PigeonSnapshotMetadata metadata;
  
  public static PigeonQuerySnapshot fromList(ArrayList<Object> paramArrayList)
  {
    PigeonQuerySnapshot localPigeonQuerySnapshot = new PigeonQuerySnapshot();
    localPigeonQuerySnapshot.setDocuments((List)paramArrayList.get(0));
    localPigeonQuerySnapshot.setDocumentChanges((List)paramArrayList.get(1));
    paramArrayList = paramArrayList.get(2);
    if (paramArrayList == null) {
      paramArrayList = null;
    } else {
      paramArrayList = GeneratedAndroidFirebaseFirestore.PigeonSnapshotMetadata.fromList((ArrayList)paramArrayList);
    }
    localPigeonQuerySnapshot.setMetadata(paramArrayList);
    return localPigeonQuerySnapshot;
  }
  
  public List<GeneratedAndroidFirebaseFirestore.PigeonDocumentChange> getDocumentChanges()
  {
    return documentChanges;
  }
  
  public List<GeneratedAndroidFirebaseFirestore.PigeonDocumentSnapshot> getDocuments()
  {
    return documents;
  }
  
  public GeneratedAndroidFirebaseFirestore.PigeonSnapshotMetadata getMetadata()
  {
    return metadata;
  }
  
  public void setDocumentChanges(List<GeneratedAndroidFirebaseFirestore.PigeonDocumentChange> paramList)
  {
    if (paramList != null)
    {
      documentChanges = paramList;
      return;
    }
    throw new IllegalStateException("Nonnull field \"documentChanges\" is null.");
  }
  
  public void setDocuments(List<GeneratedAndroidFirebaseFirestore.PigeonDocumentSnapshot> paramList)
  {
    if (paramList != null)
    {
      documents = paramList;
      return;
    }
    throw new IllegalStateException("Nonnull field \"documents\" is null.");
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
  
  public ArrayList<Object> toList()
  {
    ArrayList localArrayList = new ArrayList(3);
    localArrayList.add(documents);
    localArrayList.add(documentChanges);
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
}

/* Location:
 * Qualified Name:     io.flutter.plugins.firebase.firestore.GeneratedAndroidFirebaseFirestore.PigeonQuerySnapshot
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */