package com.facebook.internal;

import android.content.Intent;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.util.UUID;

public class AppCall
{
  private static AppCall currentPendingCall;
  private UUID callId;
  private int requestCode;
  private Intent requestIntent;
  
  public AppCall(int paramInt)
  {
    this(paramInt, UUID.randomUUID());
  }
  
  public AppCall(int paramInt, UUID paramUUID)
  {
    callId = paramUUID;
    requestCode = paramInt;
  }
  
  /* Error */
  public static AppCall finishPendingCall(UUID paramUUID, int paramInt)
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: ldc 2
    //   5: invokestatic 39	com/facebook/internal/instrument/crashshield/CrashShieldHandler:isObjectCrashing	(Ljava/lang/Object;)Z
    //   8: istore_2
    //   9: iload_2
    //   10: ifeq +8 -> 18
    //   13: ldc 2
    //   15: monitorexit
    //   16: aconst_null
    //   17: areturn
    //   18: invokestatic 43	com/facebook/internal/AppCall:getCurrentPendingCall	()Lcom/facebook/internal/AppCall;
    //   21: astore_3
    //   22: aload_3
    //   23: ifnull +35 -> 58
    //   26: aload_3
    //   27: invokevirtual 46	com/facebook/internal/AppCall:getCallId	()Ljava/util/UUID;
    //   30: aload_0
    //   31: invokevirtual 49	java/util/UUID:equals	(Ljava/lang/Object;)Z
    //   34: ifeq +24 -> 58
    //   37: aload_3
    //   38: invokevirtual 53	com/facebook/internal/AppCall:getRequestCode	()I
    //   41: iload_1
    //   42: if_icmpeq +6 -> 48
    //   45: goto +13 -> 58
    //   48: aconst_null
    //   49: invokestatic 57	com/facebook/internal/AppCall:setCurrentPendingCall	(Lcom/facebook/internal/AppCall;)Z
    //   52: pop
    //   53: ldc 2
    //   55: monitorexit
    //   56: aload_3
    //   57: areturn
    //   58: ldc 2
    //   60: monitorexit
    //   61: aconst_null
    //   62: areturn
    //   63: astore_0
    //   64: aload_0
    //   65: ldc 2
    //   67: invokestatic 61	com/facebook/internal/instrument/crashshield/CrashShieldHandler:handleThrowable	(Ljava/lang/Throwable;Ljava/lang/Object;)V
    //   70: ldc 2
    //   72: monitorexit
    //   73: aconst_null
    //   74: areturn
    //   75: astore_0
    //   76: ldc 2
    //   78: monitorexit
    //   79: aload_0
    //   80: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	81	0	paramUUID	UUID
    //   0	81	1	paramInt	int
    //   8	2	2	bool	boolean
    //   21	36	3	localAppCall	AppCall
    // Exception table:
    //   from	to	target	type
    //   18	22	63	finally
    //   26	45	63	finally
    //   48	53	63	finally
    //   3	9	75	finally
    //   64	70	75	finally
  }
  
  public static AppCall getCurrentPendingCall()
  {
    if (CrashShieldHandler.isObjectCrashing(AppCall.class)) {
      return null;
    }
    try
    {
      AppCall localAppCall = currentPendingCall;
      return localAppCall;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, AppCall.class);
    }
    return null;
  }
  
  /* Error */
  private static boolean setCurrentPendingCall(AppCall paramAppCall)
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: ldc 2
    //   5: invokestatic 39	com/facebook/internal/instrument/crashshield/CrashShieldHandler:isObjectCrashing	(Ljava/lang/Object;)Z
    //   8: istore_1
    //   9: iconst_0
    //   10: istore_2
    //   11: iload_1
    //   12: ifeq +8 -> 20
    //   15: ldc 2
    //   17: monitorexit
    //   18: iconst_0
    //   19: ireturn
    //   20: invokestatic 43	com/facebook/internal/AppCall:getCurrentPendingCall	()Lcom/facebook/internal/AppCall;
    //   23: astore_3
    //   24: aload_0
    //   25: putstatic 63	com/facebook/internal/AppCall:currentPendingCall	Lcom/facebook/internal/AppCall;
    //   28: aload_3
    //   29: ifnull +5 -> 34
    //   32: iconst_1
    //   33: istore_2
    //   34: ldc 2
    //   36: monitorexit
    //   37: iload_2
    //   38: ireturn
    //   39: astore_0
    //   40: aload_0
    //   41: ldc 2
    //   43: invokestatic 61	com/facebook/internal/instrument/crashshield/CrashShieldHandler:handleThrowable	(Ljava/lang/Throwable;Ljava/lang/Object;)V
    //   46: ldc 2
    //   48: monitorexit
    //   49: iconst_0
    //   50: ireturn
    //   51: astore_0
    //   52: ldc 2
    //   54: monitorexit
    //   55: aload_0
    //   56: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	57	0	paramAppCall	AppCall
    //   8	4	1	bool1	boolean
    //   10	28	2	bool2	boolean
    //   23	6	3	localAppCall	AppCall
    // Exception table:
    //   from	to	target	type
    //   20	28	39	finally
    //   3	9	51	finally
    //   40	46	51	finally
  }
  
  public UUID getCallId()
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return null;
    }
    try
    {
      UUID localUUID = callId;
      return localUUID;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, this);
    }
    return null;
  }
  
  public int getRequestCode()
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return 0;
    }
    try
    {
      int i = requestCode;
      return i;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, this);
    }
    return 0;
  }
  
  public Intent getRequestIntent()
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return null;
    }
    try
    {
      Intent localIntent = requestIntent;
      return localIntent;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, this);
    }
    return null;
  }
  
  public boolean setPending()
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return false;
    }
    try
    {
      boolean bool = setCurrentPendingCall(this);
      return bool;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, this);
    }
    return false;
  }
  
  public void setRequestCode(int paramInt)
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    try
    {
      requestCode = paramInt;
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(localThrowable, this);
    }
  }
  
  public void setRequestIntent(Intent paramIntent)
  {
    if (CrashShieldHandler.isObjectCrashing(this)) {
      return;
    }
    try
    {
      requestIntent = paramIntent;
      return;
    }
    finally
    {
      CrashShieldHandler.handleThrowable(paramIntent, this);
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.internal.AppCall
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */