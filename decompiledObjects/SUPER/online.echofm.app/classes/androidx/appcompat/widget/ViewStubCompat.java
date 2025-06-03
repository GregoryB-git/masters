package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import androidx.annotation.NonNull;
import e.i;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

public final class ViewStubCompat
  extends View
{
  public int o = 0;
  public int p;
  public WeakReference q;
  public LayoutInflater r;
  
  public ViewStubCompat(@NonNull Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public ViewStubCompat(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, i.S2, paramInt, 0);
    p = paramContext.getResourceId(i.V2, -1);
    o = paramContext.getResourceId(i.U2, 0);
    setId(paramContext.getResourceId(i.T2, -1));
    paramContext.recycle();
    setVisibility(8);
    setWillNotDraw(true);
  }
  
  public View a()
  {
    Object localObject = getParent();
    if ((localObject instanceof ViewGroup))
    {
      if (o != 0)
      {
        ViewGroup localViewGroup = (ViewGroup)localObject;
        localObject = r;
        if (localObject == null) {
          localObject = LayoutInflater.from(getContext());
        }
        localObject = ((LayoutInflater)localObject).inflate(o, localViewGroup, false);
        int i = p;
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
        q = new WeakReference(localObject);
        return (View)localObject;
      }
      throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
    }
    throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
  }
  
  public void dispatchDraw(Canvas paramCanvas) {}
  
  public void draw(Canvas paramCanvas) {}
  
  public int getInflatedId()
  {
    return p;
  }
  
  public LayoutInflater getLayoutInflater()
  {
    return r;
  }
  
  public int getLayoutResource()
  {
    return o;
  }
  
  public void onMeasure(int paramInt1, int paramInt2)
  {
    setMeasuredDimension(0, 0);
  }
  
  public void setInflatedId(int paramInt)
  {
    p = paramInt;
  }
  
  public void setLayoutInflater(LayoutInflater paramLayoutInflater)
  {
    r = paramLayoutInflater;
  }
  
  public void setLayoutResource(int paramInt)
  {
    o = paramInt;
  }
  
  public void setOnInflateListener(a parama) {}
  
  public void setVisibility(int paramInt)
  {
    Object localObject = q;
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
  
  public static abstract interface a {}
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.ViewStubCompat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */