package io.flutter.plugins.firebase.firestore;

public final class GeneratedAndroidFirebaseFirestore$AggregateQuery$Builder
{
  private String field;
  private GeneratedAndroidFirebaseFirestore.AggregateType type;
  
  public GeneratedAndroidFirebaseFirestore.AggregateQuery build()
  {
    GeneratedAndroidFirebaseFirestore.AggregateQuery localAggregateQuery = new GeneratedAndroidFirebaseFirestore.AggregateQuery();
    localAggregateQuery.setType(type);
    localAggregateQuery.setField(field);
    return localAggregateQuery;
  }
  
  public Builder setField(String paramString)
  {
    field = paramString;
    return this;
  }
  
  public Builder setType(GeneratedAndroidFirebaseFirestore.AggregateType paramAggregateType)
  {
    type = paramAggregateType;
    return this;
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.firebase.firestore.GeneratedAndroidFirebaseFirestore.AggregateQuery.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */