package io.flutter.plugins.firebase.firestore;

public final class GeneratedAndroidFirebaseFirestore$AggregateQueryResponse$Builder
{
  private String field;
  private GeneratedAndroidFirebaseFirestore.AggregateType type;
  private Double value;
  
  public GeneratedAndroidFirebaseFirestore.AggregateQueryResponse build()
  {
    GeneratedAndroidFirebaseFirestore.AggregateQueryResponse localAggregateQueryResponse = new GeneratedAndroidFirebaseFirestore.AggregateQueryResponse();
    localAggregateQueryResponse.setType(type);
    localAggregateQueryResponse.setField(field);
    localAggregateQueryResponse.setValue(value);
    return localAggregateQueryResponse;
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
  
  public Builder setValue(Double paramDouble)
  {
    value = paramDouble;
    return this;
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.firebase.firestore.GeneratedAndroidFirebaseFirestore.AggregateQueryResponse.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */