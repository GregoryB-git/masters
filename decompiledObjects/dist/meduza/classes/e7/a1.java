package e7;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import b.z;
import d2.q;
import g;
import m6.j;

public final class a1
  extends d3
{
  public char d = (char)0;
  public long e = -1L;
  public String f;
  public final b1 o = new b1(this, 6, false, false);
  public final b1 p = new b1(this, 6, true, false);
  public final b1 q = new b1(this, 6, false, true);
  public final b1 r = new b1(this, 5, false, false);
  public final b1 s = new b1(this, 5, true, false);
  public final b1 t = new b1(this, 5, false, true);
  public final b1 u = new b1(this, 4, false, false);
  public final b1 v = new b1(this, 3, false, false);
  public final b1 w = new b1(this, 2, false, false);
  
  public a1(j2 paramj2)
  {
    super(paramj2);
  }
  
  public static e1 p(String paramString)
  {
    if (paramString == null) {
      return null;
    }
    return new e1(paramString);
  }
  
  public static String q(Object paramObject, boolean paramBoolean)
  {
    Object localObject1 = "";
    if (paramObject == null) {
      return "";
    }
    Object localObject2 = paramObject;
    if ((paramObject instanceof Integer)) {
      localObject2 = Long.valueOf(((Integer)paramObject).intValue());
    }
    Object localObject3;
    if ((localObject2 instanceof Long))
    {
      if (!paramBoolean) {
        return String.valueOf(localObject2);
      }
      localObject3 = (Long)localObject2;
      long l1 = Math.abs(((Long)localObject3).longValue());
      localObject2 = String.valueOf(localObject2);
      if (l1 < 100L) {
        return (String)localObject2;
      }
      paramObject = localObject1;
      if (((String)localObject2).charAt(0) == '-') {
        paramObject = "-";
      }
      localObject2 = String.valueOf(Math.abs(((Long)localObject3).longValue()));
      l1 = Math.round(Math.pow(10.0D, ((String)localObject2).length() - 1));
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
      paramObject = j2.class.getCanonicalName();
      if (TextUtils.isEmpty((CharSequence)paramObject)) {}
      int i;
      do
      {
        paramObject = "";
        break;
        i = ((String)paramObject).lastIndexOf('.');
      } while (i == -1);
      paramObject = ((String)paramObject).substring(0, i);
      for (Object localObject4 : ((Throwable)localObject2).getStackTrace()) {
        if (!((StackTraceElement)localObject4).isNativeMethod())
        {
          localObject2 = ((StackTraceElement)localObject4).getClassName();
          if (localObject2 != null)
          {
            if (TextUtils.isEmpty((CharSequence)localObject2)) {}
            int k;
            do
            {
              localObject2 = "";
              break;
              k = ((String)localObject2).lastIndexOf('.');
            } while (k == -1);
            localObject2 = ((String)localObject2).substring(0, k);
            if (((String)localObject2).equals(paramObject))
            {
              ((StringBuilder)localObject1).append(": ");
              ((StringBuilder)localObject1).append(localObject4);
              break;
            }
          }
        }
      }
      return ((StringBuilder)localObject1).toString();
    }
    if ((localObject2 instanceof e1)) {
      return a;
    }
    if (paramBoolean) {
      return "-";
    }
    return String.valueOf(localObject2);
  }
  
  public static String r(boolean paramBoolean, String paramString, Object paramObject1, Object paramObject2, Object paramObject3)
  {
    String str1 = "";
    String str2 = paramString;
    if (paramString == null) {
      str2 = "";
    }
    String str3 = q(paramObject1, paramBoolean);
    String str4 = q(paramObject2, paramBoolean);
    paramObject3 = q(paramObject3, paramBoolean);
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
      paramString = (String)paramObject2;
    }
    else
    {
      paramString = (String)paramObject1;
    }
    if (!TextUtils.isEmpty((CharSequence)paramObject3))
    {
      localStringBuilder.append(paramString);
      localStringBuilder.append((String)paramObject3);
    }
    return localStringBuilder.toString();
  }
  
  public final String A()
  {
    if (jo == null) {
      return null;
    }
    p1 localp1 = jo;
    e.l();
    e.l();
    long l1 = e.v().getLong(a, 0L);
    if (l1 == 0L)
    {
      localp1.a();
      l1 = 0L;
    }
    else
    {
      ((z)e.zzb()).getClass();
      l1 = Math.abs(l1 - System.currentTimeMillis());
    }
    long l2 = d;
    if (l1 >= l2)
    {
      if (l1 > l2 << 1) {
        localp1.a();
      }
    }
    else
    {
      localObject = null;
      break label203;
    }
    Object localObject = e.v().getString(c, null);
    l1 = e.v().getLong(b, 0L);
    localp1.a();
    if ((localObject != null) && (l1 > 0L)) {
      localObject = new Pair(localObject, Long.valueOf(l1));
    } else {
      localObject = l1.J;
    }
    label203:
    if ((localObject != null) && (localObject != l1.J)) {
      return g.e(String.valueOf(second), ":", (String)first);
    }
    return null;
  }
  
  public final String B()
  {
    try
    {
      if (f == null)
      {
        localObject1 = b;
        if (d != null) {
          localObject1 = d;
        } else {
          localObject1 = "FA";
        }
        f = ((String)localObject1);
      }
      j.i(f);
      Object localObject1 = f;
      return (String)localObject1;
    }
    finally {}
  }
  
  public final boolean o()
  {
    return false;
  }
  
  public final void s(int paramInt, String paramString)
  {
    Log.println(paramInt, B(), paramString);
  }
  
  public final void t(int paramInt, boolean paramBoolean1, boolean paramBoolean2, String paramString, Object paramObject1, Object paramObject2, Object paramObject3)
  {
    if ((!paramBoolean1) && (u(paramInt))) {
      s(paramInt, r(false, paramString, paramObject1, paramObject2, paramObject3));
    }
    if ((!paramBoolean2) && (paramInt >= 5))
    {
      j.i(paramString);
      e2 locale2 = b).r;
      if (locale2 == null)
      {
        paramString = "Scheduler not set. Not logging error/warn";
      }
      else
      {
        if (c) {
          break label90;
        }
        paramString = "Scheduler not initialized. Not logging error/warn";
      }
      s(6, paramString);
      return;
      label90:
      int i = paramInt;
      if (paramInt < 0) {
        i = 0;
      }
      paramInt = i;
      if (i >= 9) {
        paramInt = 8;
      }
      locale2.u(new c1(this, paramInt, paramString, paramObject1, paramObject2, paramObject3));
    }
  }
  
  public final boolean u(int paramInt)
  {
    return Log.isLoggable(B(), paramInt);
  }
  
  public final b1 v()
  {
    return v;
  }
  
  public final b1 w()
  {
    return o;
  }
  
  public final b1 x()
  {
    return w;
  }
  
  public final b1 y()
  {
    return r;
  }
  
  public final b1 z()
  {
    return t;
  }
}

/* Location:
 * Qualified Name:     e7.a1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */