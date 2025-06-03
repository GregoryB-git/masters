package androidx.core.os;

import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

public final class CancellationSignal
{
  private boolean mCancelInProgress;
  private Object mCancellationSignalObj;
  private boolean mIsCanceled;
  private OnCancelListener mOnCancelListener;
  
  private void waitForCancelFinishedLocked()
  {
    for (;;)
    {
      if (mCancelInProgress) {}
      try
      {
        wait();
      }
      catch (InterruptedException localInterruptedException) {}
      return;
    }
  }
  
  /* Error */
  public void cancel()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 33	androidx/core/os/CancellationSignal:mIsCanceled	Z
    //   6: ifeq +6 -> 12
    //   9: aload_0
    //   10: monitorexit
    //   11: return
    //   12: aload_0
    //   13: iconst_1
    //   14: putfield 33	androidx/core/os/CancellationSignal:mIsCanceled	Z
    //   17: aload_0
    //   18: iconst_1
    //   19: putfield 27	androidx/core/os/CancellationSignal:mCancelInProgress	Z
    //   22: aload_0
    //   23: getfield 35	androidx/core/os/CancellationSignal:mOnCancelListener	Landroidx/core/os/CancellationSignal$OnCancelListener;
    //   26: astore_1
    //   27: aload_0
    //   28: getfield 37	androidx/core/os/CancellationSignal:mCancellationSignalObj	Ljava/lang/Object;
    //   31: astore_2
    //   32: aload_0
    //   33: monitorexit
    //   34: aload_1
    //   35: ifnull +16 -> 51
    //   38: aload_1
    //   39: invokeinterface 40 1 0
    //   44: goto +7 -> 51
    //   47: astore_1
    //   48: goto +14 -> 62
    //   51: aload_2
    //   52: ifnull +30 -> 82
    //   55: aload_2
    //   56: invokestatic 43	androidx/core/os/CancellationSignal$Api16Impl:cancel	(Ljava/lang/Object;)V
    //   59: goto +23 -> 82
    //   62: aload_0
    //   63: monitorenter
    //   64: aload_0
    //   65: iconst_0
    //   66: putfield 27	androidx/core/os/CancellationSignal:mCancelInProgress	Z
    //   69: aload_0
    //   70: invokevirtual 46	java/lang/Object:notifyAll	()V
    //   73: aload_0
    //   74: monitorexit
    //   75: aload_1
    //   76: athrow
    //   77: astore_1
    //   78: aload_0
    //   79: monitorexit
    //   80: aload_1
    //   81: athrow
    //   82: aload_0
    //   83: monitorenter
    //   84: aload_0
    //   85: iconst_0
    //   86: putfield 27	androidx/core/os/CancellationSignal:mCancelInProgress	Z
    //   89: aload_0
    //   90: invokevirtual 46	java/lang/Object:notifyAll	()V
    //   93: aload_0
    //   94: monitorexit
    //   95: return
    //   96: astore_1
    //   97: aload_0
    //   98: monitorexit
    //   99: aload_1
    //   100: athrow
    //   101: astore_1
    //   102: aload_0
    //   103: monitorexit
    //   104: aload_1
    //   105: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	106	0	this	CancellationSignal
    //   26	13	1	localOnCancelListener	OnCancelListener
    //   47	29	1	localObject1	Object
    //   77	4	1	localObject2	Object
    //   96	4	1	localObject3	Object
    //   101	4	1	localObject4	Object
    //   31	25	2	localObject5	Object
    // Exception table:
    //   from	to	target	type
    //   38	44	47	finally
    //   55	59	47	finally
    //   64	75	77	finally
    //   78	80	77	finally
    //   84	95	96	finally
    //   97	99	96	finally
    //   2	11	101	finally
    //   12	34	101	finally
    //   102	104	101	finally
  }
  
  @Nullable
  public Object getCancellationSignalObject()
  {
    try
    {
      if (mCancellationSignalObj == null)
      {
        localObject1 = Api16Impl.createCancellationSignal();
        mCancellationSignalObj = localObject1;
        if (mIsCanceled) {
          Api16Impl.cancel(localObject1);
        }
      }
      Object localObject1 = mCancellationSignalObj;
      return localObject1;
    }
    finally {}
  }
  
  public boolean isCanceled()
  {
    try
    {
      boolean bool = mIsCanceled;
      return bool;
    }
    finally {}
  }
  
  public void setOnCancelListener(@Nullable OnCancelListener paramOnCancelListener)
  {
    try
    {
      waitForCancelFinishedLocked();
      if (mOnCancelListener == paramOnCancelListener) {
        return;
      }
      mOnCancelListener = paramOnCancelListener;
      if ((mIsCanceled) && (paramOnCancelListener != null))
      {
        paramOnCancelListener.onCancel();
        return;
      }
      return;
    }
    finally {}
  }
  
  public void throwIfCanceled()
  {
    if (!isCanceled()) {
      return;
    }
    throw new OperationCanceledException();
  }
  
  @RequiresApi(16)
  public static class Api16Impl
  {
    @DoNotInline
    public static void cancel(Object paramObject)
    {
      ((android.os.CancellationSignal)paramObject).cancel();
    }
    
    @DoNotInline
    public static android.os.CancellationSignal createCancellationSignal()
    {
      return new android.os.CancellationSignal();
    }
  }
  
  public static abstract interface OnCancelListener
  {
    public abstract void onCancel();
  }
}

/* Location:
 * Qualified Name:     androidx.core.os.CancellationSignal
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */