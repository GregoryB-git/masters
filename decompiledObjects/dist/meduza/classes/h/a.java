package h;

import a2.f;
import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.StateSet;
import l.q0;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p2.m0;
import r.e;
import r.i;
import w.k;

public final class a
  extends d
{
  public int A = -1;
  public boolean B;
  public b x;
  public f y;
  public int z = -1;
  
  public a()
  {
    this(null, null);
  }
  
  public a(b paramb, Resources paramResources)
  {
    e(new b(paramb, this, paramResources));
    onStateChange(getState());
    jumpToCurrentState();
  }
  
  public static a g(Context paramContext, Resources.Theme paramTheme, Resources paramResources, AttributeSet paramAttributeSet, XmlResourceParser paramXmlResourceParser)
  {
    Object localObject1 = paramTheme;
    Object localObject2 = paramResources;
    Object localObject3 = paramXmlResourceParser.getName();
    if (((String)localObject3).equals("animated-selector"))
    {
      a locala = new a();
      localObject3 = k.f((Resources)localObject2, (Resources.Theme)localObject1, paramAttributeSet, m0.e);
      locala.setVisible(((TypedArray)localObject3).getBoolean(1, true), true);
      Object localObject4 = x;
      d |= i.b.b((TypedArray)localObject3);
      i = ((TypedArray)localObject3).getBoolean(2, i);
      l = ((TypedArray)localObject3).getBoolean(3, l);
      y = ((TypedArray)localObject3).getInt(4, y);
      z = ((TypedArray)localObject3).getInt(5, z);
      locala.setDither(((TypedArray)localObject3).getBoolean(0, w));
      localObject4 = a;
      int i;
      int j;
      if (localObject2 != null)
      {
        b = ((Resources)localObject2);
        i = getDisplayMetricsdensityDpi;
        j = i;
        if (i == 0) {
          j = 160;
        }
        i = c;
        c = j;
        if (i != j)
        {
          m = false;
          j = false;
        }
      }
      else
      {
        localObject4.getClass();
      }
      ((TypedArray)localObject3).recycle();
      int k = paramXmlResourceParser.getDepth() + 1;
      localObject4 = paramContext;
      localObject3 = localObject1;
      for (;;)
      {
        Resources localResources = paramResources;
        i = paramXmlResourceParser.next();
        if (i == 1) {
          break;
        }
        j = paramXmlResourceParser.getDepth();
        if ((j < k) && (i == 3)) {
          break;
        }
        if ((i == 2) && (j <= k))
        {
          boolean bool = paramXmlResourceParser.getName().equals("item");
          localObject2 = null;
          localObject1 = null;
          int i2;
          Object localObject5;
          if (bool)
          {
            localObject2 = k.f(localResources, (Resources.Theme)localObject3, paramAttributeSet, m0.f);
            int m = ((TypedArray)localObject2).getResourceId(0, 0);
            j = ((TypedArray)localObject2).getResourceId(1, -1);
            if (j > 0) {
              localObject1 = q0.d().f((Context)localObject4, j);
            }
            ((TypedArray)localObject2).recycle();
            int n = paramAttributeSet.getAttributeCount();
            localObject2 = new int[n];
            i = 0;
            j = i;
            while (j < n)
            {
              int i1 = paramAttributeSet.getAttributeNameResource(j);
              i2 = i;
              if (i1 != 0)
              {
                i2 = i;
                if (i1 != 16842960)
                {
                  i2 = i;
                  if (i1 != 16843161)
                  {
                    if (paramAttributeSet.getAttributeBooleanValue(j, false)) {
                      i2 = i1;
                    } else {
                      i2 = -i1;
                    }
                    localObject2[i] = i2;
                    i2 = i + 1;
                  }
                }
              }
              j++;
              i = i2;
            }
            localObject5 = StateSet.trimStateSet((int[])localObject2, i);
            localObject2 = localObject1;
            if (localObject1 == null)
            {
              do
              {
                j = paramXmlResourceParser.next();
              } while (j == 4);
              if (j == 2)
              {
                if (paramXmlResourceParser.getName().equals("vector"))
                {
                  localObject2 = new f();
                  ((f)localObject2).inflate(localResources, paramXmlResourceParser, paramAttributeSet, (Resources.Theme)localObject3);
                }
                else
                {
                  localObject2 = i.b.a(localResources, paramXmlResourceParser, paramAttributeSet, (Resources.Theme)localObject3);
                }
              }
              else
              {
                paramContext = new StringBuilder();
                paramContext.append(paramXmlResourceParser.getPositionDescription());
                paramContext.append(": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
                throw new XmlPullParserException(paramContext.toString());
              }
            }
            if (localObject2 != null)
            {
              localObject1 = x;
              j = ((b.c)localObject1).a((Drawable)localObject2);
              H[j] = localObject5;
              J.d(j, Integer.valueOf(m));
            }
            else
            {
              paramContext = new StringBuilder();
              paramContext.append(paramXmlResourceParser.getPositionDescription());
              paramContext.append(": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
              throw new XmlPullParserException(paramContext.toString());
            }
          }
          else
          {
            if (paramXmlResourceParser.getName().equals("transition"))
            {
              localObject5 = k.f(localResources, (Resources.Theme)localObject3, paramAttributeSet, m0.o);
              j = ((TypedArray)localObject5).getResourceId(2, -1);
              i = ((TypedArray)localObject5).getResourceId(1, -1);
              i2 = ((TypedArray)localObject5).getResourceId(0, -1);
              localObject1 = localObject2;
              if (i2 > 0) {
                localObject1 = q0.d().f((Context)localObject4, i2);
              }
              bool = ((TypedArray)localObject5).getBoolean(3, false);
              ((TypedArray)localObject5).recycle();
              if (localObject1 == null)
              {
                do
                {
                  i2 = paramXmlResourceParser.next();
                } while (i2 == 4);
                if (i2 == 2)
                {
                  if (paramXmlResourceParser.getName().equals("animated-vector"))
                  {
                    localObject1 = new a2.b(paramContext);
                    ((a2.b)localObject1).inflate(localResources, paramXmlResourceParser, paramAttributeSet, paramTheme);
                  }
                  else
                  {
                    localObject1 = i.b.a(localResources, paramXmlResourceParser, paramAttributeSet, (Resources.Theme)localObject3);
                  }
                }
                else
                {
                  paramContext = new StringBuilder();
                  paramContext.append(paramXmlResourceParser.getPositionDescription());
                  paramContext.append(": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
                  throw new XmlPullParserException(paramContext.toString());
                }
              }
              if (localObject1 != null)
              {
                if ((j != -1) && (i != -1))
                {
                  localObject2 = x;
                  i2 = ((b.c)localObject2).a((Drawable)localObject1);
                  long l1 = j;
                  long l2 = i;
                  long l3;
                  if (bool) {
                    l3 = 8589934592L;
                  } else {
                    l3 = 0L;
                  }
                  localObject1 = I;
                  long l4 = i2;
                  ((e)localObject1).a(Long.valueOf(l4 | l3), l2 | l1 << 32);
                  if (bool) {
                    I.a(Long.valueOf(l4 | 0x100000000 | l3), l2 << 32 | l1);
                  }
                }
                else
                {
                  paramContext = new StringBuilder();
                  paramContext.append(paramXmlResourceParser.getPositionDescription());
                  paramContext.append(": <transition> tag requires 'fromId' & 'toId' attributes");
                  throw new XmlPullParserException(paramContext.toString());
                }
              }
              else
              {
                paramContext = new StringBuilder();
                paramContext.append(paramXmlResourceParser.getPositionDescription());
                paramContext.append(": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
                throw new XmlPullParserException(paramContext.toString());
              }
            }
            localObject3 = paramTheme;
            localObject4 = paramContext;
          }
        }
      }
      locala.onStateChange(locala.getState());
      return locala;
    }
    paramContext = new StringBuilder();
    paramContext.append(paramXmlResourceParser.getPositionDescription());
    paramContext.append(": invalid animated-selector tag ");
    paramContext.append((String)localObject3);
    throw new XmlPullParserException(paramContext.toString());
  }
  
  public final b.c b()
  {
    return new b(x, this, null);
  }
  
  public final void e(b.c paramc)
  {
    super.e(paramc);
    if ((paramc instanceof b)) {
      x = ((b)paramc);
    }
  }
  
  public final d.a f()
  {
    return new b(x, this, null);
  }
  
  public final void jumpToCurrentState()
  {
    super.jumpToCurrentState();
    f localf = y;
    if (localf != null)
    {
      localf.d();
      y = null;
      d(z);
      z = -1;
      A = -1;
    }
  }
  
  public final Drawable mutate()
  {
    if (!B)
    {
      super.mutate();
      x.e();
      B = true;
    }
    return this;
  }
  
  public final boolean onStateChange(int[] paramArrayOfInt)
  {
    Object localObject = x;
    int i = ((d.a)localObject).f(paramArrayOfInt);
    if (i < 0) {
      i = ((d.a)localObject).f(StateSet.WILD_CARD);
    }
    int j = o;
    boolean bool1 = true;
    if (i != j)
    {
      localObject = y;
      if (localObject != null)
      {
        if (i != z) {
          if ((i == A) && (((f)localObject).a()))
          {
            ((f)localObject).b();
            z = A;
            A = i;
          }
          else
          {
            j = z;
            ((f)localObject).d();
          }
        }
      }
      else
      {
        y = null;
        A = -1;
        z = -1;
        localObject = x;
        if (j < 0)
        {
          localObject.getClass();
          k = 0;
        }
        else
        {
          k = ((Integer)J.c(j, Integer.valueOf(0))).intValue();
        }
        int m;
        if (i < 0) {
          m = 0;
        } else {
          m = ((Integer)J.c(i, Integer.valueOf(0))).intValue();
        }
        if ((m == 0) || (k == 0)) {
          break label444;
        }
        long l = k;
        l = m | l << 32;
        int k = (int)((Long)I.d(Long.valueOf(-1L), l)).longValue();
        if (k < 0) {
          break label444;
        }
        if ((((Long)I.d(Long.valueOf(-1L), l)).longValue() & 0x200000000) != 0L) {
          bool2 = true;
        } else {
          bool2 = false;
        }
        d(k);
        Drawable localDrawable = c;
        if ((localDrawable instanceof AnimationDrawable))
        {
          if ((((Long)I.d(Long.valueOf(-1L), l)).longValue() & 0x100000000) != 0L) {
            bool3 = true;
          } else {
            bool3 = false;
          }
          localObject = new d((AnimationDrawable)localDrawable, bool3, bool2);
        }
        else if ((localDrawable instanceof a2.b))
        {
          localObject = new c((a2.b)localDrawable);
        }
        else
        {
          if (!(localDrawable instanceof Animatable)) {
            break label444;
          }
          localObject = new a((Animatable)localDrawable);
        }
        ((f)localObject).c();
        y = ((f)localObject);
        A = j;
        z = i;
      }
      j = 1;
      break label447;
      label444:
      j = 0;
      label447:
      bool2 = bool1;
      if (j != 0) {
        break label474;
      }
      if (d(i))
      {
        bool2 = bool1;
        break label474;
      }
    }
    boolean bool2 = false;
    label474:
    localObject = c;
    boolean bool3 = bool2;
    if (localObject != null) {
      bool3 = bool2 | ((Drawable)localObject).setState(paramArrayOfInt);
    }
    return bool3;
  }
  
  public final boolean setVisible(boolean paramBoolean1, boolean paramBoolean2)
  {
    boolean bool = super.setVisible(paramBoolean1, paramBoolean2);
    f localf = y;
    if ((localf != null) && ((bool) || (paramBoolean2))) {
      if (paramBoolean1) {
        localf.c();
      } else {
        jumpToCurrentState();
      }
    }
    return bool;
  }
  
  public static final class a
    extends a.f
  {
    public final Animatable a;
    
    public a(Animatable paramAnimatable)
    {
      a = paramAnimatable;
    }
    
    public final void c()
    {
      a.start();
    }
    
    public final void d()
    {
      a.stop();
    }
  }
  
  public static final class b
    extends d.a
  {
    public e<Long> I;
    public i<Integer> J;
    
    public b(b paramb, a parama, Resources paramResources)
    {
      super(parama, paramResources);
      if (paramb != null)
      {
        I = I;
        paramb = J;
      }
      else
      {
        I = new e();
        paramb = new i();
      }
      J = paramb;
    }
    
    public final void e()
    {
      I = I.b();
      J = J.b();
    }
    
    public final Drawable newDrawable()
    {
      return new a(this, null);
    }
    
    public final Drawable newDrawable(Resources paramResources)
    {
      return new a(this, paramResources);
    }
  }
  
  public static final class c
    extends a.f
  {
    public final a2.b a;
    
    public c(a2.b paramb)
    {
      a = paramb;
    }
    
    public final void c()
    {
      a.start();
    }
    
    public final void d()
    {
      a.stop();
    }
  }
  
  public static final class d
    extends a.f
  {
    public final ObjectAnimator a;
    public final boolean b;
    
    public d(AnimationDrawable paramAnimationDrawable, boolean paramBoolean1, boolean paramBoolean2)
    {
      int i = paramAnimationDrawable.getNumberOfFrames();
      int j;
      if (paramBoolean1) {
        j = i - 1;
      } else {
        j = 0;
      }
      if (paramBoolean1) {
        i = 0;
      } else {
        i--;
      }
      a.e locale = new a.e(paramAnimationDrawable, paramBoolean1);
      paramAnimationDrawable = ObjectAnimator.ofInt(paramAnimationDrawable, "currentIndex", new int[] { j, i });
      i.a.a(paramAnimationDrawable, true);
      paramAnimationDrawable.setDuration(c);
      paramAnimationDrawable.setInterpolator(locale);
      b = paramBoolean2;
      a = paramAnimationDrawable;
    }
    
    public final boolean a()
    {
      return b;
    }
    
    public final void b()
    {
      a.reverse();
    }
    
    public final void c()
    {
      a.start();
    }
    
    public final void d()
    {
      a.cancel();
    }
  }
  
  public static final class e
    implements TimeInterpolator
  {
    public int[] a;
    public int b;
    public int c;
    
    public e(AnimationDrawable paramAnimationDrawable, boolean paramBoolean)
    {
      int i = paramAnimationDrawable.getNumberOfFrames();
      b = i;
      int[] arrayOfInt = a;
      if ((arrayOfInt == null) || (arrayOfInt.length < i)) {
        a = new int[i];
      }
      arrayOfInt = a;
      int j = 0;
      int k = 0;
      while (j < i)
      {
        if (paramBoolean) {
          m = i - j - 1;
        } else {
          m = j;
        }
        int m = paramAnimationDrawable.getDuration(m);
        arrayOfInt[j] = m;
        k += m;
        j++;
      }
      c = k;
    }
    
    public final float getInterpolation(float paramFloat)
    {
      int i = (int)(paramFloat * c + 0.5F);
      int j = b;
      int[] arrayOfInt = a;
      for (int k = 0; k < j; k++)
      {
        int m = arrayOfInt[k];
        if (i < m) {
          break;
        }
        i -= m;
      }
      if (k < j) {
        paramFloat = i / c;
      } else {
        paramFloat = 0.0F;
      }
      return k / j + paramFloat;
    }
  }
  
  public static abstract class f
  {
    public boolean a()
    {
      return false;
    }
    
    public void b() {}
    
    public abstract void c();
    
    public abstract void d();
  }
}

/* Location:
 * Qualified Name:     h.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */