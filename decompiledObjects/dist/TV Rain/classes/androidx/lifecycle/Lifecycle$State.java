package androidx.lifecycle;

import androidx.annotation.NonNull;

public enum Lifecycle$State
{
  static
  {
    State localState1 = new State("DESTROYED", 0);
    DESTROYED = localState1;
    State localState2 = new State("INITIALIZED", 1);
    INITIALIZED = localState2;
    State localState3 = new State("CREATED", 2);
    CREATED = localState3;
    State localState4 = new State("STARTED", 3);
    STARTED = localState4;
    State localState5 = new State("RESUMED", 4);
    RESUMED = localState5;
    $VALUES = new State[] { localState1, localState2, localState3, localState4, localState5 };
  }
  
  private Lifecycle$State() {}
  
  public boolean isAtLeast(@NonNull State paramState)
  {
    boolean bool;
    if (compareTo(paramState) >= 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
}

/* Location:
 * Qualified Name:     androidx.lifecycle.Lifecycle.State
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */