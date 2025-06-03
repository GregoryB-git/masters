package io.flutter.plugins.firebase.firestore;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class GeneratedAndroidFirebaseFirestore$PigeonQueryParameters
{
  private List<Object> endAt;
  private List<Object> endBefore;
  private Map<String, Object> filters;
  private Long limit;
  private Long limitToLast;
  private List<List<Object>> orderBy;
  private List<Object> startAfter;
  private List<Object> startAt;
  private List<List<Object>> where;
  
  public static PigeonQueryParameters fromList(ArrayList<Object> paramArrayList)
  {
    PigeonQueryParameters localPigeonQueryParameters = new PigeonQueryParameters();
    localPigeonQueryParameters.setWhere((List)paramArrayList.get(0));
    localPigeonQueryParameters.setOrderBy((List)paramArrayList.get(1));
    Object localObject1 = paramArrayList.get(2);
    Object localObject2 = null;
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
    localPigeonQueryParameters.setLimit((Long)localObject1);
    localObject1 = paramArrayList.get(3);
    if (localObject1 == null)
    {
      localObject1 = localObject2;
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
    localPigeonQueryParameters.setLimitToLast((Long)localObject1);
    localPigeonQueryParameters.setStartAt((List)paramArrayList.get(4));
    localPigeonQueryParameters.setStartAfter((List)paramArrayList.get(5));
    localPigeonQueryParameters.setEndAt((List)paramArrayList.get(6));
    localPigeonQueryParameters.setEndBefore((List)paramArrayList.get(7));
    localPigeonQueryParameters.setFilters((Map)paramArrayList.get(8));
    return localPigeonQueryParameters;
  }
  
  public List<Object> getEndAt()
  {
    return endAt;
  }
  
  public List<Object> getEndBefore()
  {
    return endBefore;
  }
  
  public Map<String, Object> getFilters()
  {
    return filters;
  }
  
  public Long getLimit()
  {
    return limit;
  }
  
  public Long getLimitToLast()
  {
    return limitToLast;
  }
  
  public List<List<Object>> getOrderBy()
  {
    return orderBy;
  }
  
  public List<Object> getStartAfter()
  {
    return startAfter;
  }
  
  public List<Object> getStartAt()
  {
    return startAt;
  }
  
  public List<List<Object>> getWhere()
  {
    return where;
  }
  
  public void setEndAt(List<Object> paramList)
  {
    endAt = paramList;
  }
  
  public void setEndBefore(List<Object> paramList)
  {
    endBefore = paramList;
  }
  
  public void setFilters(Map<String, Object> paramMap)
  {
    filters = paramMap;
  }
  
  public void setLimit(Long paramLong)
  {
    limit = paramLong;
  }
  
  public void setLimitToLast(Long paramLong)
  {
    limitToLast = paramLong;
  }
  
  public void setOrderBy(List<List<Object>> paramList)
  {
    orderBy = paramList;
  }
  
  public void setStartAfter(List<Object> paramList)
  {
    startAfter = paramList;
  }
  
  public void setStartAt(List<Object> paramList)
  {
    startAt = paramList;
  }
  
  public void setWhere(List<List<Object>> paramList)
  {
    where = paramList;
  }
  
  public ArrayList<Object> toList()
  {
    ArrayList localArrayList = new ArrayList(9);
    localArrayList.add(where);
    localArrayList.add(orderBy);
    localArrayList.add(limit);
    localArrayList.add(limitToLast);
    localArrayList.add(startAt);
    localArrayList.add(startAfter);
    localArrayList.add(endAt);
    localArrayList.add(endBefore);
    localArrayList.add(filters);
    return localArrayList;
  }
  
  public static final class Builder
  {
    private List<Object> endAt;
    private List<Object> endBefore;
    private Map<String, Object> filters;
    private Long limit;
    private Long limitToLast;
    private List<List<Object>> orderBy;
    private List<Object> startAfter;
    private List<Object> startAt;
    private List<List<Object>> where;
    
    public GeneratedAndroidFirebaseFirestore.PigeonQueryParameters build()
    {
      GeneratedAndroidFirebaseFirestore.PigeonQueryParameters localPigeonQueryParameters = new GeneratedAndroidFirebaseFirestore.PigeonQueryParameters();
      localPigeonQueryParameters.setWhere(where);
      localPigeonQueryParameters.setOrderBy(orderBy);
      localPigeonQueryParameters.setLimit(limit);
      localPigeonQueryParameters.setLimitToLast(limitToLast);
      localPigeonQueryParameters.setStartAt(startAt);
      localPigeonQueryParameters.setStartAfter(startAfter);
      localPigeonQueryParameters.setEndAt(endAt);
      localPigeonQueryParameters.setEndBefore(endBefore);
      localPigeonQueryParameters.setFilters(filters);
      return localPigeonQueryParameters;
    }
    
    public Builder setEndAt(List<Object> paramList)
    {
      endAt = paramList;
      return this;
    }
    
    public Builder setEndBefore(List<Object> paramList)
    {
      endBefore = paramList;
      return this;
    }
    
    public Builder setFilters(Map<String, Object> paramMap)
    {
      filters = paramMap;
      return this;
    }
    
    public Builder setLimit(Long paramLong)
    {
      limit = paramLong;
      return this;
    }
    
    public Builder setLimitToLast(Long paramLong)
    {
      limitToLast = paramLong;
      return this;
    }
    
    public Builder setOrderBy(List<List<Object>> paramList)
    {
      orderBy = paramList;
      return this;
    }
    
    public Builder setStartAfter(List<Object> paramList)
    {
      startAfter = paramList;
      return this;
    }
    
    public Builder setStartAt(List<Object> paramList)
    {
      startAt = paramList;
      return this;
    }
    
    public Builder setWhere(List<List<Object>> paramList)
    {
      where = paramList;
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.firebase.firestore.GeneratedAndroidFirebaseFirestore.PigeonQueryParameters
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */