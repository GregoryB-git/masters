package j;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff.Mode;
import android.support.v4.media.a;
import android.util.AttributeSet;
import android.util.Log;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.e;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import l.B;
import l.X;
import org.xmlpull.v1.XmlPullParser;

public class c
  extends MenuInflater
{
  public static final Class[] e;
  public static final Class[] f;
  public final Object[] a;
  public final Object[] b;
  public Context c;
  public Object d;
  
  static
  {
    Class[] arrayOfClass = new Class[1];
    arrayOfClass[0] = Context.class;
    e = arrayOfClass;
    f = arrayOfClass;
  }
  
  public c(Context paramContext)
  {
    super(paramContext);
    c = paramContext;
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramContext;
    a = arrayOfObject;
    b = arrayOfObject;
  }
  
  public final Object a(Object paramObject)
  {
    if ((paramObject instanceof Activity)) {
      return paramObject;
    }
    Object localObject = paramObject;
    if ((paramObject instanceof ContextWrapper)) {
      localObject = a(((ContextWrapper)paramObject).getBaseContext());
    }
    return localObject;
  }
  
  public Object b()
  {
    if (d == null) {
      d = a(c);
    }
    return d;
  }
  
  public final void c(XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Menu paramMenu)
  {
    b localb = new b(paramMenu);
    int i = paramXmlPullParser.getEventType();
    do
    {
      if (i == 2)
      {
        paramMenu = paramXmlPullParser.getName();
        if (paramMenu.equals("menu"))
        {
          i = paramXmlPullParser.next();
          break;
        }
        paramXmlPullParser = new StringBuilder();
        paramXmlPullParser.append("Expecting menu, got ");
        paramXmlPullParser.append(paramMenu);
        throw new RuntimeException(paramXmlPullParser.toString());
      }
      j = paramXmlPullParser.next();
      i = j;
    } while (j != 1);
    i = j;
    int k = 0;
    int j = k;
    Object localObject = null;
    while (k == 0) {
      if (i != 1)
      {
        int m;
        if (i != 2)
        {
          if (i != 3)
          {
            m = k;
            i = j;
            paramMenu = (Menu)localObject;
          }
          else
          {
            String str = paramXmlPullParser.getName();
            if ((j != 0) && (str.equals(localObject)))
            {
              i = 0;
              paramMenu = null;
              m = k;
            }
            else if (str.equals("group"))
            {
              localb.h();
              m = k;
              i = j;
              paramMenu = (Menu)localObject;
            }
            else if (str.equals("item"))
            {
              m = k;
              i = j;
              paramMenu = (Menu)localObject;
              if (!localb.d())
              {
                localb.a();
                m = k;
                i = j;
                paramMenu = (Menu)localObject;
              }
            }
            else
            {
              m = k;
              i = j;
              paramMenu = (Menu)localObject;
              if (str.equals("menu"))
              {
                m = 1;
                i = j;
                paramMenu = (Menu)localObject;
              }
            }
          }
        }
        else if (j != 0)
        {
          m = k;
          i = j;
          paramMenu = (Menu)localObject;
        }
        else
        {
          paramMenu = paramXmlPullParser.getName();
          if (paramMenu.equals("group"))
          {
            localb.f(paramAttributeSet);
            m = k;
            i = j;
            paramMenu = (Menu)localObject;
          }
          else if (paramMenu.equals("item"))
          {
            localb.g(paramAttributeSet);
            m = k;
            i = j;
            paramMenu = (Menu)localObject;
          }
          else if (paramMenu.equals("menu"))
          {
            c(paramXmlPullParser, paramAttributeSet, localb.b());
            m = k;
            i = j;
            paramMenu = (Menu)localObject;
          }
          else
          {
            i = 1;
            m = k;
          }
        }
        int n = paramXmlPullParser.next();
        k = m;
        j = i;
        localObject = paramMenu;
        i = n;
      }
      else
      {
        throw new RuntimeException("Unexpected end of document");
      }
    }
  }
  
  /* Error */
  public void inflate(int paramInt, Menu paramMenu)
  {
    // Byte code:
    //   0: aload_2
    //   1: instanceof 131
    //   4: ifne +10 -> 14
    //   7: aload_0
    //   8: iload_1
    //   9: aload_2
    //   10: invokespecial 133	android/view/MenuInflater:inflate	(ILandroid/view/Menu;)V
    //   13: return
    //   14: aconst_null
    //   15: astore_3
    //   16: aconst_null
    //   17: astore 4
    //   19: aconst_null
    //   20: astore 5
    //   22: aload_0
    //   23: getfield 35	j/c:c	Landroid/content/Context;
    //   26: invokevirtual 137	android/content/Context:getResources	()Landroid/content/res/Resources;
    //   29: iload_1
    //   30: invokevirtual 143	android/content/res/Resources:getLayout	(I)Landroid/content/res/XmlResourceParser;
    //   33: astore 6
    //   35: aload 6
    //   37: astore 5
    //   39: aload 6
    //   41: astore_3
    //   42: aload 6
    //   44: astore 4
    //   46: aload_0
    //   47: aload 6
    //   49: aload 6
    //   51: invokestatic 149	android/util/Xml:asAttributeSet	(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;
    //   54: aload_2
    //   55: invokevirtual 121	j/c:c	(Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/view/Menu;)V
    //   58: aload 6
    //   60: ifnull +10 -> 70
    //   63: aload 6
    //   65: invokeinterface 154 1 0
    //   70: return
    //   71: astore_2
    //   72: goto +61 -> 133
    //   75: astore_2
    //   76: goto +7 -> 83
    //   79: astore_3
    //   80: goto +28 -> 108
    //   83: aload_3
    //   84: astore 5
    //   86: new 156	android/view/InflateException
    //   89: astore 4
    //   91: aload_3
    //   92: astore 5
    //   94: aload 4
    //   96: ldc -98
    //   98: aload_2
    //   99: invokespecial 161	android/view/InflateException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   102: aload_3
    //   103: astore 5
    //   105: aload 4
    //   107: athrow
    //   108: aload 4
    //   110: astore 5
    //   112: new 156	android/view/InflateException
    //   115: astore_2
    //   116: aload 4
    //   118: astore 5
    //   120: aload_2
    //   121: ldc -98
    //   123: aload_3
    //   124: invokespecial 161	android/view/InflateException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   127: aload 4
    //   129: astore 5
    //   131: aload_2
    //   132: athrow
    //   133: aload 5
    //   135: ifnull +10 -> 145
    //   138: aload 5
    //   140: invokeinterface 154 1 0
    //   145: aload_2
    //   146: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	147	0	this	c
    //   0	147	1	paramInt	int
    //   0	147	2	paramMenu	Menu
    //   15	27	3	localObject1	Object
    //   79	45	3	localXmlPullParserException	org.xmlpull.v1.XmlPullParserException
    //   17	111	4	localObject2	Object
    //   20	119	5	localObject3	Object
    //   33	31	6	localXmlResourceParser	android.content.res.XmlResourceParser
    // Exception table:
    //   from	to	target	type
    //   22	35	71	finally
    //   46	58	71	finally
    //   86	91	71	finally
    //   94	102	71	finally
    //   105	108	71	finally
    //   112	116	71	finally
    //   120	127	71	finally
    //   131	133	71	finally
    //   22	35	75	java/io/IOException
    //   46	58	75	java/io/IOException
    //   22	35	79	org/xmlpull/v1/XmlPullParserException
    //   46	58	79	org/xmlpull/v1/XmlPullParserException
  }
  
  public static class a
    implements MenuItem.OnMenuItemClickListener
  {
    public static final Class[] c = { MenuItem.class };
    public Object a;
    public Method b;
    
    public a(Object paramObject, String paramString)
    {
      a = paramObject;
      Class localClass = paramObject.getClass();
      try
      {
        b = localClass.getMethod(paramString, c);
        return;
      }
      catch (Exception paramObject)
      {
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append("Couldn't resolve menu item onClick handler ");
        localStringBuilder.append(paramString);
        localStringBuilder.append(" in class ");
        localStringBuilder.append(localClass.getName());
        paramString = new InflateException(localStringBuilder.toString());
        paramString.initCause((Throwable)paramObject);
        throw paramString;
      }
    }
    
    public boolean onMenuItemClick(MenuItem paramMenuItem)
    {
      try
      {
        if (b.getReturnType() == Boolean.TYPE) {
          return ((Boolean)b.invoke(a, new Object[] { paramMenuItem })).booleanValue();
        }
      }
      catch (Exception paramMenuItem)
      {
        break label65;
        b.invoke(a, new Object[] { paramMenuItem });
        return true;
        label65:
        throw new RuntimeException(paramMenuItem);
      }
    }
  }
  
  public class b
  {
    public CharSequence A;
    public CharSequence B;
    public ColorStateList C = null;
    public PorterDuff.Mode D = null;
    public Menu a;
    public int b;
    public int c;
    public int d;
    public int e;
    public boolean f;
    public boolean g;
    public boolean h;
    public int i;
    public int j;
    public CharSequence k;
    public CharSequence l;
    public int m;
    public char n;
    public int o;
    public char p;
    public int q;
    public int r;
    public boolean s;
    public boolean t;
    public boolean u;
    public int v;
    public int w;
    public String x;
    public String y;
    public String z;
    
    public b(Menu paramMenu)
    {
      a = paramMenu;
      h();
    }
    
    public void a()
    {
      h = true;
      i(a.add(b, i, j, k));
    }
    
    public SubMenu b()
    {
      h = true;
      SubMenu localSubMenu = a.addSubMenu(b, i, j, k);
      i(localSubMenu.getItem());
      return localSubMenu;
    }
    
    public final char c(String paramString)
    {
      if (paramString == null) {
        return '\000';
      }
      return paramString.charAt(0);
    }
    
    public boolean d()
    {
      return h;
    }
    
    public final Object e(String paramString, Class[] paramArrayOfClass, Object[] paramArrayOfObject)
    {
      try
      {
        paramArrayOfClass = Class.forName(paramString, false, c.getClassLoader()).getConstructor(paramArrayOfClass);
        paramArrayOfClass.setAccessible(true);
        paramArrayOfClass = paramArrayOfClass.newInstance(paramArrayOfObject);
        return paramArrayOfClass;
      }
      catch (Exception paramArrayOfClass)
      {
        paramArrayOfObject = new StringBuilder();
        paramArrayOfObject.append("Cannot instantiate class: ");
        paramArrayOfObject.append(paramString);
        Log.w("SupportMenuInflater", paramArrayOfObject.toString(), paramArrayOfClass);
      }
      return null;
    }
    
    public void f(AttributeSet paramAttributeSet)
    {
      paramAttributeSet = c.obtainStyledAttributes(paramAttributeSet, e.i.M0);
      b = paramAttributeSet.getResourceId(e.i.O0, 0);
      c = paramAttributeSet.getInt(e.i.Q0, 0);
      d = paramAttributeSet.getInt(e.i.R0, 0);
      e = paramAttributeSet.getInt(e.i.S0, 0);
      f = paramAttributeSet.getBoolean(e.i.P0, true);
      g = paramAttributeSet.getBoolean(e.i.N0, true);
      paramAttributeSet.recycle();
    }
    
    public void g(AttributeSet paramAttributeSet)
    {
      paramAttributeSet = X.r(c, paramAttributeSet, e.i.T0);
      i = paramAttributeSet.l(e.i.W0, 0);
      j = (paramAttributeSet.i(e.i.Z0, c) & 0xFFFF0000 | paramAttributeSet.i(e.i.a1, d) & 0xFFFF);
      k = paramAttributeSet.n(e.i.b1);
      l = paramAttributeSet.n(e.i.c1);
      m = paramAttributeSet.l(e.i.U0, 0);
      n = c(paramAttributeSet.m(e.i.d1));
      o = paramAttributeSet.i(e.i.k1, 4096);
      p = c(paramAttributeSet.m(e.i.e1));
      q = paramAttributeSet.i(e.i.o1, 4096);
      if (paramAttributeSet.p(e.i.f1)) {}
      int i2;
      for (int i1 = paramAttributeSet.a(e.i.f1, false);; i2 = e)
      {
        r = i1;
        break;
      }
      s = paramAttributeSet.a(e.i.X0, false);
      t = paramAttributeSet.a(e.i.Y0, f);
      u = paramAttributeSet.a(e.i.V0, g);
      v = paramAttributeSet.i(e.i.p1, -1);
      z = paramAttributeSet.m(e.i.g1);
      w = paramAttributeSet.l(e.i.h1, 0);
      x = paramAttributeSet.m(e.i.j1);
      String str = paramAttributeSet.m(e.i.i1);
      y = str;
      if (str != null) {
        i2 = 1;
      } else {
        i2 = 0;
      }
      if ((i2 != 0) && (w == 0) && (x == null)) {
        a.a(e(str, c.f, b));
      } else if (i2 != 0) {
        Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
      }
      A = paramAttributeSet.n(e.i.l1);
      B = paramAttributeSet.n(e.i.q1);
      if (paramAttributeSet.p(e.i.n1)) {
        D = B.c(paramAttributeSet.i(e.i.n1, -1), D);
      } else {
        D = null;
      }
      if (paramAttributeSet.p(e.i.m1)) {
        C = paramAttributeSet.c(e.i.m1);
      } else {
        C = null;
      }
      paramAttributeSet.t();
      h = false;
    }
    
    public void h()
    {
      b = 0;
      c = 0;
      d = 0;
      e = 0;
      f = true;
      g = true;
    }
    
    public final void i(MenuItem paramMenuItem)
    {
      Object localObject = paramMenuItem.setChecked(s).setVisible(t).setEnabled(u);
      int i1 = r;
      int i2 = 0;
      boolean bool;
      if (i1 >= 1) {
        bool = true;
      } else {
        bool = false;
      }
      ((MenuItem)localObject).setCheckable(bool).setTitleCondensed(l).setIcon(m);
      i1 = v;
      if (i1 >= 0) {
        paramMenuItem.setShowAsAction(i1);
      }
      if (z != null) {
        if (!c.isRestricted()) {
          paramMenuItem.setOnMenuItemClickListener(new c.a(b(), z));
        } else {
          throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
        }
      }
      if ((r >= 2) && ((paramMenuItem instanceof e))) {
        ((e)paramMenuItem).s(true);
      }
      localObject = x;
      if (localObject != null)
      {
        paramMenuItem.setActionView((View)e((String)localObject, c.e, a));
        i2 = 1;
      }
      i1 = w;
      if (i1 > 0) {
        if (i2 == 0) {
          paramMenuItem.setActionView(i1);
        } else {
          Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
        }
      }
      I.i.b(paramMenuItem, A);
      I.i.f(paramMenuItem, B);
      I.i.a(paramMenuItem, n, o);
      I.i.e(paramMenuItem, p, q);
      localObject = D;
      if (localObject != null) {
        I.i.d(paramMenuItem, (PorterDuff.Mode)localObject);
      }
      localObject = C;
      if (localObject != null) {
        I.i.c(paramMenuItem, (ColorStateList)localObject);
      }
    }
  }
}

/* Location:
 * Qualified Name:     j.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */