package u1;

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
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import z.d;
import z.k;

public class g
  extends f
{
  public static final PorterDuff.Mode y = PorterDuff.Mode.SRC_IN;
  public h p;
  public PorterDuffColorFilter q;
  public ColorFilter r;
  public boolean s;
  public boolean t = true;
  public Drawable.ConstantState u;
  public final float[] v = new float[9];
  public final Matrix w = new Matrix();
  public final Rect x = new Rect();
  
  public g()
  {
    p = new h();
  }
  
  public g(h paramh)
  {
    p = paramh;
    q = j(q, c, d);
  }
  
  public static int a(int paramInt, float paramFloat)
  {
    return paramInt & 0xFFFFFF | (int)(Color.alpha(paramInt) * paramFloat) << 24;
  }
  
  public static g b(Resources paramResources, int paramInt, Resources.Theme paramTheme)
  {
    Object localObject;
    if (Build.VERSION.SDK_INT >= 24)
    {
      localObject = new g();
      o = z.h.a(paramResources, paramInt, paramTheme);
      u = new i(o.getConstantState());
      return (g)localObject;
    }
    try
    {
      localObject = paramResources.getXml(paramInt);
      AttributeSet localAttributeSet = Xml.asAttributeSet((XmlPullParser)localObject);
      do
      {
        paramInt = ((XmlPullParser)localObject).next();
      } while ((paramInt != 2) && (paramInt != 1));
      if (paramInt == 2) {
        return c(paramResources, (XmlPullParser)localObject, localAttributeSet, paramTheme);
      }
    }
    catch (IOException paramResources) {}catch (XmlPullParserException paramResources) {}
    paramResources = new org/xmlpull/v1/XmlPullParserException;
    paramResources.<init>("No start tag found");
    throw paramResources;
    Log.e("VectorDrawableCompat", "parser error", paramResources);
    return null;
  }
  
  public static g c(Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme)
  {
    g localg = new g();
    localg.inflate(paramResources, paramXmlPullParser, paramAttributeSet, paramTheme);
    return localg;
  }
  
  public static PorterDuff.Mode g(int paramInt, PorterDuff.Mode paramMode)
  {
    if (paramInt != 3)
    {
      if (paramInt != 5)
      {
        if (paramInt != 9)
        {
          switch (paramInt)
          {
          default: 
            return paramMode;
          case 16: 
            return PorterDuff.Mode.ADD;
          case 15: 
            return PorterDuff.Mode.SCREEN;
          }
          return PorterDuff.Mode.MULTIPLY;
        }
        return PorterDuff.Mode.SRC_ATOP;
      }
      return PorterDuff.Mode.SRC_IN;
    }
    return PorterDuff.Mode.SRC_OVER;
  }
  
  public boolean canApplyTheme()
  {
    Drawable localDrawable = o;
    if (localDrawable != null) {
      B.a.b(localDrawable);
    }
    return false;
  }
  
  public Object d(String paramString)
  {
    return p.b.p.get(paramString);
  }
  
  public void draw(Canvas paramCanvas)
  {
    Object localObject1 = o;
    if (localObject1 != null)
    {
      ((Drawable)localObject1).draw(paramCanvas);
      return;
    }
    copyBounds(x);
    if ((x.width() > 0) && (x.height() > 0))
    {
      Object localObject2 = r;
      localObject1 = localObject2;
      if (localObject2 == null) {
        localObject1 = q;
      }
      paramCanvas.getMatrix(w);
      w.getValues(v);
      float f1 = Math.abs(v[0]);
      float f2 = Math.abs(v[4]);
      float f3 = Math.abs(v[1]);
      float f4 = Math.abs(v[3]);
      if ((f3 != 0.0F) || (f4 != 0.0F))
      {
        f1 = 1.0F;
        f2 = f1;
      }
      int i = (int)(x.width() * f1);
      int j = (int)(x.height() * f2);
      i = Math.min(2048, i);
      int k = Math.min(2048, j);
      if ((i > 0) && (k > 0))
      {
        j = paramCanvas.save();
        localObject2 = x;
        paramCanvas.translate(left, top);
        if (f())
        {
          paramCanvas.translate(x.width(), 0.0F);
          paramCanvas.scale(-1.0F, 1.0F);
        }
        x.offsetTo(0, 0);
        p.c(i, k);
        if (!t)
        {
          p.j(i, k);
        }
        else if (!p.b())
        {
          p.j(i, k);
          p.i();
        }
        p.d(paramCanvas, (ColorFilter)localObject1, x);
        paramCanvas.restoreToCount(j);
      }
    }
  }
  
  public final void e(Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme)
  {
    h localh = p;
    g localg = b;
    ArrayDeque localArrayDeque = new ArrayDeque();
    localArrayDeque.push(h);
    int i = paramXmlPullParser.getEventType();
    int j = paramXmlPullParser.getDepth();
    int m;
    for (int k = 1; (i != 1) && ((paramXmlPullParser.getDepth() >= j + 1) || (i != 3)); k = m)
    {
      if (i == 2)
      {
        Object localObject = paramXmlPullParser.getName();
        d locald = (d)localArrayDeque.peek();
        if ("path".equals(localObject))
        {
          localObject = new c();
          ((c)localObject).g(paramResources, paramAttributeSet, paramTheme, paramXmlPullParser);
          b.add(localObject);
          if (((f)localObject).getPathName() != null) {
            p.put(((f)localObject).getPathName(), localObject);
          }
          k = a;
          a = (d | k);
          m = 0;
        }
        else
        {
          if ("clip-path".equals(localObject))
          {
            localObject = new b();
            ((b)localObject).e(paramResources, paramAttributeSet, paramTheme, paramXmlPullParser);
            b.add(localObject);
            if (((f)localObject).getPathName() != null) {
              p.put(((f)localObject).getPathName(), localObject);
            }
            i = a;
          }
          for (m = d;; m = k)
          {
            a = (m | i);
            m = k;
            break;
            m = k;
            if (!"group".equals(localObject)) {
              break;
            }
            localObject = new d();
            ((d)localObject).c(paramResources, paramAttributeSet, paramTheme, paramXmlPullParser);
            b.add(localObject);
            localArrayDeque.push(localObject);
            if (((d)localObject).getGroupName() != null) {
              p.put(((d)localObject).getGroupName(), localObject);
            }
            i = a;
          }
        }
      }
      else
      {
        m = k;
        if (i == 3)
        {
          m = k;
          if ("group".equals(paramXmlPullParser.getName()))
          {
            localArrayDeque.pop();
            m = k;
          }
        }
      }
      i = paramXmlPullParser.next();
    }
    if (k == 0) {
      return;
    }
    throw new XmlPullParserException("no path defined");
  }
  
  public final boolean f()
  {
    boolean bool;
    if (isAutoMirrored())
    {
      int i = B.a.e(this);
      bool = true;
      if (i == 1) {}
    }
    else
    {
      bool = false;
    }
    return bool;
  }
  
  public int getAlpha()
  {
    Drawable localDrawable = o;
    if (localDrawable != null) {
      return B.a.c(localDrawable);
    }
    return p.b.getRootAlpha();
  }
  
  public int getChangingConfigurations()
  {
    Drawable localDrawable = o;
    if (localDrawable != null) {
      return localDrawable.getChangingConfigurations();
    }
    return super.getChangingConfigurations() | p.getChangingConfigurations();
  }
  
  public ColorFilter getColorFilter()
  {
    Drawable localDrawable = o;
    if (localDrawable != null) {
      return B.a.d(localDrawable);
    }
    return r;
  }
  
  public Drawable.ConstantState getConstantState()
  {
    if ((o != null) && (Build.VERSION.SDK_INT >= 24)) {
      return new i(o.getConstantState());
    }
    p.a = getChangingConfigurations();
    return p;
  }
  
  public int getIntrinsicHeight()
  {
    Drawable localDrawable = o;
    if (localDrawable != null) {
      return localDrawable.getIntrinsicHeight();
    }
    return (int)p.b.j;
  }
  
  public int getIntrinsicWidth()
  {
    Drawable localDrawable = o;
    if (localDrawable != null) {
      return localDrawable.getIntrinsicWidth();
    }
    return (int)p.b.i;
  }
  
  public int getOpacity()
  {
    Drawable localDrawable = o;
    if (localDrawable != null) {
      return localDrawable.getOpacity();
    }
    return -3;
  }
  
  public void h(boolean paramBoolean)
  {
    t = paramBoolean;
  }
  
  public final void i(TypedArray paramTypedArray, XmlPullParser paramXmlPullParser, Resources.Theme paramTheme)
  {
    h localh = p;
    g localg = b;
    d = g(k.g(paramTypedArray, paramXmlPullParser, "tintMode", 6, -1), PorterDuff.Mode.SRC_IN);
    paramTheme = k.c(paramTypedArray, paramXmlPullParser, paramTheme, "tint", 1);
    if (paramTheme != null) {
      c = paramTheme;
    }
    e = k.a(paramTypedArray, paramXmlPullParser, "autoMirrored", 5, e);
    k = k.f(paramTypedArray, paramXmlPullParser, "viewportWidth", 7, k);
    float f = k.f(paramTypedArray, paramXmlPullParser, "viewportHeight", 8, l);
    l = f;
    if (k > 0.0F)
    {
      if (f > 0.0F)
      {
        i = paramTypedArray.getDimension(3, i);
        f = paramTypedArray.getDimension(2, j);
        j = f;
        if (i > 0.0F)
        {
          if (f > 0.0F)
          {
            localg.setAlpha(k.f(paramTypedArray, paramXmlPullParser, "alpha", 4, localg.getAlpha()));
            paramTypedArray = paramTypedArray.getString(0);
            if (paramTypedArray != null)
            {
              n = paramTypedArray;
              p.put(paramTypedArray, localg);
            }
            return;
          }
          paramXmlPullParser = new StringBuilder();
          paramXmlPullParser.append(paramTypedArray.getPositionDescription());
          paramXmlPullParser.append("<vector> tag requires height > 0");
          throw new XmlPullParserException(paramXmlPullParser.toString());
        }
        paramXmlPullParser = new StringBuilder();
        paramXmlPullParser.append(paramTypedArray.getPositionDescription());
        paramXmlPullParser.append("<vector> tag requires width > 0");
        throw new XmlPullParserException(paramXmlPullParser.toString());
      }
      paramXmlPullParser = new StringBuilder();
      paramXmlPullParser.append(paramTypedArray.getPositionDescription());
      paramXmlPullParser.append("<vector> tag requires viewportHeight > 0");
      throw new XmlPullParserException(paramXmlPullParser.toString());
    }
    paramXmlPullParser = new StringBuilder();
    paramXmlPullParser.append(paramTypedArray.getPositionDescription());
    paramXmlPullParser.append("<vector> tag requires viewportWidth > 0");
    throw new XmlPullParserException(paramXmlPullParser.toString());
  }
  
  public void inflate(Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet)
  {
    Drawable localDrawable = o;
    if (localDrawable != null)
    {
      localDrawable.inflate(paramResources, paramXmlPullParser, paramAttributeSet);
      return;
    }
    inflate(paramResources, paramXmlPullParser, paramAttributeSet, null);
  }
  
  public void inflate(Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme)
  {
    Object localObject = o;
    if (localObject != null)
    {
      B.a.f((Drawable)localObject, paramResources, paramXmlPullParser, paramAttributeSet, paramTheme);
      return;
    }
    localObject = p;
    b = new g();
    TypedArray localTypedArray = k.k(paramResources, paramTheme, paramAttributeSet, a.a);
    i(localTypedArray, paramXmlPullParser, paramTheme);
    localTypedArray.recycle();
    a = getChangingConfigurations();
    k = true;
    e(paramResources, paramXmlPullParser, paramAttributeSet, paramTheme);
    q = j(q, c, d);
  }
  
  public void invalidateSelf()
  {
    Drawable localDrawable = o;
    if (localDrawable != null)
    {
      localDrawable.invalidateSelf();
      return;
    }
    super.invalidateSelf();
  }
  
  public boolean isAutoMirrored()
  {
    Drawable localDrawable = o;
    if (localDrawable != null) {
      return B.a.g(localDrawable);
    }
    return p.e;
  }
  
  public boolean isStateful()
  {
    Object localObject = o;
    if (localObject != null) {
      return ((Drawable)localObject).isStateful();
    }
    if (!super.isStateful())
    {
      localObject = p;
      if (localObject != null)
      {
        if (!((h)localObject).g())
        {
          localObject = p.c;
          if ((localObject != null) && (((ColorStateList)localObject).isStateful())) {}
        }
      }
      else {
        return false;
      }
    }
    boolean bool = true;
    return bool;
  }
  
  public PorterDuffColorFilter j(PorterDuffColorFilter paramPorterDuffColorFilter, ColorStateList paramColorStateList, PorterDuff.Mode paramMode)
  {
    if ((paramColorStateList != null) && (paramMode != null)) {
      return new PorterDuffColorFilter(paramColorStateList.getColorForState(getState(), 0), paramMode);
    }
    return null;
  }
  
  public Drawable mutate()
  {
    Drawable localDrawable = o;
    if (localDrawable != null)
    {
      localDrawable.mutate();
      return this;
    }
    if ((!s) && (super.mutate() == this))
    {
      p = new h(p);
      s = true;
    }
    return this;
  }
  
  public void onBoundsChange(Rect paramRect)
  {
    Drawable localDrawable = o;
    if (localDrawable != null) {
      localDrawable.setBounds(paramRect);
    }
  }
  
  public boolean onStateChange(int[] paramArrayOfInt)
  {
    Object localObject = o;
    if (localObject != null) {
      return ((Drawable)localObject).setState(paramArrayOfInt);
    }
    localObject = p;
    ColorStateList localColorStateList = c;
    boolean bool1 = true;
    if (localColorStateList != null)
    {
      PorterDuff.Mode localMode = d;
      if (localMode != null)
      {
        q = j(q, localColorStateList, localMode);
        invalidateSelf();
        bool2 = true;
        break label71;
      }
    }
    boolean bool2 = false;
    label71:
    if ((((h)localObject).g()) && (((h)localObject).h(paramArrayOfInt)))
    {
      invalidateSelf();
      bool2 = bool1;
    }
    return bool2;
  }
  
  public void scheduleSelf(Runnable paramRunnable, long paramLong)
  {
    Drawable localDrawable = o;
    if (localDrawable != null)
    {
      localDrawable.scheduleSelf(paramRunnable, paramLong);
      return;
    }
    super.scheduleSelf(paramRunnable, paramLong);
  }
  
  public void setAlpha(int paramInt)
  {
    Drawable localDrawable = o;
    if (localDrawable != null)
    {
      localDrawable.setAlpha(paramInt);
      return;
    }
    if (p.b.getRootAlpha() != paramInt)
    {
      p.b.setRootAlpha(paramInt);
      invalidateSelf();
    }
  }
  
  public void setAutoMirrored(boolean paramBoolean)
  {
    Drawable localDrawable = o;
    if (localDrawable != null)
    {
      B.a.i(localDrawable, paramBoolean);
      return;
    }
    p.e = paramBoolean;
  }
  
  public void setColorFilter(ColorFilter paramColorFilter)
  {
    Drawable localDrawable = o;
    if (localDrawable != null)
    {
      localDrawable.setColorFilter(paramColorFilter);
      return;
    }
    r = paramColorFilter;
    invalidateSelf();
  }
  
  public void setTint(int paramInt)
  {
    Drawable localDrawable = o;
    if (localDrawable != null)
    {
      B.a.l(localDrawable, paramInt);
      return;
    }
    setTintList(ColorStateList.valueOf(paramInt));
  }
  
  public void setTintList(ColorStateList paramColorStateList)
  {
    Object localObject = o;
    if (localObject != null)
    {
      B.a.m((Drawable)localObject, paramColorStateList);
      return;
    }
    localObject = p;
    if (c != paramColorStateList)
    {
      c = paramColorStateList;
      q = j(q, paramColorStateList, d);
      invalidateSelf();
    }
  }
  
  public void setTintMode(PorterDuff.Mode paramMode)
  {
    Object localObject = o;
    if (localObject != null)
    {
      B.a.n((Drawable)localObject, paramMode);
      return;
    }
    localObject = p;
    if (d != paramMode)
    {
      d = paramMode;
      q = j(q, c, paramMode);
      invalidateSelf();
    }
  }
  
  public boolean setVisible(boolean paramBoolean1, boolean paramBoolean2)
  {
    Drawable localDrawable = o;
    if (localDrawable != null) {
      return localDrawable.setVisible(paramBoolean1, paramBoolean2);
    }
    return super.setVisible(paramBoolean1, paramBoolean2);
  }
  
  public void unscheduleSelf(Runnable paramRunnable)
  {
    Drawable localDrawable = o;
    if (localDrawable != null)
    {
      localDrawable.unscheduleSelf(paramRunnable);
      return;
    }
    super.unscheduleSelf(paramRunnable);
  }
  
  public static class b
    extends g.f
  {
    public b() {}
    
    public b(b paramb)
    {
      super();
    }
    
    private void f(TypedArray paramTypedArray, XmlPullParser paramXmlPullParser)
    {
      String str = paramTypedArray.getString(0);
      if (str != null) {
        b = str;
      }
      str = paramTypedArray.getString(1);
      if (str != null) {
        a = A.g.d(str);
      }
      c = k.g(paramTypedArray, paramXmlPullParser, "fillType", 2, 0);
    }
    
    public boolean c()
    {
      return true;
    }
    
    public void e(Resources paramResources, AttributeSet paramAttributeSet, Resources.Theme paramTheme, XmlPullParser paramXmlPullParser)
    {
      if (!k.j(paramXmlPullParser, "pathData")) {
        return;
      }
      paramResources = k.k(paramResources, paramTheme, paramAttributeSet, a.d);
      f(paramResources, paramXmlPullParser);
      paramResources.recycle();
    }
  }
  
  public static class c
    extends g.f
  {
    public int[] e;
    public d f;
    public float g = 0.0F;
    public d h;
    public float i = 1.0F;
    public float j = 1.0F;
    public float k = 0.0F;
    public float l = 1.0F;
    public float m = 0.0F;
    public Paint.Cap n = Paint.Cap.BUTT;
    public Paint.Join o = Paint.Join.MITER;
    public float p = 4.0F;
    
    public c() {}
    
    public c(c paramc)
    {
      super();
      e = e;
      f = f;
      g = g;
      i = i;
      h = h;
      c = c;
      j = j;
      k = k;
      l = l;
      m = m;
      n = n;
      o = o;
      p = p;
    }
    
    public boolean a()
    {
      boolean bool;
      if ((!h.i()) && (!f.i())) {
        bool = false;
      } else {
        bool = true;
      }
      return bool;
    }
    
    public boolean b(int[] paramArrayOfInt)
    {
      boolean bool = h.j(paramArrayOfInt);
      return f.j(paramArrayOfInt) | bool;
    }
    
    public final Paint.Cap e(int paramInt, Paint.Cap paramCap)
    {
      if (paramInt != 0)
      {
        if (paramInt != 1)
        {
          if (paramInt != 2) {
            return paramCap;
          }
          return Paint.Cap.SQUARE;
        }
        return Paint.Cap.ROUND;
      }
      return Paint.Cap.BUTT;
    }
    
    public final Paint.Join f(int paramInt, Paint.Join paramJoin)
    {
      if (paramInt != 0)
      {
        if (paramInt != 1)
        {
          if (paramInt != 2) {
            return paramJoin;
          }
          return Paint.Join.BEVEL;
        }
        return Paint.Join.ROUND;
      }
      return Paint.Join.MITER;
    }
    
    public void g(Resources paramResources, AttributeSet paramAttributeSet, Resources.Theme paramTheme, XmlPullParser paramXmlPullParser)
    {
      paramResources = k.k(paramResources, paramTheme, paramAttributeSet, a.c);
      h(paramResources, paramXmlPullParser, paramTheme);
      paramResources.recycle();
    }
    
    public float getFillAlpha()
    {
      return j;
    }
    
    public int getFillColor()
    {
      return h.e();
    }
    
    public float getStrokeAlpha()
    {
      return i;
    }
    
    public int getStrokeColor()
    {
      return f.e();
    }
    
    public float getStrokeWidth()
    {
      return g;
    }
    
    public float getTrimPathEnd()
    {
      return l;
    }
    
    public float getTrimPathOffset()
    {
      return m;
    }
    
    public float getTrimPathStart()
    {
      return k;
    }
    
    public final void h(TypedArray paramTypedArray, XmlPullParser paramXmlPullParser, Resources.Theme paramTheme)
    {
      e = null;
      if (!k.j(paramXmlPullParser, "pathData")) {
        return;
      }
      String str = paramTypedArray.getString(0);
      if (str != null) {
        b = str;
      }
      str = paramTypedArray.getString(2);
      if (str != null) {
        a = A.g.d(str);
      }
      h = k.e(paramTypedArray, paramXmlPullParser, paramTheme, "fillColor", 1, 0);
      j = k.f(paramTypedArray, paramXmlPullParser, "fillAlpha", 12, j);
      n = e(k.g(paramTypedArray, paramXmlPullParser, "strokeLineCap", 8, -1), n);
      o = f(k.g(paramTypedArray, paramXmlPullParser, "strokeLineJoin", 9, -1), o);
      p = k.f(paramTypedArray, paramXmlPullParser, "strokeMiterLimit", 10, p);
      f = k.e(paramTypedArray, paramXmlPullParser, paramTheme, "strokeColor", 3, 0);
      i = k.f(paramTypedArray, paramXmlPullParser, "strokeAlpha", 11, i);
      g = k.f(paramTypedArray, paramXmlPullParser, "strokeWidth", 4, g);
      l = k.f(paramTypedArray, paramXmlPullParser, "trimPathEnd", 6, l);
      m = k.f(paramTypedArray, paramXmlPullParser, "trimPathOffset", 7, m);
      k = k.f(paramTypedArray, paramXmlPullParser, "trimPathStart", 5, k);
      c = k.g(paramTypedArray, paramXmlPullParser, "fillType", 13, c);
    }
    
    public void setFillAlpha(float paramFloat)
    {
      j = paramFloat;
    }
    
    public void setFillColor(int paramInt)
    {
      h.k(paramInt);
    }
    
    public void setStrokeAlpha(float paramFloat)
    {
      i = paramFloat;
    }
    
    public void setStrokeColor(int paramInt)
    {
      f.k(paramInt);
    }
    
    public void setStrokeWidth(float paramFloat)
    {
      g = paramFloat;
    }
    
    public void setTrimPathEnd(float paramFloat)
    {
      l = paramFloat;
    }
    
    public void setTrimPathOffset(float paramFloat)
    {
      m = paramFloat;
    }
    
    public void setTrimPathStart(float paramFloat)
    {
      k = paramFloat;
    }
  }
  
  public static class d
    extends g.e
  {
    public final Matrix a = new Matrix();
    public final ArrayList b = new ArrayList();
    public float c = 0.0F;
    public float d = 0.0F;
    public float e = 0.0F;
    public float f = 1.0F;
    public float g = 1.0F;
    public float h = 0.0F;
    public float i = 0.0F;
    public final Matrix j;
    public int k;
    public int[] l;
    public String m;
    
    public d()
    {
      super();
      j = new Matrix();
      m = null;
    }
    
    public d(d paramd, t.a parama)
    {
      super();
      Object localObject1 = new Matrix();
      j = ((Matrix)localObject1);
      m = null;
      c = c;
      d = d;
      e = e;
      f = f;
      g = g;
      h = h;
      i = i;
      l = l;
      Object localObject2 = m;
      m = ((String)localObject2);
      k = k;
      if (localObject2 != null) {
        parama.put(localObject2, this);
      }
      ((Matrix)localObject1).set(j);
      localObject2 = b;
      int n = 0;
      while (n < ((ArrayList)localObject2).size())
      {
        paramd = ((ArrayList)localObject2).get(n);
        if ((paramd instanceof d))
        {
          paramd = (d)paramd;
          b.add(new d(paramd, parama));
        }
        else
        {
          if ((paramd instanceof g.c))
          {
            paramd = new g.c((g.c)paramd);
          }
          else
          {
            if (!(paramd instanceof g.b)) {
              break label316;
            }
            paramd = new g.b((g.b)paramd);
          }
          b.add(paramd);
          localObject1 = b;
          if (localObject1 != null) {
            parama.put(localObject1, paramd);
          }
        }
        n++;
        continue;
        label316:
        throw new IllegalStateException("Unknown object in the tree!");
      }
    }
    
    public boolean a()
    {
      for (int n = 0; n < b.size(); n++) {
        if (((g.e)b.get(n)).a()) {
          return true;
        }
      }
      return false;
    }
    
    public boolean b(int[] paramArrayOfInt)
    {
      int n = 0;
      boolean bool = false;
      while (n < b.size())
      {
        bool |= ((g.e)b.get(n)).b(paramArrayOfInt);
        n++;
      }
      return bool;
    }
    
    public void c(Resources paramResources, AttributeSet paramAttributeSet, Resources.Theme paramTheme, XmlPullParser paramXmlPullParser)
    {
      paramResources = k.k(paramResources, paramTheme, paramAttributeSet, a.b);
      e(paramResources, paramXmlPullParser);
      paramResources.recycle();
    }
    
    public final void d()
    {
      j.reset();
      j.postTranslate(-d, -e);
      j.postScale(f, g);
      j.postRotate(c, 0.0F, 0.0F);
      j.postTranslate(h + d, i + e);
    }
    
    public final void e(TypedArray paramTypedArray, XmlPullParser paramXmlPullParser)
    {
      l = null;
      c = k.f(paramTypedArray, paramXmlPullParser, "rotation", 5, c);
      d = paramTypedArray.getFloat(1, d);
      e = paramTypedArray.getFloat(2, e);
      f = k.f(paramTypedArray, paramXmlPullParser, "scaleX", 3, f);
      g = k.f(paramTypedArray, paramXmlPullParser, "scaleY", 4, g);
      h = k.f(paramTypedArray, paramXmlPullParser, "translateX", 6, h);
      i = k.f(paramTypedArray, paramXmlPullParser, "translateY", 7, i);
      paramTypedArray = paramTypedArray.getString(0);
      if (paramTypedArray != null) {
        m = paramTypedArray;
      }
      d();
    }
    
    public String getGroupName()
    {
      return m;
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
        d();
      }
    }
    
    public void setPivotY(float paramFloat)
    {
      if (paramFloat != e)
      {
        e = paramFloat;
        d();
      }
    }
    
    public void setRotation(float paramFloat)
    {
      if (paramFloat != c)
      {
        c = paramFloat;
        d();
      }
    }
    
    public void setScaleX(float paramFloat)
    {
      if (paramFloat != f)
      {
        f = paramFloat;
        d();
      }
    }
    
    public void setScaleY(float paramFloat)
    {
      if (paramFloat != g)
      {
        g = paramFloat;
        d();
      }
    }
    
    public void setTranslateX(float paramFloat)
    {
      if (paramFloat != h)
      {
        h = paramFloat;
        d();
      }
    }
    
    public void setTranslateY(float paramFloat)
    {
      if (paramFloat != i)
      {
        i = paramFloat;
        d();
      }
    }
  }
  
  public static abstract class e
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
  
  public static abstract class f
    extends g.e
  {
    public A.g.b[] a = null;
    public String b;
    public int c = 0;
    public int d;
    
    public f()
    {
      super();
    }
    
    public f(f paramf)
    {
      super();
      b = b;
      d = d;
      a = A.g.f(a);
    }
    
    public boolean c()
    {
      return false;
    }
    
    public void d(Path paramPath)
    {
      paramPath.reset();
      A.g.b[] arrayOfb = a;
      if (arrayOfb != null) {
        A.g.b.e(arrayOfb, paramPath);
      }
    }
    
    public A.g.b[] getPathData()
    {
      return a;
    }
    
    public String getPathName()
    {
      return b;
    }
    
    public void setPathData(A.g.b[] paramArrayOfb)
    {
      if (!A.g.b(a, paramArrayOfb)) {
        a = A.g.f(paramArrayOfb);
      } else {
        A.g.j(a, paramArrayOfb);
      }
    }
  }
  
  public static class g
  {
    public static final Matrix q = new Matrix();
    public final Path a;
    public final Path b;
    public final Matrix c = new Matrix();
    public Paint d;
    public Paint e;
    public PathMeasure f;
    public int g;
    public final g.d h;
    public float i = 0.0F;
    public float j = 0.0F;
    public float k = 0.0F;
    public float l = 0.0F;
    public int m = 255;
    public String n = null;
    public Boolean o = null;
    public final t.a p;
    
    public g()
    {
      p = new t.a();
      h = new g.d();
      a = new Path();
      b = new Path();
    }
    
    public g(g paramg)
    {
      t.a locala = new t.a();
      p = locala;
      h = new g.d(h, locala);
      a = new Path(a);
      b = new Path(b);
      i = i;
      j = j;
      k = k;
      l = l;
      g = g;
      m = m;
      n = n;
      String str = n;
      if (str != null) {
        locala.put(str, this);
      }
      o = o;
    }
    
    public static float a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
    {
      return paramFloat1 * paramFloat4 - paramFloat2 * paramFloat3;
    }
    
    public void b(Canvas paramCanvas, int paramInt1, int paramInt2, ColorFilter paramColorFilter)
    {
      c(h, q, paramCanvas, paramInt1, paramInt2, paramColorFilter);
    }
    
    public final void c(g.d paramd, Matrix paramMatrix, Canvas paramCanvas, int paramInt1, int paramInt2, ColorFilter paramColorFilter)
    {
      a.set(paramMatrix);
      a.preConcat(j);
      paramCanvas.save();
      for (int i1 = 0; i1 < b.size(); i1++)
      {
        paramMatrix = (g.e)b.get(i1);
        if ((paramMatrix instanceof g.d)) {
          c((g.d)paramMatrix, a, paramCanvas, paramInt1, paramInt2, paramColorFilter);
        } else if ((paramMatrix instanceof g.f)) {
          d(paramd, (g.f)paramMatrix, paramCanvas, paramInt1, paramInt2, paramColorFilter);
        }
      }
      paramCanvas.restore();
    }
    
    public final void d(g.d paramd, g.f paramf, Canvas paramCanvas, int paramInt1, int paramInt2, ColorFilter paramColorFilter)
    {
      float f1 = paramInt1 / k;
      float f2 = paramInt2 / l;
      float f3 = Math.min(f1, f2);
      paramd = a;
      c.set(paramd);
      c.postScale(f1, f2);
      f1 = e(paramd);
      if (f1 == 0.0F) {
        return;
      }
      paramf.d(a);
      Object localObject1 = a;
      b.reset();
      if (paramf.c())
      {
        paramColorFilter = b;
        if (c == 0) {
          paramd = Path.FillType.WINDING;
        } else {
          paramd = Path.FillType.EVEN_ODD;
        }
        paramColorFilter.setFillType(paramd);
        b.addPath((Path)localObject1, c);
        paramCanvas.clipPath(b);
      }
      else
      {
        paramf = (g.c)paramf;
        float f4 = k;
        if ((f4 != 0.0F) || (l != 1.0F))
        {
          float f5 = m;
          float f6 = l;
          if (f == null) {
            f = new PathMeasure();
          }
          f.setPath(a, false);
          f2 = f.getLength();
          f4 = (f4 + f5) % 1.0F * f2;
          f5 = (f6 + f5) % 1.0F * f2;
          ((Path)localObject1).reset();
          if (f4 > f5)
          {
            f.getSegment(f4, f2, (Path)localObject1, true);
            f.getSegment(0.0F, f5, (Path)localObject1, true);
          }
          else
          {
            f.getSegment(f4, f5, (Path)localObject1, true);
          }
          ((Path)localObject1).rLineTo(0.0F, 0.0F);
        }
        b.addPath((Path)localObject1, c);
        Object localObject2;
        if (h.l())
        {
          paramd = h;
          if (e == null)
          {
            localObject1 = new Paint(1);
            e = ((Paint)localObject1);
            ((Paint)localObject1).setStyle(Paint.Style.FILL);
          }
          localObject1 = e;
          if (paramd.h())
          {
            paramd = paramd.f();
            paramd.setLocalMatrix(c);
            ((Paint)localObject1).setShader(paramd);
            ((Paint)localObject1).setAlpha(Math.round(j * 255.0F));
          }
          else
          {
            ((Paint)localObject1).setShader(null);
            ((Paint)localObject1).setAlpha(255);
            ((Paint)localObject1).setColor(g.a(paramd.e(), j));
          }
          ((Paint)localObject1).setColorFilter(paramColorFilter);
          localObject2 = b;
          if (c == 0) {
            paramd = Path.FillType.WINDING;
          } else {
            paramd = Path.FillType.EVEN_ODD;
          }
          ((Path)localObject2).setFillType(paramd);
          paramCanvas.drawPath(b, (Paint)localObject1);
        }
        if (f.l())
        {
          paramd = f;
          if (d == null)
          {
            localObject1 = new Paint(1);
            d = ((Paint)localObject1);
            ((Paint)localObject1).setStyle(Paint.Style.STROKE);
          }
          localObject1 = d;
          localObject2 = o;
          if (localObject2 != null) {
            ((Paint)localObject1).setStrokeJoin((Paint.Join)localObject2);
          }
          localObject2 = n;
          if (localObject2 != null) {
            ((Paint)localObject1).setStrokeCap((Paint.Cap)localObject2);
          }
          ((Paint)localObject1).setStrokeMiter(p);
          if (paramd.h())
          {
            paramd = paramd.f();
            paramd.setLocalMatrix(c);
            ((Paint)localObject1).setShader(paramd);
            ((Paint)localObject1).setAlpha(Math.round(i * 255.0F));
          }
          else
          {
            ((Paint)localObject1).setShader(null);
            ((Paint)localObject1).setAlpha(255);
            ((Paint)localObject1).setColor(g.a(paramd.e(), i));
          }
          ((Paint)localObject1).setColorFilter(paramColorFilter);
          ((Paint)localObject1).setStrokeWidth(g * (f3 * f1));
          paramCanvas.drawPath(b, (Paint)localObject1);
        }
      }
    }
    
    public final float e(Matrix paramMatrix)
    {
      float f1 = 0.0F;
      float[] arrayOfFloat = new float[4];
      float[] tmp7_6 = arrayOfFloat;
      tmp7_6[0] = 0.0F;
      float[] tmp11_7 = tmp7_6;
      tmp11_7[1] = 1.0F;
      float[] tmp15_11 = tmp11_7;
      tmp15_11[2] = 1.0F;
      float[] tmp19_15 = tmp15_11;
      tmp19_15[3] = 0.0F;
      tmp19_15;
      paramMatrix.mapVectors(arrayOfFloat);
      float f2 = (float)Math.hypot(arrayOfFloat[0], arrayOfFloat[1]);
      float f3 = (float)Math.hypot(arrayOfFloat[2], arrayOfFloat[3]);
      float f4 = a(arrayOfFloat[0], arrayOfFloat[1], arrayOfFloat[2], arrayOfFloat[3]);
      f3 = Math.max(f2, f3);
      if (f3 > 0.0F) {
        f1 = Math.abs(f4) / f3;
      }
      return f1;
    }
    
    public boolean f()
    {
      if (o == null) {
        o = Boolean.valueOf(h.a());
      }
      return o.booleanValue();
    }
    
    public boolean g(int[] paramArrayOfInt)
    {
      return h.b(paramArrayOfInt);
    }
    
    public float getAlpha()
    {
      return getRootAlpha() / 255.0F;
    }
    
    public int getRootAlpha()
    {
      return m;
    }
    
    public void setAlpha(float paramFloat)
    {
      setRootAlpha((int)(paramFloat * 255.0F));
    }
    
    public void setRootAlpha(int paramInt)
    {
      m = paramInt;
    }
  }
  
  public static class h
    extends Drawable.ConstantState
  {
    public int a;
    public g.g b;
    public ColorStateList c = null;
    public PorterDuff.Mode d = g.y;
    public boolean e;
    public Bitmap f;
    public ColorStateList g;
    public PorterDuff.Mode h;
    public int i;
    public boolean j;
    public boolean k;
    public Paint l;
    
    public h()
    {
      b = new g.g();
    }
    
    public h(h paramh)
    {
      if (paramh != null)
      {
        a = a;
        g.g localg = new g.g(b);
        b = localg;
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
    
    public boolean a(int paramInt1, int paramInt2)
    {
      return (paramInt1 == f.getWidth()) && (paramInt2 == f.getHeight());
    }
    
    public boolean b()
    {
      return (!k) && (g == c) && (h == d) && (j == e) && (i == b.getRootAlpha());
    }
    
    public void c(int paramInt1, int paramInt2)
    {
      if ((f == null) || (!a(paramInt1, paramInt2)))
      {
        f = Bitmap.createBitmap(paramInt1, paramInt2, Bitmap.Config.ARGB_8888);
        k = true;
      }
    }
    
    public void d(Canvas paramCanvas, ColorFilter paramColorFilter, Rect paramRect)
    {
      paramColorFilter = e(paramColorFilter);
      paramCanvas.drawBitmap(f, null, paramRect, paramColorFilter);
    }
    
    public Paint e(ColorFilter paramColorFilter)
    {
      if ((!f()) && (paramColorFilter == null)) {
        return null;
      }
      if (l == null)
      {
        Paint localPaint = new Paint();
        l = localPaint;
        localPaint.setFilterBitmap(true);
      }
      l.setAlpha(b.getRootAlpha());
      l.setColorFilter(paramColorFilter);
      return l;
    }
    
    public boolean f()
    {
      boolean bool;
      if (b.getRootAlpha() < 255) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public boolean g()
    {
      return b.f();
    }
    
    public int getChangingConfigurations()
    {
      return a;
    }
    
    public boolean h(int[] paramArrayOfInt)
    {
      boolean bool = b.g(paramArrayOfInt);
      k |= bool;
      return bool;
    }
    
    public void i()
    {
      g = c;
      h = d;
      i = b.getRootAlpha();
      j = e;
      k = false;
    }
    
    public void j(int paramInt1, int paramInt2)
    {
      f.eraseColor(0);
      Canvas localCanvas = new Canvas(f);
      b.b(localCanvas, paramInt1, paramInt2, null);
    }
    
    public Drawable newDrawable()
    {
      return new g(this);
    }
    
    public Drawable newDrawable(Resources paramResources)
    {
      return new g(this);
    }
  }
  
  public static class i
    extends Drawable.ConstantState
  {
    public final Drawable.ConstantState a;
    
    public i(Drawable.ConstantState paramConstantState)
    {
      a = paramConstantState;
    }
    
    public boolean canApplyTheme()
    {
      return a.canApplyTheme();
    }
    
    public int getChangingConfigurations()
    {
      return a.getChangingConfigurations();
    }
    
    public Drawable newDrawable()
    {
      g localg = new g();
      o = ((VectorDrawable)a.newDrawable());
      return localg;
    }
    
    public Drawable newDrawable(Resources paramResources)
    {
      g localg = new g();
      o = ((VectorDrawable)a.newDrawable(paramResources));
      return localg;
    }
    
    public Drawable newDrawable(Resources paramResources, Resources.Theme paramTheme)
    {
      g localg = new g();
      o = ((VectorDrawable)a.newDrawable(paramResources, paramTheme));
      return localg;
    }
  }
}

/* Location:
 * Qualified Name:     u1.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */