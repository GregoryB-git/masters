package io.flutter.plugin.platform;

import a0.j;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.MotionEvent.PointerCoords;
import android.view.MotionEvent.PointerProperties;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout.LayoutParams;
import b.k;
import io.flutter.Log;
import io.flutter.embedding.android.AndroidTouchProcessor;
import io.flutter.embedding.android.FlutterImageView;
import io.flutter.embedding.android.FlutterView;
import io.flutter.embedding.android.MotionEventTracker;
import io.flutter.embedding.android.MotionEventTracker.MotionEventId;
import io.flutter.embedding.engine.FlutterOverlaySurface;
import io.flutter.embedding.engine.dart.DartExecutor;
import io.flutter.embedding.engine.mutatorsstack.FlutterMutatorView;
import io.flutter.embedding.engine.mutatorsstack.FlutterMutatorsStack;
import io.flutter.embedding.engine.renderer.FlutterRenderer;
import io.flutter.embedding.engine.systemchannels.PlatformViewsChannel;
import io.flutter.embedding.engine.systemchannels.PlatformViewsChannel.PlatformViewBufferResized;
import io.flutter.embedding.engine.systemchannels.PlatformViewsChannel.PlatformViewBufferSize;
import io.flutter.embedding.engine.systemchannels.PlatformViewsChannel.PlatformViewCreationRequest;
import io.flutter.embedding.engine.systemchannels.PlatformViewsChannel.PlatformViewCreationRequest.RequestedDisplayMode;
import io.flutter.embedding.engine.systemchannels.PlatformViewsChannel.PlatformViewResizeRequest;
import io.flutter.embedding.engine.systemchannels.PlatformViewsChannel.PlatformViewTouch;
import io.flutter.embedding.engine.systemchannels.PlatformViewsChannel.PlatformViewsHandler;
import io.flutter.plugin.common.MessageCodec;
import io.flutter.plugin.editing.TextInputPlugin;
import io.flutter.util.ViewUtils;
import io.flutter.view.AccessibilityBridge;
import io.flutter.view.TextureRegistry;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class PlatformViewsController
  implements PlatformViewsAccessibilityDelegate
{
  private static final String TAG = "PlatformViewsController";
  private static Class[] VIEW_TYPES_REQUIRE_VIRTUAL_DISPLAY = { SurfaceView.class };
  private static boolean enableImageRenderTarget = true;
  private static boolean enableSurfaceProducerRenderTarget = true;
  private final AccessibilityEventsDelegate accessibilityEventsDelegate = new AccessibilityEventsDelegate();
  private AndroidTouchProcessor androidTouchProcessor;
  private final PlatformViewsChannel.PlatformViewsHandler channelHandler = new PlatformViewsChannel.PlatformViewsHandler()
  {
    public void clearFocus(int paramAnonymousInt)
    {
      Object localObject;
      if (usesVirtualDisplay(paramAnonymousInt))
      {
        localObject = ((VirtualDisplayController)vdControllers.get(Integer.valueOf(paramAnonymousInt))).getView();
      }
      else
      {
        localObject = (PlatformView)PlatformViewsController.access$900(PlatformViewsController.this).get(paramAnonymousInt);
        if (localObject == null) {
          localObject = new StringBuilder();
        }
      }
      for (String str = "Clearing focus on an unknown view with id: ";; str = "Clearing focus on a null view with id: ")
      {
        ((StringBuilder)localObject).append(str);
        ((StringBuilder)localObject).append(paramAnonymousInt);
        Log.e("PlatformViewsController", ((StringBuilder)localObject).toString());
        return;
        localObject = ((PlatformView)localObject).getView();
        if (localObject != null) {
          break;
        }
        localObject = new StringBuilder();
      }
      ((View)localObject).clearFocus();
    }
    
    public void createForPlatformViewLayer(PlatformViewsChannel.PlatformViewCreationRequest paramAnonymousPlatformViewCreationRequest)
    {
      PlatformViewsController.access$000(PlatformViewsController.this, 19);
      PlatformViewsController.access$100(PlatformViewsController.this, paramAnonymousPlatformViewCreationRequest);
      PlatformView localPlatformView = createPlatformView(paramAnonymousPlatformViewCreationRequest, false);
      PlatformViewsController.access$200(PlatformViewsController.this, localPlatformView, paramAnonymousPlatformViewCreationRequest);
    }
    
    public long createForTextureLayer(PlatformViewsChannel.PlatformViewCreationRequest paramAnonymousPlatformViewCreationRequest)
    {
      PlatformViewsController.access$100(PlatformViewsController.this, paramAnonymousPlatformViewCreationRequest);
      int i = viewId;
      if (PlatformViewsController.access$300(PlatformViewsController.this).get(i) == null)
      {
        if (PlatformViewsController.access$400(PlatformViewsController.this) != null)
        {
          if (PlatformViewsController.access$500(PlatformViewsController.this) != null)
          {
            PlatformView localPlatformView = createPlatformView(paramAnonymousPlatformViewCreationRequest, true);
            View localView = localPlatformView.getView();
            if (localView.getParent() == null)
            {
              if (!(true ^ ViewUtils.hasChildViewOfType(localView, PlatformViewsController.access$600())))
              {
                if (displayMode == PlatformViewsChannel.PlatformViewCreationRequest.RequestedDisplayMode.TEXTURE_WITH_HYBRID_FALLBACK)
                {
                  PlatformViewsController.access$200(PlatformViewsController.this, localPlatformView, paramAnonymousPlatformViewCreationRequest);
                  return -2L;
                }
                if (!PlatformViewsController.access$700(PlatformViewsController.this)) {
                  return PlatformViewsController.access$800(PlatformViewsController.this, localPlatformView, paramAnonymousPlatformViewCreationRequest);
                }
              }
              return configureForTextureLayerComposition(localPlatformView, paramAnonymousPlatformViewCreationRequest);
            }
            throw new IllegalStateException("The Android view returned from PlatformView#getView() was already added to a parent view.");
          }
          throw new IllegalStateException(f.h("Flutter view is null. This means the platform views controller doesn't have an attached view, view id: ", i));
        }
        throw new IllegalStateException(f.h("Texture registry is null. This means that platform views controller was detached, view id: ", i));
      }
      throw new IllegalStateException(f.h("Trying to create an already created platform view, view id: ", i));
    }
    
    public void dispose(int paramAnonymousInt)
    {
      PlatformView localPlatformView = (PlatformView)PlatformViewsController.access$900(PlatformViewsController.this).get(paramAnonymousInt);
      Object localObject1;
      if (localPlatformView == null)
      {
        localObject1 = new StringBuilder();
        ((StringBuilder)localObject1).append("Disposing unknown platform view with id: ");
        ((StringBuilder)localObject1).append(paramAnonymousInt);
        Log.e("PlatformViewsController", ((StringBuilder)localObject1).toString());
        return;
      }
      if (localPlatformView.getView() != null)
      {
        localObject3 = localPlatformView.getView();
        localObject1 = (ViewGroup)((View)localObject3).getParent();
        if (localObject1 != null) {
          ((ViewGroup)localObject1).removeView((View)localObject3);
        }
      }
      PlatformViewsController.access$900(PlatformViewsController.this).remove(paramAnonymousInt);
      try
      {
        localPlatformView.dispose();
      }
      catch (RuntimeException localRuntimeException)
      {
        Log.e("PlatformViewsController", "Disposing platform view threw an exception", localRuntimeException);
      }
      Object localObject2;
      if (usesVirtualDisplay(paramAnonymousInt))
      {
        localObject3 = (VirtualDisplayController)vdControllers.get(Integer.valueOf(paramAnonymousInt));
        localObject2 = ((VirtualDisplayController)localObject3).getView();
        if (localObject2 != null) {
          contextToEmbeddedView.remove(((View)localObject2).getContext());
        }
        ((VirtualDisplayController)localObject3).dispose();
        vdControllers.remove(Integer.valueOf(paramAnonymousInt));
        return;
      }
      Object localObject3 = (PlatformViewWrapper)PlatformViewsController.access$300(PlatformViewsController.this).get(paramAnonymousInt);
      if (localObject3 != null)
      {
        ((ViewGroup)localObject3).removeAllViews();
        ((PlatformViewWrapper)localObject3).release();
        ((PlatformViewWrapper)localObject3).unsetOnDescendantFocusChangeListener();
        localObject2 = (ViewGroup)((View)localObject3).getParent();
        if (localObject2 != null) {
          ((ViewGroup)localObject2).removeView((View)localObject3);
        }
        PlatformViewsController.access$300(PlatformViewsController.this).remove(paramAnonymousInt);
        return;
      }
      localObject3 = (FlutterMutatorView)PlatformViewsController.access$1000(PlatformViewsController.this).get(paramAnonymousInt);
      if (localObject3 != null)
      {
        ((ViewGroup)localObject3).removeAllViews();
        ((FlutterMutatorView)localObject3).unsetOnDescendantFocusChangeListener();
        localObject2 = (ViewGroup)((View)localObject3).getParent();
        if (localObject2 != null) {
          ((ViewGroup)localObject2).removeView((View)localObject3);
        }
        PlatformViewsController.access$1000(PlatformViewsController.this).remove(paramAnonymousInt);
      }
    }
    
    public void offset(int paramAnonymousInt, double paramAnonymousDouble1, double paramAnonymousDouble2)
    {
      if (usesVirtualDisplay(paramAnonymousInt)) {
        return;
      }
      PlatformViewWrapper localPlatformViewWrapper = (PlatformViewWrapper)PlatformViewsController.access$300(PlatformViewsController.this).get(paramAnonymousInt);
      if (localPlatformViewWrapper == null)
      {
        localObject = new StringBuilder();
        ((StringBuilder)localObject).append("Setting offset for unknown platform view with id: ");
        ((StringBuilder)localObject).append(paramAnonymousInt);
        Log.e("PlatformViewsController", ((StringBuilder)localObject).toString());
        return;
      }
      paramAnonymousInt = PlatformViewsController.access$1100(PlatformViewsController.this, paramAnonymousDouble1);
      int i = PlatformViewsController.access$1100(PlatformViewsController.this, paramAnonymousDouble2);
      Object localObject = (FrameLayout.LayoutParams)localPlatformViewWrapper.getLayoutParams();
      topMargin = paramAnonymousInt;
      leftMargin = i;
      localPlatformViewWrapper.setLayoutParams((FrameLayout.LayoutParams)localObject);
    }
    
    public void onTouch(PlatformViewsChannel.PlatformViewTouch paramAnonymousPlatformViewTouch)
    {
      int i = viewId;
      float f = access$1500getResourcesgetDisplayMetricsdensity;
      if (usesVirtualDisplay(i))
      {
        ((VirtualDisplayController)vdControllers.get(Integer.valueOf(i))).dispatchTouchEvent(toMotionEvent(f, paramAnonymousPlatformViewTouch, true));
        return;
      }
      Object localObject = (PlatformView)PlatformViewsController.access$900(PlatformViewsController.this).get(i);
      if (localObject == null)
      {
        paramAnonymousPlatformViewTouch = new StringBuilder();
        paramAnonymousPlatformViewTouch.append("Sending touch to an unknown view with id: ");
        paramAnonymousPlatformViewTouch.append(i);
        Log.e("PlatformViewsController", paramAnonymousPlatformViewTouch.toString());
        return;
      }
      localObject = ((PlatformView)localObject).getView();
      if (localObject == null)
      {
        paramAnonymousPlatformViewTouch = new StringBuilder();
        paramAnonymousPlatformViewTouch.append("Sending touch to a null view with id: ");
        paramAnonymousPlatformViewTouch.append(i);
        Log.e("PlatformViewsController", paramAnonymousPlatformViewTouch.toString());
        return;
      }
      ((View)localObject).dispatchTouchEvent(toMotionEvent(f, paramAnonymousPlatformViewTouch, false));
    }
    
    public void resize(PlatformViewsChannel.PlatformViewResizeRequest paramAnonymousPlatformViewResizeRequest, PlatformViewsChannel.PlatformViewBufferResized paramAnonymousPlatformViewBufferResized)
    {
      int i = PlatformViewsController.access$1100(PlatformViewsController.this, newLogicalWidth);
      int j = PlatformViewsController.access$1100(PlatformViewsController.this, newLogicalHeight);
      int k = viewId;
      if (usesVirtualDisplay(k))
      {
        float f = PlatformViewsController.access$1200(PlatformViewsController.this);
        paramAnonymousPlatformViewResizeRequest = (VirtualDisplayController)vdControllers.get(Integer.valueOf(k));
        PlatformViewsController.access$1300(PlatformViewsController.this, paramAnonymousPlatformViewResizeRequest);
        paramAnonymousPlatformViewResizeRequest.resize(i, j, new h(this, paramAnonymousPlatformViewResizeRequest, f, paramAnonymousPlatformViewBufferResized));
        return;
      }
      Object localObject1 = (PlatformView)PlatformViewsController.access$900(PlatformViewsController.this).get(k);
      paramAnonymousPlatformViewResizeRequest = (PlatformViewWrapper)PlatformViewsController.access$300(PlatformViewsController.this).get(k);
      if ((localObject1 != null) && (paramAnonymousPlatformViewResizeRequest != null))
      {
        if ((i > paramAnonymousPlatformViewResizeRequest.getRenderTargetWidth()) || (j > paramAnonymousPlatformViewResizeRequest.getRenderTargetHeight())) {
          paramAnonymousPlatformViewResizeRequest.resizeRenderTarget(i, j);
        }
        Object localObject2 = paramAnonymousPlatformViewResizeRequest.getLayoutParams();
        width = i;
        height = j;
        paramAnonymousPlatformViewResizeRequest.setLayoutParams((ViewGroup.LayoutParams)localObject2);
        localObject2 = ((PlatformView)localObject1).getView();
        if (localObject2 != null)
        {
          localObject1 = ((View)localObject2).getLayoutParams();
          width = i;
          height = j;
          ((View)localObject2).setLayoutParams((ViewGroup.LayoutParams)localObject1);
        }
        paramAnonymousPlatformViewBufferResized.run(new PlatformViewsChannel.PlatformViewBufferSize(PlatformViewsController.access$1400(PlatformViewsController.this, paramAnonymousPlatformViewResizeRequest.getRenderTargetWidth()), PlatformViewsController.access$1400(PlatformViewsController.this, paramAnonymousPlatformViewResizeRequest.getRenderTargetHeight())));
        return;
      }
      paramAnonymousPlatformViewResizeRequest = new StringBuilder();
      paramAnonymousPlatformViewResizeRequest.append("Resizing unknown platform view with id: ");
      paramAnonymousPlatformViewResizeRequest.append(k);
      Log.e("PlatformViewsController", paramAnonymousPlatformViewResizeRequest.toString());
    }
    
    public void setDirection(int paramAnonymousInt1, int paramAnonymousInt2)
    {
      if (PlatformViewsController.access$1600(paramAnonymousInt2))
      {
        if (usesVirtualDisplay(paramAnonymousInt1))
        {
          localObject = ((VirtualDisplayController)vdControllers.get(Integer.valueOf(paramAnonymousInt1))).getView();
        }
        else
        {
          localObject = (PlatformView)PlatformViewsController.access$900(PlatformViewsController.this).get(paramAnonymousInt1);
          if (localObject == null) {
            localObject = new StringBuilder();
          }
        }
        for (String str = "Setting direction to an unknown view with id: ";; str = "Setting direction to a null view with id: ")
        {
          ((StringBuilder)localObject).append(str);
          ((StringBuilder)localObject).append(paramAnonymousInt1);
          Log.e("PlatformViewsController", ((StringBuilder)localObject).toString());
          return;
          localObject = ((PlatformView)localObject).getView();
          if (localObject != null) {
            break;
          }
          localObject = new StringBuilder();
        }
        ((View)localObject).setLayoutDirection(paramAnonymousInt2);
        return;
      }
      Object localObject = new StringBuilder();
      ((StringBuilder)localObject).append("Trying to set unknown direction value: ");
      ((StringBuilder)localObject).append(paramAnonymousInt2);
      ((StringBuilder)localObject).append("(view id: ");
      ((StringBuilder)localObject).append(paramAnonymousInt1);
      ((StringBuilder)localObject).append(")");
      throw new IllegalStateException(((StringBuilder)localObject).toString());
    }
    
    public void synchronizeToNativeViewHierarchy(boolean paramAnonymousBoolean)
    {
      PlatformViewsController.access$1702(PlatformViewsController.this, paramAnonymousBoolean);
    }
  };
  private Context context;
  public final HashMap<Context, View> contextToEmbeddedView = new HashMap();
  private final HashSet<Integer> currentFrameUsedOverlayLayerIds = new HashSet();
  private final HashSet<Integer> currentFrameUsedPlatformViewIds = new HashSet();
  private FlutterView flutterView;
  private boolean flutterViewConvertedToImageView = false;
  private final MotionEventTracker motionEventTracker = MotionEventTracker.getInstance();
  private int nextOverlayLayerId = 0;
  private final SparseArray<PlatformOverlayView> overlayLayerViews = new SparseArray();
  private final SparseArray<FlutterMutatorView> platformViewParent = new SparseArray();
  private final SparseArray<PlatformView> platformViews = new SparseArray();
  private PlatformViewsChannel platformViewsChannel;
  private final PlatformViewRegistryImpl registry = new PlatformViewRegistryImpl();
  private boolean synchronizeToNativeViewHierarchy = true;
  private TextInputPlugin textInputPlugin;
  private TextureRegistry textureRegistry;
  private boolean usesSoftwareRendering = false;
  public final HashMap<Integer, VirtualDisplayController> vdControllers = new HashMap();
  private final SparseArray<PlatformViewWrapper> viewWrappers = new SparseArray();
  
  private void configureForHybridComposition(PlatformView paramPlatformView, PlatformViewsChannel.PlatformViewCreationRequest paramPlatformViewCreationRequest)
  {
    enforceMinimumAndroidApiVersion(19);
    paramPlatformView = f.l("Using hybrid composition for platform view: ");
    paramPlatformView.append(viewId);
    Log.i("PlatformViewsController", paramPlatformView.toString());
  }
  
  private long configureForVirtualDisplay(PlatformView paramPlatformView, PlatformViewsChannel.PlatformViewCreationRequest paramPlatformViewCreationRequest)
  {
    enforceMinimumAndroidApiVersion(20);
    Object localObject = f.l("Hosting view in a virtual display for platform view: ");
    ((StringBuilder)localObject).append(viewId);
    Log.i("PlatformViewsController", ((StringBuilder)localObject).toString());
    localObject = makePlatformViewRenderTarget(textureRegistry);
    int i = toPhysicalPixels(logicalWidth);
    int j = toPhysicalPixels(logicalHeight);
    VirtualDisplayController localVirtualDisplayController = VirtualDisplayController.create(context, accessibilityEventsDelegate, paramPlatformView, (PlatformViewRenderTarget)localObject, i, j, viewId, null, new g(this, paramPlatformViewCreationRequest));
    if (localVirtualDisplayController != null)
    {
      vdControllers.put(Integer.valueOf(viewId), localVirtualDisplayController);
      paramPlatformView = paramPlatformView.getView();
      contextToEmbeddedView.put(paramPlatformView.getContext(), paramPlatformView);
      return ((PlatformViewRenderTarget)localObject).getId();
    }
    paramPlatformView = f.l("Failed creating virtual display for a ");
    paramPlatformView.append(viewType);
    paramPlatformView.append(" with id: ");
    paramPlatformView.append(viewId);
    throw new IllegalStateException(paramPlatformView.toString());
  }
  
  private void diposeAllViews()
  {
    while (platformViews.size() > 0)
    {
      int i = platformViews.keyAt(0);
      channelHandler.dispose(i);
    }
  }
  
  private void enforceMinimumAndroidApiVersion(int paramInt)
  {
    int i = Build.VERSION.SDK_INT;
    if (i >= paramInt) {
      return;
    }
    throw new IllegalStateException(f.i("Trying to use platform views with API ", i, ", required API level is: ", paramInt));
  }
  
  private void ensureValidRequest(PlatformViewsChannel.PlatformViewCreationRequest paramPlatformViewCreationRequest)
  {
    if (validateDirection(direction)) {
      return;
    }
    StringBuilder localStringBuilder = f.l("Trying to create a view with unknown direction value: ");
    localStringBuilder.append(direction);
    localStringBuilder.append("(view id: ");
    throw new IllegalStateException(j.m(localStringBuilder, viewId, ")"));
  }
  
  private void finishFrame(boolean paramBoolean)
  {
    int j;
    Object localObject;
    for (int i = 0; i < overlayLayerViews.size(); i++)
    {
      j = overlayLayerViews.keyAt(i);
      localObject = (PlatformOverlayView)overlayLayerViews.valueAt(i);
      if (currentFrameUsedOverlayLayerIds.contains(Integer.valueOf(j)))
      {
        flutterView.attachOverlaySurfaceToRender((FlutterImageView)localObject);
        paramBoolean &= ((FlutterImageView)localObject).acquireLatestImage();
      }
      else
      {
        if (!flutterViewConvertedToImageView) {
          ((FlutterImageView)localObject).detachFromRenderer();
        }
        ((View)localObject).setVisibility(8);
        flutterView.removeView((View)localObject);
      }
    }
    for (i = 0; i < platformViewParent.size(); i++)
    {
      j = platformViewParent.keyAt(i);
      localObject = (View)platformViewParent.get(j);
      if ((currentFrameUsedPlatformViewIds.contains(Integer.valueOf(j))) && ((paramBoolean) || (!synchronizeToNativeViewHierarchy))) {
        ((View)localObject).setVisibility(0);
      } else {
        ((View)localObject).setVisibility(8);
      }
    }
  }
  
  private float getDisplayDensity()
  {
    return context.getResources().getDisplayMetrics().density;
  }
  
  private void initializeRootImageViewIfNeeded()
  {
    if ((synchronizeToNativeViewHierarchy) && (!flutterViewConvertedToImageView))
    {
      flutterView.convertToImageView();
      flutterViewConvertedToImageView = true;
    }
  }
  
  private void lockInputConnection(VirtualDisplayController paramVirtualDisplayController)
  {
    TextInputPlugin localTextInputPlugin = textInputPlugin;
    if (localTextInputPlugin == null) {
      return;
    }
    localTextInputPlugin.lockPlatformViewInputConnection();
    paramVirtualDisplayController.onInputConnectionLocked();
  }
  
  private static PlatformViewRenderTarget makePlatformViewRenderTarget(TextureRegistry paramTextureRegistry)
  {
    if ((enableSurfaceProducerRenderTarget) && (Build.VERSION.SDK_INT >= 29))
    {
      paramTextureRegistry = paramTextureRegistry.createSurfaceProducer();
      Log.i("PlatformViewsController", "PlatformView is using SurfaceProducer backend");
      return new SurfaceProducerPlatformViewRenderTarget(paramTextureRegistry);
    }
    if ((enableImageRenderTarget) && (Build.VERSION.SDK_INT >= 29))
    {
      paramTextureRegistry = paramTextureRegistry.createImageTexture();
      Log.i("PlatformViewsController", "PlatformView is using ImageReader backend");
      return new ImageReaderPlatformViewRenderTarget(paramTextureRegistry);
    }
    paramTextureRegistry = paramTextureRegistry.createSurfaceTexture();
    Log.i("PlatformViewsController", "PlatformView is using SurfaceTexture backend");
    return new SurfaceTexturePlatformViewRenderTarget(paramTextureRegistry);
  }
  
  private void maybeInvokeOnFlutterViewAttached(PlatformView paramPlatformView)
  {
    FlutterView localFlutterView = flutterView;
    if (localFlutterView == null)
    {
      Log.i("PlatformViewsController", "null flutterView");
      return;
    }
    paramPlatformView.onFlutterViewAttached(localFlutterView);
  }
  
  private static MotionEvent.PointerCoords parsePointerCoords(Object paramObject, float paramFloat)
  {
    List localList = (List)paramObject;
    paramObject = new MotionEvent.PointerCoords();
    orientation = ((float)((Double)localList.get(0)).doubleValue());
    pressure = ((float)((Double)localList.get(1)).doubleValue());
    size = ((float)((Double)localList.get(2)).doubleValue());
    double d1 = ((Double)localList.get(3)).doubleValue();
    double d2 = paramFloat;
    toolMajor = ((float)(d1 * d2));
    toolMinor = ((float)(((Double)localList.get(4)).doubleValue() * d2));
    touchMajor = ((float)(((Double)localList.get(5)).doubleValue() * d2));
    touchMinor = ((float)(((Double)localList.get(6)).doubleValue() * d2));
    x = ((float)(((Double)localList.get(7)).doubleValue() * d2));
    y = ((float)(((Double)localList.get(8)).doubleValue() * d2));
    return (MotionEvent.PointerCoords)paramObject;
  }
  
  private static List<MotionEvent.PointerCoords> parsePointerCoordsList(Object paramObject, float paramFloat)
  {
    Object localObject = (List)paramObject;
    paramObject = new ArrayList();
    localObject = ((List)localObject).iterator();
    while (((Iterator)localObject).hasNext()) {
      ((ArrayList)paramObject).add(parsePointerCoords(((Iterator)localObject).next(), paramFloat));
    }
    return (List<MotionEvent.PointerCoords>)paramObject;
  }
  
  private static MotionEvent.PointerProperties parsePointerProperties(Object paramObject)
  {
    List localList = (List)paramObject;
    paramObject = new MotionEvent.PointerProperties();
    id = ((Integer)localList.get(0)).intValue();
    toolType = ((Integer)localList.get(1)).intValue();
    return (MotionEvent.PointerProperties)paramObject;
  }
  
  private static List<MotionEvent.PointerProperties> parsePointerPropertiesList(Object paramObject)
  {
    Object localObject = (List)paramObject;
    paramObject = new ArrayList();
    localObject = ((List)localObject).iterator();
    while (((Iterator)localObject).hasNext()) {
      ((ArrayList)paramObject).add(parsePointerProperties(((Iterator)localObject).next()));
    }
    return (List<MotionEvent.PointerProperties>)paramObject;
  }
  
  private void removeOverlaySurfaces()
  {
    if (flutterView == null)
    {
      Log.e("PlatformViewsController", "removeOverlaySurfaces called while flutter view is null");
      return;
    }
    for (int i = 0; i < overlayLayerViews.size(); i++) {
      flutterView.removeView((View)overlayLayerViews.valueAt(i));
    }
    overlayLayerViews.clear();
  }
  
  private int toLogicalPixels(double paramDouble)
  {
    return toLogicalPixels(paramDouble, getDisplayDensity());
  }
  
  private int toLogicalPixels(double paramDouble, float paramFloat)
  {
    return (int)Math.round(paramDouble / paramFloat);
  }
  
  private int toPhysicalPixels(double paramDouble)
  {
    return (int)Math.round(paramDouble * getDisplayDensity());
  }
  
  private static void translateMotionEvent(MotionEvent paramMotionEvent, MotionEvent.PointerCoords[] paramArrayOfPointerCoords)
  {
    if (paramArrayOfPointerCoords.length < 1) {
      return;
    }
    paramMotionEvent.offsetLocation(0x - paramMotionEvent.getX(), 0y - paramMotionEvent.getY());
  }
  
  private void unlockInputConnection(VirtualDisplayController paramVirtualDisplayController)
  {
    TextInputPlugin localTextInputPlugin = textInputPlugin;
    if (localTextInputPlugin == null) {
      return;
    }
    localTextInputPlugin.unlockPlatformViewInputConnection();
    paramVirtualDisplayController.onInputConnectionUnlocked();
  }
  
  private static boolean validateDirection(int paramInt)
  {
    boolean bool1 = true;
    boolean bool2 = bool1;
    if (paramInt != 0) {
      if (paramInt == 1) {
        bool2 = bool1;
      } else {
        bool2 = false;
      }
    }
    return bool2;
  }
  
  public void attach(Context paramContext, TextureRegistry paramTextureRegistry, DartExecutor paramDartExecutor)
  {
    if (context == null)
    {
      context = paramContext;
      textureRegistry = paramTextureRegistry;
      paramContext = new PlatformViewsChannel(paramDartExecutor);
      platformViewsChannel = paramContext;
      paramContext.setPlatformViewsHandler(channelHandler);
      return;
    }
    throw new AssertionError("A PlatformViewsController can only be attached to a single output target.\nattach was called while the PlatformViewsController was already attached.");
  }
  
  public void attachAccessibilityBridge(AccessibilityBridge paramAccessibilityBridge)
  {
    accessibilityEventsDelegate.setAccessibilityBridge(paramAccessibilityBridge);
  }
  
  public void attachTextInputPlugin(TextInputPlugin paramTextInputPlugin)
  {
    textInputPlugin = paramTextInputPlugin;
  }
  
  public void attachToFlutterRenderer(FlutterRenderer paramFlutterRenderer)
  {
    androidTouchProcessor = new AndroidTouchProcessor(paramFlutterRenderer, true);
  }
  
  public void attachToView(FlutterView paramFlutterView)
  {
    flutterView = paramFlutterView;
    int i = 0;
    for (int j = 0; j < viewWrappers.size(); j++)
    {
      paramFlutterView = (PlatformViewWrapper)viewWrappers.valueAt(j);
      flutterView.addView(paramFlutterView);
    }
    for (int k = 0;; k++)
    {
      j = i;
      if (k >= platformViewParent.size()) {
        break;
      }
      paramFlutterView = (FlutterMutatorView)platformViewParent.valueAt(k);
      flutterView.addView(paramFlutterView);
    }
    while (j < platformViews.size())
    {
      ((PlatformView)platformViews.valueAt(j)).onFlutterViewAttached(flutterView);
      j++;
    }
  }
  
  public boolean checkInputConnectionProxy(View paramView)
  {
    if (paramView == null) {
      return false;
    }
    if (!contextToEmbeddedView.containsKey(paramView.getContext())) {
      return false;
    }
    View localView = (View)contextToEmbeddedView.get(paramView.getContext());
    if (localView == paramView) {
      return true;
    }
    return localView.checkInputConnectionProxy(paramView);
  }
  
  public long configureForTextureLayerComposition(PlatformView paramPlatformView, PlatformViewsChannel.PlatformViewCreationRequest paramPlatformViewCreationRequest)
  {
    enforceMinimumAndroidApiVersion(23);
    Object localObject1 = f.l("Hosting view in view hierarchy for platform view: ");
    ((StringBuilder)localObject1).append(viewId);
    Log.i("PlatformViewsController", ((StringBuilder)localObject1).toString());
    int i = toPhysicalPixels(logicalWidth);
    int j = toPhysicalPixels(logicalHeight);
    long l;
    if (usesSoftwareRendering)
    {
      localObject1 = new PlatformViewWrapper(context);
      l = -1L;
    }
    else
    {
      localObject2 = makePlatformViewRenderTarget(textureRegistry);
      localObject1 = new PlatformViewWrapper(context, (PlatformViewRenderTarget)localObject2);
      l = ((PlatformViewRenderTarget)localObject2).getId();
    }
    ((PlatformViewWrapper)localObject1).setTouchProcessor(androidTouchProcessor);
    ((PlatformViewWrapper)localObject1).resizeRenderTarget(i, j);
    Object localObject2 = new FrameLayout.LayoutParams(i, j);
    int k = toPhysicalPixels(logicalTop);
    int m = toPhysicalPixels(logicalLeft);
    topMargin = k;
    leftMargin = m;
    ((PlatformViewWrapper)localObject1).setLayoutParams((FrameLayout.LayoutParams)localObject2);
    localObject2 = paramPlatformView.getView();
    ((View)localObject2).setLayoutParams(new FrameLayout.LayoutParams(i, j));
    ((View)localObject2).setImportantForAccessibility(4);
    ((ViewGroup)localObject1).addView((View)localObject2);
    ((PlatformViewWrapper)localObject1).setOnDescendantFocusChangeListener(new e(this, paramPlatformViewCreationRequest));
    flutterView.addView((View)localObject1);
    viewWrappers.append(viewId, localObject1);
    maybeInvokeOnFlutterViewAttached(paramPlatformView);
    return l;
  }
  
  public FlutterOverlaySurface createOverlaySurface()
  {
    return createOverlaySurface(new PlatformOverlayView(flutterView.getContext(), flutterView.getWidth(), flutterView.getHeight(), accessibilityEventsDelegate));
  }
  
  public FlutterOverlaySurface createOverlaySurface(PlatformOverlayView paramPlatformOverlayView)
  {
    int i = nextOverlayLayerId;
    nextOverlayLayerId = (i + 1);
    overlayLayerViews.put(i, paramPlatformOverlayView);
    return new FlutterOverlaySurface(i, paramPlatformOverlayView.getSurface());
  }
  
  public PlatformView createPlatformView(PlatformViewsChannel.PlatformViewCreationRequest paramPlatformViewCreationRequest, boolean paramBoolean)
  {
    PlatformViewFactory localPlatformViewFactory = registry.getFactory(viewType);
    if (localPlatformViewFactory != null)
    {
      localObject1 = null;
      if (params != null) {
        localObject1 = localPlatformViewFactory.getCreateArgsCodec().decodeMessage(params);
      }
      if (paramBoolean) {
        localObject2 = new MutableContextWrapper(context);
      } else {
        localObject2 = context;
      }
      localObject1 = localPlatformViewFactory.create((Context)localObject2, viewId, localObject1);
      Object localObject2 = ((PlatformView)localObject1).getView();
      if (localObject2 != null)
      {
        ((View)localObject2).setLayoutDirection(direction);
        platformViews.put(viewId, localObject1);
        maybeInvokeOnFlutterViewAttached((PlatformView)localObject1);
        return (PlatformView)localObject1;
      }
      throw new IllegalStateException("PlatformView#getView() returned null, but an Android view reference was expected.");
    }
    Object localObject1 = f.l("Trying to create a platform view of unregistered type: ");
    ((StringBuilder)localObject1).append(viewType);
    throw new IllegalStateException(((StringBuilder)localObject1).toString());
  }
  
  public void destroyOverlaySurfaces()
  {
    for (int i = 0; i < overlayLayerViews.size(); i++)
    {
      PlatformOverlayView localPlatformOverlayView = (PlatformOverlayView)overlayLayerViews.valueAt(i);
      localPlatformOverlayView.detachFromRenderer();
      localPlatformOverlayView.closeImageReader();
    }
  }
  
  public void detach()
  {
    PlatformViewsChannel localPlatformViewsChannel = platformViewsChannel;
    if (localPlatformViewsChannel != null) {
      localPlatformViewsChannel.setPlatformViewsHandler(null);
    }
    destroyOverlaySurfaces();
    platformViewsChannel = null;
    context = null;
    textureRegistry = null;
  }
  
  public void detachAccessibilityBridge()
  {
    accessibilityEventsDelegate.setAccessibilityBridge(null);
  }
  
  public void detachFromView()
  {
    int i = 0;
    Object localObject;
    for (int j = 0; j < viewWrappers.size(); j++)
    {
      localObject = (PlatformViewWrapper)viewWrappers.valueAt(j);
      flutterView.removeView((View)localObject);
    }
    for (j = 0; j < platformViewParent.size(); j++)
    {
      localObject = (FlutterMutatorView)platformViewParent.valueAt(j);
      flutterView.removeView((View)localObject);
    }
    destroyOverlaySurfaces();
    removeOverlaySurfaces();
    flutterView = null;
    flutterViewConvertedToImageView = false;
    for (j = i; j < platformViews.size(); j++) {
      ((PlatformView)platformViews.valueAt(j)).onFlutterViewDetached();
    }
  }
  
  public void detachTextInputPlugin()
  {
    textInputPlugin = null;
  }
  
  public void disposePlatformView(int paramInt)
  {
    channelHandler.dispose(paramInt);
  }
  
  public SparseArray<PlatformOverlayView> getOverlayLayerViews()
  {
    return overlayLayerViews;
  }
  
  public View getPlatformViewById(int paramInt)
  {
    if (usesVirtualDisplay(paramInt)) {
      return ((VirtualDisplayController)vdControllers.get(Integer.valueOf(paramInt))).getView();
    }
    PlatformView localPlatformView = (PlatformView)platformViews.get(paramInt);
    if (localPlatformView == null) {
      return null;
    }
    return localPlatformView.getView();
  }
  
  public PlatformViewRegistry getRegistry()
  {
    return registry;
  }
  
  public boolean initializePlatformViewIfNeeded(int paramInt)
  {
    Object localObject1 = (PlatformView)platformViews.get(paramInt);
    if (localObject1 == null) {
      return false;
    }
    if (platformViewParent.get(paramInt) != null) {
      return true;
    }
    localObject1 = ((PlatformView)localObject1).getView();
    if (localObject1 != null)
    {
      if (((View)localObject1).getParent() == null)
      {
        Object localObject2 = context;
        localObject2 = new FlutterMutatorView((Context)localObject2, getResourcesgetDisplayMetricsdensity, androidTouchProcessor);
        ((FlutterMutatorView)localObject2).setOnDescendantFocusChangeListener(new f(this, paramInt));
        platformViewParent.put(paramInt, localObject2);
        ((View)localObject1).setImportantForAccessibility(4);
        ((ViewGroup)localObject2).addView((View)localObject1);
        flutterView.addView((View)localObject2);
        return true;
      }
      throw new IllegalStateException("The Android view returned from PlatformView#getView() was already added to a parent view.");
    }
    throw new IllegalStateException("PlatformView#getView() returned null, but an Android view reference was expected.");
  }
  
  public void onAttachedToJNI() {}
  
  public void onBeginFrame()
  {
    currentFrameUsedOverlayLayerIds.clear();
    currentFrameUsedPlatformViewIds.clear();
  }
  
  public void onDetachedFromJNI()
  {
    diposeAllViews();
  }
  
  public void onDisplayOverlaySurface(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    if (overlayLayerViews.get(paramInt1) != null)
    {
      initializeRootImageViewIfNeeded();
      PlatformOverlayView localPlatformOverlayView = (PlatformOverlayView)overlayLayerViews.get(paramInt1);
      if (localPlatformOverlayView.getParent() == null) {
        flutterView.addView(localPlatformOverlayView);
      }
      FrameLayout.LayoutParams localLayoutParams = new FrameLayout.LayoutParams(paramInt4, paramInt5);
      leftMargin = paramInt2;
      topMargin = paramInt3;
      localPlatformOverlayView.setLayoutParams(localLayoutParams);
      localPlatformOverlayView.setVisibility(0);
      localPlatformOverlayView.bringToFront();
      currentFrameUsedOverlayLayerIds.add(Integer.valueOf(paramInt1));
      return;
    }
    throw new IllegalStateException(j.h("The overlay surface (id:", paramInt1, ") doesn't exist"));
  }
  
  public void onDisplayPlatformView(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, FlutterMutatorsStack paramFlutterMutatorsStack)
  {
    initializeRootImageViewIfNeeded();
    if (!initializePlatformViewIfNeeded(paramInt1)) {
      return;
    }
    Object localObject = (FlutterMutatorView)platformViewParent.get(paramInt1);
    ((FlutterMutatorView)localObject).readyToDisplay(paramFlutterMutatorsStack, paramInt2, paramInt3, paramInt4, paramInt5);
    ((View)localObject).setVisibility(0);
    ((View)localObject).bringToFront();
    paramFlutterMutatorsStack = new FrameLayout.LayoutParams(paramInt6, paramInt7);
    localObject = ((PlatformView)platformViews.get(paramInt1)).getView();
    if (localObject != null)
    {
      ((View)localObject).setLayoutParams(paramFlutterMutatorsStack);
      ((View)localObject).bringToFront();
    }
    currentFrameUsedPlatformViewIds.add(Integer.valueOf(paramInt1));
  }
  
  public void onEndFrame()
  {
    boolean bool1 = flutterViewConvertedToImageView;
    boolean bool2 = false;
    if ((bool1) && (currentFrameUsedPlatformViewIds.isEmpty()))
    {
      flutterViewConvertedToImageView = false;
      flutterView.revertImageView(new k(this, 17));
      return;
    }
    bool1 = bool2;
    if (flutterViewConvertedToImageView)
    {
      bool1 = bool2;
      if (flutterView.acquireLatestImageViewFrame()) {
        bool1 = true;
      }
    }
    finishFrame(bool1);
  }
  
  public void onPreEngineRestart()
  {
    diposeAllViews();
  }
  
  public void onResume()
  {
    Iterator localIterator = vdControllers.values().iterator();
    while (localIterator.hasNext()) {
      ((VirtualDisplayController)localIterator.next()).resetSurface();
    }
  }
  
  public void onTrimMemory(int paramInt)
  {
    if (paramInt < 40) {
      return;
    }
    Iterator localIterator = vdControllers.values().iterator();
    while (localIterator.hasNext()) {
      ((VirtualDisplayController)localIterator.next()).clearSurface();
    }
  }
  
  public void setSoftwareRendering(boolean paramBoolean)
  {
    usesSoftwareRendering = paramBoolean;
  }
  
  public MotionEvent toMotionEvent(float paramFloat, PlatformViewsChannel.PlatformViewTouch paramPlatformViewTouch, boolean paramBoolean)
  {
    Object localObject1 = MotionEventTracker.MotionEventId.from(motionEventId);
    Object localObject2 = motionEventTracker.pop((MotionEventTracker.MotionEventId)localObject1);
    localObject1 = (MotionEvent.PointerCoords[])parsePointerCoordsList(rawPointerCoords, paramFloat).toArray(new MotionEvent.PointerCoords[pointerCount]);
    if ((!paramBoolean) && (localObject2 != null))
    {
      translateMotionEvent((MotionEvent)localObject2, (MotionEvent.PointerCoords[])localObject1);
      return (MotionEvent)localObject2;
    }
    localObject2 = (MotionEvent.PointerProperties[])parsePointerPropertiesList(rawPointerPropertiesList).toArray(new MotionEvent.PointerProperties[pointerCount]);
    return MotionEvent.obtain(downTime.longValue(), eventTime.longValue(), action, pointerCount, (MotionEvent.PointerProperties[])localObject2, (MotionEvent.PointerCoords[])localObject1, metaState, buttonState, xPrecision, yPrecision, deviceId, edgeFlags, source, flags);
  }
  
  public boolean usesVirtualDisplay(int paramInt)
  {
    return vdControllers.containsKey(Integer.valueOf(paramInt));
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugin.platform.PlatformViewsController
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */