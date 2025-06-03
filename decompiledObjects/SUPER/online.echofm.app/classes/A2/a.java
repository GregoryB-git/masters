package A2;

public abstract class a
  extends i.a
{
  /* Error */
  public static android.accounts.Account v(i parami)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: aconst_null
    //   3: astore_2
    //   4: aload_0
    //   5: ifnull +47 -> 52
    //   8: invokestatic 14	android/os/Binder:clearCallingIdentity	()J
    //   11: lstore_3
    //   12: aload_0
    //   13: invokeinterface 20 1 0
    //   18: astore_0
    //   19: lload_3
    //   20: invokestatic 24	android/os/Binder:restoreCallingIdentity	(J)V
    //   23: aload_0
    //   24: astore_1
    //   25: goto +27 -> 52
    //   28: astore_0
    //   29: goto +17 -> 46
    //   32: astore_0
    //   33: ldc 26
    //   35: ldc 28
    //   37: invokestatic 34	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   40: pop
    //   41: aload_2
    //   42: astore_0
    //   43: goto -24 -> 19
    //   46: lload_3
    //   47: invokestatic 24	android/os/Binder:restoreCallingIdentity	(J)V
    //   50: aload_0
    //   51: athrow
    //   52: aload_1
    //   53: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	54	0	parami	i
    //   1	52	1	locali	i
    //   3	39	2	localObject	Object
    //   11	36	3	l	long
    // Exception table:
    //   from	to	target	type
    //   12	19	28	finally
    //   33	41	28	finally
    //   12	19	32	android/os/RemoteException
  }
}

/* Location:
 * Qualified Name:     A2.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */