package com.google.android.datatransport;

import androidx.annotation.Nullable;
import com.google.auto.value.AutoValue;

@AutoValue
public abstract class Event<T>
{
  public static <T> Event<T> ofData(int paramInt, T paramT)
  {
    return new AutoValue_Event(Integer.valueOf(paramInt), paramT, Priority.DEFAULT);
  }
  
  public static <T> Event<T> ofData(T paramT)
  {
    return new AutoValue_Event(null, paramT, Priority.DEFAULT);
  }
  
  public static <T> Event<T> ofTelemetry(int paramInt, T paramT)
  {
    return new AutoValue_Event(Integer.valueOf(paramInt), paramT, Priority.VERY_LOW);
  }
  
  public static <T> Event<T> ofTelemetry(T paramT)
  {
    return new AutoValue_Event(null, paramT, Priority.VERY_LOW);
  }
  
  public static <T> Event<T> ofUrgent(int paramInt, T paramT)
  {
    return new AutoValue_Event(Integer.valueOf(paramInt), paramT, Priority.HIGHEST);
  }
  
  public static <T> Event<T> ofUrgent(T paramT)
  {
    return new AutoValue_Event(null, paramT, Priority.HIGHEST);
  }
  
  @Nullable
  public abstract Integer getCode();
  
  public abstract T getPayload();
  
  public abstract Priority getPriority();
}

/* Location:
 * Qualified Name:     com.google.android.datatransport.Event
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */