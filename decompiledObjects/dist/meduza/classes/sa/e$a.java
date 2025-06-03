package sa;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioAttributes.Builder;
import android.media.AudioDeviceInfo;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.media.AudioManager.OnAudioFocusChangeListener;
import android.media.MicrophoneInfo;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.KeyEvent;
import androidx.media.AudioAttributesCompat;
import androidx.media.AudioAttributesImpl;
import androidx.media.AudioAttributesImpl.a;
import androidx.media.AudioAttributesImplApi21.a;
import androidx.media.AudioAttributesImplApi26.a;
import d2.k;
import f;
import io.flutter.plugin.common.MethodChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class e$a
{
  public ArrayList a;
  public g1.a b;
  public c c;
  public d d;
  public Context e;
  public AudioManager f;
  public b g;
  public List<AudioDeviceInfo> h;
  
  public e$a(Context paramContext)
  {
    Handler localHandler = new Handler(Looper.getMainLooper());
    a = new ArrayList();
    h = new ArrayList();
    e = paramContext;
    f = ((AudioManager)paramContext.getSystemService("audio"));
    paramContext = new b(this);
    g = paramContext;
    f.registerAudioDeviceCallback(paramContext, localHandler);
  }
  
  public static boolean b(a parama, List paramList)
  {
    Object localObject1 = b;
    boolean bool1 = true;
    boolean bool2 = true;
    int i;
    if (localObject1 != null)
    {
      bool2 = bool1;
    }
    else
    {
      Map localMap1 = (Map)paramList.get(0);
      i = ((Integer)localMap1.get("gainType")).intValue();
      paramList = g1.a.g;
      int j;
      if ((i != 1) && (i != 2) && (i != 3) && (i != 4)) {
        j = 0;
      } else {
        j = 1;
      }
      if (j == 0) {
        break label531;
      }
      Object localObject2 = new a(parama);
      localObject1 = new Handler(Looper.getMainLooper());
      if (localMap1.get("audioAttributes") != null)
      {
        Map localMap2 = (Map)localMap1.get("audioAttributes");
        j = AudioAttributesCompat.b;
        if (Build.VERSION.SDK_INT >= 26) {
          paramList = new AudioAttributesImplApi26.a();
        } else {
          paramList = new AudioAttributesImplApi21.a();
        }
        if (localMap2.get("contentType") != null)
        {
          j = ((Integer)localMap2.get("contentType")).intValue();
          a.setContentType(j);
        }
        if (localMap2.get("flags") != null)
        {
          j = ((Integer)localMap2.get("flags")).intValue();
          a.setFlags(j);
        }
        if (localMap2.get("usage") != null) {
          paramList.a(((Integer)localMap2.get("usage")).intValue());
        }
        paramList = new AudioAttributesCompat(paramList.build());
      }
      if (localMap1.get("willPauseWhenDucked") != null) {
        bool1 = ((Boolean)localMap1.get("willPauseWhenDucked")).booleanValue();
      } else {
        bool1 = false;
      }
      localObject2 = new g1.a(i, (AudioManager.OnAudioFocusChangeListener)localObject2, (Handler)localObject1, paramList, bool1);
      b = ((g1.a)localObject2);
      localObject1 = f;
      if (localObject1 == null) {
        break label521;
      }
      if (Build.VERSION.SDK_INT >= 26) {
        j = g1.b.b((AudioManager)localObject1, (AudioFocusRequest)f);
      } else {
        j = ((AudioManager)localObject1).requestAudioFocus(b, a.a(), i);
      }
      if (j == 1) {
        bool1 = bool2;
      } else {
        bool1 = false;
      }
      bool2 = bool1;
      if (bool1)
      {
        if (c == null)
        {
          paramList = new c(parama);
          c = paramList;
          e.registerReceiver(paramList, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
        }
        if (d != null)
        {
          bool2 = bool1;
        }
        else
        {
          paramList = new d(parama);
          d = paramList;
          e.registerReceiver(paramList, new IntentFilter("android.media.ACTION_SCO_AUDIO_STATE_UPDATED"));
          bool2 = bool1;
        }
      }
    }
    return bool2;
    label521:
    throw new IllegalArgumentException("AudioManager must not be null");
    label531:
    throw new IllegalArgumentException(f.h("Illegal audio focus gain type ", i));
  }
  
  public static void c(a parama, Map paramMap)
  {
    parama.getClass();
    e.d(19);
    Object localObject = paramMap.get("downTime");
    if ((localObject != null) && (!(localObject instanceof Long))) {
      localObject = Long.valueOf(((Integer)localObject).intValue());
    } else {
      localObject = (Long)localObject;
    }
    long l = ((Long)localObject).longValue();
    localObject = paramMap.get("eventTime");
    if ((localObject != null) && (!(localObject instanceof Long))) {
      localObject = Long.valueOf(((Integer)localObject).intValue());
    } else {
      localObject = (Long)localObject;
    }
    paramMap = new KeyEvent(l, ((Long)localObject).longValue(), ((Integer)paramMap.get("action")).intValue(), ((Integer)paramMap.get("code")).intValue(), ((Integer)paramMap.get("repeat")).intValue(), ((Integer)paramMap.get("metaState")).intValue(), ((Integer)paramMap.get("deviceId")).intValue(), ((Integer)paramMap.get("scancode")).intValue(), ((Integer)paramMap.get("flags")).intValue(), ((Integer)paramMap.get("source")).intValue());
    f.dispatchMediaKeyEvent(paramMap);
  }
  
  public static ArrayList d(a parama, int paramInt)
  {
    parama.getClass();
    e.d(23);
    ArrayList localArrayList = new ArrayList();
    AudioDeviceInfo[] arrayOfAudioDeviceInfo = f.getDevices(paramInt);
    for (paramInt = 0; paramInt < arrayOfAudioDeviceInfo.length; paramInt++)
    {
      AudioDeviceInfo localAudioDeviceInfo = arrayOfAudioDeviceInfo[paramInt];
      parama = null;
      if (Build.VERSION.SDK_INT >= 28) {
        parama = k.h(localAudioDeviceInfo);
      }
      localArrayList.add(e.c(new Object[] { "id", Integer.valueOf(localAudioDeviceInfo.getId()), "productName", localAudioDeviceInfo.getProductName(), "address", parama, "isSource", Boolean.valueOf(localAudioDeviceInfo.isSource()), "isSink", Boolean.valueOf(localAudioDeviceInfo.isSink()), "sampleRates", e.b(localAudioDeviceInfo.getSampleRates()), "channelMasks", e.b(localAudioDeviceInfo.getChannelMasks()), "channelIndexMasks", e.b(localAudioDeviceInfo.getChannelIndexMasks()), "channelCounts", e.b(localAudioDeviceInfo.getChannelCounts()), "encodings", e.b(localAudioDeviceInfo.getEncodings()), "type", Integer.valueOf(localAudioDeviceInfo.getType()) }));
    }
    return localArrayList;
  }
  
  public static ArrayList e(a parama)
  {
    parama.getClass();
    e.d(28);
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator1 = f.getMicrophones().iterator();
    while (localIterator1.hasNext())
    {
      MicrophoneInfo localMicrophoneInfo = (MicrophoneInfo)localIterator1.next();
      parama = new ArrayList();
      Object localObject = localMicrophoneInfo.getFrequencyResponse().iterator();
      Pair localPair;
      while (((Iterator)localObject).hasNext())
      {
        localPair = (Pair)((Iterator)localObject).next();
        parama.add(new ArrayList(Arrays.asList(new Double[] { Double.valueOf(((Float)first).floatValue()), Double.valueOf(((Float)second).floatValue()) })));
      }
      localObject = new ArrayList();
      Iterator localIterator2 = localMicrophoneInfo.getChannelMapping().iterator();
      while (localIterator2.hasNext())
      {
        localPair = (Pair)localIterator2.next();
        ((ArrayList)localObject).add(new ArrayList(Arrays.asList(new Integer[] { (Integer)first, (Integer)second })));
      }
      localArrayList.add(e.c(new Object[] { "description", localMicrophoneInfo.getDescription(), "id", Integer.valueOf(localMicrophoneInfo.getId()), "type", Integer.valueOf(localMicrophoneInfo.getType()), "address", localMicrophoneInfo.getAddress(), "location", Integer.valueOf(localMicrophoneInfo.getLocation()), "group", Integer.valueOf(localMicrophoneInfo.getGroup()), "indexInTheGroup", Integer.valueOf(localMicrophoneInfo.getIndexInTheGroup()), "position", e.a(localMicrophoneInfo.getPosition()), "orientation", e.a(localMicrophoneInfo.getOrientation()), "frequencyResponse", parama, "channelMapping", localObject, "sensitivity", Float.valueOf(localMicrophoneInfo.getSensitivity()), "maxSpl", Float.valueOf(localMicrophoneInfo.getMaxSpl()), "minSpl", Float.valueOf(localMicrophoneInfo.getMinSpl()), "directionality", Integer.valueOf(localMicrophoneInfo.getDirectionality()) }));
    }
    return localArrayList;
  }
  
  public static HashMap f(AudioDeviceInfo paramAudioDeviceInfo)
  {
    return e.c(new Object[] { "id", Integer.valueOf(paramAudioDeviceInfo.getId()), "productName", paramAudioDeviceInfo.getProductName(), "address", k.h(paramAudioDeviceInfo), "isSource", Boolean.valueOf(paramAudioDeviceInfo.isSource()), "isSink", Boolean.valueOf(paramAudioDeviceInfo.isSink()), "sampleRates", paramAudioDeviceInfo.getSampleRates(), "channelMasks", paramAudioDeviceInfo.getChannelMasks(), "channelIndexMasks", paramAudioDeviceInfo.getChannelIndexMasks(), "channelCounts", paramAudioDeviceInfo.getChannelCounts(), "encodings", paramAudioDeviceInfo.getEncodings(), "type", Integer.valueOf(paramAudioDeviceInfo.getType()) });
  }
  
  public final boolean a()
  {
    Object localObject1 = e;
    boolean bool = false;
    if (localObject1 == null) {
      return false;
    }
    Object localObject2 = c;
    if (localObject2 != null)
    {
      ((Context)localObject1).unregisterReceiver((BroadcastReceiver)localObject2);
      c = null;
    }
    localObject2 = d;
    if (localObject2 != null)
    {
      localObject1 = e;
      if (localObject1 != null)
      {
        ((Context)localObject1).unregisterReceiver((BroadcastReceiver)localObject2);
        d = null;
      }
    }
    localObject1 = b;
    if (localObject1 == null) {
      return true;
    }
    localObject2 = f;
    if (localObject2 != null)
    {
      int i;
      if (Build.VERSION.SDK_INT >= 26) {
        i = g1.b.a((AudioManager)localObject2, (AudioFocusRequest)f);
      } else {
        i = ((AudioManager)localObject2).abandonAudioFocus(b);
      }
      b = null;
      if (i == 1) {
        bool = true;
      }
      return bool;
    }
    throw new IllegalArgumentException("AudioManager must not be null");
  }
  
  public final void g(String paramString, Object... paramVarArgs)
  {
    Iterator localIterator = a.iterator();
    while (localIterator.hasNext())
    {
      e locale = (e)localIterator.next();
      ArrayList localArrayList = new ArrayList(Arrays.asList(paramVarArgs));
      b.invokeMethod(paramString, localArrayList);
    }
  }
}

/* Location:
 * Qualified Name:     sa.e.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */