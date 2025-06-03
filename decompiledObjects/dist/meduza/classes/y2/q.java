package y2;

import ec.i;
import o2.j;

public final class q
{
  public static final String a;
  
  static
  {
    String str = j.f("ProcessUtils");
    i.d(str, "tagWithPrefix(\"ProcessUtils\")");
    a = str;
  }
  
  /* Error */
  public static final boolean a(android.content.Context paramContext, androidx.work.a parama)
  {
    // Byte code:
    //   0: aload_0
    //   1: ldc 30
    //   3: invokestatic 33	ec/i:e	(Ljava/lang/Object;Ljava/lang/String;)V
    //   6: aload_1
    //   7: ldc 35
    //   9: invokestatic 33	ec/i:e	(Ljava/lang/Object;Ljava/lang/String;)V
    //   12: getstatic 41	android/os/Build$VERSION:SDK_INT	I
    //   15: bipush 28
    //   17: if_icmplt +13 -> 30
    //   20: getstatic 46	y2/a:a	Ly2/a;
    //   23: invokevirtual 49	y2/a:a	()Ljava/lang/String;
    //   26: astore_1
    //   27: goto +189 -> 216
    //   30: ldc 51
    //   32: iconst_0
    //   33: ldc 53
    //   35: invokevirtual 59	java/lang/Class:getClassLoader	()Ljava/lang/ClassLoader;
    //   38: invokestatic 63	java/lang/Class:forName	(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   41: ldc 65
    //   43: iconst_0
    //   44: anewarray 55	java/lang/Class
    //   47: invokevirtual 69	java/lang/Class:getDeclaredMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   50: astore_1
    //   51: aload_1
    //   52: iconst_1
    //   53: invokevirtual 75	java/lang/reflect/AccessibleObject:setAccessible	(Z)V
    //   56: aload_1
    //   57: aconst_null
    //   58: iconst_0
    //   59: anewarray 4	java/lang/Object
    //   62: invokevirtual 81	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   65: astore_1
    //   66: aload_1
    //   67: invokestatic 85	ec/i:b	(Ljava/lang/Object;)V
    //   70: aload_1
    //   71: instanceof 87
    //   74: ifeq +39 -> 113
    //   77: aload_1
    //   78: checkcast 87	java/lang/String
    //   81: astore_1
    //   82: goto +134 -> 216
    //   85: astore_2
    //   86: invokestatic 90	o2/j:d	()Lo2/j;
    //   89: astore_3
    //   90: getstatic 26	y2/q:a	Ljava/lang/String;
    //   93: astore_1
    //   94: aload_3
    //   95: checkcast 92	o2/j$a
    //   98: getfield 95	o2/j$a:c	I
    //   101: iconst_3
    //   102: if_icmpgt +11 -> 113
    //   105: aload_1
    //   106: ldc 97
    //   108: aload_2
    //   109: invokestatic 102	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   112: pop
    //   113: invokestatic 108	android/os/Process:myPid	()I
    //   116: istore 4
    //   118: aload_0
    //   119: ldc 110
    //   121: invokevirtual 116	android/content/Context:getSystemService	(Ljava/lang/String;)Ljava/lang/Object;
    //   124: astore_1
    //   125: aload_1
    //   126: ldc 118
    //   128: invokestatic 120	ec/i:c	(Ljava/lang/Object;Ljava/lang/String;)V
    //   131: aload_1
    //   132: checkcast 122	android/app/ActivityManager
    //   135: invokevirtual 126	android/app/ActivityManager:getRunningAppProcesses	()Ljava/util/List;
    //   138: astore_1
    //   139: aload_1
    //   140: ifnull +74 -> 214
    //   143: aload_1
    //   144: invokeinterface 132 1 0
    //   149: astore_3
    //   150: aload_3
    //   151: invokeinterface 138 1 0
    //   156: ifeq +39 -> 195
    //   159: aload_3
    //   160: invokeinterface 142 1 0
    //   165: astore_1
    //   166: aload_1
    //   167: checkcast 144	android/app/ActivityManager$RunningAppProcessInfo
    //   170: getfield 147	android/app/ActivityManager$RunningAppProcessInfo:pid	I
    //   173: iload 4
    //   175: if_icmpne +9 -> 184
    //   178: iconst_1
    //   179: istore 5
    //   181: goto +6 -> 187
    //   184: iconst_0
    //   185: istore 5
    //   187: iload 5
    //   189: ifeq -39 -> 150
    //   192: goto +5 -> 197
    //   195: aconst_null
    //   196: astore_1
    //   197: aload_1
    //   198: checkcast 144	android/app/ActivityManager$RunningAppProcessInfo
    //   201: astore_1
    //   202: aload_1
    //   203: ifnull +11 -> 214
    //   206: aload_1
    //   207: getfield 150	android/app/ActivityManager$RunningAppProcessInfo:processName	Ljava/lang/String;
    //   210: astore_1
    //   211: goto +5 -> 216
    //   214: aconst_null
    //   215: astore_1
    //   216: aload_1
    //   217: aload_0
    //   218: invokevirtual 154	android/content/Context:getApplicationInfo	()Landroid/content/pm/ApplicationInfo;
    //   221: getfield 157	android/content/pm/ApplicationInfo:processName	Ljava/lang/String;
    //   224: invokestatic 160	ec/i:a	(Ljava/lang/Object;Ljava/lang/Object;)Z
    //   227: ireturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	228	0	paramContext	android.content.Context
    //   0	228	1	parama	androidx.work.a
    //   85	24	2	localThrowable	Throwable
    //   89	71	3	localObject	Object
    //   116	60	4	i	int
    //   179	9	5	j	int
    // Exception table:
    //   from	to	target	type
    //   30	82	85	finally
  }
}

/* Location:
 * Qualified Name:     y2.q
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */