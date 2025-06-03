package w;

import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import org.xmlpull.v1.XmlPullParser;

public final class k
{
  public static c a(TypedArray paramTypedArray, XmlPullParser paramXmlPullParser, Resources.Theme paramTheme, String paramString, int paramInt)
  {
    if (e(paramXmlPullParser, paramString))
    {
      paramXmlPullParser = new TypedValue();
      paramTypedArray.getValue(paramInt, paramXmlPullParser);
      int i = type;
      if ((i >= 28) && (i <= 31)) {
        return new c(null, null, data);
      }
      paramXmlPullParser = paramTypedArray.getResources();
      paramInt = paramTypedArray.getResourceId(paramInt, 0);
      try
      {
        paramTypedArray = c.a(paramXmlPullParser, paramInt, paramTheme);
      }
      catch (Exception paramTypedArray)
      {
        Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", paramTypedArray);
        paramTypedArray = null;
      }
      if (paramTypedArray != null) {
        return paramTypedArray;
      }
    }
    return new c(null, null, 0);
  }
  
  public static float b(TypedArray paramTypedArray, XmlPullParser paramXmlPullParser, String paramString, int paramInt, float paramFloat)
  {
    if (!e(paramXmlPullParser, paramString)) {
      return paramFloat;
    }
    return paramTypedArray.getFloat(paramInt, paramFloat);
  }
  
  public static int c(TypedArray paramTypedArray, XmlPullParser paramXmlPullParser, String paramString, int paramInt1, int paramInt2)
  {
    if (!e(paramXmlPullParser, paramString)) {
      return paramInt2;
    }
    return paramTypedArray.getInt(paramInt1, paramInt2);
  }
  
  public static String d(TypedArray paramTypedArray, XmlResourceParser paramXmlResourceParser, String paramString, int paramInt)
  {
    if (!e(paramXmlResourceParser, paramString)) {
      return null;
    }
    return paramTypedArray.getString(paramInt);
  }
  
  public static boolean e(XmlPullParser paramXmlPullParser, String paramString)
  {
    boolean bool;
    if (paramXmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", paramString) != null) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static TypedArray f(Resources paramResources, Resources.Theme paramTheme, AttributeSet paramAttributeSet, int[] paramArrayOfInt)
  {
    if (paramTheme == null) {
      return paramResources.obtainAttributes(paramAttributeSet, paramArrayOfInt);
    }
    return paramTheme.obtainStyledAttributes(paramAttributeSet, paramArrayOfInt, 0, 0);
  }
}

/* Location:
 * Qualified Name:     w.k
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */