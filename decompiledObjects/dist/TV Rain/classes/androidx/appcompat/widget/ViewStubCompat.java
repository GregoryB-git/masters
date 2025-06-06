package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R.styleable;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class ViewStubCompat
  extends View
{
  private OnInflateListener mInflateListener;
  private int mInflatedId;
  private WeakReference<View> mInflatedViewRef;
  private LayoutInflater mInflater;
  private int mLayoutResource = 0;
  
  public ViewStubCompat(@NonNull Context paramContext, @Nullable AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public ViewStubCompat(@NonNull Context paramContext, @Nullable AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, R.styleable.ViewStubCompat, paramInt, 0);
    mInflatedId = paramContext.getResourceId(R.styleable.ViewStubCompat_android_inflatedId, -1);
    mLayoutResource = paramContext.getResourceId(R.styleable.ViewStubCompat_android_layout, 0);
    setId(paramContext.getResourceId(R.styleable.ViewStubCompat_android_id, -1));
    paramContext.recycle();
    setVisibility(8);
    setWillNotDraw(true);
  }
  
  public void dispatchDraw(Canvas paramCanvas) {}
  
  @SuppressLint({"MissingSuperCall"})
  public void draw(Canvas paramCanvas) {}
  
  public int getInflatedId()
  {
    return mInflatedId;
  }
  
  public LayoutInflater getLayoutInflater()
  {
    return mInflater;
  }
  
  public int getLayoutResource()
  {
    return mLayoutResource;
  }
  
  public View inflate()
  {
    Object localObject1 = getParent();
    if ((localObject1 instanceof ViewGroup))
    {
      if (mLayoutResource != 0)
      {
        Object localObject2 = (ViewGroup)localObject1;
        localObject1 = mInflater;
        if (localObject1 == null) {
          localObject1 = LayoutInflater.from(getContext());
        }
        localObject1 = ((LayoutInflater)localObject1).inflate(mLayoutResource, (ViewGroup)localObject2, false);
        int i = mInflatedId;
        if (i != -1) {
          ((View)localObject1).setId(i);
        }
        i = ((ViewGroup)localObject2).indexOfChild(this);
        ((ViewGroup)localObject2).removeViewInLayout(this);
        ViewGroup.LayoutParams localLayoutParams = getLayoutParams();
        if (localLayoutParams != null) {
          ((ViewGroup)localObject2).addView((View)localObject1, i, localLayoutParams);
        } else {
          ((ViewGroup)localObject2).addView((View)localObject1, i);
        }
        mInflatedViewRef = new WeakReference(localObject1);
        localObject2 = mInflateListener;
        if (localObject2 != null) {
          ((OnInflateListener)localObject2).onInflate(this, (View)localObject1);
        }
        return (View)localObject1;
      }
      throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
    }
    throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
  }
  
  public void onMeasure(int paramInt1, int paramInt2)
  {
    setMeasuredDimension(0, 0);
  }
  
  public void setInflatedId(int paramInt)
  {
    mInflatedId = paramInt;
  }
  
  public void setLayoutInflater(LayoutInflater paramLayoutInflater)
  {
    mInflater = paramLayoutInflater;
  }
  
  public void setLayoutResource(int paramInt)
  {
    mLayoutResource = paramInt;
  }
  
  public void setOnInflateListener(OnInflateListener paramOnInflateListener)
  {
    mInflateListener = paramOnInflateListener;
  }
  
  public void setVisibility(int paramInt)
  {
    Object localObject = mInflatedViewRef;
    if (localObject != null)
    {
      localObject = (View)((Reference)localObject).get();
      if (localObject != null) {
        ((View)localObject).setVisibility(paramInt);
      } else {
        throw new IllegalStateException("setVisibility called on un-referenced view");
      }
    }
    else
    {
      super.setVisibility(paramInt);
      if ((paramInt == 0) || (paramInt == 4)) {
        inflate();
      }
    }
  }
  
  public static abstract interface OnInflateListener
  {
    public abstract void onInflate(ViewStubCompat paramViewStubCompat, View paramView);
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.ViewStubCompat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */