package R2;

import A2.n;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.internal.measurement.B6;

public final class Y1
  extends l3
{
  public char c = (char)0;
  public long d = -1L;
  public String e;
  public final a2 f = new a2(this, 6, false, false);
  public final a2 g = new a2(this, 6, true, false);
  public final a2 h = new a2(this, 6, false, true);
  public final a2 i = new a2(this, 5, false, false);
  public final a2 j = new a2(this, 5, true, false);
  public final a2 k = new a2(this, 5, false, true);
  public final a2 l = new a2(this, 4, false, false);
  public final a2 m = new a2(this, 3, false, false);
  public final a2 n = new a2(this, 2, false, false);
  
  public Y1(N2 paramN2)
  {
    super(paramN2);
  }
  
  public static String E(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      return "";
    }
    int i1 = paramString.lastIndexOf('.');
    if (i1 == -1)
    {
      if ((B6.a()) && (((Boolean)K.H0.a(null)).booleanValue())) {
        return "";
      }
      return paramString;
    }
    return paramString.substring(0, i1);
  }
  
  public static Object v(String paramString)
  {
    if (paramString == null) {
      return null;
    }
    return new d2(paramString);
  }
  
  public static String w(boolean paramBoolean, Object paramObject)
  {
    Object localObject1 = "";
    if (paramObject == null) {
      return "";
    }
    Object localObject2 = paramObject;
    if ((paramObject instanceof Integer)) {
      localObject2 = Long.valueOf(((Integer)paramObject).intValue());
    }
    boolean bool = localObject2 instanceof Long;
    int i1 = 0;
    Long localLong;
    if (bool)
    {
      if (!paramBoolean) {
        return String.valueOf(localObject2);
      }
      localLong = (Long)localObject2;
      if (Math.abs(localLong.longValue()) < 100L) {
        return String.valueOf(localObject2);
      }
      paramObject = localObject1;
      if (String.valueOf(localObject2).charAt(0) == '-') {
        paramObject = "-";
      }
      localObject2 = String.valueOf(Math.abs(localLong.longValue()));
      long l1 = Math.round(Math.pow(10.0D, ((String)localObject2).length() - 1));
      long l2 = Math.round(Math.pow(10.0D, ((String)localObject2).length()) - 1.0D);
      localObject2 = new StringBuilder();
      ((StringBuilder)localObject2).append((String)paramObject);
      ((StringBuilder)localObject2).append(l1);
      ((StringBuilder)localObject2).append("...");
      ((StringBuilder)localObject2).append((String)paramObject);
      ((StringBuilder)localObject2).append(l2);
      return ((StringBuilder)localObject2).toString();
    }
    if ((localObject2 instanceof Boolean)) {
      return String.valueOf(localObject2);
    }
    if ((localObject2 instanceof Throwable))
    {
      localObject2 = (Throwable)localObject2;
      if (paramBoolean) {
        paramObject = localObject2.getClass().getName();
      } else {
        paramObject = ((Throwable)localObject2).toString();
      }
      localObject1 = new StringBuilder((String)paramObject);
      paramObject = E(N2.class.getCanonicalName());
      StackTraceElement[] arrayOfStackTraceElement = ((Throwable)localObject2).getStackTrace();
      int i2 = arrayOfStackTraceElement.length;
      while (i1 < i2)
      {
        localLong = arrayOfStackTraceElement[i1];
        if (!localLong.isNativeMethod())
        {
          localObject2 = localLong.getClassName();
          if ((localObject2 != null) && (E((String)localObject2).equals(paramObject)))
          {
            ((StringBuilder)localObject1).append(": ");
            ((StringBuilder)localObject1).append(localLong);
            break;
          }
        }
        i1++;
      }
      return ((StringBuilder)localObject1).toString();
    }
    if ((localObject2 instanceof d2)) {
      return d2.a((d2)localObject2);
    }
    if (paramBoolean) {
      return "-";
    }
    return String.valueOf(localObject2);
  }
  
  public static String x(boolean paramBoolean, String paramString, Object paramObject1, Object paramObject2, Object paramObject3)
  {
    String str1 = "";
    String str2 = paramString;
    if (paramString == null) {
      str2 = "";
    }
    String str3 = w(paramBoolean, paramObject1);
    String str4 = w(paramBoolean, paramObject2);
    paramObject3 = w(paramBoolean, paramObject3);
    StringBuilder localStringBuilder = new StringBuilder();
    paramString = str1;
    if (!TextUtils.isEmpty(str2))
    {
      localStringBuilder.append(str2);
      paramString = ": ";
    }
    paramBoolean = TextUtils.isEmpty(str3);
    paramObject2 = ", ";
    paramObject1 = paramString;
    if (!paramBoolean)
    {
      localStringBuilder.append(paramString);
      localStringBuilder.append(str3);
      paramObject1 = ", ";
    }
    if (!TextUtils.isEmpty(str4))
    {
      localStringBuilder.append((String)paramObject1);
      localStringBuilder.append(str4);
      paramObject1 = paramObject2;
    }
    if (!TextUtils.isEmpty((CharSequence)paramObject3))
    {
      localStringBuilder.append((String)paramObject1);
      localStringBuilder.append((String)paramObject3);
    }
    return localStringBuilder.toString();
  }
  
  public final boolean C(int paramInt)
  {
    return Log.isLoggable(P(), paramInt);
  }
  
  public final a2 F()
  {
    return m;
  }
  
  public final a2 G()
  {
    return f;
  }
  
  public final a2 H()
  {
    return h;
  }
  
  public final a2 I()
  {
    return g;
  }
  
  public final a2 J()
  {
    return l;
  }
  
  public final a2 K()
  {
    return n;
  }
  
  public final a2 L()
  {
    return i;
  }
  
  public final a2 M()
  {
    return k;
  }
  
  public final a2 N()
  {
    return j;
  }
  
  public final String O()
  {
    if (id == null) {
      return null;
    }
    Object localObject = id.a();
    if ((localObject != null) && (localObject != l2.z))
    {
      String str = String.valueOf(second);
      localObject = (String)first;
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(str);
      localStringBuilder.append(":");
      localStringBuilder.append((String)localObject);
      return localStringBuilder.toString();
    }
    return null;
  }
  
  public final String P()
  {
    try
    {
      if (e != null) {
        break label43;
      }
      if (a.O() != null) {
        String str1 = a.O();
      }
    }
    finally
    {
      break label60;
    }
    String str2 = "FA";
    e = str2;
    label43:
    n.i(e);
    str2 = e;
    return str2;
    label60:
    throw str2;
  }
  
  public final boolean s()
  {
    return false;
  }
  
  public final void y(int paramInt, String paramString)
  {
    Log.println(paramInt, P(), paramString);
  }
  
  public final void z(int paramInt, boolean paramBoolean1, boolean paramBoolean2, String paramString, Object paramObject1, Object paramObject2, Object paramObject3)
  {
    if ((!paramBoolean1) && (C(paramInt))) {
      y(paramInt, x(false, paramString, paramObject1, paramObject2, paramObject3));
    }
    if ((!paramBoolean2) && (paramInt >= 5))
    {
      n.i(paramString);
      G2 localG2 = a.G();
      if (localG2 == null) {}
      for (paramString = "Scheduler not set. Not logging error/warn";; paramString = "Scheduler not initialized. Not logging error/warn")
      {
        y(6, paramString);
        return;
        if (localG2.r()) {
          break;
        }
      }
      int i1 = paramInt;
      if (paramInt < 0) {
        i1 = 0;
      }
      paramInt = i1;
      if (i1 >= 9) {
        paramInt = 8;
      }
      localG2.D(new b2(this, paramInt, paramString, paramObject1, paramObject2, paramObject3));
    }
  }
}

/* Location:
 * Qualified Name:     R2.Y1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */