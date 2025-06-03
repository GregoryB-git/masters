package i2;

import android.graphics.Rect;
import dc.a;
import ec.i;
import ec.j;
import ec.t;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import p2.m0;

public final class d
  extends j
  implements a<Boolean>
{
  public d(h paramh)
  {
    super(0);
  }
  
  public final Object invoke()
  {
    Object localObject1 = a.a.loadClass("androidx.window.extensions.layout.FoldingFeature");
    i.d(localObject1, "loader.loadClass(FOLDING_FEATURE_CLASS)");
    boolean bool1 = false;
    Object localObject2 = ((Class)localObject1).getMethod("getBounds", new Class[0]);
    Method localMethod = ((Class)localObject1).getMethod("getType", new Class[0]);
    localObject1 = ((Class)localObject1).getMethod("getState", new Class[0]);
    i.d(localObject2, "getBoundsMethod");
    boolean bool2 = bool1;
    if (m0.z((Method)localObject2, t.a(Rect.class)))
    {
      bool2 = bool1;
      if (Modifier.isPublic(((Method)localObject2).getModifiers()))
      {
        i.d(localMethod, "getTypeMethod");
        localObject2 = Integer.TYPE;
        bool2 = bool1;
        if (m0.z(localMethod, t.a((Class)localObject2)))
        {
          bool2 = bool1;
          if (Modifier.isPublic(localMethod.getModifiers()))
          {
            i.d(localObject1, "getStateMethod");
            bool2 = bool1;
            if (m0.z((Method)localObject1, t.a((Class)localObject2)))
            {
              bool2 = bool1;
              if (Modifier.isPublic(((Method)localObject1).getModifiers())) {
                bool2 = true;
              }
            }
          }
        }
      }
    }
    return Boolean.valueOf(bool2);
  }
}

/* Location:
 * Qualified Name:     i2.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */