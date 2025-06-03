package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import r.d;

public class CardView
  extends FrameLayout
{
  public static final int[] v = { 16842801 };
  public static final s.c w;
  public boolean o;
  public boolean p;
  public int q;
  public int r;
  public final Rect s;
  public final Rect t;
  public final s.b u;
  
  static
  {
    s.a locala = new s.a();
    w = locala;
    locala.f();
  }
  
  public CardView(@NonNull Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, r.a.a);
  }
  
  public CardView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    Rect localRect = new Rect();
    s = localRect;
    t = new Rect();
    a locala = new a();
    u = locala;
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, d.a, paramInt, r.c.a);
    if (localTypedArray.hasValue(d.d)) {}
    for (paramAttributeSet = localTypedArray.getColorStateList(d.d);; paramAttributeSet = ColorStateList.valueOf(paramInt))
    {
      break;
      paramAttributeSet = getContext().obtainStyledAttributes(v);
      paramInt = paramAttributeSet.getColor(0, 0);
      paramAttributeSet.recycle();
      paramAttributeSet = new float[3];
      Color.colorToHSV(paramInt, paramAttributeSet);
      if (paramAttributeSet[2] > 0.5F) {
        paramAttributeSet = getResources();
      }
      for (paramInt = r.b.b;; paramInt = r.b.a)
      {
        paramInt = paramAttributeSet.getColor(paramInt);
        break;
        paramAttributeSet = getResources();
      }
    }
    float f1 = localTypedArray.getDimension(d.e, 0.0F);
    float f2 = localTypedArray.getDimension(d.f, 0.0F);
    float f3 = localTypedArray.getDimension(d.g, 0.0F);
    o = localTypedArray.getBoolean(d.i, false);
    p = localTypedArray.getBoolean(d.h, true);
    paramInt = localTypedArray.getDimensionPixelSize(d.j, 0);
    left = localTypedArray.getDimensionPixelSize(d.l, paramInt);
    top = localTypedArray.getDimensionPixelSize(d.n, paramInt);
    right = localTypedArray.getDimensionPixelSize(d.m, paramInt);
    bottom = localTypedArray.getDimensionPixelSize(d.k, paramInt);
    if (f2 > f3) {
      f3 = f2;
    }
    q = localTypedArray.getDimensionPixelSize(d.b, 0);
    r = localTypedArray.getDimensionPixelSize(d.c, 0);
    localTypedArray.recycle();
    w.j(locala, paramContext, paramAttributeSet, f1, f2, f3);
  }
  
  @NonNull
  public ColorStateList getCardBackgroundColor()
  {
    return w.h(u);
  }
  
  public float getCardElevation()
  {
    return w.e(u);
  }
  
  public int getContentPaddingBottom()
  {
    return s.bottom;
  }
  
  public int getContentPaddingLeft()
  {
    return s.left;
  }
  
  public int getContentPaddingRight()
  {
    return s.right;
  }
  
  public int getContentPaddingTop()
  {
    return s.top;
  }
  
  public float getMaxCardElevation()
  {
    return w.i(u);
  }
  
  public boolean getPreventCornerOverlap()
  {
    return p;
  }
  
  public float getRadius()
  {
    return w.b(u);
  }
  
  public boolean getUseCompatPadding()
  {
    return o;
  }
  
  public void onMeasure(int paramInt1, int paramInt2)
  {
    s.c localc = w;
    int i = paramInt1;
    int j = paramInt2;
    if (!(localc instanceof s.a))
    {
      j = View.MeasureSpec.getMode(paramInt1);
      if ((j == Integer.MIN_VALUE) || (j == 1073741824)) {
        paramInt1 = View.MeasureSpec.makeMeasureSpec(Math.max((int)Math.ceil(localc.c(u)), View.MeasureSpec.getSize(paramInt1)), j);
      }
      j = View.MeasureSpec.getMode(paramInt2);
      if ((j != Integer.MIN_VALUE) && (j != 1073741824))
      {
        i = paramInt1;
        j = paramInt2;
      }
      else
      {
        j = View.MeasureSpec.makeMeasureSpec(Math.max((int)Math.ceil(localc.n(u)), View.MeasureSpec.getSize(paramInt2)), j);
        i = paramInt1;
      }
    }
    super.onMeasure(i, j);
  }
  
  public void setCardBackgroundColor(int paramInt)
  {
    w.m(u, ColorStateList.valueOf(paramInt));
  }
  
  public void setCardBackgroundColor(ColorStateList paramColorStateList)
  {
    w.m(u, paramColorStateList);
  }
  
  public void setCardElevation(float paramFloat)
  {
    w.a(u, paramFloat);
  }
  
  public void setMaxCardElevation(float paramFloat)
  {
    w.l(u, paramFloat);
  }
  
  public void setMinimumHeight(int paramInt)
  {
    r = paramInt;
    super.setMinimumHeight(paramInt);
  }
  
  public void setMinimumWidth(int paramInt)
  {
    q = paramInt;
    super.setMinimumWidth(paramInt);
  }
  
  public void setPadding(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {}
  
  public void setPaddingRelative(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {}
  
  public void setPreventCornerOverlap(boolean paramBoolean)
  {
    if (paramBoolean != p)
    {
      p = paramBoolean;
      w.k(u);
    }
  }
  
  public void setRadius(float paramFloat)
  {
    w.g(u, paramFloat);
  }
  
  public void setUseCompatPadding(boolean paramBoolean)
  {
    if (o != paramBoolean)
    {
      o = paramBoolean;
      w.d(u);
    }
  }
  
  public class a
    implements s.b
  {
    public Drawable a;
    
    public a() {}
    
    public View a()
    {
      return CardView.this;
    }
    
    public void b(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      t.set(paramInt1, paramInt2, paramInt3, paramInt4);
      CardView localCardView = CardView.this;
      Rect localRect = s;
      CardView.a(localCardView, paramInt1 + left, paramInt2 + top, paramInt3 + right, paramInt4 + bottom);
    }
    
    public void c(Drawable paramDrawable)
    {
      a = paramDrawable;
      setBackgroundDrawable(paramDrawable);
    }
    
    public boolean d()
    {
      return getPreventCornerOverlap();
    }
    
    public boolean e()
    {
      return getUseCompatPadding();
    }
    
    public Drawable f()
    {
      return a;
    }
  }
}

/* Location:
 * Qualified Name:     androidx.cardview.widget.CardView
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */