package b0;

import android.content.Context;
import java.util.concurrent.Callable;

public final class j
  implements Callable<l.a>
{
  /* Error */
  public final Object call()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 19	b0/j:a	Ljava/lang/String;
    //   4: aload_0
    //   5: getfield 21	b0/j:b	Landroid/content/Context;
    //   8: aload_0
    //   9: getfield 23	b0/j:c	Lb0/g;
    //   12: aload_0
    //   13: getfield 25	b0/j:d	I
    //   16: invokestatic 37	b0/l:a	(Ljava/lang/String;Landroid/content/Context;Lb0/g;I)Lb0/l$a;
    //   19: astore_1
    //   20: goto +14 -> 34
    //   23: astore_1
    //   24: new 39	b0/l$a
    //   27: dup
    //   28: bipush -3
    //   30: invokespecial 42	b0/l$a:<init>	(I)V
    //   33: astore_1
    //   34: aload_1
    //   35: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	36	0	this	j
    //   19	1	1	locala1	l.a
    //   23	1	1	localObject	Object
    //   33	2	1	locala2	l.a
    // Exception table:
    //   from	to	target	type
    //   0	20	23	finally
  }
}

/* Location:
 * Qualified Name:     b0.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */