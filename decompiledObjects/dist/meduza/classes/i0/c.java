package i0;

import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import d;

public final class c
  extends InputConnectionWrapper
{
  public c(InputConnection paramInputConnection, d paramd)
  {
    super(paramInputConnection, false);
  }
  
  /* Error */
  public final boolean performPrivateCommand(String paramString, android.os.Bundle paramBundle)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 10	i0/c:a	Li0/d;
    //   4: astore_3
    //   5: iconst_0
    //   6: istore 4
    //   8: iconst_0
    //   9: istore 5
    //   11: aload_2
    //   12: ifnonnull +6 -> 18
    //   15: goto +284 -> 299
    //   18: ldc 18
    //   20: aload_1
    //   21: invokestatic 24	android/text/TextUtils:equals	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z
    //   24: ifeq +9 -> 33
    //   27: iconst_0
    //   28: istore 6
    //   30: goto +15 -> 45
    //   33: ldc 26
    //   35: aload_1
    //   36: invokestatic 24	android/text/TextUtils:equals	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z
    //   39: ifeq +260 -> 299
    //   42: iconst_1
    //   43: istore 6
    //   45: iload 6
    //   47: ifeq +10 -> 57
    //   50: ldc 28
    //   52: astore 7
    //   54: goto +7 -> 61
    //   57: ldc 30
    //   59: astore 7
    //   61: aload_2
    //   62: aload 7
    //   64: invokevirtual 36	android/os/Bundle:getParcelable	(Ljava/lang/String;)Landroid/os/Parcelable;
    //   67: checkcast 38	android/os/ResultReceiver
    //   70: astore 8
    //   72: iload 6
    //   74: ifeq +10 -> 84
    //   77: ldc 40
    //   79: astore 7
    //   81: goto +7 -> 88
    //   84: ldc 42
    //   86: astore 7
    //   88: aload_2
    //   89: aload 7
    //   91: invokevirtual 36	android/os/Bundle:getParcelable	(Ljava/lang/String;)Landroid/os/Parcelable;
    //   94: checkcast 44	android/net/Uri
    //   97: astore 9
    //   99: iload 6
    //   101: ifeq +10 -> 111
    //   104: ldc 46
    //   106: astore 7
    //   108: goto +7 -> 115
    //   111: ldc 48
    //   113: astore 7
    //   115: aload_2
    //   116: aload 7
    //   118: invokevirtual 36	android/os/Bundle:getParcelable	(Ljava/lang/String;)Landroid/os/Parcelable;
    //   121: checkcast 50	android/content/ClipDescription
    //   124: astore 10
    //   126: iload 6
    //   128: ifeq +10 -> 138
    //   131: ldc 52
    //   133: astore 7
    //   135: goto +7 -> 142
    //   138: ldc 54
    //   140: astore 7
    //   142: aload_2
    //   143: aload 7
    //   145: invokevirtual 36	android/os/Bundle:getParcelable	(Ljava/lang/String;)Landroid/os/Parcelable;
    //   148: checkcast 44	android/net/Uri
    //   151: astore 11
    //   153: iload 6
    //   155: ifeq +10 -> 165
    //   158: ldc 56
    //   160: astore 7
    //   162: goto +7 -> 169
    //   165: ldc 58
    //   167: astore 7
    //   169: aload_2
    //   170: aload 7
    //   172: invokevirtual 64	android/os/BaseBundle:getInt	(Ljava/lang/String;)I
    //   175: istore 4
    //   177: iload 6
    //   179: ifeq +10 -> 189
    //   182: ldc 66
    //   184: astore 7
    //   186: goto +7 -> 193
    //   189: ldc 68
    //   191: astore 7
    //   193: aload_2
    //   194: aload 7
    //   196: invokevirtual 36	android/os/Bundle:getParcelable	(Ljava/lang/String;)Landroid/os/Parcelable;
    //   199: checkcast 32	android/os/Bundle
    //   202: astore 12
    //   204: iload 5
    //   206: istore 6
    //   208: aload 9
    //   210: ifnull +43 -> 253
    //   213: iload 5
    //   215: istore 6
    //   217: aload 10
    //   219: ifnull +34 -> 253
    //   222: new 70	i0/e
    //   225: astore 7
    //   227: aload 7
    //   229: aload 9
    //   231: aload 10
    //   233: aload 11
    //   235: invokespecial 73	i0/e:<init>	(Landroid/net/Uri;Landroid/content/ClipDescription;Landroid/net/Uri;)V
    //   238: aload_3
    //   239: checkcast 75	d
    //   242: aload 7
    //   244: iload 4
    //   246: aload 12
    //   248: invokevirtual 79	d:b	(Li0/e;ILandroid/os/Bundle;)Z
    //   251: istore 6
    //   253: iload 6
    //   255: istore 4
    //   257: aload 8
    //   259: ifnull +40 -> 299
    //   262: aload 8
    //   264: iload 6
    //   266: aconst_null
    //   267: invokevirtual 83	android/os/ResultReceiver:send	(ILandroid/os/Bundle;)V
    //   270: iload 6
    //   272: istore 4
    //   274: goto +25 -> 299
    //   277: astore_2
    //   278: aload 8
    //   280: astore_1
    //   281: goto +6 -> 287
    //   284: astore_2
    //   285: aconst_null
    //   286: astore_1
    //   287: aload_1
    //   288: ifnull +9 -> 297
    //   291: aload_1
    //   292: iconst_0
    //   293: aconst_null
    //   294: invokevirtual 83	android/os/ResultReceiver:send	(ILandroid/os/Bundle;)V
    //   297: aload_2
    //   298: athrow
    //   299: iload 4
    //   301: ifeq +5 -> 306
    //   304: iconst_1
    //   305: ireturn
    //   306: aload_0
    //   307: aload_1
    //   308: aload_2
    //   309: invokespecial 85	android/view/inputmethod/InputConnectionWrapper:performPrivateCommand	(Ljava/lang/String;Landroid/os/Bundle;)Z
    //   312: ireturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	313	0	this	c
    //   0	313	1	paramString	String
    //   0	313	2	paramBundle	android.os.Bundle
    //   4	235	3	locald	d
    //   6	294	4	i	int
    //   9	205	5	j	int
    //   28	243	6	k	int
    //   52	191	7	localObject	Object
    //   70	209	8	localResultReceiver	android.os.ResultReceiver
    //   97	133	9	localUri1	android.net.Uri
    //   124	108	10	localClipDescription	android.content.ClipDescription
    //   151	83	11	localUri2	android.net.Uri
    //   202	45	12	localBundle	android.os.Bundle
    // Exception table:
    //   from	to	target	type
    //   88	99	277	finally
    //   115	126	277	finally
    //   142	153	277	finally
    //   169	177	277	finally
    //   193	204	277	finally
    //   222	253	277	finally
    //   61	72	284	finally
  }
}

/* Location:
 * Qualified Name:     i0.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */