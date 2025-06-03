package K1;

import C1.f;
import O1.P;
import T1.a;
import android.os.BaseBundle;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.x;
import org.json.JSONException;
import org.json.JSONObject;
import x1.B;
import x1.F.c;

public final class j
  implements View.OnClickListener
{
  public static final a s = new a(null);
  public static final Set t = new HashSet();
  public final View.OnClickListener o;
  public final WeakReference p;
  public final WeakReference q;
  public final String r;
  
  public j(View paramView1, View paramView2, String paramString)
  {
    o = f.g(paramView1);
    p = new WeakReference(paramView2);
    q = new WeakReference(paramView1);
    if (paramString != null)
    {
      paramView1 = paramString.toLowerCase();
      Intrinsics.checkNotNullExpressionValue(paramView1, "(this as java.lang.String).toLowerCase()");
      r = kotlin.text.i.q(paramView1, "activity", "", false, 4, null);
      return;
    }
    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
  }
  
  /* Error */
  public static final void d(JSONObject paramJSONObject, String paramString1, j paramj, String paramString2)
  {
    // Byte code:
    //   0: ldc 2
    //   2: invokestatic 100	T1/a:d	(Ljava/lang/Object;)Z
    //   5: ifeq +4 -> 9
    //   8: return
    //   9: aload_0
    //   10: ldc 107
    //   12: invokestatic 110	kotlin/jvm/internal/Intrinsics:checkNotNullParameter	(Ljava/lang/Object;Ljava/lang/String;)V
    //   15: aload_1
    //   16: ldc 112
    //   18: invokestatic 110	kotlin/jvm/internal/Intrinsics:checkNotNullParameter	(Ljava/lang/Object;Ljava/lang/String;)V
    //   21: aload_2
    //   22: ldc 114
    //   24: invokestatic 110	kotlin/jvm/internal/Intrinsics:checkNotNullParameter	(Ljava/lang/Object;Ljava/lang/String;)V
    //   27: aload_3
    //   28: ldc 116
    //   30: invokestatic 110	kotlin/jvm/internal/Intrinsics:checkNotNullParameter	(Ljava/lang/Object;Ljava/lang/String;)V
    //   33: getstatic 121	O1/P:a	LO1/P;
    //   36: astore 4
    //   38: invokestatic 127	x1/B:l	()Landroid/content/Context;
    //   41: invokestatic 131	O1/P:u	(Landroid/content/Context;)Ljava/lang/String;
    //   44: astore 4
    //   46: aload 4
    //   48: ifnull +107 -> 155
    //   51: aload 4
    //   53: invokevirtual 60	java/lang/String:toLowerCase	()Ljava/lang/String;
    //   56: astore 4
    //   58: aload 4
    //   60: ldc 62
    //   62: invokestatic 68	kotlin/jvm/internal/Intrinsics:checkNotNullExpressionValue	(Ljava/lang/Object;Ljava/lang/String;)V
    //   65: aload_0
    //   66: aload 4
    //   68: invokestatic 136	K1/a:a	(Lorg/json/JSONObject;Ljava/lang/String;)[F
    //   71: astore_0
    //   72: aload_1
    //   73: aload_2
    //   74: getfield 79	K1/j:r	Ljava/lang/String;
    //   77: aload 4
    //   79: invokestatic 140	K1/a:c	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   82: astore_2
    //   83: aload_0
    //   84: ifnonnull +4 -> 88
    //   87: return
    //   88: getstatic 145	H1/f:a	LH1/f;
    //   91: astore 4
    //   93: getstatic 150	H1/f$a:p	LH1/f$a;
    //   96: iconst_1
    //   97: anewarray 152	[F
    //   100: dup
    //   101: iconst_0
    //   102: aload_0
    //   103: aastore
    //   104: iconst_1
    //   105: anewarray 56	java/lang/String
    //   108: dup
    //   109: iconst_0
    //   110: aload_2
    //   111: aastore
    //   112: invokestatic 155	H1/f:q	(LH1/f$a;[[F[Ljava/lang/String;)[Ljava/lang/String;
    //   115: astore_2
    //   116: aload_2
    //   117: ifnonnull +4 -> 121
    //   120: return
    //   121: aload_2
    //   122: iconst_0
    //   123: aaload
    //   124: astore_2
    //   125: aload_3
    //   126: aload_2
    //   127: invokestatic 160	K1/b:a	(Ljava/lang/String;Ljava/lang/String;)V
    //   130: aload_2
    //   131: ldc -94
    //   133: invokestatic 165	kotlin/jvm/internal/Intrinsics:a	(Ljava/lang/Object;Ljava/lang/Object;)Z
    //   136: ifne +31 -> 167
    //   139: getstatic 28	K1/j:s	LK1/j$a;
    //   142: aload_2
    //   143: aload_1
    //   144: aload_0
    //   145: invokestatic 168	K1/j$a:b	(LK1/j$a;Ljava/lang/String;Ljava/lang/String;[F)V
    //   148: goto +19 -> 167
    //   151: astore_0
    //   152: goto +16 -> 168
    //   155: new 81	java/lang/NullPointerException
    //   158: astore_0
    //   159: aload_0
    //   160: ldc 83
    //   162: invokespecial 86	java/lang/NullPointerException:<init>	(Ljava/lang/String;)V
    //   165: aload_0
    //   166: athrow
    //   167: return
    //   168: aload_0
    //   169: ldc 2
    //   171: invokestatic 103	T1/a:b	(Ljava/lang/Throwable;Ljava/lang/Object;)V
    //   174: return
    //   175: astore_0
    //   176: goto -9 -> 167
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	179	0	paramJSONObject	JSONObject
    //   0	179	1	paramString1	String
    //   0	179	2	paramj	j
    //   0	179	3	paramString2	String
    //   36	56	4	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   9	33	151	finally
    //   33	46	151	finally
    //   51	83	151	finally
    //   88	116	151	finally
    //   125	148	151	finally
    //   155	167	151	finally
    //   33	46	175	java/lang/Exception
    //   51	83	175	java/lang/Exception
    //   88	116	175	java/lang/Exception
    //   125	148	175	java/lang/Exception
    //   155	167	175	java/lang/Exception
  }
  
  public final void c(String paramString1, String paramString2, JSONObject paramJSONObject)
  {
    if (a.d(this)) {
      return;
    }
    try
    {
      Object localObject = P.a;
      localObject = new K1/h;
      ((h)localObject).<init>(paramJSONObject, paramString2, this, paramString1);
      P.B0((Runnable)localObject);
      return;
    }
    finally
    {
      a.b(paramString1, this);
    }
  }
  
  public final void e()
  {
    if (a.d(this)) {
      return;
    }
    try
    {
      View localView1 = (View)p.get();
      View localView2 = (View)q.get();
      if ((localView1 != null) && (localView2 != null)) {}
      String str1;
      String str2;
      JSONObject localJSONObject;
      return;
    }
    finally
    {
      try
      {
        str1 = c.d(localView2);
        str2 = b.b(localView2, str1);
        if (str2 == null) {
          return;
        }
        if (a.c(s, str2, str1)) {
          return;
        }
        localJSONObject = new org/json/JSONObject;
        localJSONObject.<init>();
        localJSONObject.put("view", c.b(localView1, localView2));
        localJSONObject.put("screenname", r);
        c(str2, str1, localJSONObject);
      }
      catch (Exception localException)
      {
        for (;;) {}
      }
      localThrowable = finally;
    }
    a.b(localThrowable, this);
  }
  
  public void onClick(View paramView)
  {
    if (a.d(this)) {
      return;
    }
    try
    {
      Intrinsics.checkNotNullParameter(paramView, "view");
      View.OnClickListener localOnClickListener = o;
      if (localOnClickListener != null) {
        localOnClickListener.onClick(paramView);
      }
      e();
      return;
    }
    finally
    {
      a.b(paramView, this);
    }
  }
  
  public static final class a
  {
    public static final void g(String paramString1, String paramString2)
    {
      Intrinsics.checkNotNullParameter(paramString1, "$queriedEvent");
      Intrinsics.checkNotNullParameter(paramString2, "$buttonText");
      j.s.e(paramString1, paramString2, new float[0]);
    }
    
    public final void d(View paramView1, View paramView2, String paramString)
    {
      Intrinsics.checkNotNullParameter(paramView1, "hostView");
      Intrinsics.checkNotNullParameter(paramView2, "rootView");
      Intrinsics.checkNotNullParameter(paramString, "activityName");
      int i = paramView1.hashCode();
      if (!j.b().contains(Integer.valueOf(i)))
      {
        f localf = f.a;
        f.r(paramView1, new j(paramView1, paramView2, paramString, null));
        j.b().add(Integer.valueOf(i));
      }
    }
    
    public final void e(String paramString1, String paramString2, float[] paramArrayOfFloat)
    {
      if (e.f(paramString1)) {
        new y1.F(B.l()).e(paramString1, paramString2);
      } else if (e.e(paramString1)) {
        h(paramString1, paramString2, paramArrayOfFloat);
      }
    }
    
    public final boolean f(String paramString1, String paramString2)
    {
      paramString1 = b.d(paramString1);
      if (paramString1 == null) {
        return false;
      }
      if (!Intrinsics.a(paramString1, "other"))
      {
        P localP = P.a;
        P.B0(new i(paramString1, paramString2));
      }
      return true;
    }
    
    public final void h(String paramString1, String paramString2, float[] paramArrayOfFloat)
    {
      Bundle localBundle = new Bundle();
      try
      {
        localBundle.putString("event_name", paramString1);
        paramString1 = new org/json/JSONObject;
        paramString1.<init>();
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        int i = paramArrayOfFloat.length;
        int j = 0;
        while (j < i)
        {
          float f = paramArrayOfFloat[j];
          j++;
          localStringBuilder.append(f);
          localStringBuilder.append(",");
        }
        paramString1.put("dense", localStringBuilder.toString());
        paramString1.put("button_text", paramString2);
        localBundle.putString("metadata", paramString1.toString());
        paramString1 = x1.F.n;
        paramString2 = x.a;
        paramString2 = String.format(Locale.US, "%s/suggested_events", Arrays.copyOf(new Object[] { B.m() }, 1));
        Intrinsics.checkNotNullExpressionValue(paramString2, "java.lang.String.format(locale, format, *args)");
        paramString1 = paramString1.A(null, paramString2, null, null);
        paramString1.G(localBundle);
        paramString1.k();
        return;
      }
      catch (JSONException paramString1)
      {
        for (;;) {}
      }
    }
  }
}

/* Location:
 * Qualified Name:     K1.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */