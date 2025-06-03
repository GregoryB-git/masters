package i2;

import android.app.Activity;
import android.content.Context;
import androidx.window.extensions.WindowExtensions;
import androidx.window.extensions.WindowExtensionsProvider;
import androidx.window.extensions.layout.WindowLayoutComponent;
import e2.a;
import e2.c;
import p2.m0;

public final class h
{
  public final ClassLoader a;
  public final f2.b b;
  public final c c;
  
  public h(ClassLoader paramClassLoader, f2.b paramb)
  {
    a = paramClassLoader;
    b = paramb;
    c = new c(paramClassLoader);
  }
  
  public final WindowLayoutComponent a()
  {
    Object localObject1 = c;
    localObject1.getClass();
    a locala = new a((c)localObject1);
    boolean bool1 = true;
    boolean bool2 = false;
    int i;
    try
    {
      locala.invoke();
      i = 1;
    }
    catch (ClassNotFoundException|NoClassDefFoundError localClassNotFoundException)
    {
      i = 0;
    }
    if ((i != 0) && (m0.g0("WindowExtensionsProvider#getWindowExtensions is not valid", new e2.b((c)localObject1)))) {
      i = 1;
    } else {
      i = 0;
    }
    if ((i != 0) && (m0.g0("WindowExtensions#getWindowLayoutComponent is not valid", new g(this))) && (m0.g0("FoldingFeature class is not valid", new d(this)))) {
      i = 1;
    } else {
      i = 0;
    }
    if (i != 0)
    {
      f2.d.a.getClass();
      i = f2.d.a();
      if (i == 1)
      {
        bool2 = b();
      }
      else
      {
        if ((2 <= i) && (i <= Integer.MAX_VALUE)) {
          i = 1;
        } else {
          i = 0;
        }
        if (i != 0)
        {
          if (b())
          {
            localObject1 = f.l("WindowLayoutComponent#addWindowLayoutInfoListener(");
            ((StringBuilder)localObject1).append(Context.class.getName());
            ((StringBuilder)localObject1).append(", androidx.window.extensions.core.util.function.Consumer) is not valid");
            if (m0.g0(((StringBuilder)localObject1).toString(), new f(this)))
            {
              bool2 = bool1;
              break label234;
            }
          }
          bool2 = false;
        }
      }
    }
    label234:
    Object localObject3 = null;
    localObject1 = localObject3;
    if (bool2) {}
    try
    {
      localObject1 = WindowExtensionsProvider.getWindowExtensions().getWindowLayoutComponent();
      return (WindowLayoutComponent)localObject1;
    }
    catch (UnsupportedOperationException localUnsupportedOperationException)
    {
      for (;;)
      {
        Object localObject2 = localObject3;
      }
    }
  }
  
  public final boolean b()
  {
    StringBuilder localStringBuilder = f.l("WindowLayoutComponent#addWindowLayoutInfoListener(");
    localStringBuilder.append(Activity.class.getName());
    localStringBuilder.append(", java.util.function.Consumer) is not valid");
    return m0.g0(localStringBuilder.toString(), new e(this));
  }
}

/* Location:
 * Qualified Name:     i2.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */