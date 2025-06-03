package l;

import android.content.Context;
import android.content.res.Resources.Theme;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import i.b;
import java.lang.reflect.Constructor;

public final class q0$d
  implements q0.e
{
  public final Drawable a(Context paramContext, XmlResourceParser paramXmlResourceParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme)
  {
    Object localObject = paramAttributeSet.getClassAttribute();
    if (localObject != null) {
      try
      {
        localObject = (Drawable)d.class.getClassLoader().loadClass((String)localObject).asSubclass(Drawable.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        b.c((Drawable)localObject, paramContext.getResources(), paramXmlResourceParser, paramAttributeSet, paramTheme);
        return (Drawable)localObject;
      }
      catch (Exception paramContext)
      {
        Log.e("DrawableDelegate", "Exception while inflating <drawable>", paramContext);
      }
    }
    return null;
  }
}

/* Location:
 * Qualified Name:     l.q0.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */