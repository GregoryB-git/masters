package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources.Theme;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.resources.Compatibility.Api21Impl;
import java.lang.reflect.Constructor;
import org.xmlpull.v1.XmlPullParser;

class ResourceManagerInternal$DrawableDelegate
  implements ResourceManagerInternal.InflateDelegate
{
  public Drawable createFromXmlInner(@NonNull Context paramContext, @NonNull XmlPullParser paramXmlPullParser, @NonNull AttributeSet paramAttributeSet, @Nullable Resources.Theme paramTheme)
  {
    Object localObject = paramAttributeSet.getClassAttribute();
    if (localObject != null) {
      try
      {
        localObject = (Drawable)DrawableDelegate.class.getClassLoader().loadClass((String)localObject).asSubclass(Drawable.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        Compatibility.Api21Impl.inflate((Drawable)localObject, paramContext.getResources(), paramXmlPullParser, paramAttributeSet, paramTheme);
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
 * Qualified Name:     androidx.appcompat.widget.ResourceManagerInternal.DrawableDelegate
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */