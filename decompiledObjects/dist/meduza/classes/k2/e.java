package k2;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Point;
import android.graphics.Rect;
import android.inputmethodservice.InputMethodService;
import android.os.Build.VERSION;
import android.view.Display;
import android.view.WindowManager;
import androidx.window.extensions.layout.DisplayFeature;
import androidx.window.extensions.layout.FoldingFeature;
import androidx.window.extensions.layout.WindowLayoutInfo;
import e0.s0.b;
import e0.s0.c;
import e0.s0.d;
import e0.s0.e;
import ec.i;
import i2.b.b;
import i2.c;
import i2.c.a;
import i2.k;
import i2.l;
import i2.o;
import java.util.ArrayList;
import java.util.Iterator;

public final class e
{
  public static c a(l paraml, FoldingFeature paramFoldingFeature)
  {
    int i = paramFoldingFeature.getType();
    Object localObject1 = null;
    int j = 1;
    c.a locala;
    if (i != 1)
    {
      if (i != 2) {
        return null;
      }
      locala = c.a.c;
    }
    else
    {
      locala = c.a.b;
    }
    i = paramFoldingFeature.getState();
    b.b localb;
    if (i != 1)
    {
      if (i != 2) {
        return null;
      }
      localb = b.b.c;
    }
    else
    {
      localb = b.b.b;
    }
    Object localObject2 = paramFoldingFeature.getBounds();
    i.d(localObject2, "oemFeature.bounds");
    localObject2 = new f2.a((Rect)localObject2);
    paraml = paraml.a();
    if ((d - b == 0) && (c - a == 0)) {
      i = 1;
    } else {
      i = 0;
    }
    if ((i == 0) && ((c - a == paraml.width()) || (d - b == paraml.height())) && ((c - a >= paraml.width()) || (d - b >= paraml.height())))
    {
      i = j;
      if (c - a == paraml.width())
      {
        i = j;
        if (d - b != paraml.height()) {}
      }
    }
    else
    {
      i = 0;
    }
    paraml = (l)localObject1;
    if (i != 0)
    {
      paraml = paramFoldingFeature.getBounds();
      i.d(paraml, "oemFeature.bounds");
      paraml = new c(new f2.a(paraml), locala, localb);
    }
    return paraml;
  }
  
  public static k b(Context paramContext, WindowLayoutInfo paramWindowLayoutInfo)
  {
    i.e(paramContext, "context");
    i.e(paramWindowLayoutInfo, "info");
    int i = Build.VERSION.SDK_INT;
    Object localObject;
    if (i >= 30)
    {
      o.b.getClass();
      if (i >= 30)
      {
        paramContext = m2.a.c(paramContext);
      }
      else
      {
        localObject = paramContext;
        while ((localObject instanceof ContextWrapper))
        {
          boolean bool = localObject instanceof Activity;
          ContextWrapper localContextWrapper;
          if ((!bool) && (!(localObject instanceof InputMethodService)))
          {
            localContextWrapper = (ContextWrapper)localObject;
            if (localContextWrapper.getBaseContext() != null) {}
          }
          else
          {
            if (bool)
            {
              paramContext = o.b((Activity)paramContext);
              break label363;
            }
            if ((localObject instanceof InputMethodService))
            {
              paramContext = paramContext.getSystemService("window");
              i.c(paramContext, "null cannot be cast to non-null type android.view.WindowManager");
              paramContext = ((WindowManager)paramContext).getDefaultDisplay();
              i.d(paramContext, "wm.defaultDisplay");
              localObject = new Point();
              paramContext.getRealSize((Point)localObject);
              localObject = new Rect(0, 0, x, y);
              i = Build.VERSION.SDK_INT;
              if (i >= 30) {
                paramContext = new s0.d();
              } else if (i >= 29) {
                paramContext = new s0.c();
              } else {
                paramContext = new s0.b();
              }
              paramContext = paramContext.b();
              i.d(paramContext, "Builder().build()");
              paramContext = new l((Rect)localObject, paramContext);
              break label363;
            }
            paramWindowLayoutInfo = new StringBuilder();
            paramWindowLayoutInfo.append(paramContext);
            paramWindowLayoutInfo.append(" is not a UiContext");
            throw new IllegalArgumentException(paramWindowLayoutInfo.toString());
          }
          localObject = localContextWrapper.getBaseContext();
          i.d(localObject, "iterator.baseContext");
        }
        paramWindowLayoutInfo = new StringBuilder();
        paramWindowLayoutInfo.append("Context ");
        paramWindowLayoutInfo.append(paramContext);
        paramWindowLayoutInfo.append(" is not a UiContext");
        throw new IllegalArgumentException(paramWindowLayoutInfo.toString());
      }
    }
    else
    {
      if ((i < 29) || (!(paramContext instanceof Activity))) {
        break label369;
      }
      localObject = o.b;
      paramContext = (Activity)paramContext;
      localObject.getClass();
      paramContext = o.b(paramContext);
    }
    label363:
    return c(paramContext, paramWindowLayoutInfo);
    label369:
    throw new UnsupportedOperationException("Display Features are only supported after Q. Display features for non-Activity contexts are not expected to be reported on devices running Q.");
  }
  
  public static k c(l paraml, WindowLayoutInfo paramWindowLayoutInfo)
  {
    i.e(paramWindowLayoutInfo, "info");
    paramWindowLayoutInfo = paramWindowLayoutInfo.getDisplayFeatures();
    i.d(paramWindowLayoutInfo, "info.displayFeatures");
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = paramWindowLayoutInfo.iterator();
    while (localIterator.hasNext())
    {
      paramWindowLayoutInfo = (DisplayFeature)localIterator.next();
      if ((paramWindowLayoutInfo instanceof FoldingFeature))
      {
        i.d(paramWindowLayoutInfo, "feature");
        paramWindowLayoutInfo = a(paraml, (FoldingFeature)paramWindowLayoutInfo);
      }
      else
      {
        paramWindowLayoutInfo = null;
      }
      if (paramWindowLayoutInfo != null) {
        localArrayList.add(paramWindowLayoutInfo);
      }
    }
    return new k(localArrayList);
  }
}

/* Location:
 * Qualified Name:     k2.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */