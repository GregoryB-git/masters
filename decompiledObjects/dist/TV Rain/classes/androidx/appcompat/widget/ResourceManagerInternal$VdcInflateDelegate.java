package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources.Theme;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.vectordrawable.graphics.drawable.VectorDrawableCompat;
import org.xmlpull.v1.XmlPullParser;

class ResourceManagerInternal$VdcInflateDelegate
  implements ResourceManagerInternal.InflateDelegate
{
  public Drawable createFromXmlInner(@NonNull Context paramContext, @NonNull XmlPullParser paramXmlPullParser, @NonNull AttributeSet paramAttributeSet, @Nullable Resources.Theme paramTheme)
  {
    try
    {
      paramContext = VectorDrawableCompat.createFromXmlInner(paramContext.getResources(), paramXmlPullParser, paramAttributeSet, paramTheme);
      return paramContext;
    }
    catch (Exception paramContext)
    {
      Log.e("VdcInflateDelegate", "Exception while inflating <vector>", paramContext);
    }
    return null;
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.ResourceManagerInternal.VdcInflateDelegate
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */