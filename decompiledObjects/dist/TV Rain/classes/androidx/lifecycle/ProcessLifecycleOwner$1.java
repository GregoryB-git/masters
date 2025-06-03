package androidx.lifecycle;

class ProcessLifecycleOwner$1
  implements Runnable
{
  public ProcessLifecycleOwner$1(ProcessLifecycleOwner paramProcessLifecycleOwner) {}
  
  public void run()
  {
    this$0.dispatchPauseIfNeeded();
    this$0.dispatchStopIfNeeded();
  }
}

/* Location:
 * Qualified Name:     androidx.lifecycle.ProcessLifecycleOwner.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */