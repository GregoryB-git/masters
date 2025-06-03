package R2;

import A2.n;
import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.C;
import com.google.android.gms.internal.measurement.I1;
import com.google.android.gms.internal.measurement.I1.b;
import com.google.android.gms.internal.measurement.I1.c;
import com.google.android.gms.internal.measurement.I1.d;
import com.google.android.gms.internal.measurement.I1.e;
import com.google.android.gms.internal.measurement.I1.f;
import com.google.android.gms.internal.measurement.J1;
import com.google.android.gms.internal.measurement.K1.a;
import com.google.android.gms.internal.measurement.L1;
import com.google.android.gms.internal.measurement.L1.a;
import com.google.android.gms.internal.measurement.O1;
import com.google.android.gms.internal.measurement.T7;
import com.google.android.gms.internal.measurement.Y3;
import com.google.android.gms.internal.measurement.Y3.b;
import com.google.android.gms.internal.measurement.d0;
import com.google.android.gms.internal.measurement.j3;
import com.google.android.gms.internal.measurement.k4;
import com.google.android.gms.internal.measurement.o2;
import com.google.android.gms.internal.measurement.p2;
import com.google.android.gms.internal.measurement.q2;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.Callable;
import t.a;
import t.g;

public final class x2
  extends C5
  implements i
{
  public final Map d = new a();
  public final Map e = new a();
  public final Map f = new a();
  public final Map g = new a();
  public final Map h = new a();
  public final Map i = new a();
  public final g j = new D2(this, 20);
  public final T7 k = new C2(this);
  public final Map l = new a();
  public final Map m = new a();
  public final Map n = new a();
  
  public x2(D5 paramD5)
  {
    super(paramD5);
  }
  
  public static Map E(L1 paramL1)
  {
    a locala = new a();
    if (paramL1 != null)
    {
      paramL1 = paramL1.X().iterator();
      while (paramL1.hasNext())
      {
        O1 localO1 = (O1)paramL1.next();
        locala.put(localO1.H(), localO1.I());
      }
    }
    return locala;
  }
  
  public static q3.a z(I1.e parame)
  {
    int i1 = E2.b[parame.ordinal()];
    if (i1 != 1)
    {
      if (i1 != 2)
      {
        if (i1 != 3)
        {
          if (i1 != 4) {
            return null;
          }
          return q3.a.s;
        }
        return q3.a.r;
      }
      return q3.a.q;
    }
    return q3.a.p;
  }
  
  public final q3.a A(String paramString, q3.a parama)
  {
    n();
    g0(paramString);
    paramString = J(paramString);
    if (paramString == null) {
      return null;
    }
    paramString = paramString.K().iterator();
    while (paramString.hasNext())
    {
      I1.c localc = (I1.c)paramString.next();
      if (parama == z(localc.I())) {
        return z(localc.H());
      }
    }
    return null;
  }
  
  public final L1 C(String paramString, byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null) {
      return L1.P();
    }
    L1 localL1;
    a2 locala2;
    String str;
    try
    {
      localL1 = (L1)((L1.a)N5.H(L1.N(), paramArrayOfByte)).p();
      locala2 = j().K();
      boolean bool = localL1.b0();
      str = null;
      if (bool) {
        paramArrayOfByte = Long.valueOf(localL1.L());
      }
    }
    catch (RuntimeException paramArrayOfByte)
    {
      break label97;
    }
    catch (k4 paramArrayOfByte)
    {
      break label97;
    }
    paramArrayOfByte = null;
    if (localL1.a0()) {
      str = localL1.Q();
    }
    locala2.c("Parsed config. version, gmp_app_id", paramArrayOfByte, str);
    return localL1;
    label97:
    j().L().c("Unable to merge remote config. appId", Y1.v(paramString), paramArrayOfByte);
    return L1.P();
  }
  
  public final void F(String paramString, L1.a parama)
  {
    HashSet localHashSet = new HashSet();
    a locala1 = new a();
    a locala2 = new a();
    a locala3 = new a();
    if (parama != null)
    {
      Object localObject = parama.C().iterator();
      while (((Iterator)localObject).hasNext()) {
        localHashSet.add(((J1)((Iterator)localObject).next()).H());
      }
      for (int i1 = 0; i1 < parama.w(); i1++)
      {
        K1.a locala = (K1.a)parama.x(i1).x();
        if (locala.y().isEmpty())
        {
          j().L().a("EventConfig contained null event name");
        }
        else
        {
          String str1 = locala.y();
          String str2 = r3.b(locala.y());
          localObject = locala;
          if (!TextUtils.isEmpty(str2))
          {
            localObject = locala.x(str2);
            parama.y(i1, (K1.a)localObject);
          }
          if ((((K1.a)localObject).B()) && (((K1.a)localObject).z())) {
            locala1.put(str1, Boolean.TRUE);
          }
          if ((((K1.a)localObject).C()) && (((K1.a)localObject).A())) {
            locala2.put(((K1.a)localObject).y(), Boolean.TRUE);
          }
          if (((K1.a)localObject).D()) {
            if ((((K1.a)localObject).w() >= 2) && (((K1.a)localObject).w() <= 65535)) {
              locala3.put(((K1.a)localObject).y(), Integer.valueOf(((K1.a)localObject).w()));
            } else {
              j().L().c("Invalid sampling rate. Event name, sample rate", ((K1.a)localObject).y(), Integer.valueOf(((K1.a)localObject).w()));
            }
          }
        }
      }
    }
    e.put(paramString, localHashSet);
    f.put(paramString, locala1);
    g.put(paramString, locala2);
    i.put(paramString, locala3);
  }
  
  public final void G(String paramString, L1 paramL1)
  {
    if (paramL1.k() == 0)
    {
      j.e(paramString);
      return;
    }
    j().K().b("EES programs found", Integer.valueOf(paramL1.k()));
    Object localObject1 = (q2)paramL1.W().get(0);
    try
    {
      paramL1 = new com/google/android/gms/internal/measurement/C;
      paramL1.<init>();
      Object localObject2 = new R2/y2;
      ((y2)localObject2).<init>(this, paramString);
      paramL1.c("internal.remoteConfig", (Callable)localObject2);
      localObject2 = new R2/B2;
      ((B2)localObject2).<init>(this, paramString);
      paramL1.c("internal.appMetadata", (Callable)localObject2);
      localObject2 = new R2/A2;
      ((A2)localObject2).<init>(this);
      paramL1.c("internal.logger", (Callable)localObject2);
      paramL1.b((q2)localObject1);
      j.d(paramString, paramL1);
      j().K().c("EES program loaded for appId, activities", paramString, Integer.valueOf(((q2)localObject1).G().k()));
      localObject1 = ((q2)localObject1).G().I().iterator();
      while (((Iterator)localObject1).hasNext())
      {
        paramL1 = (p2)((Iterator)localObject1).next();
        j().K().b("EES program activity", paramL1.H());
      }
      return;
    }
    catch (d0 paramL1)
    {
      j().G().b("Failed to load EES program. appId", paramString);
    }
  }
  
  public final boolean H(String paramString1, byte[] paramArrayOfByte, String paramString2, String paramString3)
  {
    u();
    n();
    n.e(paramString1);
    L1.a locala = (L1.a)C(paramString1, paramArrayOfByte).x();
    if (locala == null) {
      return false;
    }
    F(paramString1, locala);
    G(paramString1, (L1)locala.p());
    h.put(paramString1, (L1)locala.p());
    l.put(paramString1, locala.A());
    m.put(paramString1, paramString2);
    n.put(paramString1, paramString3);
    d.put(paramString1, E((L1)locala.p()));
    q().Z(paramString1, new ArrayList(locala.B()));
    try
    {
      locala.z();
      byte[] arrayOfByte = ((L1)locala.p()).h();
      paramArrayOfByte = arrayOfByte;
    }
    catch (RuntimeException localRuntimeException)
    {
      j().L().c("Unable to serialize reduced-size config. Storing full config instead. appId", Y1.v(paramString1), localRuntimeException);
    }
    p localp = q();
    n.e(paramString1);
    localp.n();
    localp.u();
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("remote_config", paramArrayOfByte);
    localContentValues.put("config_last_modified_time", paramString2);
    localContentValues.put("e_tag", paramString3);
    try
    {
      if (localp.B().update("apps", localContentValues, "app_id = ?", new String[] { paramString1 }) == 0L) {
        localp.j().G().b("Failed to update remote config (got 0). appId", Y1.v(paramString1));
      }
    }
    catch (SQLiteException paramArrayOfByte)
    {
      localp.j().G().c("Error storing remote config. appId", Y1.v(paramString1), paramArrayOfByte);
    }
    h.put(paramString1, (L1)locala.p());
    return true;
  }
  
  public final int I(String paramString1, String paramString2)
  {
    n();
    g0(paramString1);
    paramString1 = (Map)i.get(paramString1);
    if (paramString1 != null)
    {
      paramString1 = (Integer)paramString1.get(paramString2);
      if (paramString1 == null) {
        return 1;
      }
      return paramString1.intValue();
    }
    return 1;
  }
  
  public final I1 J(String paramString)
  {
    n();
    g0(paramString);
    paramString = L(paramString);
    if ((paramString != null) && (paramString.Z())) {
      return paramString.M();
    }
    return null;
  }
  
  public final boolean K(String paramString, q3.a parama)
  {
    n();
    g0(paramString);
    paramString = J(paramString);
    if (paramString == null) {
      return false;
    }
    paramString = paramString.J().iterator();
    while (paramString.hasNext())
    {
      I1.b localb = (I1.b)paramString.next();
      if (parama == z(localb.I())) {
        if (localb.H() == I1.d.q) {
          return true;
        }
      }
    }
    return false;
  }
  
  public final L1 L(String paramString)
  {
    u();
    n();
    n.e(paramString);
    g0(paramString);
    return (L1)h.get(paramString);
  }
  
  public final boolean M(String paramString1, String paramString2)
  {
    n();
    g0(paramString1);
    if ("ecommerce_purchase".equals(paramString2)) {
      return true;
    }
    if ((!"purchase".equals(paramString2)) && (!"refund".equals(paramString2)))
    {
      paramString1 = (Map)g.get(paramString1);
      if (paramString1 != null)
      {
        paramString1 = (Boolean)paramString1.get(paramString2);
        if (paramString1 == null) {
          return false;
        }
        return paramString1.booleanValue();
      }
      return false;
    }
    return true;
  }
  
  public final String N(String paramString)
  {
    n();
    return (String)n.get(paramString);
  }
  
  public final boolean O(String paramString1, String paramString2)
  {
    n();
    g0(paramString1);
    if ((X(paramString1)) && (S5.H0(paramString2))) {
      return true;
    }
    if ((Z(paramString1)) && (S5.J0(paramString2))) {
      return true;
    }
    paramString1 = (Map)f.get(paramString1);
    if (paramString1 != null)
    {
      paramString1 = (Boolean)paramString1.get(paramString2);
      if (paramString1 == null) {
        return false;
      }
      return paramString1.booleanValue();
    }
    return false;
  }
  
  public final String P(String paramString)
  {
    n();
    return (String)m.get(paramString);
  }
  
  public final String Q(String paramString)
  {
    n();
    g0(paramString);
    return (String)l.get(paramString);
  }
  
  public final Set R(String paramString)
  {
    n();
    g0(paramString);
    return (Set)e.get(paramString);
  }
  
  public final SortedSet S(String paramString)
  {
    n();
    g0(paramString);
    TreeSet localTreeSet = new TreeSet();
    paramString = J(paramString);
    if (paramString == null) {
      return localTreeSet;
    }
    paramString = paramString.I().iterator();
    while (paramString.hasNext()) {
      localTreeSet.add(((I1.f)paramString.next()).H());
    }
    return localTreeSet;
  }
  
  public final void T(String paramString)
  {
    n();
    m.put(paramString, null);
  }
  
  public final void U(String paramString)
  {
    n();
    h.remove(paramString);
  }
  
  public final boolean V(String paramString)
  {
    n();
    paramString = L(paramString);
    if (paramString == null) {
      return false;
    }
    return paramString.Y();
  }
  
  public final boolean W(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      return false;
    }
    paramString = (L1)h.get(paramString);
    if (paramString == null) {
      return false;
    }
    return paramString.k() != 0;
  }
  
  public final boolean X(String paramString)
  {
    return "1".equals(c(paramString, "measurement.upload.blacklist_internal"));
  }
  
  public final boolean Y(String paramString)
  {
    n();
    g0(paramString);
    paramString = J(paramString);
    if (paramString == null) {
      return true;
    }
    return (!paramString.M()) || (paramString.L());
  }
  
  public final boolean Z(String paramString)
  {
    return "1".equals(c(paramString, "measurement.upload.blacklist_public"));
  }
  
  public final boolean a0(String paramString)
  {
    n();
    g0(paramString);
    return (e.get(paramString) != null) && (((Set)e.get(paramString)).contains("app_instance_id"));
  }
  
  public final boolean b0(String paramString)
  {
    n();
    g0(paramString);
    return (e.get(paramString) != null) && ((((Set)e.get(paramString)).contains("device_model")) || (((Set)e.get(paramString)).contains("device_info")));
  }
  
  public final String c(String paramString1, String paramString2)
  {
    n();
    g0(paramString1);
    paramString1 = (Map)d.get(paramString1);
    if (paramString1 != null) {
      return (String)paramString1.get(paramString2);
    }
    return null;
  }
  
  public final boolean c0(String paramString)
  {
    n();
    g0(paramString);
    return (e.get(paramString) != null) && (((Set)e.get(paramString)).contains("enhanced_user_id"));
  }
  
  public final boolean d0(String paramString)
  {
    n();
    g0(paramString);
    return (e.get(paramString) != null) && (((Set)e.get(paramString)).contains("google_signals"));
  }
  
  public final boolean e0(String paramString)
  {
    n();
    g0(paramString);
    return (e.get(paramString) != null) && ((((Set)e.get(paramString)).contains("os_version")) || (((Set)e.get(paramString)).contains("device_info")));
  }
  
  public final boolean f0(String paramString)
  {
    n();
    g0(paramString);
    return (e.get(paramString) != null) && (((Set)e.get(paramString)).contains("user_id"));
  }
  
  public final void g0(String paramString)
  {
    u();
    n();
    n.e(paramString);
    if (h.get(paramString) == null)
    {
      r localr = q().E0(paramString);
      if (localr == null)
      {
        d.put(paramString, null);
        f.put(paramString, null);
        e.put(paramString, null);
        g.put(paramString, null);
        h.put(paramString, null);
        l.put(paramString, null);
        m.put(paramString, null);
        n.put(paramString, null);
        i.put(paramString, null);
        return;
      }
      L1.a locala = (L1.a)C(paramString, a).x();
      F(paramString, locala);
      d.put(paramString, E((L1)locala.p()));
      h.put(paramString, (L1)locala.p());
      G(paramString, (L1)locala.p());
      l.put(paramString, locala.A());
      m.put(paramString, b);
      n.put(paramString, c);
    }
  }
  
  public final boolean x()
  {
    return false;
  }
  
  public final long y(String paramString)
  {
    String str = c(paramString, "measurement.account.time_zone_offset_minutes");
    if (!TextUtils.isEmpty(str)) {
      try
      {
        long l1 = Long.parseLong(str);
        return l1;
      }
      catch (NumberFormatException localNumberFormatException)
      {
        j().L().c("Unable to parse timezone offset. appId", Y1.v(paramString), localNumberFormatException);
      }
    }
    return 0L;
  }
}

/* Location:
 * Qualified Name:     R2.x2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */