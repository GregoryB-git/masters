package sa;

import a4.r;
import aa.u;
import aa.w;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioAttributes.Builder;
import android.media.AudioDeviceInfo;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.media.AudioManager.OnAudioFocusChangeListener;
import android.media.MicrophoneInfo;
import android.media.MicrophoneInfo.Coordinate3F;
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
import e0.h0;
import e0.i0;
import f;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.MethodChannel.MethodCallHandler;
import io.flutter.plugin.common.MethodChannel.Result;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class e
  implements MethodChannel.MethodCallHandler
{
  public static a c;
  public BinaryMessenger a;
  public MethodChannel b;
  
  public e(BinaryMessenger paramBinaryMessenger, Context paramContext)
  {
    if (c == null) {
      c = new a(paramContext);
    }
    a = paramBinaryMessenger;
    b = new MethodChannel(paramBinaryMessenger, "com.ryanheise.android_audio_manager");
    ca.add(this);
    b.setMethodCallHandler(this);
  }
  
  public static ArrayList<Double> a(MicrophoneInfo.Coordinate3F paramCoordinate3F)
  {
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(Double.valueOf(x));
    localArrayList.add(Double.valueOf(y));
    localArrayList.add(Double.valueOf(z));
    return localArrayList;
  }
  
  public static ArrayList<Integer> b(int[] paramArrayOfInt)
  {
    ArrayList localArrayList = new ArrayList();
    for (int i = 0; i < paramArrayOfInt.length; i++) {
      localArrayList.add(Integer.valueOf(paramArrayOfInt[i]));
    }
    return localArrayList;
  }
  
  public static HashMap c(Object... paramVarArgs)
  {
    HashMap localHashMap = new HashMap();
    for (int i = 0; i < paramVarArgs.length; i += 2) {
      localHashMap.put((String)paramVarArgs[i], paramVarArgs[(i + 1)]);
    }
    return localHashMap;
  }
  
  public static void d(int paramInt)
  {
    if (Build.VERSION.SDK_INT >= paramInt) {
      return;
    }
    throw new RuntimeException(f.h("Requires API level ", paramInt));
  }
  
  public final void onMethodCall(MethodCall paramMethodCall, MethodChannel.Result paramResult)
  {
    try
    {
      localObject = (List)arguments;
      paramMethodCall = method;
      int i = -1;
      int j = paramMethodCall.hashCode();
      boolean bool1 = false;
      switch (j)
      {
      default: 
        break;
      case 2093966320: 
        if (paramMethodCall.equals("generateAudioSessionId")) {
          i = 33;
        }
        break;
      case 1986792688: 
        if (paramMethodCall.equals("isVolumeFixed")) {
          i = 3;
        }
        break;
      case 1984784677: 
        if (paramMethodCall.equals("setMode")) {
          i = 30;
        }
        break;
      case 1570996442: 
        if (paramMethodCall.equals("getAvailableCommunicationDevices")) {
          i = 15;
        }
        break;
      case 1504508844: 
        if (paramMethodCall.equals("playSoundEffect")) {
          i = 36;
        }
        break;
      case 1397925922: 
        if (paramMethodCall.equals("setRingerMode")) {
          i = 12;
        }
        break;
      case 1378317714: 
        if (paramMethodCall.equals("unloadSoundEffects")) {
          i = 38;
        }
        break;
      case 1357290231: 
        if (paramMethodCall.equals("abandonAudioFocus")) {
          i = 1;
        }
        break;
      case 1258134830: 
        if (paramMethodCall.equals("adjustSuggestedStreamVolume")) {
          i = 6;
        }
        break;
      case 1241312831: 
        if (paramMethodCall.equals("clearCommunicationDevice")) {
          i = 18;
        }
        break;
      case 1187450940: 
        if (paramMethodCall.equals("setStreamVolume")) {
          i = 13;
        }
        break;
      case 1163405254: 
        if (paramMethodCall.equals("getAllowedCapturePolicy")) {
          i = 22;
        }
        break;
      case 1084758859: 
        if (paramMethodCall.equals("getProperty")) {
          i = 39;
        }
        break;
      case 976310915: 
        if (paramMethodCall.equals("isStreamMute")) {
          i = 14;
        }
        break;
      case 954131337: 
        if (paramMethodCall.equals("adjustVolume")) {
          i = 5;
        }
        break;
      case 935118828: 
        if (paramMethodCall.equals("setParameters")) {
          i = 34;
        }
        break;
      case 623794710: 
        if (paramMethodCall.equals("getRingerMode")) {
          i = 7;
        }
        break;
      case 469094495: 
        if (paramMethodCall.equals("isBluetoothScoAvailableOffCall")) {
          i = 23;
        }
        break;
      case 276698416: 
        if (paramMethodCall.equals("getStreamVolume")) {
          i = 10;
        }
        break;
      case 186762163: 
        if (paramMethodCall.equals("stopBluetoothSco")) {
          i = 25;
        }
        break;
      case 160987616: 
        if (paramMethodCall.equals("getParameters")) {
          i = 35;
        }
        break;
      case 152385829: 
        if (paramMethodCall.equals("dispatchMediaKeyEvent")) {
          i = 2;
        }
        break;
      case -75324903: 
        if (paramMethodCall.equals("getMode")) {
          i = 31;
        }
        break;
      case -380792370: 
        if (paramMethodCall.equals("getStreamVolumeDb")) {
          i = 11;
        }
        break;
      case -445792758: 
        if (paramMethodCall.equals("setCommunicationDevice")) {
          i = 16;
        }
        break;
      case -580980717: 
        if (paramMethodCall.equals("startBluetoothSco")) {
          i = 24;
        }
        break;
      case -694417919: 
        if (paramMethodCall.equals("isMusicActive")) {
          i = 32;
        }
        break;
      case -763512583: 
        if (paramMethodCall.equals("loadSoundEffects")) {
          i = 37;
        }
        break;
      case -809761226: 
        if (paramMethodCall.equals("getStreamMinVolume")) {
          i = 9;
        }
        break;
      case -1018676910: 
        if (paramMethodCall.equals("setBluetoothScoOn")) {
          i = 26;
        }
        break;
      case -1079290158: 
        if (paramMethodCall.equals("setAllowedCapturePolicy")) {
          i = 21;
        }
        break;
      case -1091382445: 
        if (paramMethodCall.equals("getMicrophones")) {
          i = 41;
        }
        break;
      case -1197068311: 
        if (paramMethodCall.equals("adjustStreamVolume")) {
          i = 4;
        }
        break;
      case -1285190630: 
        if (paramMethodCall.equals("isBluetoothScoOn")) {
          i = 27;
        }
        break;
      case -1296413680: 
        if (paramMethodCall.equals("setSpeakerphoneOn")) {
          i = 19;
        }
        break;
      case -1413157019: 
        if (paramMethodCall.equals("setMicrophoneMute")) {
          i = 28;
        }
        break;
      case -1504647535: 
        if (paramMethodCall.equals("requestAudioFocus")) {
          i = 0;
        }
        break;
      case -1524320654: 
        if (paramMethodCall.equals("isHapticPlaybackSupported")) {
          i = 42;
        }
        break;
      case -1562927400: 
        if (paramMethodCall.equals("isSpeakerphoneOn")) {
          i = 20;
        }
        break;
      case -1582239800: 
        if (paramMethodCall.equals("getStreamMaxVolume")) {
          i = 8;
        }
        break;
      case -1679670739: 
        if (paramMethodCall.equals("isMicrophoneMute")) {
          i = 29;
        }
        break;
      case -1698305881: 
        if (paramMethodCall.equals("getDevices")) {
          i = 40;
        }
        break;
      case -1758921066: 
        if (paramMethodCall.equals("getCommunicationDevice")) {
          i = 17;
        }
        break;
      }
      int k;
      switch (i)
      {
      default: 
        paramResult.notImplemented();
        break;
      case 42: 
        c.getClass();
        d(29);
        paramMethodCall = Boolean.valueOf(w.q());
        break;
      case 41: 
        paramMethodCall = a.e(c);
        break;
      case 40: 
        paramMethodCall = a.d(c, ((Integer)((List)localObject).get(0)).intValue());
        break;
      case 39: 
        paramMethodCall = c;
        localObject = (String)((List)localObject).get(0);
        paramMethodCall.getClass();
        d(17);
        paramMethodCall = f.getProperty((String)localObject);
        break;
      case 38: 
        cf.unloadSoundEffects();
        break;
      case 37: 
        cf.loadSoundEffects();
        break;
      case 36: 
        paramMethodCall = c;
        i = ((Integer)((List)localObject).get(0)).intValue();
        localObject = (Double)((List)localObject).get(1);
        if (localObject != null) {
          f.playSoundEffect(i, (float)((Double)localObject).doubleValue());
        } else {
          f.playSoundEffect(i);
        }
        break;
      case 35: 
        paramMethodCall = c;
        localObject = (String)((List)localObject).get(0);
        paramMethodCall = f.getParameters((String)localObject);
        break;
      case 34: 
        paramMethodCall = c;
        localObject = (String)((List)localObject).get(0);
        f.setParameters((String)localObject);
        break;
      case 33: 
        paramMethodCall = c;
        paramMethodCall.getClass();
        d(21);
        paramMethodCall = Integer.valueOf(f.generateAudioSessionId());
        break;
      case 32: 
        paramMethodCall = Boolean.valueOf(cf.isMusicActive());
        break;
      case 31: 
        paramMethodCall = Integer.valueOf(cf.getMode());
        break;
      case 30: 
        paramMethodCall = c;
        i = ((Integer)((List)localObject).get(0)).intValue();
        f.setMode(i);
        break;
      case 29: 
        paramMethodCall = Boolean.valueOf(cf.isMicrophoneMute());
        break;
      case 28: 
        paramMethodCall = c;
        bool2 = ((Boolean)((List)localObject).get(0)).booleanValue();
        f.setMicrophoneMute(bool2);
        break;
      case 27: 
        paramMethodCall = Boolean.valueOf(cf.isBluetoothScoOn());
        break;
      case 26: 
        paramMethodCall = c;
        bool2 = ((Boolean)((List)localObject).get(0)).booleanValue();
        f.setBluetoothScoOn(bool2);
        break;
      case 25: 
        cf.stopBluetoothSco();
        break;
      case 24: 
        cf.startBluetoothSco();
        break;
      case 23: 
        paramMethodCall = Boolean.valueOf(cf.isBluetoothScoAvailableOffCall());
        break;
      case 22: 
        paramMethodCall = c;
        paramMethodCall.getClass();
        d(29);
        paramMethodCall = Integer.valueOf(w.a(f));
        break;
      case 21: 
        paramMethodCall = c;
        i = ((Integer)((List)localObject).get(0)).intValue();
        paramMethodCall.getClass();
        d(29);
        u.j(f, i);
        break;
      case 20: 
        paramMethodCall = Boolean.valueOf(cf.isSpeakerphoneOn());
        break;
      case 19: 
        paramMethodCall = c;
        bool2 = ((Boolean)((List)localObject).get(0)).booleanValue();
        f.setSpeakerphoneOn(bool2);
        break;
      case 18: 
        paramMethodCall = c;
        paramMethodCall.getClass();
        d(31);
        i0.d(f);
        break;
      case 17: 
        paramMethodCall = c;
        paramMethodCall.getClass();
        d(31);
        paramMethodCall = a.f(i0.a(f));
        break;
      case 16: 
        paramMethodCall = c;
        Integer localInteger = (Integer)((List)localObject).get(0);
        paramMethodCall.getClass();
        d(31);
        localObject = h.iterator();
        AudioDeviceInfo localAudioDeviceInfo;
        do
        {
          bool2 = bool1;
          if (!((Iterator)localObject).hasNext()) {
            break;
          }
          localAudioDeviceInfo = (AudioDeviceInfo)((Iterator)localObject).next();
        } while (localAudioDeviceInfo.getId() != localInteger.intValue());
        bool2 = r.i(f, localAudioDeviceInfo);
        paramMethodCall = Boolean.valueOf(bool2);
        break;
      case 15: 
        localObject = c;
        localObject.getClass();
        d(31);
        h = h0.f(f);
        paramMethodCall = new java/util/ArrayList;
        paramMethodCall.<init>();
        localObject = h.iterator();
        while (((Iterator)localObject).hasNext()) {
          paramMethodCall.add(a.f((AudioDeviceInfo)((Iterator)localObject).next()));
        }
        paramResult.success(paramMethodCall);
        break;
      case 14: 
        paramMethodCall = c;
        i = ((Integer)((List)localObject).get(0)).intValue();
        paramMethodCall.getClass();
        d(23);
        paramMethodCall = Boolean.valueOf(f.isStreamMute(i));
        break;
      case 13: 
        paramMethodCall = c;
        k = ((Integer)((List)localObject).get(0)).intValue();
        i = ((Integer)((List)localObject).get(1)).intValue();
        j = ((Integer)((List)localObject).get(2)).intValue();
        f.setStreamVolume(k, i, j);
        break;
      case 12: 
        paramMethodCall = c;
        i = ((Integer)((List)localObject).get(0)).intValue();
        f.setRingerMode(i);
        break;
      case 11: 
        paramMethodCall = c;
        i = ((Integer)((List)localObject).get(0)).intValue();
        k = ((Integer)((List)localObject).get(1)).intValue();
        j = ((Integer)((List)localObject).get(2)).intValue();
        paramMethodCall.getClass();
        d(28);
        paramMethodCall = Float.valueOf(com.google.android.recaptcha.internal.a.a(f, i, k, j));
        break;
      case 10: 
        paramMethodCall = c;
        i = ((Integer)((List)localObject).get(0)).intValue();
        paramMethodCall = Integer.valueOf(f.getStreamVolume(i));
        break;
      case 9: 
        paramMethodCall = c;
        i = ((Integer)((List)localObject).get(0)).intValue();
        paramMethodCall.getClass();
        d(28);
        paramMethodCall = Integer.valueOf(com.google.android.recaptcha.internal.a.c(f, i));
        break;
      case 8: 
        paramMethodCall = c;
        i = ((Integer)((List)localObject).get(0)).intValue();
        paramMethodCall = Integer.valueOf(f.getStreamMaxVolume(i));
        break;
      case 7: 
        paramMethodCall = Integer.valueOf(cf.getRingerMode());
        break;
      case 6: 
        paramMethodCall = c;
        i = ((Integer)((List)localObject).get(0)).intValue();
        j = ((Integer)((List)localObject).get(1)).intValue();
        k = ((Integer)((List)localObject).get(2)).intValue();
        f.adjustSuggestedStreamVolume(i, j, k);
        break;
      case 5: 
        paramMethodCall = c;
        i = ((Integer)((List)localObject).get(0)).intValue();
        j = ((Integer)((List)localObject).get(1)).intValue();
        f.adjustVolume(i, j);
        break;
      case 4: 
        paramMethodCall = c;
        j = ((Integer)((List)localObject).get(0)).intValue();
        k = ((Integer)((List)localObject).get(1)).intValue();
        i = ((Integer)((List)localObject).get(2)).intValue();
        f.adjustStreamVolume(j, k, i);
        break;
      case 3: 
        paramMethodCall = c;
        paramMethodCall.getClass();
        d(21);
        paramMethodCall = Boolean.valueOf(f.isVolumeFixed());
        break;
      case 2: 
        a.c(c, (Map)((List)localObject).get(0));
        paramResult.success(null);
        break;
      }
      for (boolean bool2 = c.a();; bool2 = a.b(c, (List)localObject))
      {
        paramMethodCall = Boolean.valueOf(bool2);
        break;
      }
      paramResult.success(paramMethodCall);
    }
    catch (Exception paramMethodCall)
    {
      paramMethodCall.printStackTrace();
      Object localObject = new StringBuilder();
      ((StringBuilder)localObject).append("Error: ");
      ((StringBuilder)localObject).append(paramMethodCall);
      paramResult.error(((StringBuilder)localObject).toString(), null, null);
    }
  }
  
  public static final class a
  {
    public ArrayList a;
    public g1.a b;
    public c c;
    public d d;
    public Context e;
    public AudioManager f;
    public b g;
    public List<AudioDeviceInfo> h;
    
    public a(Context paramContext)
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
}

/* Location:
 * Qualified Name:     sa.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */