package androidx.appcompat.resources;

import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

@RequiresApi(21)
public class Compatibility$Api21Impl
{
  @DoNotInline
  @NonNull
  public static Drawable createFromXmlInner(@NonNull Resources paramResources, @NonNull XmlPullParser paramXmlPullParser, @NonNull AttributeSet paramAttributeSet, @Nullable Resources.Theme paramTheme)
    throws IOException, XmlPullParserException
  {
    return Drawable.createFromXmlInner(paramResources, paramXmlPullParser, paramAttributeSet, paramTheme);
  }
  
  @DoNotInline
  public static int getChangingConfigurations(@NonNull TypedArray paramTypedArray)
  {
    return paramTypedArray.getChangingConfigurations();
  }
  
  @DoNotInline
  public static void inflate(@NonNull Drawable paramDrawable, @NonNull Resources paramResources, @NonNull XmlPullParser paramXmlPullParser, @NonNull AttributeSet paramAttributeSet, @Nullable Resources.Theme paramTheme)
    throws IOException, XmlPullParserException
  {
    paramDrawable.inflate(paramResources, paramXmlPullParser, paramAttributeSet, paramTheme);
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.resources.Compatibility.Api21Impl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */