package io.flutter.embedding.android;

import a4.r;
import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.ContentObserver;
import android.graphics.Insets;
import android.graphics.Rect;
import android.hardware.display.DisplayManager;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings.System;
import android.text.format.DateFormat;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.Display;
import android.view.DisplayCutout;
import android.view.KeyEvent;
import android.view.KeyEvent.DispatcherState;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.WindowInsets;
import android.view.WindowInsets.Type;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textservice.TextServicesManager;
import android.widget.FrameLayout;
import e0.i0;
import f;
import i2.b.a;
import i2.b.b;
import i2.i;
import i2.i.a;
import i2.k;
import io.flutter.Log;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.renderer.FlutterRenderer;
import io.flutter.embedding.engine.renderer.FlutterRenderer.DisplayFeature;
import io.flutter.embedding.engine.renderer.FlutterRenderer.DisplayFeatureState;
import io.flutter.embedding.engine.renderer.FlutterRenderer.DisplayFeatureType;
import io.flutter.embedding.engine.renderer.FlutterRenderer.ViewportMetrics;
import io.flutter.embedding.engine.renderer.FlutterUiDisplayListener;
import io.flutter.embedding.engine.renderer.RenderSurface;
import io.flutter.embedding.engine.systemchannels.SettingsChannel;
import io.flutter.embedding.engine.systemchannels.SettingsChannel.MessageBuilder;
import io.flutter.embedding.engine.systemchannels.SettingsChannel.PlatformBrightness;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.editing.ScribePlugin;
import io.flutter.plugin.editing.SpellCheckPlugin;
import io.flutter.plugin.editing.TextInputPlugin;
import io.flutter.plugin.localization.LocalizationPlugin;
import io.flutter.plugin.mouse.MouseCursorPlugin;
import io.flutter.plugin.mouse.MouseCursorPlugin.MouseCursorViewDelegate;
import io.flutter.plugin.platform.PlatformViewsController;
import io.flutter.util.ViewUtils;
import io.flutter.view.AccessibilityBridge;
import io.flutter.view.AccessibilityBridge.OnAccessibilityChangeListener;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;
import x0.l;

public class FlutterView
  extends FrameLayout
  implements MouseCursorPlugin.MouseCursorViewDelegate, KeyboardManager.ViewDelegate
{
  private static final String TAG = "FlutterView";
  private AccessibilityBridge accessibilityBridge;
  private AndroidTouchProcessor androidTouchProcessor;
  private FlutterViewDelegate delegate = new FlutterViewDelegate();
  private FlutterEngine flutterEngine;
  private final Set<FlutterEngineAttachmentListener> flutterEngineAttachmentListeners = new HashSet();
  private FlutterImageView flutterImageView;
  private FlutterSurfaceView flutterSurfaceView;
  private FlutterTextureView flutterTextureView;
  private final FlutterUiDisplayListener flutterUiDisplayListener = new FlutterUiDisplayListener()
  {
    public void onFlutterUiDisplayed()
    {
      FlutterView.access$202(FlutterView.this, true);
      Iterator localIterator = FlutterView.access$300(FlutterView.this).iterator();
      while (localIterator.hasNext()) {
        ((FlutterUiDisplayListener)localIterator.next()).onFlutterUiDisplayed();
      }
    }
    
    public void onFlutterUiNoLongerDisplayed()
    {
      FlutterView.access$202(FlutterView.this, false);
      Iterator localIterator = FlutterView.access$300(FlutterView.this).iterator();
      while (localIterator.hasNext()) {
        ((FlutterUiDisplayListener)localIterator.next()).onFlutterUiNoLongerDisplayed();
      }
    }
  };
  private final Set<FlutterUiDisplayListener> flutterUiDisplayListeners = new HashSet();
  private boolean isFlutterUiDisplayed;
  private KeyboardManager keyboardManager;
  private LocalizationPlugin localizationPlugin;
  private MouseCursorPlugin mouseCursorPlugin;
  private final AccessibilityBridge.OnAccessibilityChangeListener onAccessibilityChangeListener = new AccessibilityBridge.OnAccessibilityChangeListener()
  {
    public void onAccessibilityChanged(boolean paramAnonymousBoolean1, boolean paramAnonymousBoolean2)
    {
      FlutterView.access$000(FlutterView.this, paramAnonymousBoolean1, paramAnonymousBoolean2);
    }
  };
  private RenderSurface previousRenderSurface;
  public RenderSurface renderSurface;
  private ScribePlugin scribePlugin;
  private SpellCheckPlugin spellCheckPlugin;
  private final ContentObserver systemSettingsObserver = new ContentObserver(new Handler(Looper.getMainLooper()))
  {
    public boolean deliverSelfNotifications()
    {
      return true;
    }
    
    public void onChange(boolean paramAnonymousBoolean)
    {
      super.onChange(paramAnonymousBoolean);
      if (FlutterView.access$100(FlutterView.this) == null) {
        return;
      }
      Log.v("FlutterView", "System settings changed. Sending user settings to Flutter.");
      sendUserSettingsToFlutter();
    }
  };
  private TextInputPlugin textInputPlugin;
  private TextServicesManager textServicesManager;
  private final FlutterRenderer.ViewportMetrics viewportMetrics = new FlutterRenderer.ViewportMetrics();
  private d0.a<k> windowInfoListener;
  private WindowInfoRepositoryCallbackAdapterWrapper windowInfoRepo;
  
  public FlutterView(Context paramContext)
  {
    this(paramContext, null, new FlutterSurfaceView(paramContext));
  }
  
  public FlutterView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, new FlutterSurfaceView(paramContext));
  }
  
  private FlutterView(Context paramContext, AttributeSet paramAttributeSet, FlutterImageView paramFlutterImageView)
  {
    super(paramContext, paramAttributeSet);
    flutterImageView = paramFlutterImageView;
    renderSurface = paramFlutterImageView;
    init();
  }
  
  private FlutterView(Context paramContext, AttributeSet paramAttributeSet, FlutterSurfaceView paramFlutterSurfaceView)
  {
    super(paramContext, paramAttributeSet);
    flutterSurfaceView = paramFlutterSurfaceView;
    renderSurface = paramFlutterSurfaceView;
    init();
  }
  
  private FlutterView(Context paramContext, AttributeSet paramAttributeSet, FlutterTextureView paramFlutterTextureView)
  {
    super(paramContext, paramAttributeSet);
    flutterTextureView = paramFlutterTextureView;
    renderSurface = paramFlutterTextureView;
    init();
  }
  
  public FlutterView(Context paramContext, FlutterImageView paramFlutterImageView)
  {
    this(paramContext, null, paramFlutterImageView);
  }
  
  public FlutterView(Context paramContext, FlutterSurfaceView paramFlutterSurfaceView)
  {
    this(paramContext, null, paramFlutterSurfaceView);
  }
  
  public FlutterView(Context paramContext, FlutterTextureView paramFlutterTextureView)
  {
    this(paramContext, null, paramFlutterTextureView);
  }
  
  @Deprecated
  public FlutterView(Context paramContext, RenderMode paramRenderMode)
  {
    super(paramContext, null);
    if (paramRenderMode == RenderMode.surface)
    {
      paramContext = new FlutterSurfaceView(paramContext);
      flutterSurfaceView = paramContext;
    }
    for (;;)
    {
      renderSurface = paramContext;
      break;
      if (paramRenderMode != RenderMode.texture) {
        break label154;
      }
      paramContext = new FlutterTextureView(paramContext);
      flutterTextureView = paramContext;
    }
    init();
    return;
    label154:
    paramContext = new StringBuilder();
    paramContext.append("RenderMode not supported with this constructor: ");
    paramContext.append(paramRenderMode);
    throw new IllegalArgumentException(paramContext.toString());
  }
  
  @Deprecated
  public FlutterView(Context paramContext, RenderMode paramRenderMode, TransparencyMode paramTransparencyMode)
  {
    super(paramContext, null);
    if (paramRenderMode == RenderMode.surface)
    {
      boolean bool;
      if (paramTransparencyMode == TransparencyMode.transparent) {
        bool = true;
      } else {
        bool = false;
      }
      paramContext = new FlutterSurfaceView(paramContext, bool);
      flutterSurfaceView = paramContext;
    }
    else
    {
      if (paramRenderMode != RenderMode.texture) {
        break label169;
      }
      paramContext = new FlutterTextureView(paramContext);
      flutterTextureView = paramContext;
    }
    renderSurface = paramContext;
    init();
    return;
    label169:
    paramContext = new StringBuilder();
    paramContext.append("RenderMode not supported with this constructor: ");
    paramContext.append(paramRenderMode);
    throw new IllegalArgumentException(paramContext.toString());
  }
  
  @Deprecated
  public FlutterView(Context paramContext, TransparencyMode paramTransparencyMode)
  {
    this(paramContext, null, new FlutterSurfaceView(paramContext, bool));
  }
  
  private View findViewByAccessibilityIdRootedAtCurrentView(int paramInt, View paramView)
  {
    int i = 0;
    try
    {
      Object localObject = View.class.getDeclaredMethod("getAccessibilityViewId", new Class[0]);
      ((AccessibleObject)localObject).setAccessible(true);
      boolean bool = ((Method)localObject).invoke(paramView, new Object[0]).equals(Integer.valueOf(paramInt));
      if (bool) {
        return paramView;
      }
      if ((paramView instanceof ViewGroup)) {
        for (;;)
        {
          localObject = (ViewGroup)paramView;
          if (i >= ((ViewGroup)localObject).getChildCount()) {
            break;
          }
          localObject = findViewByAccessibilityIdRootedAtCurrentView(paramInt, ((ViewGroup)localObject).getChildAt(i));
          if (localObject != null) {
            return (View)localObject;
          }
          i++;
        }
      }
    }
    catch (NoSuchMethodException|IllegalAccessException|InvocationTargetException paramView)
    {
      for (;;) {}
    }
    return null;
  }
  
  private int guessBottomKeyboardInset(WindowInsets paramWindowInsets)
  {
    int i = getRootView().getHeight();
    if (paramWindowInsets.getSystemWindowInsetBottom() < i * 0.18D) {
      return 0;
    }
    return paramWindowInsets.getSystemWindowInsetBottom();
  }
  
  private void init()
  {
    Log.v("FlutterView", "Initializing FlutterView");
    Object localObject;
    if (flutterSurfaceView != null)
    {
      Log.v("FlutterView", "Internally using a FlutterSurfaceView.");
      localObject = flutterSurfaceView;
    }
    for (;;)
    {
      addView((View)localObject);
      break;
      if (flutterTextureView != null)
      {
        Log.v("FlutterView", "Internally using a FlutterTextureView.");
        localObject = flutterTextureView;
      }
      else
      {
        Log.v("FlutterView", "Internally using a FlutterImageView.");
        localObject = flutterImageView;
      }
    }
    setFocusable(true);
    setFocusableInTouchMode(true);
    if (Build.VERSION.SDK_INT >= 26) {
      setImportantForAutofill(1);
    }
  }
  
  private void releaseImageView()
  {
    FlutterImageView localFlutterImageView = flutterImageView;
    if (localFlutterImageView != null)
    {
      localFlutterImageView.closeImageReader();
      removeView(flutterImageView);
      flutterImageView = null;
    }
  }
  
  private void resetWillNotDraw(boolean paramBoolean1, boolean paramBoolean2)
  {
    boolean bool1 = flutterEngine.getRenderer().isSoftwareRenderingEnabled();
    boolean bool2 = false;
    boolean bool3 = bool2;
    if (!bool1)
    {
      bool3 = bool2;
      if (!paramBoolean1)
      {
        bool3 = bool2;
        if (!paramBoolean2) {
          bool3 = true;
        }
      }
    }
    setWillNotDraw(bool3);
  }
  
  private void sendViewportMetricsToFlutter()
  {
    if (!isAttachedToFlutterEngine())
    {
      Log.w("FlutterView", "Tried to send viewport metrics from Android to Flutter but this FlutterView was not attached to a FlutterEngine.");
      return;
    }
    viewportMetrics.devicePixelRatio = getResourcesgetDisplayMetricsdensity;
    viewportMetrics.physicalTouchSlop = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    flutterEngine.getRenderer().setViewportMetrics(viewportMetrics);
  }
  
  public boolean acquireLatestImageViewFrame()
  {
    FlutterImageView localFlutterImageView = flutterImageView;
    if (localFlutterImageView != null) {
      return localFlutterImageView.acquireLatestImage();
    }
    return false;
  }
  
  public void addFlutterEngineAttachmentListener(FlutterEngineAttachmentListener paramFlutterEngineAttachmentListener)
  {
    flutterEngineAttachmentListeners.add(paramFlutterEngineAttachmentListener);
  }
  
  public void addOnFirstFrameRenderedListener(FlutterUiDisplayListener paramFlutterUiDisplayListener)
  {
    flutterUiDisplayListeners.add(paramFlutterUiDisplayListener);
  }
  
  public void attachOverlaySurfaceToRender(FlutterImageView paramFlutterImageView)
  {
    FlutterEngine localFlutterEngine = flutterEngine;
    if (localFlutterEngine != null) {
      paramFlutterImageView.attachToRenderer(localFlutterEngine.getRenderer());
    }
  }
  
  public void attachToFlutterEngine(FlutterEngine paramFlutterEngine)
  {
    Object localObject1 = new StringBuilder();
    ((StringBuilder)localObject1).append("Attaching to a FlutterEngine: ");
    ((StringBuilder)localObject1).append(paramFlutterEngine);
    Log.v("FlutterView", ((StringBuilder)localObject1).toString());
    if (isAttachedToFlutterEngine())
    {
      if (paramFlutterEngine == flutterEngine)
      {
        Log.v("FlutterView", "Already attached to this engine. Doing nothing.");
        return;
      }
      Log.v("FlutterView", "Currently attached to a different engine. Detaching and then attaching to new engine.");
      detachFromFlutterEngine();
    }
    flutterEngine = paramFlutterEngine;
    localObject1 = paramFlutterEngine.getRenderer();
    isFlutterUiDisplayed = ((FlutterRenderer)localObject1).isDisplayingFlutterUi();
    renderSurface.attachToRenderer((FlutterRenderer)localObject1);
    ((FlutterRenderer)localObject1).addIsDisplayingFlutterUiListener(flutterUiDisplayListener);
    if (Build.VERSION.SDK_INT >= 24) {
      mouseCursorPlugin = new MouseCursorPlugin(this, flutterEngine.getMouseCursorChannel());
    }
    textInputPlugin = new TextInputPlugin(this, flutterEngine.getTextInputChannel(), flutterEngine.getScribeChannel(), flutterEngine.getPlatformViewsController());
    try
    {
      TextServicesManager localTextServicesManager = (TextServicesManager)getContext().getSystemService("textservices");
      textServicesManager = localTextServicesManager;
      localObject1 = new io/flutter/plugin/editing/SpellCheckPlugin;
      ((SpellCheckPlugin)localObject1).<init>(localTextServicesManager, flutterEngine.getSpellCheckChannel());
      spellCheckPlugin = ((SpellCheckPlugin)localObject1);
    }
    catch (Exception localException)
    {
      Log.e("FlutterView", "TextServicesManager not supported by device, spell check disabled.");
    }
    scribePlugin = new ScribePlugin(this, textInputPlugin.getInputMethodManager(), flutterEngine.getScribeChannel());
    localizationPlugin = flutterEngine.getLocalizationPlugin();
    keyboardManager = new KeyboardManager(this);
    androidTouchProcessor = new AndroidTouchProcessor(flutterEngine.getRenderer(), false);
    Object localObject2 = new AccessibilityBridge(this, paramFlutterEngine.getAccessibilityChannel(), (AccessibilityManager)getContext().getSystemService("accessibility"), getContext().getContentResolver(), flutterEngine.getPlatformViewsController());
    accessibilityBridge = ((AccessibilityBridge)localObject2);
    ((AccessibilityBridge)localObject2).setOnAccessibilityChangeListener(onAccessibilityChangeListener);
    resetWillNotDraw(accessibilityBridge.isAccessibilityEnabled(), accessibilityBridge.isTouchExplorationEnabled());
    flutterEngine.getPlatformViewsController().attachAccessibilityBridge(accessibilityBridge);
    flutterEngine.getPlatformViewsController().attachToFlutterRenderer(flutterEngine.getRenderer());
    textInputPlugin.getInputMethodManager().restartInput(this);
    sendUserSettingsToFlutter();
    getContext().getContentResolver().registerContentObserver(Settings.System.getUriFor("show_password"), false, systemSettingsObserver);
    sendViewportMetricsToFlutter();
    paramFlutterEngine.getPlatformViewsController().attachToView(this);
    localObject2 = flutterEngineAttachmentListeners.iterator();
    while (((Iterator)localObject2).hasNext()) {
      ((FlutterEngineAttachmentListener)((Iterator)localObject2).next()).onFlutterEngineAttachedToFlutterView(paramFlutterEngine);
    }
    if (isFlutterUiDisplayed) {
      flutterUiDisplayListener.onFlutterUiDisplayed();
    }
  }
  
  public void autofill(SparseArray<AutofillValue> paramSparseArray)
  {
    textInputPlugin.autofill(paramSparseArray);
  }
  
  public ZeroSides calculateShouldZeroSides()
  {
    Context localContext = getContext();
    if (getResourcesgetConfigurationorientation == 2)
    {
      int i = ((DisplayManager)localContext.getSystemService("display")).getDisplay(0).getRotation();
      if (i == 1) {
        return ZeroSides.RIGHT;
      }
      if (i == 3) {
        return ZeroSides.LEFT;
      }
      if ((i == 0) || (i == 2)) {
        return ZeroSides.BOTH;
      }
    }
    return ZeroSides.NONE;
  }
  
  public boolean checkInputConnectionProxy(View paramView)
  {
    FlutterEngine localFlutterEngine = flutterEngine;
    boolean bool;
    if (localFlutterEngine != null) {
      bool = localFlutterEngine.getPlatformViewsController().checkInputConnectionProxy(paramView);
    } else {
      bool = super.checkInputConnectionProxy(paramView);
    }
    return bool;
  }
  
  public void convertToImageView()
  {
    renderSurface.pause();
    FlutterImageView localFlutterImageView = flutterImageView;
    if (localFlutterImageView == null)
    {
      localFlutterImageView = createImageView();
      flutterImageView = localFlutterImageView;
      addView(localFlutterImageView);
    }
    else
    {
      localFlutterImageView.resizeIfNeeded(getWidth(), getHeight());
    }
    previousRenderSurface = renderSurface;
    localFlutterImageView = flutterImageView;
    renderSurface = localFlutterImageView;
    FlutterEngine localFlutterEngine = flutterEngine;
    if (localFlutterEngine != null) {
      localFlutterImageView.attachToRenderer(localFlutterEngine.getRenderer());
    }
  }
  
  public FlutterImageView createImageView()
  {
    return new FlutterImageView(getContext(), getWidth(), getHeight(), FlutterImageView.SurfaceKind.background);
  }
  
  public WindowInfoRepositoryCallbackAdapterWrapper createWindowInfoRepo()
  {
    try
    {
      Object localObject = new h2/a;
      i.a locala = i.a;
      Context localContext = getContext();
      locala.getClass();
      ((h2.a)localObject).<init>(i.a.a(localContext));
      localObject = new WindowInfoRepositoryCallbackAdapterWrapper((h2.a)localObject);
      return (WindowInfoRepositoryCallbackAdapterWrapper)localObject;
    }
    catch (NoClassDefFoundError localNoClassDefFoundError) {}
    return null;
  }
  
  public void detachFromFlutterEngine()
  {
    Object localObject = f.l("Detaching from a FlutterEngine: ");
    ((StringBuilder)localObject).append(flutterEngine);
    Log.v("FlutterView", ((StringBuilder)localObject).toString());
    if (!isAttachedToFlutterEngine())
    {
      Log.v("FlutterView", "FlutterView not attached to an engine. Not detaching.");
      return;
    }
    localObject = flutterEngineAttachmentListeners.iterator();
    while (((Iterator)localObject).hasNext()) {
      ((FlutterEngineAttachmentListener)((Iterator)localObject).next()).onFlutterEngineDetachedFromFlutterView();
    }
    getContext().getContentResolver().unregisterContentObserver(systemSettingsObserver);
    flutterEngine.getPlatformViewsController().detachFromView();
    flutterEngine.getPlatformViewsController().detachAccessibilityBridge();
    accessibilityBridge.release();
    accessibilityBridge = null;
    textInputPlugin.getInputMethodManager().restartInput(this);
    textInputPlugin.destroy();
    keyboardManager.destroy();
    localObject = spellCheckPlugin;
    if (localObject != null) {
      ((SpellCheckPlugin)localObject).destroy();
    }
    localObject = mouseCursorPlugin;
    if (localObject != null) {
      ((MouseCursorPlugin)localObject).destroy();
    }
    localObject = flutterEngine.getRenderer();
    isFlutterUiDisplayed = false;
    ((FlutterRenderer)localObject).removeIsDisplayingFlutterUiListener(flutterUiDisplayListener);
    ((FlutterRenderer)localObject).stopRenderingToSurface();
    ((FlutterRenderer)localObject).setSemanticsEnabled(false);
    localObject = previousRenderSurface;
    if ((localObject != null) && (renderSurface == flutterImageView)) {
      renderSurface = ((RenderSurface)localObject);
    }
    renderSurface.detachFromRenderer();
    releaseImageView();
    previousRenderSurface = null;
    flutterEngine = null;
  }
  
  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    int i = paramKeyEvent.getAction();
    boolean bool1 = true;
    if ((i == 0) && (paramKeyEvent.getRepeatCount() == 0)) {
      getKeyDispatcherState().startTracking(paramKeyEvent, this);
    } else if (paramKeyEvent.getAction() == 1) {
      getKeyDispatcherState().handleUpEvent(paramKeyEvent);
    }
    boolean bool2;
    if (isAttachedToFlutterEngine())
    {
      bool2 = bool1;
      if (keyboardManager.handleEvent(paramKeyEvent)) {}
    }
    else if (super.dispatchKeyEvent(paramKeyEvent))
    {
      bool2 = bool1;
    }
    else
    {
      bool2 = false;
    }
    return bool2;
  }
  
  public View findViewByAccessibilityIdTraversal(int paramInt)
  {
    if (Build.VERSION.SDK_INT < 29) {
      return findViewByAccessibilityIdRootedAtCurrentView(paramInt, this);
    }
    try
    {
      Object localObject = View.class.getDeclaredMethod("findViewByAccessibilityIdTraversal", new Class[] { Integer.TYPE });
      ((AccessibleObject)localObject).setAccessible(true);
      localObject = (View)((Method)localObject).invoke(this, new Object[] { Integer.valueOf(paramInt) });
      return (View)localObject;
    }
    catch (NoSuchMethodException|IllegalAccessException|InvocationTargetException localNoSuchMethodException) {}
    return null;
  }
  
  public AccessibilityNodeProvider getAccessibilityNodeProvider()
  {
    AccessibilityBridge localAccessibilityBridge = accessibilityBridge;
    if ((localAccessibilityBridge != null) && (localAccessibilityBridge.isAccessibilityEnabled())) {
      return accessibilityBridge;
    }
    return null;
  }
  
  public FlutterEngine getAttachedFlutterEngine()
  {
    return flutterEngine;
  }
  
  public BinaryMessenger getBinaryMessenger()
  {
    return flutterEngine.getDartExecutor();
  }
  
  public FlutterImageView getCurrentImageSurface()
  {
    return flutterImageView;
  }
  
  public PointerIcon getSystemPointerIcon(int paramInt)
  {
    return PointerIcon.getSystemIcon(getContext(), paramInt);
  }
  
  public FlutterRenderer.ViewportMetrics getViewportMetrics()
  {
    return viewportMetrics;
  }
  
  public boolean hasRenderedFirstFrame()
  {
    return isFlutterUiDisplayed;
  }
  
  public boolean isAttachedToFlutterEngine()
  {
    FlutterEngine localFlutterEngine = flutterEngine;
    boolean bool;
    if ((localFlutterEngine != null) && (localFlutterEngine.getRenderer() == renderSurface.getAttachedRenderer())) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final WindowInsets onApplyWindowInsets(WindowInsets paramWindowInsets)
  {
    WindowInsets localWindowInsets = super.onApplyWindowInsets(paramWindowInsets);
    int i = Build.VERSION.SDK_INT;
    Object localObject2;
    if (i == 29)
    {
      localObject1 = paramWindowInsets.getSystemGestureInsets();
      localObject2 = viewportMetrics;
      systemGestureInsetTop = top;
      systemGestureInsetRight = right;
      systemGestureInsetBottom = bottom;
      systemGestureInsetLeft = left;
    }
    int j = getWindowSystemUiVisibility();
    int k = 1;
    if ((j & 0x4) == 0) {
      j = 1;
    } else {
      j = 0;
    }
    if ((getWindowSystemUiVisibility() & 0x2) != 0) {
      k = 0;
    }
    Object localObject3;
    if (i >= 30)
    {
      localObject1 = paramWindowInsets.getInsets(WindowInsets.Type.systemBars());
      localObject2 = viewportMetrics;
      viewPaddingTop = top;
      viewPaddingRight = right;
      viewPaddingBottom = bottom;
      viewPaddingLeft = left;
      localObject1 = paramWindowInsets.getInsets(WindowInsets.Type.ime());
      localObject2 = viewportMetrics;
      viewInsetTop = top;
      viewInsetRight = right;
      viewInsetBottom = bottom;
      viewInsetLeft = left;
      localObject1 = paramWindowInsets.getInsets(WindowInsets.Type.systemGestures());
      localObject2 = viewportMetrics;
      systemGestureInsetTop = top;
      systemGestureInsetRight = right;
      systemGestureInsetBottom = bottom;
      systemGestureInsetLeft = left;
      localObject2 = paramWindowInsets.getDisplayCutout();
      if (localObject2 != null)
      {
        localObject1 = ((DisplayCutout)localObject2).getWaterfallInsets();
        localObject3 = viewportMetrics;
        viewPaddingTop = Math.max(Math.max(viewPaddingTop, top), ((DisplayCutout)localObject2).getSafeInsetTop());
        localObject3 = viewportMetrics;
        viewPaddingRight = Math.max(Math.max(viewPaddingRight, right), ((DisplayCutout)localObject2).getSafeInsetRight());
        localObject3 = viewportMetrics;
        viewPaddingBottom = Math.max(Math.max(viewPaddingBottom, bottom), ((DisplayCutout)localObject2).getSafeInsetBottom());
        localObject3 = viewportMetrics;
        viewPaddingLeft = Math.max(Math.max(viewPaddingLeft, left), ((DisplayCutout)localObject2).getSafeInsetLeft());
      }
    }
    else
    {
      localObject1 = ZeroSides.NONE;
      if (k == 0) {
        localObject1 = calculateShouldZeroSides();
      }
      localObject2 = viewportMetrics;
      if (j != 0) {
        j = paramWindowInsets.getSystemWindowInsetTop();
      } else {
        j = 0;
      }
      viewPaddingTop = j;
      localObject2 = viewportMetrics;
      if ((localObject1 != ZeroSides.RIGHT) && (localObject1 != ZeroSides.BOTH)) {
        j = paramWindowInsets.getSystemWindowInsetRight();
      } else {
        j = 0;
      }
      viewPaddingRight = j;
      localObject2 = viewportMetrics;
      if ((k != 0) && (guessBottomKeyboardInset(paramWindowInsets) == 0)) {
        k = paramWindowInsets.getSystemWindowInsetBottom();
      } else {
        k = 0;
      }
      viewPaddingBottom = k;
      localObject2 = viewportMetrics;
      if ((localObject1 != ZeroSides.LEFT) && (localObject1 != ZeroSides.BOTH)) {
        k = paramWindowInsets.getSystemWindowInsetLeft();
      } else {
        k = 0;
      }
      viewPaddingLeft = k;
      localObject1 = viewportMetrics;
      viewInsetTop = 0;
      viewInsetRight = 0;
      viewInsetBottom = guessBottomKeyboardInset(paramWindowInsets);
      viewportMetrics.viewInsetLeft = 0;
    }
    Object localObject1 = new ArrayList();
    if (i >= 28)
    {
      paramWindowInsets = paramWindowInsets.getDisplayCutout();
      if (paramWindowInsets != null)
      {
        localObject3 = paramWindowInsets.getBoundingRects().iterator();
        while (((Iterator)localObject3).hasNext())
        {
          localObject2 = (Rect)((Iterator)localObject3).next();
          paramWindowInsets = f.l("DisplayCutout area reported with bounds = ");
          paramWindowInsets.append(((Rect)localObject2).toString());
          Log.v("FlutterView", paramWindowInsets.toString());
          ((ArrayList)localObject1).add(new FlutterRenderer.DisplayFeature((Rect)localObject2, FlutterRenderer.DisplayFeatureType.CUTOUT, FlutterRenderer.DisplayFeatureState.UNKNOWN));
        }
      }
    }
    viewportMetrics.setDisplayCutouts((List)localObject1);
    if (Build.VERSION.SDK_INT >= 35) {
      delegate.growViewportMetricsToCaptionBar(getContext(), viewportMetrics);
    }
    paramWindowInsets = f.l("Updating window insets (onApplyWindowInsets()):\nStatus bar insets: Top: ");
    paramWindowInsets.append(viewportMetrics.viewPaddingTop);
    paramWindowInsets.append(", Left: ");
    paramWindowInsets.append(viewportMetrics.viewPaddingLeft);
    paramWindowInsets.append(", Right: ");
    paramWindowInsets.append(viewportMetrics.viewPaddingRight);
    paramWindowInsets.append("\nKeyboard insets: Bottom: ");
    paramWindowInsets.append(viewportMetrics.viewInsetBottom);
    paramWindowInsets.append(", Left: ");
    paramWindowInsets.append(viewportMetrics.viewInsetLeft);
    paramWindowInsets.append(", Right: ");
    paramWindowInsets.append(viewportMetrics.viewInsetRight);
    paramWindowInsets.append("System Gesture Insets - Left: ");
    paramWindowInsets.append(viewportMetrics.systemGestureInsetLeft);
    paramWindowInsets.append(", Top: ");
    paramWindowInsets.append(viewportMetrics.systemGestureInsetTop);
    paramWindowInsets.append(", Right: ");
    paramWindowInsets.append(viewportMetrics.systemGestureInsetRight);
    paramWindowInsets.append(", Bottom: ");
    paramWindowInsets.append(viewportMetrics.viewInsetBottom);
    Log.v("FlutterView", paramWindowInsets.toString());
    sendViewportMetricsToFlutter();
    return localWindowInsets;
  }
  
  public void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    windowInfoRepo = createWindowInfoRepo();
    Activity localActivity = ViewUtils.getActivity(getContext());
    WindowInfoRepositoryCallbackAdapterWrapper localWindowInfoRepositoryCallbackAdapterWrapper = windowInfoRepo;
    if ((localWindowInfoRepositoryCallbackAdapterWrapper != null) && (localActivity != null))
    {
      windowInfoListener = new l(this, 2);
      localWindowInfoRepositoryCallbackAdapterWrapper.addWindowLayoutInfoListener(localActivity, v.a.getMainExecutor(getContext()), windowInfoListener);
    }
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
    if (flutterEngine != null)
    {
      Log.v("FlutterView", "Configuration changed. Sending locales and user settings to Flutter.");
      localizationPlugin.sendLocalesToFlutter(paramConfiguration);
      sendUserSettingsToFlutter();
      ViewUtils.calculateMaximumDisplayMetrics(getContext(), flutterEngine);
    }
  }
  
  public InputConnection onCreateInputConnection(EditorInfo paramEditorInfo)
  {
    if (!isAttachedToFlutterEngine()) {
      return super.onCreateInputConnection(paramEditorInfo);
    }
    return textInputPlugin.createInputConnection(this, keyboardManager, paramEditorInfo);
  }
  
  public void onDetachedFromWindow()
  {
    WindowInfoRepositoryCallbackAdapterWrapper localWindowInfoRepositoryCallbackAdapterWrapper = windowInfoRepo;
    if (localWindowInfoRepositoryCallbackAdapterWrapper != null)
    {
      d0.a locala = windowInfoListener;
      if (locala != null) {
        localWindowInfoRepositoryCallbackAdapterWrapper.removeWindowLayoutInfoListener(locala);
      }
    }
    windowInfoListener = null;
    windowInfoRepo = null;
    super.onDetachedFromWindow();
  }
  
  public boolean onGenericMotionEvent(MotionEvent paramMotionEvent)
  {
    boolean bool1 = isAttachedToFlutterEngine();
    boolean bool2 = true;
    int i;
    if ((bool1) && (androidTouchProcessor.onGenericMotionEvent(paramMotionEvent, getContext()))) {
      i = 1;
    } else {
      i = 0;
    }
    if (i == 0) {
      bool2 = super.onGenericMotionEvent(paramMotionEvent);
    }
    return bool2;
  }
  
  public boolean onHoverEvent(MotionEvent paramMotionEvent)
  {
    if (!isAttachedToFlutterEngine()) {
      return super.onHoverEvent(paramMotionEvent);
    }
    return accessibilityBridge.onAccessibilityHoverEvent(paramMotionEvent);
  }
  
  public void onProvideAutofillVirtualStructure(ViewStructure paramViewStructure, int paramInt)
  {
    super.onProvideAutofillVirtualStructure(paramViewStructure, paramInt);
    textInputPlugin.onProvideAutofillVirtualStructure(paramViewStructure, paramInt);
  }
  
  public void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append("Size changed. Sending Flutter new viewport metrics. FlutterView was ");
    ((StringBuilder)localObject).append(paramInt3);
    ((StringBuilder)localObject).append(" x ");
    ((StringBuilder)localObject).append(paramInt4);
    ((StringBuilder)localObject).append(", it is now ");
    ((StringBuilder)localObject).append(paramInt1);
    ((StringBuilder)localObject).append(" x ");
    ((StringBuilder)localObject).append(paramInt2);
    Log.v("FlutterView", ((StringBuilder)localObject).toString());
    localObject = viewportMetrics;
    width = paramInt1;
    height = paramInt2;
    sendViewportMetricsToFlutter();
  }
  
  public boolean onTextInputKeyEvent(KeyEvent paramKeyEvent)
  {
    return textInputPlugin.handleKeyEvent(paramKeyEvent);
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    if (!isAttachedToFlutterEngine()) {
      return super.onTouchEvent(paramMotionEvent);
    }
    requestUnbufferedDispatch(paramMotionEvent);
    return androidTouchProcessor.onTouchEvent(paramMotionEvent);
  }
  
  public void redispatch(KeyEvent paramKeyEvent)
  {
    getRootView().dispatchKeyEvent(paramKeyEvent);
  }
  
  public void removeFlutterEngineAttachmentListener(FlutterEngineAttachmentListener paramFlutterEngineAttachmentListener)
  {
    flutterEngineAttachmentListeners.remove(paramFlutterEngineAttachmentListener);
  }
  
  public void removeOnFirstFrameRenderedListener(FlutterUiDisplayListener paramFlutterUiDisplayListener)
  {
    flutterUiDisplayListeners.remove(paramFlutterUiDisplayListener);
  }
  
  public void revertImageView(final Runnable paramRunnable)
  {
    if (flutterImageView == null)
    {
      Log.v("FlutterView", "Tried to revert the image view, but no image view is used.");
      return;
    }
    final Object localObject = previousRenderSurface;
    if (localObject == null)
    {
      Log.v("FlutterView", "Tried to revert the image view, but no previous surface was used.");
      return;
    }
    renderSurface = ((RenderSurface)localObject);
    previousRenderSurface = null;
    localObject = flutterEngine.getRenderer();
    if ((flutterEngine != null) && (localObject != null))
    {
      renderSurface.resume();
      ((FlutterRenderer)localObject).addIsDisplayingFlutterUiListener(new FlutterUiDisplayListener()
      {
        public void onFlutterUiDisplayed()
        {
          localObject.removeIsDisplayingFlutterUiListener(this);
          paramRunnable.run();
          FlutterView localFlutterView = this$0;
          if ((!(renderSurface instanceof FlutterImageView)) && (FlutterView.access$400(localFlutterView) != null))
          {
            FlutterView.access$400(this$0).detachFromRenderer();
            FlutterView.access$500(this$0);
          }
        }
        
        public void onFlutterUiNoLongerDisplayed() {}
      });
      return;
    }
    flutterImageView.detachFromRenderer();
    releaseImageView();
    paramRunnable.run();
  }
  
  public void sendUserSettingsToFlutter()
  {
    int i = getResourcesgetConfigurationuiMode;
    boolean bool1 = false;
    if ((i & 0x30) == 32) {
      i = 1;
    } else {
      i = 0;
    }
    SettingsChannel.PlatformBrightness localPlatformBrightness;
    if (i != 0) {
      localPlatformBrightness = SettingsChannel.PlatformBrightness.dark;
    } else {
      localPlatformBrightness = SettingsChannel.PlatformBrightness.light;
    }
    Object localObject = textServicesManager;
    if (localObject != null) {
      if (Build.VERSION.SDK_INT >= 31)
      {
        bool2 = r.c((TextServicesManager)localObject).stream().anyMatch(new b());
        if ((!i0.h(textServicesManager)) || (!bool2)) {}
      }
      else
      {
        bool2 = true;
        break label111;
      }
    }
    boolean bool2 = false;
    label111:
    localObject = flutterEngine.getSettingsChannel().startMessage().setTextScaleFactor(getResourcesgetConfigurationfontScale).setDisplayMetrics(getResources().getDisplayMetrics()).setNativeSpellCheckServiceDefined(bool2);
    bool2 = bool1;
    if (Settings.System.getInt(getContext().getContentResolver(), "show_password", 1) == 1) {
      bool2 = true;
    }
    ((SettingsChannel.MessageBuilder)localObject).setBrieflyShowPassword(bool2).setUse24HourFormat(DateFormat.is24HourFormat(getContext())).setPlatformBrightness(localPlatformBrightness).send();
  }
  
  public void setDelegate(FlutterViewDelegate paramFlutterViewDelegate)
  {
    delegate = paramFlutterViewDelegate;
  }
  
  public void setVisibility(int paramInt)
  {
    super.setVisibility(paramInt);
    RenderSurface localRenderSurface = renderSurface;
    if ((localRenderSurface instanceof FlutterSurfaceView)) {
      ((FlutterSurfaceView)localRenderSurface).setVisibility(paramInt);
    }
  }
  
  public void setWindowInfoListenerDisplayFeatures(k paramk)
  {
    paramk = a;
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = paramk.iterator();
    while (localIterator.hasNext())
    {
      i2.a locala = (i2.a)localIterator.next();
      paramk = f.l("WindowInfoTracker Display Feature reported with bounds = ");
      paramk.append(locala.getBounds().toString());
      paramk.append(" and type = ");
      paramk.append(locala.getClass().getSimpleName());
      Log.v("FlutterView", paramk.toString());
      if ((locala instanceof i2.b))
      {
        paramk = (i2.b)locala;
        FlutterRenderer.DisplayFeatureType localDisplayFeatureType;
        if (paramk.a() == b.a.c) {
          localDisplayFeatureType = FlutterRenderer.DisplayFeatureType.HINGE;
        } else {
          localDisplayFeatureType = FlutterRenderer.DisplayFeatureType.FOLD;
        }
        if (paramk.e() == b.b.b) {
          paramk = FlutterRenderer.DisplayFeatureState.POSTURE_FLAT;
        } else if (paramk.e() == b.b.c) {
          paramk = FlutterRenderer.DisplayFeatureState.POSTURE_HALF_OPENED;
        } else {
          paramk = FlutterRenderer.DisplayFeatureState.UNKNOWN;
        }
        localArrayList.add(new FlutterRenderer.DisplayFeature(locala.getBounds(), localDisplayFeatureType, paramk));
      }
      else
      {
        localArrayList.add(new FlutterRenderer.DisplayFeature(locala.getBounds(), FlutterRenderer.DisplayFeatureType.UNKNOWN, FlutterRenderer.DisplayFeatureState.UNKNOWN));
      }
    }
    viewportMetrics.setDisplayFeatures(localArrayList);
    sendViewportMetricsToFlutter();
  }
  
  public static abstract interface FlutterEngineAttachmentListener
  {
    public abstract void onFlutterEngineAttachedToFlutterView(FlutterEngine paramFlutterEngine);
    
    public abstract void onFlutterEngineDetachedFromFlutterView();
  }
  
  public static enum ZeroSides
  {
    static
    {
      LEFT = new ZeroSides("LEFT", 1);
      RIGHT = new ZeroSides("RIGHT", 2);
      BOTH = new ZeroSides("BOTH", 3);
    }
    
    private ZeroSides() {}
  }
}

/* Location:
 * Qualified Name:     io.flutter.embedding.android.FlutterView
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */