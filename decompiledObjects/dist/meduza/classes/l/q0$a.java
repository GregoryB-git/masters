package l;

import android.content.Context;
import android.content.res.Resources.Theme;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import h.a;

public final class q0$a
  implements q0.e
{
  public final Drawable a(Context paramContext, XmlResourceParser paramXmlResourceParser, AttributeSet paramAttributeSet, Resources.Theme paramTheme)
  {
    try
    {
      paramContext = a.g(paramContext, paramTheme, paramContext.getResources(), paramAttributeSet, paramXmlResourceParser);
      return paramContext;
    }
    catch (Exception paramContext)
    {
      Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", paramContext);
    }
    return null;
  }
}

/* Location:
 * Qualified Name:     l.q0.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */