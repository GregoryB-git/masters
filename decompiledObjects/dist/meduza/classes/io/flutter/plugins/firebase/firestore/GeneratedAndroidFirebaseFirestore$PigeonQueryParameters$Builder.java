package io.flutter.plugins.firebase.firestore;

import java.util.List;
import java.util.Map;

public final class GeneratedAndroidFirebaseFirestore$PigeonQueryParameters$Builder
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

/* Location:
 * Qualified Name:     io.flutter.plugins.firebase.firestore.GeneratedAndroidFirebaseFirestore.PigeonQueryParameters.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */