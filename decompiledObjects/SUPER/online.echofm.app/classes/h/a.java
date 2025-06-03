package h;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.StateSet;
import l.M;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import t.f;
import t.i;
import u1.g;
import z.k;

public class a
  extends d
{
  public c C;
  public g D;
  public int E = -1;
  public int F = -1;
  public boolean G;
  
  public a()
  {
    this(null, null);
  }
  
  public a(c paramc, Resources paramResources)
  {
    super(null);
    h(new c(paramc, this, paramResources));
    onStateChange(getState());
    jumpToCurrentState();
  }
  
  public static a l(Context paramContext, Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme)
  {
    Object localObject = paramXmlPullParser.getName();
    if (((String)localObject).equals("animated-selector"))
    {
      localObject = new a();
      ((a)localObject).m(paramContext, paramResources, paramXmlPullParser, paramAttributeSet, paramTheme);
      return (a)localObject;
    }
    paramContext = new StringBuilder();
    paramContext.append(paramXmlPullParser.getPositionDescription());
    paramContext.append(": invalid animated-selector tag ");
    paramContext.append((String)localObject);
    throw new XmlPullParserException(paramContext.toString());
  }
  
  public void h(b.c paramc)
  {
    super.h(paramc);
    if ((paramc instanceof c)) {
      C = ((c)paramc);
    }
  }
  
  public boolean isStateful()
  {
    return true;
  }
  
  public void jumpToCurrentState()
  {
    super.jumpToCurrentState();
    g localg = D;
    if (localg != null)
    {
      localg.d();
      D = null;
      g(E);
      E = -1;
      F = -1;
    }
  }
  
  public c k()
  {
    return new c(C, this, null);
  }
  
  public void m(Context paramContext, Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme)
  {
    TypedArray localTypedArray = k.k(paramResources, paramTheme, paramAttributeSet, i.b.a);
    setVisible(localTypedArray.getBoolean(i.b.c, true), true);
    s(localTypedArray);
    i(paramResources);
    localTypedArray.recycle();
    n(paramContext, paramResources, paramXmlPullParser, paramAttributeSet, paramTheme);
    o();
  }
  
  public Drawable mutate()
  {
    if ((!G) && (super.mutate() == this))
    {
      C.r();
      G = true;
    }
    return this;
  }
  
  public final void n(Context paramContext, Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme)
  {
    int i = paramXmlPullParser.getDepth() + 1;
    for (;;)
    {
      int j = paramXmlPullParser.next();
      if (j == 1) {
        break;
      }
      int k = paramXmlPullParser.getDepth();
      if ((k < i) && (j == 3)) {
        break;
      }
      if ((j == 2) && (k <= i)) {
        if (paramXmlPullParser.getName().equals("item")) {
          p(paramContext, paramResources, paramXmlPullParser, paramAttributeSet, paramTheme);
        } else if (paramXmlPullParser.getName().equals("transition")) {
          q(paramContext, paramResources, paramXmlPullParser, paramAttributeSet, paramTheme);
        }
      }
    }
  }
  
  public final void o()
  {
    onStateChange(getState());
  }
  
  public boolean onStateChange(int[] paramArrayOfInt)
  {
    int i = C.F(paramArrayOfInt);
    boolean bool1;
    if ((i != c()) && ((r(i)) || (g(i)))) {
      bool1 = true;
    } else {
      bool1 = false;
    }
    Drawable localDrawable = getCurrent();
    boolean bool2 = bool1;
    if (localDrawable != null) {
      bool2 = bool1 | localDrawable.setState(paramArrayOfInt);
    }
    return bool2;
  }
  
  public final int p(Context paramContext, Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme)
  {
    Object localObject = k.k(paramResources, paramTheme, paramAttributeSet, i.b.h);
    int i = ((TypedArray)localObject).getResourceId(i.b.i, 0);
    int j = ((TypedArray)localObject).getResourceId(i.b.j, -1);
    if (j > 0) {
      paramContext = M.h().j(paramContext, j);
    } else {
      paramContext = null;
    }
    ((TypedArray)localObject).recycle();
    int[] arrayOfInt = j(paramAttributeSet);
    localObject = paramContext;
    if (paramContext == null)
    {
      do
      {
        j = paramXmlPullParser.next();
      } while (j == 4);
      if (j == 2)
      {
        if (paramXmlPullParser.getName().equals("vector")) {
          localObject = g.c(paramResources, paramXmlPullParser, paramAttributeSet, paramTheme);
        } else {
          localObject = Drawable.createFromXmlInner(paramResources, paramXmlPullParser, paramAttributeSet, paramTheme);
        }
      }
      else
      {
        paramContext = new StringBuilder();
        paramContext.append(paramXmlPullParser.getPositionDescription());
        paramContext.append(": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
        throw new XmlPullParserException(paramContext.toString());
      }
    }
    if (localObject != null) {
      return C.B(arrayOfInt, (Drawable)localObject, i);
    }
    paramContext = new StringBuilder();
    paramContext.append(paramXmlPullParser.getPositionDescription());
    paramContext.append(": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
    throw new XmlPullParserException(paramContext.toString());
  }
  
  public final int q(Context paramContext, Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme)
  {
    Object localObject = k.k(paramResources, paramTheme, paramAttributeSet, i.b.k);
    int i = ((TypedArray)localObject).getResourceId(i.b.n, -1);
    int j = ((TypedArray)localObject).getResourceId(i.b.m, -1);
    int k = ((TypedArray)localObject).getResourceId(i.b.l, -1);
    Drawable localDrawable;
    if (k > 0) {
      localDrawable = M.h().j(paramContext, k);
    } else {
      localDrawable = null;
    }
    boolean bool = ((TypedArray)localObject).getBoolean(i.b.o, false);
    ((TypedArray)localObject).recycle();
    localObject = localDrawable;
    if (localDrawable == null)
    {
      do
      {
        k = paramXmlPullParser.next();
      } while (k == 4);
      if (k == 2)
      {
        if (paramXmlPullParser.getName().equals("animated-vector")) {
          localObject = u1.b.a(paramContext, paramResources, paramXmlPullParser, paramAttributeSet, paramTheme);
        } else {
          localObject = Drawable.createFromXmlInner(paramResources, paramXmlPullParser, paramAttributeSet, paramTheme);
        }
      }
      else
      {
        paramContext = new StringBuilder();
        paramContext.append(paramXmlPullParser.getPositionDescription());
        paramContext.append(": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
        throw new XmlPullParserException(paramContext.toString());
      }
    }
    if (localObject != null)
    {
      if ((i != -1) && (j != -1)) {
        return C.C(i, j, (Drawable)localObject, bool);
      }
      paramContext = new StringBuilder();
      paramContext.append(paramXmlPullParser.getPositionDescription());
      paramContext.append(": <transition> tag requires 'fromId' & 'toId' attributes");
      throw new XmlPullParserException(paramContext.toString());
    }
    paramContext = new StringBuilder();
    paramContext.append(paramXmlPullParser.getPositionDescription());
    paramContext.append(": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
    throw new XmlPullParserException(paramContext.toString());
  }
  
  public final boolean r(int paramInt)
  {
    Object localObject = D;
    int i;
    if (localObject != null)
    {
      if (paramInt == E) {
        return true;
      }
      if ((paramInt == F) && (((g)localObject).a()))
      {
        ((g)localObject).b();
        E = F;
        F = paramInt;
        return true;
      }
      i = E;
      ((g)localObject).d();
    }
    else
    {
      i = c();
    }
    D = null;
    F = -1;
    E = -1;
    c localc = C;
    int j = localc.E(i);
    int k = localc.E(paramInt);
    if ((k != 0) && (j != 0))
    {
      int m = localc.G(j, k);
      if (m < 0) {
        return false;
      }
      boolean bool1 = localc.I(j, k);
      g(m);
      localObject = getCurrent();
      if ((localObject instanceof AnimationDrawable))
      {
        boolean bool2 = localc.H(j, k);
        localObject = new e((AnimationDrawable)localObject, bool2, bool1);
      }
      else if ((localObject instanceof u1.b))
      {
        localObject = new d((u1.b)localObject);
      }
      else
      {
        if (!(localObject instanceof Animatable)) {
          break label260;
        }
        localObject = new b((Animatable)localObject);
      }
      ((g)localObject).c();
      D = ((g)localObject);
      F = i;
      E = paramInt;
      return true;
    }
    label260:
    return false;
  }
  
  public final void s(TypedArray paramTypedArray)
  {
    c localc = C;
    d |= paramTypedArray.getChangingConfigurations();
    localc.x(paramTypedArray.getBoolean(i.b.d, i));
    localc.t(paramTypedArray.getBoolean(i.b.e, l));
    localc.u(paramTypedArray.getInt(i.b.f, A));
    localc.v(paramTypedArray.getInt(i.b.g, B));
    setDither(paramTypedArray.getBoolean(i.b.b, x));
  }
  
  public boolean setVisible(boolean paramBoolean1, boolean paramBoolean2)
  {
    boolean bool = super.setVisible(paramBoolean1, paramBoolean2);
    g localg = D;
    if ((localg != null) && ((bool) || (paramBoolean2))) {
      if (paramBoolean1) {
        localg.c();
      } else {
        jumpToCurrentState();
      }
    }
    return bool;
  }
  
  public static class b
    extends a.g
  {
    public final Animatable a;
    
    public b(Animatable paramAnimatable)
    {
      super();
      a = paramAnimatable;
    }
    
    public void c()
    {
      a.start();
    }
    
    public void d()
    {
      a.stop();
    }
  }
  
  public static class c
    extends d.a
  {
    public f K;
    public i L;
    
    public c(c paramc, a parama, Resources paramResources)
    {
      super(parama, paramResources);
      if (paramc != null) {
        K = K;
      }
      for (paramc = L;; paramc = new i())
      {
        L = paramc;
        break;
        K = new f();
      }
    }
    
    public static long D(int paramInt1, int paramInt2)
    {
      long l = paramInt1;
      return paramInt2 | l << 32;
    }
    
    public int B(int[] paramArrayOfInt, Drawable paramDrawable, int paramInt)
    {
      int i = super.z(paramArrayOfInt, paramDrawable);
      L.n(i, Integer.valueOf(paramInt));
      return i;
    }
    
    public int C(int paramInt1, int paramInt2, Drawable paramDrawable, boolean paramBoolean)
    {
      int i = super.a(paramDrawable);
      long l1 = D(paramInt1, paramInt2);
      long l2;
      if (paramBoolean) {
        l2 = 8589934592L;
      } else {
        l2 = 0L;
      }
      paramDrawable = K;
      long l3 = i;
      paramDrawable.a(l1, Long.valueOf(l3 | l2));
      if (paramBoolean)
      {
        l1 = D(paramInt2, paramInt1);
        K.a(l1, Long.valueOf(0x100000000 | l3 | l2));
      }
      return i;
    }
    
    public int E(int paramInt)
    {
      int i = 0;
      if (paramInt < 0) {
        paramInt = i;
      } else {
        paramInt = ((Integer)L.j(paramInt, Integer.valueOf(0))).intValue();
      }
      return paramInt;
    }
    
    public int F(int[] paramArrayOfInt)
    {
      int i = super.A(paramArrayOfInt);
      if (i >= 0) {
        return i;
      }
      return super.A(StateSet.WILD_CARD);
    }
    
    public int G(int paramInt1, int paramInt2)
    {
      long l = D(paramInt1, paramInt2);
      return (int)((Long)K.g(l, Long.valueOf(-1L))).longValue();
    }
    
    public boolean H(int paramInt1, int paramInt2)
    {
      long l = D(paramInt1, paramInt2);
      boolean bool;
      if ((((Long)K.g(l, Long.valueOf(-1L))).longValue() & 0x100000000) != 0L) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public boolean I(int paramInt1, int paramInt2)
    {
      long l = D(paramInt1, paramInt2);
      boolean bool;
      if ((((Long)K.g(l, Long.valueOf(-1L))).longValue() & 0x200000000) != 0L) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public Drawable newDrawable()
    {
      return new a(this, null);
    }
    
    public Drawable newDrawable(Resources paramResources)
    {
      return new a(this, paramResources);
    }
    
    public void r()
    {
      K = K.b();
      L = L.d();
    }
  }
  
  public static class d
    extends a.g
  {
    public final u1.b a;
    
    public d(u1.b paramb)
    {
      super();
      a = paramb;
    }
    
    public void c()
    {
      a.start();
    }
    
    public void d()
    {
      a.stop();
    }
  }
  
  public static class e
    extends a.g
  {
    public final ObjectAnimator a;
    public final boolean b;
    
    public e(AnimationDrawable paramAnimationDrawable, boolean paramBoolean1, boolean paramBoolean2)
    {
      super();
      int i = paramAnimationDrawable.getNumberOfFrames();
      int j = 0;
      int k;
      if (paramBoolean1) {
        k = i - 1;
      } else {
        k = 0;
      }
      if (!paramBoolean1) {
        j = i - 1;
      }
      a.f localf = new a.f(paramAnimationDrawable, paramBoolean1);
      paramAnimationDrawable = ObjectAnimator.ofInt(paramAnimationDrawable, "currentIndex", new int[] { k, j });
      paramAnimationDrawable.setAutoCancel(true);
      paramAnimationDrawable.setDuration(localf.a());
      paramAnimationDrawable.setInterpolator(localf);
      b = paramBoolean2;
      a = paramAnimationDrawable;
    }
    
    public boolean a()
    {
      return b;
    }
    
    public void b()
    {
      a.reverse();
    }
    
    public void c()
    {
      a.start();
    }
    
    public void d()
    {
      a.cancel();
    }
  }
  
  public static class f
    implements TimeInterpolator
  {
    public int[] a;
    public int b;
    public int c;
    
    public f(AnimationDrawable paramAnimationDrawable, boolean paramBoolean)
    {
      b(paramAnimationDrawable, paramBoolean);
    }
    
    public int a()
    {
      return c;
    }
    
    public int b(AnimationDrawable paramAnimationDrawable, boolean paramBoolean)
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
      return k;
    }
    
    public float getInterpolation(float paramFloat)
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
  
  public static abstract class g
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