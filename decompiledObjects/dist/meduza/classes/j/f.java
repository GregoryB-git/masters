package j;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff.Mode;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.Log;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.h;
import b.a0;
import e0.n;
import g;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import k.c;
import l.i0;
import l.z0;
import org.xmlpull.v1.XmlPullParser;

public final class f
  extends MenuInflater
{
  public static final Class<?>[] e;
  public static final Class<?>[] f;
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
  
  public f(Context paramContext)
  {
    super(paramContext);
    c = paramContext;
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = paramContext;
    a = arrayOfObject;
    b = arrayOfObject;
  }
  
  public static Object a(Context paramContext)
  {
    if ((paramContext instanceof Activity)) {
      return paramContext;
    }
    Object localObject = paramContext;
    if ((paramContext instanceof ContextWrapper)) {
      localObject = a(((ContextWrapper)paramContext).getBaseContext());
    }
    return localObject;
  }
  
  public final void b(XmlResourceParser paramXmlResourceParser, AttributeSet paramAttributeSet, Menu paramMenu)
  {
    b localb = new b(paramMenu);
    int i = paramXmlResourceParser.getEventType();
    label512:
    label1155:
    label1182:
    for (;;)
    {
      int j;
      if (i == 2)
      {
        paramMenu = paramXmlResourceParser.getName();
        if (paramMenu.equals("menu")) {
          j = paramXmlResourceParser.next();
        } else {
          throw new RuntimeException(g.d("Expecting menu, got ", paramMenu));
        }
      }
      else
      {
        i = paramXmlResourceParser.next();
        if (i != 1) {
          break label1182;
        }
        j = i;
      }
      paramMenu = null;
      i = 0;
      int m = i;
      int n = j;
      while (i == 0) {
        if (n != 1)
        {
          Object localObject;
          if (n != 2)
          {
            if (n != 3)
            {
              j = i;
            }
            else
            {
              localObject = paramXmlResourceParser.getName();
              if ((m != 0) && (((String)localObject).equals(paramMenu)))
              {
                paramMenu = null;
                j = 0;
                break label1155;
              }
              if (((String)localObject).equals("group"))
              {
                b = 0;
                c = 0;
                d = 0;
                e = 0;
                f = true;
                g = true;
                j = i;
              }
              else if (((String)localObject).equals("item"))
              {
                j = i;
                if (!h)
                {
                  localObject = z;
                  if ((localObject != null) && (((e0.b)localObject).a()))
                  {
                    h = true;
                    localb.b(a.addSubMenu(b, i, j, k).getItem());
                    j = i;
                  }
                  else
                  {
                    h = true;
                    localb.b(a.add(b, i, j, k));
                    j = i;
                  }
                }
              }
              else
              {
                j = i;
                if (((String)localObject).equals("menu")) {
                  j = 1;
                }
              }
            }
          }
          else if (m != 0)
          {
            j = i;
          }
          else
          {
            localObject = paramXmlResourceParser.getName();
            if (!((String)localObject).equals("group")) {
              break label512;
            }
            localObject = E.c.obtainStyledAttributes(paramAttributeSet, a0.C);
            b = ((TypedArray)localObject).getResourceId(1, 0);
            c = ((TypedArray)localObject).getInt(3, 0);
            d = ((TypedArray)localObject).getInt(4, 0);
            e = ((TypedArray)localObject).getInt(5, 0);
            f = ((TypedArray)localObject).getBoolean(2, true);
            g = ((TypedArray)localObject).getBoolean(0, true);
            ((TypedArray)localObject).recycle();
          }
          int k;
          for (j = i;; k = i)
          {
            i = j;
            j = m;
            break label1155;
            if (!((String)localObject).equals("item")) {
              break;
            }
            localObject = E.c;
            z0 localz0 = new z0((Context)localObject, ((Context)localObject).obtainStyledAttributes(paramAttributeSet, a0.D));
            i = localz0.i(2, 0);
            j = (localz0.h(5, c) & 0xFFFF0000 | localz0.h(6, d) & 0xFFFF);
            k = localz0.k(7);
            l = localz0.k(8);
            m = localz0.i(0, 0);
            localObject = localz0.j(9);
            if (localObject == null) {
              j = 0;
            } else {
              j = ((String)localObject).charAt(0);
            }
            n = ((char)j);
            o = localz0.h(16, 4096);
            localObject = localz0.j(10);
            if (localObject == null) {
              j = 0;
            } else {
              j = ((String)localObject).charAt(0);
            }
            p = ((char)j);
            q = localz0.h(20, 4096);
            if (localz0.l(11)) {
              boolean bool = localz0.a(11, false);
            } else {
              k = e;
            }
            r = k;
            s = localz0.a(3, false);
            t = localz0.a(4, f);
            u = localz0.a(1, g);
            v = localz0.h(21, -1);
            y = localz0.j(12);
            w = localz0.i(13, 0);
            x = localz0.j(15);
            localObject = localz0.j(14);
            if (localObject != null) {
              k = 1;
            } else {
              k = 0;
            }
            if ((k != 0) && (w == 0) && (x == null))
            {
              localObject = (e0.b)localb.a((String)localObject, f, E.b);
            }
            else
            {
              if (k != 0) {
                Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
              }
              localObject = null;
            }
            z = ((e0.b)localObject);
            A = localz0.k(17);
            B = localz0.k(22);
            if (localz0.l(19)) {
              D = i0.b(localz0.h(19, -1), D);
            } else {
              D = null;
            }
            localObject = null;
            if (localz0.l(18)) {
              localObject = localz0.b(18);
            }
            C = ((ColorStateList)localObject);
            localz0.n();
            h = false;
          }
          if (((String)localObject).equals("menu"))
          {
            h = true;
            localObject = a.addSubMenu(b, i, j, k);
            localb.b(((SubMenu)localObject).getItem());
            b(paramXmlResourceParser, paramAttributeSet, (Menu)localObject);
            k = m;
          }
          else
          {
            paramMenu = (Menu)localObject;
            k = 1;
          }
          n = paramXmlResourceParser.next();
          m = k;
        }
        else
        {
          throw new RuntimeException("Unexpected end of document");
        }
      }
      return;
    }
  }
  
  /* Error */
  public final void inflate(int paramInt, Menu paramMenu)
  {
    // Byte code:
    //   0: aload_2
    //   1: instanceof 300
    //   4: ifne +10 -> 14
    //   7: aload_0
    //   8: iload_1
    //   9: aload_2
    //   10: invokespecial 302	android/view/MenuInflater:inflate	(ILandroid/view/Menu;)V
    //   13: return
    //   14: aconst_null
    //   15: astore_3
    //   16: aconst_null
    //   17: astore 4
    //   19: aconst_null
    //   20: astore 5
    //   22: aload_0
    //   23: getfield 36	j/f:c	Landroid/content/Context;
    //   26: invokevirtual 306	android/content/Context:getResources	()Landroid/content/res/Resources;
    //   29: iload_1
    //   30: invokevirtual 312	android/content/res/Resources:getLayout	(I)Landroid/content/res/XmlResourceParser;
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
    //   51: invokestatic 318	android/util/Xml:asAttributeSet	(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;
    //   54: aload_2
    //   55: invokevirtual 290	j/f:b	(Landroid/content/res/XmlResourceParser;Landroid/util/AttributeSet;Landroid/view/Menu;)V
    //   58: aload 6
    //   60: invokeinterface 323 1 0
    //   65: return
    //   66: astore_2
    //   67: goto +56 -> 123
    //   70: astore 4
    //   72: aload_3
    //   73: astore 5
    //   75: new 325	android/view/InflateException
    //   78: astore_2
    //   79: aload_3
    //   80: astore 5
    //   82: aload_2
    //   83: ldc_w 327
    //   86: aload 4
    //   88: invokespecial 330	android/view/InflateException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   91: aload_3
    //   92: astore 5
    //   94: aload_2
    //   95: athrow
    //   96: astore_3
    //   97: aload 4
    //   99: astore 5
    //   101: new 325	android/view/InflateException
    //   104: astore_2
    //   105: aload 4
    //   107: astore 5
    //   109: aload_2
    //   110: ldc_w 327
    //   113: aload_3
    //   114: invokespecial 330	android/view/InflateException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   117: aload 4
    //   119: astore 5
    //   121: aload_2
    //   122: athrow
    //   123: aload 5
    //   125: ifnull +10 -> 135
    //   128: aload 5
    //   130: invokeinterface 323 1 0
    //   135: aload_2
    //   136: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	137	0	this	f
    //   0	137	1	paramInt	int
    //   0	137	2	paramMenu	Menu
    //   15	77	3	localObject1	Object
    //   96	18	3	localXmlPullParserException	org.xmlpull.v1.XmlPullParserException
    //   17	28	4	localObject2	Object
    //   70	48	4	localIOException	java.io.IOException
    //   20	109	5	localObject3	Object
    //   33	26	6	localXmlResourceParser	XmlResourceParser
    // Exception table:
    //   from	to	target	type
    //   22	35	66	finally
    //   46	58	66	finally
    //   75	79	66	finally
    //   82	91	66	finally
    //   94	96	66	finally
    //   101	105	66	finally
    //   109	117	66	finally
    //   121	123	66	finally
    //   22	35	70	java/io/IOException
    //   46	58	70	java/io/IOException
    //   22	35	96	org/xmlpull/v1/XmlPullParserException
    //   46	58	96	org/xmlpull/v1/XmlPullParserException
  }
  
  public static final class a
    implements MenuItem.OnMenuItemClickListener
  {
    public static final Class<?>[] c = { MenuItem.class };
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
        paramString = f.m("Couldn't resolve menu item onClick handler ", paramString, " in class ");
        paramString.append(localClass.getName());
        paramString = new InflateException(paramString.toString());
        paramString.initCause((Throwable)paramObject);
        throw paramString;
      }
    }
    
    public final boolean onMenuItemClick(MenuItem paramMenuItem)
    {
      try
      {
        if (b.getReturnType() == Boolean.TYPE) {
          return ((Boolean)b.invoke(a, new Object[] { paramMenuItem })).booleanValue();
        }
        b.invoke(a, new Object[] { paramMenuItem });
        return true;
      }
      catch (Exception paramMenuItem)
      {
        throw new RuntimeException(paramMenuItem);
      }
    }
  }
  
  public final class b
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
    public e0.b z;
    
    public b(Menu paramMenu)
    {
      a = paramMenu;
      b = 0;
      c = 0;
      d = 0;
      e = 0;
      f = true;
      g = true;
    }
    
    public final <T> T a(String paramString, Class<?>[] paramArrayOfClass, Object[] paramArrayOfObject)
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
    
    public final void b(MenuItem paramMenuItem)
    {
      Object localObject1 = paramMenuItem.setChecked(s).setVisible(t).setEnabled(u);
      int i1 = r;
      int i2 = 0;
      if (i1 >= 1) {
        bool = true;
      } else {
        bool = false;
      }
      ((MenuItem)localObject1).setCheckable(bool).setTitleCondensed(l).setIcon(m);
      i1 = v;
      if (i1 >= 0) {
        paramMenuItem.setShowAsAction(i1);
      }
      if (y != null) {
        if (!c.isRestricted())
        {
          localObject1 = f.this;
          if (d == null) {
            d = f.a(c);
          }
          paramMenuItem.setOnMenuItemClickListener(new f.a(d, y));
        }
        else
        {
          throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
        }
      }
      if (r >= 2) {
        if ((paramMenuItem instanceof h))
        {
          localObject1 = (h)paramMenuItem;
          x = (x & 0xFFFFFFFB | 0x4);
        }
        else if ((paramMenuItem instanceof c))
        {
          localObject1 = (c)paramMenuItem;
          try
          {
            if (e == null) {
              e = d.getClass().getDeclaredMethod("setExclusiveCheckable", new Class[] { Boolean.TYPE });
            }
            e.invoke(d, new Object[] { Boolean.TRUE });
          }
          catch (Exception localException)
          {
            Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", localException);
          }
        }
      }
      Object localObject2 = x;
      if (localObject2 != null)
      {
        paramMenuItem.setActionView((View)a((String)localObject2, f.e, a));
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
      localObject2 = z;
      if (localObject2 != null) {
        if ((paramMenuItem instanceof z.b)) {
          ((z.b)paramMenuItem).a((e0.b)localObject2);
        } else {
          Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
        }
      }
      localObject2 = A;
      boolean bool = paramMenuItem instanceof z.b;
      if (bool) {
        ((z.b)paramMenuItem).setContentDescription((CharSequence)localObject2);
      } else if (Build.VERSION.SDK_INT >= 26) {
        n.h(paramMenuItem, (CharSequence)localObject2);
      }
      localObject2 = B;
      if (bool) {
        ((z.b)paramMenuItem).setTooltipText((CharSequence)localObject2);
      } else if (Build.VERSION.SDK_INT >= 26) {
        n.m(paramMenuItem, (CharSequence)localObject2);
      }
      char c1 = n;
      i2 = o;
      if (bool) {
        ((z.b)paramMenuItem).setAlphabeticShortcut(c1, i2);
      } else if (Build.VERSION.SDK_INT >= 26) {
        n.g(paramMenuItem, c1, i2);
      }
      c1 = p;
      i2 = q;
      if (bool) {
        ((z.b)paramMenuItem).setNumericShortcut(c1, i2);
      } else if (Build.VERSION.SDK_INT >= 26) {
        n.k(paramMenuItem, c1, i2);
      }
      localObject2 = D;
      if (localObject2 != null) {
        if (bool) {
          ((z.b)paramMenuItem).setIconTintMode((PorterDuff.Mode)localObject2);
        } else if (Build.VERSION.SDK_INT >= 26) {
          n.j(paramMenuItem, (PorterDuff.Mode)localObject2);
        }
      }
      localObject2 = C;
      if (localObject2 != null) {
        if (bool) {
          ((z.b)paramMenuItem).setIconTintList((ColorStateList)localObject2);
        } else if (Build.VERSION.SDK_INT >= 26) {
          n.i(paramMenuItem, (ColorStateList)localObject2);
        }
      }
    }
  }
}

/* Location:
 * Qualified Name:     j.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */