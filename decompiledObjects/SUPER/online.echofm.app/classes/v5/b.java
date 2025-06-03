package v5;

import A5.a.a;
import A5.a.b;
import B5.c;
import E5.m;
import E5.n;
import E5.o;
import android.app.Activity;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import io.flutter.embedding.engine.plugins.lifecycle.HiddenLifecycleReference;
import io.flutter.plugin.platform.r;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import y5.f;

public class b
  implements A5.b, B5.b
{
  public final Map a = new HashMap();
  public final io.flutter.embedding.engine.a b;
  public final a.b c;
  public final Map d = new HashMap();
  public u5.d e;
  public c f;
  public boolean g = false;
  public final Map h = new HashMap();
  public Service i;
  public final Map j = new HashMap();
  public BroadcastReceiver k;
  public final Map l = new HashMap();
  public ContentProvider m;
  
  public b(Context paramContext, io.flutter.embedding.engine.a parama, f paramf, io.flutter.embedding.engine.b paramb)
  {
    b = parama;
    c = new a.b(paramContext, parama, parama.k(), parama.t(), parama.q().M(), new b(paramf, null), paramb);
  }
  
  /* Error */
  public boolean a(int paramInt1, int paramInt2, Intent paramIntent)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 93	v5/b:r	()Z
    //   4: ifeq +59 -> 63
    //   7: ldc 95
    //   9: invokestatic 100	T5/f:i	(Ljava/lang/String;)LT5/f;
    //   12: astore 4
    //   14: aload_0
    //   15: getfield 102	v5/b:f	Lv5/b$c;
    //   18: iload_1
    //   19: iload_2
    //   20: aload_3
    //   21: invokevirtual 104	v5/b$c:a	(IILandroid/content/Intent;)Z
    //   24: istore 5
    //   26: aload 4
    //   28: ifnull +8 -> 36
    //   31: aload 4
    //   33: invokevirtual 107	T5/f:close	()V
    //   36: iload 5
    //   38: ireturn
    //   39: astore_3
    //   40: aload 4
    //   42: ifnull +19 -> 61
    //   45: aload 4
    //   47: invokevirtual 107	T5/f:close	()V
    //   50: goto +11 -> 61
    //   53: astore 4
    //   55: aload_3
    //   56: aload 4
    //   58: invokevirtual 113	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   61: aload_3
    //   62: athrow
    //   63: ldc 115
    //   65: ldc 117
    //   67: invokestatic 122	t5/b:b	(Ljava/lang/String;Ljava/lang/String;)V
    //   70: iconst_0
    //   71: ireturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	72	0	this	b
    //   0	72	1	paramInt1	int
    //   0	72	2	paramInt2	int
    //   0	72	3	paramIntent	Intent
    //   12	34	4	localf	T5.f
    //   53	4	4	localThrowable	Throwable
    //   24	13	5	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   14	26	39	finally
    //   45	50	53	finally
  }
  
  /* Error */
  public boolean b(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 93	v5/b:r	()Z
    //   4: ifeq +57 -> 61
    //   7: ldc 125
    //   9: invokestatic 100	T5/f:i	(Ljava/lang/String;)LT5/f;
    //   12: astore 4
    //   14: aload_0
    //   15: getfield 102	v5/b:f	Lv5/b$c;
    //   18: iload_1
    //   19: aload_2
    //   20: aload_3
    //   21: invokevirtual 127	v5/b$c:j	(I[Ljava/lang/String;[I)Z
    //   24: istore 5
    //   26: aload 4
    //   28: ifnull +8 -> 36
    //   31: aload 4
    //   33: invokevirtual 107	T5/f:close	()V
    //   36: iload 5
    //   38: ireturn
    //   39: astore_2
    //   40: aload 4
    //   42: ifnull +17 -> 59
    //   45: aload 4
    //   47: invokevirtual 107	T5/f:close	()V
    //   50: goto +9 -> 59
    //   53: astore_3
    //   54: aload_2
    //   55: aload_3
    //   56: invokevirtual 113	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   59: aload_2
    //   60: athrow
    //   61: ldc 115
    //   63: ldc -127
    //   65: invokestatic 122	t5/b:b	(Ljava/lang/String;Ljava/lang/String;)V
    //   68: iconst_0
    //   69: ireturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	70	0	this	b
    //   0	70	1	paramInt	int
    //   0	70	2	paramArrayOfString	String[]
    //   0	70	3	paramArrayOfInt	int[]
    //   12	34	4	localf	T5.f
    //   24	13	5	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   14	26	39	finally
    //   45	50	53	finally
  }
  
  /* Error */
  public void c(A5.a parama)
  {
    // Byte code:
    //   0: new 132	java/lang/StringBuilder
    //   3: dup
    //   4: invokespecial 133	java/lang/StringBuilder:<init>	()V
    //   7: astore_2
    //   8: aload_2
    //   9: ldc -121
    //   11: invokevirtual 139	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   14: pop
    //   15: aload_2
    //   16: aload_1
    //   17: invokevirtual 143	java/lang/Object:getClass	()Ljava/lang/Class;
    //   20: invokevirtual 149	java/lang/Class:getSimpleName	()Ljava/lang/String;
    //   23: invokevirtual 139	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   26: pop
    //   27: aload_2
    //   28: invokevirtual 152	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   31: invokestatic 100	T5/f:i	(Ljava/lang/String;)LT5/f;
    //   34: astore_2
    //   35: aload_0
    //   36: aload_1
    //   37: invokevirtual 143	java/lang/Object:getClass	()Ljava/lang/Class;
    //   40: invokevirtual 155	v5/b:q	(Ljava/lang/Class;)Z
    //   43: istore_3
    //   44: iload_3
    //   45: ifeq +77 -> 122
    //   48: new 132	java/lang/StringBuilder
    //   51: astore 4
    //   53: aload 4
    //   55: invokespecial 133	java/lang/StringBuilder:<init>	()V
    //   58: aload 4
    //   60: ldc -99
    //   62: invokevirtual 139	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   65: pop
    //   66: aload 4
    //   68: aload_1
    //   69: invokevirtual 160	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   72: pop
    //   73: aload 4
    //   75: ldc -94
    //   77: invokevirtual 139	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   80: pop
    //   81: aload 4
    //   83: aload_0
    //   84: getfield 58	v5/b:b	Lio/flutter/embedding/engine/a;
    //   87: invokevirtual 160	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   90: pop
    //   91: aload 4
    //   93: ldc -92
    //   95: invokevirtual 139	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   98: pop
    //   99: ldc 115
    //   101: aload 4
    //   103: invokevirtual 152	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   106: invokestatic 166	t5/b:g	(Ljava/lang/String;Ljava/lang/String;)V
    //   109: aload_2
    //   110: ifnull +7 -> 117
    //   113: aload_2
    //   114: invokevirtual 107	T5/f:close	()V
    //   117: return
    //   118: astore_1
    //   119: goto +119 -> 238
    //   122: new 132	java/lang/StringBuilder
    //   125: astore 4
    //   127: aload 4
    //   129: invokespecial 133	java/lang/StringBuilder:<init>	()V
    //   132: aload 4
    //   134: ldc -88
    //   136: invokevirtual 139	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   139: pop
    //   140: aload 4
    //   142: aload_1
    //   143: invokevirtual 160	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   146: pop
    //   147: ldc 115
    //   149: aload 4
    //   151: invokevirtual 152	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   154: invokestatic 170	t5/b:f	(Ljava/lang/String;Ljava/lang/String;)V
    //   157: aload_0
    //   158: getfield 46	v5/b:a	Ljava/util/Map;
    //   161: aload_1
    //   162: invokevirtual 143	java/lang/Object:getClass	()Ljava/lang/Class;
    //   165: aload_1
    //   166: invokeinterface 176 3 0
    //   171: pop
    //   172: aload_1
    //   173: aload_0
    //   174: getfield 87	v5/b:c	LA5/a$b;
    //   177: invokeinterface 182 2 0
    //   182: aload_1
    //   183: instanceof 184
    //   186: ifeq +43 -> 229
    //   189: aload_1
    //   190: checkcast 184	B5/a
    //   193: astore 4
    //   195: aload_0
    //   196: getfield 48	v5/b:d	Ljava/util/Map;
    //   199: aload_1
    //   200: invokevirtual 143	java/lang/Object:getClass	()Ljava/lang/Class;
    //   203: aload 4
    //   205: invokeinterface 176 3 0
    //   210: pop
    //   211: aload_0
    //   212: invokevirtual 93	v5/b:r	()Z
    //   215: ifeq +14 -> 229
    //   218: aload 4
    //   220: aload_0
    //   221: getfield 102	v5/b:f	Lv5/b$c;
    //   224: invokeinterface 188 2 0
    //   229: aload_2
    //   230: ifnull +7 -> 237
    //   233: aload_2
    //   234: invokevirtual 107	T5/f:close	()V
    //   237: return
    //   238: aload_2
    //   239: ifnull +16 -> 255
    //   242: aload_2
    //   243: invokevirtual 107	T5/f:close	()V
    //   246: goto +9 -> 255
    //   249: astore_2
    //   250: aload_1
    //   251: aload_2
    //   252: invokevirtual 113	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   255: aload_1
    //   256: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	257	0	this	b
    //   0	257	1	parama	A5.a
    //   7	236	2	localObject1	Object
    //   249	3	2	localThrowable	Throwable
    //   43	2	3	bool	boolean
    //   51	168	4	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   35	44	118	finally
    //   48	109	118	finally
    //   122	229	118	finally
    //   242	246	249	finally
  }
  
  /* Error */
  public void d()
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 93	v5/b:r	()Z
    //   4: ifeq +93 -> 97
    //   7: ldc -66
    //   9: invokestatic 100	T5/f:i	(Ljava/lang/String;)LT5/f;
    //   12: astore_1
    //   13: aload_0
    //   14: iconst_1
    //   15: putfield 50	v5/b:g	Z
    //   18: aload_0
    //   19: getfield 48	v5/b:d	Ljava/util/Map;
    //   22: invokeinterface 194 1 0
    //   27: invokeinterface 200 1 0
    //   32: astore_2
    //   33: aload_2
    //   34: invokeinterface 205 1 0
    //   39: ifeq +24 -> 63
    //   42: aload_2
    //   43: invokeinterface 209 1 0
    //   48: checkcast 184	B5/a
    //   51: invokeinterface 212 1 0
    //   56: goto -23 -> 33
    //   59: astore_2
    //   60: goto +18 -> 78
    //   63: aload_0
    //   64: invokevirtual 214	v5/b:l	()V
    //   67: aload_1
    //   68: ifnull +36 -> 104
    //   71: aload_1
    //   72: invokevirtual 107	T5/f:close	()V
    //   75: goto +29 -> 104
    //   78: aload_1
    //   79: ifnull +16 -> 95
    //   82: aload_1
    //   83: invokevirtual 107	T5/f:close	()V
    //   86: goto +9 -> 95
    //   89: astore_1
    //   90: aload_2
    //   91: aload_1
    //   92: invokevirtual 113	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   95: aload_2
    //   96: athrow
    //   97: ldc 115
    //   99: ldc -40
    //   101: invokestatic 122	t5/b:b	(Ljava/lang/String;Ljava/lang/String;)V
    //   104: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	105	0	this	b
    //   12	71	1	localf	T5.f
    //   89	3	1	localThrowable	Throwable
    //   32	11	2	localIterator	Iterator
    //   59	37	2	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   13	33	59	finally
    //   33	56	59	finally
    //   63	67	59	finally
    //   82	86	89	finally
  }
  
  /* Error */
  public void e(Bundle paramBundle)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 93	v5/b:r	()Z
    //   4: ifeq +48 -> 52
    //   7: ldc -37
    //   9: invokestatic 100	T5/f:i	(Ljava/lang/String;)LT5/f;
    //   12: astore_2
    //   13: aload_0
    //   14: getfield 102	v5/b:f	Lv5/b$c;
    //   17: aload_1
    //   18: invokevirtual 221	v5/b$c:k	(Landroid/os/Bundle;)V
    //   21: aload_2
    //   22: ifnull +37 -> 59
    //   25: aload_2
    //   26: invokevirtual 107	T5/f:close	()V
    //   29: goto +30 -> 59
    //   32: astore_1
    //   33: aload_2
    //   34: ifnull +16 -> 50
    //   37: aload_2
    //   38: invokevirtual 107	T5/f:close	()V
    //   41: goto +9 -> 50
    //   44: astore_2
    //   45: aload_1
    //   46: aload_2
    //   47: invokevirtual 113	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   50: aload_1
    //   51: athrow
    //   52: ldc 115
    //   54: ldc -33
    //   56: invokestatic 122	t5/b:b	(Ljava/lang/String;Ljava/lang/String;)V
    //   59: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	60	0	this	b
    //   0	60	1	paramBundle	Bundle
    //   12	26	2	localf	T5.f
    //   44	3	2	localThrowable	Throwable
    // Exception table:
    //   from	to	target	type
    //   13	21	32	finally
    //   37	41	44	finally
  }
  
  /* Error */
  public void f()
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 93	v5/b:r	()Z
    //   4: ifeq +88 -> 92
    //   7: ldc -31
    //   9: invokestatic 100	T5/f:i	(Ljava/lang/String;)LT5/f;
    //   12: astore_1
    //   13: aload_0
    //   14: getfield 48	v5/b:d	Ljava/util/Map;
    //   17: invokeinterface 194 1 0
    //   22: invokeinterface 200 1 0
    //   27: astore_2
    //   28: aload_2
    //   29: invokeinterface 205 1 0
    //   34: ifeq +24 -> 58
    //   37: aload_2
    //   38: invokeinterface 209 1 0
    //   43: checkcast 184	B5/a
    //   46: invokeinterface 228 1 0
    //   51: goto -23 -> 28
    //   54: astore_2
    //   55: goto +18 -> 73
    //   58: aload_0
    //   59: invokevirtual 214	v5/b:l	()V
    //   62: aload_1
    //   63: ifnull +36 -> 99
    //   66: aload_1
    //   67: invokevirtual 107	T5/f:close	()V
    //   70: goto +29 -> 99
    //   73: aload_1
    //   74: ifnull +16 -> 90
    //   77: aload_1
    //   78: invokevirtual 107	T5/f:close	()V
    //   81: goto +9 -> 90
    //   84: astore_1
    //   85: aload_2
    //   86: aload_1
    //   87: invokevirtual 113	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   90: aload_2
    //   91: athrow
    //   92: ldc 115
    //   94: ldc -40
    //   96: invokestatic 122	t5/b:b	(Ljava/lang/String;Ljava/lang/String;)V
    //   99: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	100	0	this	b
    //   12	66	1	localf	T5.f
    //   84	3	1	localThrowable	Throwable
    //   27	11	2	localIterator	Iterator
    //   54	37	2	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   13	28	54	finally
    //   28	51	54	finally
    //   58	62	54	finally
    //   77	81	84	finally
  }
  
  /* Error */
  public void g(Bundle paramBundle)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 93	v5/b:r	()Z
    //   4: ifeq +48 -> 52
    //   7: ldc -26
    //   9: invokestatic 100	T5/f:i	(Ljava/lang/String;)LT5/f;
    //   12: astore_2
    //   13: aload_0
    //   14: getfield 102	v5/b:f	Lv5/b$c;
    //   17: aload_1
    //   18: invokevirtual 232	v5/b$c:l	(Landroid/os/Bundle;)V
    //   21: aload_2
    //   22: ifnull +37 -> 59
    //   25: aload_2
    //   26: invokevirtual 107	T5/f:close	()V
    //   29: goto +30 -> 59
    //   32: astore_1
    //   33: aload_2
    //   34: ifnull +16 -> 50
    //   37: aload_2
    //   38: invokevirtual 107	T5/f:close	()V
    //   41: goto +9 -> 50
    //   44: astore_2
    //   45: aload_1
    //   46: aload_2
    //   47: invokevirtual 113	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   50: aload_1
    //   51: athrow
    //   52: ldc 115
    //   54: ldc -22
    //   56: invokestatic 122	t5/b:b	(Ljava/lang/String;Ljava/lang/String;)V
    //   59: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	60	0	this	b
    //   0	60	1	paramBundle	Bundle
    //   12	26	2	localf	T5.f
    //   44	3	2	localThrowable	Throwable
    // Exception table:
    //   from	to	target	type
    //   13	21	32	finally
    //   37	41	44	finally
  }
  
  /* Error */
  public void h()
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 93	v5/b:r	()Z
    //   4: ifeq +47 -> 51
    //   7: ldc -20
    //   9: invokestatic 100	T5/f:i	(Ljava/lang/String;)LT5/f;
    //   12: astore_1
    //   13: aload_0
    //   14: getfield 102	v5/b:f	Lv5/b$c;
    //   17: invokevirtual 238	v5/b$c:m	()V
    //   20: aload_1
    //   21: ifnull +37 -> 58
    //   24: aload_1
    //   25: invokevirtual 107	T5/f:close	()V
    //   28: goto +30 -> 58
    //   31: astore_2
    //   32: aload_1
    //   33: ifnull +16 -> 49
    //   36: aload_1
    //   37: invokevirtual 107	T5/f:close	()V
    //   40: goto +9 -> 49
    //   43: astore_1
    //   44: aload_2
    //   45: aload_1
    //   46: invokevirtual 113	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   49: aload_2
    //   50: athrow
    //   51: ldc 115
    //   53: ldc -16
    //   55: invokestatic 122	t5/b:b	(Ljava/lang/String;Ljava/lang/String;)V
    //   58: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	59	0	this	b
    //   12	25	1	localf	T5.f
    //   43	3	1	localThrowable	Throwable
    //   31	19	2	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   13	20	31	finally
    //   36	40	43	finally
  }
  
  /* Error */
  public void i(u5.d paramd, androidx.lifecycle.d paramd1)
  {
    // Byte code:
    //   0: ldc -13
    //   2: invokestatic 100	T5/f:i	(Ljava/lang/String;)LT5/f;
    //   5: astore_3
    //   6: aload_0
    //   7: getfield 245	v5/b:e	Lu5/d;
    //   10: astore 4
    //   12: aload 4
    //   14: ifnull +17 -> 31
    //   17: aload 4
    //   19: invokeinterface 249 1 0
    //   24: goto +7 -> 31
    //   27: astore_1
    //   28: goto +35 -> 63
    //   31: aload_0
    //   32: invokevirtual 250	v5/b:m	()V
    //   35: aload_0
    //   36: aload_1
    //   37: putfield 245	v5/b:e	Lu5/d;
    //   40: aload_0
    //   41: aload_1
    //   42: invokeinterface 252 1 0
    //   47: checkcast 254	android/app/Activity
    //   50: aload_2
    //   51: invokevirtual 257	v5/b:j	(Landroid/app/Activity;Landroidx/lifecycle/d;)V
    //   54: aload_3
    //   55: ifnull +7 -> 62
    //   58: aload_3
    //   59: invokevirtual 107	T5/f:close	()V
    //   62: return
    //   63: aload_3
    //   64: ifnull +16 -> 80
    //   67: aload_3
    //   68: invokevirtual 107	T5/f:close	()V
    //   71: goto +9 -> 80
    //   74: astore_2
    //   75: aload_1
    //   76: aload_2
    //   77: invokevirtual 113	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   80: aload_1
    //   81: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	82	0	this	b
    //   0	82	1	paramd	u5.d
    //   0	82	2	paramd1	androidx.lifecycle.d
    //   5	63	3	localf	T5.f
    //   10	8	4	locald	u5.d
    // Exception table:
    //   from	to	target	type
    //   6	12	27	finally
    //   17	24	27	finally
    //   31	54	27	finally
    //   67	71	74	finally
  }
  
  public final void j(Activity paramActivity, androidx.lifecycle.d paramd)
  {
    f = new c(paramActivity, paramd);
    boolean bool;
    if (paramActivity.getIntent() != null) {
      bool = paramActivity.getIntent().getBooleanExtra("enable-software-rendering", false);
    } else {
      bool = false;
    }
    b.q().f0(bool);
    b.q().u(paramActivity, b.t(), b.k());
    paramActivity = d.values().iterator();
    while (paramActivity.hasNext())
    {
      paramd = (B5.a)paramActivity.next();
      if (g) {
        paramd.onReattachedToActivityForConfigChanges(f);
      } else {
        paramd.onAttachedToActivity(f);
      }
    }
    g = false;
  }
  
  public void k()
  {
    t5.b.f("FlutterEngineCxnRegstry", "Destroying.");
    m();
    x();
  }
  
  public final void l()
  {
    b.q().E();
    e = null;
    f = null;
  }
  
  public final void m()
  {
    if (r()) {
      f();
    } else if (u()) {
      p();
    } else if (s()) {
      n();
    } else if (t()) {
      o();
    }
  }
  
  /* Error */
  public void n()
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 300	v5/b:s	()Z
    //   4: ifeq +78 -> 82
    //   7: ldc_w 310
    //   10: invokestatic 100	T5/f:i	(Ljava/lang/String;)LT5/f;
    //   13: astore_1
    //   14: aload_0
    //   15: getfield 54	v5/b:j	Ljava/util/Map;
    //   18: invokeinterface 194 1 0
    //   23: invokeinterface 200 1 0
    //   28: astore_2
    //   29: aload_2
    //   30: invokeinterface 205 1 0
    //   35: istore_3
    //   36: iload_3
    //   37: ifne +14 -> 51
    //   40: aload_1
    //   41: ifnull +49 -> 90
    //   44: aload_1
    //   45: invokevirtual 107	T5/f:close	()V
    //   48: goto +42 -> 90
    //   51: aload_2
    //   52: invokeinterface 209 1 0
    //   57: invokestatic 315	android/support/v4/media/a:a	(Ljava/lang/Object;)V
    //   60: aconst_null
    //   61: athrow
    //   62: astore_2
    //   63: aload_1
    //   64: ifnull +16 -> 80
    //   67: aload_1
    //   68: invokevirtual 107	T5/f:close	()V
    //   71: goto +9 -> 80
    //   74: astore_1
    //   75: aload_2
    //   76: aload_1
    //   77: invokevirtual 113	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   80: aload_2
    //   81: athrow
    //   82: ldc 115
    //   84: ldc_w 317
    //   87: invokestatic 122	t5/b:b	(Ljava/lang/String;Ljava/lang/String;)V
    //   90: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	91	0	this	b
    //   13	55	1	localf	T5.f
    //   74	3	1	localThrowable	Throwable
    //   28	24	2	localIterator	Iterator
    //   62	19	2	localObject	Object
    //   35	2	3	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   14	36	62	finally
    //   51	62	62	finally
    //   67	71	74	finally
  }
  
  /* Error */
  public void o()
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 305	v5/b:t	()Z
    //   4: ifeq +78 -> 82
    //   7: ldc_w 319
    //   10: invokestatic 100	T5/f:i	(Ljava/lang/String;)LT5/f;
    //   13: astore_1
    //   14: aload_0
    //   15: getfield 56	v5/b:l	Ljava/util/Map;
    //   18: invokeinterface 194 1 0
    //   23: invokeinterface 200 1 0
    //   28: astore_2
    //   29: aload_2
    //   30: invokeinterface 205 1 0
    //   35: istore_3
    //   36: iload_3
    //   37: ifne +14 -> 51
    //   40: aload_1
    //   41: ifnull +49 -> 90
    //   44: aload_1
    //   45: invokevirtual 107	T5/f:close	()V
    //   48: goto +42 -> 90
    //   51: aload_2
    //   52: invokeinterface 209 1 0
    //   57: invokestatic 315	android/support/v4/media/a:a	(Ljava/lang/Object;)V
    //   60: aconst_null
    //   61: athrow
    //   62: astore_2
    //   63: aload_1
    //   64: ifnull +16 -> 80
    //   67: aload_1
    //   68: invokevirtual 107	T5/f:close	()V
    //   71: goto +9 -> 80
    //   74: astore_1
    //   75: aload_2
    //   76: aload_1
    //   77: invokevirtual 113	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   80: aload_2
    //   81: athrow
    //   82: ldc 115
    //   84: ldc_w 321
    //   87: invokestatic 122	t5/b:b	(Ljava/lang/String;Ljava/lang/String;)V
    //   90: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	91	0	this	b
    //   13	55	1	localf	T5.f
    //   74	3	1	localThrowable	Throwable
    //   28	24	2	localIterator	Iterator
    //   62	19	2	localObject	Object
    //   35	2	3	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   14	36	62	finally
    //   51	62	62	finally
    //   67	71	74	finally
  }
  
  /* Error */
  public void onNewIntent(Intent paramIntent)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 93	v5/b:r	()Z
    //   4: ifeq +49 -> 53
    //   7: ldc_w 325
    //   10: invokestatic 100	T5/f:i	(Ljava/lang/String;)LT5/f;
    //   13: astore_2
    //   14: aload_0
    //   15: getfield 102	v5/b:f	Lv5/b$c;
    //   18: aload_1
    //   19: invokevirtual 327	v5/b$c:b	(Landroid/content/Intent;)V
    //   22: aload_2
    //   23: ifnull +38 -> 61
    //   26: aload_2
    //   27: invokevirtual 107	T5/f:close	()V
    //   30: goto +31 -> 61
    //   33: astore_1
    //   34: aload_2
    //   35: ifnull +16 -> 51
    //   38: aload_2
    //   39: invokevirtual 107	T5/f:close	()V
    //   42: goto +9 -> 51
    //   45: astore_2
    //   46: aload_1
    //   47: aload_2
    //   48: invokevirtual 113	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   51: aload_1
    //   52: athrow
    //   53: ldc 115
    //   55: ldc_w 329
    //   58: invokestatic 122	t5/b:b	(Ljava/lang/String;Ljava/lang/String;)V
    //   61: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	62	0	this	b
    //   0	62	1	paramIntent	Intent
    //   13	26	2	localf	T5.f
    //   45	3	2	localThrowable	Throwable
    // Exception table:
    //   from	to	target	type
    //   14	22	33	finally
    //   38	42	45	finally
  }
  
  /* Error */
  public void p()
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 294	v5/b:u	()Z
    //   4: ifeq +84 -> 88
    //   7: ldc_w 331
    //   10: invokestatic 100	T5/f:i	(Ljava/lang/String;)LT5/f;
    //   13: astore_1
    //   14: aload_0
    //   15: getfield 52	v5/b:h	Ljava/util/Map;
    //   18: invokeinterface 194 1 0
    //   23: invokeinterface 200 1 0
    //   28: astore_2
    //   29: aload_2
    //   30: invokeinterface 205 1 0
    //   35: ifne +23 -> 58
    //   38: aload_0
    //   39: aconst_null
    //   40: putfield 333	v5/b:i	Landroid/app/Service;
    //   43: aload_1
    //   44: ifnull +52 -> 96
    //   47: aload_1
    //   48: invokevirtual 107	T5/f:close	()V
    //   51: goto +45 -> 96
    //   54: astore_2
    //   55: goto +14 -> 69
    //   58: aload_2
    //   59: invokeinterface 209 1 0
    //   64: invokestatic 315	android/support/v4/media/a:a	(Ljava/lang/Object;)V
    //   67: aconst_null
    //   68: athrow
    //   69: aload_1
    //   70: ifnull +16 -> 86
    //   73: aload_1
    //   74: invokevirtual 107	T5/f:close	()V
    //   77: goto +9 -> 86
    //   80: astore_1
    //   81: aload_2
    //   82: aload_1
    //   83: invokevirtual 113	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   86: aload_2
    //   87: athrow
    //   88: ldc 115
    //   90: ldc_w 335
    //   93: invokestatic 122	t5/b:b	(Ljava/lang/String;Ljava/lang/String;)V
    //   96: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	97	0	this	b
    //   13	61	1	localf	T5.f
    //   80	3	1	localThrowable	Throwable
    //   28	2	2	localIterator	Iterator
    //   54	33	2	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   14	43	54	finally
    //   58	69	54	finally
    //   73	77	80	finally
  }
  
  public boolean q(Class paramClass)
  {
    return a.containsKey(paramClass);
  }
  
  public final boolean r()
  {
    boolean bool;
    if (e != null) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final boolean s()
  {
    boolean bool;
    if (k != null) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final boolean t()
  {
    boolean bool;
    if (m != null) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final boolean u()
  {
    boolean bool;
    if (i != null) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  /* Error */
  public void v(Class paramClass)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 46	v5/b:a	Ljava/util/Map;
    //   4: aload_1
    //   5: invokeinterface 349 2 0
    //   10: checkcast 178	A5/a
    //   13: astore_2
    //   14: aload_2
    //   15: ifnonnull +4 -> 19
    //   18: return
    //   19: new 132	java/lang/StringBuilder
    //   22: dup
    //   23: invokespecial 133	java/lang/StringBuilder:<init>	()V
    //   26: astore_3
    //   27: aload_3
    //   28: ldc_w 351
    //   31: invokevirtual 139	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   34: pop
    //   35: aload_3
    //   36: aload_1
    //   37: invokevirtual 149	java/lang/Class:getSimpleName	()Ljava/lang/String;
    //   40: invokevirtual 139	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   43: pop
    //   44: aload_3
    //   45: invokevirtual 152	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   48: invokestatic 100	T5/f:i	(Ljava/lang/String;)LT5/f;
    //   51: astore_3
    //   52: aload_2
    //   53: instanceof 184
    //   56: ifeq +37 -> 93
    //   59: aload_0
    //   60: invokevirtual 93	v5/b:r	()Z
    //   63: ifeq +19 -> 82
    //   66: aload_2
    //   67: checkcast 184	B5/a
    //   70: invokeinterface 228 1 0
    //   75: goto +7 -> 82
    //   78: astore_1
    //   79: goto +44 -> 123
    //   82: aload_0
    //   83: getfield 48	v5/b:d	Ljava/util/Map;
    //   86: aload_1
    //   87: invokeinterface 354 2 0
    //   92: pop
    //   93: aload_2
    //   94: aload_0
    //   95: getfield 87	v5/b:c	LA5/a$b;
    //   98: invokeinterface 357 2 0
    //   103: aload_0
    //   104: getfield 46	v5/b:a	Ljava/util/Map;
    //   107: aload_1
    //   108: invokeinterface 354 2 0
    //   113: pop
    //   114: aload_3
    //   115: ifnull +7 -> 122
    //   118: aload_3
    //   119: invokevirtual 107	T5/f:close	()V
    //   122: return
    //   123: aload_3
    //   124: ifnull +16 -> 140
    //   127: aload_3
    //   128: invokevirtual 107	T5/f:close	()V
    //   131: goto +9 -> 140
    //   134: astore_2
    //   135: aload_1
    //   136: aload_2
    //   137: invokevirtual 113	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   140: aload_1
    //   141: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	142	0	this	b
    //   0	142	1	paramClass	Class
    //   13	81	2	locala	A5.a
    //   134	3	2	localThrowable	Throwable
    //   26	102	3	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   52	75	78	finally
    //   82	93	78	finally
    //   93	114	78	finally
    //   127	131	134	finally
  }
  
  public void w(Set paramSet)
  {
    paramSet = paramSet.iterator();
    while (paramSet.hasNext()) {
      v((Class)paramSet.next());
    }
  }
  
  public void x()
  {
    w(new HashSet(a.keySet()));
    a.clear();
  }
  
  public static class b
    implements a.a
  {
    public final f a;
    
    public b(f paramf)
    {
      a = paramf;
    }
  }
  
  public static class c
    implements c
  {
    public final Activity a;
    public final HiddenLifecycleReference b;
    public final Set c = new HashSet();
    public final Set d = new HashSet();
    public final Set e = new HashSet();
    public final Set f = new HashSet();
    public final Set g = new HashSet();
    public final Set h = new HashSet();
    
    public c(Activity paramActivity, androidx.lifecycle.d paramd)
    {
      a = paramActivity;
      b = new HiddenLifecycleReference(paramd);
    }
    
    public boolean a(int paramInt1, int paramInt2, Intent paramIntent)
    {
      Iterator localIterator = new HashSet(d).iterator();
      for (boolean bool = false;; bool = true)
      {
        if (!localIterator.hasNext()) {
          break label61;
        }
        if ((!((m)localIterator.next()).a(paramInt1, paramInt2, paramIntent)) && (!bool)) {
          break;
        }
      }
      label61:
      return bool;
    }
    
    public void b(Intent paramIntent)
    {
      Iterator localIterator = e.iterator();
      while (localIterator.hasNext()) {
        ((n)localIterator.next()).onNewIntent(paramIntent);
      }
    }
    
    public Activity c()
    {
      return a;
    }
    
    public void d(m paramm)
    {
      d.remove(paramm);
    }
    
    public void e(o paramo)
    {
      c.add(paramo);
    }
    
    public void f(o paramo)
    {
      c.remove(paramo);
    }
    
    public void g(n paramn)
    {
      e.add(paramn);
    }
    
    public void h(m paramm)
    {
      d.add(paramm);
    }
    
    public void i(n paramn)
    {
      e.remove(paramn);
    }
    
    public boolean j(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
    {
      Iterator localIterator = c.iterator();
      for (boolean bool = false;; bool = true)
      {
        if (!localIterator.hasNext()) {
          break label56;
        }
        if ((!((o)localIterator.next()).b(paramInt, paramArrayOfString, paramArrayOfInt)) && (!bool)) {
          break;
        }
      }
      label56:
      return bool;
    }
    
    public void k(Bundle paramBundle)
    {
      paramBundle = h.iterator();
      if (!paramBundle.hasNext()) {
        return;
      }
      android.support.v4.media.a.a(paramBundle.next());
      throw null;
    }
    
    public void l(Bundle paramBundle)
    {
      paramBundle = h.iterator();
      if (!paramBundle.hasNext()) {
        return;
      }
      android.support.v4.media.a.a(paramBundle.next());
      throw null;
    }
    
    public void m()
    {
      Iterator localIterator = f.iterator();
      if (!localIterator.hasNext()) {
        return;
      }
      android.support.v4.media.a.a(localIterator.next());
      throw null;
    }
  }
}

/* Location:
 * Qualified Name:     v5.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */