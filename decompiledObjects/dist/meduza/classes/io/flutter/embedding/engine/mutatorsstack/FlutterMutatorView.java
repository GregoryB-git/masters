package io.flutter.embedding.engine.mutatorsstack;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnFocusChangeListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalFocusChangeListener;
import android.view.accessibility.AccessibilityEvent;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import io.flutter.embedding.android.AndroidTouchProcessor;
import io.flutter.util.ViewUtils;
import java.util.Iterator;
import java.util.List;

public class FlutterMutatorView
  extends FrameLayout
{
  public ViewTreeObserver.OnGlobalFocusChangeListener activeFocusListener;
  private final AndroidTouchProcessor androidTouchProcessor;
  private int left;
  private FlutterMutatorsStack mutatorsStack;
  private int prevLeft;
  private int prevTop;
  private float screenDensity;
  private int top;
  
  public FlutterMutatorView(Context paramContext)
  {
    this(paramContext, 1.0F, null);
  }
  
  public FlutterMutatorView(Context paramContext, float paramFloat, AndroidTouchProcessor paramAndroidTouchProcessor)
  {
    super(paramContext, null);
    screenDensity = paramFloat;
    androidTouchProcessor = paramAndroidTouchProcessor;
  }
  
  private Matrix getPlatformViewMatrix()
  {
    Matrix localMatrix = new Matrix(mutatorsStack.getFinalMatrix());
    float f = screenDensity;
    localMatrix.preScale(1.0F / f, 1.0F / f);
    localMatrix.postTranslate(-left, -top);
    return localMatrix;
  }
  
  public void dispatchDraw(Canvas paramCanvas)
  {
    paramCanvas.save();
    paramCanvas.concat(getPlatformViewMatrix());
    super.dispatchDraw(paramCanvas);
    paramCanvas.restore();
  }
  
  public void draw(Canvas paramCanvas)
  {
    paramCanvas.save();
    Iterator localIterator = mutatorsStack.getFinalClippingPaths().iterator();
    while (localIterator.hasNext())
    {
      Path localPath = new Path((Path)localIterator.next());
      localPath.offset(-left, -top);
      paramCanvas.clipPath(localPath);
    }
    super.draw(paramCanvas);
    paramCanvas.restore();
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    return true;
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    if (androidTouchProcessor == null) {
      return super.onTouchEvent(paramMotionEvent);
    }
    Matrix localMatrix = new Matrix();
    int i = paramMotionEvent.getAction();
    float f;
    if (i != 0)
    {
      if (i != 2)
      {
        f = left;
        i = top;
      }
      else
      {
        localMatrix.postTranslate(prevLeft, prevTop);
        prevLeft = left;
        prevTop = top;
        break label120;
      }
    }
    else
    {
      int j = left;
      prevLeft = j;
      i = top;
      prevTop = i;
      f = j;
    }
    localMatrix.postTranslate(f, i);
    label120:
    return androidTouchProcessor.onTouchEvent(paramMotionEvent, localMatrix);
  }
  
  public void readyToDisplay(FlutterMutatorsStack paramFlutterMutatorsStack, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    mutatorsStack = paramFlutterMutatorsStack;
    left = paramInt1;
    top = paramInt2;
    paramFlutterMutatorsStack = new FrameLayout.LayoutParams(paramInt3, paramInt4);
    leftMargin = paramInt1;
    topMargin = paramInt2;
    setLayoutParams(paramFlutterMutatorsStack);
    setWillNotDraw(false);
  }
  
  public boolean requestSendAccessibilityEvent(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    View localView = getChildAt(0);
    if ((localView != null) && (localView.getImportantForAccessibility() == 4)) {
      return false;
    }
    return super.requestSendAccessibilityEvent(paramView, paramAccessibilityEvent);
  }
  
  public void setOnDescendantFocusChangeListener(final View.OnFocusChangeListener paramOnFocusChangeListener)
  {
    unsetOnDescendantFocusChangeListener();
    ViewTreeObserver localViewTreeObserver = getViewTreeObserver();
    if ((localViewTreeObserver.isAlive()) && (activeFocusListener == null))
    {
      paramOnFocusChangeListener = new ViewTreeObserver.OnGlobalFocusChangeListener()
      {
        public void onGlobalFocusChanged(View paramAnonymousView1, View paramAnonymousView2)
        {
          paramAnonymousView1 = paramOnFocusChangeListener;
          paramAnonymousView2 = jdField_this;
          paramAnonymousView1.onFocusChange(paramAnonymousView2, ViewUtils.childHasFocus(paramAnonymousView2));
        }
      };
      activeFocusListener = paramOnFocusChangeListener;
      localViewTreeObserver.addOnGlobalFocusChangeListener(paramOnFocusChangeListener);
    }
  }
  
  public void unsetOnDescendantFocusChangeListener()
  {
    ViewTreeObserver localViewTreeObserver = getViewTreeObserver();
    if (localViewTreeObserver.isAlive())
    {
      ViewTreeObserver.OnGlobalFocusChangeListener localOnGlobalFocusChangeListener = activeFocusListener;
      if (localOnGlobalFocusChangeListener != null)
      {
        activeFocusListener = null;
        localViewTreeObserver.removeOnGlobalFocusChangeListener(localOnGlobalFocusChangeListener);
      }
    }
  }
}

/* Location:
 * Qualified Name:     io.flutter.embedding.engine.mutatorsstack.FlutterMutatorView
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */