package p6;

import X5.d;
import X5.g;
import u6.j;

public abstract class V
{
  public static final void a(U paramU, int paramInt)
  {
    Object localObject = paramU.c();
    boolean bool;
    if (paramInt == 4) {
      bool = true;
    } else {
      bool = false;
    }
    if ((!bool) && ((localObject instanceof j)) && (b(paramInt) == b(q)))
    {
      F localF = r;
      localObject = ((d)localObject).getContext();
      if (localF.F((g)localObject)) {
        localF.E((g)localObject, paramU);
      } else {
        e(paramU);
      }
    }
    else
    {
      d(paramU, (d)localObject, bool);
    }
  }
  
  public static final boolean b(int paramInt)
  {
    boolean bool1 = true;
    boolean bool2 = bool1;
    if (paramInt != 1) {
      if (paramInt == 2) {
        bool2 = bool1;
      } else {
        bool2 = false;
      }
    }
    return bool2;
  }
  
  public static final boolean c(int paramInt)
  {
    boolean bool;
    if (paramInt == 2) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  /* Error */
  public static final void d(U paramU, d paramd, boolean paramBoolean)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 55	p6/U:i	()Ljava/lang/Object;
    //   4: astore_3
    //   5: aload_0
    //   6: aload_3
    //   7: invokevirtual 58	p6/U:e	(Ljava/lang/Object;)Ljava/lang/Throwable;
    //   10: astore 4
    //   12: aload 4
    //   14: ifnull +22 -> 36
    //   17: getstatic 64	V5/n:o	LV5/n$a;
    //   20: astore_0
    //   21: aload 4
    //   23: invokestatic 69	V5/o:a	(Ljava/lang/Throwable;)Ljava/lang/Object;
    //   26: astore_0
    //   27: aload_0
    //   28: invokestatic 72	V5/n:a	(Ljava/lang/Object;)Ljava/lang/Object;
    //   31: astore 4
    //   33: goto +17 -> 50
    //   36: getstatic 64	V5/n:o	LV5/n$a;
    //   39: astore 4
    //   41: aload_0
    //   42: aload_3
    //   43: invokevirtual 75	p6/U:f	(Ljava/lang/Object;)Ljava/lang/Object;
    //   46: astore_0
    //   47: goto -20 -> 27
    //   50: iload_2
    //   51: ifeq +116 -> 167
    //   54: aload_1
    //   55: ldc 77
    //   57: invokestatic 82	kotlin/jvm/internal/Intrinsics:c	(Ljava/lang/Object;Ljava/lang/String;)V
    //   60: aload_1
    //   61: checkcast 14	u6/j
    //   64: astore 5
    //   66: aload 5
    //   68: getfield 86	u6/j:s	LX5/d;
    //   71: astore_0
    //   72: aload 5
    //   74: getfield 90	u6/j:u	Ljava/lang/Object;
    //   77: astore_3
    //   78: aload_0
    //   79: invokeinterface 32 1 0
    //   84: astore_1
    //   85: aload_1
    //   86: aload_3
    //   87: invokestatic 95	u6/J:c	(LX5/g;Ljava/lang/Object;)Ljava/lang/Object;
    //   90: astore_3
    //   91: aload_3
    //   92: getstatic 98	u6/J:a	Lu6/F;
    //   95: if_acmpeq +13 -> 108
    //   98: aload_0
    //   99: aload_1
    //   100: aload_3
    //   101: invokestatic 104	p6/E:g	(LX5/d;LX5/g;Ljava/lang/Object;)Lp6/N0;
    //   104: astore_0
    //   105: goto +5 -> 110
    //   108: aconst_null
    //   109: astore_0
    //   110: aload 5
    //   112: getfield 86	u6/j:s	LX5/d;
    //   115: aload 4
    //   117: invokeinterface 108 2 0
    //   122: getstatic 113	V5/t:a	LV5/t;
    //   125: astore 4
    //   127: aload_0
    //   128: ifnull +10 -> 138
    //   131: aload_0
    //   132: invokevirtual 119	p6/N0:K0	()Z
    //   135: ifeq +40 -> 175
    //   138: aload_1
    //   139: aload_3
    //   140: invokestatic 122	u6/J:a	(LX5/g;Ljava/lang/Object;)V
    //   143: goto +32 -> 175
    //   146: astore 4
    //   148: aload_0
    //   149: ifnull +10 -> 159
    //   152: aload_0
    //   153: invokevirtual 119	p6/N0:K0	()Z
    //   156: ifeq +8 -> 164
    //   159: aload_1
    //   160: aload_3
    //   161: invokestatic 122	u6/J:a	(LX5/g;Ljava/lang/Object;)V
    //   164: aload 4
    //   166: athrow
    //   167: aload_1
    //   168: aload 4
    //   170: invokeinterface 108 2 0
    //   175: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	176	0	paramU	U
    //   0	176	1	paramd	d
    //   0	176	2	paramBoolean	boolean
    //   4	157	3	localObject1	Object
    //   10	116	4	localObject2	Object
    //   146	23	4	localObject3	Object
    //   64	47	5	localj	j
    // Exception table:
    //   from	to	target	type
    //   110	127	146	finally
  }
  
  public static final void e(U paramU)
  {
    locala0 = L0.a.b();
    if (locala0.O()) {
      locala0.K(paramU);
    } else {
      locala0.M(true);
    }
    for (;;)
    {
      try
      {
        d(paramU, paramU.c(), true);
        boolean bool = locala0.R();
        if (bool) {
          continue;
        }
        locala0.H(true);
      }
      finally {}
      try
      {
        paramU.h(localThrowable, null);
      }
      finally
      {
        locala0.H(true);
      }
    }
  }
}

/* Location:
 * Qualified Name:     p6.V
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */