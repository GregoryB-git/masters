package R2;

import A2.n;
import com.google.android.gms.internal.measurement.B1;
import com.google.android.gms.internal.measurement.B1.a;
import com.google.android.gms.internal.measurement.z1;
import com.google.android.gms.internal.measurement.z1.b;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public abstract class d
{
  public String a;
  public int b;
  public Boolean c;
  public Boolean d;
  public Long e;
  public Long f;
  
  public d(String paramString, int paramInt)
  {
    a = paramString;
    b = paramInt;
  }
  
  public static Boolean b(double paramDouble, z1 paramz1)
  {
    try
    {
      BigDecimal localBigDecimal = new java/math/BigDecimal;
      localBigDecimal.<init>(paramDouble);
      paramz1 = h(localBigDecimal, paramz1, Math.ulp(paramDouble));
      return paramz1;
    }
    catch (NumberFormatException paramz1) {}
    return null;
  }
  
  public static Boolean c(long paramLong, z1 paramz1)
  {
    try
    {
      BigDecimal localBigDecimal = new java/math/BigDecimal;
      localBigDecimal.<init>(paramLong);
      paramz1 = h(localBigDecimal, paramz1, 0.0D);
      return paramz1;
    }
    catch (NumberFormatException paramz1) {}
    return null;
  }
  
  public static Boolean d(Boolean paramBoolean, boolean paramBoolean1)
  {
    if (paramBoolean == null) {
      return null;
    }
    if (paramBoolean.booleanValue() != paramBoolean1) {
      paramBoolean1 = true;
    } else {
      paramBoolean1 = false;
    }
    return Boolean.valueOf(paramBoolean1);
  }
  
  public static Boolean e(String paramString, z1 paramz1)
  {
    if (!N5.f0(paramString)) {
      return null;
    }
    try
    {
      BigDecimal localBigDecimal = new java/math/BigDecimal;
      localBigDecimal.<init>(paramString);
      paramString = h(localBigDecimal, paramz1, 0.0D);
      return paramString;
    }
    catch (NumberFormatException paramString) {}
    return null;
  }
  
  public static Boolean f(String paramString1, B1.a parama, boolean paramBoolean, String paramString2, List paramList, String paramString3, Y1 paramY1)
  {
    if (paramString1 == null) {
      return null;
    }
    if (parama == B1.a.v)
    {
      if ((paramList == null) || (paramList.isEmpty())) {
        return null;
      }
    }
    else if (paramString2 == null) {
      return null;
    }
    String str = paramString1;
    if (!paramBoolean) {
      if (parama == B1.a.q) {
        str = paramString1;
      } else {
        str = paramString1.toUpperCase(Locale.ENGLISH);
      }
    }
    switch (e6.a[parama.ordinal()])
    {
    default: 
      return null;
    case 6: 
      if (paramList == null) {
        return null;
      }
      paramBoolean = paramList.contains(str);
    case 5: 
    case 4: 
    case 3: 
    case 2: 
      for (;;)
      {
        return Boolean.valueOf(paramBoolean);
        paramBoolean = str.equals(paramString2);
        continue;
        paramBoolean = str.contains(paramString2);
        continue;
        paramBoolean = str.endsWith(paramString2);
        continue;
        paramBoolean = str.startsWith(paramString2);
      }
    }
    if (paramString3 == null) {
      return null;
    }
    int i;
    if (paramBoolean) {
      i = 0;
    } else {
      i = 66;
    }
    try
    {
      paramBoolean = Pattern.compile(paramString3, i).matcher(str).matches();
      return Boolean.valueOf(paramBoolean);
    }
    catch (PatternSyntaxException paramString1)
    {
      if (paramY1 != null) {
        paramY1.L().b("Invalid regular expression in REGEXP audience filter. expression", paramString3);
      }
    }
    return null;
  }
  
  public static Boolean g(String paramString, B1 paramB1, Y1 paramY1)
  {
    n.i(paramB1);
    if (paramString == null) {
      return null;
    }
    if ((paramB1.O()) && (paramB1.G() != B1.a.p))
    {
      Object localObject1 = paramB1.G();
      Object localObject2 = B1.a.v;
      if (localObject1 == localObject2)
      {
        if (paramB1.k() == 0) {
          return null;
        }
      }
      else if (!paramB1.N()) {
        return null;
      }
      B1.a locala = paramB1.G();
      boolean bool = paramB1.L();
      if ((!bool) && (locala != B1.a.q) && (locala != localObject2)) {}
      for (localObject2 = paramB1.J().toUpperCase(Locale.ENGLISH);; localObject2 = paramB1.J()) {
        break;
      }
      if (paramB1.k() == 0)
      {
        paramB1 = null;
      }
      else
      {
        paramB1 = paramB1.K();
        if (!bool) {
          for (;;)
          {
            localObject1 = new ArrayList(paramB1.size());
            paramB1 = paramB1.iterator();
            while (paramB1.hasNext()) {
              ((List)localObject1).add(((String)paramB1.next()).toUpperCase(Locale.ENGLISH));
            }
            paramB1 = Collections.unmodifiableList((List)localObject1);
          }
        }
      }
      if (locala == B1.a.q) {
        localObject1 = localObject2;
      } else {
        localObject1 = null;
      }
      return f(paramString, locala, bool, (String)localObject2, paramB1, (String)localObject1, paramY1);
    }
    return null;
  }
  
  public static Boolean h(BigDecimal paramBigDecimal, z1 paramz1, double paramDouble)
  {
    n.i(paramz1);
    Object localObject1;
    z1.b localb1;
    z1.b localb2;
    if ((paramz1.N()) && (paramz1.G() != z1.b.p))
    {
      localObject1 = paramz1.G();
      localb1 = z1.b.t;
      if (localObject1 == localb1)
      {
        if ((!paramz1.R()) || (!paramz1.Q())) {
          return null;
        }
      }
      else if (!paramz1.O()) {
        return null;
      }
      localb2 = paramz1.G();
      if ((paramz1.G() == localb1) && ((!N5.f0(paramz1.L())) || (!N5.f0(paramz1.K())))) {}
    }
    try
    {
      localObject1 = new java/math/BigDecimal;
      ((BigDecimal)localObject1).<init>(paramz1.L());
      localObject2 = new BigDecimal(paramz1.K());
      paramz1 = (z1)localObject1;
      localObject1 = null;
    }
    catch (NumberFormatException paramBigDecimal)
    {
      Object localObject2;
      for (;;) {}
    }
    return null;
    if (!N5.f0(paramz1.J())) {
      return null;
    }
    try
    {
      localObject1 = new BigDecimal(paramz1.J());
      paramz1 = null;
      localObject2 = paramz1;
      if (localb2 == localb1)
      {
        if (paramz1 == null) {
          return null;
        }
      }
      else {
        if (localObject1 == null) {
          break label447;
        }
      }
      int i = e6.b[localb2.ordinal()];
      boolean bool1 = false;
      boolean bool2 = false;
      boolean bool3 = false;
      boolean bool4 = false;
      boolean bool5 = false;
      if (i != 1)
      {
        if (i != 2)
        {
          if (i != 3)
          {
            if (i == 4)
            {
              if (paramz1 == null) {
                return null;
              }
              bool2 = bool5;
              if (paramBigDecimal.compareTo(paramz1) >= 0)
              {
                bool2 = bool5;
                if (paramBigDecimal.compareTo((BigDecimal)localObject2) <= 0) {
                  bool2 = true;
                }
              }
              return Boolean.valueOf(bool2);
            }
          }
          else if (localObject1 != null)
          {
            if (paramDouble != 0.0D)
            {
              bool2 = bool1;
              if (paramBigDecimal.compareTo(((BigDecimal)localObject1).subtract(new BigDecimal(paramDouble).multiply(new BigDecimal(2)))) > 0)
              {
                bool2 = bool1;
                if (paramBigDecimal.compareTo(((BigDecimal)localObject1).add(new BigDecimal(paramDouble).multiply(new BigDecimal(2)))) < 0) {
                  bool2 = true;
                }
              }
              return Boolean.valueOf(bool2);
            }
            if (paramBigDecimal.compareTo((BigDecimal)localObject1) == 0) {
              bool2 = true;
            }
            return Boolean.valueOf(bool2);
          }
        }
        else if (localObject1 != null)
        {
          bool2 = bool3;
          if (paramBigDecimal.compareTo((BigDecimal)localObject1) > 0) {
            bool2 = true;
          }
          return Boolean.valueOf(bool2);
        }
      }
      else if (localObject1 != null)
      {
        bool2 = bool4;
        if (paramBigDecimal.compareTo((BigDecimal)localObject1) < 0) {
          bool2 = true;
        }
        return Boolean.valueOf(bool2);
      }
    }
    catch (NumberFormatException paramBigDecimal)
    {
      label447:
      for (;;) {}
    }
    return null;
  }
  
  public abstract int a();
  
  public abstract boolean i();
  
  public abstract boolean j();
}

/* Location:
 * Qualified Name:     R2.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */