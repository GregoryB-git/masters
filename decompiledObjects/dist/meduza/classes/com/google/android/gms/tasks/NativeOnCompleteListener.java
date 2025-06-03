package com.google.android.gms.tasks;

public class NativeOnCompleteListener
  implements OnCompleteListener<Object>
{
  private final long zza;
  
  public NativeOnCompleteListener(long paramLong)
  {
    zza = paramLong;
  }
  
  public static void createAndAddCallback(Task<Object> paramTask, long paramLong)
  {
    paramTask.addOnCompleteListener(new NativeOnCompleteListener(paramLong));
  }
  
  public native void nativeOnComplete(long paramLong, Object paramObject, boolean paramBoolean1, boolean paramBoolean2, String paramString);
  
  public void onComplete(Task<Object> paramTask)
  {
    Object localObject1;
    Object localObject2;
    if (paramTask.isSuccessful())
    {
      localObject1 = paramTask.getResult();
      localObject2 = null;
    }
    else
    {
      if (!paramTask.isCanceled())
      {
        localObject1 = paramTask.getException();
        if (localObject1 != null)
        {
          localObject2 = ((Throwable)localObject1).getMessage();
          localObject1 = null;
          break label47;
        }
      }
      localObject1 = null;
      localObject2 = localObject1;
    }
    label47:
    nativeOnComplete(zza, localObject1, paramTask.isSuccessful(), paramTask.isCanceled(), (String)localObject2);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.tasks.NativeOnCompleteListener
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */