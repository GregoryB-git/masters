package ua;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.media.audiofx.AudioEffect;
import android.media.audiofx.Equalizer;
import android.media.audiofx.LoudnessEnhancer;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import com.google.android.exoplayer2.source.dash.DashMediaSource.Factory;
import com.google.android.exoplayer2.source.hls.HlsMediaSource.Factory;
import io.flutter.Log;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.MethodChannel.MethodCallHandler;
import io.flutter.plugin.common.MethodChannel.Result;
import java.io.IOException;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import t5.a0;
import t5.c0;
import t5.k.a;
import t5.r.a;
import t5.s.a;
import v3.c1;
import v3.d0;
import v3.e1;
import v3.f1.c;
import v3.f1.d;
import v3.g0;
import v3.i;
import v3.j;
import v3.n;
import v3.o0;
import v3.o0.a;
import v3.o0.b.a;
import v3.o0.c;
import v3.o0.d;
import v3.o0.d.a;
import v3.o0.e;
import v3.o0.e.a;
import v3.o0.f;
import v3.r;
import v3.r1;
import v3.s1;
import v3.s1.a;
import v5.a0.a;
import v5.e0;
import v5.k;
import z4.e0.a;
import z4.f0;
import z4.t;
import z4.x.a;
import z4.z;

public final class a
  implements MethodChannel.MethodCallHandler, f1.c, p4.e
{
  public static Random O = new Random();
  public j A;
  public boolean B;
  public i C;
  public List<Object> D;
  public ArrayList E = new ArrayList();
  public HashMap F = new HashMap();
  public int G;
  public HashMap H;
  public d0 I;
  public Integer J;
  public t K;
  public Integer L;
  public final Handler M;
  public final a N;
  public final Context a;
  public final b b;
  public final b c;
  public int d;
  public long e;
  public long f;
  public long o;
  public Long p;
  public long q;
  public Integer r;
  public MethodChannel.Result s;
  public MethodChannel.Result t;
  public MethodChannel.Result u;
  public HashMap v = new HashMap();
  public t4.c w;
  public t4.b x;
  public int y;
  public x3.d z;
  
  public a(Context paramContext, BinaryMessenger paramBinaryMessenger, String paramString, Map<?, ?> paramMap, List<Object> paramList, Boolean paramBoolean)
  {
    boolean bool1 = false;
    G = 0;
    M = new Handler(Looper.getMainLooper());
    N = new a();
    a = paramContext;
    D = paramList;
    boolean bool2;
    if (paramBoolean != null) {
      bool2 = paramBoolean.booleanValue();
    } else {
      bool2 = false;
    }
    B = bool2;
    new MethodChannel(paramBinaryMessenger, g.d("com.ryanheise.just_audio.methods.", paramString)).setMethodCallHandler(this);
    b = new b(paramBinaryMessenger, g.d("com.ryanheise.just_audio.events.", paramString));
    c = new b(paramBinaryMessenger, g.d("com.ryanheise.just_audio.data.", paramString));
    d = 1;
    if (paramMap != null)
    {
      paramContext = (Map)paramMap.get("androidLoadControl");
      int i;
      if (paramContext != null)
      {
        i = -1;
        int j = (int)(t0(paramContext.get("minBufferDuration")).longValue() / 1000L);
        int k = (int)(t0(paramContext.get("maxBufferDuration")).longValue() / 1000L);
        int m = (int)(t0(paramContext.get("bufferForPlaybackDuration")).longValue() / 1000L);
        int n = (int)(t0(paramContext.get("bufferForPlaybackAfterRebufferDuration")).longValue() / 1000L);
        j.j("bufferForPlaybackMs", m, 0, "0");
        j.j("bufferForPlaybackAfterRebufferMs", n, 0, "0");
        j.j("minBufferMs", j, m, "bufferForPlaybackMs");
        j.j("minBufferMs", j, n, "bufferForPlaybackAfterRebufferMs");
        j.j("maxBufferMs", k, j, "minBufferMs");
        bool2 = ((Boolean)paramContext.get("prioritizeTimeOverSizeThresholds")).booleanValue();
        int i1 = (int)(t0(paramContext.get("backBufferDuration")).longValue() / 1000L);
        j.j("backBufferDurationMs", i1, 0, "0");
        if (paramContext.get("targetBufferBytes") != null) {
          i = ((Integer)paramContext.get("targetBufferBytes")).intValue();
        }
        A = new j(new t5.o(), j, k, m, n, i, bool2, i1, false);
      }
      paramContext = (Map)paramMap.get("androidLivePlaybackSpeedControl");
      if (paramContext != null)
      {
        i = e0.a;
        float f1 = (float)((Double)paramContext.get("fallbackMinPlaybackSpeed")).doubleValue();
        if ((0.0F < f1) && (f1 <= 1.0F)) {
          bool2 = true;
        } else {
          bool2 = false;
        }
        x6.b.q(bool2);
        float f2 = (float)((Double)paramContext.get("fallbackMaxPlaybackSpeed")).doubleValue();
        if (f2 >= 1.0F) {
          bool2 = true;
        } else {
          bool2 = false;
        }
        x6.b.q(bool2);
        long l1 = t0(paramContext.get("minUpdateInterval")).longValue() / 1000L;
        if (l1 > 0L) {
          bool2 = true;
        } else {
          bool2 = false;
        }
        x6.b.q(bool2);
        float f3 = (float)((Double)paramContext.get("proportionalControlFactor")).doubleValue();
        if (f3 > 0.0F) {
          bool2 = true;
        } else {
          bool2 = false;
        }
        x6.b.q(bool2);
        float f4 = f3 / 1000000.0F;
        long l2 = t0(paramContext.get("maxLiveOffsetErrorForUnitSpeed")).longValue() / 1000L;
        if (l2 > 0L) {
          bool2 = true;
        } else {
          bool2 = false;
        }
        x6.b.q(bool2);
        l2 = e0.I(l2);
        long l3 = t0(paramContext.get("targetLiveOffsetIncrementOnRebuffer")).longValue() / 1000L;
        if (l3 >= 0L) {
          bool2 = true;
        } else {
          bool2 = false;
        }
        x6.b.q(bool2);
        l3 = e0.I(l3);
        f3 = (float)((Double)paramContext.get("minPossibleLiveOffsetSmoothingFactor")).doubleValue();
        bool2 = bool1;
        if (f3 >= 0.0F)
        {
          bool2 = bool1;
          if (f3 < 1.0F) {
            bool2 = true;
          }
        }
        x6.b.q(bool2);
        C = new i(f1, f2, l1, f4, l2, l3, f3);
      }
    }
  }
  
  public static e0.a U(List paramList)
  {
    int i = paramList.size();
    int[] arrayOfInt = new int[i];
    for (int j = 0; j < i; j++) {
      arrayOfInt[j] = ((Integer)paramList.get(j)).intValue();
    }
    long l = O.nextLong();
    return new e0.a(Arrays.copyOf(arrayOfInt, i), new Random(l));
  }
  
  public static Long t0(Object paramObject)
  {
    if ((paramObject != null) && (!(paramObject instanceof Long))) {
      paramObject = Long.valueOf(((Integer)paramObject).intValue());
    } else {
      paramObject = (Long)paramObject;
    }
    return (Long)paramObject;
  }
  
  public static <T> T w0(Object paramObject, String paramString)
  {
    if ((paramObject instanceof Map)) {
      return (T)((Map)paramObject).get(paramString);
    }
    return null;
  }
  
  public static HashMap x0(Object... paramVarArgs)
  {
    HashMap localHashMap = new HashMap();
    for (int i = 0; i < paramVarArgs.length; i += 2) {
      localHashMap.put((String)paramVarArgs[i], paramVarArgs[(i + 1)]);
    }
    return localHashMap;
  }
  
  public final void A0(long paramLong, Integer paramInteger, MethodChannel.Result paramResult)
  {
    int i = d;
    MethodChannel.Result localResult;
    if ((i != 1) && (i != 2))
    {
      localResult = u;
      if (localResult == null) {}
    }
    try
    {
      HashMap localHashMap = new java/util/HashMap;
      localHashMap.<init>();
      localResult.success(localHashMap);
      u = null;
      p = null;
      p = Long.valueOf(paramLong);
      u = paramResult;
      if (paramInteger != null) {}
      try
      {
        i = paramInteger.intValue();
        break label97;
        i = I.F();
        label97:
        I.S(i, paramLong, false);
        return;
      }
      catch (RuntimeException paramInteger)
      {
        u = null;
        p = null;
        throw paramInteger;
      }
      paramResult.success(new HashMap());
      return;
    }
    catch (RuntimeException localRuntimeException)
    {
      for (;;) {}
    }
  }
  
  public final void B(String paramString, boolean paramBoolean)
  {
    ((AudioEffect)F.get(paramString)).setEnabled(paramBoolean);
  }
  
  public final void B0(String paramString1, String paramString2, HashMap paramHashMap)
  {
    MethodChannel.Result localResult = s;
    if (localResult != null)
    {
      localResult.error(paramString1, paramString2, paramHashMap);
      s = null;
    }
    b.error(paramString1, paramString2, paramHashMap);
  }
  
  public final void C0(int paramInt1, int paramInt2, int paramInt3)
  {
    x3.d locald = new x3.d(paramInt1, paramInt2, paramInt3, 1, 0);
    if (d == 2) {
      z = locald;
    } else {
      I.k0(locald, false);
    }
  }
  
  public final void D0(int paramInt)
  {
    I.u(paramInt);
  }
  
  public final void E()
  {
    f0();
    H();
  }
  
  public final void E0(float paramFloat)
  {
    e1 locale1 = I.f();
    if (b == paramFloat) {
      return;
    }
    I.c(new e1(a, paramFloat));
    f0();
  }
  
  public final void F0(boolean paramBoolean)
  {
    I.n(paramBoolean);
  }
  
  public final void G(int paramInt, f1.d paramd1, f1.d paramd2)
  {
    K0();
    if ((paramInt == 0) || (paramInt == 1))
    {
      paramd1 = Integer.valueOf(I.F());
      if (!paramd1.equals(L)) {
        L = paramd1;
      }
    }
    E();
  }
  
  public final void G0(Object paramObject)
  {
    paramObject = (Map)paramObject;
    Object localObject = (String)w0(paramObject, "id");
    localObject = (t)v.get(localObject);
    if (localObject == null) {
      return;
    }
    String str = (String)w0(paramObject, "type");
    str.getClass();
    if (!str.equals("concatenating"))
    {
      if (str.equals("looping")) {
        G0(w0(paramObject, "child"));
      }
    }
    else
    {
      ((z4.h)localObject).P(U((List)w0(paramObject, "shuffleOrder")));
      paramObject = ((List)w0(paramObject, "children")).iterator();
      while (((Iterator)paramObject).hasNext()) {
        G0(((Iterator)paramObject).next());
      }
    }
  }
  
  public final void H()
  {
    HashMap localHashMap = H;
    if (localHashMap != null)
    {
      b.success(localHashMap);
      H = null;
    }
  }
  
  public final void H0(boolean paramBoolean)
  {
    d0 locald0 = I;
    locald0.u0();
    if (Y != paramBoolean)
    {
      Y = paramBoolean;
      locald0.j0(Boolean.valueOf(paramBoolean), 1, 9);
      l.e(23, new v3.u(0, paramBoolean));
    }
  }
  
  public final void I0(float paramFloat)
  {
    e1 locale1 = I.f();
    if (a == paramFloat) {
      return;
    }
    I.c(new e1(paramFloat, b));
    if (I.k()) {
      K0();
    }
    f0();
  }
  
  public final void J0(float paramFloat)
  {
    I.o0(paramFloat);
  }
  
  public final void K0()
  {
    e = r0();
    f = System.currentTimeMillis();
  }
  
  public final r.a M(Map arg1)
  {
    Object localObject1;
    if (??? == null)
    {
      localObject1 = null;
    }
    else
    {
      localObject3 = new HashMap();
      localObject4 = ???.keySet().iterator();
      for (;;)
      {
        localObject1 = localObject3;
        if (!((Iterator)localObject4).hasNext()) {
          break;
        }
        localObject1 = ((Iterator)localObject4).next();
        ((HashMap)localObject3).put((String)localObject1, (String)???.get(localObject1));
      }
    }
    if (localObject1 != null)
    {
      localObject3 = (String)((Map)localObject1).remove("User-Agent");
      ??? = (Map)localObject3;
      if (localObject3 == null) {
        ??? = (String)((Map)localObject1).remove("user-agent");
      }
    }
    else
    {
      ??? = null;
    }
    Object localObject3 = ???;
    if (??? == null)
    {
      ??? = a;
      int i = e0.a;
      try
      {
        localObject3 = ???.getPackageName();
        ??? = getPackageManagergetPackageInfo0versionName;
      }
      catch (PackageManager.NameNotFoundException ???)
      {
        ??? = "?";
      }
      localObject3 = new StringBuilder();
      ((StringBuilder)localObject3).append("just_audio");
      ((StringBuilder)localObject3).append("/");
      ((StringBuilder)localObject3).append(???);
      ((StringBuilder)localObject3).append(" (Linux;Android ");
      ((StringBuilder)localObject3).append(Build.VERSION.RELEASE);
      ((StringBuilder)localObject3).append(") ");
      ((StringBuilder)localObject3).append("ExoPlayerLib/2.18.7");
      localObject3 = ((StringBuilder)localObject3).toString();
    }
    Object localObject4 = new s.a();
    b = ((String)localObject3);
    e = true;
    if ((localObject1 != null) && (((Map)localObject1).size() > 0)) {
      synchronized (a)
      {
        b = null;
        a.clear();
        a.putAll((Map)localObject1);
      }
    }
    return new r.a(a, (k.a)localObject4);
  }
  
  public final void N(int paramInt)
  {
    if (paramInt != 2)
    {
      Object localObject;
      if (paramInt != 3)
      {
        if (paramInt == 4)
        {
          if (d != 5)
          {
            K0();
            d = 5;
            E();
          }
          if (s != null)
          {
            localObject = new HashMap();
            s.success(localObject);
            s = null;
            localObject = z;
            if (localObject != null)
            {
              I.k0((x3.d)localObject, false);
              z = null;
            }
          }
          localObject = t;
          if (localObject != null)
          {
            ((MethodChannel.Result)localObject).success(new HashMap());
            t = null;
          }
        }
      }
      else
      {
        if (I.k()) {
          K0();
        }
        d = 4;
        E();
        if (s != null)
        {
          HashMap localHashMap = new HashMap();
          if (s0() == -9223372036854775807L) {
            localObject = null;
          } else {
            localObject = Long.valueOf(s0() * 1000L);
          }
          localHashMap.put("duration", localObject);
          s.success(localHashMap);
          s = null;
          localObject = z;
          if (localObject != null)
          {
            I.k0((x3.d)localObject, false);
            z = null;
          }
        }
        localObject = u;
        if (localObject != null)
        {
          p = null;
          ((MethodChannel.Result)localObject).success(new HashMap());
          u = null;
        }
      }
    }
    else
    {
      if (r0() != e)
      {
        e = r0();
        f = System.currentTimeMillis();
      }
      paramInt = d;
      if ((paramInt != 3) && (paramInt != 2))
      {
        d = 3;
        E();
      }
      M.removeCallbacks(N);
      M.post(N);
    }
  }
  
  public final void O()
  {
    Iterator localIterator = E.iterator();
    while (localIterator.hasNext())
    {
      ((AudioEffect)localIterator.next()).release();
      localIterator.remove();
    }
    F.clear();
  }
  
  public final z4.h P(Object paramObject)
  {
    return (z4.h)v.get((String)paramObject);
  }
  
  public final z4.a Q(Object paramObject)
  {
    paramObject = (Map)paramObject;
    Object localObject1 = (String)((Map)paramObject).get("id");
    Object localObject2 = (String)((Map)paramObject).get("type");
    localObject2.getClass();
    int i = ((String)localObject2).hashCode();
    boolean bool1 = true;
    boolean bool2 = true;
    boolean bool3 = false;
    switch (i)
    {
    default: 
      break;
    case 2092627105: 
      if (((String)localObject2).equals("silence")) {
        i = 6;
      }
      break;
    case 1131547531: 
      if (((String)localObject2).equals("progressive")) {
        i = 5;
      }
      break;
    case 918617282: 
      if (((String)localObject2).equals("clipping")) {
        i = 4;
      }
      break;
    case 349937342: 
      if (((String)localObject2).equals("looping")) {
        i = 3;
      }
      break;
    case 3075986: 
      if (((String)localObject2).equals("dash")) {
        i = 2;
      }
      break;
    case 103407: 
      if (((String)localObject2).equals("hls")) {
        i = 1;
      }
      break;
    case -445916622: 
      if (((String)localObject2).equals("concatenating")) {
        i = 0;
      }
      break;
    }
    i = -1;
    long l1 = 0L;
    Object localObject3;
    switch (i)
    {
    default: 
      localObject1 = f.l("Unknown AudioSource type: ");
      ((StringBuilder)localObject1).append(((Map)paramObject).get("type"));
      throw new IllegalArgumentException(((StringBuilder)localObject1).toString());
    case 6: 
      l1 = t0(((Map)paramObject).get("duration")).longValue();
      if (l1 > 0L) {
        bool3 = bool2;
      } else {
        bool3 = false;
      }
      x6.b.H(bool3);
      paramObject = f0.s;
      paramObject.getClass();
      localObject2 = new o0.a();
      localObject3 = e;
      localObject3.getClass();
      d = new o0.b.a((o0.c)localObject3);
      a = a;
      j = d;
      localObject3 = c;
      localObject3.getClass();
      k = new o0.e.a((o0.e)localObject3);
      l = f;
      paramObject = b;
      if (paramObject != null)
      {
        g = e;
        c = b;
        b = a;
        f = d;
        h = f;
        i = g;
        paramObject = c;
        if (paramObject != null) {
          paramObject = new o0.d.a((o0.d)paramObject);
        } else {
          paramObject = new o0.d.a();
        }
        e = ((o0.d.a)paramObject);
      }
      i = localObject1;
      return new f0(l1, ((o0.a)localObject2).a());
    case 5: 
      localObject2 = M((Map)w0(paramObject, "headers"));
      Object localObject4 = (Map)w0(paramObject, "options");
      localObject3 = new c4.f();
      if (localObject4 != null)
      {
        localObject4 = (Map)((Map)localObject4).get("androidExtractorOptions");
        if (localObject4 != null)
        {
          bool1 = ((Boolean)((Map)localObject4).get("constantBitrateSeekingEnabled")).booleanValue();
          bool3 = ((Boolean)((Map)localObject4).get("constantBitrateSeekingAlwaysEnabled")).booleanValue();
          i = ((Integer)((Map)localObject4).get("mp3Flags")).intValue();
          break label702;
        }
      }
      i = 0;
      try
      {
        a = bool1;
        try
        {
          b = bool3;
          try
          {
            c = i;
            localObject3 = new d(localObject3, 7);
            Object localObject5 = new Object();
            localObject4 = new t5.u();
            Object localObject6 = new o0.a();
            b = Uri.parse((String)((Map)paramObject).get("uri"));
            i = localObject1;
            localObject1 = ((o0.a)localObject6).a();
            b.getClass();
            paramObject = b.g;
            b.getClass();
            localObject6 = b.c;
            if ((localObject6 != null) && (e0.a >= 18))
            {
              paramObject = null;
              try
              {
                if (!e0.a(localObject6, null)) {
                  paramObject = a4.c.b((o0.d)localObject6);
                }
                paramObject.getClass();
              }
              finally {}
            }
            else
            {
              paramObject = a4.h.a;
            }
            return new z((o0)localObject1, (k.a)localObject2, (x.a)localObject3, (a4.h)paramObject, (c0)localObject4, 1048576);
          }
          finally {}
          paramObject = finally;
        }
        finally {}
        localObject1 = t0(((Map)paramObject).get("start"));
      }
      finally {}
    case 4: 
      localObject2 = t0(((Map)paramObject).get("end"));
      paramObject = o0(((Map)paramObject).get("child"));
      if (localObject1 != null) {
        l1 = ((Long)localObject1).longValue();
      }
      long l2;
      if (localObject2 != null) {
        l2 = ((Long)localObject2).longValue();
      } else {
        l2 = Long.MIN_VALUE;
      }
      return new z4.d((t)paramObject, l1, l2);
    case 3: 
      localObject1 = (Integer)((Map)paramObject).get("count");
      paramObject = o0(((Map)paramObject).get("child"));
      int j = ((Integer)localObject1).intValue();
      localObject1 = new t[j];
      for (i = 0; i < j; i++) {
        localObject1[i] = paramObject;
      }
      return new z4.h(false, new e0.a(), (t[])localObject1);
    case 2: 
      localObject3 = new DashMediaSource.Factory(M((Map)w0(paramObject, "headers")));
      localObject2 = new o0.a();
      b = Uri.parse((String)((Map)paramObject).get("uri"));
      c = "application/dash+xml";
      i = localObject1;
      return ((DashMediaSource.Factory)localObject3).a(((o0.a)localObject2).a());
    case 1: 
      label702:
      localObject2 = new HlsMediaSource.Factory(M((Map)w0(paramObject, "headers")));
      localObject1 = new o0.a();
      b = Uri.parse((String)((Map)paramObject).get("uri"));
      c = "application/x-mpegURL";
      return ((HlsMediaSource.Factory)localObject2).a(((o0.a)localObject1).a());
    }
    localObject1 = q0(((Map)paramObject).get("children"));
    localObject2 = new t[((ArrayList)localObject1).size()];
    ((ArrayList)localObject1).toArray((Object[])localObject2);
    return new z4.h(((Boolean)((Map)paramObject).get("useLazyPreparation")).booleanValue(), U((List)w0(paramObject, "shuffleOrder")), (t[])localObject2);
  }
  
  public final void V()
  {
    if (d == 2) {
      B0("abort", "Connection aborted", null);
    }
    Object localObject = t;
    if (localObject != null)
    {
      ((MethodChannel.Result)localObject).success(new HashMap());
      t = null;
    }
    v.clear();
    K = null;
    O();
    localObject = I;
    if (localObject != null)
    {
      ((d0)localObject).h0();
      I = null;
      d = 1;
      E();
    }
    b.endOfStream();
    c.endOfStream();
  }
  
  public final void Y(r1 paramr1, int paramInt)
  {
    if ((q != -9223372036854775807L) || (r != null))
    {
      paramr1 = r;
      if (paramr1 != null) {
        paramInt = paramr1.intValue();
      } else {
        paramInt = 0;
      }
      I.S(paramInt, q, false);
      r = null;
      q = -9223372036854775807L;
    }
    paramr1 = Integer.valueOf(I.F());
    if (!paramr1.equals(L))
    {
      L = paramr1;
      paramInt = 1;
    }
    else
    {
      paramInt = 0;
    }
    if (paramInt != 0) {
      E();
    }
    if (I.d() == 4) {
      try
      {
        if (I.k())
        {
          if (G == 0)
          {
            paramr1 = I;
            paramr1.getClass();
            if (paramr1.J().o() > 0)
            {
              paramr1 = I;
              paramInt = 0;
              break label262;
            }
          }
          if (!I.C()) {
            break label277;
          }
          paramr1 = I;
          paramInt = paramr1.e();
          if (paramInt == -1) {
            break label277;
          }
          if (paramInt == paramr1.F())
          {
            paramr1.S(paramr1.F(), -9223372036854775807L, true);
            break label277;
          }
          paramr1.U(paramInt, 8);
          break label277;
        }
        else
        {
          paramInt = I.F();
          paramr1 = I;
          paramr1.getClass();
          if (paramInt >= paramr1.J().o()) {
            break label277;
          }
          paramr1 = I;
          paramInt = paramr1.F();
        }
        label262:
        paramr1.S(paramInt, 0L, false);
      }
      catch (Exception paramr1)
      {
        paramr1.printStackTrace();
      }
    }
    label277:
    paramr1 = I;
    paramr1.getClass();
    G = paramr1.J().o();
  }
  
  public final void Z(s1 params1)
  {
    for (int i = 0; i < a.size(); i++)
    {
      z4.i0 locali0 = a.get(i)).b;
      for (int j = 0; j < a; j++)
      {
        p4.a locala = d[j].r;
        if (locala != null) {
          for (int k = 0;; k++)
          {
            Object localObject = a;
            if (k >= localObject.length) {
              break;
            }
            localObject = localObject[k];
            if ((localObject instanceof t4.b))
            {
              x = ((t4.b)localObject);
              E();
            }
          }
        }
      }
    }
  }
  
  public final void a0(n paramn)
  {
    int i;
    Object localObject1;
    Object localObject2;
    Object localObject3;
    if ((paramn instanceof n))
    {
      i = c;
      boolean bool;
      if (i != 0)
      {
        if (i != 1)
        {
          if (i != 2)
          {
            localObject1 = new StringBuilder();
            localObject2 = "default ExoPlaybackException: ";
          }
          else
          {
            localObject1 = new StringBuilder();
            localObject2 = "TYPE_UNEXPECTED: ";
          }
          ((StringBuilder)localObject1).append((String)localObject2);
          localObject2 = paramn.b();
        }
        else
        {
          localObject1 = f.l("TYPE_RENDERER: ");
          if (c == 1) {
            bool = true;
          } else {
            bool = false;
          }
          x6.b.H(bool);
          localObject2 = paramn.getCause();
          localObject2.getClass();
          localObject2 = (Exception)localObject2;
        }
      }
      else
      {
        localObject1 = f.l("TYPE_SOURCE: ");
        if (c == 0) {
          bool = true;
        } else {
          bool = false;
        }
        x6.b.H(bool);
        localObject2 = paramn.getCause();
        localObject2.getClass();
        localObject2 = (IOException)localObject2;
      }
      ((StringBuilder)localObject1).append(((Throwable)localObject2).getMessage());
      Log.e("AudioPlayer", ((StringBuilder)localObject1).toString());
      localObject2 = String.valueOf(c);
      localObject1 = paramn.getMessage();
      localObject3 = x0(new Object[] { "index", L });
      paramn = (n)localObject2;
      localObject2 = localObject3;
    }
    else
    {
      localObject1 = f.l("default PlaybackException: ");
      ((StringBuilder)localObject1).append(paramn.getMessage());
      Log.e("AudioPlayer", ((StringBuilder)localObject1).toString());
      localObject3 = String.valueOf(a);
      localObject1 = paramn.getMessage();
      localObject2 = x0(new Object[] { "index", L });
      paramn = (n)localObject3;
    }
    B0(paramn, (String)localObject1, (HashMap)localObject2);
    y += 1;
    if (I.C())
    {
      paramn = L;
      if ((paramn != null) && (y <= 5))
      {
        i = paramn.intValue() + 1;
        if (i < I.J().o())
        {
          I.l0(K);
          I.a();
          I.S(i, 0L, false);
        }
      }
    }
  }
  
  public final void f0()
  {
    new HashMap();
    HashMap localHashMap1 = new HashMap();
    Long localLong;
    if (s0() == -9223372036854775807L) {
      localLong = null;
    } else {
      localLong = Long.valueOf(s0() * 1000L);
    }
    Object localObject = I;
    long l;
    if (localObject != null) {
      l = ((d0)localObject).z();
    } else {
      l = 0L;
    }
    o = l;
    localHashMap1.put("processingState", Integer.valueOf(q0.g.c(d)));
    localHashMap1.put("updatePosition", Long.valueOf(e * 1000L));
    localHashMap1.put("updateTime", Long.valueOf(f));
    localHashMap1.put("bufferedPosition", Long.valueOf(Math.max(e, o) * 1000L));
    localObject = new HashMap();
    HashMap localHashMap2;
    if (w != null)
    {
      localHashMap2 = new HashMap();
      localHashMap2.put("title", w.b);
      localHashMap2.put("url", w.c);
      ((HashMap)localObject).put("info", localHashMap2);
    }
    if (x != null)
    {
      localHashMap2 = new HashMap();
      localHashMap2.put("bitrate", Integer.valueOf(x.a));
      localHashMap2.put("genre", x.b);
      localHashMap2.put("name", x.c);
      localHashMap2.put("metadataInterval", Integer.valueOf(x.f));
      localHashMap2.put("url", x.d);
      localHashMap2.put("isPublic", Boolean.valueOf(x.e));
      ((HashMap)localObject).put("headers", localHashMap2);
    }
    localHashMap1.put("icyMetadata", localObject);
    localHashMap1.put("duration", localLong);
    localHashMap1.put("currentIndex", L);
    localHashMap1.put("androidAudioSessionId", J);
    H = localHashMap1;
  }
  
  public final void h0()
  {
    if (I == null)
    {
      Object localObject1 = new r(a);
      Object localObject2 = A;
      if (localObject2 != null)
      {
        x6.b.H(t ^ true);
        f = new aa.m0(localObject2, 0);
      }
      localObject2 = C;
      if (localObject2 != null)
      {
        x6.b.H(t ^ true);
        p = ((v3.m0)localObject2);
      }
      if (B)
      {
        localObject2 = new v3.l(a);
        c = true;
        x6.b.H(t ^ true);
        c = new e(localObject2, 2);
      }
      x6.b.H(t ^ true);
      t = true;
      localObject1 = new d0((r)localObject1);
      I = ((d0)localObject1);
      int i = B;
      ((d0)localObject1).u0();
      k.p.b(24, i, 0).a();
      localObject1 = m.iterator();
      while (((Iterator)localObject1).hasNext()) {
        ((v3.o)((Iterator)localObject1).next()).d();
      }
      localObject1 = I;
      ((d0)localObject1).u0();
      int j = V;
      if (j == 0) {
        localObject1 = null;
      } else {
        localObject1 = Integer.valueOf(j);
      }
      J = ((Integer)localObject1);
      O();
      if (J != null)
      {
        Iterator localIterator = D.iterator();
        while (localIterator.hasNext())
        {
          localObject2 = (Map)localIterator.next();
          int k = J.intValue();
          localObject1 = (String)((Map)localObject2).get("type");
          localObject1.getClass();
          if (!((String)localObject1).equals("AndroidEqualizer"))
          {
            if (((String)localObject1).equals("AndroidLoudnessEnhancer"))
            {
              j = (int)Math.round(((Double)((Map)localObject2).get("targetGain")).doubleValue() * 1000.0D);
              localObject1 = new LoudnessEnhancer(k);
              ((LoudnessEnhancer)localObject1).setTargetGain(j);
            }
            else
            {
              localObject1 = f.l("Unknown AudioEffect type: ");
              ((StringBuilder)localObject1).append(((Map)localObject2).get("type"));
              throw new IllegalArgumentException(((StringBuilder)localObject1).toString());
            }
          }
          else {
            localObject1 = new Equalizer(0, k);
          }
          if (((Boolean)((Map)localObject2).get("enabled")).booleanValue()) {
            ((AudioEffect)localObject1).setEnabled(true);
          }
          E.add(localObject1);
          F.put((String)((Map)localObject2).get("type"), localObject1);
        }
      }
      f0();
      I.l.a(this);
    }
  }
  
  public final HashMap j0()
  {
    Equalizer localEqualizer = (Equalizer)F.get("AndroidEqualizer");
    ArrayList localArrayList = new ArrayList();
    short s1 = 0;
    for (short s2 = s1; s2 < localEqualizer.getNumberOfBands(); s2 = s1)
    {
      localArrayList.add(x0(new Object[] { "index", Short.valueOf(s2), "lowerFrequency", Double.valueOf(localEqualizer.getBandFreqRange(s2)[0] / 1000.0D), "upperFrequency", Double.valueOf(localEqualizer.getBandFreqRange(s2)[1] / 1000.0D), "centerFrequency", Double.valueOf(localEqualizer.getCenterFreq(s2) / 1000.0D), "gain", Double.valueOf(localEqualizer.getBandLevel(s2) / 1000.0D) }));
      s1 = (short)(s2 + 1);
    }
    return x0(new Object[] { "parameters", x0(new Object[] { "minDecibels", Double.valueOf(localEqualizer.getBandLevelRange()[0] / 1000.0D), "maxDecibels", Double.valueOf(localEqualizer.getBandLevelRange()[1] / 1000.0D), "bands", localArrayList }) });
  }
  
  public final void n0(int paramInt, double paramDouble)
  {
    ((Equalizer)F.get("AndroidEqualizer")).setBandLevel((short)paramInt, (short)(int)Math.round(paramDouble * 1000.0D));
  }
  
  public final t o0(Object paramObject)
  {
    Map localMap = (Map)paramObject;
    String str = (String)localMap.get("id");
    t localt = (t)v.get(str);
    paramObject = localt;
    if (localt == null)
    {
      paramObject = Q(localMap);
      v.put(str, paramObject);
    }
    return (t)paramObject;
  }
  
  /* Error */
  public final void onMethodCall(io.flutter.plugin.common.MethodCall paramMethodCall, MethodChannel.Result paramResult)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 1208	ua/a:h0	()V
    //   4: aload_1
    //   5: getfield 1213	io/flutter/plugin/common/MethodCall:method	Ljava/lang/String;
    //   8: astore_3
    //   9: iconst_m1
    //   10: istore 4
    //   12: aload_3
    //   13: invokevirtual 627	java/lang/String:hashCode	()I
    //   16: istore 5
    //   18: iconst_1
    //   19: istore 6
    //   21: iload 5
    //   23: lookupswitch	default:+185->208, -2058172951:+539->562, -1987605894:+522->545, -1875704736:+505->528, -1540835818:+488->511, -1484304041:+471->494, -704119678:+454->477, -345307082:+437->460, -104999328:+420->443, -48357143:+403->426, 3327206:+387->410, 3443508:+371->394, 3526264:+354->377, 106440182:+338->361, 670514716:+322->345, 845471111:+305->328, 986980643:+288->311, 1401390078:+272->295, 1404354821:+256->279, 1454606831:+239->262, 1624925565:+222->245, 1631191096:+205->228, 2117606630:+188->211
    //   208: goto +372 -> 580
    //   211: aload_3
    //   212: ldc_w 1215
    //   215: invokevirtual 420	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   218: ifeq +362 -> 580
    //   221: bipush 18
    //   223: istore 4
    //   225: goto +355 -> 580
    //   228: aload_3
    //   229: ldc_w 1217
    //   232: invokevirtual 420	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   235: ifeq +345 -> 580
    //   238: bipush 10
    //   240: istore 4
    //   242: goto +338 -> 580
    //   245: aload_3
    //   246: ldc_w 1219
    //   249: invokevirtual 420	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   252: ifeq +328 -> 580
    //   255: bipush 20
    //   257: istore 4
    //   259: goto +321 -> 580
    //   262: aload_3
    //   263: ldc_w 1221
    //   266: invokevirtual 420	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   269: ifeq +311 -> 580
    //   272: bipush 12
    //   274: istore 4
    //   276: goto +304 -> 580
    //   279: aload_3
    //   280: ldc_w 1223
    //   283: invokevirtual 420	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   286: ifeq +294 -> 580
    //   289: iconst_4
    //   290: istore 4
    //   292: goto +288 -> 580
    //   295: aload_3
    //   296: ldc_w 1225
    //   299: invokevirtual 420	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   302: ifeq +278 -> 580
    //   305: iconst_5
    //   306: istore 4
    //   308: goto +272 -> 580
    //   311: aload_3
    //   312: ldc_w 1227
    //   315: invokevirtual 420	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   318: ifeq +262 -> 580
    //   321: bipush 16
    //   323: istore 4
    //   325: goto +255 -> 580
    //   328: aload_3
    //   329: ldc_w 1229
    //   332: invokevirtual 420	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   335: ifeq +245 -> 580
    //   338: bipush 15
    //   340: istore 4
    //   342: goto +238 -> 580
    //   345: aload_3
    //   346: ldc_w 1231
    //   349: invokevirtual 420	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   352: ifeq +228 -> 580
    //   355: iconst_3
    //   356: istore 4
    //   358: goto +222 -> 580
    //   361: aload_3
    //   362: ldc_w 1233
    //   365: invokevirtual 420	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   368: ifeq +212 -> 580
    //   371: iconst_2
    //   372: istore 4
    //   374: goto +206 -> 580
    //   377: aload_3
    //   378: ldc_w 1235
    //   381: invokevirtual 420	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   384: ifeq +196 -> 580
    //   387: bipush 13
    //   389: istore 4
    //   391: goto +189 -> 580
    //   394: aload_3
    //   395: ldc_w 1237
    //   398: invokevirtual 420	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   401: ifeq +179 -> 580
    //   404: iconst_1
    //   405: istore 4
    //   407: goto +173 -> 580
    //   410: aload_3
    //   411: ldc_w 1239
    //   414: invokevirtual 420	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   417: ifeq +163 -> 580
    //   420: iconst_0
    //   421: istore 4
    //   423: goto +157 -> 580
    //   426: aload_3
    //   427: ldc_w 1241
    //   430: invokevirtual 420	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   433: ifeq +147 -> 580
    //   436: bipush 7
    //   438: istore 4
    //   440: goto +140 -> 580
    //   443: aload_3
    //   444: ldc_w 1243
    //   447: invokevirtual 420	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   450: ifeq +130 -> 580
    //   453: bipush 17
    //   455: istore 4
    //   457: goto +123 -> 580
    //   460: aload_3
    //   461: ldc_w 1245
    //   464: invokevirtual 420	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   467: ifeq +113 -> 580
    //   470: bipush 19
    //   472: istore 4
    //   474: goto +106 -> 580
    //   477: aload_3
    //   478: ldc_w 1247
    //   481: invokevirtual 420	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   484: ifeq +96 -> 580
    //   487: bipush 11
    //   489: istore 4
    //   491: goto +89 -> 580
    //   494: aload_3
    //   495: ldc_w 1249
    //   498: invokevirtual 420	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   501: ifeq +79 -> 580
    //   504: bipush 9
    //   506: istore 4
    //   508: goto +72 -> 580
    //   511: aload_3
    //   512: ldc_w 1251
    //   515: invokevirtual 420	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   518: ifeq +62 -> 580
    //   521: bipush 14
    //   523: istore 4
    //   525: goto +55 -> 580
    //   528: aload_3
    //   529: ldc_w 1253
    //   532: invokevirtual 420	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   535: ifeq +45 -> 580
    //   538: bipush 6
    //   540: istore 4
    //   542: goto +38 -> 580
    //   545: aload_3
    //   546: ldc_w 1255
    //   549: invokevirtual 420	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   552: ifeq +28 -> 580
    //   555: bipush 8
    //   557: istore 4
    //   559: goto +21 -> 580
    //   562: aload_3
    //   563: ldc_w 1257
    //   566: invokevirtual 420	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   569: istore 7
    //   571: iload 7
    //   573: ifeq +7 -> 580
    //   576: bipush 21
    //   578: istore 4
    //   580: ldc2_w 604
    //   583: lstore 8
    //   585: iload 4
    //   587: tableswitch	default:+101->688, 0:+920->1507, 1:+912->1499, 2:+890->1477, 3:+861->1448, 4:+832->1419, 5:+803->1390, 6:+775->1362, 7:+747->1334, 8:+707->1294, 9:+685->1272, 10:+674->1261, 11:+663->1250, 12:+652->1239, 13:+599->1186, 14:+491->1078, 15:+388->975, 16:+279->866, 17:+225->812, 18:+187->774, 19:+159->746, 20:+151->738, 21:+110->697
    //   688: aload_2
    //   689: invokeinterface 1260 1 0
    //   694: goto +959 -> 1653
    //   697: aload_0
    //   698: aload_1
    //   699: ldc_w 1262
    //   702: invokevirtual 1266	io/flutter/plugin/common/MethodCall:argument	(Ljava/lang/String;)Ljava/lang/Object;
    //   705: checkcast 204	java/lang/Integer
    //   708: invokevirtual 208	java/lang/Integer:intValue	()I
    //   711: aload_1
    //   712: ldc_w 1176
    //   715: invokevirtual 1266	io/flutter/plugin/common/MethodCall:argument	(Ljava/lang/String;)Ljava/lang/Object;
    //   718: checkcast 226	java/lang/Double
    //   721: invokevirtual 230	java/lang/Double:doubleValue	()D
    //   724: invokevirtual 1268	ua/a:n0	(ID)V
    //   727: new 79	java/util/HashMap
    //   730: astore_1
    //   731: aload_1
    //   732: invokespecial 80	java/util/HashMap:<init>	()V
    //   735: goto +754 -> 1489
    //   738: aload_0
    //   739: invokevirtual 1270	ua/a:j0	()Ljava/util/HashMap;
    //   742: astore_1
    //   743: goto +746 -> 1489
    //   746: aload_0
    //   747: aload_1
    //   748: ldc_w 1120
    //   751: invokevirtual 1266	io/flutter/plugin/common/MethodCall:argument	(Ljava/lang/String;)Ljava/lang/Object;
    //   754: checkcast 226	java/lang/Double
    //   757: invokevirtual 230	java/lang/Double:doubleValue	()D
    //   760: invokevirtual 1274	ua/a:v0	(D)V
    //   763: new 79	java/util/HashMap
    //   766: dup
    //   767: invokespecial 80	java/util/HashMap:<init>	()V
    //   770: astore_1
    //   771: goto +718 -> 1489
    //   774: aload_0
    //   775: aload_1
    //   776: ldc_w 413
    //   779: invokevirtual 1266	io/flutter/plugin/common/MethodCall:argument	(Ljava/lang/String;)Ljava/lang/Object;
    //   782: checkcast 298	java/lang/String
    //   785: aload_1
    //   786: ldc_w 1141
    //   789: invokevirtual 1266	io/flutter/plugin/common/MethodCall:argument	(Ljava/lang/String;)Ljava/lang/Object;
    //   792: checkcast 115	java/lang/Boolean
    //   795: invokevirtual 119	java/lang/Boolean:booleanValue	()Z
    //   798: invokevirtual 1276	ua/a:B	(Ljava/lang/String;Z)V
    //   801: new 79	java/util/HashMap
    //   804: dup
    //   805: invokespecial 80	java/util/HashMap:<init>	()V
    //   808: astore_1
    //   809: goto +680 -> 1489
    //   812: aload_0
    //   813: aload_1
    //   814: ldc_w 1278
    //   817: invokevirtual 1266	io/flutter/plugin/common/MethodCall:argument	(Ljava/lang/String;)Ljava/lang/Object;
    //   820: checkcast 204	java/lang/Integer
    //   823: invokevirtual 208	java/lang/Integer:intValue	()I
    //   826: aload_1
    //   827: ldc_w 1280
    //   830: invokevirtual 1266	io/flutter/plugin/common/MethodCall:argument	(Ljava/lang/String;)Ljava/lang/Object;
    //   833: checkcast 204	java/lang/Integer
    //   836: invokevirtual 208	java/lang/Integer:intValue	()I
    //   839: aload_1
    //   840: ldc_w 1282
    //   843: invokevirtual 1266	io/flutter/plugin/common/MethodCall:argument	(Ljava/lang/String;)Ljava/lang/Object;
    //   846: checkcast 204	java/lang/Integer
    //   849: invokevirtual 208	java/lang/Integer:intValue	()I
    //   852: invokevirtual 1284	ua/a:C0	(III)V
    //   855: new 79	java/util/HashMap
    //   858: dup
    //   859: invokespecial 80	java/util/HashMap:<init>	()V
    //   862: astore_1
    //   863: goto +626 -> 1489
    //   866: aload_0
    //   867: aload_1
    //   868: ldc_w 407
    //   871: invokevirtual 1266	io/flutter/plugin/common/MethodCall:argument	(Ljava/lang/String;)Ljava/lang/Object;
    //   874: invokevirtual 1286	ua/a:P	(Ljava/lang/Object;)Lz4/h;
    //   877: astore 10
    //   879: aload_1
    //   880: ldc_w 1053
    //   883: invokevirtual 1266	io/flutter/plugin/common/MethodCall:argument	(Ljava/lang/String;)Ljava/lang/Object;
    //   886: checkcast 204	java/lang/Integer
    //   889: invokevirtual 208	java/lang/Integer:intValue	()I
    //   892: istore 5
    //   894: aload_1
    //   895: ldc_w 1288
    //   898: invokevirtual 1266	io/flutter/plugin/common/MethodCall:argument	(Ljava/lang/String;)Ljava/lang/Object;
    //   901: checkcast 204	java/lang/Integer
    //   904: invokevirtual 208	java/lang/Integer:intValue	()I
    //   907: istore 4
    //   909: aload_0
    //   910: getfield 104	ua/a:M	Landroid/os/Handler;
    //   913: astore_3
    //   914: new 1290	ta/d
    //   917: astore 11
    //   919: aload 11
    //   921: iconst_1
    //   922: aload_2
    //   923: invokespecial 1293	ta/d:<init>	(ILio/flutter/plugin/common/MethodChannel$Result;)V
    //   926: aload 10
    //   928: iload 5
    //   930: iload 4
    //   932: aload_3
    //   933: aload 11
    //   935: invokevirtual 1296	z4/h:K	(IILandroid/os/Handler;Lta/d;)V
    //   938: aload_0
    //   939: aload_1
    //   940: ldc_w 407
    //   943: invokevirtual 1266	io/flutter/plugin/common/MethodCall:argument	(Ljava/lang/String;)Ljava/lang/Object;
    //   946: invokevirtual 1286	ua/a:P	(Ljava/lang/Object;)Lz4/h;
    //   949: astore_3
    //   950: aload_1
    //   951: ldc_w 430
    //   954: invokevirtual 1266	io/flutter/plugin/common/MethodCall:argument	(Ljava/lang/String;)Ljava/lang/Object;
    //   957: checkcast 264	java/util/List
    //   960: astore 11
    //   962: aload_3
    //   963: astore_1
    //   964: aload 11
    //   966: astore_3
    //   967: aload_3
    //   968: invokestatic 432	ua/a:U	(Ljava/util/List;)Lz4/e0$a;
    //   971: astore_3
    //   972: goto +206 -> 1178
    //   975: aload_0
    //   976: aload_1
    //   977: ldc_w 407
    //   980: invokevirtual 1266	io/flutter/plugin/common/MethodCall:argument	(Ljava/lang/String;)Ljava/lang/Object;
    //   983: invokevirtual 1286	ua/a:P	(Ljava/lang/Object;)Lz4/h;
    //   986: astore 11
    //   988: aload_1
    //   989: ldc_w 1298
    //   992: invokevirtual 1266	io/flutter/plugin/common/MethodCall:argument	(Ljava/lang/String;)Ljava/lang/Object;
    //   995: checkcast 204	java/lang/Integer
    //   998: invokevirtual 208	java/lang/Integer:intValue	()I
    //   1001: istore 5
    //   1003: aload_1
    //   1004: ldc_w 1300
    //   1007: invokevirtual 1266	io/flutter/plugin/common/MethodCall:argument	(Ljava/lang/String;)Ljava/lang/Object;
    //   1010: checkcast 204	java/lang/Integer
    //   1013: invokevirtual 208	java/lang/Integer:intValue	()I
    //   1016: istore 4
    //   1018: aload_0
    //   1019: getfield 104	ua/a:M	Landroid/os/Handler;
    //   1022: astore_3
    //   1023: new 1302	u/a
    //   1026: astore 10
    //   1028: aload 10
    //   1030: aload_2
    //   1031: bipush 16
    //   1033: invokespecial 1303	u/a:<init>	(Ljava/lang/Object;I)V
    //   1036: aload 11
    //   1038: iload 5
    //   1040: iload 4
    //   1042: aload_3
    //   1043: aload 10
    //   1045: invokevirtual 1306	z4/h:M	(IILandroid/os/Handler;Lu/a;)V
    //   1048: aload_0
    //   1049: aload_1
    //   1050: ldc_w 407
    //   1053: invokevirtual 1266	io/flutter/plugin/common/MethodCall:argument	(Ljava/lang/String;)Ljava/lang/Object;
    //   1056: invokevirtual 1286	ua/a:P	(Ljava/lang/Object;)Lz4/h;
    //   1059: astore 11
    //   1061: aload_1
    //   1062: ldc_w 430
    //   1065: invokevirtual 1266	io/flutter/plugin/common/MethodCall:argument	(Ljava/lang/String;)Ljava/lang/Object;
    //   1068: checkcast 264	java/util/List
    //   1071: astore_3
    //   1072: aload 11
    //   1074: astore_1
    //   1075: goto -108 -> 967
    //   1078: aload_0
    //   1079: aload_1
    //   1080: ldc_w 407
    //   1083: invokevirtual 1266	io/flutter/plugin/common/MethodCall:argument	(Ljava/lang/String;)Ljava/lang/Object;
    //   1086: invokevirtual 1286	ua/a:P	(Ljava/lang/Object;)Lz4/h;
    //   1089: astore_3
    //   1090: aload_1
    //   1091: ldc_w 974
    //   1094: invokevirtual 1266	io/flutter/plugin/common/MethodCall:argument	(Ljava/lang/String;)Ljava/lang/Object;
    //   1097: checkcast 204	java/lang/Integer
    //   1100: invokevirtual 208	java/lang/Integer:intValue	()I
    //   1103: istore 4
    //   1105: aload_0
    //   1106: aload_1
    //   1107: ldc_w 438
    //   1110: invokevirtual 1266	io/flutter/plugin/common/MethodCall:argument	(Ljava/lang/String;)Ljava/lang/Object;
    //   1113: invokevirtual 847	ua/a:q0	(Ljava/lang/Object;)Ljava/util/ArrayList;
    //   1116: astore 11
    //   1118: aload_0
    //   1119: getfield 104	ua/a:M	Landroid/os/Handler;
    //   1122: astore 10
    //   1124: new 1308	ta/c
    //   1127: astore 12
    //   1129: aload 12
    //   1131: iconst_1
    //   1132: aload_2
    //   1133: invokespecial 1309	ta/c:<init>	(ILio/flutter/plugin/common/MethodChannel$Result;)V
    //   1136: aload_3
    //   1137: iload 4
    //   1139: aload 11
    //   1141: aload 10
    //   1143: aload 12
    //   1145: invokevirtual 1312	z4/h:C	(ILjava/util/ArrayList;Landroid/os/Handler;Lta/c;)V
    //   1148: aload_0
    //   1149: aload_1
    //   1150: ldc_w 407
    //   1153: invokevirtual 1266	io/flutter/plugin/common/MethodCall:argument	(Ljava/lang/String;)Ljava/lang/Object;
    //   1156: invokevirtual 1286	ua/a:P	(Ljava/lang/Object;)Lz4/h;
    //   1159: astore 11
    //   1161: aload_1
    //   1162: ldc_w 430
    //   1165: invokevirtual 1266	io/flutter/plugin/common/MethodCall:argument	(Ljava/lang/String;)Ljava/lang/Object;
    //   1168: checkcast 264	java/util/List
    //   1171: astore_3
    //   1172: aload 11
    //   1174: astore_1
    //   1175: goto -208 -> 967
    //   1178: aload_1
    //   1179: aload_3
    //   1180: invokevirtual 436	z4/h:P	(Lz4/e0$a;)V
    //   1183: goto +470 -> 1653
    //   1186: aload_1
    //   1187: ldc_w 1314
    //   1190: invokevirtual 1266	io/flutter/plugin/common/MethodCall:argument	(Ljava/lang/String;)Ljava/lang/Object;
    //   1193: invokestatic 164	ua/a:t0	(Ljava/lang/Object;)Ljava/lang/Long;
    //   1196: astore_3
    //   1197: aload_1
    //   1198: ldc_w 974
    //   1201: invokevirtual 1266	io/flutter/plugin/common/MethodCall:argument	(Ljava/lang/String;)Ljava/lang/Object;
    //   1204: checkcast 204	java/lang/Integer
    //   1207: astore_1
    //   1208: aload_3
    //   1209: ifnonnull +6 -> 1215
    //   1212: goto +16 -> 1228
    //   1215: aload_3
    //   1216: invokevirtual 170	java/lang/Long:longValue	()J
    //   1219: ldc2_w 171
    //   1222: ldiv
    //   1223: lstore 8
    //   1225: goto -13 -> 1212
    //   1228: aload_0
    //   1229: lload 8
    //   1231: aload_1
    //   1232: aload_2
    //   1233: invokevirtual 1316	ua/a:A0	(JLjava/lang/Integer;Lio/flutter/plugin/common/MethodChannel$Result;)V
    //   1236: goto +417 -> 1653
    //   1239: new 79	java/util/HashMap
    //   1242: dup
    //   1243: invokespecial 80	java/util/HashMap:<init>	()V
    //   1246: astore_1
    //   1247: goto +242 -> 1489
    //   1250: new 79	java/util/HashMap
    //   1253: dup
    //   1254: invokespecial 80	java/util/HashMap:<init>	()V
    //   1257: astore_1
    //   1258: goto +231 -> 1489
    //   1261: new 79	java/util/HashMap
    //   1264: dup
    //   1265: invokespecial 80	java/util/HashMap:<init>	()V
    //   1268: astore_1
    //   1269: goto +220 -> 1489
    //   1272: aload_0
    //   1273: aload_1
    //   1274: ldc_w 1318
    //   1277: invokevirtual 1266	io/flutter/plugin/common/MethodCall:argument	(Ljava/lang/String;)Ljava/lang/Object;
    //   1280: invokevirtual 426	ua/a:G0	(Ljava/lang/Object;)V
    //   1283: new 79	java/util/HashMap
    //   1286: dup
    //   1287: invokespecial 80	java/util/HashMap:<init>	()V
    //   1290: astore_1
    //   1291: goto +198 -> 1489
    //   1294: aload_1
    //   1295: ldc_w 1320
    //   1298: invokevirtual 1266	io/flutter/plugin/common/MethodCall:argument	(Ljava/lang/String;)Ljava/lang/Object;
    //   1301: checkcast 204	java/lang/Integer
    //   1304: invokevirtual 208	java/lang/Integer:intValue	()I
    //   1307: iconst_1
    //   1308: if_icmpne +6 -> 1314
    //   1311: goto +6 -> 1317
    //   1314: iconst_0
    //   1315: istore 6
    //   1317: aload_0
    //   1318: iload 6
    //   1320: invokevirtual 1322	ua/a:F0	(Z)V
    //   1323: new 79	java/util/HashMap
    //   1326: dup
    //   1327: invokespecial 80	java/util/HashMap:<init>	()V
    //   1330: astore_1
    //   1331: goto +158 -> 1489
    //   1334: aload_0
    //   1335: aload_1
    //   1336: ldc_w 1324
    //   1339: invokevirtual 1266	io/flutter/plugin/common/MethodCall:argument	(Ljava/lang/String;)Ljava/lang/Object;
    //   1342: checkcast 204	java/lang/Integer
    //   1345: invokevirtual 208	java/lang/Integer:intValue	()I
    //   1348: invokevirtual 1326	ua/a:D0	(I)V
    //   1351: new 79	java/util/HashMap
    //   1354: dup
    //   1355: invokespecial 80	java/util/HashMap:<init>	()V
    //   1358: astore_1
    //   1359: goto +130 -> 1489
    //   1362: aload_0
    //   1363: aload_1
    //   1364: ldc_w 1141
    //   1367: invokevirtual 1266	io/flutter/plugin/common/MethodCall:argument	(Ljava/lang/String;)Ljava/lang/Object;
    //   1370: checkcast 115	java/lang/Boolean
    //   1373: invokevirtual 119	java/lang/Boolean:booleanValue	()Z
    //   1376: invokevirtual 1328	ua/a:H0	(Z)V
    //   1379: new 79	java/util/HashMap
    //   1382: dup
    //   1383: invokespecial 80	java/util/HashMap:<init>	()V
    //   1386: astore_1
    //   1387: goto +102 -> 1489
    //   1390: aload_0
    //   1391: aload_1
    //   1392: ldc_w 1330
    //   1395: invokevirtual 1266	io/flutter/plugin/common/MethodCall:argument	(Ljava/lang/String;)Ljava/lang/Object;
    //   1398: checkcast 226	java/lang/Double
    //   1401: invokevirtual 230	java/lang/Double:doubleValue	()D
    //   1404: d2f
    //   1405: invokevirtual 1332	ua/a:E0	(F)V
    //   1408: new 79	java/util/HashMap
    //   1411: dup
    //   1412: invokespecial 80	java/util/HashMap:<init>	()V
    //   1415: astore_1
    //   1416: goto +73 -> 1489
    //   1419: aload_0
    //   1420: aload_1
    //   1421: ldc_w 1334
    //   1424: invokevirtual 1266	io/flutter/plugin/common/MethodCall:argument	(Ljava/lang/String;)Ljava/lang/Object;
    //   1427: checkcast 226	java/lang/Double
    //   1430: invokevirtual 230	java/lang/Double:doubleValue	()D
    //   1433: d2f
    //   1434: invokevirtual 1336	ua/a:I0	(F)V
    //   1437: new 79	java/util/HashMap
    //   1440: dup
    //   1441: invokespecial 80	java/util/HashMap:<init>	()V
    //   1444: astore_1
    //   1445: goto +44 -> 1489
    //   1448: aload_0
    //   1449: aload_1
    //   1450: ldc_w 1338
    //   1453: invokevirtual 1266	io/flutter/plugin/common/MethodCall:argument	(Ljava/lang/String;)Ljava/lang/Object;
    //   1456: checkcast 226	java/lang/Double
    //   1459: invokevirtual 230	java/lang/Double:doubleValue	()D
    //   1462: d2f
    //   1463: invokevirtual 1340	ua/a:J0	(F)V
    //   1466: new 79	java/util/HashMap
    //   1469: dup
    //   1470: invokespecial 80	java/util/HashMap:<init>	()V
    //   1473: astore_1
    //   1474: goto +15 -> 1489
    //   1477: aload_0
    //   1478: invokevirtual 1343	ua/a:y0	()V
    //   1481: new 79	java/util/HashMap
    //   1484: dup
    //   1485: invokespecial 80	java/util/HashMap:<init>	()V
    //   1488: astore_1
    //   1489: aload_2
    //   1490: aload_1
    //   1491: invokeinterface 314 2 0
    //   1496: goto +157 -> 1653
    //   1499: aload_0
    //   1500: aload_2
    //   1501: invokevirtual 1347	ua/a:z0	(Lio/flutter/plugin/common/MethodChannel$Result;)V
    //   1504: goto +149 -> 1653
    //   1507: aload_1
    //   1508: ldc_w 1349
    //   1511: invokevirtual 1266	io/flutter/plugin/common/MethodCall:argument	(Ljava/lang/String;)Ljava/lang/Object;
    //   1514: invokestatic 164	ua/a:t0	(Ljava/lang/Object;)Ljava/lang/Long;
    //   1517: astore_3
    //   1518: aload_1
    //   1519: ldc_w 1351
    //   1522: invokevirtual 1266	io/flutter/plugin/common/MethodCall:argument	(Ljava/lang/String;)Ljava/lang/Object;
    //   1525: checkcast 204	java/lang/Integer
    //   1528: astore 11
    //   1530: aload_0
    //   1531: aload_1
    //   1532: ldc_w 1318
    //   1535: invokevirtual 1266	io/flutter/plugin/common/MethodCall:argument	(Ljava/lang/String;)Ljava/lang/Object;
    //   1538: invokevirtual 812	ua/a:o0	(Ljava/lang/Object;)Lz4/t;
    //   1541: astore_1
    //   1542: aload_3
    //   1543: ifnonnull +6 -> 1549
    //   1546: goto +13 -> 1559
    //   1549: aload_3
    //   1550: invokevirtual 170	java/lang/Long:longValue	()J
    //   1553: ldc2_w 171
    //   1556: ldiv
    //   1557: lstore 8
    //   1559: aload_0
    //   1560: aload_1
    //   1561: lload 8
    //   1563: aload 11
    //   1565: aload_2
    //   1566: invokevirtual 1354	ua/a:u0	(Lz4/t;JLjava/lang/Integer;Lio/flutter/plugin/common/MethodChannel$Result;)V
    //   1569: goto +84 -> 1653
    //   1572: astore_1
    //   1573: goto +85 -> 1658
    //   1576: astore_3
    //   1577: aload_3
    //   1578: invokevirtual 905	java/lang/Throwable:printStackTrace	()V
    //   1581: new 545	java/lang/StringBuilder
    //   1584: astore_1
    //   1585: aload_1
    //   1586: invokespecial 546	java/lang/StringBuilder:<init>	()V
    //   1589: aload_1
    //   1590: ldc_w 1356
    //   1593: invokevirtual 552	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1596: pop
    //   1597: aload_1
    //   1598: aload_3
    //   1599: invokevirtual 645	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   1602: pop
    //   1603: aload_1
    //   1604: invokevirtual 568	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1607: astore_1
    //   1608: goto +36 -> 1644
    //   1611: astore_3
    //   1612: aload_3
    //   1613: invokevirtual 905	java/lang/Throwable:printStackTrace	()V
    //   1616: new 545	java/lang/StringBuilder
    //   1619: astore_1
    //   1620: aload_1
    //   1621: invokespecial 546	java/lang/StringBuilder:<init>	()V
    //   1624: aload_1
    //   1625: ldc_w 1358
    //   1628: invokevirtual 552	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1631: pop
    //   1632: aload_1
    //   1633: aload_3
    //   1634: invokevirtual 962	java/lang/Throwable:getMessage	()Ljava/lang/String;
    //   1637: invokevirtual 552	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1640: pop
    //   1641: goto -38 -> 1603
    //   1644: aload_2
    //   1645: aload_1
    //   1646: aconst_null
    //   1647: aconst_null
    //   1648: invokeinterface 344 4 0
    //   1653: aload_0
    //   1654: invokevirtual 367	ua/a:H	()V
    //   1657: return
    //   1658: aload_0
    //   1659: invokevirtual 367	ua/a:H	()V
    //   1662: aload_1
    //   1663: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1664	0	this	a
    //   0	1664	1	paramMethodCall	io.flutter.plugin.common.MethodCall
    //   0	1664	2	paramResult	MethodChannel.Result
    //   8	1542	3	localObject1	Object
    //   1576	23	3	localException	Exception
    //   1611	23	3	localIllegalStateException	IllegalStateException
    //   10	1128	4	i	int
    //   16	1023	5	j	int
    //   19	1300	6	bool1	boolean
    //   569	3	7	bool2	boolean
    //   583	979	8	l	long
    //   877	265	10	localObject2	Object
    //   917	647	11	localObject3	Object
    //   1127	17	12	localc	ta.c
    // Exception table:
    //   from	to	target	type
    //   4	9	1572	finally
    //   12	18	1572	finally
    //   211	221	1572	finally
    //   228	238	1572	finally
    //   245	255	1572	finally
    //   262	272	1572	finally
    //   279	289	1572	finally
    //   295	305	1572	finally
    //   311	321	1572	finally
    //   328	338	1572	finally
    //   345	355	1572	finally
    //   361	371	1572	finally
    //   377	387	1572	finally
    //   394	404	1572	finally
    //   410	420	1572	finally
    //   426	436	1572	finally
    //   443	453	1572	finally
    //   460	470	1572	finally
    //   477	487	1572	finally
    //   494	504	1572	finally
    //   511	521	1572	finally
    //   528	538	1572	finally
    //   545	555	1572	finally
    //   562	571	1572	finally
    //   688	694	1572	finally
    //   697	735	1572	finally
    //   738	743	1572	finally
    //   746	771	1572	finally
    //   774	809	1572	finally
    //   812	863	1572	finally
    //   866	962	1572	finally
    //   967	972	1572	finally
    //   975	1072	1572	finally
    //   1078	1172	1572	finally
    //   1178	1183	1572	finally
    //   1186	1208	1572	finally
    //   1215	1225	1572	finally
    //   1228	1236	1572	finally
    //   1239	1247	1572	finally
    //   1250	1258	1572	finally
    //   1261	1269	1572	finally
    //   1272	1291	1572	finally
    //   1294	1311	1572	finally
    //   1317	1331	1572	finally
    //   1334	1359	1572	finally
    //   1362	1387	1572	finally
    //   1390	1416	1572	finally
    //   1419	1445	1572	finally
    //   1448	1474	1572	finally
    //   1477	1489	1572	finally
    //   1489	1496	1572	finally
    //   1499	1504	1572	finally
    //   1507	1542	1572	finally
    //   1549	1559	1572	finally
    //   1559	1569	1572	finally
    //   1577	1603	1572	finally
    //   1603	1608	1572	finally
    //   1612	1641	1572	finally
    //   1644	1653	1572	finally
    //   4	9	1576	java/lang/Exception
    //   12	18	1576	java/lang/Exception
    //   211	221	1576	java/lang/Exception
    //   228	238	1576	java/lang/Exception
    //   245	255	1576	java/lang/Exception
    //   262	272	1576	java/lang/Exception
    //   279	289	1576	java/lang/Exception
    //   295	305	1576	java/lang/Exception
    //   311	321	1576	java/lang/Exception
    //   328	338	1576	java/lang/Exception
    //   345	355	1576	java/lang/Exception
    //   361	371	1576	java/lang/Exception
    //   377	387	1576	java/lang/Exception
    //   394	404	1576	java/lang/Exception
    //   410	420	1576	java/lang/Exception
    //   426	436	1576	java/lang/Exception
    //   443	453	1576	java/lang/Exception
    //   460	470	1576	java/lang/Exception
    //   477	487	1576	java/lang/Exception
    //   494	504	1576	java/lang/Exception
    //   511	521	1576	java/lang/Exception
    //   528	538	1576	java/lang/Exception
    //   545	555	1576	java/lang/Exception
    //   562	571	1576	java/lang/Exception
    //   688	694	1576	java/lang/Exception
    //   697	735	1576	java/lang/Exception
    //   738	743	1576	java/lang/Exception
    //   746	771	1576	java/lang/Exception
    //   774	809	1576	java/lang/Exception
    //   812	863	1576	java/lang/Exception
    //   866	962	1576	java/lang/Exception
    //   967	972	1576	java/lang/Exception
    //   975	1072	1576	java/lang/Exception
    //   1078	1172	1576	java/lang/Exception
    //   1178	1183	1576	java/lang/Exception
    //   1186	1208	1576	java/lang/Exception
    //   1215	1225	1576	java/lang/Exception
    //   1228	1236	1576	java/lang/Exception
    //   1239	1247	1576	java/lang/Exception
    //   1250	1258	1576	java/lang/Exception
    //   1261	1269	1576	java/lang/Exception
    //   1272	1291	1576	java/lang/Exception
    //   1294	1311	1576	java/lang/Exception
    //   1317	1331	1576	java/lang/Exception
    //   1334	1359	1576	java/lang/Exception
    //   1362	1387	1576	java/lang/Exception
    //   1390	1416	1576	java/lang/Exception
    //   1419	1445	1576	java/lang/Exception
    //   1448	1474	1576	java/lang/Exception
    //   1477	1489	1576	java/lang/Exception
    //   1489	1496	1576	java/lang/Exception
    //   1499	1504	1576	java/lang/Exception
    //   1507	1542	1576	java/lang/Exception
    //   1549	1559	1576	java/lang/Exception
    //   1559	1569	1576	java/lang/Exception
    //   4	9	1611	java/lang/IllegalStateException
    //   12	18	1611	java/lang/IllegalStateException
    //   211	221	1611	java/lang/IllegalStateException
    //   228	238	1611	java/lang/IllegalStateException
    //   245	255	1611	java/lang/IllegalStateException
    //   262	272	1611	java/lang/IllegalStateException
    //   279	289	1611	java/lang/IllegalStateException
    //   295	305	1611	java/lang/IllegalStateException
    //   311	321	1611	java/lang/IllegalStateException
    //   328	338	1611	java/lang/IllegalStateException
    //   345	355	1611	java/lang/IllegalStateException
    //   361	371	1611	java/lang/IllegalStateException
    //   377	387	1611	java/lang/IllegalStateException
    //   394	404	1611	java/lang/IllegalStateException
    //   410	420	1611	java/lang/IllegalStateException
    //   426	436	1611	java/lang/IllegalStateException
    //   443	453	1611	java/lang/IllegalStateException
    //   460	470	1611	java/lang/IllegalStateException
    //   477	487	1611	java/lang/IllegalStateException
    //   494	504	1611	java/lang/IllegalStateException
    //   511	521	1611	java/lang/IllegalStateException
    //   528	538	1611	java/lang/IllegalStateException
    //   545	555	1611	java/lang/IllegalStateException
    //   562	571	1611	java/lang/IllegalStateException
    //   688	694	1611	java/lang/IllegalStateException
    //   697	735	1611	java/lang/IllegalStateException
    //   738	743	1611	java/lang/IllegalStateException
    //   746	771	1611	java/lang/IllegalStateException
    //   774	809	1611	java/lang/IllegalStateException
    //   812	863	1611	java/lang/IllegalStateException
    //   866	962	1611	java/lang/IllegalStateException
    //   967	972	1611	java/lang/IllegalStateException
    //   975	1072	1611	java/lang/IllegalStateException
    //   1078	1172	1611	java/lang/IllegalStateException
    //   1178	1183	1611	java/lang/IllegalStateException
    //   1186	1208	1611	java/lang/IllegalStateException
    //   1215	1225	1611	java/lang/IllegalStateException
    //   1228	1236	1611	java/lang/IllegalStateException
    //   1239	1247	1611	java/lang/IllegalStateException
    //   1250	1258	1611	java/lang/IllegalStateException
    //   1261	1269	1611	java/lang/IllegalStateException
    //   1272	1291	1611	java/lang/IllegalStateException
    //   1294	1311	1611	java/lang/IllegalStateException
    //   1317	1331	1611	java/lang/IllegalStateException
    //   1334	1359	1611	java/lang/IllegalStateException
    //   1362	1387	1611	java/lang/IllegalStateException
    //   1390	1416	1611	java/lang/IllegalStateException
    //   1419	1445	1611	java/lang/IllegalStateException
    //   1448	1474	1611	java/lang/IllegalStateException
    //   1477	1489	1611	java/lang/IllegalStateException
    //   1489	1496	1611	java/lang/IllegalStateException
    //   1499	1504	1611	java/lang/IllegalStateException
    //   1507	1542	1611	java/lang/IllegalStateException
    //   1549	1559	1611	java/lang/IllegalStateException
    //   1559	1569	1611	java/lang/IllegalStateException
  }
  
  public final ArrayList q0(Object paramObject)
  {
    if ((paramObject instanceof List))
    {
      paramObject = (List)paramObject;
      localObject = new ArrayList();
      for (int i = 0; i < ((List)paramObject).size(); i++) {
        ((ArrayList)localObject).add(o0(((List)paramObject).get(i)));
      }
      return (ArrayList)localObject;
    }
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append("List expected: ");
    ((StringBuilder)localObject).append(paramObject);
    throw new RuntimeException(((StringBuilder)localObject).toString());
  }
  
  public final long r0()
  {
    long l1 = q;
    if (l1 != -9223372036854775807L) {
      return l1;
    }
    int i = d;
    if ((i != 1) && (i != 2))
    {
      Long localLong = p;
      if ((localLong != null) && (localLong.longValue() != -9223372036854775807L)) {
        return p.longValue();
      }
      return I.P();
    }
    long l2 = I.P();
    l1 = l2;
    if (l2 < 0L) {
      l1 = 0L;
    }
    return l1;
  }
  
  public final long s0()
  {
    int i = d;
    if ((i != 1) && (i != 2))
    {
      d0 locald0 = I;
      if (locald0 != null) {
        return locald0.getDuration();
      }
    }
    return -9223372036854775807L;
  }
  
  public final void u0(t paramt, long paramLong, Integer paramInteger, MethodChannel.Result paramResult)
  {
    q = paramLong;
    r = paramInteger;
    if (paramInteger != null) {
      i = paramInteger.intValue();
    } else {
      i = 0;
    }
    L = Integer.valueOf(i);
    int i = q0.g.c(d);
    if (i != 0)
    {
      if (i == 1) {
        B0("abort", "Connection aborted", null);
      }
      I.stop();
    }
    y = 0;
    s = paramResult;
    K0();
    d = 2;
    f0();
    K = paramt;
    I.l0(paramt);
    I.a();
  }
  
  public final void v0(double paramDouble)
  {
    int i = (int)Math.round(paramDouble * 1000.0D);
    ((LoudnessEnhancer)F.get("AndroidLoudnessEnhancer")).setTargetGain(i);
  }
  
  public final void w(p4.a parama)
  {
    for (int i = 0;; i++)
    {
      Object localObject = a;
      if (i >= localObject.length) {
        break;
      }
      localObject = localObject[i];
      if ((localObject instanceof t4.c))
      {
        w = ((t4.c)localObject);
        E();
      }
    }
  }
  
  public final void y0()
  {
    if (!I.k()) {
      return;
    }
    I.m0(false);
    K0();
    MethodChannel.Result localResult = t;
    if (localResult != null)
    {
      localResult.success(new HashMap());
      t = null;
    }
  }
  
  public final void z0(MethodChannel.Result paramResult)
  {
    if (I.k())
    {
      paramResult.success(new HashMap());
      return;
    }
    MethodChannel.Result localResult = t;
    if (localResult != null) {
      localResult.success(new HashMap());
    }
    t = paramResult;
    I.m0(true);
    K0();
    if (d == 5)
    {
      paramResult = t;
      if (paramResult != null)
      {
        paramResult.success(new HashMap());
        t = null;
      }
    }
  }
  
  public final class a
    implements Runnable
  {
    public a() {}
    
    public final void run()
    {
      Object localObject = I;
      if (localObject == null) {
        return;
      }
      long l = ((d0)localObject).z();
      localObject = a.this;
      if (l != o) {
        ((a)localObject).E();
      }
      int i = I.d();
      if (i != 2)
      {
        if (i != 3) {
          return;
        }
        if (I.k())
        {
          localObject = M;
          l = 500L;
        }
        else
        {
          localObject = M;
          l = 1000L;
        }
      }
      else
      {
        localObject = M;
        l = 200L;
      }
      ((Handler)localObject).postDelayed(this, l);
    }
  }
}

/* Location:
 * Qualified Name:     ua.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */