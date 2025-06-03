package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources.Theme;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import org.xmlpull.v1.XmlPullParser;

abstract interface ResourceManagerInternal$InflateDelegate
{
  public abstract Drawable createFromXmlInner(@NonNull Context paramContext, @NonNull XmlPullParser paramXmlPullParser, @NonNull AttributeSet paramAttributeSet, @Nullable Resources.Theme paramTheme);
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.ResourceManagerInternal.InflateDelegate
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */