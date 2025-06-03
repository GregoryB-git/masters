package io.flutter.plugins.firebase.firestore;

import java.util.Map;

public final class GeneratedAndroidFirebaseFirestore$DocumentReferenceRequest$Builder
{
  private Map<Object, Object> data;
  private GeneratedAndroidFirebaseFirestore.PigeonDocumentOption option;
  private String path;
  private GeneratedAndroidFirebaseFirestore.ServerTimestampBehavior serverTimestampBehavior;
  private GeneratedAndroidFirebaseFirestore.Source source;
  
  public GeneratedAndroidFirebaseFirestore.DocumentReferenceRequest build()
  {
    GeneratedAndroidFirebaseFirestore.DocumentReferenceRequest localDocumentReferenceRequest = new GeneratedAndroidFirebaseFirestore.DocumentReferenceRequest();
    localDocumentReferenceRequest.setPath(path);
    localDocumentReferenceRequest.setData(data);
    localDocumentReferenceRequest.setOption(option);
    localDocumentReferenceRequest.setSource(source);
    localDocumentReferenceRequest.setServerTimestampBehavior(serverTimestampBehavior);
    return localDocumentReferenceRequest;
  }
  
  public Builder setData(Map<Object, Object> paramMap)
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
  
  public Builder setServerTimestampBehavior(GeneratedAndroidFirebaseFirestore.ServerTimestampBehavior paramServerTimestampBehavior)
  {
    serverTimestampBehavior = paramServerTimestampBehavior;
    return this;
  }
  
  public Builder setSource(GeneratedAndroidFirebaseFirestore.Source paramSource)
  {
    source = paramSource;
    return this;
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.firebase.firestore.GeneratedAndroidFirebaseFirestore.DocumentReferenceRequest.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */