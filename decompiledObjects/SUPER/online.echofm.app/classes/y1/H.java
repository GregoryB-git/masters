package y1;

import O1.P;
import V5.t;
import android.content.Context;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import x1.F;

public final class H
{
  public static final a f = new a(null);
  public static final String g = H.class.getSimpleName();
  public static final int h = 1000;
  public final O1.a a;
  public final String b;
  public List c;
  public final List d;
  public int e;
  
  public H(O1.a parama, String paramString)
  {
    a = parama;
    b = paramString;
    c = new ArrayList();
    d = new ArrayList();
  }
  
  public final void a(e parame)
  {
    label76:
    try
    {
      boolean bool = T1.a.d(this);
      if (bool) {
        return;
      }
      try
      {
        Intrinsics.checkNotNullParameter(parame, "event");
        if (c.size() + d.size() >= h) {
          e += 1;
        }
      }
      finally
      {
        break label76;
      }
      c.add(parame);
      return;
    }
    finally {}
    T1.a.b(parame, this);
  }
  
  public final void b(boolean paramBoolean)
  {
    label59:
    try
    {
      boolean bool = T1.a.d(this);
      if (bool) {
        return;
      }
      if (paramBoolean) {
        try
        {
          c.addAll((Collection)d);
        }
        finally
        {
          break label59;
        }
      }
      d.clear();
      e = 0;
      return;
    }
    finally {}
    T1.a.b(localThrowable, this);
  }
  
  /* Error */
  public final int c()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: invokestatic 68	T1/a:d	(Ljava/lang/Object;)Z
    //   6: istore_1
    //   7: iload_1
    //   8: ifeq +7 -> 15
    //   11: aload_0
    //   12: monitorexit
    //   13: iconst_0
    //   14: ireturn
    //   15: aload_0
    //   16: getfield 60	y1/H:c	Ljava/util/List;
    //   19: invokeinterface 76 1 0
    //   24: istore_2
    //   25: aload_0
    //   26: monitorexit
    //   27: iload_2
    //   28: ireturn
    //   29: astore_3
    //   30: aload_3
    //   31: aload_0
    //   32: invokestatic 84	T1/a:b	(Ljava/lang/Throwable;Ljava/lang/Object;)V
    //   35: aload_0
    //   36: monitorexit
    //   37: iconst_0
    //   38: ireturn
    //   39: astore_3
    //   40: aload_0
    //   41: monitorexit
    //   42: aload_3
    //   43: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	44	0	this	H
    //   6	2	1	bool	boolean
    //   24	4	2	i	int
    //   29	2	3	localThrowable	Throwable
    //   39	4	3	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   15	25	29	finally
    //   2	7	39	finally
    //   30	35	39	finally
  }
  
  /* Error */
  public final List d()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: invokestatic 68	T1/a:d	(Ljava/lang/Object;)Z
    //   6: istore_1
    //   7: iload_1
    //   8: ifeq +7 -> 15
    //   11: aload_0
    //   12: monitorexit
    //   13: aconst_null
    //   14: areturn
    //   15: aload_0
    //   16: getfield 60	y1/H:c	Ljava/util/List;
    //   19: astore_2
    //   20: new 57	java/util/ArrayList
    //   23: astore_3
    //   24: aload_3
    //   25: invokespecial 58	java/util/ArrayList:<init>	()V
    //   28: aload_0
    //   29: aload_3
    //   30: putfield 60	y1/H:c	Ljava/util/List;
    //   33: aload_0
    //   34: monitorexit
    //   35: aload_2
    //   36: areturn
    //   37: astore_2
    //   38: aload_2
    //   39: aload_0
    //   40: invokestatic 84	T1/a:b	(Ljava/lang/Throwable;Ljava/lang/Object;)V
    //   43: aload_0
    //   44: monitorexit
    //   45: aconst_null
    //   46: areturn
    //   47: astore_2
    //   48: aload_0
    //   49: monitorexit
    //   50: aload_2
    //   51: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	52	0	this	H
    //   6	2	1	bool	boolean
    //   19	17	2	localList	List
    //   37	2	2	localThrowable	Throwable
    //   47	4	2	localObject	Object
    //   23	7	3	localArrayList	ArrayList
    // Exception table:
    //   from	to	target	type
    //   15	33	37	finally
    //   2	7	47	finally
    //   38	43	47	finally
  }
  
  public final int e(F paramF, Context paramContext, boolean paramBoolean1, boolean paramBoolean2)
  {
    if (T1.a.d(this)) {
      return 0;
    }
    try
    {
      Intrinsics.checkNotNullParameter(paramF, "request");
      Intrinsics.checkNotNullParameter(paramContext, "applicationContext");
      for (;;)
      {
        e locale;
        try
        {
          i = e;
          localObject1 = D1.a.a;
          D1.a.d(c);
          d.addAll((Collection)c);
          c.clear();
          localObject1 = new org/json/JSONArray;
          ((JSONArray)localObject1).<init>();
          localObject2 = d.iterator();
          if (!((Iterator)localObject2).hasNext()) {
            break;
          }
          locale = (e)((Iterator)localObject2).next();
          if (!locale.g()) {
            break label151;
          }
          if (!paramBoolean1) {
            if (locale.h()) {
              continue;
            }
          }
        }
        finally
        {
          break label217;
        }
        ((JSONArray)localObject1).put(locale.e());
        continue;
        label151:
        P localP = P.a;
        P.j0(g, Intrinsics.i("Event with invalid checksum: ", locale));
      }
      int j = ((JSONArray)localObject1).length();
      if (j == 0) {
        return 0;
      }
    }
    finally
    {
      int i;
      Object localObject1;
      break label221;
      Object localObject2 = t.a;
      f(paramF, paramContext, i, (JSONArray)localObject1, paramBoolean2);
      return ((JSONArray)localObject1).length();
      label217:
      throw paramF;
      label221:
      T1.a.b(paramF, this);
    }
    return 0;
  }
  
  /* Error */
  public final void f(F paramF, Context paramContext, int paramInt, JSONArray paramJSONArray, boolean paramBoolean)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokestatic 68	T1/a:d	(Ljava/lang/Object;)Z
    //   4: ifeq +4 -> 8
    //   7: return
    //   8: getstatic 171	G1/h:a	LG1/h;
    //   11: astore 6
    //   13: getstatic 177	G1/h$a:p	LG1/h$a;
    //   16: aload_0
    //   17: getfield 53	y1/H:a	LO1/a;
    //   20: aload_0
    //   21: getfield 55	y1/H:b	Ljava/lang/String;
    //   24: iload 5
    //   26: aload_2
    //   27: invokestatic 180	G1/h:a	(LG1/h$a;LO1/a;Ljava/lang/String;ZLandroid/content/Context;)Lorg/json/JSONObject;
    //   30: astore 6
    //   32: aload 6
    //   34: astore_2
    //   35: aload_0
    //   36: getfield 78	y1/H:e	I
    //   39: ifle +31 -> 70
    //   42: aload 6
    //   44: ldc -74
    //   46: iload_3
    //   47: invokevirtual 187	org/json/JSONObject:put	(Ljava/lang/String;I)Lorg/json/JSONObject;
    //   50: pop
    //   51: aload 6
    //   53: astore_2
    //   54: goto +16 -> 70
    //   57: astore_1
    //   58: goto +56 -> 114
    //   61: astore_2
    //   62: new 184	org/json/JSONObject
    //   65: dup
    //   66: invokespecial 188	org/json/JSONObject:<init>	()V
    //   69: astore_2
    //   70: aload_1
    //   71: aload_2
    //   72: invokevirtual 194	x1/F:E	(Lorg/json/JSONObject;)V
    //   75: aload_1
    //   76: invokevirtual 198	x1/F:u	()Landroid/os/Bundle;
    //   79: astore_2
    //   80: aload 4
    //   82: invokevirtual 201	org/json/JSONArray:toString	()Ljava/lang/String;
    //   85: astore 4
    //   87: aload 4
    //   89: ldc -53
    //   91: invokestatic 206	kotlin/jvm/internal/Intrinsics:checkNotNullExpressionValue	(Ljava/lang/Object;Ljava/lang/String;)V
    //   94: aload_2
    //   95: ldc -48
    //   97: aload 4
    //   99: invokevirtual 213	android/os/BaseBundle:putString	(Ljava/lang/String;Ljava/lang/String;)V
    //   102: aload_1
    //   103: aload 4
    //   105: invokevirtual 217	x1/F:H	(Ljava/lang/Object;)V
    //   108: aload_1
    //   109: aload_2
    //   110: invokevirtual 221	x1/F:G	(Landroid/os/Bundle;)V
    //   113: return
    //   114: aload_1
    //   115: aload_0
    //   116: invokestatic 84	T1/a:b	(Ljava/lang/Throwable;Ljava/lang/Object;)V
    //   119: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	120	0	this	H
    //   0	120	1	paramF	F
    //   0	120	2	paramContext	Context
    //   0	120	3	paramInt	int
    //   0	120	4	paramJSONArray	JSONArray
    //   0	120	5	paramBoolean	boolean
    //   11	41	6	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   8	32	57	finally
    //   35	51	57	finally
    //   62	70	57	finally
    //   70	113	57	finally
    //   8	32	61	org/json/JSONException
    //   35	51	61	org/json/JSONException
  }
  
  public static final class a {}
}

/* Location:
 * Qualified Name:     y1.H
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */