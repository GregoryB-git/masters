package m0;

import X2.g0;
import X2.t;
import X2.v;
import X2.v.a;
import X2.w;
import X2.w.a;
import X2.y;
import X2.y.a;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat.Builder;
import android.media.AudioManager;
import android.media.AudioProfile;
import android.net.Uri;
import android.provider.Settings.Global;
import android.util.Pair;
import android.util.SparseArray;
import d0.b.d;
import d0.q;
import d0.z;
import g0.M;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class e
{
  public static final e c = new e(v.Z(e.d));
  public static final v d;
  public static final w e;
  public final SparseArray a = new SparseArray();
  public final int b;
  
  static
  {
    Integer localInteger1 = Integer.valueOf(5);
    Integer localInteger2 = Integer.valueOf(6);
    d = v.b0(Integer.valueOf(2), localInteger1, localInteger2);
    w.a locala = new w.a().f(localInteger1, localInteger2).f(Integer.valueOf(17), localInteger2).f(Integer.valueOf(7), localInteger2).f(Integer.valueOf(30), Integer.valueOf(10)).f(Integer.valueOf(18), localInteger2);
    localInteger1 = Integer.valueOf(8);
    e = locala.f(localInteger2, localInteger1).f(localInteger1, localInteger1).f(Integer.valueOf(14), localInteger1).c();
  }
  
  public e(List paramList)
  {
    int i = 0;
    for (int j = 0; j < paramList.size(); j++)
    {
      e locale = (e)paramList.get(j);
      a.put(a, locale);
    }
    j = 0;
    while (i < a.size())
    {
      j = Math.max(j, a.valueAt(i)).b);
      i++;
    }
    b = j;
  }
  
  public static boolean b()
  {
    String str = M.c;
    boolean bool;
    if ((!"Amazon".equals(str)) && (!"Xiaomi".equals(str))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public static v c(List paramList)
  {
    Object localObject1 = new HashMap();
    ((Map)localObject1).put(Integer.valueOf(2), new HashSet(a3.f.c(new int[] { 12 })));
    for (int i = 0; i < paramList.size(); i++)
    {
      AudioProfile localAudioProfile = a.a(paramList.get(i));
      if (b.a(localAudioProfile) != 1)
      {
        int j = c.a(localAudioProfile);
        if ((M.A0(j)) || (e.containsKey(Integer.valueOf(j))))
        {
          boolean bool = ((Map)localObject1).containsKey(Integer.valueOf(j));
          localObject2 = Integer.valueOf(j);
          if (bool) {
            ((Set)g0.a.e((Set)((Map)localObject1).get(localObject2))).addAll(a3.f.c(d.a(localAudioProfile)));
          } else {
            ((Map)localObject1).put(localObject2, new HashSet(a3.f.c(d.a(localAudioProfile))));
          }
        }
      }
    }
    paramList = v.M();
    Object localObject2 = ((Map)localObject1).entrySet().iterator();
    while (((Iterator)localObject2).hasNext())
    {
      localObject1 = (Map.Entry)((Iterator)localObject2).next();
      paramList.h(new e(((Integer)((Map.Entry)localObject1).getKey()).intValue(), (Set)((Map.Entry)localObject1).getValue()));
    }
    return paramList.k();
  }
  
  public static v d(int[] paramArrayOfInt, int paramInt)
  {
    v.a locala = v.M();
    int i = 0;
    int j = i;
    int[] arrayOfInt = paramArrayOfInt;
    if (paramArrayOfInt == null) {
      arrayOfInt = new int[0];
    }
    for (j = i; j < arrayOfInt.length; j++) {
      locala.h(new e(arrayOfInt[j], paramInt));
    }
    return locala.k();
  }
  
  public static e e(Context paramContext, d0.b paramb, AudioDeviceInfo paramAudioDeviceInfo)
  {
    if ((M.a >= 23) && (paramAudioDeviceInfo != null)) {
      paramAudioDeviceInfo = new j(paramAudioDeviceInfo);
    } else {
      paramAudioDeviceInfo = null;
    }
    return g(paramContext, paramb, paramAudioDeviceInfo);
  }
  
  public static e f(Context paramContext, Intent paramIntent, d0.b paramb, j paramj)
  {
    AudioManager localAudioManager = (AudioManager)g0.a.e(paramContext.getSystemService("audio"));
    if (paramj == null) {
      if (M.a >= 33) {
        paramj = d.b(localAudioManager, paramb);
      } else {
        paramj = null;
      }
    }
    int i = M.a;
    if ((i >= 33) && ((M.E0(paramContext)) || (M.x0(paramContext)))) {
      return d.a(localAudioManager, paramb);
    }
    if ((i >= 23) && (b.b(localAudioManager, paramj))) {
      return c;
    }
    paramj = new y.a();
    paramj.h(Integer.valueOf(2));
    if ((i >= 29) && ((M.E0(paramContext)) || (M.x0(paramContext))))
    {
      paramj.j(c.a(paramb));
      return new e(d(a3.f.n(paramj.l()), 10));
    }
    paramContext = paramContext.getContentResolver();
    if (Settings.Global.getInt(paramContext, "use_external_surround_sound_flag", 0) == 1) {
      i = 1;
    } else {
      i = 0;
    }
    if (((i != 0) || (b())) && (Settings.Global.getInt(paramContext, "external_surround_sound_enabled", 0) == 1)) {
      paramj.j(d);
    }
    if ((paramIntent != null) && (i == 0) && (paramIntent.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", 0) == 1))
    {
      paramContext = paramIntent.getIntArrayExtra("android.media.extra.ENCODINGS");
      if (paramContext != null) {
        paramj.j(a3.f.c(paramContext));
      }
      return new e(d(a3.f.n(paramj.l()), paramIntent.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 10)));
    }
    return new e(d(a3.f.n(paramj.l()), 10));
  }
  
  public static e g(Context paramContext, d0.b paramb, j paramj)
  {
    return f(paramContext, paramContext.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), paramb, paramj);
  }
  
  public static int h(int paramInt)
  {
    int i = M.a;
    int j = paramInt;
    if (i <= 28) {
      if (paramInt == 7)
      {
        j = 8;
      }
      else if ((paramInt != 3) && (paramInt != 4))
      {
        j = paramInt;
        if (paramInt != 5) {}
      }
      else
      {
        j = 6;
      }
    }
    paramInt = j;
    if (i <= 26)
    {
      paramInt = j;
      if ("fugu".equals(M.b))
      {
        paramInt = j;
        if (j == 1) {
          paramInt = 2;
        }
      }
    }
    return M.M(paramInt);
  }
  
  public static Uri j()
  {
    Uri localUri;
    if (b()) {
      localUri = Settings.Global.getUriFor("external_surround_sound_enabled");
    } else {
      localUri = null;
    }
    return localUri;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof e)) {
      return false;
    }
    paramObject = (e)paramObject;
    if ((!M.t(a, a)) || (b != b)) {
      bool = false;
    }
    return bool;
  }
  
  public int hashCode()
  {
    return b + M.u(a) * 31;
  }
  
  public Pair i(q paramq, d0.b paramb)
  {
    int i = z.f((String)g0.a.e(n), j);
    if (!e.containsKey(Integer.valueOf(i))) {
      return null;
    }
    int j;
    if ((i == 18) && (!l(18)))
    {
      j = 6;
    }
    else if ((i != 8) || (l(8)))
    {
      j = i;
      if (i == 30)
      {
        j = i;
        if (l(30)) {}
      }
    }
    else
    {
      j = 7;
    }
    if (!l(j)) {
      return null;
    }
    e locale = (e)g0.a.e((e)a.get(j));
    int k = B;
    if ((k != -1) && (j != 18))
    {
      if ((n.equals("audio/vnd.dts.uhd;profile=p2")) && (M.a < 33))
      {
        i = k;
        if (k > 10) {
          return null;
        }
      }
      else
      {
        i = k;
        if (!locale.c(k)) {
          return null;
        }
      }
    }
    else
    {
      i = C;
      if (i == -1) {
        i = 48000;
      }
      i = locale.b(i, paramb);
    }
    i = h(i);
    if (i == 0) {
      return null;
    }
    return Pair.create(Integer.valueOf(j), Integer.valueOf(i));
  }
  
  public boolean k(q paramq, d0.b paramb)
  {
    boolean bool;
    if (i(paramq, paramb) != null) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean l(int paramInt)
  {
    return M.r(a, paramInt);
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("AudioCapabilities[maxChannelCount=");
    localStringBuilder.append(b);
    localStringBuilder.append(", audioProfiles=");
    localStringBuilder.append(a);
    localStringBuilder.append("]");
    return localStringBuilder.toString();
  }
  
  public static final abstract class b
  {
    private static y a()
    {
      y.a locala = new y.a().i(new Integer[] { Integer.valueOf(8), Integer.valueOf(7) });
      int i = M.a;
      if (i >= 31) {
        locala.i(new Integer[] { Integer.valueOf(26), Integer.valueOf(27) });
      }
      if (i >= 33) {
        locala.h(Integer.valueOf(30));
      }
      return locala.l();
    }
    
    public static boolean b(AudioManager paramAudioManager, j paramj)
    {
      if (paramj == null) {
        paramAudioManager = ((AudioManager)g0.a.e(paramAudioManager)).getDevices(2);
      } else {
        paramAudioManager = new AudioDeviceInfo[] { a };
      }
      paramj = a();
      int i = paramAudioManager.length;
      for (int j = 0; j < i; j++) {
        if (paramj.contains(Integer.valueOf(paramAudioManager[j].getType()))) {
          return true;
        }
      }
      return false;
    }
  }
  
  public static final abstract class c
  {
    public static v a(d0.b paramb)
    {
      v.a locala = v.M();
      g0 localg0 = e.e.i().q();
      while (localg0.hasNext())
      {
        Integer localInteger = (Integer)localg0.next();
        int i = localInteger.intValue();
        if ((M.a >= M.K(i)) && (f.a(new AudioFormat.Builder().setChannelMask(12).setEncoding(i).setSampleRate(48000).build(), aa))) {
          locala.h(localInteger);
        }
      }
      locala.h(Integer.valueOf(2));
      return locala.k();
    }
    
    public static int b(int paramInt1, int paramInt2, d0.b paramb)
    {
      for (int i = 10; i > 0; i--)
      {
        int j = M.M(i);
        if ((j != 0) && (f.a(new AudioFormat.Builder().setEncoding(paramInt1).setSampleRate(paramInt2).setChannelMask(j).build(), aa))) {
          return i;
        }
      }
      return 0;
    }
  }
  
  public static final abstract class d
  {
    public static e a(AudioManager paramAudioManager, d0.b paramb)
    {
      return new e(e.a(h.a(paramAudioManager, aa)), null);
    }
    
    public static j b(AudioManager paramAudioManager, d0.b paramb)
    {
      try
      {
        paramAudioManager = g.a((AudioManager)g0.a.e(paramAudioManager), aa);
        if (paramAudioManager.isEmpty()) {
          return null;
        }
        return new j((AudioDeviceInfo)paramAudioManager.get(0));
      }
      catch (RuntimeException paramAudioManager) {}
      return null;
    }
  }
  
  public static final class e
  {
    public static final e d;
    public final int a;
    public final int b;
    public final y c;
    
    static
    {
      e locale;
      if (M.a >= 33) {
        locale = new e(2, a(10));
      } else {
        locale = new e(2, 10);
      }
      d = locale;
    }
    
    public e(int paramInt1, int paramInt2)
    {
      a = paramInt1;
      b = paramInt2;
      c = null;
    }
    
    public e(int paramInt, Set paramSet)
    {
      a = paramInt;
      paramSet = y.T(paramSet);
      c = paramSet;
      paramSet = paramSet.q();
      for (paramInt = 0; paramSet.hasNext(); paramInt = Math.max(paramInt, Integer.bitCount(((Integer)paramSet.next()).intValue()))) {}
      b = paramInt;
    }
    
    public static y a(int paramInt)
    {
      y.a locala = new y.a();
      for (int i = 1; i <= paramInt; i++) {
        locala.h(Integer.valueOf(M.M(i)));
      }
      return locala.l();
    }
    
    public int b(int paramInt, d0.b paramb)
    {
      if (c != null) {
        return b;
      }
      if (M.a >= 29) {
        return e.c.b(a, paramInt, paramb);
      }
      return ((Integer)g0.a.e((Integer)e.e.getOrDefault(Integer.valueOf(a), Integer.valueOf(0)))).intValue();
    }
    
    public boolean c(int paramInt)
    {
      y localy = c;
      boolean bool = false;
      if (localy == null)
      {
        if (paramInt <= b) {
          bool = true;
        }
        return bool;
      }
      paramInt = M.M(paramInt);
      if (paramInt == 0) {
        return false;
      }
      return c.contains(Integer.valueOf(paramInt));
    }
    
    public boolean equals(Object paramObject)
    {
      boolean bool = true;
      if (this == paramObject) {
        return true;
      }
      if (!(paramObject instanceof e)) {
        return false;
      }
      paramObject = (e)paramObject;
      if ((a != a) || (b != b) || (!M.c(c, c))) {
        bool = false;
      }
      return bool;
    }
    
    public int hashCode()
    {
      int i = a;
      int j = b;
      y localy = c;
      int k;
      if (localy == null) {
        k = 0;
      } else {
        k = localy.hashCode();
      }
      return (i * 31 + j) * 31 + k;
    }
    
    public String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("AudioProfile[format=");
      localStringBuilder.append(a);
      localStringBuilder.append(", maxChannelCount=");
      localStringBuilder.append(b);
      localStringBuilder.append(", channelMasks=");
      localStringBuilder.append(c);
      localStringBuilder.append("]");
      return localStringBuilder.toString();
    }
  }
}

/* Location:
 * Qualified Name:     m0.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */