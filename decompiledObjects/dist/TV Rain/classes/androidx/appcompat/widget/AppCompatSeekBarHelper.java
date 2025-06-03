package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AbsSeekBar;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import androidx.annotation.Nullable;
import androidx.appcompat.R.styleable;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.ViewCompat;

class AppCompatSeekBarHelper
  extends AppCompatProgressBarHelper
{
  private boolean mHasTickMarkTint = false;
  private boolean mHasTickMarkTintMode = false;
  private Drawable mTickMark;
  private ColorStateList mTickMarkTintList = null;
  private PorterDuff.Mode mTickMarkTintMode = null;
  private final SeekBar mView;
  
  public AppCompatSeekBarHelper(SeekBar paramSeekBar)
  {
    super(paramSeekBar);
    mView = paramSeekBar;
  }
  
  private void applyTickMarkTint()
  {
    Drawable localDrawable = mTickMark;
    if ((localDrawable != null) && ((mHasTickMarkTint) || (mHasTickMarkTintMode)))
    {
      localDrawable = DrawableCompat.wrap(localDrawable.mutate());
      mTickMark = localDrawable;
      if (mHasTickMarkTint) {
        DrawableCompat.setTintList(localDrawable, mTickMarkTintList);
      }
      if (mHasTickMarkTintMode) {
        DrawableCompat.setTintMode(mTickMark, mTickMarkTintMode);
      }
      if (mTickMark.isStateful()) {
        mTickMark.setState(mView.getDrawableState());
      }
    }
  }
  
  public void drawTickMarks(Canvas paramCanvas)
  {
    if (mTickMark != null)
    {
      int i = mView.getMax();
      int j = 1;
      if (i > 1)
      {
        int k = mTickMark.getIntrinsicWidth();
        int m = mTickMark.getIntrinsicHeight();
        if (k >= 0) {
          k /= 2;
        } else {
          k = 1;
        }
        if (m >= 0) {
          j = m / 2;
        }
        mTickMark.setBounds(-k, -j, k, j);
        float f = (mView.getWidth() - mView.getPaddingLeft() - mView.getPaddingRight()) / i;
        j = paramCanvas.save();
        paramCanvas.translate(mView.getPaddingLeft(), mView.getHeight() / 2);
        for (k = 0; k <= i; k++)
        {
          mTickMark.draw(paramCanvas);
          paramCanvas.translate(f, 0.0F);
        }
        paramCanvas.restoreToCount(j);
      }
    }
  }
  
  public void drawableStateChanged()
  {
    Drawable localDrawable = mTickMark;
    if ((localDrawable != null) && (localDrawable.isStateful()) && (localDrawable.setState(mView.getDrawableState()))) {
      mView.invalidateDrawable(localDrawable);
    }
  }
  
  @Nullable
  public Drawable getTickMark()
  {
    return mTickMark;
  }
  
  @Nullable
  public ColorStateList getTickMarkTintList()
  {
    return mTickMarkTintList;
  }
  
  @Nullable
  public PorterDuff.Mode getTickMarkTintMode()
  {
    return mTickMarkTintMode;
  }
  
  public void jumpDrawablesToCurrentState()
  {
    Drawable localDrawable = mTickMark;
    if (localDrawable != null) {
      localDrawable.jumpToCurrentState();
    }
  }
  
  public void loadFromAttributes(AttributeSet paramAttributeSet, int paramInt)
  {
    super.loadFromAttributes(paramAttributeSet, paramInt);
    Object localObject = mView.getContext();
    int[] arrayOfInt = R.styleable.AppCompatSeekBar;
    localObject = TintTypedArray.obtainStyledAttributes((Context)localObject, paramAttributeSet, arrayOfInt, paramInt, 0);
    SeekBar localSeekBar = mView;
    ViewCompat.saveAttributeDataForStyleable(localSeekBar, localSeekBar.getContext(), arrayOfInt, paramAttributeSet, ((TintTypedArray)localObject).getWrappedTypeArray(), paramInt, 0);
    paramAttributeSet = ((TintTypedArray)localObject).getDrawableIfKnown(R.styleable.AppCompatSeekBar_android_thumb);
    if (paramAttributeSet != null) {
      mView.setThumb(paramAttributeSet);
    }
    setTickMark(((TintTypedArray)localObject).getDrawable(R.styleable.AppCompatSeekBar_tickMark));
    paramInt = R.styleable.AppCompatSeekBar_tickMarkTintMode;
    if (((TintTypedArray)localObject).hasValue(paramInt))
    {
      mTickMarkTintMode = DrawableUtils.parseTintMode(((TintTypedArray)localObject).getInt(paramInt, -1), mTickMarkTintMode);
      mHasTickMarkTintMode = true;
    }
    paramInt = R.styleable.AppCompatSeekBar_tickMarkTint;
    if (((TintTypedArray)localObject).hasValue(paramInt))
    {
      mTickMarkTintList = ((TintTypedArray)localObject).getColorStateList(paramInt);
      mHasTickMarkTint = true;
    }
    ((TintTypedArray)localObject).recycle();
    applyTickMarkTint();
  }
  
  public void setTickMark(@Nullable Drawable paramDrawable)
  {
    Drawable localDrawable = mTickMark;
    if (localDrawable != null) {
      localDrawable.setCallback(null);
    }
    mTickMark = paramDrawable;
    if (paramDrawable != null)
    {
      paramDrawable.setCallback(mView);
      DrawableCompat.setLayoutDirection(paramDrawable, ViewCompat.getLayoutDirection(mView));
      if (paramDrawable.isStateful()) {
        paramDrawable.setState(mView.getDrawableState());
      }
      applyTickMarkTint();
    }
    mView.invalidate();
  }
  
  public void setTickMarkTintList(@Nullable ColorStateList paramColorStateList)
  {
    mTickMarkTintList = paramColorStateList;
    mHasTickMarkTint = true;
    applyTickMarkTint();
  }
  
  public void setTickMarkTintMode(@Nullable PorterDuff.Mode paramMode)
  {
    mTickMarkTintMode = paramMode;
    mHasTickMarkTintMode = true;
    applyTickMarkTint();
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.AppCompatSeekBarHelper
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */