package androidx.lifecycle;

class ProcessLifecycleOwner$2
  implements ReportFragment.ActivityInitializationListener
{
  public ProcessLifecycleOwner$2(ProcessLifecycleOwner paramProcessLifecycleOwner) {}
  
  public void onCreate() {}
  
  public void onResume()
  {
    this$0.activityResumed();
  }
  
  public void onStart()
  {
    this$0.activityStarted();
  }
}

/* Location:
 * Qualified Name:     androidx.lifecycle.ProcessLifecycleOwner.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */