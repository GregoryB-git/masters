package a2;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.FillType;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.VectorDrawable;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import r.h;
import w.c;
import w.k;
import x.d;
import x.d.a;
import y.a.a;
import y.a.b;

public final class f
  extends e
{
  public static final PorterDuff.Mode r = PorterDuff.Mode.SRC_IN;
  public g b;
  public PorterDuffColorFilter c;
  public ColorFilter d;
  public boolean e;
  public boolean f = true;
  public final float[] o = new float[9];
  public final Matrix p = new Matrix();
  public final Rect q = new Rect();
  
  public f()
  {
    b = new g();
  }
  
  public f(g paramg)
  {
    b = paramg;
    c = a(c, d);
  }
  
  public final PorterDuffColorFilter a(ColorStateList paramColorStateList, PorterDuff.Mode paramMode)
  {
    if ((paramColorStateList != null) && (paramMode != null)) {
      return new PorterDuffColorFilter(paramColorStateList.getColorForState(getState(), 0), paramMode);
    }
    return null;
  }
  
  public final boolean canApplyTheme()
  {
    Drawable localDrawable = a;
    if (localDrawable != null) {
      a.a.b(localDrawable);
    }
    return false;
  }
  
  public final void draw(Canvas paramCanvas)
  {
    Object localObject1 = a;
    if (localObject1 != null)
    {
      ((Drawable)localObject1).draw(paramCanvas);
      return;
    }
    copyBounds(q);
    if ((q.width() > 0) && (q.height() > 0))
    {
      Object localObject2 = d;
      localObject1 = localObject2;
      if (localObject2 == null) {
        localObject1 = c;
      }
      paramCanvas.getMatrix(p);
      p.getValues(o);
      localObject2 = o;
      int i = 0;
      float f1 = Math.abs(localObject2[0]);
      float f2 = Math.abs(o[4]);
      float f3 = Math.abs(o[1]);
      float f4 = Math.abs(o[3]);
      if ((f3 != 0.0F) || (f4 != 0.0F))
      {
        f1 = 1.0F;
        f2 = f1;
      }
      int j = (int)(q.width() * f1);
      int k = (int)(q.height() * f2);
      int m = Math.min(2048, j);
      int n = Math.min(2048, k);
      if ((m > 0) && (n > 0))
      {
        j = paramCanvas.save();
        localObject2 = q;
        paramCanvas.translate(left, top);
        if ((isAutoMirrored()) && (a.b.a(this) == 1)) {
          k = 1;
        } else {
          k = 0;
        }
        if (k != 0)
        {
          paramCanvas.translate(q.width(), 0.0F);
          paramCanvas.scale(-1.0F, 1.0F);
        }
        q.offsetTo(0, 0);
        Object localObject3 = b;
        localObject2 = f;
        if (localObject2 != null)
        {
          if ((m == ((Bitmap)localObject2).getWidth()) && (n == f.getHeight())) {
            k = 1;
          } else {
            k = 0;
          }
          if (k != 0) {}
        }
        else
        {
          f = Bitmap.createBitmap(m, n, Bitmap.Config.ARGB_8888);
          k = true;
        }
        if (!f)
        {
          localObject3 = b;
          f.eraseColor(0);
          localObject2 = new Canvas(f);
          localObject3 = b;
          ((f)localObject3).a(g, f.p, (Canvas)localObject2, m, n);
        }
        else
        {
          localObject2 = b;
          if ((!k) && (g == c) && (h == d) && (j == e) && (i == b.getRootAlpha())) {
            k = 1;
          } else {
            k = 0;
          }
          if (k == 0)
          {
            localObject3 = b;
            f.eraseColor(0);
            localObject2 = new Canvas(f);
            localObject3 = b;
            ((f)localObject3).a(g, f.p, (Canvas)localObject2, m, n);
            localObject2 = b;
            g = c;
            h = d;
            i = b.getRootAlpha();
            j = e;
            k = false;
          }
        }
        localObject2 = b;
        localObject3 = q;
        k = i;
        if (b.getRootAlpha() < 255) {
          k = 1;
        }
        if ((k == 0) && (localObject1 == null))
        {
          localObject1 = null;
        }
        else
        {
          if (l == null)
          {
            Paint localPaint = new Paint();
            l = localPaint;
            localPaint.setFilterBitmap(true);
          }
          l.setAlpha(b.getRootAlpha());
          l.setColorFilter((ColorFilter)localObject1);
          localObject1 = l;
        }
        paramCanvas.drawBitmap(f, null, (Rect)localObject3, (Paint)localObject1);
        paramCanvas.restoreToCount(j);
      }
    }
  }
  
  public final int getAlpha()
  {
    Drawable localDrawable = a;
    if (localDrawable != null) {
      return localDrawable.getAlpha();
    }
    return b.b.getRootAlpha();
  }
  
  public final int getChangingConfigurations()
  {
    Drawable localDrawable = a;
    if (localDrawable != null) {
      return localDrawable.getChangingConfigurations();
    }
    return super.getChangingConfigurations() | b.getChangingConfigurations();
  }
  
  public final ColorFilter getColorFilter()
  {
    Drawable localDrawable = a;
    if (localDrawable != null) {
      return a.a.c(localDrawable);
    }
    return d;
  }
  
  public final Drawable.ConstantState getConstantState()
  {
    if ((a != null) && (Build.VERSION.SDK_INT >= 24)) {
      return new h(a.getConstantState());
    }
    b.a = getChangingConfigurations();
    return b;
  }
  
  public final int getIntrinsicHeight()
  {
    Drawable localDrawable = a;
    if (localDrawable != null) {
      return localDrawable.getIntrinsicHeight();
    }
    return (int)b.b.i;
  }
  
  public final int getIntrinsicWidth()
  {
    Drawable localDrawable = a;
    if (localDrawable != null) {
      return localDrawable.getIntrinsicWidth();
    }
    return (int)b.b.h;
  }
  
  public final int getOpacity()
  {
    Drawable localDrawable = a;
    if (localDrawable != null) {
      return localDrawable.getOpacity();
    }
    return -3;
  }
  
  public final void inflate(Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet)
  {
    Drawable localDrawable = a;
    if (localDrawable != null)
    {
      localDrawable.inflate(paramResources, paramXmlPullParser, paramAttributeSet);
      return;
    }
    inflate(paramResources, paramXmlPullParser, paramAttributeSet, null);
  }
  
  public final void inflate(Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme)
  {
    Object localObject1 = a;
    if (localObject1 != null)
    {
      a.a.d((Drawable)localObject1, paramResources, paramXmlPullParser, paramAttributeSet, paramTheme);
      return;
    }
    g localg = b;
    b = new f();
    Object localObject3 = k.f(paramResources, paramTheme, paramAttributeSet, a.a);
    Object localObject4 = b;
    Object localObject5 = b;
    int i = k.c((TypedArray)localObject3, paramXmlPullParser, "tintMode", 6, -1);
    Object localObject6 = PorterDuff.Mode.SRC_IN;
    int j = 3;
    if (i != 3)
    {
      localObject1 = localObject6;
      if (i != 5) {
        if (i != 9) {
          switch (i)
          {
          default: 
            localObject1 = localObject6;
            break;
          case 16: 
            localObject1 = PorterDuff.Mode.ADD;
            break;
          case 15: 
            localObject1 = PorterDuff.Mode.SCREEN;
            break;
          case 14: 
            localObject1 = PorterDuff.Mode.MULTIPLY;
            break;
          }
        } else {
          localObject1 = PorterDuff.Mode.SRC_ATOP;
        }
      }
    }
    else
    {
      localObject1 = PorterDuff.Mode.SRC_OVER;
    }
    d = ((PorterDuff.Mode)localObject1);
    boolean bool1 = k.e(paramXmlPullParser, "tint");
    boolean bool2 = false;
    if (bool1)
    {
      localObject1 = new TypedValue();
      ((TypedArray)localObject3).getValue(1, (TypedValue)localObject1);
      i = type;
      if (i != 2)
      {
        if ((i >= 28) && (i <= 31))
        {
          localObject1 = ColorStateList.valueOf(data);
          break label375;
        }
        localObject1 = ((TypedArray)localObject3).getResources();
        i = ((TypedArray)localObject3).getResourceId(1, 0);
        localObject6 = w.b.a;
        try
        {
          localObject1 = w.b.a((Resources)localObject1, ((Resources)localObject1).getXml(i), paramTheme);
        }
        catch (Exception localException)
        {
          Log.e("CSLCompat", "Failed to inflate ColorStateList.", localException);
          break label372;
        }
      }
      else
      {
        paramResources = new StringBuilder();
        paramResources.append("Failed to resolve attribute at index ");
        paramResources.append(1);
        paramResources.append(": ");
        paramResources.append(localException);
        throw new UnsupportedOperationException(paramResources.toString());
      }
    }
    label372:
    Object localObject2 = null;
    label375:
    if (localObject2 != null) {
      c = ((ColorStateList)localObject2);
    }
    bool1 = e;
    if (k.e(paramXmlPullParser, "autoMirrored")) {
      bool1 = ((TypedArray)localObject3).getBoolean(5, bool1);
    }
    e = bool1;
    j = k.b((TypedArray)localObject3, paramXmlPullParser, "viewportWidth", 7, j);
    float f1 = k.b((TypedArray)localObject3, paramXmlPullParser, "viewportHeight", 8, k);
    k = f1;
    if (j > 0.0F)
    {
      if (f1 > 0.0F)
      {
        h = ((TypedArray)localObject3).getDimension(3, h);
        f1 = ((TypedArray)localObject3).getDimension(2, i);
        i = f1;
        if (h > 0.0F)
        {
          if (f1 > 0.0F)
          {
            ((f)localObject5).setAlpha(k.b((TypedArray)localObject3, paramXmlPullParser, "alpha", 4, ((f)localObject5).getAlpha()));
            localObject2 = ((TypedArray)localObject3).getString(0);
            if (localObject2 != null)
            {
              m = ((String)localObject2);
              o.put(localObject2, localObject5);
            }
            ((TypedArray)localObject3).recycle();
            a = getChangingConfigurations();
            k = true;
            localObject5 = b;
            localObject6 = b;
            localObject3 = new ArrayDeque();
            ((ArrayDeque)localObject3).push(g);
            int k = paramXmlPullParser.getEventType();
            i = paramXmlPullParser.getDepth() + 1;
            int m = 1;
            bool1 = bool2;
            while ((k != 1) && ((paramXmlPullParser.getDepth() >= i) || (k != j)))
            {
              int n;
              if (k == 2)
              {
                localObject2 = paramXmlPullParser.getName();
                localObject4 = (c)((ArrayDeque)localObject3).peek();
                Object localObject7;
                Object localObject8;
                if ("path".equals(localObject2))
                {
                  localObject7 = new b();
                  localObject8 = k.f(paramResources, paramTheme, paramAttributeSet, a.c);
                  if (k.e(paramXmlPullParser, "pathData"))
                  {
                    localObject2 = ((TypedArray)localObject8).getString(0);
                    if (localObject2 != null) {
                      b = ((String)localObject2);
                    }
                    localObject2 = ((TypedArray)localObject8).getString(2);
                    if (localObject2 != null) {
                      a = d.c((String)localObject2);
                    }
                    g = k.a((TypedArray)localObject8, paramXmlPullParser, paramTheme, "fillColor", 1);
                    i = k.b((TypedArray)localObject8, paramXmlPullParser, "fillAlpha", 12, i);
                    m = k.c((TypedArray)localObject8, paramXmlPullParser, "strokeLineCap", 8, -1);
                    localObject2 = m;
                    if (m != 0)
                    {
                      if (m != 1)
                      {
                        if (m == 2) {
                          localObject2 = Paint.Cap.SQUARE;
                        }
                      }
                      else {
                        localObject2 = Paint.Cap.ROUND;
                      }
                    }
                    else {
                      localObject2 = Paint.Cap.BUTT;
                    }
                    m = ((Paint.Cap)localObject2);
                    m = k.c((TypedArray)localObject8, paramXmlPullParser, "strokeLineJoin", 9, -1);
                    localObject2 = n;
                    if (m != 0)
                    {
                      if (m != 1)
                      {
                        if (m == 2) {
                          localObject2 = Paint.Join.BEVEL;
                        }
                      }
                      else {
                        localObject2 = Paint.Join.ROUND;
                      }
                    }
                    else {
                      localObject2 = Paint.Join.MITER;
                    }
                    n = ((Paint.Join)localObject2);
                    o = k.b((TypedArray)localObject8, paramXmlPullParser, "strokeMiterLimit", 10, o);
                    e = k.a((TypedArray)localObject8, paramXmlPullParser, paramTheme, "strokeColor", 3);
                    h = k.b((TypedArray)localObject8, paramXmlPullParser, "strokeAlpha", 11, h);
                    f = k.b((TypedArray)localObject8, paramXmlPullParser, "strokeWidth", 4, f);
                    k = k.b((TypedArray)localObject8, paramXmlPullParser, "trimPathEnd", 6, k);
                    l = k.b((TypedArray)localObject8, paramXmlPullParser, "trimPathOffset", 7, l);
                    j = k.b((TypedArray)localObject8, paramXmlPullParser, "trimPathStart", 5, j);
                    c = k.c((TypedArray)localObject8, paramXmlPullParser, "fillType", 13, c);
                  }
                  ((TypedArray)localObject8).recycle();
                  b.add(localObject7);
                  if (((e)localObject7).getPathName() != null) {
                    o.put(((e)localObject7).getPathName(), localObject7);
                  }
                  m = a;
                  a = (d | m);
                  bool1 = false;
                  n = 0;
                }
                else
                {
                  if ("clip-path".equals(localObject2))
                  {
                    localObject2 = new a();
                    if (k.e(paramXmlPullParser, "pathData"))
                    {
                      localObject7 = k.f(paramResources, paramTheme, paramAttributeSet, a.d);
                      localObject8 = ((TypedArray)localObject7).getString(0);
                      if (localObject8 != null) {
                        b = ((String)localObject8);
                      }
                      localObject8 = ((TypedArray)localObject7).getString(1);
                      if (localObject8 != null) {
                        a = d.c((String)localObject8);
                      }
                      c = k.c((TypedArray)localObject7, paramXmlPullParser, "fillType", 2, 0);
                      ((TypedArray)localObject7).recycle();
                    }
                    b.add(localObject2);
                    if (((e)localObject2).getPathName() != null) {
                      o.put(((e)localObject2).getPathName(), localObject2);
                    }
                    n = a;
                    a = (d | n);
                  }
                  else if ("group".equals(localObject2))
                  {
                    localObject2 = new c();
                    localObject7 = k.f(paramResources, paramTheme, paramAttributeSet, a.b);
                    c = k.b((TypedArray)localObject7, paramXmlPullParser, "rotation", 5, c);
                    d = ((TypedArray)localObject7).getFloat(1, d);
                    e = ((TypedArray)localObject7).getFloat(2, e);
                    f = k.b((TypedArray)localObject7, paramXmlPullParser, "scaleX", 3, f);
                    g = k.b((TypedArray)localObject7, paramXmlPullParser, "scaleY", 4, g);
                    h = k.b((TypedArray)localObject7, paramXmlPullParser, "translateX", 6, h);
                    i = k.b((TypedArray)localObject7, paramXmlPullParser, "translateY", 7, i);
                    localObject8 = ((TypedArray)localObject7).getString(0);
                    if (localObject8 != null) {
                      l = ((String)localObject8);
                    }
                    ((c)localObject2).c();
                    ((TypedArray)localObject7).recycle();
                    b.add(localObject2);
                    ((ArrayDeque)localObject3).push(localObject2);
                    if (((c)localObject2).getGroupName() != null) {
                      o.put(((c)localObject2).getGroupName(), localObject2);
                    }
                    n = a;
                    a = (k | n);
                  }
                  bool1 = false;
                  n = m;
                }
              }
              else
              {
                bool2 = bool1;
                bool1 = bool2;
                n = m;
                if (k == 3)
                {
                  bool1 = bool2;
                  n = m;
                  if ("group".equals(paramXmlPullParser.getName()))
                  {
                    ((ArrayDeque)localObject3).pop();
                    n = m;
                    bool1 = bool2;
                  }
                }
              }
              k = paramXmlPullParser.next();
              j = 3;
              m = n;
            }
            if (m == 0)
            {
              c = a(c, d);
              return;
            }
            throw new XmlPullParserException("no path defined");
          }
          paramResources = new StringBuilder();
          paramResources.append(((TypedArray)localObject3).getPositionDescription());
          paramResources.append("<vector> tag requires height > 0");
          throw new XmlPullParserException(paramResources.toString());
        }
        paramResources = new StringBuilder();
        paramResources.append(((TypedArray)localObject3).getPositionDescription());
        paramResources.append("<vector> tag requires width > 0");
        throw new XmlPullParserException(paramResources.toString());
      }
      paramResources = new StringBuilder();
      paramResources.append(((TypedArray)localObject3).getPositionDescription());
      paramResources.append("<vector> tag requires viewportHeight > 0");
      throw new XmlPullParserException(paramResources.toString());
    }
    paramResources = new StringBuilder();
    paramResources.append(((TypedArray)localObject3).getPositionDescription());
    paramResources.append("<vector> tag requires viewportWidth > 0");
    throw new XmlPullParserException(paramResources.toString());
  }
  
  public final void invalidateSelf()
  {
    Drawable localDrawable = a;
    if (localDrawable != null)
    {
      localDrawable.invalidateSelf();
      return;
    }
    super.invalidateSelf();
  }
  
  public final boolean isAutoMirrored()
  {
    Drawable localDrawable = a;
    if (localDrawable != null) {
      return localDrawable.isAutoMirrored();
    }
    return b.e;
  }
  
  public final boolean isStateful()
  {
    Object localObject = a;
    if (localObject != null) {
      return ((Drawable)localObject).isStateful();
    }
    if (!super.isStateful())
    {
      localObject = b;
      if (localObject != null)
      {
        localObject = b;
        if (n == null) {
          n = Boolean.valueOf(g.a());
        }
        if (!n.booleanValue())
        {
          localObject = b.c;
          if ((localObject != null) && (((ColorStateList)localObject).isStateful())) {}
        }
      }
      else
      {
        return false;
      }
    }
    boolean bool = true;
    return bool;
  }
  
  public final Drawable mutate()
  {
    Drawable localDrawable = a;
    if (localDrawable != null)
    {
      localDrawable.mutate();
      return this;
    }
    if ((!e) && (super.mutate() == this))
    {
      b = new g(b);
      e = true;
    }
    return this;
  }
  
  public final void onBoundsChange(Rect paramRect)
  {
    Drawable localDrawable = a;
    if (localDrawable != null) {
      localDrawable.setBounds(paramRect);
    }
  }
  
  public final boolean onStateChange(int[] paramArrayOfInt)
  {
    Object localObject1 = a;
    if (localObject1 != null) {
      return ((Drawable)localObject1).setState(paramArrayOfInt);
    }
    boolean bool1 = false;
    localObject1 = b;
    ColorStateList localColorStateList = c;
    boolean bool2 = true;
    boolean bool3 = bool1;
    if (localColorStateList != null)
    {
      localObject2 = d;
      bool3 = bool1;
      if (localObject2 != null)
      {
        c = a(localColorStateList, (PorterDuff.Mode)localObject2);
        invalidateSelf();
        bool3 = true;
      }
    }
    Object localObject2 = b;
    if (n == null) {
      n = Boolean.valueOf(g.a());
    }
    if (n.booleanValue())
    {
      bool1 = b.g.b(paramArrayOfInt);
      k |= bool1;
      if (bool1)
      {
        invalidateSelf();
        bool3 = bool2;
      }
    }
    return bool3;
  }
  
  public final void scheduleSelf(Runnable paramRunnable, long paramLong)
  {
    Drawable localDrawable = a;
    if (localDrawable != null)
    {
      localDrawable.scheduleSelf(paramRunnable, paramLong);
      return;
    }
    super.scheduleSelf(paramRunnable, paramLong);
  }
  
  public final void setAlpha(int paramInt)
  {
    Drawable localDrawable = a;
    if (localDrawable != null)
    {
      localDrawable.setAlpha(paramInt);
      return;
    }
    if (b.b.getRootAlpha() != paramInt)
    {
      b.b.setRootAlpha(paramInt);
      invalidateSelf();
    }
  }
  
  public final void setAutoMirrored(boolean paramBoolean)
  {
    Drawable localDrawable = a;
    if (localDrawable != null)
    {
      localDrawable.setAutoMirrored(paramBoolean);
      return;
    }
    b.e = paramBoolean;
  }
  
  public final void setColorFilter(ColorFilter paramColorFilter)
  {
    Drawable localDrawable = a;
    if (localDrawable != null)
    {
      localDrawable.setColorFilter(paramColorFilter);
      return;
    }
    d = paramColorFilter;
    invalidateSelf();
  }
  
  public final void setTint(int paramInt)
  {
    Drawable localDrawable = a;
    if (localDrawable != null)
    {
      y.a.a(localDrawable, paramInt);
      return;
    }
    setTintList(ColorStateList.valueOf(paramInt));
  }
  
  public final void setTintList(ColorStateList paramColorStateList)
  {
    Object localObject = a;
    if (localObject != null)
    {
      a.a.h((Drawable)localObject, paramColorStateList);
      return;
    }
    localObject = b;
    if (c != paramColorStateList)
    {
      c = paramColorStateList;
      c = a(paramColorStateList, d);
      invalidateSelf();
    }
  }
  
  public final void setTintMode(PorterDuff.Mode paramMode)
  {
    Object localObject = a;
    if (localObject != null)
    {
      a.a.i((Drawable)localObject, paramMode);
      return;
    }
    localObject = b;
    if (d != paramMode)
    {
      d = paramMode;
      c = a(c, paramMode);
      invalidateSelf();
    }
  }
  
  public final boolean setVisible(boolean paramBoolean1, boolean paramBoolean2)
  {
    Drawable localDrawable = a;
    if (localDrawable != null) {
      return localDrawable.setVisible(paramBoolean1, paramBoolean2);
    }
    return super.setVisible(paramBoolean1, paramBoolean2);
  }
  
  public final void unscheduleSelf(Runnable paramRunnable)
  {
    Drawable localDrawable = a;
    if (localDrawable != null)
    {
      localDrawable.unscheduleSelf(paramRunnable);
      return;
    }
    super.unscheduleSelf(paramRunnable);
  }
  
  public static final class a
    extends f.e
  {
    public a() {}
    
    public a(a parama)
    {
      super();
    }
  }
  
  public static final class b
    extends f.e
  {
    public c e;
    public float f = 0.0F;
    public c g;
    public float h = 1.0F;
    public float i = 1.0F;
    public float j = 0.0F;
    public float k = 1.0F;
    public float l = 0.0F;
    public Paint.Cap m = Paint.Cap.BUTT;
    public Paint.Join n = Paint.Join.MITER;
    public float o = 4.0F;
    
    public b() {}
    
    public b(b paramb)
    {
      super();
      e = e;
      f = f;
      h = h;
      g = g;
      c = c;
      i = i;
      j = j;
      k = k;
      l = l;
      m = m;
      n = n;
      o = o;
    }
    
    public final boolean a()
    {
      boolean bool;
      if ((!g.b()) && (!e.b())) {
        bool = false;
      } else {
        bool = true;
      }
      return bool;
    }
    
    public final boolean b(int[] paramArrayOfInt)
    {
      c localc = g;
      boolean bool = localc.b();
      int i1 = 1;
      ColorStateList localColorStateList;
      if (bool)
      {
        localColorStateList = b;
        i2 = localColorStateList.getColorForState(paramArrayOfInt, localColorStateList.getDefaultColor());
        if (i2 != c)
        {
          c = i2;
          i2 = 1;
          break label60;
        }
      }
      int i2 = 0;
      label60:
      localc = e;
      if (localc.b())
      {
        localColorStateList = b;
        int i3 = localColorStateList.getColorForState(paramArrayOfInt, localColorStateList.getDefaultColor());
        if (i3 != c)
        {
          c = i3;
          break label112;
        }
      }
      i1 = 0;
      label112:
      return i1 | i2;
    }
    
    public float getFillAlpha()
    {
      return i;
    }
    
    public int getFillColor()
    {
      return g.c;
    }
    
    public float getStrokeAlpha()
    {
      return h;
    }
    
    public int getStrokeColor()
    {
      return e.c;
    }
    
    public float getStrokeWidth()
    {
      return f;
    }
    
    public float getTrimPathEnd()
    {
      return k;
    }
    
    public float getTrimPathOffset()
    {
      return l;
    }
    
    public float getTrimPathStart()
    {
      return j;
    }
    
    public void setFillAlpha(float paramFloat)
    {
      i = paramFloat;
    }
    
    public void setFillColor(int paramInt)
    {
      g.c = paramInt;
    }
    
    public void setStrokeAlpha(float paramFloat)
    {
      h = paramFloat;
    }
    
    public void setStrokeColor(int paramInt)
    {
      e.c = paramInt;
    }
    
    public void setStrokeWidth(float paramFloat)
    {
      f = paramFloat;
    }
    
    public void setTrimPathEnd(float paramFloat)
    {
      k = paramFloat;
    }
    
    public void setTrimPathOffset(float paramFloat)
    {
      l = paramFloat;
    }
    
    public void setTrimPathStart(float paramFloat)
    {
      j = paramFloat;
    }
  }
  
  public static final class c
    extends f.d
  {
    public final Matrix a = new Matrix();
    public final ArrayList<f.d> b = new ArrayList();
    public float c = 0.0F;
    public float d = 0.0F;
    public float e = 0.0F;
    public float f = 1.0F;
    public float g = 1.0F;
    public float h = 0.0F;
    public float i = 0.0F;
    public final Matrix j;
    public int k;
    public String l;
    
    public c()
    {
      j = new Matrix();
      l = null;
    }
    
    public c(c paramc, r.b<String, Object> paramb)
    {
      Object localObject1 = new Matrix();
      j = ((Matrix)localObject1);
      l = null;
      c = c;
      d = d;
      e = e;
      f = f;
      g = g;
      h = h;
      i = i;
      Object localObject2 = l;
      l = ((String)localObject2);
      k = k;
      if (localObject2 != null) {
        paramb.put(localObject2, this);
      }
      ((Matrix)localObject1).set(j);
      localObject2 = b;
      int m = 0;
      while (m < ((ArrayList)localObject2).size())
      {
        paramc = ((ArrayList)localObject2).get(m);
        if ((paramc instanceof c))
        {
          paramc = (c)paramc;
          b.add(new c(paramc, paramb));
        }
        else
        {
          if ((paramc instanceof f.b))
          {
            paramc = new f.b((f.b)paramc);
          }
          else
          {
            if (!(paramc instanceof f.a)) {
              break label307;
            }
            paramc = new f.a((f.a)paramc);
          }
          b.add(paramc);
          localObject1 = b;
          if (localObject1 != null) {
            paramb.put(localObject1, paramc);
          }
        }
        m++;
        continue;
        label307:
        throw new IllegalStateException("Unknown object in the tree!");
      }
    }
    
    public final boolean a()
    {
      for (int m = 0; m < b.size(); m++) {
        if (((f.d)b.get(m)).a()) {
          return true;
        }
      }
      return false;
    }
    
    public final boolean b(int[] paramArrayOfInt)
    {
      int m = 0;
      boolean bool = false;
      while (m < b.size())
      {
        bool |= ((f.d)b.get(m)).b(paramArrayOfInt);
        m++;
      }
      return bool;
    }
    
    public final void c()
    {
      j.reset();
      j.postTranslate(-d, -e);
      j.postScale(f, g);
      j.postRotate(c, 0.0F, 0.0F);
      j.postTranslate(h + d, i + e);
    }
    
    public String getGroupName()
    {
      return l;
    }
    
    public Matrix getLocalMatrix()
    {
      return j;
    }
    
    public float getPivotX()
    {
      return d;
    }
    
    public float getPivotY()
    {
      return e;
    }
    
    public float getRotation()
    {
      return c;
    }
    
    public float getScaleX()
    {
      return f;
    }
    
    public float getScaleY()
    {
      return g;
    }
    
    public float getTranslateX()
    {
      return h;
    }
    
    public float getTranslateY()
    {
      return i;
    }
    
    public void setPivotX(float paramFloat)
    {
      if (paramFloat != d)
      {
        d = paramFloat;
        c();
      }
    }
    
    public void setPivotY(float paramFloat)
    {
      if (paramFloat != e)
      {
        e = paramFloat;
        c();
      }
    }
    
    public void setRotation(float paramFloat)
    {
      if (paramFloat != c)
      {
        c = paramFloat;
        c();
      }
    }
    
    public void setScaleX(float paramFloat)
    {
      if (paramFloat != f)
      {
        f = paramFloat;
        c();
      }
    }
    
    public void setScaleY(float paramFloat)
    {
      if (paramFloat != g)
      {
        g = paramFloat;
        c();
      }
    }
    
    public void setTranslateX(float paramFloat)
    {
      if (paramFloat != h)
      {
        h = paramFloat;
        c();
      }
    }
    
    public void setTranslateY(float paramFloat)
    {
      if (paramFloat != i)
      {
        i = paramFloat;
        c();
      }
    }
  }
  
  public static abstract class d
  {
    public boolean a()
    {
      return false;
    }
    
    public boolean b(int[] paramArrayOfInt)
    {
      return false;
    }
  }
  
  public static abstract class e
    extends f.d
  {
    public d.a[] a = null;
    public String b;
    public int c = 0;
    public int d;
    
    public e() {}
    
    public e(e parame)
    {
      b = b;
      d = d;
      a = d.e(a);
    }
    
    public d.a[] getPathData()
    {
      return a;
    }
    
    public String getPathName()
    {
      return b;
    }
    
    public void setPathData(d.a[] paramArrayOfa)
    {
      if (!d.a(a, paramArrayOfa))
      {
        a = d.e(paramArrayOfa);
      }
      else
      {
        d.a[] arrayOfa = a;
        for (int i = 0; i < paramArrayOfa.length; i++)
        {
          a = ((char)a);
          for (int j = 0;; j++)
          {
            float[] arrayOfFloat = b;
            if (j >= arrayOfFloat.length) {
              break;
            }
            b[j] = arrayOfFloat[j];
          }
        }
      }
    }
  }
  
  public static final class f
  {
    public static final Matrix p = new Matrix();
    public final Path a;
    public final Path b;
    public final Matrix c = new Matrix();
    public Paint d;
    public Paint e;
    public PathMeasure f;
    public final f.c g;
    public float h = 0.0F;
    public float i = 0.0F;
    public float j = 0.0F;
    public float k = 0.0F;
    public int l = 255;
    public String m = null;
    public Boolean n = null;
    public final r.b<String, Object> o;
    
    public f()
    {
      o = new r.b();
      g = new f.c();
      a = new Path();
      b = new Path();
    }
    
    public f(f paramf)
    {
      r.b localb = new r.b();
      o = localb;
      g = new f.c(g, localb);
      a = new Path(a);
      b = new Path(b);
      h = h;
      i = i;
      j = j;
      k = k;
      l = l;
      m = m;
      String str = m;
      if (str != null) {
        localb.put(str, this);
      }
      n = n;
    }
    
    public final void a(f.c paramc, Matrix paramMatrix, Canvas paramCanvas, int paramInt1, int paramInt2)
    {
      a.set(paramMatrix);
      a.preConcat(j);
      paramCanvas.save();
      paramMatrix = this;
      for (int i1 = 0; i1 < b.size(); i1++)
      {
        Object localObject1 = (f.d)b.get(i1);
        if ((localObject1 instanceof f.c))
        {
          a((f.c)localObject1, a, paramCanvas, paramInt1, paramInt2);
        }
        else if ((localObject1 instanceof f.e))
        {
          localObject1 = (f.e)localObject1;
          float f1 = paramInt1 / j;
          float f2 = paramInt2 / k;
          float f3 = Math.min(f1, f2);
          Object localObject2 = a;
          c.set((Matrix)localObject2);
          c.postScale(f1, f2);
          paramMatrix = new float[4];
          Matrix tmp161_160 = paramMatrix;
          tmp161_160[0] = 0.0F;
          Matrix tmp165_161 = tmp161_160;
          tmp165_161[1] = 1.0F;
          Matrix tmp169_165 = tmp165_161;
          tmp169_165[2] = 1.0F;
          Matrix tmp173_169 = tmp169_165;
          tmp173_169[3] = 0.0F;
          tmp173_169;
          ((Matrix)localObject2).mapVectors(paramMatrix);
          float f4 = (float)Math.hypot(paramMatrix[0], paramMatrix[1]);
          float f5 = (float)Math.hypot(paramMatrix[2], paramMatrix[3]);
          f1 = paramMatrix[0];
          float f6 = paramMatrix[1];
          f2 = paramMatrix[2];
          float f7 = paramMatrix[3];
          f5 = Math.max(f4, f5);
          if (f5 > 0.0F) {
            f1 = Math.abs(f1 * f7 - f6 * f2) / f5;
          } else {
            f1 = 0.0F;
          }
          if (f1 != 0.0F)
          {
            paramMatrix = a;
            localObject1.getClass();
            paramMatrix.reset();
            localObject2 = a;
            if (localObject2 != null) {
              d.a.b((d.a[])localObject2, paramMatrix);
            }
            localObject2 = a;
            b.reset();
            Object localObject3;
            if ((localObject1 instanceof f.a))
            {
              localObject3 = b;
              if (c == 0) {
                paramMatrix = Path.FillType.WINDING;
              } else {
                paramMatrix = Path.FillType.EVEN_ODD;
              }
              ((Path)localObject3).setFillType(paramMatrix);
              b.addPath((Path)localObject2, c);
              paramCanvas.clipPath(b);
            }
            else
            {
              localObject1 = (f.b)localObject1;
              f5 = j;
              if ((f5 != 0.0F) || (k != 1.0F))
              {
                f6 = l;
                f7 = k;
                if (f == null) {
                  f = new PathMeasure();
                }
                f.setPath(a, false);
                f2 = f.getLength();
                f5 = (f5 + f6) % 1.0F * f2;
                f7 = (f7 + f6) % 1.0F * f2;
                ((Path)localObject2).reset();
                if (f5 > f7)
                {
                  f.getSegment(f5, f2, (Path)localObject2, true);
                  f.getSegment(0.0F, f7, (Path)localObject2, true);
                }
                else
                {
                  f.getSegment(f5, f7, (Path)localObject2, true);
                }
                ((Path)localObject2).rLineTo(0.0F, 0.0F);
              }
              b.addPath((Path)localObject2, c);
              paramMatrix = g;
              int i2;
              if (a != null) {
                i2 = 1;
              } else {
                i2 = 0;
              }
              if ((i2 == 0) && (c == 0)) {
                i2 = 0;
              } else {
                i2 = 1;
              }
              if (i2 != 0)
              {
                if (e == null)
                {
                  localObject2 = new Paint(1);
                  e = ((Paint)localObject2);
                  ((Paint)localObject2).setStyle(Paint.Style.FILL);
                }
                localObject2 = e;
                localObject3 = a;
                if (localObject3 != null) {
                  i2 = 1;
                } else {
                  i2 = 0;
                }
                if (i2 != 0)
                {
                  ((Shader)localObject3).setLocalMatrix(c);
                  ((Paint)localObject2).setShader((Shader)localObject3);
                  ((Paint)localObject2).setAlpha(Math.round(i * 255.0F));
                }
                else
                {
                  ((Paint)localObject2).setShader(null);
                  ((Paint)localObject2).setAlpha(255);
                  i2 = c;
                  f2 = i;
                  paramMatrix = f.r;
                  ((Paint)localObject2).setColor(i2 & 0xFFFFFF | (int)(Color.alpha(i2) * f2) << 24);
                }
                ((Paint)localObject2).setColorFilter(null);
                localObject3 = b;
                if (c == 0) {
                  paramMatrix = Path.FillType.WINDING;
                } else {
                  paramMatrix = Path.FillType.EVEN_ODD;
                }
                ((Path)localObject3).setFillType(paramMatrix);
                paramCanvas.drawPath(b, (Paint)localObject2);
              }
              paramMatrix = e;
              if (a != null) {
                i2 = 1;
              } else {
                i2 = 0;
              }
              if ((i2 == 0) && (c == 0)) {
                i2 = 0;
              } else {
                i2 = 1;
              }
              if (i2 != 0)
              {
                if (d == null)
                {
                  localObject2 = new Paint(1);
                  d = ((Paint)localObject2);
                  ((Paint)localObject2).setStyle(Paint.Style.STROKE);
                }
                i2 = 1;
                localObject2 = d;
                localObject3 = n;
                if (localObject3 != null) {
                  ((Paint)localObject2).setStrokeJoin((Paint.Join)localObject3);
                }
                localObject3 = m;
                if (localObject3 != null) {
                  ((Paint)localObject2).setStrokeCap((Paint.Cap)localObject3);
                }
                ((Paint)localObject2).setStrokeMiter(o);
                localObject3 = a;
                if (localObject3 == null) {
                  i2 = 0;
                }
                if (i2 != 0)
                {
                  ((Shader)localObject3).setLocalMatrix(c);
                  ((Paint)localObject2).setShader((Shader)localObject3);
                  ((Paint)localObject2).setAlpha(Math.round(h * 255.0F));
                }
                else
                {
                  ((Paint)localObject2).setShader(null);
                  ((Paint)localObject2).setAlpha(255);
                  i2 = c;
                  f2 = h;
                  paramMatrix = f.r;
                  ((Paint)localObject2).setColor(i2 & 0xFFFFFF | (int)(Color.alpha(i2) * f2) << 24);
                }
                ((Paint)localObject2).setColorFilter(null);
                ((Paint)localObject2).setStrokeWidth(f * (f1 * f3));
                paramCanvas.drawPath(b, (Paint)localObject2);
              }
            }
          }
          paramMatrix = this;
        }
      }
      paramCanvas.restore();
    }
    
    public float getAlpha()
    {
      return getRootAlpha() / 255.0F;
    }
    
    public int getRootAlpha()
    {
      return l;
    }
    
    public void setAlpha(float paramFloat)
    {
      setRootAlpha((int)(paramFloat * 255.0F));
    }
    
    public void setRootAlpha(int paramInt)
    {
      l = paramInt;
    }
  }
  
  public static final class g
    extends Drawable.ConstantState
  {
    public int a;
    public f.f b;
    public ColorStateList c = null;
    public PorterDuff.Mode d = f.r;
    public boolean e;
    public Bitmap f;
    public ColorStateList g;
    public PorterDuff.Mode h;
    public int i;
    public boolean j;
    public boolean k;
    public Paint l;
    
    public g()
    {
      b = new f.f();
    }
    
    public g(g paramg)
    {
      if (paramg != null)
      {
        a = a;
        f.f localf = new f.f(b);
        b = localf;
        if (b.e != null) {
          e = new Paint(b.e);
        }
        if (b.d != null) {
          b.d = new Paint(b.d);
        }
        c = c;
        d = d;
        e = e;
      }
    }
    
    public int getChangingConfigurations()
    {
      return a;
    }
    
    public final Drawable newDrawable()
    {
      return new f(this);
    }
    
    public final Drawable newDrawable(Resources paramResources)
    {
      return new f(this);
    }
  }
  
  public static final class h
    extends Drawable.ConstantState
  {
    public final Drawable.ConstantState a;
    
    public h(Drawable.ConstantState paramConstantState)
    {
      a = paramConstantState;
    }
    
    public final boolean canApplyTheme()
    {
      return a.canApplyTheme();
    }
    
    public int getChangingConfigurations()
    {
      return a.getChangingConfigurations();
    }
    
    public final Drawable newDrawable()
    {
      f localf = new f();
      a = ((VectorDrawable)a.newDrawable());
      return localf;
    }
    
    public final Drawable newDrawable(Resources paramResources)
    {
      f localf = new f();
      a = ((VectorDrawable)a.newDrawable(paramResources));
      return localf;
    }
    
    public final Drawable newDrawable(Resources paramResources, Resources.Theme paramTheme)
    {
      f localf = new f();
      a = ((VectorDrawable)a.newDrawable(paramResources, paramTheme));
      return localf;
    }
  }
}

/* Location:
 * Qualified Name:     a2.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */