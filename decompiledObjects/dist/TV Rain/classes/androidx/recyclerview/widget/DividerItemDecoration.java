package androidx.recyclerview.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class DividerItemDecoration
  extends RecyclerView.ItemDecoration
{
  private static final int[] ATTRS = { 16843284 };
  public static final int HORIZONTAL = 0;
  private static final String TAG = "DividerItem";
  public static final int VERTICAL = 1;
  private final Rect mBounds = new Rect();
  private Drawable mDivider;
  private int mOrientation;
  
  public DividerItemDecoration(Context paramContext, int paramInt)
  {
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(ATTRS);
    paramContext = localTypedArray.getDrawable(0);
    mDivider = paramContext;
    if (paramContext == null) {
      Log.w("DividerItem", "@android:attr/listDivider was not set in the theme used for this DividerItemDecoration. Please set that attribute all call setDrawable()");
    }
    localTypedArray.recycle();
    setOrientation(paramInt);
  }
  
  private void drawHorizontal(Canvas paramCanvas, RecyclerView paramRecyclerView)
  {
    paramCanvas.save();
    boolean bool = paramRecyclerView.getClipToPadding();
    int i = 0;
    int j;
    int k;
    if (bool)
    {
      j = paramRecyclerView.getPaddingTop();
      k = paramRecyclerView.getHeight() - paramRecyclerView.getPaddingBottom();
      paramCanvas.clipRect(paramRecyclerView.getPaddingLeft(), j, paramRecyclerView.getWidth() - paramRecyclerView.getPaddingRight(), k);
    }
    else
    {
      k = paramRecyclerView.getHeight();
      j = 0;
    }
    int m = paramRecyclerView.getChildCount();
    while (i < m)
    {
      View localView = paramRecyclerView.getChildAt(i);
      paramRecyclerView.getLayoutManager().getDecoratedBoundsWithMargins(localView, mBounds);
      int n = mBounds.right;
      n = Math.round(localView.getTranslationX()) + n;
      int i1 = mDivider.getIntrinsicWidth();
      mDivider.setBounds(n - i1, j, n, k);
      mDivider.draw(paramCanvas);
      i++;
    }
    paramCanvas.restore();
  }
  
  private void drawVertical(Canvas paramCanvas, RecyclerView paramRecyclerView)
  {
    paramCanvas.save();
    boolean bool = paramRecyclerView.getClipToPadding();
    int i = 0;
    int j;
    int k;
    if (bool)
    {
      j = paramRecyclerView.getPaddingLeft();
      k = paramRecyclerView.getWidth() - paramRecyclerView.getPaddingRight();
      paramCanvas.clipRect(j, paramRecyclerView.getPaddingTop(), k, paramRecyclerView.getHeight() - paramRecyclerView.getPaddingBottom());
    }
    else
    {
      k = paramRecyclerView.getWidth();
      j = 0;
    }
    int m = paramRecyclerView.getChildCount();
    while (i < m)
    {
      View localView = paramRecyclerView.getChildAt(i);
      paramRecyclerView.getDecoratedBoundsWithMargins(localView, mBounds);
      int n = mBounds.bottom;
      int i1 = Math.round(localView.getTranslationY()) + n;
      n = mDivider.getIntrinsicHeight();
      mDivider.setBounds(j, i1 - n, k, i1);
      mDivider.draw(paramCanvas);
      i++;
    }
    paramCanvas.restore();
  }
  
  @Nullable
  public Drawable getDrawable()
  {
    return mDivider;
  }
  
  public void getItemOffsets(Rect paramRect, View paramView, RecyclerView paramRecyclerView, RecyclerView.State paramState)
  {
    paramView = mDivider;
    if (paramView == null)
    {
      paramRect.set(0, 0, 0, 0);
      return;
    }
    if (mOrientation == 1) {
      paramRect.set(0, 0, 0, paramView.getIntrinsicHeight());
    } else {
      paramRect.set(0, 0, paramView.getIntrinsicWidth(), 0);
    }
  }
  
  public void onDraw(Canvas paramCanvas, RecyclerView paramRecyclerView, RecyclerView.State paramState)
  {
    if ((paramRecyclerView.getLayoutManager() != null) && (mDivider != null)) {
      if (mOrientation == 1) {
        drawVertical(paramCanvas, paramRecyclerView);
      } else {
        drawHorizontal(paramCanvas, paramRecyclerView);
      }
    }
  }
  
  public void setDrawable(@NonNull Drawable paramDrawable)
  {
    if (paramDrawable != null)
    {
      mDivider = paramDrawable;
      return;
    }
    throw new IllegalArgumentException("Drawable cannot be null.");
  }
  
  public void setOrientation(int paramInt)
  {
    if ((paramInt != 0) && (paramInt != 1)) {
      throw new IllegalArgumentException("Invalid orientation. It should be either HORIZONTAL or VERTICAL");
    }
    mOrientation = paramInt;
  }
}

/* Location:
 * Qualified Name:     androidx.recyclerview.widget.DividerItemDecoration
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */