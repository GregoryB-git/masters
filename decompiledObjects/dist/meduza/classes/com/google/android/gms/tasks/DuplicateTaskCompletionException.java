package com.google.android.gms.tasks;

public final class DuplicateTaskCompletionException
  extends IllegalStateException
{
  private DuplicateTaskCompletionException(String paramString, Throwable paramThrowable)
  {
    super(paramString, paramThrowable);
  }
  
  public static IllegalStateException of(Task<?> paramTask)
  {
    if (!paramTask.isComplete()) {
      return new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
    }
    Exception localException = paramTask.getException();
    if (localException != null) {
      paramTask = "failure";
    } else if (paramTask.isSuccessful()) {
      paramTask = "result ".concat(String.valueOf(paramTask.getResult()));
    } else if (paramTask.isCanceled()) {
      paramTask = "cancellation";
    } else {
      paramTask = "unknown issue";
    }
    return new DuplicateTaskCompletionException("Complete with: ".concat(paramTask), localException);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.tasks.DuplicateTaskCompletionException
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */