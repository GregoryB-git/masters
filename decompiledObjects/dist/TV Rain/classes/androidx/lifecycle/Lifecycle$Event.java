package androidx.lifecycle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public enum Lifecycle$Event
{
  static
  {
    Event localEvent1 = new Event("ON_CREATE", 0);
    ON_CREATE = localEvent1;
    Event localEvent2 = new Event("ON_START", 1);
    ON_START = localEvent2;
    Event localEvent3 = new Event("ON_RESUME", 2);
    ON_RESUME = localEvent3;
    Event localEvent4 = new Event("ON_PAUSE", 3);
    ON_PAUSE = localEvent4;
    Event localEvent5 = new Event("ON_STOP", 4);
    ON_STOP = localEvent5;
    Event localEvent6 = new Event("ON_DESTROY", 5);
    ON_DESTROY = localEvent6;
    Event localEvent7 = new Event("ON_ANY", 6);
    ON_ANY = localEvent7;
    $VALUES = new Event[] { localEvent1, localEvent2, localEvent3, localEvent4, localEvent5, localEvent6, localEvent7 };
  }
  
  private Lifecycle$Event() {}
  
  @Nullable
  public static Event downFrom(@NonNull Lifecycle.State paramState)
  {
    int i = Lifecycle.1.$SwitchMap$androidx$lifecycle$Lifecycle$State[paramState.ordinal()];
    if (i != 1)
    {
      if (i != 2)
      {
        if (i != 3) {
          return null;
        }
        return ON_PAUSE;
      }
      return ON_STOP;
    }
    return ON_DESTROY;
  }
  
  @Nullable
  public static Event downTo(@NonNull Lifecycle.State paramState)
  {
    int i = Lifecycle.1.$SwitchMap$androidx$lifecycle$Lifecycle$State[paramState.ordinal()];
    if (i != 1)
    {
      if (i != 2)
      {
        if (i != 4) {
          return null;
        }
        return ON_DESTROY;
      }
      return ON_PAUSE;
    }
    return ON_STOP;
  }
  
  @Nullable
  public static Event upFrom(@NonNull Lifecycle.State paramState)
  {
    int i = Lifecycle.1.$SwitchMap$androidx$lifecycle$Lifecycle$State[paramState.ordinal()];
    if (i != 1)
    {
      if (i != 2)
      {
        if (i != 5) {
          return null;
        }
        return ON_CREATE;
      }
      return ON_RESUME;
    }
    return ON_START;
  }
  
  @Nullable
  public static Event upTo(@NonNull Lifecycle.State paramState)
  {
    int i = Lifecycle.1.$SwitchMap$androidx$lifecycle$Lifecycle$State[paramState.ordinal()];
    if (i != 1)
    {
      if (i != 2)
      {
        if (i != 3) {
          return null;
        }
        return ON_RESUME;
      }
      return ON_START;
    }
    return ON_CREATE;
  }
  
  @NonNull
  public Lifecycle.State getTargetState()
  {
    switch (Lifecycle.1.$SwitchMap$androidx$lifecycle$Lifecycle$Event[ordinal()])
    {
    default: 
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(this);
      localStringBuilder.append(" has no target state");
      throw new IllegalArgumentException(localStringBuilder.toString());
    case 6: 
      return Lifecycle.State.DESTROYED;
    case 5: 
      return Lifecycle.State.RESUMED;
    case 3: 
    case 4: 
      return Lifecycle.State.STARTED;
    }
    return Lifecycle.State.CREATED;
  }
}

/* Location:
 * Qualified Name:     androidx.lifecycle.Lifecycle.Event
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */