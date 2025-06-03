package io.flutter.plugins.firebase.firestore;

import java.util.List;

public final class GeneratedAndroidFirebaseFirestore$PigeonDocumentOption$Builder
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

/* Location:
 * Qualified Name:     io.flutter.plugins.firebase.firestore.GeneratedAndroidFirebaseFirestore.PigeonDocumentOption.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */