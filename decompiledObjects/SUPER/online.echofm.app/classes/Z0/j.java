package Z0;

import F0.E;
import T0.e;
import T0.i;
import T0.k;
import T0.n;
import X2.v;
import d0.q.b;
import d0.x;
import d0.x.b;
import g0.o;
import g0.z;

public abstract class j
{
  public static e a(int paramInt, z paramz)
  {
    int i = paramz.p();
    if (paramz.p() == 1684108385)
    {
      paramz.U(8);
      paramz = paramz.B(i - 16);
      return new e("und", paramz, paramz);
    }
    paramz = new StringBuilder();
    paramz.append("Failed to parse comment attribute: ");
    paramz.append(a.a(paramInt));
    o.h("MetadataUtil", paramz.toString());
    return null;
  }
  
  public static T0.a b(z paramz)
  {
    int i = paramz.p();
    int j;
    String str;
    if (paramz.p() == 1684108385)
    {
      j = a.b(paramz.p());
      if (j == 13) {
        str = "image/jpeg";
      } else if (j == 14) {
        str = "image/png";
      } else {
        str = null;
      }
      if (str == null)
      {
        paramz = new StringBuilder();
        paramz.append("Unrecognized cover art flags: ");
        paramz.append(j);
      }
    }
    for (paramz = paramz.toString();; paramz = "Failed to parse cover art attribute")
    {
      o.h("MetadataUtil", paramz);
      return null;
      paramz.U(4);
      j = i - 16;
      byte[] arrayOfByte = new byte[j];
      paramz.l(arrayOfByte, 0, j);
      return new T0.a(str, null, 3, arrayOfByte);
    }
  }
  
  public static x.b c(z paramz)
  {
    int i = paramz.f() + paramz.p();
    int j = paramz.p();
    int k = j >> 24 & 0xFF;
    if ((k != 169) && (k != 253))
    {
      if (j == 1735291493) {
        try
        {
          n localn = i(paramz);
          paramz.T(i);
          return localn;
        }
        finally
        {
          break label733;
        }
      }
      if (j == 1684632427)
      {
        localObject2 = d(j, "TPOS", paramz);
        paramz.T(i);
        return (x.b)localObject2;
      }
      if (j == 1953655662)
      {
        localObject2 = d(j, "TRCK", paramz);
        paramz.T(i);
        return (x.b)localObject2;
      }
      if (j == 1953329263)
      {
        localObject2 = f(j, "TBPM", paramz, true, false);
        paramz.T(i);
        return (x.b)localObject2;
      }
      if (j == 1668311404)
      {
        localObject2 = f(j, "TCMP", paramz, true, true);
        paramz.T(i);
        return (x.b)localObject2;
      }
      if (j == 1668249202)
      {
        localObject2 = b(paramz);
        paramz.T(i);
        return (x.b)localObject2;
      }
      if (j == 1631670868)
      {
        localObject2 = j(j, "TPE2", paramz);
        paramz.T(i);
        return (x.b)localObject2;
      }
      if (j == 1936682605)
      {
        localObject2 = j(j, "TSOT", paramz);
        paramz.T(i);
        return (x.b)localObject2;
      }
      if (j == 1936679276)
      {
        localObject2 = j(j, "TSOA", paramz);
        paramz.T(i);
        return (x.b)localObject2;
      }
      if (j == 1936679282)
      {
        localObject2 = j(j, "TSOP", paramz);
        paramz.T(i);
        return (x.b)localObject2;
      }
      if (j == 1936679265)
      {
        localObject2 = j(j, "TSO2", paramz);
        paramz.T(i);
        return (x.b)localObject2;
      }
      if (j == 1936679791)
      {
        localObject2 = j(j, "TSOC", paramz);
        paramz.T(i);
        return (x.b)localObject2;
      }
      if (j == 1920233063)
      {
        localObject2 = f(j, "ITUNESADVISORY", paramz, false, false);
        paramz.T(i);
        return (x.b)localObject2;
      }
      if (j == 1885823344)
      {
        localObject2 = f(j, "ITUNESGAPLESS", paramz, false, true);
        paramz.T(i);
        return (x.b)localObject2;
      }
      if (j == 1936683886)
      {
        localObject2 = j(j, "TVSHOWSORT", paramz);
        paramz.T(i);
        return (x.b)localObject2;
      }
      if (j == 1953919848)
      {
        localObject2 = j(j, "TVSHOW", paramz);
        paramz.T(i);
        return (x.b)localObject2;
      }
      if (j == 757935405)
      {
        localObject2 = g(paramz, i);
        paramz.T(i);
        return (x.b)localObject2;
      }
    }
    else
    {
      k = 0xFFFFFF & j;
      if (k == 6516084)
      {
        localObject2 = a(j, paramz);
        paramz.T(i);
        return (x.b)localObject2;
      }
      if ((k == 7233901) || (k == 7631467)) {
        break label716;
      }
      if ((k == 6516589) || (k == 7828084)) {
        break label699;
      }
      if (k == 6578553)
      {
        localObject2 = j(j, "TDRC", paramz);
        paramz.T(i);
        return (x.b)localObject2;
      }
      if (k == 4280916)
      {
        localObject2 = j(j, "TPE1", paramz);
        paramz.T(i);
        return (x.b)localObject2;
      }
      if (k == 7630703)
      {
        localObject2 = j(j, "TSSE", paramz);
        paramz.T(i);
        return (x.b)localObject2;
      }
      if (k == 6384738)
      {
        localObject2 = j(j, "TALB", paramz);
        paramz.T(i);
        return (x.b)localObject2;
      }
      if (k == 7108978)
      {
        localObject2 = j(j, "USLT", paramz);
        paramz.T(i);
        return (x.b)localObject2;
      }
      if (k == 6776174)
      {
        localObject2 = j(j, "TCON", paramz);
        paramz.T(i);
        return (x.b)localObject2;
      }
      if (k == 6779504)
      {
        localObject2 = j(j, "TIT1", paramz);
        paramz.T(i);
        return (x.b)localObject2;
      }
    }
    Object localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    ((StringBuilder)localObject2).append("Skipped unknown metadata entry: ");
    ((StringBuilder)localObject2).append(a.a(j));
    o.b("MetadataUtil", ((StringBuilder)localObject2).toString());
    paramz.T(i);
    return null;
    label699:
    localObject2 = j(j, "TCOM", paramz);
    paramz.T(i);
    return (x.b)localObject2;
    label716:
    localObject2 = j(j, "TIT2", paramz);
    paramz.T(i);
    return (x.b)localObject2;
    label733:
    paramz.T(i);
    throw ((Throwable)localObject2);
  }
  
  public static n d(int paramInt, String paramString, z paramz)
  {
    int i = paramz.p();
    if ((paramz.p() == 1684108385) && (i >= 22))
    {
      paramz.U(10);
      i = paramz.M();
      if (i > 0)
      {
        Object localObject = new StringBuilder();
        ((StringBuilder)localObject).append("");
        ((StringBuilder)localObject).append(i);
        localObject = ((StringBuilder)localObject).toString();
        paramInt = paramz.M();
        paramz = (z)localObject;
        if (paramInt > 0)
        {
          paramz = new StringBuilder();
          paramz.append((String)localObject);
          paramz.append("/");
          paramz.append(paramInt);
          paramz = paramz.toString();
        }
        return new n(paramString, null, v.Z(paramz));
      }
    }
    paramString = new StringBuilder();
    paramString.append("Failed to parse index/count attribute: ");
    paramString.append(a.a(paramInt));
    o.h("MetadataUtil", paramString.toString());
    return null;
  }
  
  public static int e(z paramz)
  {
    int i = paramz.p();
    if (paramz.p() == 1684108385)
    {
      paramz.U(8);
      i -= 16;
      if (i != 1)
      {
        if (i != 2)
        {
          if (i != 3)
          {
            if ((i == 4) && ((paramz.j() & 0x80) == 0)) {
              return paramz.K();
            }
          }
          else {
            return paramz.J();
          }
        }
        else {
          return paramz.M();
        }
      }
      else {
        return paramz.G();
      }
    }
    o.h("MetadataUtil", "Failed to parse data atom to int");
    return -1;
  }
  
  public static i f(int paramInt, String paramString, z paramz, boolean paramBoolean1, boolean paramBoolean2)
  {
    int i = e(paramz);
    int j = i;
    if (paramBoolean2) {
      j = Math.min(1, i);
    }
    if (j >= 0)
    {
      if (paramBoolean1) {
        paramString = new n(paramString, null, v.Z(Integer.toString(j)));
      } else {
        paramString = new e("und", paramString, Integer.toString(j));
      }
      return paramString;
    }
    paramString = new StringBuilder();
    paramString.append("Failed to parse uint8 attribute: ");
    paramString.append(a.a(paramInt));
    o.h("MetadataUtil", paramString.toString());
    return null;
  }
  
  public static i g(z paramz, int paramInt)
  {
    String str1 = null;
    String str2 = str1;
    int i = -1;
    int j = i;
    while (paramz.f() < paramInt)
    {
      int k = paramz.f();
      int m = paramz.p();
      int n = paramz.p();
      paramz.U(4);
      if (n == 1835360622)
      {
        str1 = paramz.B(m - 12);
      }
      else if (n == 1851878757)
      {
        str2 = paramz.B(m - 12);
      }
      else
      {
        if (n == 1684108385)
        {
          i = k;
          j = m;
        }
        paramz.U(m - 12);
      }
    }
    if ((str1 != null) && (str2 != null) && (i != -1))
    {
      paramz.T(i);
      paramz.U(16);
      return new k(str1, str2, paramz.B(j - 16));
    }
    return null;
  }
  
  public static h0.a h(z paramz, int paramInt, String paramString)
  {
    for (;;)
    {
      int i = paramz.f();
      if (i >= paramInt) {
        break;
      }
      int j = paramz.p();
      if (paramz.p() == 1684108385)
      {
        paramInt = paramz.p();
        i = paramz.p();
        j -= 16;
        byte[] arrayOfByte = new byte[j];
        paramz.l(arrayOfByte, 0, j);
        return new h0.a(paramString, arrayOfByte, i, paramInt);
      }
      paramz.T(i + j);
    }
    return null;
  }
  
  public static n i(z paramz)
  {
    paramz = T0.j.a(e(paramz) - 1);
    if (paramz != null) {
      return new n("TCON", null, v.Z(paramz));
    }
    o.h("MetadataUtil", "Failed to parse standard genre code");
    return null;
  }
  
  public static n j(int paramInt, String paramString, z paramz)
  {
    int i = paramz.p();
    if (paramz.p() == 1684108385)
    {
      paramz.U(8);
      return new n(paramString, null, v.Z(paramz.B(i - 16)));
    }
    paramString = new StringBuilder();
    paramString.append("Failed to parse text attribute: ");
    paramString.append(a.a(paramInt));
    o.h("MetadataUtil", paramString.toString());
    return null;
  }
  
  public static void k(int paramInt, E paramE, q.b paramb)
  {
    if ((paramInt == 1) && (paramE.a())) {
      paramb.V(a).W(b);
    }
  }
  
  public static void l(int paramInt, x paramx, q.b paramb, x... paramVarArgs)
  {
    int i = 0;
    Object localObject1 = new x(new x.b[0]);
    Object localObject2 = localObject1;
    if (paramx != null)
    {
      j = 0;
      for (;;)
      {
        localObject2 = localObject1;
        if (j >= paramx.e()) {
          break;
        }
        Object localObject3 = paramx.d(j);
        localObject2 = localObject1;
        if ((localObject3 instanceof h0.a))
        {
          localObject3 = (h0.a)localObject3;
          if (o.equals("com.android.capture.fps"))
          {
            localObject2 = localObject1;
            if (paramInt == 2) {
              localObject2 = ((x)localObject1).a(new x.b[] { localObject3 });
            }
          }
          else
          {
            localObject2 = ((x)localObject1).a(new x.b[] { localObject3 });
          }
        }
        j++;
        localObject1 = localObject2;
      }
    }
    int j = paramVarArgs.length;
    for (paramInt = i; paramInt < j; paramInt++) {
      localObject2 = ((x)localObject2).b(paramVarArgs[paramInt]);
    }
    if (((x)localObject2).e() > 0) {
      paramb.h0((x)localObject2);
    }
  }
}

/* Location:
 * Qualified Name:     Z0.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */