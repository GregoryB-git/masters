package R2;

import A2.n;
import E2.e;
import android.os.BaseBundle;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.internal.measurement.Y1.a;
import com.google.android.gms.internal.measurement.Y3;
import com.google.android.gms.internal.measurement.Y3.b;
import com.google.android.gms.internal.measurement.Z1;
import com.google.android.gms.internal.measurement.Z1.a;
import com.google.android.gms.internal.measurement.a2.a;
import com.google.android.gms.internal.measurement.c2.a;
import com.google.android.gms.internal.measurement.d2;
import com.google.android.gms.internal.measurement.d2.a;
import com.google.android.gms.internal.measurement.e2;
import com.google.android.gms.internal.measurement.e2.b;
import com.google.android.gms.internal.measurement.h2;
import com.google.android.gms.internal.measurement.h2.a;
import com.google.android.gms.internal.measurement.j3;
import com.google.android.gms.internal.measurement.n6;
import com.google.android.gms.internal.measurement.s7;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class u4
  extends C5
{
  public u4(D5 paramD5)
  {
    super(paramD5);
  }
  
  private static String c(String paramString1, String paramString2)
  {
    throw new SecurityException("This implementation should not be used.");
  }
  
  public final boolean x()
  {
    return false;
  }
  
  public final byte[] y(I paramI, String paramString)
  {
    n();
    a.Q();
    n.i(paramI);
    n.e(paramString);
    boolean bool1 = f().B(paramString, K.f0);
    int i = 0;
    if (!bool1)
    {
      j().F().b("Generating ScionPayload disabled. packageName", paramString);
      return new byte[0];
    }
    if ((!"_iap".equals(o)) && (!"_iapx".equals(o)))
    {
      j().F().c("Generating a payload for this event is not available. package_name, event_name", paramString, o);
      return null;
    }
    c2.a locala = com.google.android.gms.internal.measurement.c2.J();
    q().Q0();
    try
    {
      localI2 = q().D0(paramString);
      if (localI2 == null)
      {
        j().F().b("Log and bundle not available. package_name", paramString);
        q().R0();
        return new byte[0];
      }
    }
    finally
    {
      I2 localI2;
      break label1787;
      if (!localI2.r())
      {
        j().F().b("Log and bundle disabled. package_name", paramString);
        q().R0();
        return new byte[0];
      }
      d2.a locala1 = d2.A3().m0(1).O0("android");
      if (!TextUtils.isEmpty(localI2.t0())) {
        locala1.O(localI2.t0());
      }
      if (!TextUtils.isEmpty(localI2.v0())) {
        locala1.a0((String)n.i(localI2.v0()));
      }
      if (!TextUtils.isEmpty(localI2.h())) {
        locala1.g0((String)n.i(localI2.h()));
      }
      if (localI2.z() != -2147483648L) {
        locala1.d0((int)localI2.z());
      }
      locala1.j0(localI2.g0()).Y(localI2.c0());
      Object localObject1 = localI2.j();
      Object localObject2 = localI2.r0();
      if (!TextUtils.isEmpty((CharSequence)localObject1)) {
        locala1.I0((String)localObject1);
      } else if (!TextUtils.isEmpty((CharSequence)localObject2)) {
        locala1.I((String)localObject2);
      }
      locala1.y0(localI2.p0());
      localObject2 = b.Q(paramString);
      locala1.S(localI2.a0());
      if ((a.p()) && (f().K(locala1.S0())) && (((q3)localObject2).x()) && (!TextUtils.isEmpty(null))) {
        locala1.z0(null);
      }
      locala1.o0(((q3)localObject2).v());
      if ((((q3)localObject2).x()) && (localI2.q()))
      {
        localObject1 = s().z(localI2.t0(), (q3)localObject2);
        if ((localI2.q()) && (localObject1 != null))
        {
          bool1 = TextUtils.isEmpty((CharSequence)first);
          if (!bool1) {
            try
            {
              locala1.Q0(c((String)first, Long.toString(r)));
              localObject1 = second;
              if (localObject1 != null) {
                locala1.V(((Boolean)localObject1).booleanValue());
              }
            }
            catch (SecurityException paramI)
            {
              j().F().b("Resettable device id encryption failed", paramI.getMessage());
              q().R0();
              return new byte[0];
            }
          }
        }
      }
      g().o();
      localObject1 = locala1.w0(Build.MODEL);
      g().o();
      ((d2.a)localObject1).M0(Build.VERSION.RELEASE).u0((int)g().v()).T0(g().w());
      try
      {
        if ((((q3)localObject2).y()) && (localI2.u0() != null)) {
          locala1.U(c((String)n.i(localI2.u0()), Long.toString(r)));
        }
      }
      catch (SecurityException paramI)
      {
        break label1759;
      }
      if (!TextUtils.isEmpty(localI2.i())) {
        locala1.G0((String)n.i(localI2.i()));
      }
      Object localObject3 = localI2.t0();
      localObject1 = q().M0((String)localObject3);
      Object localObject4 = ((List)localObject1).iterator();
      while (((Iterator)localObject4).hasNext())
      {
        localObject2 = (T5)((Iterator)localObject4).next();
        if ("_lte".equals(c)) {
          break label805;
        }
      }
      localObject2 = null;
      label805:
      if ((localObject2 == null) || (e == null))
      {
        localObject2 = new R2/T5;
        ((T5)localObject2).<init>((String)localObject3, "auto", "_lte", b().a(), Long.valueOf(0L));
        ((List)localObject1).add(localObject2);
        q().d0((T5)localObject2);
      }
      localObject2 = new h2[((List)localObject1).size()];
      while (i < ((List)localObject1).size())
      {
        localObject3 = h2.X().z(getc).B(getd);
        o().U((h2.a)localObject3, gete);
        localObject2[i] = ((h2)(Y3)((Y3.b)localObject3).p());
        i++;
      }
      locala1.f0(Arrays.asList((Object[])localObject2));
      o().T(locala1);
      if ((n6.a()) && (f().s(K.T0))) {
        b.s(localI2, locala1);
      }
      localObject2 = c2.b(paramI);
      k().Q(d, q().B0(paramString));
      k().K((c2)localObject2, f().y(paramString));
      localObject1 = d;
      ((BaseBundle)localObject1).putLong("_c", 1L);
      j().F().a("Marking in-app purchase as real-time");
      ((BaseBundle)localObject1).putLong("_r", 1L);
      ((BaseBundle)localObject1).putString("_o", q);
      if (k().F0(locala1.S0()))
      {
        k().R((Bundle)localObject1, "_dbg", Long.valueOf(1L));
        k().R((Bundle)localObject1, "_r", Long.valueOf(1L));
      }
      localObject2 = q().C0(paramString, o);
      if (localObject2 == null)
      {
        localObject2 = new R2/E;
        ((E)localObject2).<init>(paramString, o, 0L, 0L, r, 0L, null, null, null, null);
        l1 = 0L;
      }
      else
      {
        l1 = f;
        localObject2 = ((E)localObject2).a(r);
      }
      q().T((E)localObject2);
      localObject3 = new R2/A;
      ((A)localObject3).<init>(a, q, paramString, o, r, l1, (Bundle)localObject1);
      localObject4 = com.google.android.gms.internal.measurement.Y1.Z().G(d).E(b).A(e);
      localObject1 = f.iterator();
      while (((Iterator)localObject1).hasNext())
      {
        Object localObject5 = (String)((Iterator)localObject1).next();
        a2.a locala2 = com.google.android.gms.internal.measurement.a2.Z().B((String)localObject5);
        localObject5 = f.k((String)localObject5);
        if (localObject5 != null)
        {
          o().S(locala2, localObject5);
          ((Y1.a)localObject4).B(locala2);
        }
      }
      locala1.D((Y1.a)localObject4).E(e2.G().w(Z1.G().w(c).x(o)));
      locala1.H(p().z(localI2.t0(), Collections.emptyList(), locala1.Z0(), Long.valueOf(((Y1.a)localObject4).I()), Long.valueOf(((Y1.a)localObject4).I())));
      if (((Y1.a)localObject4).M()) {
        locala1.v0(((Y1.a)localObject4).I()).e0(((Y1.a)localObject4).I());
      }
      long l1 = localI2.i0();
      boolean bool2 = l1 < 0L;
      if (bool2) {
        locala1.n0(l1);
      }
      long l2 = localI2.m0();
      if (l2 != 0L) {
        locala1.r0(l2);
      } else if (bool2) {
        locala1.r0(l1);
      }
      paramI = localI2.m();
      if ((s7.a()) && (f().B(paramString, K.y0)) && (paramI != null)) {
        locala1.R0(paramI);
      }
      localI2.p();
      locala1.i0((int)localI2.k0()).F0(82001L).C0(b().a()).b0(true);
      if (f().s(K.C0)) {
        b.E(locala1.S0(), locala1);
      }
      locala.x(locala1);
      localI2.j0(locala1.W());
      localI2.f0(locala1.Q());
      q().U(localI2);
      q().T0();
      q().R0();
      try
      {
        paramI = o().g0(((com.google.android.gms.internal.measurement.c2)locala.p()).h());
        return paramI;
      }
      catch (IOException paramI)
      {
        j().G().c("Data loss. Failed to bundle and serialize. appId", Y1.v(paramString), paramI);
        return null;
      }
      label1759:
      j().F().b("app instance id encryption failed", paramI.getMessage());
      q().R0();
      return new byte[0];
      label1787:
      q().R0();
    }
  }
}

/* Location:
 * Qualified Name:     R2.u4
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */