package androidx.vectordrawable.graphics.drawable;

import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.core.content.res.TypedArrayUtils;
import androidx.core.graphics.PathParser;
import org.xmlpull.v1.XmlPullParser;

class VectorDrawableCompat$VClipPath
  extends VectorDrawableCompat.VPath
{
  public VectorDrawableCompat$VClipPath() {}
  
  public VectorDrawableCompat$VClipPath(VClipPath paramVClipPath)
  {
    super(paramVClipPath);
  }
  
  private void updateStateFromTypedArray(TypedArray paramTypedArray, XmlPullParser paramXmlPullParser)
  {
    String str = paramTypedArray.getString(0);
    if (str != null) {
      mPathName = str;
    }
    str = paramTypedArray.getString(1);
    if (str != null) {
      mNodes = PathParser.createNodesFromPathData(str);
    }
    mFillRule = TypedArrayUtils.getNamedInt(paramTypedArray, paramXmlPullParser, "fillType", 2, 0);
  }
  
  public void inflate(Resources paramResources, AttributeSet paramAttributeSet, Resources.Theme paramTheme, XmlPullParser paramXmlPullParser)
  {
    if (!TypedArrayUtils.hasAttribute(paramXmlPullParser, "pathData")) {
      return;
    }
    paramResources = TypedArrayUtils.obtainAttributes(paramResources, paramTheme, paramAttributeSet, AndroidResources.STYLEABLE_VECTOR_DRAWABLE_CLIP_PATH);
    updateStateFromTypedArray(paramResources, paramXmlPullParser);
    paramResources.recycle();
  }
  
  public boolean isClipPath()
  {
    return true;
  }
}

/* Location:
 * Qualified Name:     androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VClipPath
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */