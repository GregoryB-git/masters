package m5;

import E5.k;
import E5.k.c;
import E5.k.d;
import F0.m;
import android.content.Context;
import android.media.audiofx.AudioEffect;
import android.media.audiofx.Equalizer;
import android.media.audiofx.LoudnessEnhancer;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import androidx.media3.exoplayer.dash.DashMediaSource.Factory;
import androidx.media3.exoplayer.hls.HlsMediaSource.Factory;
import d0.B;
import d0.C;
import d0.D;
import d0.D.d;
import d0.D.e;
import d0.I;
import d0.J;
import d0.K;
import d0.K.b.a;
import d0.K.c;
import d0.L;
import d0.L.a;
import d0.b.e;
import d0.q;
import d0.u.c;
import d0.x.b;
import g0.M;
import i0.g.a;
import i0.l.a;
import i0.m.b;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import k0.q.b;
import k0.r.b;
import k0.u;
import k0.w;
import k0.w.b;
import k0.w0;
import k0.x0;
import x0.L.b;
import x0.T;
import x0.T.a;
import x0.U.b;
import x0.f;
import x0.l;

public class d
  implements k.c, D.d, u0.b
{
  public static Random H = new Random();
  public Map A;
  public w B;
  public Integer C;
  public x0.x D;
  public Integer E;
  public final Handler F = new Handler(Looper.getMainLooper());
  public final Runnable G = new a();
  public final Context a;
  public final k b;
  public final e c;
  public final e d;
  public b e;
  public long f;
  public long g;
  public long h;
  public Long i;
  public long j;
  public Integer k;
  public k.d l;
  public k.d m;
  public k.d n;
  public Map o = new HashMap();
  public S0.c p;
  public S0.b q;
  public int r;
  public d0.b s;
  public x0 t;
  public boolean u;
  public w0 v;
  public List w;
  public List x = new ArrayList();
  public Map y = new HashMap();
  public int z = 0;
  
  public d(Context paramContext, E5.c paramc, String paramString, Map paramMap, List paramList, Boolean paramBoolean)
  {
    a = paramContext;
    w = paramList;
    boolean bool;
    if (paramBoolean != null) {
      bool = paramBoolean.booleanValue();
    } else {
      bool = false;
    }
    u = bool;
    paramContext = new StringBuilder();
    paramContext.append("com.ryanheise.just_audio.methods.");
    paramContext.append(paramString);
    paramContext = new k(paramc, paramContext.toString());
    b = paramContext;
    paramContext.e(this);
    paramContext = new StringBuilder();
    paramContext.append("com.ryanheise.just_audio.events.");
    paramContext.append(paramString);
    c = new e(paramc, paramContext.toString());
    paramContext = new StringBuilder();
    paramContext.append("com.ryanheise.just_audio.data.");
    paramContext.append(paramString);
    d = new e(paramc, paramContext.toString());
    e = b.o;
    if (paramMap != null)
    {
      paramc = (Map)paramMap.get("androidLoadControl");
      if (paramc != null)
      {
        paramContext = new r.b().c((int)(L0(paramc.get("minBufferDuration")).longValue() / 1000L), (int)(L0(paramc.get("maxBufferDuration")).longValue() / 1000L), (int)(L0(paramc.get("bufferForPlaybackDuration")).longValue() / 1000L), (int)(L0(paramc.get("bufferForPlaybackAfterRebufferDuration")).longValue() / 1000L)).d(((Boolean)paramc.get("prioritizeTimeOverSizeThresholds")).booleanValue()).b((int)(L0(paramc.get("backBufferDuration")).longValue() / 1000L), false);
        if (paramc.get("targetBufferBytes") != null) {
          paramContext.e(((Integer)paramc.get("targetBufferBytes")).intValue());
        }
        t = paramContext.a();
      }
      paramContext = (Map)paramMap.get("androidLivePlaybackSpeedControl");
      if (paramContext != null) {
        v = new q.b().c((float)((Double)paramContext.get("fallbackMinPlaybackSpeed")).doubleValue()).b((float)((Double)paramContext.get("fallbackMaxPlaybackSpeed")).doubleValue()).f(L0(paramContext.get("minUpdateInterval")).longValue() / 1000L).g((float)((Double)paramContext.get("proportionalControlFactor")).doubleValue()).d(L0(paramContext.get("maxLiveOffsetErrorForUnitSpeed")).longValue() / 1000L).h(L0(paramContext.get("targetLiveOffsetIncrementOnRebuffer")).longValue() / 1000L).e((float)((Double)paramContext.get("minPossibleLiveOffsetSmoothingFactor")).doubleValue()).a();
      }
    }
  }
  
  public static Long L0(Object paramObject)
  {
    if ((paramObject != null) && (!(paramObject instanceof Long))) {
      paramObject = Long.valueOf(((Integer)paramObject).intValue());
    } else {
      paramObject = (Long)paramObject;
    }
    return (Long)paramObject;
  }
  
  public static Object R0(Object paramObject, String paramString)
  {
    if ((paramObject instanceof Map)) {
      return ((Map)paramObject).get(paramString);
    }
    return null;
  }
  
  public static Map S0(Object... paramVarArgs)
  {
    HashMap localHashMap = new HashMap();
    for (int i1 = 0; i1 < paramVarArgs.length; i1 += 2) {
      localHashMap.put((String)paramVarArgs[i1], paramVarArgs[(i1 + 1)]);
    }
    return localHashMap;
  }
  
  public static Map s0(Map paramMap)
  {
    if (paramMap == null) {
      return null;
    }
    HashMap localHashMap = new HashMap();
    Iterator localIterator = paramMap.keySet().iterator();
    while (localIterator.hasNext())
    {
      Object localObject = localIterator.next();
      localHashMap.put((String)localObject, (String)paramMap.get(localObject));
    }
    return localHashMap;
  }
  
  public final T A0(List paramList)
  {
    int i1 = paramList.size();
    int[] arrayOfInt = new int[i1];
    for (int i2 = 0; i2 < i1; i2++) {
      arrayOfInt[i2] = ((Integer)paramList.get(i2)).intValue();
    }
    return new T.a(arrayOfInt, H.nextLong());
  }
  
  public void B0()
  {
    if (e == b.p) {
      T();
    }
    Object localObject = m;
    if (localObject != null)
    {
      ((k.d)localObject).a(new HashMap());
      m = null;
    }
    o.clear();
    D = null;
    t0();
    localObject = B;
    if (localObject != null)
    {
      ((w)localObject).release();
      B = null;
      e = b.o;
      g0();
    }
    c.c();
    d.c();
  }
  
  public final void C0()
  {
    new HashMap();
    A = x0();
  }
  
  public final void D0()
  {
    if (B == null)
    {
      Object localObject1 = new w.b(a);
      Object localObject2 = t;
      if (localObject2 != null) {
        ((w.b)localObject1).m((x0)localObject2);
      }
      localObject2 = v;
      if (localObject2 != null) {
        ((w.b)localObject1).l((w0)localObject2);
      }
      localObject1 = ((w.b)localObject1).f();
      B = ((w)localObject1);
      ((D)localObject1).F(((D)localObject1).O().a().F(new K.b.a().f(u ^ true).g(u ^ true).e(1).d()).C());
      Z0(B.j());
      B.v(this);
    }
  }
  
  public final Map E0()
  {
    Equalizer localEqualizer = (Equalizer)y.get("AndroidEqualizer");
    ArrayList localArrayList = new ArrayList();
    short s1 = 0;
    for (short s2 = s1; s2 < localEqualizer.getNumberOfBands(); s2 = s1)
    {
      localArrayList.add(S0(new Object[] { "index", Short.valueOf(s2), "lowerFrequency", Double.valueOf(localEqualizer.getBandFreqRange(s2)[0] / 1000.0D), "upperFrequency", Double.valueOf(localEqualizer.getBandFreqRange(s2)[1] / 1000.0D), "centerFrequency", Double.valueOf(localEqualizer.getCenterFreq(s2) / 1000.0D), "gain", Double.valueOf(localEqualizer.getBandLevel(s2) / 1000.0D) }));
      s1 = (short)(s2 + 1);
    }
    return S0(new Object[] { "parameters", S0(new Object[] { "minDecibels", Double.valueOf(localEqualizer.getBandLevelRange()[0] / 1000.0D), "maxDecibels", Double.valueOf(localEqualizer.getBandLevelRange()[1] / 1000.0D), "bands", localArrayList }) });
  }
  
  public final void F0(int paramInt, double paramDouble)
  {
    ((Equalizer)y.get("AndroidEqualizer")).setBandLevel((short)paramInt, (short)(int)Math.round(paramDouble * 1000.0D));
  }
  
  public final x0.x G0(Object paramObject)
  {
    Map localMap = (Map)paramObject;
    String str = (String)localMap.get("id");
    x0.x localx = (x0.x)o.get(str);
    paramObject = localx;
    if (localx == null)
    {
      paramObject = z0(localMap);
      o.put(str, paramObject);
    }
    return (x0.x)paramObject;
  }
  
  public final List H0(Object paramObject)
  {
    if ((paramObject instanceof List))
    {
      localObject = (List)paramObject;
      paramObject = new ArrayList();
      for (int i1 = 0; i1 < ((List)localObject).size(); i1++) {
        ((List)paramObject).add(G0(((List)localObject).get(i1)));
      }
      return (List)paramObject;
    }
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append("List expected: ");
    ((StringBuilder)localObject).append(paramObject);
    throw new RuntimeException(((StringBuilder)localObject).toString());
  }
  
  public final x0.x[] I0(Object paramObject)
  {
    List localList = H0(paramObject);
    paramObject = new x0.x[localList.size()];
    localList.toArray((Object[])paramObject);
    return (x0.x[])paramObject;
  }
  
  public void J(L paramL)
  {
    for (int i1 = 0; i1 < paramL.a().size(); i1++)
    {
      J localJ = ((L.a)paramL.a().get(i1)).a();
      for (int i2 = 0; i2 < a; i2++)
      {
        d0.x localx = ak;
        if (localx != null) {
          for (int i3 = 0; i3 < localx.e(); i3++)
          {
            x.b localb = localx.d(i3);
            if ((localb instanceof S0.b))
            {
              q = ((S0.b)localb);
              g0();
            }
          }
        }
      }
    }
  }
  
  public final long J0()
  {
    long l1 = j;
    if (l1 != -9223372036854775807L) {
      return l1;
    }
    Object localObject = e;
    if ((localObject != b.o) && (localObject != b.p))
    {
      localObject = i;
      if ((localObject != null) && (((Long)localObject).longValue() != -9223372036854775807L)) {
        return i.longValue();
      }
      return B.P();
    }
    long l2 = B.P();
    l1 = l2;
    if (l2 < 0L) {
      l1 = 0L;
    }
    return l1;
  }
  
  public final long K0()
  {
    Object localObject = e;
    if ((localObject != b.o) && (localObject != b.p))
    {
      localObject = B;
      if (localObject != null) {
        return ((D)localObject).K();
      }
    }
    return -9223372036854775807L;
  }
  
  public void P(I paramI, int paramInt)
  {
    long l1 = j;
    int i1 = 0;
    if ((l1 != -9223372036854775807L) || (k != null))
    {
      paramI = k;
      if (paramI != null) {
        paramInt = paramI.intValue();
      } else {
        paramInt = 0;
      }
      B.s(paramInt, j);
      k = null;
      j = -9223372036854775807L;
    }
    if (i1()) {
      g0();
    }
    if (B.f() == 4)
    {
      try
      {
        if (!B.u()) {
          break label170;
        }
        if ((z != 0) || (B.M() <= 0)) {
          break label146;
        }
        paramI = B;
        paramInt = i1;
      }
      catch (Exception paramI)
      {
        for (;;)
        {
          break;
          if (!B.B()) {
            break label210;
          }
          B.y();
          break label210;
          if (B.E() >= B.M()) {
            break label210;
          }
          paramI = B;
          paramInt = paramI.E();
        }
        paramI.printStackTrace();
      }
      paramI.s(paramInt, 0L);
    }
    label146:
    label170:
    label210:
    z = B.M();
  }
  
  public final void P0(x0.x paramx, long paramLong, Integer paramInteger, k.d paramd)
  {
    j = paramLong;
    k = paramInteger;
    if (paramInteger != null) {
      i1 = paramInteger.intValue();
    } else {
      i1 = 0;
    }
    E = Integer.valueOf(i1);
    int i1 = e.ordinal();
    if (i1 != 0)
    {
      if (i1 != 1) {}
      for (;;)
      {
        B.stop();
        break;
        T();
      }
    }
    r = 0;
    l = paramd;
    j1();
    e = b.p;
    C0();
    D = paramx;
    B.e(paramx);
    B.g();
  }
  
  public final void Q0(double paramDouble)
  {
    int i1 = (int)Math.round(paramDouble * 1000.0D);
    ((LoudnessEnhancer)y.get("AndroidLoudnessEnhancer")).setTargetGain(i1);
  }
  
  public final void T()
  {
    W0("abort", "Connection aborted");
  }
  
  public void T0()
  {
    if (!B.u()) {
      return;
    }
    B.n(false);
    j1();
    k.d locald = m;
    if (locald != null)
    {
      locald.a(new HashMap());
      m = null;
    }
  }
  
  public void U0(k.d paramd)
  {
    if (B.u())
    {
      paramd.a(new HashMap());
      return;
    }
    k.d locald = m;
    if (locald != null) {
      locald.a(new HashMap());
    }
    m = paramd;
    B.n(true);
    j1();
    if (e == b.s)
    {
      paramd = m;
      if (paramd != null)
      {
        paramd.a(new HashMap());
        m = null;
      }
    }
  }
  
  public void V0(long paramLong, Integer paramInteger, k.d paramd)
  {
    b localb = e;
    if ((localb != b.o) && (localb != b.p))
    {
      W();
      i = Long.valueOf(paramLong);
      n = paramd;
      int i1;
      if (paramInteger != null) {
        try
        {
          i1 = paramInteger.intValue();
        }
        catch (RuntimeException paramInteger)
        {
          break label84;
        }
      } else {
        i1 = B.E();
      }
      B.s(i1, paramLong);
      return;
      label84:
      n = null;
      i = null;
      throw paramInteger;
    }
    paramd.a(new HashMap());
  }
  
  public final void W()
  {
    k.d locald = n;
    if (locald != null) {}
    try
    {
      HashMap localHashMap = new java/util/HashMap;
      localHashMap.<init>();
      locald.a(localHashMap);
      n = null;
      i = null;
      return;
    }
    catch (RuntimeException localRuntimeException)
    {
      for (;;) {}
    }
  }
  
  public final void W0(String paramString1, String paramString2)
  {
    X0(paramString1, paramString2, null);
  }
  
  public void X(int paramInt)
  {
    Object localObject1;
    Object localObject2;
    if (paramInt != 2)
    {
      if (paramInt != 3)
      {
        if (paramInt == 4)
        {
          localObject1 = e;
          localObject2 = b.s;
          if (localObject1 != localObject2)
          {
            j1();
            e = ((b)localObject2);
            g0();
          }
          if (l != null)
          {
            localObject1 = new HashMap();
            l.a(localObject1);
            l = null;
            localObject1 = s;
            if (localObject1 != null)
            {
              B.A((d0.b)localObject1, false);
              s = null;
            }
          }
          localObject1 = m;
          if (localObject1 != null)
          {
            ((k.d)localObject1).a(new HashMap());
            m = null;
          }
        }
      }
      else
      {
        if (B.u()) {
          j1();
        }
        e = b.r;
        g0();
        if (l != null)
        {
          localObject2 = new HashMap();
          if (K0() == -9223372036854775807L) {
            localObject1 = null;
          } else {
            localObject1 = Long.valueOf(K0() * 1000L);
          }
          ((Map)localObject2).put("duration", localObject1);
          l.a(localObject2);
          l = null;
          localObject1 = s;
          if (localObject1 != null)
          {
            B.A((d0.b)localObject1, false);
            s = null;
          }
        }
        if (n != null) {
          v0();
        }
      }
    }
    else
    {
      k1();
      localObject1 = e;
      localObject2 = b.q;
      if ((localObject1 != localObject2) && (localObject1 != b.p))
      {
        e = ((b)localObject2);
        g0();
      }
      h1();
    }
  }
  
  public final void X0(String paramString1, String paramString2, Object paramObject)
  {
    k.d locald = l;
    if (locald != null)
    {
      locald.b(paramString1, paramString2, paramObject);
      l = null;
    }
    c.b(paramString1, paramString2, paramObject);
  }
  
  public final void Y0(int paramInt1, int paramInt2, int paramInt3)
  {
    Object localObject = new b.e();
    ((b.e)localObject).b(paramInt1);
    ((b.e)localObject).c(paramInt2);
    ((b.e)localObject).d(paramInt3);
    localObject = ((b.e)localObject).a();
    if (e == b.p) {
      s = ((d0.b)localObject);
    } else {
      B.A((d0.b)localObject, false);
    }
  }
  
  public final void Z0(int paramInt)
  {
    if (paramInt == 0) {}
    for (Object localObject1 = null;; localObject1 = Integer.valueOf(paramInt))
    {
      C = ((Integer)localObject1);
      break;
    }
    t0();
    if (C != null)
    {
      Iterator localIterator = w.iterator();
      while (localIterator.hasNext())
      {
        Object localObject2 = localIterator.next();
        localObject1 = (Map)localObject2;
        localObject2 = y0(localObject2, C.intValue());
        if (((Boolean)((Map)localObject1).get("enabled")).booleanValue()) {
          ((AudioEffect)localObject2).setEnabled(true);
        }
        x.add(localObject2);
        y.put((String)((Map)localObject1).get("type"), localObject2);
      }
    }
    C0();
  }
  
  public void a1(int paramInt)
  {
    B.i(paramInt);
  }
  
  public void b1(float paramFloat)
  {
    C localC = B.h();
    if (b == paramFloat) {
      return;
    }
    B.k(new C(a, paramFloat));
    C0();
  }
  
  public void c1(boolean paramBoolean)
  {
    B.x(paramBoolean);
  }
  
  public final void d0(String paramString, boolean paramBoolean)
  {
    ((AudioEffect)y.get(paramString)).setEnabled(paramBoolean);
  }
  
  public final void d1(Object paramObject)
  {
    paramObject = (Map)paramObject;
    Object localObject = (String)R0(paramObject, "id");
    localObject = (x0.x)o.get(localObject);
    if (localObject == null) {
      return;
    }
    String str = (String)R0(paramObject, "type");
    str.hashCode();
    if (!str.equals("concatenating"))
    {
      if (str.equals("looping")) {
        d1(R0(paramObject, "child"));
      }
    }
    else
    {
      ((l)localObject).r0(A0((List)R0(paramObject, "shuffleOrder")));
      paramObject = ((List)R0(paramObject, "children")).iterator();
      while (((Iterator)paramObject).hasNext()) {
        d1(((Iterator)paramObject).next());
      }
    }
  }
  
  public void e0(B paramB)
  {
    Object localObject1;
    int i1;
    Object localObject2;
    if ((paramB instanceof u))
    {
      localObject1 = (u)paramB;
      i1 = x;
      if (i1 != 0) {
        if (i1 != 1) {
          if (i1 != 2)
          {
            paramB = new StringBuilder();
            localObject2 = "default ExoPlaybackException: ";
            paramB.append((String)localObject2);
            localObject2 = ((u)localObject1).h();
          }
        }
      }
      for (;;)
      {
        paramB.append(((Throwable)localObject2).getMessage());
        t5.b.b("AudioPlayer", paramB.toString());
        break label146;
        paramB = new StringBuilder();
        localObject2 = "TYPE_UNEXPECTED: ";
        break;
        paramB = new StringBuilder();
        paramB.append("TYPE_RENDERER: ");
        localObject2 = ((u)localObject1).f();
        continue;
        paramB = new StringBuilder();
        paramB.append("TYPE_SOURCE: ");
        localObject2 = ((u)localObject1).g();
      }
      label146:
      paramB = String.valueOf(x);
      localObject2 = ((Throwable)localObject1).getMessage();
      localObject1 = S0(new Object[] { "index", E });
    }
    for (;;)
    {
      X0(paramB, (String)localObject2, localObject1);
      break;
      localObject2 = new StringBuilder();
      ((StringBuilder)localObject2).append("default PlaybackException: ");
      ((StringBuilder)localObject2).append(paramB.getMessage());
      t5.b.b("AudioPlayer", ((StringBuilder)localObject2).toString());
      String str = String.valueOf(o);
      localObject2 = paramB.getMessage();
      localObject1 = S0(new Object[] { "index", E });
      paramB = str;
    }
    r += 1;
    if (B.B())
    {
      paramB = E;
      if ((paramB != null) && (r <= 5))
      {
        i1 = paramB.intValue() + 1;
        if (i1 < B.L().p())
        {
          B.e(D);
          B.g();
          B.s(i1, 0L);
        }
      }
    }
  }
  
  public void e1(boolean paramBoolean)
  {
    B.d(paramBoolean);
  }
  
  public void f1(float paramFloat)
  {
    C localC = B.h();
    if (a == paramFloat) {
      return;
    }
    B.k(new C(paramFloat, b));
    if (B.u()) {
      j1();
    }
    C0();
  }
  
  public final void g0()
  {
    C0();
    l0();
  }
  
  public void g1(float paramFloat)
  {
    B.l(paramFloat);
  }
  
  public final void h1()
  {
    F.removeCallbacks(G);
    F.post(G);
  }
  
  public final boolean i1()
  {
    Integer localInteger = Integer.valueOf(B.E());
    if (!localInteger.equals(E))
    {
      E = localInteger;
      return true;
    }
    return false;
  }
  
  public final void j1()
  {
    f = J0();
    g = System.currentTimeMillis();
  }
  
  public void k0(D.e parame1, D.e parame2, int paramInt)
  {
    j1();
    if ((paramInt == 0) || (paramInt == 1)) {
      i1();
    }
    g0();
  }
  
  public final boolean k1()
  {
    if (J0() == f) {
      return false;
    }
    f = J0();
    g = System.currentTimeMillis();
    return true;
  }
  
  public final void l0()
  {
    Map localMap = A;
    if (localMap != null)
    {
      c.a(localMap);
      A = null;
    }
  }
  
  public final g.a m0(Map paramMap)
  {
    Map localMap = s0(paramMap);
    if (localMap != null)
    {
      localObject = (String)localMap.remove("User-Agent");
      paramMap = (Map)localObject;
      if (localObject == null) {
        paramMap = (String)localMap.remove("user-agent");
      }
    }
    else
    {
      paramMap = null;
    }
    Object localObject = paramMap;
    if (paramMap == null) {
      localObject = M.q0(a, "just_audio");
    }
    paramMap = new m.b().e((String)localObject).c(true);
    if ((localMap != null) && (localMap.size() > 0)) {
      paramMap.d(localMap);
    }
    return new l.a(a, paramMap);
  }
  
  /* Error */
  public void onMethodCall(E5.j paramj, k.d paramd)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 1008	m5/d:D0	()V
    //   4: aload_1
    //   5: getfield 1013	E5/j:a	Ljava/lang/String;
    //   8: astore_3
    //   9: aload_3
    //   10: invokevirtual 834	java/lang/String:hashCode	()I
    //   13: lookupswitch	default:+187->200, -2058172951:+553->566, -1987605894:+536->549, -1875704736:+519->532, -1540835818:+502->515, -1484304041:+485->498, -704119678:+468->481, -345307082:+451->464, -104999328:+434->447, -48357143:+417->430, 3327206:+401->414, 3443508:+385->398, 3526264:+368->381, 106440182:+352->365, 670514716:+336->349, 845471111:+319->332, 986980643:+302->315, 1401390078:+286->299, 1404354821:+270->283, 1454606831:+253->266, 1624925565:+236->249, 1631191096:+219->232, 2117606630:+190->203
    //   200: goto +387 -> 587
    //   203: aload_3
    //   204: ldc_w 1015
    //   207: invokevirtual 839	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   210: ifeq +377 -> 587
    //   213: bipush 18
    //   215: istore 4
    //   217: goto +373 -> 590
    //   220: astore_1
    //   221: goto +1443 -> 1664
    //   224: astore_1
    //   225: goto +1348 -> 1573
    //   228: astore_1
    //   229: goto +1392 -> 1621
    //   232: aload_3
    //   233: ldc_w 1017
    //   236: invokevirtual 839	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   239: ifeq +348 -> 587
    //   242: bipush 10
    //   244: istore 4
    //   246: goto +344 -> 590
    //   249: aload_3
    //   250: ldc_w 1019
    //   253: invokevirtual 839	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   256: ifeq +331 -> 587
    //   259: bipush 20
    //   261: istore 4
    //   263: goto +327 -> 590
    //   266: aload_3
    //   267: ldc_w 1021
    //   270: invokevirtual 839	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   273: ifeq +314 -> 587
    //   276: bipush 12
    //   278: istore 4
    //   280: goto +310 -> 590
    //   283: aload_3
    //   284: ldc_w 1023
    //   287: invokevirtual 839	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   290: ifeq +297 -> 587
    //   293: iconst_4
    //   294: istore 4
    //   296: goto +294 -> 590
    //   299: aload_3
    //   300: ldc_w 1025
    //   303: invokevirtual 839	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   306: ifeq +281 -> 587
    //   309: iconst_5
    //   310: istore 4
    //   312: goto +278 -> 590
    //   315: aload_3
    //   316: ldc_w 1027
    //   319: invokevirtual 839	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   322: ifeq +265 -> 587
    //   325: bipush 16
    //   327: istore 4
    //   329: goto +261 -> 590
    //   332: aload_3
    //   333: ldc_w 1029
    //   336: invokevirtual 839	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   339: ifeq +248 -> 587
    //   342: bipush 15
    //   344: istore 4
    //   346: goto +244 -> 590
    //   349: aload_3
    //   350: ldc_w 1031
    //   353: invokevirtual 839	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   356: ifeq +231 -> 587
    //   359: iconst_3
    //   360: istore 4
    //   362: goto +228 -> 590
    //   365: aload_3
    //   366: ldc_w 1033
    //   369: invokevirtual 839	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   372: ifeq +215 -> 587
    //   375: iconst_2
    //   376: istore 4
    //   378: goto +212 -> 590
    //   381: aload_3
    //   382: ldc_w 1035
    //   385: invokevirtual 839	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   388: ifeq +199 -> 587
    //   391: bipush 13
    //   393: istore 4
    //   395: goto +195 -> 590
    //   398: aload_3
    //   399: ldc_w 1037
    //   402: invokevirtual 839	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   405: ifeq +182 -> 587
    //   408: iconst_1
    //   409: istore 4
    //   411: goto +179 -> 590
    //   414: aload_3
    //   415: ldc_w 1039
    //   418: invokevirtual 839	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   421: ifeq +166 -> 587
    //   424: iconst_0
    //   425: istore 4
    //   427: goto +163 -> 590
    //   430: aload_3
    //   431: ldc_w 1041
    //   434: invokevirtual 839	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   437: ifeq +150 -> 587
    //   440: bipush 7
    //   442: istore 4
    //   444: goto +146 -> 590
    //   447: aload_3
    //   448: ldc_w 1043
    //   451: invokevirtual 839	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   454: ifeq +133 -> 587
    //   457: bipush 17
    //   459: istore 4
    //   461: goto +129 -> 590
    //   464: aload_3
    //   465: ldc_w 1045
    //   468: invokevirtual 839	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   471: ifeq +116 -> 587
    //   474: bipush 19
    //   476: istore 4
    //   478: goto +112 -> 590
    //   481: aload_3
    //   482: ldc_w 1047
    //   485: invokevirtual 839	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   488: ifeq +99 -> 587
    //   491: bipush 11
    //   493: istore 4
    //   495: goto +95 -> 590
    //   498: aload_3
    //   499: ldc_w 1049
    //   502: invokevirtual 839	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   505: ifeq +82 -> 587
    //   508: bipush 9
    //   510: istore 4
    //   512: goto +78 -> 590
    //   515: aload_3
    //   516: ldc_w 1051
    //   519: invokevirtual 839	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   522: ifeq +65 -> 587
    //   525: bipush 14
    //   527: istore 4
    //   529: goto +61 -> 590
    //   532: aload_3
    //   533: ldc_w 1053
    //   536: invokevirtual 839	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   539: ifeq +48 -> 587
    //   542: bipush 6
    //   544: istore 4
    //   546: goto +44 -> 590
    //   549: aload_3
    //   550: ldc_w 1055
    //   553: invokevirtual 839	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   556: ifeq +31 -> 587
    //   559: bipush 8
    //   561: istore 4
    //   563: goto +27 -> 590
    //   566: aload_3
    //   567: ldc_w 1057
    //   570: invokevirtual 839	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   573: istore 5
    //   575: iload 5
    //   577: ifeq +10 -> 587
    //   580: bipush 21
    //   582: istore 4
    //   584: goto +6 -> 590
    //   587: iconst_m1
    //   588: istore 4
    //   590: ldc2_w 617
    //   593: lstore 6
    //   595: iload 4
    //   597: tableswitch	default:+103->700, 0:+907->1504, 1:+899->1496, 2:+884->1481, 3:+855->1452, 4:+826->1423, 5:+797->1394, 6:+769->1366, 7:+741->1338, 8:+698->1295, 9:+676->1273, 10:+665->1262, 11:+654->1251, 12:+643->1240, 13:+593->1190, 14:+495->1092, 15:+394->991, 16:+288->885, 17:+234->831, 18:+196->793, 19:+168->765, 20:+160->757, 21:+112->709
    //   700: aload_2
    //   701: invokeinterface 1058 1 0
    //   706: goto +860 -> 1566
    //   709: aload_0
    //   710: aload_1
    //   711: ldc_w 1060
    //   714: invokevirtual 1063	E5/j:a	(Ljava/lang/String;)Ljava/lang/Object;
    //   717: checkcast 212	java/lang/Integer
    //   720: invokevirtual 216	java/lang/Integer:intValue	()I
    //   723: aload_1
    //   724: ldc_w 496
    //   727: invokevirtual 1063	E5/j:a	(Ljava/lang/String;)Ljava/lang/Object;
    //   730: checkcast 233	java/lang/Double
    //   733: invokevirtual 237	java/lang/Double:doubleValue	()D
    //   736: invokevirtual 1065	m5/d:F0	(ID)V
    //   739: new 84	java/util/HashMap
    //   742: astore_1
    //   743: aload_1
    //   744: invokespecial 85	java/util/HashMap:<init>	()V
    //   747: aload_2
    //   748: aload_1
    //   749: invokeinterface 288 2 0
    //   754: goto +812 -> 1566
    //   757: aload_0
    //   758: invokevirtual 1067	m5/d:E0	()Ljava/util/Map;
    //   761: astore_1
    //   762: goto -15 -> 747
    //   765: aload_0
    //   766: aload_1
    //   767: ldc_w 1069
    //   770: invokevirtual 1063	E5/j:a	(Ljava/lang/String;)Ljava/lang/Object;
    //   773: checkcast 233	java/lang/Double
    //   776: invokevirtual 237	java/lang/Double:doubleValue	()D
    //   779: invokevirtual 1071	m5/d:Q0	(D)V
    //   782: new 84	java/util/HashMap
    //   785: dup
    //   786: invokespecial 85	java/util/HashMap:<init>	()V
    //   789: astore_1
    //   790: goto -43 -> 747
    //   793: aload_0
    //   794: aload_1
    //   795: ldc_w 798
    //   798: invokevirtual 1063	E5/j:a	(Ljava/lang/String;)Ljava/lang/Object;
    //   801: checkcast 298	java/lang/String
    //   804: aload_1
    //   805: ldc_w 790
    //   808: invokevirtual 1063	E5/j:a	(Ljava/lang/String;)Ljava/lang/Object;
    //   811: checkcast 120	java/lang/Boolean
    //   814: invokevirtual 124	java/lang/Boolean:booleanValue	()Z
    //   817: invokevirtual 1073	m5/d:d0	(Ljava/lang/String;Z)V
    //   820: new 84	java/util/HashMap
    //   823: dup
    //   824: invokespecial 85	java/util/HashMap:<init>	()V
    //   827: astore_1
    //   828: goto -81 -> 747
    //   831: aload_0
    //   832: aload_1
    //   833: ldc_w 1075
    //   836: invokevirtual 1063	E5/j:a	(Ljava/lang/String;)Ljava/lang/Object;
    //   839: checkcast 212	java/lang/Integer
    //   842: invokevirtual 216	java/lang/Integer:intValue	()I
    //   845: aload_1
    //   846: ldc_w 1077
    //   849: invokevirtual 1063	E5/j:a	(Ljava/lang/String;)Ljava/lang/Object;
    //   852: checkcast 212	java/lang/Integer
    //   855: invokevirtual 216	java/lang/Integer:intValue	()I
    //   858: aload_1
    //   859: ldc_w 1079
    //   862: invokevirtual 1063	E5/j:a	(Ljava/lang/String;)Ljava/lang/Object;
    //   865: checkcast 212	java/lang/Integer
    //   868: invokevirtual 216	java/lang/Integer:intValue	()I
    //   871: invokevirtual 1081	m5/d:Y0	(III)V
    //   874: new 84	java/util/HashMap
    //   877: dup
    //   878: invokespecial 85	java/util/HashMap:<init>	()V
    //   881: astore_1
    //   882: goto -135 -> 747
    //   885: aload_0
    //   886: aload_1
    //   887: ldc_w 542
    //   890: invokevirtual 1063	E5/j:a	(Ljava/lang/String;)Ljava/lang/Object;
    //   893: invokevirtual 1085	m5/d:w0	(Ljava/lang/Object;)Lx0/l;
    //   896: astore_3
    //   897: aload_1
    //   898: ldc_w 1087
    //   901: invokevirtual 1063	E5/j:a	(Ljava/lang/String;)Ljava/lang/Object;
    //   904: checkcast 212	java/lang/Integer
    //   907: invokevirtual 216	java/lang/Integer:intValue	()I
    //   910: istore 4
    //   912: aload_1
    //   913: ldc_w 1089
    //   916: invokevirtual 1063	E5/j:a	(Ljava/lang/String;)Ljava/lang/Object;
    //   919: checkcast 212	java/lang/Integer
    //   922: invokevirtual 216	java/lang/Integer:intValue	()I
    //   925: istore 8
    //   927: aload_0
    //   928: getfield 109	m5/d:F	Landroid/os/Handler;
    //   931: astore 9
    //   933: new 1091	m5/c
    //   936: astore 10
    //   938: aload 10
    //   940: aload_2
    //   941: invokespecial 1093	m5/c:<init>	(LE5/k$d;)V
    //   944: aload_3
    //   945: iload 4
    //   947: iload 8
    //   949: aload 9
    //   951: aload 10
    //   953: invokevirtual 1096	x0/l:h0	(IILandroid/os/Handler;Ljava/lang/Runnable;)V
    //   956: aload_0
    //   957: aload_1
    //   958: ldc_w 542
    //   961: invokevirtual 1063	E5/j:a	(Ljava/lang/String;)Ljava/lang/Object;
    //   964: invokevirtual 1085	m5/d:w0	(Ljava/lang/Object;)Lx0/l;
    //   967: astore_3
    //   968: aload_0
    //   969: aload_1
    //   970: ldc_w 849
    //   973: invokevirtual 1063	E5/j:a	(Ljava/lang/String;)Ljava/lang/Object;
    //   976: checkcast 340	java/util/List
    //   979: invokevirtual 851	m5/d:A0	(Ljava/util/List;)Lx0/T;
    //   982: astore_1
    //   983: aload_3
    //   984: aload_1
    //   985: invokevirtual 855	x0/l:r0	(Lx0/T;)V
    //   988: goto +578 -> 1566
    //   991: aload_0
    //   992: aload_1
    //   993: ldc_w 542
    //   996: invokevirtual 1063	E5/j:a	(Ljava/lang/String;)Ljava/lang/Object;
    //   999: invokevirtual 1085	m5/d:w0	(Ljava/lang/Object;)Lx0/l;
    //   1002: astore_3
    //   1003: aload_1
    //   1004: ldc_w 1098
    //   1007: invokevirtual 1063	E5/j:a	(Ljava/lang/String;)Ljava/lang/Object;
    //   1010: checkcast 212	java/lang/Integer
    //   1013: invokevirtual 216	java/lang/Integer:intValue	()I
    //   1016: istore 8
    //   1018: aload_1
    //   1019: ldc_w 1100
    //   1022: invokevirtual 1063	E5/j:a	(Ljava/lang/String;)Ljava/lang/Object;
    //   1025: checkcast 212	java/lang/Integer
    //   1028: invokevirtual 216	java/lang/Integer:intValue	()I
    //   1031: istore 4
    //   1033: aload_0
    //   1034: getfield 109	m5/d:F	Landroid/os/Handler;
    //   1037: astore 10
    //   1039: new 1102	m5/b
    //   1042: astore 9
    //   1044: aload 9
    //   1046: aload_2
    //   1047: invokespecial 1103	m5/b:<init>	(LE5/k$d;)V
    //   1050: aload_3
    //   1051: iload 8
    //   1053: iload 4
    //   1055: aload 10
    //   1057: aload 9
    //   1059: invokevirtual 1105	x0/l:m0	(IILandroid/os/Handler;Ljava/lang/Runnable;)V
    //   1062: aload_0
    //   1063: aload_1
    //   1064: ldc_w 542
    //   1067: invokevirtual 1063	E5/j:a	(Ljava/lang/String;)Ljava/lang/Object;
    //   1070: invokevirtual 1085	m5/d:w0	(Ljava/lang/Object;)Lx0/l;
    //   1073: astore_3
    //   1074: aload_0
    //   1075: aload_1
    //   1076: ldc_w 849
    //   1079: invokevirtual 1063	E5/j:a	(Ljava/lang/String;)Ljava/lang/Object;
    //   1082: checkcast 340	java/util/List
    //   1085: invokevirtual 851	m5/d:A0	(Ljava/util/List;)Lx0/T;
    //   1088: astore_1
    //   1089: goto -106 -> 983
    //   1092: aload_0
    //   1093: aload_1
    //   1094: ldc_w 542
    //   1097: invokevirtual 1063	E5/j:a	(Ljava/lang/String;)Ljava/lang/Object;
    //   1100: invokevirtual 1085	m5/d:w0	(Ljava/lang/Object;)Lx0/l;
    //   1103: astore 9
    //   1105: aload_1
    //   1106: ldc_w 470
    //   1109: invokevirtual 1063	E5/j:a	(Ljava/lang/String;)Ljava/lang/Object;
    //   1112: checkcast 212	java/lang/Integer
    //   1115: invokevirtual 216	java/lang/Integer:intValue	()I
    //   1118: istore 4
    //   1120: aload_0
    //   1121: aload_1
    //   1122: ldc_w 857
    //   1125: invokevirtual 1063	E5/j:a	(Ljava/lang/String;)Ljava/lang/Object;
    //   1128: invokevirtual 572	m5/d:H0	(Ljava/lang/Object;)Ljava/util/List;
    //   1131: astore 10
    //   1133: aload_0
    //   1134: getfield 109	m5/d:F	Landroid/os/Handler;
    //   1137: astore 11
    //   1139: new 1107	m5/a
    //   1142: astore_3
    //   1143: aload_3
    //   1144: aload_2
    //   1145: invokespecial 1108	m5/a:<init>	(LE5/k$d;)V
    //   1148: aload 9
    //   1150: iload 4
    //   1152: aload 10
    //   1154: aload 11
    //   1156: aload_3
    //   1157: invokevirtual 1111	x0/l:P	(ILjava/util/Collection;Landroid/os/Handler;Ljava/lang/Runnable;)V
    //   1160: aload_0
    //   1161: aload_1
    //   1162: ldc_w 542
    //   1165: invokevirtual 1063	E5/j:a	(Ljava/lang/String;)Ljava/lang/Object;
    //   1168: invokevirtual 1085	m5/d:w0	(Ljava/lang/Object;)Lx0/l;
    //   1171: astore_3
    //   1172: aload_0
    //   1173: aload_1
    //   1174: ldc_w 849
    //   1177: invokevirtual 1063	E5/j:a	(Ljava/lang/String;)Ljava/lang/Object;
    //   1180: checkcast 340	java/util/List
    //   1183: invokevirtual 851	m5/d:A0	(Ljava/util/List;)Lx0/T;
    //   1186: astore_1
    //   1187: goto -204 -> 983
    //   1190: aload_1
    //   1191: ldc_w 1113
    //   1194: invokevirtual 1063	E5/j:a	(Ljava/lang/String;)Ljava/lang/Object;
    //   1197: invokestatic 181	m5/d:L0	(Ljava/lang/Object;)Ljava/lang/Long;
    //   1200: astore_3
    //   1201: aload_1
    //   1202: ldc_w 470
    //   1205: invokevirtual 1063	E5/j:a	(Ljava/lang/String;)Ljava/lang/Object;
    //   1208: checkcast 212	java/lang/Integer
    //   1211: astore_1
    //   1212: aload_3
    //   1213: ifnonnull +6 -> 1219
    //   1216: goto +13 -> 1229
    //   1219: aload_3
    //   1220: invokevirtual 187	java/lang/Long:longValue	()J
    //   1223: ldc2_w 188
    //   1226: ldiv
    //   1227: lstore 6
    //   1229: aload_0
    //   1230: lload 6
    //   1232: aload_1
    //   1233: aload_2
    //   1234: invokevirtual 1115	m5/d:V0	(JLjava/lang/Integer;LE5/k$d;)V
    //   1237: goto +329 -> 1566
    //   1240: new 84	java/util/HashMap
    //   1243: dup
    //   1244: invokespecial 85	java/util/HashMap:<init>	()V
    //   1247: astore_1
    //   1248: goto -501 -> 747
    //   1251: new 84	java/util/HashMap
    //   1254: dup
    //   1255: invokespecial 85	java/util/HashMap:<init>	()V
    //   1258: astore_1
    //   1259: goto -512 -> 747
    //   1262: new 84	java/util/HashMap
    //   1265: dup
    //   1266: invokespecial 85	java/util/HashMap:<init>	()V
    //   1269: astore_1
    //   1270: goto -523 -> 747
    //   1273: aload_0
    //   1274: aload_1
    //   1275: ldc_w 1117
    //   1278: invokevirtual 1063	E5/j:a	(Ljava/lang/String;)Ljava/lang/Object;
    //   1281: invokevirtual 845	m5/d:d1	(Ljava/lang/Object;)V
    //   1284: new 84	java/util/HashMap
    //   1287: dup
    //   1288: invokespecial 85	java/util/HashMap:<init>	()V
    //   1291: astore_1
    //   1292: goto -545 -> 747
    //   1295: aload_1
    //   1296: ldc_w 1119
    //   1299: invokevirtual 1063	E5/j:a	(Ljava/lang/String;)Ljava/lang/Object;
    //   1302: checkcast 212	java/lang/Integer
    //   1305: invokevirtual 216	java/lang/Integer:intValue	()I
    //   1308: iconst_1
    //   1309: if_icmpne +9 -> 1318
    //   1312: iconst_1
    //   1313: istore 5
    //   1315: goto +6 -> 1321
    //   1318: iconst_0
    //   1319: istore 5
    //   1321: aload_0
    //   1322: iload 5
    //   1324: invokevirtual 1121	m5/d:c1	(Z)V
    //   1327: new 84	java/util/HashMap
    //   1330: dup
    //   1331: invokespecial 85	java/util/HashMap:<init>	()V
    //   1334: astore_1
    //   1335: goto -588 -> 747
    //   1338: aload_0
    //   1339: aload_1
    //   1340: ldc_w 1123
    //   1343: invokevirtual 1063	E5/j:a	(Ljava/lang/String;)Ljava/lang/Object;
    //   1346: checkcast 212	java/lang/Integer
    //   1349: invokevirtual 216	java/lang/Integer:intValue	()I
    //   1352: invokevirtual 1125	m5/d:a1	(I)V
    //   1355: new 84	java/util/HashMap
    //   1358: dup
    //   1359: invokespecial 85	java/util/HashMap:<init>	()V
    //   1362: astore_1
    //   1363: goto -616 -> 747
    //   1366: aload_0
    //   1367: aload_1
    //   1368: ldc_w 790
    //   1371: invokevirtual 1063	E5/j:a	(Ljava/lang/String;)Ljava/lang/Object;
    //   1374: checkcast 120	java/lang/Boolean
    //   1377: invokevirtual 124	java/lang/Boolean:booleanValue	()Z
    //   1380: invokevirtual 1127	m5/d:e1	(Z)V
    //   1383: new 84	java/util/HashMap
    //   1386: dup
    //   1387: invokespecial 85	java/util/HashMap:<init>	()V
    //   1390: astore_1
    //   1391: goto -644 -> 747
    //   1394: aload_0
    //   1395: aload_1
    //   1396: ldc_w 1129
    //   1399: invokevirtual 1063	E5/j:a	(Ljava/lang/String;)Ljava/lang/Object;
    //   1402: checkcast 233	java/lang/Double
    //   1405: invokevirtual 237	java/lang/Double:doubleValue	()D
    //   1408: d2f
    //   1409: invokevirtual 1131	m5/d:b1	(F)V
    //   1412: new 84	java/util/HashMap
    //   1415: dup
    //   1416: invokespecial 85	java/util/HashMap:<init>	()V
    //   1419: astore_1
    //   1420: goto -673 -> 747
    //   1423: aload_0
    //   1424: aload_1
    //   1425: ldc_w 1133
    //   1428: invokevirtual 1063	E5/j:a	(Ljava/lang/String;)Ljava/lang/Object;
    //   1431: checkcast 233	java/lang/Double
    //   1434: invokevirtual 237	java/lang/Double:doubleValue	()D
    //   1437: d2f
    //   1438: invokevirtual 1135	m5/d:f1	(F)V
    //   1441: new 84	java/util/HashMap
    //   1444: dup
    //   1445: invokespecial 85	java/util/HashMap:<init>	()V
    //   1448: astore_1
    //   1449: goto -702 -> 747
    //   1452: aload_0
    //   1453: aload_1
    //   1454: ldc_w 1137
    //   1457: invokevirtual 1063	E5/j:a	(Ljava/lang/String;)Ljava/lang/Object;
    //   1460: checkcast 233	java/lang/Double
    //   1463: invokevirtual 237	java/lang/Double:doubleValue	()D
    //   1466: d2f
    //   1467: invokevirtual 1139	m5/d:g1	(F)V
    //   1470: new 84	java/util/HashMap
    //   1473: dup
    //   1474: invokespecial 85	java/util/HashMap:<init>	()V
    //   1477: astore_1
    //   1478: goto -731 -> 747
    //   1481: aload_0
    //   1482: invokevirtual 1141	m5/d:T0	()V
    //   1485: new 84	java/util/HashMap
    //   1488: dup
    //   1489: invokespecial 85	java/util/HashMap:<init>	()V
    //   1492: astore_1
    //   1493: goto -746 -> 747
    //   1496: aload_0
    //   1497: aload_2
    //   1498: invokevirtual 1143	m5/d:U0	(LE5/k$d;)V
    //   1501: goto +65 -> 1566
    //   1504: aload_1
    //   1505: ldc_w 1145
    //   1508: invokevirtual 1063	E5/j:a	(Ljava/lang/String;)Ljava/lang/Object;
    //   1511: invokestatic 181	m5/d:L0	(Ljava/lang/Object;)Ljava/lang/Long;
    //   1514: astore_3
    //   1515: aload_1
    //   1516: ldc_w 1147
    //   1519: invokevirtual 1063	E5/j:a	(Ljava/lang/String;)Ljava/lang/Object;
    //   1522: checkcast 212	java/lang/Integer
    //   1525: astore 9
    //   1527: aload_0
    //   1528: aload_1
    //   1529: ldc_w 1117
    //   1532: invokevirtual 1063	E5/j:a	(Ljava/lang/String;)Ljava/lang/Object;
    //   1535: invokevirtual 553	m5/d:G0	(Ljava/lang/Object;)Lx0/x;
    //   1538: astore_1
    //   1539: aload_3
    //   1540: ifnonnull +6 -> 1546
    //   1543: goto +13 -> 1556
    //   1546: aload_3
    //   1547: invokevirtual 187	java/lang/Long:longValue	()J
    //   1550: ldc2_w 188
    //   1553: ldiv
    //   1554: lstore 6
    //   1556: aload_0
    //   1557: aload_1
    //   1558: lload 6
    //   1560: aload 9
    //   1562: aload_2
    //   1563: invokevirtual 1149	m5/d:P0	(Lx0/x;JLjava/lang/Integer;LE5/k$d;)V
    //   1566: aload_0
    //   1567: invokevirtual 912	m5/d:l0	()V
    //   1570: goto +93 -> 1663
    //   1573: aload_1
    //   1574: invokevirtual 658	java/lang/Throwable:printStackTrace	()V
    //   1577: new 128	java/lang/StringBuilder
    //   1580: astore_3
    //   1581: aload_3
    //   1582: invokespecial 129	java/lang/StringBuilder:<init>	()V
    //   1585: aload_3
    //   1586: ldc_w 1151
    //   1589: invokevirtual 135	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1592: pop
    //   1593: aload_3
    //   1594: aload_1
    //   1595: invokevirtual 559	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   1598: pop
    //   1599: aload_3
    //   1600: invokevirtual 141	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1603: astore_3
    //   1604: aload_1
    //   1605: invokevirtual 1152	java/lang/Object:toString	()Ljava/lang/String;
    //   1608: astore_1
    //   1609: aload_2
    //   1610: aload_3
    //   1611: aload_1
    //   1612: aconst_null
    //   1613: invokeinterface 762 4 0
    //   1618: goto -52 -> 1566
    //   1621: aload_1
    //   1622: invokevirtual 658	java/lang/Throwable:printStackTrace	()V
    //   1625: new 128	java/lang/StringBuilder
    //   1628: astore_3
    //   1629: aload_3
    //   1630: invokespecial 129	java/lang/StringBuilder:<init>	()V
    //   1633: aload_3
    //   1634: ldc_w 1154
    //   1637: invokevirtual 135	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1640: pop
    //   1641: aload_3
    //   1642: aload_1
    //   1643: invokevirtual 870	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   1646: invokevirtual 135	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1649: pop
    //   1650: aload_3
    //   1651: invokevirtual 141	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1654: astore_3
    //   1655: aload_1
    //   1656: invokevirtual 1152	java/lang/Object:toString	()Ljava/lang/String;
    //   1659: astore_1
    //   1660: goto -51 -> 1609
    //   1663: return
    //   1664: aload_0
    //   1665: invokevirtual 912	m5/d:l0	()V
    //   1668: aload_1
    //   1669: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1670	0	this	d
    //   0	1670	1	paramj	E5.j
    //   0	1670	2	paramd	k.d
    //   8	1647	3	localObject1	Object
    //   215	936	4	i1	int
    //   573	750	5	bool	boolean
    //   593	966	6	l1	long
    //   925	127	8	i2	int
    //   931	630	9	localObject2	Object
    //   936	217	10	localObject3	Object
    //   1137	18	11	localHandler	Handler
    // Exception table:
    //   from	to	target	type
    //   4	200	220	finally
    //   203	213	220	finally
    //   232	242	220	finally
    //   249	259	220	finally
    //   266	276	220	finally
    //   283	293	220	finally
    //   299	309	220	finally
    //   315	325	220	finally
    //   332	342	220	finally
    //   349	359	220	finally
    //   365	375	220	finally
    //   381	391	220	finally
    //   398	408	220	finally
    //   414	424	220	finally
    //   430	440	220	finally
    //   447	457	220	finally
    //   464	474	220	finally
    //   481	491	220	finally
    //   498	508	220	finally
    //   515	525	220	finally
    //   532	542	220	finally
    //   549	559	220	finally
    //   566	575	220	finally
    //   700	706	220	finally
    //   709	747	220	finally
    //   747	754	220	finally
    //   757	762	220	finally
    //   765	790	220	finally
    //   793	828	220	finally
    //   831	882	220	finally
    //   885	983	220	finally
    //   983	988	220	finally
    //   991	1089	220	finally
    //   1092	1187	220	finally
    //   1190	1212	220	finally
    //   1219	1229	220	finally
    //   1229	1237	220	finally
    //   1240	1248	220	finally
    //   1251	1259	220	finally
    //   1262	1270	220	finally
    //   1273	1292	220	finally
    //   1295	1312	220	finally
    //   1321	1335	220	finally
    //   1338	1363	220	finally
    //   1366	1391	220	finally
    //   1394	1420	220	finally
    //   1423	1449	220	finally
    //   1452	1478	220	finally
    //   1481	1493	220	finally
    //   1496	1501	220	finally
    //   1504	1539	220	finally
    //   1546	1556	220	finally
    //   1556	1566	220	finally
    //   1573	1609	220	finally
    //   1609	1618	220	finally
    //   1621	1660	220	finally
    //   4	200	224	java/lang/Exception
    //   203	213	224	java/lang/Exception
    //   232	242	224	java/lang/Exception
    //   249	259	224	java/lang/Exception
    //   266	276	224	java/lang/Exception
    //   283	293	224	java/lang/Exception
    //   299	309	224	java/lang/Exception
    //   315	325	224	java/lang/Exception
    //   332	342	224	java/lang/Exception
    //   349	359	224	java/lang/Exception
    //   365	375	224	java/lang/Exception
    //   381	391	224	java/lang/Exception
    //   398	408	224	java/lang/Exception
    //   414	424	224	java/lang/Exception
    //   430	440	224	java/lang/Exception
    //   447	457	224	java/lang/Exception
    //   464	474	224	java/lang/Exception
    //   481	491	224	java/lang/Exception
    //   498	508	224	java/lang/Exception
    //   515	525	224	java/lang/Exception
    //   532	542	224	java/lang/Exception
    //   549	559	224	java/lang/Exception
    //   566	575	224	java/lang/Exception
    //   700	706	224	java/lang/Exception
    //   709	747	224	java/lang/Exception
    //   747	754	224	java/lang/Exception
    //   757	762	224	java/lang/Exception
    //   765	790	224	java/lang/Exception
    //   793	828	224	java/lang/Exception
    //   831	882	224	java/lang/Exception
    //   885	983	224	java/lang/Exception
    //   983	988	224	java/lang/Exception
    //   991	1089	224	java/lang/Exception
    //   1092	1187	224	java/lang/Exception
    //   1190	1212	224	java/lang/Exception
    //   1219	1229	224	java/lang/Exception
    //   1229	1237	224	java/lang/Exception
    //   1240	1248	224	java/lang/Exception
    //   1251	1259	224	java/lang/Exception
    //   1262	1270	224	java/lang/Exception
    //   1273	1292	224	java/lang/Exception
    //   1295	1312	224	java/lang/Exception
    //   1321	1335	224	java/lang/Exception
    //   1338	1363	224	java/lang/Exception
    //   1366	1391	224	java/lang/Exception
    //   1394	1420	224	java/lang/Exception
    //   1423	1449	224	java/lang/Exception
    //   1452	1478	224	java/lang/Exception
    //   1481	1493	224	java/lang/Exception
    //   1496	1501	224	java/lang/Exception
    //   1504	1539	224	java/lang/Exception
    //   1546	1556	224	java/lang/Exception
    //   1556	1566	224	java/lang/Exception
    //   4	200	228	java/lang/IllegalStateException
    //   203	213	228	java/lang/IllegalStateException
    //   232	242	228	java/lang/IllegalStateException
    //   249	259	228	java/lang/IllegalStateException
    //   266	276	228	java/lang/IllegalStateException
    //   283	293	228	java/lang/IllegalStateException
    //   299	309	228	java/lang/IllegalStateException
    //   315	325	228	java/lang/IllegalStateException
    //   332	342	228	java/lang/IllegalStateException
    //   349	359	228	java/lang/IllegalStateException
    //   365	375	228	java/lang/IllegalStateException
    //   381	391	228	java/lang/IllegalStateException
    //   398	408	228	java/lang/IllegalStateException
    //   414	424	228	java/lang/IllegalStateException
    //   430	440	228	java/lang/IllegalStateException
    //   447	457	228	java/lang/IllegalStateException
    //   464	474	228	java/lang/IllegalStateException
    //   481	491	228	java/lang/IllegalStateException
    //   498	508	228	java/lang/IllegalStateException
    //   515	525	228	java/lang/IllegalStateException
    //   532	542	228	java/lang/IllegalStateException
    //   549	559	228	java/lang/IllegalStateException
    //   566	575	228	java/lang/IllegalStateException
    //   700	706	228	java/lang/IllegalStateException
    //   709	747	228	java/lang/IllegalStateException
    //   747	754	228	java/lang/IllegalStateException
    //   757	762	228	java/lang/IllegalStateException
    //   765	790	228	java/lang/IllegalStateException
    //   793	828	228	java/lang/IllegalStateException
    //   831	882	228	java/lang/IllegalStateException
    //   885	983	228	java/lang/IllegalStateException
    //   983	988	228	java/lang/IllegalStateException
    //   991	1089	228	java/lang/IllegalStateException
    //   1092	1187	228	java/lang/IllegalStateException
    //   1190	1212	228	java/lang/IllegalStateException
    //   1219	1229	228	java/lang/IllegalStateException
    //   1229	1237	228	java/lang/IllegalStateException
    //   1240	1248	228	java/lang/IllegalStateException
    //   1251	1259	228	java/lang/IllegalStateException
    //   1262	1270	228	java/lang/IllegalStateException
    //   1273	1292	228	java/lang/IllegalStateException
    //   1295	1312	228	java/lang/IllegalStateException
    //   1321	1335	228	java/lang/IllegalStateException
    //   1338	1363	228	java/lang/IllegalStateException
    //   1366	1391	228	java/lang/IllegalStateException
    //   1394	1420	228	java/lang/IllegalStateException
    //   1423	1449	228	java/lang/IllegalStateException
    //   1452	1478	228	java/lang/IllegalStateException
    //   1481	1493	228	java/lang/IllegalStateException
    //   1496	1501	228	java/lang/IllegalStateException
    //   1504	1539	228	java/lang/IllegalStateException
    //   1546	1556	228	java/lang/IllegalStateException
    //   1556	1566	228	java/lang/IllegalStateException
  }
  
  public final m p0(Map paramMap)
  {
    m localm = new m();
    if (paramMap != null)
    {
      paramMap = (Map)paramMap.get("androidExtractorOptions");
      if (paramMap != null)
      {
        bool1 = ((Boolean)paramMap.get("constantBitrateSeekingEnabled")).booleanValue();
        bool2 = ((Boolean)paramMap.get("constantBitrateSeekingAlwaysEnabled")).booleanValue();
        i1 = ((Integer)paramMap.get("mp3Flags")).intValue();
        break label90;
      }
    }
    boolean bool1 = true;
    boolean bool2 = false;
    int i1 = 0;
    label90:
    localm.i(bool1);
    localm.h(bool2);
    localm.j(i1);
    return localm;
  }
  
  public final void t0()
  {
    Iterator localIterator = x.iterator();
    while (localIterator.hasNext())
    {
      ((AudioEffect)localIterator.next()).release();
      localIterator.remove();
    }
    y.clear();
  }
  
  public final Map u0()
  {
    HashMap localHashMap1 = new HashMap();
    HashMap localHashMap2;
    if (p != null)
    {
      localHashMap2 = new HashMap();
      localHashMap2.put("title", p.p);
      localHashMap2.put("url", p.q);
      localHashMap1.put("info", localHashMap2);
    }
    if (q != null)
    {
      localHashMap2 = new HashMap();
      localHashMap2.put("bitrate", Integer.valueOf(q.o));
      localHashMap2.put("genre", q.p);
      localHashMap2.put("name", q.q);
      localHashMap2.put("metadataInterval", Integer.valueOf(q.t));
      localHashMap2.put("url", q.r);
      localHashMap2.put("isPublic", Boolean.valueOf(q.s));
      localHashMap1.put("headers", localHashMap2);
    }
    return localHashMap1;
  }
  
  public final void v0()
  {
    i = null;
    n.a(new HashMap());
    n = null;
  }
  
  public final l w0(Object paramObject)
  {
    return (l)o.get((String)paramObject);
  }
  
  public void x(d0.x paramx)
  {
    for (int i1 = 0; i1 < paramx.e(); i1++)
    {
      x.b localb = paramx.d(i1);
      if ((localb instanceof S0.c))
      {
        p = ((S0.c)localb);
        g0();
      }
    }
  }
  
  public final Map x0()
  {
    HashMap localHashMap = new HashMap();
    Long localLong;
    if (K0() == -9223372036854775807L) {
      localLong = null;
    } else {
      localLong = Long.valueOf(K0() * 1000L);
    }
    w localw = B;
    long l1;
    if (localw != null) {
      l1 = localw.t();
    } else {
      l1 = 0L;
    }
    h = l1;
    localHashMap.put("processingState", Integer.valueOf(e.ordinal()));
    localHashMap.put("updatePosition", Long.valueOf(f * 1000L));
    localHashMap.put("updateTime", Long.valueOf(g));
    localHashMap.put("bufferedPosition", Long.valueOf(Math.max(f, h) * 1000L));
    localHashMap.put("icyMetadata", u0());
    localHashMap.put("duration", localLong);
    localHashMap.put("currentIndex", E);
    localHashMap.put("androidAudioSessionId", C);
    return localHashMap;
  }
  
  public final AudioEffect y0(Object paramObject, int paramInt)
  {
    paramObject = (Map)paramObject;
    Object localObject = (String)((Map)paramObject).get("type");
    ((String)localObject).hashCode();
    if (!((String)localObject).equals("AndroidEqualizer"))
    {
      if (((String)localObject).equals("AndroidLoudnessEnhancer"))
      {
        int i1 = (int)Math.round(((Double)((Map)paramObject).get("targetGain")).doubleValue() * 1000.0D);
        paramObject = new LoudnessEnhancer(paramInt);
        ((LoudnessEnhancer)paramObject).setTargetGain(i1);
        return (AudioEffect)paramObject;
      }
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append("Unknown AudioEffect type: ");
      ((StringBuilder)localObject).append(((Map)paramObject).get("type"));
      throw new IllegalArgumentException(((StringBuilder)localObject).toString());
    }
    return new Equalizer(0, paramInt);
  }
  
  public final x0.x z0(Object paramObject)
  {
    paramObject = (Map)paramObject;
    Object localObject1 = (String)((Map)paramObject).get("id");
    Object localObject2 = (String)((Map)paramObject).get("type");
    ((String)localObject2).hashCode();
    int i1 = ((String)localObject2).hashCode();
    int i2 = 0;
    int i3 = -1;
    switch (i1)
    {
    default: 
      break;
    case 2092627105: 
      if (((String)localObject2).equals("silence")) {
        i3 = 6;
      }
      break;
    case 1131547531: 
      if (((String)localObject2).equals("progressive")) {
        i3 = 5;
      }
      break;
    case 918617282: 
      if (((String)localObject2).equals("clipping")) {
        i3 = 4;
      }
      break;
    case 349937342: 
      if (((String)localObject2).equals("looping")) {
        i3 = 3;
      }
      break;
    case 3075986: 
      if (((String)localObject2).equals("dash")) {
        i3 = 2;
      }
      break;
    case 103407: 
      if (((String)localObject2).equals("hls")) {
        i3 = 1;
      }
      break;
    case -445916622: 
      if (((String)localObject2).equals("concatenating")) {
        i3 = 0;
      }
      break;
    }
    switch (i3)
    {
    default: 
      localObject2 = new StringBuilder();
      ((StringBuilder)localObject2).append("Unknown AudioSource type: ");
      ((StringBuilder)localObject2).append(((Map)paramObject).get("type"));
      throw new IllegalArgumentException(((StringBuilder)localObject2).toString());
    case 6: 
      return new U.b().b(L0(((Map)paramObject).get("duration")).longValue()).c(localObject1).a();
    case 5: 
      return new L.b(m0((Map)R0(paramObject, "headers")), p0((Map)R0(paramObject, "options"))).b(new u.c().e(Uri.parse((String)((Map)paramObject).get("uri"))).d(localObject1).a());
    case 4: 
      localObject2 = L0(((Map)paramObject).get("start"));
      localObject1 = L0(((Map)paramObject).get("end"));
      paramObject = G0(((Map)paramObject).get("child"));
      if (localObject2 != null) {}
      for (long l1 = ((Long)localObject2).longValue();; l1 = 0L) {
        break;
      }
      if (localObject1 != null) {}
      for (long l2 = ((Long)localObject1).longValue();; l2 = Long.MIN_VALUE) {
        break;
      }
      return new f((x0.x)paramObject, l1, l2);
    case 3: 
      localObject2 = (Integer)((Map)paramObject).get("count");
      paramObject = G0(((Map)paramObject).get("child"));
      i1 = ((Integer)localObject2).intValue();
      localObject2 = new x0.x[i1];
      for (i3 = i2; i3 < i1; i3++) {
        localObject2[i3] = paramObject;
      }
      return new l((x0.x[])localObject2);
    case 2: 
      return new DashMediaSource.Factory(m0((Map)R0(paramObject, "headers"))).a(new u.c().e(Uri.parse((String)((Map)paramObject).get("uri"))).c("application/dash+xml").d(localObject1).a());
    case 1: 
      return new HlsMediaSource.Factory(m0((Map)R0(paramObject, "headers"))).a(new u.c().e(Uri.parse((String)((Map)paramObject).get("uri"))).c("application/x-mpegURL").a());
    }
    localObject2 = I0(((Map)paramObject).get("children"));
    return new l(false, ((Boolean)((Map)paramObject).get("useLazyPreparation")).booleanValue(), A0((List)R0(paramObject, "shuffleOrder")), (x0.x[])localObject2);
  }
  
  public class a
    implements Runnable
  {
    public a() {}
    
    public void run()
    {
      if (d.Z(d.this) == null) {
        return;
      }
      if (d.Z(d.this).t() != d.a0(d.this)) {
        d.b0(d.this);
      }
      int i = d.Z(d.this).f();
      Handler localHandler;
      long l;
      if (i != 2)
      {
        if (i != 3) {
          return;
        }
        if (d.Z(d.this).u())
        {
          localHandler = d.c0(d.this);
          l = 500L;
        }
      }
      for (;;)
      {
        localHandler.postDelayed(this, l);
        break;
        localHandler = d.c0(d.this);
        l = 1000L;
        continue;
        localHandler = d.c0(d.this);
        l = 200L;
      }
    }
  }
  
  public static enum b {}
}

/* Location:
 * Qualified Name:     m5.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */