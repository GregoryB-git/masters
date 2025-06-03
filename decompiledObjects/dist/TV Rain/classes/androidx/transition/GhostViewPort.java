package androidx.transition;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;

@SuppressLint({"ViewConstructor"})
class GhostViewPort
  extends ViewGroup
  implements GhostView
{
  @Nullable
  private Matrix mMatrix;
  private final ViewTreeObserver.OnPreDrawListener mOnPreDrawListener = new ViewTreeObserver.OnPreDrawListener()
  {
    public boolean onPreDraw()
    {
      ViewCompat.postInvalidateOnAnimation(GhostViewPort.this);
      Object localObject1 = GhostViewPort.this;
      Object localObject2 = mStartParent;
      if (localObject2 != null)
      {
        localObject1 = mStartView;
        if (localObject1 != null)
        {
          ((ViewGroup)localObject2).endViewTransition((View)localObject1);
          ViewCompat.postInvalidateOnAnimation(mStartParent);
          localObject2 = GhostViewPort.this;
          mStartParent = null;
          mStartView = null;
        }
      }
      return true;
    }
  };
  public int mReferences;
  public ViewGroup mStartParent;
  public View mStartView;
  public final View mView;
  
  public GhostViewPort(View paramView)
  {
    super(paramView.getContext());
    mView = paramView;
    setWillNotDraw(false);
    setLayerType(2, null);
  }
  
  public static GhostViewPort addGhost(View paramView, ViewGroup paramViewGroup, Matrix paramMatrix)
  {
    if ((paramView.getParent() instanceof ViewGroup))
    {
      GhostViewHolder localGhostViewHolder1 = GhostViewHolder.getHolder(paramViewGroup);
      GhostViewPort localGhostViewPort = getGhostView(paramView);
      int i = 0;
      Object localObject = localGhostViewPort;
      int j = i;
      if (localGhostViewPort != null)
      {
        GhostViewHolder localGhostViewHolder2 = (GhostViewHolder)localGhostViewPort.getParent();
        localObject = localGhostViewPort;
        j = i;
        if (localGhostViewHolder2 != localGhostViewHolder1)
        {
          j = mReferences;
          localGhostViewHolder2.removeView(localGhostViewPort);
          localObject = null;
        }
      }
      if (localObject == null)
      {
        localObject = paramMatrix;
        if (paramMatrix == null)
        {
          localObject = new Matrix();
          calculateMatrix(paramView, paramViewGroup, (Matrix)localObject);
        }
        paramMatrix = new GhostViewPort(paramView);
        paramMatrix.setMatrix((Matrix)localObject);
        if (localGhostViewHolder1 == null)
        {
          paramView = new GhostViewHolder(paramViewGroup);
        }
        else
        {
          localGhostViewHolder1.popToOverlayTop();
          paramView = localGhostViewHolder1;
        }
        copySize(paramViewGroup, paramView);
        copySize(paramViewGroup, paramMatrix);
        paramView.addGhostView(paramMatrix);
        mReferences = j;
        paramView = paramMatrix;
      }
      else
      {
        paramView = (View)localObject;
        if (paramMatrix != null)
        {
          ((GhostViewPort)localObject).setMatrix(paramMatrix);
          paramView = (View)localObject;
        }
      }
      mReferences += 1;
      return paramView;
    }
    throw new IllegalArgumentException("Ghosted views must be parented by a ViewGroup");
  }
  
  public static void calculateMatrix(View paramView, ViewGroup paramViewGroup, Matrix paramMatrix)
  {
    paramView = (ViewGroup)paramView.getParent();
    paramMatrix.reset();
    ViewUtils.transformMatrixToGlobal(paramView, paramMatrix);
    paramMatrix.preTranslate(-paramView.getScrollX(), -paramView.getScrollY());
    ViewUtils.transformMatrixToLocal(paramViewGroup, paramMatrix);
  }
  
  public static void copySize(View paramView1, View paramView2)
  {
    int i = paramView2.getLeft();
    int j = paramView2.getTop();
    int k = paramView2.getLeft();
    int m = paramView1.getWidth();
    int n = paramView2.getTop();
    ViewUtils.setLeftTopRightBottom(paramView2, i, j, m + k, paramView1.getHeight() + n);
  }
  
  public static GhostViewPort getGhostView(View paramView)
  {
    return (GhostViewPort)paramView.getTag(R.id.ghost_view);
  }
  
  public static void removeGhost(View paramView)
  {
    paramView = getGhostView(paramView);
    if (paramView != null)
    {
      int i = mReferences - 1;
      mReferences = i;
      if (i <= 0) {
        ((GhostViewHolder)paramView.getParent()).removeView(paramView);
      }
    }
  }
  
  public static void setGhostView(@NonNull View paramView, @Nullable GhostViewPort paramGhostViewPort)
  {
    paramView.setTag(R.id.ghost_view, paramGhostViewPort);
  }
  
  public void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    setGhostView(mView, this);
    mView.getViewTreeObserver().addOnPreDrawListener(mOnPreDrawListener);
    ViewUtils.setTransitionVisibility(mView, 4);
    if (mView.getParent() != null) {
      ((View)mView.getParent()).invalidate();
    }
  }
  
  public void onDetachedFromWindow()
  {
    mView.getViewTreeObserver().removeOnPreDrawListener(mOnPreDrawListener);
    ViewUtils.setTransitionVisibility(mView, 0);
    setGhostView(mView, null);
    if (mView.getParent() != null) {
      ((View)mView.getParent()).invalidate();
    }
    super.onDetachedFromWindow();
  }
  
  public void onDraw(Canvas paramCanvas)
  {
    CanvasUtils.enableZ(paramCanvas, true);
    paramCanvas.setMatrix(mMatrix);
    ViewUtils.setTransitionVisibility(mView, 0);
    mView.invalidate();
    ViewUtils.setTransitionVisibility(mView, 4);
    drawChild(paramCanvas, mView, getDrawingTime());
    CanvasUtils.enableZ(paramCanvas, false);
  }
  
  public void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {}
  
  public void reserveEndViewTransition(ViewGroup paramViewGroup, View paramView)
  {
    mStartParent = paramViewGroup;
    mStartView = paramView;
  }
  
  public void setMatrix(@NonNull Matrix paramMatrix)
  {
    mMatrix = paramMatrix;
  }
  
  public void setVisibility(int paramInt)
  {
    super.setVisibility(paramInt);
    if (getGhostView(mView) == this)
    {
      if (paramInt == 0) {
        paramInt = 4;
      } else {
        paramInt = 0;
      }
      ViewUtils.setTransitionVisibility(mView, paramInt);
    }
  }
}

/* Location:
 * Qualified Name:     androidx.transition.GhostViewPort
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */