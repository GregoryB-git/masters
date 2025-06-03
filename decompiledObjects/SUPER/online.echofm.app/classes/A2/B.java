package A2;

import android.app.Activity;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import z2.g;

public abstract class B
  implements DialogInterface.OnClickListener
{
  public static B b(Activity paramActivity, Intent paramIntent, int paramInt)
  {
    return new z(paramIntent, paramActivity, paramInt);
  }
  
  public static B c(g paramg, Intent paramIntent, int paramInt)
  {
    return new A(paramIntent, paramg, 2);
  }
  
  public abstract void a();
  
  /* Error */
  public final void onClick(android.content.DialogInterface paramDialogInterface, int paramInt)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 32	A2/B:a	()V
    //   4: aload_1
    //   5: invokeinterface 37 1 0
    //   10: return
    //   11: astore_3
    //   12: goto +39 -> 51
    //   15: astore 4
    //   17: ldc 39
    //   19: astore_3
    //   20: iconst_1
    //   21: getstatic 45	android/os/Build:FINGERPRINT	Ljava/lang/String;
    //   24: ldc 47
    //   26: invokevirtual 53	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   29: if_icmpne +6 -> 35
    //   32: ldc 55
    //   34: astore_3
    //   35: ldc 57
    //   37: aload_3
    //   38: aload 4
    //   40: invokestatic 63	android/util/Log:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   43: pop
    //   44: aload_1
    //   45: invokeinterface 37 1 0
    //   50: return
    //   51: aload_1
    //   52: invokeinterface 37 1 0
    //   57: aload_3
    //   58: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	59	0	this	B
    //   0	59	1	paramDialogInterface	android.content.DialogInterface
    //   0	59	2	paramInt	int
    //   11	1	3	localObject	Object
    //   19	39	3	str	String
    //   15	24	4	localActivityNotFoundException	android.content.ActivityNotFoundException
    // Exception table:
    //   from	to	target	type
    //   0	4	11	finally
    //   20	32	11	finally
    //   35	44	11	finally
    //   0	4	15	android/content/ActivityNotFoundException
  }
}

/* Location:
 * Qualified Name:     A2.B
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */