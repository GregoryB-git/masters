package io.flutter.plugins.firebase.firestore;

import java.util.ArrayList;

public final class GeneratedAndroidFirebaseFirestore$PigeonDocumentChange
{
  private GeneratedAndroidFirebaseFirestore.PigeonDocumentSnapshot document;
  private Long newIndex;
  private Long oldIndex;
  private GeneratedAndroidFirebaseFirestore.DocumentChangeType type;
  
  public static PigeonDocumentChange fromList(ArrayList<Object> paramArrayList)
  {
    PigeonDocumentChange localPigeonDocumentChange = new PigeonDocumentChange();
    Object localObject1 = paramArrayList.get(0);
    localPigeonDocumentChange.setType(GeneratedAndroidFirebaseFirestore.DocumentChangeType.values()[((Integer)localObject1).intValue()]);
    localObject1 = paramArrayList.get(1);
    Object localObject2 = null;
    if (localObject1 == null) {
      localObject1 = null;
    } else {
      localObject1 = GeneratedAndroidFirebaseFirestore.PigeonDocumentSnapshot.fromList((ArrayList)localObject1);
    }
    localPigeonDocumentChange.setDocument((GeneratedAndroidFirebaseFirestore.PigeonDocumentSnapshot)localObject1);
    localObject1 = paramArrayList.get(2);
    long l;
    if (localObject1 == null)
    {
      localObject1 = null;
    }
    else
    {
      if ((localObject1 instanceof Integer)) {
        l = ((Integer)localObject1).intValue();
      } else {
        l = ((Long)localObject1).longValue();
      }
      localObject1 = Long.valueOf(l);
    }
    localPigeonDocumentChange.setOldIndex((Long)localObject1);
    paramArrayList = paramArrayList.get(3);
    if (paramArrayList == null)
    {
      paramArrayList = (ArrayList<Object>)localObject2;
    }
    else
    {
      if ((paramArrayList instanceof Integer)) {
        l = ((Integer)paramArrayList).intValue();
      } else {
        l = ((Long)paramArrayList).longValue();
      }
      paramArrayList = Long.valueOf(l);
    }
    localPigeonDocumentChange.setNewIndex(paramArrayList);
    return localPigeonDocumentChange;
  }
  
  public GeneratedAndroidFirebaseFirestore.PigeonDocumentSnapshot getDocument()
  {
    return document;
  }
  
  public Long getNewIndex()
  {
    return newIndex;
  }
  
  public Long getOldIndex()
  {
    return oldIndex;
  }
  
  public GeneratedAndroidFirebaseFirestore.DocumentChangeType getType()
  {
    return type;
  }
  
  public void setDocument(GeneratedAndroidFirebaseFirestore.PigeonDocumentSnapshot paramPigeonDocumentSnapshot)
  {
    if (paramPigeonDocumentSnapshot != null)
    {
      document = paramPigeonDocumentSnapshot;
      return;
    }
    throw new IllegalStateException("Nonnull field \"document\" is null.");
  }
  
  public void setNewIndex(Long paramLong)
  {
    if (paramLong != null)
    {
      newIndex = paramLong;
      return;
    }
    throw new IllegalStateException("Nonnull field \"newIndex\" is null.");
  }
  
  public void setOldIndex(Long paramLong)
  {
    if (paramLong != null)
    {
      oldIndex = paramLong;
      return;
    }
    throw new IllegalStateException("Nonnull field \"oldIndex\" is null.");
  }
  
  public void setType(GeneratedAndroidFirebaseFirestore.DocumentChangeType paramDocumentChangeType)
  {
    if (paramDocumentChangeType != null)
    {
      type = paramDocumentChangeType;
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
    localObject1 = document;
    if (localObject1 == null) {
      localObject1 = localObject2;
    } else {
      localObject1 = ((GeneratedAndroidFirebaseFirestore.PigeonDocumentSnapshot)localObject1).toList();
    }
    localArrayList.add(localObject1);
    localArrayList.add(oldIndex);
    localArrayList.add(newIndex);
    return localArrayList;
  }
  
  public static final class Builder
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
}

/* Location:
 * Qualified Name:     io.flutter.plugins.firebase.firestore.GeneratedAndroidFirebaseFirestore.PigeonDocumentChange
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */