package io.flutter.plugin.platform;

import aa.u;
import aa.v;
import android.app.Activity;
import android.app.ActivityManager.TaskDescription;
import android.content.ClipData;
import android.content.ClipData.Item;
import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Build.VERSION;
import android.support.v4.media.session.b;
import android.view.View;
import android.view.View.OnSystemUiVisibilityChangeListener;
import android.view.Window;
import b.a0;
import b.w;
import b.y;
import e0.u0;
import e0.v0;
import e0.w0;
import io.flutter.Log;
import io.flutter.embedding.engine.systemchannels.PlatformChannel;
import io.flutter.embedding.engine.systemchannels.PlatformChannel.AppSwitcherDescription;
import io.flutter.embedding.engine.systemchannels.PlatformChannel.ClipboardContentFormat;
import io.flutter.embedding.engine.systemchannels.PlatformChannel.HapticFeedbackType;
import io.flutter.embedding.engine.systemchannels.PlatformChannel.PlatformMessageHandler;
import io.flutter.embedding.engine.systemchannels.PlatformChannel.SoundType;
import io.flutter.embedding.engine.systemchannels.PlatformChannel.SystemChromeStyle;
import io.flutter.embedding.engine.systemchannels.PlatformChannel.SystemUiMode;
import io.flutter.embedding.engine.systemchannels.PlatformChannel.SystemUiOverlay;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public class PlatformPlugin
{
  public static final int DEFAULT_SYSTEM_UI = 1280;
  private static final String TAG = "PlatformPlugin";
  private final Activity activity;
  private PlatformChannel.SystemChromeStyle currentTheme;
  private int mEnabledOverlays;
  public final PlatformChannel.PlatformMessageHandler mPlatformMessageHandler;
  private final PlatformChannel platformChannel;
  private final PlatformPluginDelegate platformPluginDelegate;
  
  public PlatformPlugin(Activity paramActivity, PlatformChannel paramPlatformChannel)
  {
    this(paramActivity, paramPlatformChannel, null);
  }
  
  public PlatformPlugin(Activity paramActivity, PlatformChannel paramPlatformChannel, PlatformPluginDelegate paramPlatformPluginDelegate)
  {
    PlatformChannel.PlatformMessageHandler local1 = new PlatformChannel.PlatformMessageHandler()
    {
      public boolean clipboardHasStrings()
      {
        return PlatformPlugin.access$1200(PlatformPlugin.this);
      }
      
      public CharSequence getClipboardData(PlatformChannel.ClipboardContentFormat paramAnonymousClipboardContentFormat)
      {
        return PlatformPlugin.access$1000(PlatformPlugin.this, paramAnonymousClipboardContentFormat);
      }
      
      public void playSystemSound(PlatformChannel.SoundType paramAnonymousSoundType)
      {
        PlatformPlugin.access$000(PlatformPlugin.this, paramAnonymousSoundType);
      }
      
      public void popSystemNavigator()
      {
        PlatformPlugin.access$900(PlatformPlugin.this);
      }
      
      public void restoreSystemUiOverlays()
      {
        PlatformPlugin.access$600(PlatformPlugin.this);
      }
      
      public void setApplicationSwitcherDescription(PlatformChannel.AppSwitcherDescription paramAnonymousAppSwitcherDescription)
      {
        PlatformPlugin.access$200(PlatformPlugin.this, paramAnonymousAppSwitcherDescription);
      }
      
      public void setClipboardData(String paramAnonymousString)
      {
        PlatformPlugin.access$1100(PlatformPlugin.this, paramAnonymousString);
      }
      
      public void setFrameworkHandlesBack(boolean paramAnonymousBoolean)
      {
        PlatformPlugin.access$800(PlatformPlugin.this, paramAnonymousBoolean);
      }
      
      public void setPreferredOrientations(int paramAnonymousInt)
      {
        PlatformPlugin.access$100(PlatformPlugin.this, paramAnonymousInt);
      }
      
      public void setSystemUiChangeListener()
      {
        PlatformPlugin.access$500(PlatformPlugin.this);
      }
      
      public void setSystemUiOverlayStyle(PlatformChannel.SystemChromeStyle paramAnonymousSystemChromeStyle)
      {
        PlatformPlugin.access$700(PlatformPlugin.this, paramAnonymousSystemChromeStyle);
      }
      
      public void share(String paramAnonymousString)
      {
        PlatformPlugin.access$1300(PlatformPlugin.this, paramAnonymousString);
      }
      
      public void showSystemOverlays(List<PlatformChannel.SystemUiOverlay> paramAnonymousList)
      {
        PlatformPlugin.access$300(PlatformPlugin.this, paramAnonymousList);
      }
      
      public void showSystemUiMode(PlatformChannel.SystemUiMode paramAnonymousSystemUiMode)
      {
        PlatformPlugin.access$400(PlatformPlugin.this, paramAnonymousSystemUiMode);
      }
      
      public void vibrateHapticFeedback(PlatformChannel.HapticFeedbackType paramAnonymousHapticFeedbackType)
      {
        PlatformPlugin.this.vibrateHapticFeedback(paramAnonymousHapticFeedbackType);
      }
    };
    mPlatformMessageHandler = local1;
    activity = paramActivity;
    platformChannel = paramPlatformChannel;
    paramPlatformChannel.setPlatformMessageHandler(local1);
    platformPluginDelegate = paramPlatformPluginDelegate;
    mEnabledOverlays = 1280;
  }
  
  private boolean clipboardHasStrings()
  {
    Object localObject = (ClipboardManager)activity.getSystemService("clipboard");
    if (!((ClipboardManager)localObject).hasPrimaryClip()) {
      return false;
    }
    localObject = ((ClipboardManager)localObject).getPrimaryClipDescription();
    if (localObject == null) {
      return false;
    }
    return ((ClipDescription)localObject).hasMimeType("text/*");
  }
  
  private CharSequence getClipboardData(PlatformChannel.ClipboardContentFormat paramClipboardContentFormat)
  {
    Object localObject1 = (ClipboardManager)activity.getSystemService("clipboard");
    boolean bool = ((ClipboardManager)localObject1).hasPrimaryClip();
    Object localObject2 = null;
    if (!bool) {
      return null;
    }
    try
    {
      localObject1 = ((ClipboardManager)localObject1).getPrimaryClip();
      if (localObject1 == null) {
        return null;
      }
      if ((paramClipboardContentFormat != null) && (paramClipboardContentFormat != PlatformChannel.ClipboardContentFormat.PLAIN_TEXT)) {
        return null;
      }
      Object localObject3 = ((ClipData)localObject1).getItemAt(0);
      localObject1 = ((ClipData.Item)localObject3).getText();
      paramClipboardContentFormat = (PlatformChannel.ClipboardContentFormat)localObject1;
      if (localObject1 == null)
      {
        paramClipboardContentFormat = (PlatformChannel.ClipboardContentFormat)localObject1;
        try
        {
          Uri localUri = ((ClipData.Item)localObject3).getUri();
          if (localUri == null)
          {
            paramClipboardContentFormat = (PlatformChannel.ClipboardContentFormat)localObject1;
            Log.w("PlatformPlugin", "Clipboard item contained no textual content nor a URI to retrieve it from.");
            return null;
          }
          paramClipboardContentFormat = (PlatformChannel.ClipboardContentFormat)localObject1;
          localObject2 = localUri.getScheme();
          paramClipboardContentFormat = (PlatformChannel.ClipboardContentFormat)localObject1;
          if (!((String)localObject2).equals("content"))
          {
            paramClipboardContentFormat = (PlatformChannel.ClipboardContentFormat)localObject1;
            localObject3 = new java/lang/StringBuilder;
            paramClipboardContentFormat = (PlatformChannel.ClipboardContentFormat)localObject1;
            ((StringBuilder)localObject3).<init>();
            paramClipboardContentFormat = (PlatformChannel.ClipboardContentFormat)localObject1;
            ((StringBuilder)localObject3).append("Clipboard item contains a Uri with scheme '");
            paramClipboardContentFormat = (PlatformChannel.ClipboardContentFormat)localObject1;
            ((StringBuilder)localObject3).append((String)localObject2);
            paramClipboardContentFormat = (PlatformChannel.ClipboardContentFormat)localObject1;
            ((StringBuilder)localObject3).append("'that is unhandled.");
            paramClipboardContentFormat = (PlatformChannel.ClipboardContentFormat)localObject1;
            Log.w("PlatformPlugin", ((StringBuilder)localObject3).toString());
            return null;
          }
          paramClipboardContentFormat = (PlatformChannel.ClipboardContentFormat)localObject1;
          localObject2 = activity.getContentResolver().openTypedAssetFileDescriptor(localUri, "text/*", null);
          paramClipboardContentFormat = (PlatformChannel.ClipboardContentFormat)localObject1;
          localObject1 = ((ClipData.Item)localObject3).coerceToText(activity);
          paramClipboardContentFormat = (PlatformChannel.ClipboardContentFormat)localObject1;
          if (localObject2 != null)
          {
            paramClipboardContentFormat = (PlatformChannel.ClipboardContentFormat)localObject1;
            ((AssetFileDescriptor)localObject2).close();
            paramClipboardContentFormat = (PlatformChannel.ClipboardContentFormat)localObject1;
          }
        }
        catch (IOException localIOException1)
        {
          break label237;
        }
      }
      return paramClipboardContentFormat;
    }
    catch (IOException localIOException2)
    {
      paramClipboardContentFormat = (PlatformChannel.ClipboardContentFormat)localObject2;
      Log.w("PlatformPlugin", "Failed to close AssetFileDescriptor while trying to read text from URI.", localIOException2);
      return paramClipboardContentFormat;
    }
    catch (FileNotFoundException paramClipboardContentFormat)
    {
      Log.w("PlatformPlugin", "Clipboard text was unable to be received from content URI.");
      return null;
    }
    catch (SecurityException paramClipboardContentFormat)
    {
      label237:
      Log.w("PlatformPlugin", "Attempted to get clipboard data that requires additional permission(s).\nSee the exception details for which permission(s) are required, and consider adding them to your Android Manifest as described in:\nhttps://developer.android.com/guide/topics/permissions/overview", paramClipboardContentFormat);
    }
    return null;
  }
  
  private void playSystemSound(PlatformChannel.SoundType paramSoundType)
  {
    if (paramSoundType == PlatformChannel.SoundType.CLICK) {
      activity.getWindow().getDecorView().playSoundEffect(0);
    }
  }
  
  private void popSystemNavigator()
  {
    Object localObject = platformPluginDelegate;
    if ((localObject != null) && (((PlatformPluginDelegate)localObject).popSystemNavigator())) {
      return;
    }
    localObject = activity;
    if ((localObject instanceof y)) {
      ((y)localObject).getOnBackPressedDispatcher().b();
    } else {
      ((Activity)localObject).finish();
    }
  }
  
  private void restoreSystemChromeSystemUIOverlays()
  {
    updateSystemUiOverlays();
  }
  
  private void setClipboardData(String paramString)
  {
    ((ClipboardManager)activity.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text label?", paramString));
  }
  
  private void setFrameworkHandlesBack(boolean paramBoolean)
  {
    PlatformPluginDelegate localPlatformPluginDelegate = platformPluginDelegate;
    if (localPlatformPluginDelegate != null) {
      localPlatformPluginDelegate.setFrameworkHandlesBack(paramBoolean);
    }
  }
  
  private void setSystemChromeApplicationSwitcherDescription(PlatformChannel.AppSwitcherDescription paramAppSwitcherDescription)
  {
    if (Build.VERSION.SDK_INT < 28)
    {
      activity.setTaskDescription(new ActivityManager.TaskDescription(label, null, color));
    }
    else
    {
      paramAppSwitcherDescription = new ActivityManager.TaskDescription(label, 0, color);
      activity.setTaskDescription(paramAppSwitcherDescription);
    }
  }
  
  private void setSystemChromeChangeListener()
  {
    final View localView = activity.getWindow().getDecorView();
    localView.setOnSystemUiVisibilityChangeListener(new View.OnSystemUiVisibilityChangeListener()
    {
      public void onSystemUiVisibilityChange(int paramAnonymousInt)
      {
        localView.post(new a(this, paramAnonymousInt));
      }
    });
  }
  
  private void setSystemChromeEnabledSystemUIMode(PlatformChannel.SystemUiMode paramSystemUiMode)
  {
    int i;
    if (paramSystemUiMode == PlatformChannel.SystemUiMode.LEAN_BACK)
    {
      i = 1798;
    }
    else if (paramSystemUiMode == PlatformChannel.SystemUiMode.IMMERSIVE)
    {
      i = 3846;
    }
    else if (paramSystemUiMode == PlatformChannel.SystemUiMode.IMMERSIVE_STICKY)
    {
      i = 5894;
    }
    else
    {
      if ((paramSystemUiMode != PlatformChannel.SystemUiMode.EDGE_TO_EDGE) || (Build.VERSION.SDK_INT < 29)) {
        return;
      }
      i = 1792;
    }
    mEnabledOverlays = i;
    updateSystemUiOverlays();
  }
  
  private void setSystemChromeEnabledSystemUIOverlays(List<PlatformChannel.SystemUiOverlay> paramList)
  {
    int i;
    if (paramList.size() == 0) {
      i = 5894;
    } else {
      i = 1798;
    }
    for (int j = 0; j < paramList.size(); j++)
    {
      PlatformChannel.SystemUiOverlay localSystemUiOverlay = (PlatformChannel.SystemUiOverlay)paramList.get(j);
      int k = 3.$SwitchMap$io$flutter$embedding$engine$systemchannels$PlatformChannel$SystemUiOverlay[localSystemUiOverlay.ordinal()];
      if (k != 1)
      {
        if (k == 2) {
          i = i & 0xFDFF & 0xFFFFFFFD;
        }
      }
      else {
        i &= 0xFFFFFFFB;
      }
    }
    mEnabledOverlays = i;
    updateSystemUiOverlays();
  }
  
  private void setSystemChromePreferredOrientations(int paramInt)
  {
    activity.setRequestedOrientation(paramInt);
  }
  
  private void setSystemChromeSystemUIOverlayStyle(PlatformChannel.SystemChromeStyle paramSystemChromeStyle)
  {
    Window localWindow = activity.getWindow();
    localWindow.getDecorView();
    int i = Build.VERSION.SDK_INT;
    if (i >= 30) {
      localObject1 = new w0(localWindow);
    } else if (i >= 26) {
      localObject1 = new v0(localWindow);
    } else {
      localObject1 = new u0(localWindow);
    }
    i = Build.VERSION.SDK_INT;
    if (i < 30)
    {
      localWindow.addFlags(Integer.MIN_VALUE);
      localWindow.clearFlags(201326592);
    }
    Object localObject2 = statusBarIconBrightness;
    int j;
    if (localObject2 != null)
    {
      j = 3.$SwitchMap$io$flutter$embedding$engine$systemchannels$PlatformChannel$Brightness[localObject2.ordinal()];
      if (j != 1)
      {
        if (j == 2) {
          ((a0)localObject1).J(false);
        }
      }
      else {
        ((a0)localObject1).J(true);
      }
    }
    localObject2 = statusBarColor;
    if (localObject2 != null) {
      localWindow.setStatusBarColor(((Integer)localObject2).intValue());
    }
    localObject2 = systemStatusBarContrastEnforced;
    if ((localObject2 != null) && (i >= 29)) {
      v.n(localWindow, ((Boolean)localObject2).booleanValue());
    }
    if (i >= 26)
    {
      localObject2 = systemNavigationBarIconBrightness;
      if (localObject2 != null)
      {
        j = 3.$SwitchMap$io$flutter$embedding$engine$systemchannels$PlatformChannel$Brightness[localObject2.ordinal()];
        if (j != 1)
        {
          if (j == 2) {
            ((a0)localObject1).I(false);
          }
        }
        else {
          ((a0)localObject1).I(true);
        }
      }
      localObject1 = systemNavigationBarColor;
      if (localObject1 != null) {
        localWindow.setNavigationBarColor(((Integer)localObject1).intValue());
      }
    }
    Object localObject1 = systemNavigationBarDividerColor;
    if ((localObject1 != null) && (i >= 28)) {
      b.k(localWindow, ((Integer)localObject1).intValue());
    }
    localObject1 = systemNavigationBarContrastEnforced;
    if ((localObject1 != null) && (i >= 29)) {
      u.n(localWindow, ((Boolean)localObject1).booleanValue());
    }
    currentTheme = paramSystemChromeStyle;
  }
  
  private void share(String paramString)
  {
    Intent localIntent = new Intent();
    localIntent.setAction("android.intent.action.SEND");
    localIntent.setType("text/plain");
    localIntent.putExtra("android.intent.extra.TEXT", paramString);
    activity.startActivity(Intent.createChooser(localIntent, null));
  }
  
  public void destroy()
  {
    platformChannel.setPlatformMessageHandler(null);
  }
  
  public void updateSystemUiOverlays()
  {
    activity.getWindow().getDecorView().setSystemUiVisibility(mEnabledOverlays);
    PlatformChannel.SystemChromeStyle localSystemChromeStyle = currentTheme;
    if (localSystemChromeStyle != null) {
      setSystemChromeSystemUIOverlayStyle(localSystemChromeStyle);
    }
  }
  
  public void vibrateHapticFeedback(PlatformChannel.HapticFeedbackType paramHapticFeedbackType)
  {
    View localView = activity.getWindow().getDecorView();
    int i = 3.$SwitchMap$io$flutter$embedding$engine$systemchannels$PlatformChannel$HapticFeedbackType[paramHapticFeedbackType.ordinal()];
    int j = 1;
    if (i != 1)
    {
      if (i != 2)
      {
        j = 3;
        if (i != 3)
        {
          j = 4;
          if (i != 4)
          {
            if (i != 5) {
              return;
            }
          }
          else
          {
            j = 6;
            break label77;
          }
        }
      }
      localView.performHapticFeedback(j);
      return;
    }
    else
    {
      j = 0;
    }
    label77:
    localView.performHapticFeedback(j);
  }
  
  public static abstract interface PlatformPluginDelegate
  {
    public abstract boolean popSystemNavigator();
    
    public abstract void setFrameworkHandlesBack(boolean paramBoolean);
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugin.platform.PlatformPlugin
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */