package com.google.android.datatransport;

import androidx.annotation.Nullable;
import z2;

final class AutoValue_Event<T>
  extends Event<T>
{
  private final Integer code;
  private final T payload;
  private final Priority priority;
  
  public AutoValue_Event(@Nullable Integer paramInteger, T paramT, Priority paramPriority)
  {
    code = paramInteger;
    if (paramT != null)
    {
      payload = paramT;
      if (paramPriority != null)
      {
        priority = paramPriority;
        return;
      }
      throw new NullPointerException("Null priority");
    }
    throw new NullPointerException("Null payload");
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof Event))
    {
      Event localEvent = (Event)paramObject;
      paramObject = code;
      if ((paramObject == null ? localEvent.getCode() != null : !((Integer)paramObject).equals(localEvent.getCode())) || (!payload.equals(localEvent.getPayload())) || (!priority.equals(localEvent.getPriority()))) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  @Nullable
  public Integer getCode()
  {
    return code;
  }
  
  public T getPayload()
  {
    return (T)payload;
  }
  
  public Priority getPriority()
  {
    return priority;
  }
  
  public int hashCode()
  {
    Integer localInteger = code;
    int i;
    if (localInteger == null) {
      i = 0;
    } else {
      i = localInteger.hashCode();
    }
    return ((i ^ 0xF4243) * 1000003 ^ payload.hashCode()) * 1000003 ^ priority.hashCode();
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = z2.t("Event{code=");
    localStringBuilder.append(code);
    localStringBuilder.append(", payload=");
    localStringBuilder.append(payload);
    localStringBuilder.append(", priority=");
    localStringBuilder.append(priority);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     com.google.android.datatransport.AutoValue_Event
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */