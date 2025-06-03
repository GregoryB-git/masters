package androidx.work;

public enum WorkInfo$State
{
  static
  {
    State localState1 = new State("ENQUEUED", 0);
    ENQUEUED = localState1;
    State localState2 = new State("RUNNING", 1);
    RUNNING = localState2;
    State localState3 = new State("SUCCEEDED", 2);
    SUCCEEDED = localState3;
    State localState4 = new State("FAILED", 3);
    FAILED = localState4;
    State localState5 = new State("BLOCKED", 4);
    BLOCKED = localState5;
    State localState6 = new State("CANCELLED", 5);
    CANCELLED = localState6;
    $VALUES = new State[] { localState1, localState2, localState3, localState4, localState5, localState6 };
  }
  
  private WorkInfo$State() {}
  
  public boolean isFinished()
  {
    boolean bool;
    if ((this != SUCCEEDED) && (this != FAILED) && (this != CANCELLED)) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
}

/* Location:
 * Qualified Name:     androidx.work.WorkInfo.State
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */