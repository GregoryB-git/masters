package S;

import P.k;
import R.f.a;
import R.g;
import R.g.a;
import R.h.b;
import V5.l;
import V5.t;
import W5.m;
import androidx.datastore.preferences.protobuf.w;
import androidx.datastore.preferences.protobuf.w.a;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

public final class h
  implements k
{
  public static final h a = new h();
  public static final String b = "preferences_pb";
  
  public Object b(InputStream paramInputStream, X5.d paramd)
  {
    paramd = R.d.a.a(paramInputStream);
    paramInputStream = e.b(new d.b[0]);
    paramd = paramd.K();
    Intrinsics.checkNotNullExpressionValue(paramd, "preferencesProto.preferencesMap");
    paramd = paramd.entrySet().iterator();
    while (paramd.hasNext())
    {
      Object localObject = (Map.Entry)paramd.next();
      String str = (String)((Map.Entry)localObject).getKey();
      R.h localh = (R.h)((Map.Entry)localObject).getValue();
      localObject = a;
      Intrinsics.checkNotNullExpressionValue(str, "name");
      Intrinsics.checkNotNullExpressionValue(localh, "value");
      ((h)localObject).d(str, localh, paramInputStream);
    }
    return paramInputStream.d();
  }
  
  public final void d(String paramString, R.h paramh, a parama)
  {
    h.b localb = paramh.X();
    int i;
    if (localb == null) {
      i = -1;
    } else {
      i = a.a[localb.ordinal()];
    }
    switch (i)
    {
    case 0: 
    default: 
      throw new l();
    case 8: 
      throw new P.a("Value not set.", null, 2, null);
    case 7: 
      paramString = f.g(paramString);
      paramh = paramh.W().M();
      Intrinsics.checkNotNullExpressionValue(paramh, "value.stringSet.stringsList");
      paramh = m.J((Iterable)paramh);
    case 6: 
    case 5: 
    case 4: 
    case 3: 
    case 2: 
    case 1: 
      for (;;)
      {
        parama.i(paramString, paramh);
        break;
        paramString = f.f(paramString);
        paramh = paramh.V();
        Intrinsics.checkNotNullExpressionValue(paramh, "value.string");
        continue;
        paramString = f.e(paramString);
        paramh = Long.valueOf(paramh.U());
        continue;
        paramString = f.d(paramString);
        paramh = Integer.valueOf(paramh.T());
        continue;
        paramString = f.b(paramString);
        paramh = Double.valueOf(paramh.R());
        continue;
        paramString = f.c(paramString);
        paramh = Float.valueOf(paramh.S());
        continue;
        paramString = f.a(paramString);
        paramh = Boolean.valueOf(paramh.P());
      }
      return;
    }
    throw new P.a("Value case is null.", null, 2, null);
  }
  
  public d e()
  {
    return e.a();
  }
  
  public final String f()
  {
    return b;
  }
  
  public final R.h g(Object paramObject)
  {
    w localw;
    if ((paramObject instanceof Boolean))
    {
      localw = R.h.Y().A(((Boolean)paramObject).booleanValue()).s();
      paramObject = "newBuilder().setBoolean(value).build()";
    }
    for (;;)
    {
      Intrinsics.checkNotNullExpressionValue(localw, (String)paramObject);
      paramObject = (R.h)localw;
      break;
      if ((paramObject instanceof Float))
      {
        localw = R.h.Y().C(((Number)paramObject).floatValue()).s();
        paramObject = "newBuilder().setFloat(value).build()";
      }
      else if ((paramObject instanceof Double))
      {
        localw = R.h.Y().B(((Number)paramObject).doubleValue()).s();
        paramObject = "newBuilder().setDouble(value).build()";
      }
      else if ((paramObject instanceof Integer))
      {
        localw = R.h.Y().D(((Number)paramObject).intValue()).s();
        paramObject = "newBuilder().setInteger(value).build()";
      }
      else if ((paramObject instanceof Long))
      {
        localw = R.h.Y().E(((Number)paramObject).longValue()).s();
        paramObject = "newBuilder().setLong(value).build()";
      }
      else if ((paramObject instanceof String))
      {
        localw = R.h.Y().F((String)paramObject).s();
        paramObject = "newBuilder().setString(value).build()";
      }
      else
      {
        if (!(paramObject instanceof Set)) {
          break label229;
        }
        localw = R.h.Y().G(g.N().A((Set)paramObject)).s();
        paramObject = "newBuilder().setStringSet(\n                    StringSet.newBuilder().addAllStrings(value as Set<String>)\n                ).build()";
      }
    }
    return (R.h)paramObject;
    label229:
    throw new IllegalStateException(Intrinsics.i("PreferencesSerializer does not support type: ", paramObject.getClass().getName()));
  }
  
  public Object h(d paramd, OutputStream paramOutputStream, X5.d paramd1)
  {
    paramd1 = paramd.a();
    paramd = R.f.N();
    paramd1 = paramd1.entrySet().iterator();
    while (paramd1.hasNext())
    {
      Object localObject = (Map.Entry)paramd1.next();
      d.a locala = (d.a)((Map.Entry)localObject).getKey();
      localObject = ((Map.Entry)localObject).getValue();
      paramd.A(locala.a(), g(localObject));
    }
    ((R.f)paramd.s()).m(paramOutputStream);
    return t.a;
  }
}

/* Location:
 * Qualified Name:     S.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */