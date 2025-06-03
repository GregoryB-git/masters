package io.flutter.plugins.firebase.firestore;

import java.util.Map;

public final class GeneratedAndroidFirebaseFirestore$PigeonTransactionCommand$Builder
{
  private Map<String, Object> data;
  private GeneratedAndroidFirebaseFirestore.PigeonDocumentOption option;
  private String path;
  private GeneratedAndroidFirebaseFirestore.PigeonTransactionType type;
  
  public GeneratedAndroidFirebaseFirestore.PigeonTransactionCommand build()
  {
    GeneratedAndroidFirebaseFirestore.PigeonTransactionCommand localPigeonTransactionCommand = new GeneratedAndroidFirebaseFirestore.PigeonTransactionCommand();
    localPigeonTransactionCommand.setType(type);
    localPigeonTransactionCommand.setPath(path);
    localPigeonTransactionCommand.setData(data);
    localPigeonTransactionCommand.setOption(option);
    return localPigeonTransactionCommand;
  }
  
  public Builder setData(Map<String, Object> paramMap)
  {
    data = paramMap;
    return this;
  }
  
  public Builder setOption(GeneratedAndroidFirebaseFirestore.PigeonDocumentOption paramPigeonDocumentOption)
  {
    option = paramPigeonDocumentOption;
    return this;
  }
  
  public Builder setPath(String paramString)
  {
    path = paramString;
    return this;
  }
  
  public Builder setType(GeneratedAndroidFirebaseFirestore.PigeonTransactionType paramPigeonTransactionType)
  {
    type = paramPigeonTransactionType;
    return this;
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.firebase.firestore.GeneratedAndroidFirebaseFirestore.PigeonTransactionCommand.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */