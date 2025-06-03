package io.flutter.plugins.firebase.firestore;

import java.util.ArrayList;

public final class GeneratedAndroidFirebaseFirestore$AggregateQuery
{
  private String field;
  private GeneratedAndroidFirebaseFirestore.AggregateType type;
  
  public static AggregateQuery fromList(ArrayList<Object> paramArrayList)
  {
    AggregateQuery localAggregateQuery = new AggregateQuery();
    Object localObject = paramArrayList.get(0);
    localAggregateQuery.setType(GeneratedAndroidFirebaseFirestore.AggregateType.values()[((Integer)localObject).intValue()]);
    localAggregateQuery.setField((String)paramArrayList.get(1));
    return localAggregateQuery;
  }
  
  public String getField()
  {
    return field;
  }
  
  public GeneratedAndroidFirebaseFirestore.AggregateType getType()
  {
    return type;
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
  
  public ArrayList<Object> toList()
  {
    ArrayList localArrayList = new ArrayList(2);
    Object localObject = type;
    if (localObject == null) {
      localObject = null;
    } else {
      localObject = Integer.valueOf(index);
    }
    localArrayList.add(localObject);
    localArrayList.add(field);
    return localArrayList;
  }
  
  public static final class Builder
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
}

/* Location:
 * Qualified Name:     io.flutter.plugins.firebase.firestore.GeneratedAndroidFirebaseFirestore.AggregateQuery
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */