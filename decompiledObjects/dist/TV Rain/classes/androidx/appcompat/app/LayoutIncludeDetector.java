package androidx.appcompat.app;

import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Deque;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

class LayoutIncludeDetector
{
  @NonNull
  private final Deque<WeakReference<XmlPullParser>> mXmlParserStack = new ArrayDeque();
  
  private static boolean isParserOutdated(@Nullable XmlPullParser paramXmlPullParser)
  {
    bool1 = true;
    bool2 = bool1;
    if (paramXmlPullParser != null) {
      bool2 = bool1;
    }
    try
    {
      if (paramXmlPullParser.getEventType() != 3)
      {
        int i = paramXmlPullParser.getEventType();
        if (i == 1) {
          bool2 = bool1;
        } else {
          bool2 = false;
        }
      }
    }
    catch (XmlPullParserException paramXmlPullParser)
    {
      for (;;)
      {
        bool2 = bool1;
      }
    }
    return bool2;
  }
  
  @Nullable
  private static XmlPullParser popOutdatedAttrHolders(@NonNull Deque<WeakReference<XmlPullParser>> paramDeque)
  {
    while (!paramDeque.isEmpty())
    {
      XmlPullParser localXmlPullParser = (XmlPullParser)((WeakReference)paramDeque.peek()).get();
      if (isParserOutdated(localXmlPullParser)) {
        paramDeque.pop();
      } else {
        return localXmlPullParser;
      }
    }
    return null;
  }
  
  private static boolean shouldInheritContext(@NonNull XmlPullParser paramXmlPullParser1, @Nullable XmlPullParser paramXmlPullParser2)
  {
    if ((paramXmlPullParser2 != null) && (paramXmlPullParser1 != paramXmlPullParser2)) {}
    try
    {
      if (paramXmlPullParser2.getEventType() == 2)
      {
        boolean bool = "include".equals(paramXmlPullParser2.getName());
        return bool;
      }
    }
    catch (XmlPullParserException paramXmlPullParser1)
    {
      for (;;) {}
    }
    return false;
  }
  
  public boolean detect(@NonNull AttributeSet paramAttributeSet)
  {
    if ((paramAttributeSet instanceof XmlPullParser))
    {
      paramAttributeSet = (XmlPullParser)paramAttributeSet;
      if (paramAttributeSet.getDepth() == 1)
      {
        XmlPullParser localXmlPullParser = popOutdatedAttrHolders(mXmlParserStack);
        mXmlParserStack.push(new WeakReference(paramAttributeSet));
        if (shouldInheritContext(paramAttributeSet, localXmlPullParser)) {
          return true;
        }
      }
    }
    return false;
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.app.LayoutIncludeDetector
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */