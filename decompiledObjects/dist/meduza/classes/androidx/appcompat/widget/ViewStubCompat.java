package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import b.a0;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

public final class ViewStubCompat
  extends View
{
  public int a = 0;
  public int b;
  public WeakReference<View> c;
  public LayoutInflater d;
  
  public ViewStubCompat(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet, 0);
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, a0.N, 0, 0);
    b = paramContext.getResourceId(2, -1);
    a = paramContext.getResourceId(1, 0);
    setId(paramContext.getResourceId(0, -1));
    paramContext.recycle();
    setVisibility(8);
    setWillNotDraw(true);
  }
  
  public final View a()
  {
    Object localObject = getParent();
    if ((localObject instanceof ViewGroup))
    {
      if (a != 0)
      {
        ViewGroup localViewGroup = (ViewGroup)localObject;
        localObject = d;
        if (localObject == null) {
          localObject = LayoutInflater.from(getContext());
        }
        localObject = ((LayoutInflater)localObject).inflate(a, localViewGroup, false);
        int i = b;
        if (i != -1) {
          ((View)localObject).setId(i);
        }
        i = localViewGroup.indexOfChild(this);
        localViewGroup.removeViewInLayout(this);
        ViewGroup.LayoutParams localLayoutParams = getLayoutParams();
        if (localLayoutParams != null) {
          localViewGroup.addView((View)localObject, i, localLayoutParams);
        } else {
          localViewGroup.addView((View)localObject, i);
        }
        c = new WeakReference(localObject);
        return (View)localObject;
      }
      throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
    }
    throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
  }
  
  public final void dispatchDraw(Canvas paramCanvas) {}
  
  public final void draw(Canvas paramCanvas) {}
  
  public int getInflatedId()
  {
    return b;
  }
  
  public LayoutInflater getLayoutInflater()
  {
    return d;
  }
  
  public int getLayoutResource()
  {
    return a;
  }
  
  public final void onMeasure(int paramInt1, int paramInt2)
  {
    setMeasuredDimension(0, 0);
  }
  
  public void setInflatedId(int paramInt)
  {
    b = paramInt;
  }
  
  public void setLayoutInflater(LayoutInflater paramLayoutInflater)
  {
    d = paramLayoutInflater;
  }
  
  public void setLayoutResource(int paramInt)
  {
    a = paramInt;
  }
  
  public void setOnInflateListener(a parama) {}
  
  public void setVisibility(int paramInt)
  {
    Object localObject = c;
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
        a();
      }
    }
  }
  
  public static abstract interface a
  {
    public abstract void a();
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.ViewStubCompat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */