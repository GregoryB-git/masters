package bolts;

class UnobservedErrorNotifier
{
  private Task<?> task;
  
  public UnobservedErrorNotifier(Task<?> paramTask)
  {
    task = paramTask;
  }
  
  public void finalize()
    throws Throwable
  {
    try
    {
      Task localTask = task;
      if (localTask != null)
      {
        Task.UnobservedExceptionHandler localUnobservedExceptionHandler = Task.getUnobservedExceptionHandler();
        if (localUnobservedExceptionHandler != null)
        {
          UnobservedTaskException localUnobservedTaskException = new bolts/UnobservedTaskException;
          localUnobservedTaskException.<init>(localTask.getError());
          localUnobservedExceptionHandler.unobservedException(localTask, localUnobservedTaskException);
        }
      }
      return;
    }
    finally
    {
      super.finalize();
    }
  }
  
  public void setObserved()
  {
    task = null;
  }
}

/* Location:
 * Qualified Name:     bolts.UnobservedErrorNotifier
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */