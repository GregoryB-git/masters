package m6;

import android.content.DialogInterface.OnClickListener;

public abstract class t
  implements DialogInterface.OnClickListener
{
  public abstract void a();
  
  /* Error */
  public final void onClick(android.content.DialogInterface paramDialogInterface, int paramInt)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 18	m6/t:a	()V
    //   4: goto +36 -> 40
    //   7: astore_3
    //   8: goto +39 -> 47
    //   11: astore 4
    //   13: ldc 20
    //   15: astore_3
    //   16: iconst_1
    //   17: getstatic 26	android/os/Build:FINGERPRINT	Ljava/lang/String;
    //   20: ldc 28
    //   22: invokevirtual 34	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   25: if_icmpne +6 -> 31
    //   28: ldc 36
    //   30: astore_3
    //   31: ldc 38
    //   33: aload_3
    //   34: aload 4
    //   36: invokestatic 44	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   39: pop
    //   40: aload_1
    //   41: invokeinterface 49 1 0
    //   46: return
    //   47: aload_1
    //   48: invokeinterface 49 1 0
    //   53: aload_3
    //   54: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	55	0	this	t
    //   0	55	1	paramDialogInterface	android.content.DialogInterface
    //   0	55	2	paramInt	int
    //   7	1	3	localObject	Object
    //   15	39	3	str	String
    //   11	24	4	localActivityNotFoundException	android.content.ActivityNotFoundException
    // Exception table:
    //   from	to	target	type
    //   0	4	7	finally
    //   16	28	7	finally
    //   31	40	7	finally
    //   0	4	11	android/content/ActivityNotFoundException
  }
}

/* Location:
 * Qualified Name:     m6.t
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */