package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import t.f;
import t.h;
import t.i;
import u1.b;

public final class M
{
  public static final PorterDuff.Mode h = PorterDuff.Mode.SRC_IN;
  public static M i;
  public static final c j = new c(6);
  public WeakHashMap a;
  public h b;
  public i c;
  public final WeakHashMap d = new WeakHashMap(0);
  public TypedValue e;
  public boolean f;
  public e g;
  
  public static long e(TypedValue paramTypedValue)
  {
    return assetCookie << 32 | data;
  }
  
  public static PorterDuffColorFilter g(ColorStateList paramColorStateList, PorterDuff.Mode paramMode, int[] paramArrayOfInt)
  {
    if ((paramColorStateList != null) && (paramMode != null)) {
      return l(paramColorStateList.getColorForState(paramArrayOfInt, 0), paramMode);
    }
    return null;
  }
  
  public static M h()
  {
    try
    {
      if (i == null)
      {
        M localM1 = new l/M;
        localM1.<init>();
        i = localM1;
        p(localM1);
      }
    }
    finally
    {
      break label41;
    }
    M localM2 = i;
    return localM2;
    label41:
    throw localM2;
  }
  
  public static PorterDuffColorFilter l(int paramInt, PorterDuff.Mode paramMode)
  {
    PorterDuffColorFilter localPorterDuffColorFilter2;
    try
    {
      c localc = j;
      PorterDuffColorFilter localPorterDuffColorFilter1 = localc.k(paramInt, paramMode);
      localPorterDuffColorFilter2 = localPorterDuffColorFilter1;
      if (localPorterDuffColorFilter1 == null)
      {
        localPorterDuffColorFilter2 = new android/graphics/PorterDuffColorFilter;
        localPorterDuffColorFilter2.<init>(paramInt, paramMode);
        localc.l(paramInt, paramMode, localPorterDuffColorFilter2);
      }
    }
    finally
    {
      break label55;
    }
    return localPorterDuffColorFilter2;
    label55:
    throw paramMode;
  }
  
  public static void p(M paramM)
  {
    if (Build.VERSION.SDK_INT < 24)
    {
      paramM.a("vector", new f());
      paramM.a("animated-vector", new b());
      paramM.a("animated-selector", new a());
    }
  }
  
  public static boolean q(Drawable paramDrawable)
  {
    boolean bool;
    if ((!(paramDrawable instanceof u1.g)) && (!"android.graphics.drawable.VectorDrawable".equals(paramDrawable.getClass().getName()))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public static void v(Drawable paramDrawable, V paramV, int[] paramArrayOfInt)
  {
    if ((B.a(paramDrawable)) && (paramDrawable.mutate() != paramDrawable))
    {
      Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
      return;
    }
    boolean bool = d;
    if ((!bool) && (!c))
    {
      paramDrawable.clearColorFilter();
    }
    else
    {
      ColorStateList localColorStateList;
      if (bool) {
        localColorStateList = a;
      } else {
        localColorStateList = null;
      }
      if (c) {
        paramV = b;
      } else {
        paramV = h;
      }
      paramDrawable.setColorFilter(g(localColorStateList, paramV, paramArrayOfInt));
    }
    if (Build.VERSION.SDK_INT <= 23) {
      paramDrawable.invalidateSelf();
    }
  }
  
  public final void a(String paramString, d paramd)
  {
    if (b == null) {
      b = new h();
    }
    b.put(paramString, paramd);
  }
  
  public final boolean b(Context paramContext, long paramLong, Drawable paramDrawable)
  {
    Drawable.ConstantState localConstantState;
    try
    {
      localConstantState = paramDrawable.getConstantState();
      if (localConstantState == null) {
        break label85;
      }
      f localf = (f)d.get(paramContext);
      paramDrawable = localf;
      if (localf == null)
      {
        paramDrawable = new t/f;
        paramDrawable.<init>();
        d.put(paramContext, paramDrawable);
      }
    }
    finally
    {
      break label89;
    }
    paramContext = new java/lang/ref/WeakReference;
    paramContext.<init>(localConstantState);
    paramDrawable.l(paramLong, paramContext);
    return true;
    label85:
    return false;
    label89:
    throw paramContext;
  }
  
  public final void c(Context paramContext, int paramInt, ColorStateList paramColorStateList)
  {
    if (a == null) {
      a = new WeakHashMap();
    }
    i locali1 = (i)a.get(paramContext);
    i locali2 = locali1;
    if (locali1 == null)
    {
      locali2 = new i();
      a.put(paramContext, locali2);
    }
    locali2.a(paramInt, paramColorStateList);
  }
  
  public final void d(Context paramContext)
  {
    if (f) {
      return;
    }
    f = true;
    paramContext = j(paramContext, i.a.a);
    if ((paramContext != null) && (q(paramContext))) {
      return;
    }
    f = false;
    throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
  }
  
  public final Drawable f(Context paramContext, int paramInt)
  {
    if (e == null) {
      e = new TypedValue();
    }
    TypedValue localTypedValue = e;
    paramContext.getResources().getValue(paramInt, localTypedValue, true);
    long l = e(localTypedValue);
    Object localObject = i(paramContext, l);
    if (localObject != null) {
      return (Drawable)localObject;
    }
    localObject = g;
    if (localObject == null) {
      localObject = null;
    } else {
      localObject = ((e)localObject).d(this, paramContext, paramInt);
    }
    if (localObject != null)
    {
      ((Drawable)localObject).setChangingConfigurations(changingConfigurations);
      b(paramContext, l, (Drawable)localObject);
    }
    return (Drawable)localObject;
  }
  
  public final Drawable i(Context paramContext, long paramLong)
  {
    label83:
    try
    {
      localf = (f)d.get(paramContext);
      if (localf == null) {
        return null;
      }
      Object localObject = (WeakReference)localf.f(paramLong);
      if (localObject != null)
      {
        localObject = (Drawable.ConstantState)((Reference)localObject).get();
        if (localObject != null)
        {
          paramContext = ((Drawable.ConstantState)localObject).newDrawable(paramContext.getResources());
          return paramContext;
        }
      }
    }
    finally
    {
      f localf;
      break label83;
      localf.n(paramLong);
      return null;
    }
  }
  
  public Drawable j(Context paramContext, int paramInt)
  {
    try
    {
      paramContext = k(paramContext, paramInt, false);
      return paramContext;
    }
    finally
    {
      paramContext = finally;
      throw paramContext;
    }
  }
  
  public Drawable k(Context paramContext, int paramInt, boolean paramBoolean)
  {
    try
    {
      d(paramContext);
      localObject1 = r(paramContext, paramInt);
      localObject2 = localObject1;
      if (localObject1 == null) {
        localObject2 = f(paramContext, paramInt);
      }
    }
    finally
    {
      break label90;
    }
    Object localObject1 = localObject2;
    if (localObject2 == null) {
      localObject1 = x.a.d(paramContext, paramInt);
    }
    Object localObject2 = localObject1;
    if (localObject1 != null) {
      localObject2 = u(paramContext, paramInt, paramBoolean, (Drawable)localObject1);
    }
    if (localObject2 != null) {
      B.b((Drawable)localObject2);
    }
    return (Drawable)localObject2;
    label90:
    throw paramContext;
  }
  
  public ColorStateList m(Context paramContext, int paramInt)
  {
    Object localObject2;
    try
    {
      Object localObject1 = n(paramContext, paramInt);
      localObject2 = localObject1;
      if (localObject1 == null)
      {
        localObject1 = g;
        if (localObject1 == null) {
          localObject1 = null;
        } else {
          localObject1 = ((e)localObject1).c(paramContext, paramInt);
        }
        localObject2 = localObject1;
        if (localObject1 != null)
        {
          c(paramContext, paramInt, (ColorStateList)localObject1);
          localObject2 = localObject1;
        }
      }
    }
    finally
    {
      break label68;
    }
    return (ColorStateList)localObject2;
    label68:
    throw paramContext;
  }
  
  public final ColorStateList n(Context paramContext, int paramInt)
  {
    WeakHashMap localWeakHashMap = a;
    Object localObject1 = null;
    Object localObject2 = localObject1;
    if (localWeakHashMap != null)
    {
      paramContext = (i)localWeakHashMap.get(paramContext);
      localObject2 = localObject1;
      if (paramContext != null) {
        localObject2 = (ColorStateList)paramContext.g(paramInt);
      }
    }
    return (ColorStateList)localObject2;
  }
  
  public PorterDuff.Mode o(int paramInt)
  {
    Object localObject = g;
    if (localObject == null) {
      localObject = null;
    } else {
      localObject = ((e)localObject).b(paramInt);
    }
    return (PorterDuff.Mode)localObject;
  }
  
  public final Drawable r(Context paramContext, int paramInt)
  {
    Object localObject1 = b;
    if ((localObject1 != null) && (!((h)localObject1).isEmpty()))
    {
      localObject1 = c;
      if (localObject1 != null)
      {
        localObject1 = (String)((i)localObject1).g(paramInt);
        if (("appcompat_skip_skip".equals(localObject1)) || ((localObject1 != null) && (b.get(localObject1) == null))) {
          return null;
        }
      }
      else
      {
        c = new i();
      }
      if (e == null) {
        e = new TypedValue();
      }
      TypedValue localTypedValue = e;
      localObject1 = paramContext.getResources();
      ((Resources)localObject1).getValue(paramInt, localTypedValue, true);
      long l = e(localTypedValue);
      Drawable localDrawable = i(paramContext, l);
      if (localDrawable != null) {
        return localDrawable;
      }
      Object localObject2 = string;
      Object localObject3 = localDrawable;
      if (localObject2 != null)
      {
        localObject3 = localDrawable;
        if (((CharSequence)localObject2).toString().endsWith(".xml"))
        {
          localObject3 = localDrawable;
          try
          {
            XmlResourceParser localXmlResourceParser = ((Resources)localObject1).getXml(paramInt);
            localObject3 = localDrawable;
            localObject2 = Xml.asAttributeSet(localXmlResourceParser);
            int k;
            do
            {
              localObject3 = localDrawable;
              k = localXmlResourceParser.next();
            } while ((k != 2) && (k != 1));
            if (k != 2) {
              break label340;
            }
            localObject3 = localDrawable;
            localObject1 = localXmlResourceParser.getName();
            localObject3 = localDrawable;
            c.a(paramInt, localObject1);
            localObject3 = localDrawable;
            d locald = (d)b.get(localObject1);
            localObject1 = localDrawable;
            if (locald != null)
            {
              localObject3 = localDrawable;
              localObject1 = locald.a(paramContext, localXmlResourceParser, (AttributeSet)localObject2, paramContext.getTheme());
            }
          }
          catch (Exception paramContext)
          {
            break label365;
          }
          localObject3 = localObject1;
          if (localObject1 != null)
          {
            localObject3 = localObject1;
            ((Drawable)localObject1).setChangingConfigurations(changingConfigurations);
            localObject3 = localObject1;
            b(paramContext, l, (Drawable)localObject1);
            localObject3 = localObject1;
            break label375;
            label340:
            localObject3 = localDrawable;
            paramContext = new org/xmlpull/v1/XmlPullParserException;
            localObject3 = localDrawable;
            paramContext.<init>("No start tag found");
            localObject3 = localDrawable;
            throw paramContext;
            label365:
            Log.e("ResourceManagerInternal", "Exception while inflating drawable", paramContext);
          }
        }
      }
      label375:
      if (localObject3 == null) {
        c.a(paramInt, "appcompat_skip_skip");
      }
      return (Drawable)localObject3;
    }
    return null;
  }
  
  public Drawable s(Context paramContext, c0 paramc0, int paramInt)
  {
    Drawable localDrawable2;
    try
    {
      Drawable localDrawable1 = r(paramContext, paramInt);
      localDrawable2 = localDrawable1;
      if (localDrawable1 == null) {
        localDrawable2 = paramc0.c(paramInt);
      }
    }
    finally
    {
      break label56;
    }
    if (localDrawable2 != null)
    {
      paramContext = u(paramContext, paramInt, false, localDrawable2);
      return paramContext;
    }
    return null;
    label56:
    throw paramContext;
  }
  
  public void t(e parame)
  {
    try
    {
      g = parame;
      return;
    }
    finally
    {
      parame = finally;
      throw parame;
    }
  }
  
  public final Drawable u(Context paramContext, int paramInt, boolean paramBoolean, Drawable paramDrawable)
  {
    Object localObject = m(paramContext, paramInt);
    if (localObject != null)
    {
      paramContext = paramDrawable;
      if (B.a(paramDrawable)) {
        paramContext = paramDrawable.mutate();
      }
      paramContext = B.a.o(paramContext);
      B.a.m(paramContext, (ColorStateList)localObject);
      paramDrawable = o(paramInt);
      localObject = paramContext;
      if (paramDrawable != null)
      {
        B.a.n(paramContext, paramDrawable);
        localObject = paramContext;
      }
    }
    else
    {
      localObject = g;
      if ((localObject != null) && (((e)localObject).e(paramContext, paramInt, paramDrawable)))
      {
        localObject = paramDrawable;
      }
      else
      {
        localObject = paramDrawable;
        if (!w(paramContext, paramInt, paramDrawable))
        {
          localObject = paramDrawable;
          if (paramBoolean) {
            localObject = null;
          }
        }
      }
    }
    return (Drawable)localObject;
  }
  
  public boolean w(Context paramContext, int paramInt, Drawable paramDrawable)
  {
    e locale = g;
    boolean bool;
    if ((locale != null) && (locale.a(paramContext, paramInt, paramDrawable))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static class a
    implements M.d
  {
    public Drawable a(Context paramContext, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme)
    {
      try
      {
        paramContext = h.a.l(paramContext, paramContext.getResources(), paramXmlPullParser, paramAttributeSet, paramTheme);
        return paramContext;
      }
      catch (Exception paramContext)
      {
        Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", paramContext);
      }
      return null;
    }
  }
  
  public static class b
    implements M.d
  {
    public Drawable a(Context paramContext, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme)
    {
      try
      {
        paramContext = b.a(paramContext, paramContext.getResources(), paramXmlPullParser, paramAttributeSet, paramTheme);
        return paramContext;
      }
      catch (Exception paramContext)
      {
        Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", paramContext);
      }
      return null;
    }
  }
  
  public static class c
    extends t.g
  {
    public c(int paramInt)
    {
      super();
    }
    
    public static int j(int paramInt, PorterDuff.Mode paramMode)
    {
      return (paramInt + 31) * 31 + paramMode.hashCode();
    }
    
    public PorterDuffColorFilter k(int paramInt, PorterDuff.Mode paramMode)
    {
      return (PorterDuffColorFilter)c(Integer.valueOf(j(paramInt, paramMode)));
    }
    
    public PorterDuffColorFilter l(int paramInt, PorterDuff.Mode paramMode, PorterDuffColorFilter paramPorterDuffColorFilter)
    {
      return (PorterDuffColorFilter)d(Integer.valueOf(j(paramInt, paramMode)), paramPorterDuffColorFilter);
    }
  }
  
  public static abstract interface d
  {
    public abstract Drawable a(Context paramContext, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme);
  }
  
  public static abstract interface e
  {
    public abstract boolean a(Context paramContext, int paramInt, Drawable paramDrawable);
    
    public abstract PorterDuff.Mode b(int paramInt);
    
    public abstract ColorStateList c(Context paramContext, int paramInt);
    
    public abstract Drawable d(M paramM, Context paramContext, int paramInt);
    
    public abstract boolean e(Context paramContext, int paramInt, Drawable paramDrawable);
  }
  
  public static class f
    implements M.d
  {
    public Drawable a(Context paramContext, XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme)
    {
      try
      {
        paramContext = u1.g.c(paramContext.getResources(), paramXmlPullParser, paramAttributeSet, paramTheme);
        return paramContext;
      }
      catch (Exception paramContext)
      {
        Log.e("VdcInflateDelegate", "Exception while inflating <vector>", paramContext);
      }
      return null;
    }
  }
}

/* Location:
 * Qualified Name:     l.M
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */