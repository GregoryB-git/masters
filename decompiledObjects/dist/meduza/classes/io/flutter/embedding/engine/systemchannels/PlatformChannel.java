package io.flutter.embedding.engine.systemchannels;

import f;
import g;
import io.flutter.Log;
import io.flutter.embedding.engine.dart.DartExecutor;
import io.flutter.plugin.common.JSONMethodCodec;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.MethodChannel.MethodCallHandler;
import io.flutter.plugin.common.MethodChannel.Result;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class PlatformChannel
{
  private static final String TAG = "PlatformChannel";
  public final MethodChannel channel;
  public final MethodChannel.MethodCallHandler parsingMethodCallHandler;
  private PlatformMessageHandler platformMessageHandler;
  
  public PlatformChannel(DartExecutor paramDartExecutor)
  {
    MethodChannel.MethodCallHandler local1 = new MethodChannel.MethodCallHandler()
    {
      public void onMethodCall(MethodCall paramAnonymousMethodCall, MethodChannel.Result paramAnonymousResult)
      {
        if (PlatformChannel.access$000(PlatformChannel.this) == null) {
          return;
        }
        Object localObject1 = method;
        Object localObject2 = arguments;
        paramAnonymousMethodCall = new StringBuilder();
        paramAnonymousMethodCall.append("Received '");
        paramAnonymousMethodCall.append((String)localObject1);
        paramAnonymousMethodCall.append("' message.");
        Log.v("PlatformChannel", paramAnonymousMethodCall.toString());
        int i = -1;
        try
        {
          boolean bool;
          switch (((String)localObject1).hashCode())
          {
          default: 
            break;
          case 2119655719: 
            if (((String)localObject1).equals("SystemChrome.setPreferredOrientations")) {
              i = 2;
            }
            break;
          case 1674312266: 
            if (((String)localObject1).equals("SystemChrome.setEnabledSystemUIOverlays")) {
              i = 4;
            }
            break;
          case 1514180520: 
            if (((String)localObject1).equals("Clipboard.getData")) {
              i = 11;
            }
            break;
          case 1390477857: 
            if (((String)localObject1).equals("SystemChrome.setSystemUIOverlayStyle")) {
              i = 8;
            }
            break;
          case 1128339786: 
            if (((String)localObject1).equals("SystemChrome.setEnabledSystemUIMode")) {
              i = 5;
            }
            break;
          case 875995648: 
            if (((String)localObject1).equals("Clipboard.hasStrings")) {
              i = 13;
            }
            break;
          case 241845679: 
            if (((String)localObject1).equals("SystemChrome.restoreSystemUIOverlays")) {
              i = 7;
            }
            break;
          case -215273374: 
            if (((String)localObject1).equals("SystemSound.play")) {
              i = 0;
            }
            break;
          case -247230243: 
            if (((String)localObject1).equals("HapticFeedback.vibrate")) {
              i = 1;
            }
            break;
          case -548468504: 
            if (((String)localObject1).equals("SystemChrome.setApplicationSwitcherDescription")) {
              i = 3;
            }
            break;
          case -577225884: 
            if (((String)localObject1).equals("SystemChrome.setSystemUIChangeListener")) {
              i = 6;
            }
            break;
          case -720677196: 
            if (((String)localObject1).equals("Clipboard.setData")) {
              i = 12;
            }
            break;
          case -766342101: 
            if (((String)localObject1).equals("SystemNavigator.pop")) {
              i = 10;
            }
            break;
          case -931781241: 
            if (((String)localObject1).equals("Share.invoke")) {
              i = 14;
            }
            break;
          case -1501580720: 
            bool = ((String)localObject1).equals("SystemNavigator.setFrameworkHandlesBack");
            if (bool) {
              i = 9;
            }
            break;
          }
          switch (i)
          {
          default: 
            paramAnonymousResult.notImplemented();
            break;
          case 14: 
            paramAnonymousMethodCall = (String)localObject2;
            PlatformChannel.access$000(PlatformChannel.this).share(paramAnonymousMethodCall);
            break;
          case 13: 
            bool = PlatformChannel.access$000(PlatformChannel.this).clipboardHasStrings();
            paramAnonymousMethodCall = new org/json/JSONObject;
            paramAnonymousMethodCall.<init>();
            paramAnonymousMethodCall.put("value", bool);
            paramAnonymousResult.success(paramAnonymousMethodCall);
            break;
          case 12: 
            paramAnonymousMethodCall = ((JSONObject)localObject2).getString("text");
            PlatformChannel.access$000(PlatformChannel.this).setClipboardData(paramAnonymousMethodCall);
            break;
          case 11: 
            localObject1 = (String)localObject2;
            if (localObject1 != null) {
              try
              {
                paramAnonymousMethodCall = PlatformChannel.ClipboardContentFormat.fromValue((String)localObject1);
              }
              catch (NoSuchFieldException paramAnonymousMethodCall)
              {
                paramAnonymousMethodCall = new java/lang/StringBuilder;
                paramAnonymousMethodCall.<init>();
                paramAnonymousMethodCall.append("No such clipboard content format: ");
                paramAnonymousMethodCall.append((String)localObject1);
                paramAnonymousResult.error("error", paramAnonymousMethodCall.toString(), null);
              }
            } else {
              paramAnonymousMethodCall = null;
            }
            paramAnonymousMethodCall = PlatformChannel.access$000(PlatformChannel.this).getClipboardData(paramAnonymousMethodCall);
            if (paramAnonymousMethodCall != null)
            {
              localObject1 = new org/json/JSONObject;
              ((JSONObject)localObject1).<init>();
              ((JSONObject)localObject1).put("text", paramAnonymousMethodCall);
              paramAnonymousResult.success(localObject1);
            }
            break;
          case 10: 
            PlatformChannel.access$000(PlatformChannel.this).popSystemNavigator();
            break;
          case 9: 
            bool = ((Boolean)localObject2).booleanValue();
            PlatformChannel.access$000(PlatformChannel.this).setFrameworkHandlesBack(bool);
            break;
          case 8: 
            try
            {
              paramAnonymousMethodCall = PlatformChannel.access$500(PlatformChannel.this, (JSONObject)localObject2);
              PlatformChannel.access$000(PlatformChannel.this).setSystemUiOverlayStyle(paramAnonymousMethodCall);
              paramAnonymousResult.success(null);
            }
            catch (NoSuchFieldException paramAnonymousMethodCall) {}catch (JSONException paramAnonymousMethodCall) {}
          }
          for (;;)
          {
            paramAnonymousMethodCall = paramAnonymousMethodCall.getMessage();
            break;
            PlatformChannel.access$000(PlatformChannel.this).restoreSystemUiOverlays();
            break label828;
            PlatformChannel.access$000(PlatformChannel.this).setSystemUiChangeListener();
            label828:
            paramAnonymousResult.success(null);
            return;
            try
            {
              paramAnonymousMethodCall = PlatformChannel.access$400(PlatformChannel.this, (String)localObject2);
              PlatformChannel.access$000(PlatformChannel.this).showSystemUiMode(paramAnonymousMethodCall);
              paramAnonymousResult.success(null);
            }
            catch (NoSuchFieldException paramAnonymousMethodCall)
            {
              continue;
            }
            catch (JSONException paramAnonymousMethodCall) {}
            continue;
            try
            {
              paramAnonymousMethodCall = PlatformChannel.access$300(PlatformChannel.this, (JSONArray)localObject2);
              PlatformChannel.access$000(PlatformChannel.this).showSystemOverlays(paramAnonymousMethodCall);
              paramAnonymousResult.success(null);
            }
            catch (NoSuchFieldException paramAnonymousMethodCall)
            {
              continue;
            }
            catch (JSONException paramAnonymousMethodCall) {}
            continue;
            try
            {
              paramAnonymousMethodCall = PlatformChannel.access$200(PlatformChannel.this, (JSONObject)localObject2);
              PlatformChannel.access$000(PlatformChannel.this).setApplicationSwitcherDescription(paramAnonymousMethodCall);
              paramAnonymousResult.success(null);
            }
            catch (JSONException paramAnonymousMethodCall) {}
            continue;
            try
            {
              i = PlatformChannel.access$100(PlatformChannel.this, (JSONArray)localObject2);
              PlatformChannel.access$000(PlatformChannel.this).setPreferredOrientations(i);
              paramAnonymousResult.success(null);
            }
            catch (NoSuchFieldException paramAnonymousMethodCall)
            {
              continue;
            }
            catch (JSONException paramAnonymousMethodCall) {}
            continue;
            try
            {
              paramAnonymousMethodCall = PlatformChannel.HapticFeedbackType.fromValue((String)localObject2);
              PlatformChannel.access$000(PlatformChannel.this).vibrateHapticFeedback(paramAnonymousMethodCall);
              paramAnonymousResult.success(null);
            }
            catch (NoSuchFieldException paramAnonymousMethodCall) {}
            continue;
            try
            {
              paramAnonymousMethodCall = PlatformChannel.SoundType.fromValue((String)localObject2);
              PlatformChannel.access$000(PlatformChannel.this).playSystemSound(paramAnonymousMethodCall);
              paramAnonymousResult.success(null);
            }
            catch (NoSuchFieldException paramAnonymousMethodCall) {}
          }
          paramAnonymousResult.error("error", paramAnonymousMethodCall, null);
        }
        catch (JSONException paramAnonymousMethodCall)
        {
          localObject1 = f.l("JSON error: ");
          ((StringBuilder)localObject1).append(paramAnonymousMethodCall.getMessage());
          paramAnonymousResult.error("error", ((StringBuilder)localObject1).toString(), null);
        }
      }
    };
    parsingMethodCallHandler = local1;
    paramDartExecutor = new MethodChannel(paramDartExecutor, "flutter/platform", JSONMethodCodec.INSTANCE);
    channel = paramDartExecutor;
    paramDartExecutor.setMethodCallHandler(local1);
  }
  
  private AppSwitcherDescription decodeAppSwitcherDescription(JSONObject paramJSONObject)
  {
    int i = paramJSONObject.getInt("primaryColor");
    int j = i;
    if (i != 0) {
      j = i | 0xFF000000;
    }
    return new AppSwitcherDescription(j, paramJSONObject.getString("label"));
  }
  
  private int decodeOrientations(JSONArray paramJSONArray)
  {
    int i = 0;
    int j = i;
    int m;
    for (int k = j; i < paramJSONArray.length(); k = m)
    {
      DeviceOrientation localDeviceOrientation = DeviceOrientation.fromValue(paramJSONArray.getString(i));
      m = 2.$SwitchMap$io$flutter$embedding$engine$systemchannels$PlatformChannel$DeviceOrientation[localDeviceOrientation.ordinal()];
      if (m != 1)
      {
        if (m != 2)
        {
          if (m != 3)
          {
            if (m == 4) {
              j |= 0x8;
            }
          }
          else {
            j |= 0x2;
          }
        }
        else {
          j |= 0x4;
        }
      }
      else {
        j |= 0x1;
      }
      m = k;
      if (k == 0) {
        m = j;
      }
      i++;
    }
    if (j != 0)
    {
      i = 9;
      switch (j)
      {
      default: 
        break;
      case 15: 
        return 13;
      case 11: 
        return 2;
      case 10: 
        return 11;
      case 8: 
        return 8;
      case 5: 
        i = 12;
      case 4: 
        return i;
      case 3: 
      case 6: 
      case 7: 
      case 9: 
      case 12: 
      case 13: 
      case 14: 
        if (k != 2)
        {
          if (k != 4)
          {
            if (k != 8) {
              return 1;
            }
            return 8;
          }
          return 9;
        }
        break;
      }
      return 0;
    }
    return -1;
  }
  
  private SystemChromeStyle decodeSystemChromeStyle(JSONObject paramJSONObject)
  {
    boolean bool = paramJSONObject.isNull("statusBarColor");
    Boolean localBoolean1 = null;
    Integer localInteger1;
    if (!bool) {
      localInteger1 = Integer.valueOf(paramJSONObject.getInt("statusBarColor"));
    } else {
      localInteger1 = null;
    }
    Brightness localBrightness1;
    if (!paramJSONObject.isNull("statusBarIconBrightness")) {
      localBrightness1 = Brightness.fromValue(paramJSONObject.getString("statusBarIconBrightness"));
    } else {
      localBrightness1 = null;
    }
    Boolean localBoolean2;
    if (!paramJSONObject.isNull("systemStatusBarContrastEnforced")) {
      localBoolean2 = Boolean.valueOf(paramJSONObject.getBoolean("systemStatusBarContrastEnforced"));
    } else {
      localBoolean2 = null;
    }
    Integer localInteger2;
    if (!paramJSONObject.isNull("systemNavigationBarColor")) {
      localInteger2 = Integer.valueOf(paramJSONObject.getInt("systemNavigationBarColor"));
    } else {
      localInteger2 = null;
    }
    Brightness localBrightness2;
    if (!paramJSONObject.isNull("systemNavigationBarIconBrightness")) {
      localBrightness2 = Brightness.fromValue(paramJSONObject.getString("systemNavigationBarIconBrightness"));
    } else {
      localBrightness2 = null;
    }
    Integer localInteger3;
    if (!paramJSONObject.isNull("systemNavigationBarDividerColor")) {
      localInteger3 = Integer.valueOf(paramJSONObject.getInt("systemNavigationBarDividerColor"));
    } else {
      localInteger3 = null;
    }
    if (!paramJSONObject.isNull("systemNavigationBarContrastEnforced")) {
      localBoolean1 = Boolean.valueOf(paramJSONObject.getBoolean("systemNavigationBarContrastEnforced"));
    }
    return new SystemChromeStyle(localInteger1, localBrightness1, localBoolean2, localInteger2, localBrightness2, localInteger3, localBoolean1);
  }
  
  private SystemUiMode decodeSystemUiMode(String paramString)
  {
    paramString = SystemUiMode.fromValue(paramString);
    int i = 2.$SwitchMap$io$flutter$embedding$engine$systemchannels$PlatformChannel$SystemUiMode[paramString.ordinal()];
    if (i != 1)
    {
      if (i != 2)
      {
        if (i != 3)
        {
          if (i != 4) {
            return SystemUiMode.EDGE_TO_EDGE;
          }
          return SystemUiMode.EDGE_TO_EDGE;
        }
        return SystemUiMode.IMMERSIVE_STICKY;
      }
      return SystemUiMode.IMMERSIVE;
    }
    return SystemUiMode.LEAN_BACK;
  }
  
  private List<SystemUiOverlay> decodeSystemUiOverlays(JSONArray paramJSONArray)
  {
    ArrayList localArrayList = new ArrayList();
    for (int i = 0; i < paramJSONArray.length(); i++)
    {
      SystemUiOverlay localSystemUiOverlay = SystemUiOverlay.fromValue(paramJSONArray.getString(i));
      int j = 2.$SwitchMap$io$flutter$embedding$engine$systemchannels$PlatformChannel$SystemUiOverlay[localSystemUiOverlay.ordinal()];
      if (j != 1)
      {
        if (j != 2) {
          continue;
        }
        localSystemUiOverlay = SystemUiOverlay.BOTTOM_OVERLAYS;
      }
      else
      {
        localSystemUiOverlay = SystemUiOverlay.TOP_OVERLAYS;
      }
      localArrayList.add(localSystemUiOverlay);
    }
    return localArrayList;
  }
  
  public void setPlatformMessageHandler(PlatformMessageHandler paramPlatformMessageHandler)
  {
    platformMessageHandler = paramPlatformMessageHandler;
  }
  
  public void systemChromeChanged(boolean paramBoolean)
  {
    Log.v("PlatformChannel", "Sending 'systemUIChange' message.");
    channel.invokeMethod("SystemChrome.systemUIChange", Arrays.asList(new Boolean[] { Boolean.valueOf(paramBoolean) }));
  }
  
  public static class AppSwitcherDescription
  {
    public final int color;
    public final String label;
    
    public AppSwitcherDescription(int paramInt, String paramString)
    {
      color = paramInt;
      label = paramString;
    }
  }
  
  public static enum Brightness
  {
    private String encodedName;
    
    static
    {
      DARK = new Brightness("DARK", 1, "Brightness.dark");
    }
    
    private Brightness(String paramString)
    {
      encodedName = paramString;
    }
    
    public static Brightness fromValue(String paramString)
    {
      for (Brightness localBrightness : ) {
        if (encodedName.equals(paramString)) {
          return localBrightness;
        }
      }
      throw new NoSuchFieldException(g.d("No such Brightness: ", paramString));
    }
  }
  
  public static enum ClipboardContentFormat
  {
    private String encodedName;
    
    private ClipboardContentFormat(String paramString)
    {
      encodedName = paramString;
    }
    
    public static ClipboardContentFormat fromValue(String paramString)
    {
      for (ClipboardContentFormat localClipboardContentFormat : ) {
        if (encodedName.equals(paramString)) {
          return localClipboardContentFormat;
        }
      }
      throw new NoSuchFieldException(g.d("No such ClipboardContentFormat: ", paramString));
    }
  }
  
  public static enum DeviceOrientation
  {
    private String encodedName;
    
    static
    {
      PORTRAIT_DOWN = new DeviceOrientation("PORTRAIT_DOWN", 1, "DeviceOrientation.portraitDown");
      LANDSCAPE_LEFT = new DeviceOrientation("LANDSCAPE_LEFT", 2, "DeviceOrientation.landscapeLeft");
      LANDSCAPE_RIGHT = new DeviceOrientation("LANDSCAPE_RIGHT", 3, "DeviceOrientation.landscapeRight");
    }
    
    private DeviceOrientation(String paramString)
    {
      encodedName = paramString;
    }
    
    public static DeviceOrientation fromValue(String paramString)
    {
      for (DeviceOrientation localDeviceOrientation : ) {
        if (encodedName.equals(paramString)) {
          return localDeviceOrientation;
        }
      }
      throw new NoSuchFieldException(g.d("No such DeviceOrientation: ", paramString));
    }
  }
  
  public static enum HapticFeedbackType
  {
    private final String encodedName;
    
    static
    {
      LIGHT_IMPACT = new HapticFeedbackType("LIGHT_IMPACT", 1, "HapticFeedbackType.lightImpact");
      MEDIUM_IMPACT = new HapticFeedbackType("MEDIUM_IMPACT", 2, "HapticFeedbackType.mediumImpact");
      HEAVY_IMPACT = new HapticFeedbackType("HEAVY_IMPACT", 3, "HapticFeedbackType.heavyImpact");
      SELECTION_CLICK = new HapticFeedbackType("SELECTION_CLICK", 4, "HapticFeedbackType.selectionClick");
    }
    
    private HapticFeedbackType(String paramString)
    {
      encodedName = paramString;
    }
    
    public static HapticFeedbackType fromValue(String paramString)
    {
      for (HapticFeedbackType localHapticFeedbackType : )
      {
        String str = encodedName;
        if (((str == null) && (paramString == null)) || ((str != null) && (str.equals(paramString)))) {
          return localHapticFeedbackType;
        }
      }
      throw new NoSuchFieldException(g.d("No such HapticFeedbackType: ", paramString));
    }
  }
  
  public static abstract interface PlatformMessageHandler
  {
    public abstract boolean clipboardHasStrings();
    
    public abstract CharSequence getClipboardData(PlatformChannel.ClipboardContentFormat paramClipboardContentFormat);
    
    public abstract void playSystemSound(PlatformChannel.SoundType paramSoundType);
    
    public abstract void popSystemNavigator();
    
    public abstract void restoreSystemUiOverlays();
    
    public abstract void setApplicationSwitcherDescription(PlatformChannel.AppSwitcherDescription paramAppSwitcherDescription);
    
    public abstract void setClipboardData(String paramString);
    
    public abstract void setFrameworkHandlesBack(boolean paramBoolean);
    
    public abstract void setPreferredOrientations(int paramInt);
    
    public abstract void setSystemUiChangeListener();
    
    public abstract void setSystemUiOverlayStyle(PlatformChannel.SystemChromeStyle paramSystemChromeStyle);
    
    public abstract void share(String paramString);
    
    public abstract void showSystemOverlays(List<PlatformChannel.SystemUiOverlay> paramList);
    
    public abstract void showSystemUiMode(PlatformChannel.SystemUiMode paramSystemUiMode);
    
    public abstract void vibrateHapticFeedback(PlatformChannel.HapticFeedbackType paramHapticFeedbackType);
  }
  
  public static enum SoundType
  {
    private final String encodedName;
    
    static
    {
      ALERT = new SoundType("ALERT", 1, "SystemSoundType.alert");
    }
    
    private SoundType(String paramString)
    {
      encodedName = paramString;
    }
    
    public static SoundType fromValue(String paramString)
    {
      for (SoundType localSoundType : ) {
        if (encodedName.equals(paramString)) {
          return localSoundType;
        }
      }
      throw new NoSuchFieldException(g.d("No such SoundType: ", paramString));
    }
  }
  
  public static class SystemChromeStyle
  {
    public final Integer statusBarColor;
    public final PlatformChannel.Brightness statusBarIconBrightness;
    public final Integer systemNavigationBarColor;
    public final Boolean systemNavigationBarContrastEnforced;
    public final Integer systemNavigationBarDividerColor;
    public final PlatformChannel.Brightness systemNavigationBarIconBrightness;
    public final Boolean systemStatusBarContrastEnforced;
    
    public SystemChromeStyle(Integer paramInteger1, PlatformChannel.Brightness paramBrightness1, Boolean paramBoolean1, Integer paramInteger2, PlatformChannel.Brightness paramBrightness2, Integer paramInteger3, Boolean paramBoolean2)
    {
      statusBarColor = paramInteger1;
      statusBarIconBrightness = paramBrightness1;
      systemStatusBarContrastEnforced = paramBoolean1;
      systemNavigationBarColor = paramInteger2;
      systemNavigationBarIconBrightness = paramBrightness2;
      systemNavigationBarDividerColor = paramInteger3;
      systemNavigationBarContrastEnforced = paramBoolean2;
    }
  }
  
  public static enum SystemUiMode
  {
    private String encodedName;
    
    static
    {
      IMMERSIVE = new SystemUiMode("IMMERSIVE", 1, "SystemUiMode.immersive");
      IMMERSIVE_STICKY = new SystemUiMode("IMMERSIVE_STICKY", 2, "SystemUiMode.immersiveSticky");
      EDGE_TO_EDGE = new SystemUiMode("EDGE_TO_EDGE", 3, "SystemUiMode.edgeToEdge");
    }
    
    private SystemUiMode(String paramString)
    {
      encodedName = paramString;
    }
    
    public static SystemUiMode fromValue(String paramString)
    {
      for (SystemUiMode localSystemUiMode : ) {
        if (encodedName.equals(paramString)) {
          return localSystemUiMode;
        }
      }
      throw new NoSuchFieldException(g.d("No such SystemUiMode: ", paramString));
    }
  }
  
  public static enum SystemUiOverlay
  {
    private String encodedName;
    
    static
    {
      BOTTOM_OVERLAYS = new SystemUiOverlay("BOTTOM_OVERLAYS", 1, "SystemUiOverlay.bottom");
    }
    
    private SystemUiOverlay(String paramString)
    {
      encodedName = paramString;
    }
    
    public static SystemUiOverlay fromValue(String paramString)
    {
      for (SystemUiOverlay localSystemUiOverlay : ) {
        if (encodedName.equals(paramString)) {
          return localSystemUiOverlay;
        }
      }
      throw new NoSuchFieldException(g.d("No such SystemUiOverlay: ", paramString));
    }
  }
}

/* Location:
 * Qualified Name:     io.flutter.embedding.engine.systemchannels.PlatformChannel
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */