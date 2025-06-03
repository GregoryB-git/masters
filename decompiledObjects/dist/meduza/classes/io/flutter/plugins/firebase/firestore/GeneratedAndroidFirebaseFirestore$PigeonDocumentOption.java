package io.flutter.plugins.firebase.firestore;

import java.util.ArrayList;
import java.util.List;

public final class GeneratedAndroidFirebaseFirestore$PigeonDocumentOption
{
  private Boolean merge;
  private List<List<String>> mergeFields;
  
  public static PigeonDocumentOption fromList(ArrayList<Object> paramArrayList)
  {
    PigeonDocumentOption localPigeonDocumentOption = new PigeonDocumentOption();
    localPigeonDocumentOption.setMerge((Boolean)paramArrayList.get(0));
    localPigeonDocumentOption.setMergeFields((List)paramArrayList.get(1));
    return localPigeonDocumentOption;
  }
  
  public Boolean getMerge()
  {
    return merge;
  }
  
  public List<List<String>> getMergeFields()
  {
    return mergeFields;
  }
  
  public void setMerge(Boolean paramBoolean)
  {
    merge = paramBoolean;
  }
  
  public void setMergeFields(List<List<String>> paramList)
  {
    mergeFields = paramList;
  }
  
  public ArrayList<Object> toList()
  {
    ArrayList localArrayList = new ArrayList(2);
    localArrayList.add(merge);
    localArrayList.add(mergeFields);
    return localArrayList;
  }
  
  public static final class Builder
  {
    private Boolean merge;
    private List<List<String>> mergeFields;
    
    public GeneratedAndroidFirebaseFirestore.PigeonDocumentOption build()
    {
      GeneratedAndroidFirebaseFirestore.PigeonDocumentOption localPigeonDocumentOption = new GeneratedAndroidFirebaseFirestore.PigeonDocumentOption();
      localPigeonDocumentOption.setMerge(merge);
      localPigeonDocumentOption.setMergeFields(mergeFields);
      return localPigeonDocumentOption;
    }
    
    public Builder setMerge(Boolean paramBoolean)
    {
      merge = paramBoolean;
      return this;
    }
    
    public Builder setMergeFields(List<List<String>> paramList)
    {
      mergeFields = paramList;
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.firebase.firestore.GeneratedAndroidFirebaseFirestore.PigeonDocumentOption
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */