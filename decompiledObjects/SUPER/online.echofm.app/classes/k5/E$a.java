package k5;

import a0.b;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.MicrophoneInfo;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.KeyEvent;
import androidx.media.AudioAttributesCompat;
import androidx.media.AudioAttributesCompat.a;
import androidx.media.a.b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import k0.f1;

public class E$a
{
  public final Handler a = new Handler(Looper.getMainLooper());
  public List b = new ArrayList();
  public androidx.media.a c;
  public BroadcastReceiver d;
  public BroadcastReceiver e;
  public Context f;
  public AudioManager g;
  public Object h;
  public List i = new ArrayList();
  
  public E$a(Context paramContext)
  {
    f = paramContext;
    g = ((AudioManager)paramContext.getSystemService("audio"));
    z();
  }
  
  public void A(String paramString, Object... paramVarArgs)
  {
    Iterator localIterator = b.iterator();
    while (localIterator.hasNext())
    {
      E localE = (E)localIterator.next();
      ArrayList localArrayList = new ArrayList(Arrays.asList(paramVarArgs));
      b.c(paramString, localArrayList);
    }
  }
  
  public Object B()
  {
    return Boolean.valueOf(g.isBluetoothScoAvailableOffCall());
  }
  
  public Object C()
  {
    return Boolean.valueOf(g.isBluetoothScoOn());
  }
  
  public boolean D()
  {
    boolean bool;
    if (b.size() == 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public Object E()
  {
    E.h(29);
    return Boolean.valueOf(n.a());
  }
  
  public Object F()
  {
    return Boolean.valueOf(g.isMicrophoneMute());
  }
  
  public Object G()
  {
    return Boolean.valueOf(g.isMusicActive());
  }
  
  public Object H()
  {
    return Boolean.valueOf(g.isSpeakerphoneOn());
  }
  
  public Object I(int paramInt)
  {
    E.h(23);
    return Boolean.valueOf(g.isStreamMute(paramInt));
  }
  
  public Object J()
  {
    E.h(21);
    return Boolean.valueOf(g.isVolumeFixed());
  }
  
  public Object L()
  {
    g.loadSoundEffects();
    return null;
  }
  
  public Object M(int paramInt, Double paramDouble)
  {
    if (paramDouble != null) {
      g.playSoundEffect(paramInt, (float)paramDouble.doubleValue());
    } else {
      g.playSoundEffect(paramInt);
    }
    return null;
  }
  
  public final void N()
  {
    if (d != null) {
      return;
    }
    b localb = new b();
    d = localb;
    x.a.h(f, localb, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"), 2);
  }
  
  public final void O()
  {
    if (e != null) {
      return;
    }
    c localc = new c();
    e = localc;
    x.a.h(f, localc, new IntentFilter("android.media.ACTION_SCO_AUDIO_STATE_UPDATED"), 2);
  }
  
  public void P(E paramE)
  {
    b.remove(paramE);
  }
  
  public boolean Q(List paramList)
  {
    Object localObject = c;
    boolean bool = true;
    if (localObject != null) {
      return true;
    }
    localObject = (Map)paramList.get(0);
    paramList = new a.b(((Integer)((Map)localObject).get("gainType")).intValue());
    paramList.e(new D(this));
    if (((Map)localObject).get("audioAttributes") != null) {
      paramList.c(h((Map)((Map)localObject).get("audioAttributes")));
    }
    if (((Map)localObject).get("willPauseWhenDucked") != null) {
      paramList.g(((Boolean)((Map)localObject).get("willPauseWhenDucked")).booleanValue());
    }
    paramList = paramList.a();
    c = paramList;
    if (b.b(g, paramList) != 1) {
      bool = false;
    }
    if (bool)
    {
      N();
      O();
    }
    return bool;
  }
  
  public Object R(int paramInt)
  {
    E.h(29);
    s.a(g, paramInt);
    return null;
  }
  
  public Object S(boolean paramBoolean)
  {
    g.setBluetoothScoOn(paramBoolean);
    return null;
  }
  
  public boolean T(Integer paramInteger)
  {
    E.h(31);
    Iterator localIterator = i.iterator();
    while (localIterator.hasNext())
    {
      AudioDeviceInfo localAudioDeviceInfo = (AudioDeviceInfo)localIterator.next();
      if (localAudioDeviceInfo.getId() == paramInteger.intValue()) {
        return u.a(g, localAudioDeviceInfo);
      }
    }
    return false;
  }
  
  public Object U(boolean paramBoolean)
  {
    g.setMicrophoneMute(paramBoolean);
    return null;
  }
  
  public Object V(int paramInt)
  {
    g.setMode(paramInt);
    return null;
  }
  
  public Object W(String paramString)
  {
    g.setParameters(paramString);
    return null;
  }
  
  public Object X(int paramInt)
  {
    g.setRingerMode(paramInt);
    return null;
  }
  
  public Object Y(boolean paramBoolean)
  {
    g.setSpeakerphoneOn(paramBoolean);
    return null;
  }
  
  public Object Z(int paramInt1, int paramInt2, int paramInt3)
  {
    g.setStreamVolume(paramInt1, paramInt2, paramInt3);
    return null;
  }
  
  public Object a0()
  {
    g.startBluetoothSco();
    return null;
  }
  
  public boolean b()
  {
    Object localObject = f;
    boolean bool = false;
    if (localObject == null) {
      return false;
    }
    d0();
    e0();
    localObject = c;
    if (localObject == null) {
      return true;
    }
    int j = b.a(g, (androidx.media.a)localObject);
    c = null;
    if (j == 1) {
      bool = true;
    }
    return bool;
  }
  
  public Object b0()
  {
    g.stopBluetoothSco();
    return null;
  }
  
  public void c(E paramE)
  {
    b.add(paramE);
  }
  
  public Object c0()
  {
    g.unloadSoundEffects();
    return null;
  }
  
  public Object d(int paramInt1, int paramInt2, int paramInt3)
  {
    g.adjustStreamVolume(paramInt1, paramInt2, paramInt3);
    return null;
  }
  
  public final void d0()
  {
    BroadcastReceiver localBroadcastReceiver = d;
    if (localBroadcastReceiver != null)
    {
      Context localContext = f;
      if (localContext != null)
      {
        localContext.unregisterReceiver(localBroadcastReceiver);
        d = null;
      }
    }
  }
  
  public Object e(int paramInt1, int paramInt2, int paramInt3)
  {
    g.adjustSuggestedStreamVolume(paramInt1, paramInt2, paramInt3);
    return null;
  }
  
  public final void e0()
  {
    BroadcastReceiver localBroadcastReceiver = e;
    if (localBroadcastReceiver != null)
    {
      Context localContext = f;
      if (localContext != null)
      {
        localContext.unregisterReceiver(localBroadcastReceiver);
        e = null;
      }
    }
  }
  
  public Object f(int paramInt1, int paramInt2)
  {
    g.adjustVolume(paramInt1, paramInt2);
    return null;
  }
  
  public Object g()
  {
    E.h(31);
    q.a(g);
    return null;
  }
  
  public final AudioAttributesCompat h(Map paramMap)
  {
    AudioAttributesCompat.a locala = new AudioAttributesCompat.a();
    if (paramMap.get("contentType") != null) {
      locala.b(((Integer)paramMap.get("contentType")).intValue());
    }
    if (paramMap.get("flags") != null) {
      locala.c(((Integer)paramMap.get("flags")).intValue());
    }
    if (paramMap.get("usage") != null) {
      locala.d(((Integer)paramMap.get("usage")).intValue());
    }
    return locala.a();
  }
  
  public Object i(Map paramMap)
  {
    paramMap = new KeyEvent(E.e(paramMap.get("downTime")).longValue(), E.e(paramMap.get("eventTime")).longValue(), ((Integer)paramMap.get("action")).intValue(), ((Integer)paramMap.get("keyCode")).intValue(), ((Integer)paramMap.get("repeatCount")).intValue(), ((Integer)paramMap.get("metaState")).intValue(), ((Integer)paramMap.get("deviceId")).intValue(), ((Integer)paramMap.get("scanCode")).intValue(), ((Integer)paramMap.get("flags")).intValue(), ((Integer)paramMap.get("source")).intValue());
    g.dispatchMediaKeyEvent(paramMap);
    return null;
  }
  
  public void j()
  {
    b();
    k();
    f = null;
    g = null;
  }
  
  public final void k()
  {
    g.unregisterAudioDeviceCallback((AudioDeviceCallback)h);
  }
  
  public Object l()
  {
    E.h(21);
    return Integer.valueOf(g.generateAudioSessionId());
  }
  
  public Object m()
  {
    E.h(29);
    return Integer.valueOf(r.a(g));
  }
  
  public List n()
  {
    E.h(31);
    i = t.a(g);
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = i.iterator();
    while (localIterator.hasNext()) {
      localArrayList.add(E.c((AudioDeviceInfo)localIterator.next()));
    }
    return localArrayList;
  }
  
  public Map o()
  {
    E.h(31);
    return E.c(o.a(g));
  }
  
  public Object p(int paramInt)
  {
    E.h(23);
    ArrayList localArrayList = new ArrayList();
    AudioDeviceInfo[] arrayOfAudioDeviceInfo = g.getDevices(paramInt);
    for (paramInt = 0; paramInt < arrayOfAudioDeviceInfo.length; paramInt++)
    {
      AudioDeviceInfo localAudioDeviceInfo = arrayOfAudioDeviceInfo[paramInt];
      String str;
      if (Build.VERSION.SDK_INT >= 28) {
        str = a.a(localAudioDeviceInfo);
      } else {
        str = null;
      }
      localArrayList.add(E.g(new Object[] { "id", Integer.valueOf(localAudioDeviceInfo.getId()), "productName", localAudioDeviceInfo.getProductName(), "address", str, "isSource", Boolean.valueOf(localAudioDeviceInfo.isSource()), "isSink", Boolean.valueOf(localAudioDeviceInfo.isSink()), "sampleRates", E.f(localAudioDeviceInfo.getSampleRates()), "channelMasks", E.f(localAudioDeviceInfo.getChannelMasks()), "channelIndexMasks", E.f(localAudioDeviceInfo.getChannelIndexMasks()), "channelCounts", E.f(localAudioDeviceInfo.getChannelCounts()), "encodings", E.f(localAudioDeviceInfo.getEncodings()), "type", Integer.valueOf(localAudioDeviceInfo.getType()) }));
    }
    return localArrayList;
  }
  
  public Object q()
  {
    E.h(28);
    ArrayList localArrayList1 = new ArrayList();
    Iterator localIterator1 = p.a(g).iterator();
    while (localIterator1.hasNext())
    {
      MicrophoneInfo localMicrophoneInfo = C.a(localIterator1.next());
      ArrayList localArrayList2 = new ArrayList();
      Iterator localIterator2 = f.a(localMicrophoneInfo).iterator();
      Pair localPair;
      while (localIterator2.hasNext())
      {
        localPair = (Pair)localIterator2.next();
        localArrayList2.add(new ArrayList(Arrays.asList(new Double[] { Double.valueOf(((Float)first).floatValue()), Double.valueOf(((Float)second).floatValue()) })));
      }
      ArrayList localArrayList3 = new ArrayList();
      localIterator2 = g.a(localMicrophoneInfo).iterator();
      while (localIterator2.hasNext())
      {
        localPair = (Pair)localIterator2.next();
        localArrayList3.add(new ArrayList(Arrays.asList(new Integer[] { (Integer)first, (Integer)second })));
      }
      localArrayList1.add(E.g(new Object[] { "description", h.a(localMicrophoneInfo), "id", Integer.valueOf(i.a(localMicrophoneInfo)), "type", Integer.valueOf(j.a(localMicrophoneInfo)), "address", k.a(localMicrophoneInfo), "location", Integer.valueOf(l.a(localMicrophoneInfo)), "group", Integer.valueOf(m.a(localMicrophoneInfo)), "indexInTheGroup", Integer.valueOf(v.a(localMicrophoneInfo)), "position", E.a(w.a(localMicrophoneInfo)), "orientation", E.a(x.a(localMicrophoneInfo)), "frequencyResponse", localArrayList2, "channelMapping", localArrayList3, "sensitivity", Float.valueOf(y.a(localMicrophoneInfo)), "maxSpl", Float.valueOf(z.a(localMicrophoneInfo)), "minSpl", Float.valueOf(A.a(localMicrophoneInfo)), "directionality", Integer.valueOf(B.a(localMicrophoneInfo)) }));
    }
    return localArrayList1;
  }
  
  public Object r()
  {
    return Integer.valueOf(g.getMode());
  }
  
  public Object s(String paramString)
  {
    return g.getParameters(paramString);
  }
  
  public Object t(String paramString)
  {
    return g.getProperty(paramString);
  }
  
  public Object u()
  {
    return Integer.valueOf(g.getRingerMode());
  }
  
  public Object v(int paramInt)
  {
    return Integer.valueOf(g.getStreamMaxVolume(paramInt));
  }
  
  public Object w(int paramInt)
  {
    E.h(28);
    return Integer.valueOf(f1.a(g, paramInt));
  }
  
  public Object x(int paramInt)
  {
    return Integer.valueOf(g.getStreamVolume(paramInt));
  }
  
  public Object y(int paramInt1, int paramInt2, int paramInt3)
  {
    E.h(28);
    return Float.valueOf(e.a(g, paramInt1, paramInt2, paramInt3));
  }
  
  public final void z()
  {
    a locala = new a();
    h = locala;
    g.registerAudioDeviceCallback((AudioDeviceCallback)locala, a);
  }
  
  public class a
    extends AudioDeviceCallback
  {
    public a() {}
    
    public void onAudioDevicesAdded(AudioDeviceInfo[] paramArrayOfAudioDeviceInfo)
    {
      A("onAudioDevicesAdded", new Object[] { E.d(paramArrayOfAudioDeviceInfo) });
    }
    
    public void onAudioDevicesRemoved(AudioDeviceInfo[] paramArrayOfAudioDeviceInfo)
    {
      A("onAudioDevicesRemoved", new Object[] { E.d(paramArrayOfAudioDeviceInfo) });
    }
  }
  
  public class b
    extends BroadcastReceiver
  {
    public b() {}
    
    public void onReceive(Context paramContext, Intent paramIntent)
    {
      if ("android.media.AUDIO_BECOMING_NOISY".equals(paramIntent.getAction())) {
        A("onBecomingNoisy", new Object[0]);
      }
    }
  }
  
  public class c
    extends BroadcastReceiver
  {
    public c() {}
    
    public void onReceive(Context paramContext, Intent paramIntent)
    {
      A("onScoAudioStateUpdated", new Object[] { Integer.valueOf(paramIntent.getIntExtra("android.media.extra.SCO_AUDIO_STATE", -1)), Integer.valueOf(paramIntent.getIntExtra("android.media.extra.SCO_AUDIO_PREVIOUS_STATE", -1)) });
    }
  }
}

/* Location:
 * Qualified Name:     k5.E.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */