package io.flutter.plugins.firebase.firestore;

import java.util.ArrayList;

public final class GeneratedAndroidFirebaseFirestore$AggregateQueryResponse
{
  private String field;
  private GeneratedAndroidFirebaseFirestore.AggregateType type;
  private Double value;
  
  public static AggregateQueryResponse fromList(ArrayList<Object> paramArrayList)
  {
    AggregateQueryResponse localAggregateQueryResponse = new AggregateQueryResponse();
    Object localObject = paramArrayList.get(0);
    localAggregateQueryResponse.setType(GeneratedAndroidFirebaseFirestore.AggregateType.values()[((Integer)localObject).intValue()]);
    localAggregateQueryResponse.setField((String)paramArrayList.get(1));
    localAggregateQueryResponse.setValue((Double)paramArrayList.get(2));
    return localAggregateQueryResponse;
  }
  
  public String getField()
  {
    return field;
  }
  
  public GeneratedAndroidFirebaseFirestore.AggregateType getType()
  {
    return type;
  }
  
  public Double getValue()
  {
    return value;
  }
  
  public void setField(String paramString)
  {
    field = paramString;
  }
  
  public void setType(GeneratedAndroidFirebaseFirestore.AggregateType paramAggregateType)
  {
    if (paramAggregateType != null)
    {
      type = paramAggregateType;
      return;
    }
    throw new IllegalStateException("Nonnull field \"type\" is null.");
  }
  
  public void setValue(Double paramDouble)
  {
    value = paramDouble;
  }
  
  public ArrayList<Object> toList()
  {
    ArrayList localArrayList = new ArrayList(3);
    Object localObject = type;
    if (localObject == null) {
      localObject = null;
    } else {
      localObject = Integer.valueOf(index);
    }
    localArrayList.add(localObject);
    localArrayList.add(field);
    localArrayList.add(value);
    return localArrayList;
  }
  
  public static final class Builder
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
}

/* Location:
 * Qualified Name:     io.flutter.plugins.firebase.firestore.GeneratedAndroidFirebaseFirestore.AggregateQueryResponse
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */