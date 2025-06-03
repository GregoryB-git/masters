package u1;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable.ConstantState;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import t.h;
import z.k;

public class b
  extends f
  implements Animatable
{
  public b p;
  public Context q;
  public ArgbEvaluator r = null;
  public Animator.AnimatorListener s = null;
  public ArrayList t = null;
  public final Drawable.Callback u;
  
  public b()
  {
    this(null, null, null);
  }
  
  public b(Context paramContext)
  {
    this(paramContext, null, null);
  }
  
  public b(Context paramContext, b paramb, Resources paramResources)
  {
    a locala = new a();
    u = locala;
    q = paramContext;
    if (paramb != null) {
      p = paramb;
    } else {
      p = new b(paramContext, paramb, locala, paramResources);
    }
  }
  
  public static b a(Context paramContext, Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme)
  {
    paramContext = new b(paramContext);
    paramContext.inflate(paramResources, paramXmlPullParser, paramAttributeSet, paramTheme);
    return paramContext;
  }
  
  public void applyTheme(Resources.Theme paramTheme)
  {
    Drawable localDrawable = o;
    if (localDrawable != null) {
      B.a.a(localDrawable, paramTheme);
    }
  }
  
  public final void b(String paramString, Animator paramAnimator)
  {
    paramAnimator.setTarget(p.b.d(paramString));
    b localb = p;
    if (d == null)
    {
      d = new ArrayList();
      p.e = new t.a();
    }
    p.d.add(paramAnimator);
    p.e.put(paramAnimator, paramString);
  }
  
  public boolean canApplyTheme()
  {
    Drawable localDrawable = o;
    if (localDrawable != null) {
      return B.a.b(localDrawable);
    }
    return false;
  }
  
  public void draw(Canvas paramCanvas)
  {
    Drawable localDrawable = o;
    if (localDrawable != null)
    {
      localDrawable.draw(paramCanvas);
      return;
    }
    p.b.draw(paramCanvas);
    if (p.c.isStarted()) {
      invalidateSelf();
    }
  }
  
  public int getAlpha()
  {
    Drawable localDrawable = o;
    if (localDrawable != null) {
      return B.a.c(localDrawable);
    }
    return p.b.getAlpha();
  }
  
  public int getChangingConfigurations()
  {
    Drawable localDrawable = o;
    if (localDrawable != null) {
      return localDrawable.getChangingConfigurations();
    }
    return super.getChangingConfigurations() | p.a;
  }
  
  public ColorFilter getColorFilter()
  {
    Drawable localDrawable = o;
    if (localDrawable != null) {
      return B.a.d(localDrawable);
    }
    return p.b.getColorFilter();
  }
  
  public Drawable.ConstantState getConstantState()
  {
    if ((o != null) && (Build.VERSION.SDK_INT >= 24)) {
      return new c(o.getConstantState());
    }
    return null;
  }
  
  public int getIntrinsicHeight()
  {
    Drawable localDrawable = o;
    if (localDrawable != null) {
      return localDrawable.getIntrinsicHeight();
    }
    return p.b.getIntrinsicHeight();
  }
  
  public int getIntrinsicWidth()
  {
    Drawable localDrawable = o;
    if (localDrawable != null) {
      return localDrawable.getIntrinsicWidth();
    }
    return p.b.getIntrinsicWidth();
  }
  
  public int getOpacity()
  {
    Drawable localDrawable = o;
    if (localDrawable != null) {
      return localDrawable.getOpacity();
    }
    return p.b.getOpacity();
  }
  
  public void inflate(Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet)
  {
    inflate(paramResources, paramXmlPullParser, paramAttributeSet, null);
  }
  
  public void inflate(Resources paramResources, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme)
  {
    Object localObject1 = o;
    if (localObject1 != null)
    {
      B.a.f((Drawable)localObject1, paramResources, paramXmlPullParser, paramAttributeSet, paramTheme);
      return;
    }
    int i = paramXmlPullParser.getEventType();
    int j = paramXmlPullParser.getDepth();
    while ((i != 1) && ((paramXmlPullParser.getDepth() >= j + 1) || (i != 3)))
    {
      if (i == 2)
      {
        localObject1 = paramXmlPullParser.getName();
        TypedArray localTypedArray;
        Object localObject2;
        if ("animated-vector".equals(localObject1))
        {
          localTypedArray = k.k(paramResources, paramTheme, paramAttributeSet, a.e);
          i = localTypedArray.getResourceId(0, 0);
          localObject1 = localTypedArray;
          if (i != 0)
          {
            localObject1 = g.b(paramResources, i, paramTheme);
            ((g)localObject1).h(false);
            ((Drawable)localObject1).setCallback(u);
            localObject2 = p.b;
            if (localObject2 != null) {
              ((Drawable)localObject2).setCallback(null);
            }
            p.b = ((g)localObject1);
            localObject1 = localTypedArray;
          }
        }
        for (;;)
        {
          ((TypedArray)localObject1).recycle();
          break label277;
          if (!"target".equals(localObject1)) {
            break label277;
          }
          localTypedArray = paramResources.obtainAttributes(paramAttributeSet, a.f);
          localObject2 = localTypedArray.getString(0);
          i = localTypedArray.getResourceId(1, 0);
          localObject1 = localTypedArray;
          if (i != 0)
          {
            localObject1 = q;
            if (localObject1 == null) {
              break;
            }
            b((String)localObject2, d.i((Context)localObject1, i));
            localObject1 = localTypedArray;
          }
        }
        localTypedArray.recycle();
        throw new IllegalStateException("Context can't be null when inflating animators");
      }
      label277:
      i = paramXmlPullParser.next();
    }
    p.a();
  }
  
  public boolean isAutoMirrored()
  {
    Drawable localDrawable = o;
    if (localDrawable != null) {
      return B.a.g(localDrawable);
    }
    return p.b.isAutoMirrored();
  }
  
  public boolean isRunning()
  {
    Drawable localDrawable = o;
    if (localDrawable != null) {
      return ((AnimatedVectorDrawable)localDrawable).isRunning();
    }
    return p.c.isRunning();
  }
  
  public boolean isStateful()
  {
    Drawable localDrawable = o;
    if (localDrawable != null) {
      return localDrawable.isStateful();
    }
    return p.b.isStateful();
  }
  
  public Drawable mutate()
  {
    Drawable localDrawable = o;
    if (localDrawable != null) {
      localDrawable.mutate();
    }
    return this;
  }
  
  public void onBoundsChange(Rect paramRect)
  {
    Drawable localDrawable = o;
    if (localDrawable != null)
    {
      localDrawable.setBounds(paramRect);
      return;
    }
    p.b.setBounds(paramRect);
  }
  
  public boolean onLevelChange(int paramInt)
  {
    Drawable localDrawable = o;
    if (localDrawable != null) {
      return localDrawable.setLevel(paramInt);
    }
    return p.b.setLevel(paramInt);
  }
  
  public boolean onStateChange(int[] paramArrayOfInt)
  {
    Drawable localDrawable = o;
    if (localDrawable != null) {
      return localDrawable.setState(paramArrayOfInt);
    }
    return p.b.setState(paramArrayOfInt);
  }
  
  public void setAlpha(int paramInt)
  {
    Drawable localDrawable = o;
    if (localDrawable != null)
    {
      localDrawable.setAlpha(paramInt);
      return;
    }
    p.b.setAlpha(paramInt);
  }
  
  public void setAutoMirrored(boolean paramBoolean)
  {
    Drawable localDrawable = o;
    if (localDrawable != null)
    {
      B.a.i(localDrawable, paramBoolean);
      return;
    }
    p.b.setAutoMirrored(paramBoolean);
  }
  
  public void setColorFilter(ColorFilter paramColorFilter)
  {
    Drawable localDrawable = o;
    if (localDrawable != null)
    {
      localDrawable.setColorFilter(paramColorFilter);
      return;
    }
    p.b.setColorFilter(paramColorFilter);
  }
  
  public void setTint(int paramInt)
  {
    Drawable localDrawable = o;
    if (localDrawable != null)
    {
      B.a.l(localDrawable, paramInt);
      return;
    }
    p.b.setTint(paramInt);
  }
  
  public void setTintList(ColorStateList paramColorStateList)
  {
    Drawable localDrawable = o;
    if (localDrawable != null)
    {
      B.a.m(localDrawable, paramColorStateList);
      return;
    }
    p.b.setTintList(paramColorStateList);
  }
  
  public void setTintMode(PorterDuff.Mode paramMode)
  {
    Drawable localDrawable = o;
    if (localDrawable != null)
    {
      B.a.n(localDrawable, paramMode);
      return;
    }
    p.b.setTintMode(paramMode);
  }
  
  public boolean setVisible(boolean paramBoolean1, boolean paramBoolean2)
  {
    Drawable localDrawable = o;
    if (localDrawable != null) {
      return localDrawable.setVisible(paramBoolean1, paramBoolean2);
    }
    p.b.setVisible(paramBoolean1, paramBoolean2);
    return super.setVisible(paramBoolean1, paramBoolean2);
  }
  
  public void start()
  {
    Drawable localDrawable = o;
    if (localDrawable != null)
    {
      ((AnimatedVectorDrawable)localDrawable).start();
      return;
    }
    if (p.c.isStarted()) {
      return;
    }
    p.c.start();
    invalidateSelf();
  }
  
  public void stop()
  {
    Drawable localDrawable = o;
    if (localDrawable != null)
    {
      ((AnimatedVectorDrawable)localDrawable).stop();
      return;
    }
    p.c.end();
  }
  
  public class a
    implements Drawable.Callback
  {
    public a() {}
    
    public void invalidateDrawable(Drawable paramDrawable)
    {
      invalidateSelf();
    }
    
    public void scheduleDrawable(Drawable paramDrawable, Runnable paramRunnable, long paramLong)
    {
      scheduleSelf(paramRunnable, paramLong);
    }
    
    public void unscheduleDrawable(Drawable paramDrawable, Runnable paramRunnable)
    {
      unscheduleSelf(paramRunnable);
    }
  }
  
  public static class b
    extends Drawable.ConstantState
  {
    public int a;
    public g b;
    public AnimatorSet c;
    public ArrayList d;
    public t.a e;
    
    public b(Context paramContext, b paramb, Drawable.Callback paramCallback, Resources paramResources)
    {
      if (paramb != null)
      {
        a = a;
        paramContext = b;
        int i = 0;
        if (paramContext != null)
        {
          paramContext = paramContext.getConstantState();
          if (paramResources != null) {}
          for (paramContext = paramContext.newDrawable(paramResources);; paramContext = paramContext.newDrawable())
          {
            b = ((g)paramContext);
            break;
          }
          paramContext = (g)b.mutate();
          b = paramContext;
          paramContext.setCallback(paramCallback);
          b.setBounds(b.getBounds());
          b.h(false);
        }
        paramContext = d;
        if (paramContext != null)
        {
          int j = paramContext.size();
          d = new ArrayList(j);
          e = new t.a(j);
          while (i < j)
          {
            paramCallback = (Animator)d.get(i);
            paramContext = paramCallback.clone();
            paramCallback = (String)e.get(paramCallback);
            paramContext.setTarget(b.d(paramCallback));
            d.add(paramContext);
            e.put(paramContext, paramCallback);
            i++;
          }
          a();
        }
      }
    }
    
    public void a()
    {
      if (c == null) {
        c = new AnimatorSet();
      }
      c.playTogether(d);
    }
    
    public int getChangingConfigurations()
    {
      return a;
    }
    
    public Drawable newDrawable()
    {
      throw new IllegalStateException("No constant state support for SDK < 24.");
    }
    
    public Drawable newDrawable(Resources paramResources)
    {
      throw new IllegalStateException("No constant state support for SDK < 24.");
    }
  }
  
  public static class c
    extends Drawable.ConstantState
  {
    public final Drawable.ConstantState a;
    
    public c(Drawable.ConstantState paramConstantState)
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
      b localb = new b();
      Drawable localDrawable = a.newDrawable();
      o = localDrawable;
      localDrawable.setCallback(u);
      return localb;
    }
    
    public Drawable newDrawable(Resources paramResources)
    {
      b localb = new b();
      paramResources = a.newDrawable(paramResources);
      o = paramResources;
      paramResources.setCallback(u);
      return localb;
    }
    
    public Drawable newDrawable(Resources paramResources, Resources.Theme paramTheme)
    {
      b localb = new b();
      paramResources = a.newDrawable(paramResources, paramTheme);
      o = paramResources;
      paramResources.setCallback(u);
      return localb;
    }
  }
}

/* Location:
 * Qualified Name:     u1.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */