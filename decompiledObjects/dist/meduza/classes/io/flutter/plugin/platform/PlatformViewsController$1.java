package io.flutter.plugin.platform;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout.LayoutParams;
import f;
import io.flutter.Log;
import io.flutter.embedding.engine.mutatorsstack.FlutterMutatorView;
import io.flutter.embedding.engine.systemchannels.PlatformViewsChannel.PlatformViewBufferResized;
import io.flutter.embedding.engine.systemchannels.PlatformViewsChannel.PlatformViewBufferSize;
import io.flutter.embedding.engine.systemchannels.PlatformViewsChannel.PlatformViewCreationRequest;
import io.flutter.embedding.engine.systemchannels.PlatformViewsChannel.PlatformViewCreationRequest.RequestedDisplayMode;
import io.flutter.embedding.engine.systemchannels.PlatformViewsChannel.PlatformViewResizeRequest;
import io.flutter.embedding.engine.systemchannels.PlatformViewsChannel.PlatformViewTouch;
import io.flutter.embedding.engine.systemchannels.PlatformViewsChannel.PlatformViewsHandler;
import io.flutter.util.ViewUtils;
import java.util.HashMap;

class PlatformViewsController$1
  implements PlatformViewsChannel.PlatformViewsHandler
{
  public PlatformViewsController$1(PlatformViewsController paramPlatformViewsController) {}
  
  public void clearFocus(int paramInt)
  {
    Object localObject;
    if (this$0.usesVirtualDisplay(paramInt))
    {
      localObject = ((VirtualDisplayController)this$0.vdControllers.get(Integer.valueOf(paramInt))).getView();
    }
    else
    {
      localObject = (PlatformView)PlatformViewsController.access$900(this$0).get(paramInt);
      if (localObject == null) {
        localObject = new StringBuilder();
      }
    }
    for (String str = "Clearing focus on an unknown view with id: ";; str = "Clearing focus on a null view with id: ")
    {
      ((StringBuilder)localObject).append(str);
      ((StringBuilder)localObject).append(paramInt);
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
  
  public void createForPlatformViewLayer(PlatformViewsChannel.PlatformViewCreationRequest paramPlatformViewCreationRequest)
  {
    PlatformViewsController.access$000(this$0, 19);
    PlatformViewsController.access$100(this$0, paramPlatformViewCreationRequest);
    PlatformView localPlatformView = this$0.createPlatformView(paramPlatformViewCreationRequest, false);
    PlatformViewsController.access$200(this$0, localPlatformView, paramPlatformViewCreationRequest);
  }
  
  public long createForTextureLayer(PlatformViewsChannel.PlatformViewCreationRequest paramPlatformViewCreationRequest)
  {
    PlatformViewsController.access$100(this$0, paramPlatformViewCreationRequest);
    int i = viewId;
    if (PlatformViewsController.access$300(this$0).get(i) == null)
    {
      if (PlatformViewsController.access$400(this$0) != null)
      {
        if (PlatformViewsController.access$500(this$0) != null)
        {
          PlatformView localPlatformView = this$0.createPlatformView(paramPlatformViewCreationRequest, true);
          View localView = localPlatformView.getView();
          if (localView.getParent() == null)
          {
            if (!(true ^ ViewUtils.hasChildViewOfType(localView, PlatformViewsController.access$600())))
            {
              if (displayMode == PlatformViewsChannel.PlatformViewCreationRequest.RequestedDisplayMode.TEXTURE_WITH_HYBRID_FALLBACK)
              {
                PlatformViewsController.access$200(this$0, localPlatformView, paramPlatformViewCreationRequest);
                return -2L;
              }
              if (!PlatformViewsController.access$700(this$0)) {
                return PlatformViewsController.access$800(this$0, localPlatformView, paramPlatformViewCreationRequest);
              }
            }
            return this$0.configureForTextureLayerComposition(localPlatformView, paramPlatformViewCreationRequest);
          }
          throw new IllegalStateException("The Android view returned from PlatformView#getView() was already added to a parent view.");
        }
        throw new IllegalStateException(f.h("Flutter view is null. This means the platform views controller doesn't have an attached view, view id: ", i));
      }
      throw new IllegalStateException(f.h("Texture registry is null. This means that platform views controller was detached, view id: ", i));
    }
    throw new IllegalStateException(f.h("Trying to create an already created platform view, view id: ", i));
  }
  
  public void dispose(int paramInt)
  {
    PlatformView localPlatformView = (PlatformView)PlatformViewsController.access$900(this$0).get(paramInt);
    Object localObject1;
    if (localPlatformView == null)
    {
      localObject1 = new StringBuilder();
      ((StringBuilder)localObject1).append("Disposing unknown platform view with id: ");
      ((StringBuilder)localObject1).append(paramInt);
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
    PlatformViewsController.access$900(this$0).remove(paramInt);
    try
    {
      localPlatformView.dispose();
    }
    catch (RuntimeException localRuntimeException)
    {
      Log.e("PlatformViewsController", "Disposing platform view threw an exception", localRuntimeException);
    }
    Object localObject2;
    if (this$0.usesVirtualDisplay(paramInt))
    {
      localObject3 = (VirtualDisplayController)this$0.vdControllers.get(Integer.valueOf(paramInt));
      localObject2 = ((VirtualDisplayController)localObject3).getView();
      if (localObject2 != null) {
        this$0.contextToEmbeddedView.remove(((View)localObject2).getContext());
      }
      ((VirtualDisplayController)localObject3).dispose();
      this$0.vdControllers.remove(Integer.valueOf(paramInt));
      return;
    }
    Object localObject3 = (PlatformViewWrapper)PlatformViewsController.access$300(this$0).get(paramInt);
    if (localObject3 != null)
    {
      ((ViewGroup)localObject3).removeAllViews();
      ((PlatformViewWrapper)localObject3).release();
      ((PlatformViewWrapper)localObject3).unsetOnDescendantFocusChangeListener();
      localObject2 = (ViewGroup)((View)localObject3).getParent();
      if (localObject2 != null) {
        ((ViewGroup)localObject2).removeView((View)localObject3);
      }
      PlatformViewsController.access$300(this$0).remove(paramInt);
      return;
    }
    localObject3 = (FlutterMutatorView)PlatformViewsController.access$1000(this$0).get(paramInt);
    if (localObject3 != null)
    {
      ((ViewGroup)localObject3).removeAllViews();
      ((FlutterMutatorView)localObject3).unsetOnDescendantFocusChangeListener();
      localObject2 = (ViewGroup)((View)localObject3).getParent();
      if (localObject2 != null) {
        ((ViewGroup)localObject2).removeView((View)localObject3);
      }
      PlatformViewsController.access$1000(this$0).remove(paramInt);
    }
  }
  
  public void offset(int paramInt, double paramDouble1, double paramDouble2)
  {
    if (this$0.usesVirtualDisplay(paramInt)) {
      return;
    }
    PlatformViewWrapper localPlatformViewWrapper = (PlatformViewWrapper)PlatformViewsController.access$300(this$0).get(paramInt);
    if (localPlatformViewWrapper == null)
    {
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append("Setting offset for unknown platform view with id: ");
      ((StringBuilder)localObject).append(paramInt);
      Log.e("PlatformViewsController", ((StringBuilder)localObject).toString());
      return;
    }
    paramInt = PlatformViewsController.access$1100(this$0, paramDouble1);
    int i = PlatformViewsController.access$1100(this$0, paramDouble2);
    Object localObject = (FrameLayout.LayoutParams)localPlatformViewWrapper.getLayoutParams();
    topMargin = paramInt;
    leftMargin = i;
    localPlatformViewWrapper.setLayoutParams((FrameLayout.LayoutParams)localObject);
  }
  
  public void onTouch(PlatformViewsChannel.PlatformViewTouch paramPlatformViewTouch)
  {
    int i = viewId;
    float f = access$1500this$0).getResources().getDisplayMetrics().density;
    if (this$0.usesVirtualDisplay(i))
    {
      ((VirtualDisplayController)this$0.vdControllers.get(Integer.valueOf(i))).dispatchTouchEvent(this$0.toMotionEvent(f, paramPlatformViewTouch, true));
      return;
    }
    Object localObject = (PlatformView)PlatformViewsController.access$900(this$0).get(i);
    if (localObject == null)
    {
      paramPlatformViewTouch = new StringBuilder();
      paramPlatformViewTouch.append("Sending touch to an unknown view with id: ");
      paramPlatformViewTouch.append(i);
      Log.e("PlatformViewsController", paramPlatformViewTouch.toString());
      return;
    }
    localObject = ((PlatformView)localObject).getView();
    if (localObject == null)
    {
      paramPlatformViewTouch = new StringBuilder();
      paramPlatformViewTouch.append("Sending touch to a null view with id: ");
      paramPlatformViewTouch.append(i);
      Log.e("PlatformViewsController", paramPlatformViewTouch.toString());
      return;
    }
    ((View)localObject).dispatchTouchEvent(this$0.toMotionEvent(f, paramPlatformViewTouch, false));
  }
  
  public void resize(PlatformViewsChannel.PlatformViewResizeRequest paramPlatformViewResizeRequest, PlatformViewsChannel.PlatformViewBufferResized paramPlatformViewBufferResized)
  {
    int i = PlatformViewsController.access$1100(this$0, newLogicalWidth);
    int j = PlatformViewsController.access$1100(this$0, newLogicalHeight);
    int k = viewId;
    if (this$0.usesVirtualDisplay(k))
    {
      float f = PlatformViewsController.access$1200(this$0);
      paramPlatformViewResizeRequest = (VirtualDisplayController)this$0.vdControllers.get(Integer.valueOf(k));
      PlatformViewsController.access$1300(this$0, paramPlatformViewResizeRequest);
      paramPlatformViewResizeRequest.resize(i, j, new h(this, paramPlatformViewResizeRequest, f, paramPlatformViewBufferResized));
      return;
    }
    Object localObject1 = (PlatformView)PlatformViewsController.access$900(this$0).get(k);
    paramPlatformViewResizeRequest = (PlatformViewWrapper)PlatformViewsController.access$300(this$0).get(k);
    if ((localObject1 != null) && (paramPlatformViewResizeRequest != null))
    {
      if ((i > paramPlatformViewResizeRequest.getRenderTargetWidth()) || (j > paramPlatformViewResizeRequest.getRenderTargetHeight())) {
        paramPlatformViewResizeRequest.resizeRenderTarget(i, j);
      }
      Object localObject2 = paramPlatformViewResizeRequest.getLayoutParams();
      width = i;
      height = j;
      paramPlatformViewResizeRequest.setLayoutParams((ViewGroup.LayoutParams)localObject2);
      localObject2 = ((PlatformView)localObject1).getView();
      if (localObject2 != null)
      {
        localObject1 = ((View)localObject2).getLayoutParams();
        width = i;
        height = j;
        ((View)localObject2).setLayoutParams((ViewGroup.LayoutParams)localObject1);
      }
      paramPlatformViewBufferResized.run(new PlatformViewsChannel.PlatformViewBufferSize(PlatformViewsController.access$1400(this$0, paramPlatformViewResizeRequest.getRenderTargetWidth()), PlatformViewsController.access$1400(this$0, paramPlatformViewResizeRequest.getRenderTargetHeight())));
      return;
    }
    paramPlatformViewResizeRequest = new StringBuilder();
    paramPlatformViewResizeRequest.append("Resizing unknown platform view with id: ");
    paramPlatformViewResizeRequest.append(k);
    Log.e("PlatformViewsController", paramPlatformViewResizeRequest.toString());
  }
  
  public void setDirection(int paramInt1, int paramInt2)
  {
    if (PlatformViewsController.access$1600(paramInt2))
    {
      if (this$0.usesVirtualDisplay(paramInt1))
      {
        localObject = ((VirtualDisplayController)this$0.vdControllers.get(Integer.valueOf(paramInt1))).getView();
      }
      else
      {
        localObject = (PlatformView)PlatformViewsController.access$900(this$0).get(paramInt1);
        if (localObject == null) {
          localObject = new StringBuilder();
        }
      }
      for (String str = "Setting direction to an unknown view with id: ";; str = "Setting direction to a null view with id: ")
      {
        ((StringBuilder)localObject).append(str);
        ((StringBuilder)localObject).append(paramInt1);
        Log.e("PlatformViewsController", ((StringBuilder)localObject).toString());
        return;
        localObject = ((PlatformView)localObject).getView();
        if (localObject != null) {
          break;
        }
        localObject = new StringBuilder();
      }
      ((View)localObject).setLayoutDirection(paramInt2);
      return;
    }
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append("Trying to set unknown direction value: ");
    ((StringBuilder)localObject).append(paramInt2);
    ((StringBuilder)localObject).append("(view id: ");
    ((StringBuilder)localObject).append(paramInt1);
    ((StringBuilder)localObject).append(")");
    throw new IllegalStateException(((StringBuilder)localObject).toString());
  }
  
  public void synchronizeToNativeViewHierarchy(boolean paramBoolean)
  {
    PlatformViewsController.access$1702(this$0, paramBoolean);
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugin.platform.PlatformViewsController.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */