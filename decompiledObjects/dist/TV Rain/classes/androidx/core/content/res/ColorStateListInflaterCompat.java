package androidx.core.content.res;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.Log;
import android.util.StateSet;
import android.util.TypedValue;
import android.util.Xml;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.XmlRes;
import androidx.core.R.attr;
import androidx.core.R.styleable;
import androidx.core.math.MathUtils;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class ColorStateListInflaterCompat
{
  private static final ThreadLocal<TypedValue> sTempTypedValue = new ThreadLocal();
  
  @NonNull
  public static ColorStateList createFromXml(@NonNull Resources paramResources, @NonNull XmlPullParser paramXmlPullParser, @Nullable Resources.Theme paramTheme)
    throws XmlPullParserException, IOException
  {
    AttributeSet localAttributeSet = Xml.asAttributeSet(paramXmlPullParser);
    int i;
    do
    {
      i = paramXmlPullParser.next();
    } while ((i != 2) && (i != 1));
    if (i == 2) {
      return createFromXmlInner(paramResources, paramXmlPullParser, localAttributeSet, paramTheme);
    }
    throw new XmlPullParserException("No start tag found");
  }
  
  @NonNull
  public static ColorStateList createFromXmlInner(@NonNull Resources paramResources, @NonNull XmlPullParser paramXmlPullParser, @NonNull AttributeSet paramAttributeSet, @Nullable Resources.Theme paramTheme)
    throws XmlPullParserException, IOException
  {
    String str = paramXmlPullParser.getName();
    if (str.equals("selector")) {
      return inflate(paramResources, paramXmlPullParser, paramAttributeSet, paramTheme);
    }
    paramResources = new StringBuilder();
    paramResources.append(paramXmlPullParser.getPositionDescription());
    paramResources.append(": invalid color state list tag ");
    paramResources.append(str);
    throw new XmlPullParserException(paramResources.toString());
  }
  
  @NonNull
  private static TypedValue getTypedValue()
  {
    ThreadLocal localThreadLocal = sTempTypedValue;
    TypedValue localTypedValue1 = (TypedValue)localThreadLocal.get();
    TypedValue localTypedValue2 = localTypedValue1;
    if (localTypedValue1 == null)
    {
      localTypedValue2 = new TypedValue();
      localThreadLocal.set(localTypedValue2);
    }
    return localTypedValue2;
  }
  
  @Nullable
  public static ColorStateList inflate(@NonNull Resources paramResources, @XmlRes int paramInt, @Nullable Resources.Theme paramTheme)
  {
    try
    {
      paramResources = createFromXml(paramResources, paramResources.getXml(paramInt), paramTheme);
      return paramResources;
    }
    catch (Exception paramResources)
    {
      Log.e("CSLCompat", "Failed to inflate ColorStateList.", paramResources);
    }
    return null;
  }
  
  private static ColorStateList inflate(@NonNull Resources paramResources, @NonNull XmlPullParser paramXmlPullParser, @NonNull AttributeSet paramAttributeSet, @Nullable Resources.Theme paramTheme)
    throws XmlPullParserException, IOException
  {
    int i = paramXmlPullParser.getDepth() + 1;
    Object localObject1 = new int[20][];
    Object localObject2 = new int[20];
    int n;
    for (int j = 0;; j = n)
    {
      Resources localResources = paramResources;
      int k = paramXmlPullParser.next();
      if (k == 1) {
        break;
      }
      int m = paramXmlPullParser.getDepth();
      if ((m < i) && (k == 3)) {
        break;
      }
      Object localObject3 = localObject2;
      Object localObject4 = localObject1;
      n = j;
      label327:
      int[] arrayOfInt;
      if (k == 2)
      {
        localObject3 = localObject2;
        localObject4 = localObject1;
        n = j;
        if (m <= i) {
          if (!paramXmlPullParser.getName().equals("item"))
          {
            localObject3 = localObject2;
            localObject4 = localObject1;
            n = j;
          }
          else
          {
            localObject4 = obtainAttributes(localResources, paramTheme, paramAttributeSet, R.styleable.ColorStateListItem);
            k = R.styleable.ColorStateListItem_android_color;
            n = ((TypedArray)localObject4).getResourceId(k, -1);
            if ((n != -1) && (!isColorInt(localResources, n))) {
              try
              {
                n = createFromXml(localResources, localResources.getXml(n), paramTheme).getDefaultColor();
              }
              catch (Exception localException)
              {
                n = ((TypedArray)localObject4).getColor(R.styleable.ColorStateListItem_android_color, -65281);
              }
            } else {
              n = ((TypedArray)localObject4).getColor(k, -65281);
            }
            float f1 = 1.0F;
            k = R.styleable.ColorStateListItem_android_alpha;
            if (((TypedArray)localObject4).hasValue(k))
            {
              f1 = ((TypedArray)localObject4).getFloat(k, 1.0F);
            }
            else
            {
              k = R.styleable.ColorStateListItem_alpha;
              if (((TypedArray)localObject4).hasValue(k)) {
                f1 = ((TypedArray)localObject4).getFloat(k, 1.0F);
              }
            }
            if (Build.VERSION.SDK_INT >= 31)
            {
              k = R.styleable.ColorStateListItem_android_lStar;
              if (((TypedArray)localObject4).hasValue(k))
              {
                f2 = ((TypedArray)localObject4).getFloat(k, -1.0F);
                break label327;
              }
            }
            float f2 = ((TypedArray)localObject4).getFloat(R.styleable.ColorStateListItem_lStar, -1.0F);
            ((TypedArray)localObject4).recycle();
            int i1 = paramAttributeSet.getAttributeCount();
            localObject4 = new int[i1];
            m = 0;
            int i3;
            for (k = 0; m < i1; k = i3)
            {
              int i2 = paramAttributeSet.getAttributeNameResource(m);
              i3 = k;
              if (i2 != 16843173)
              {
                i3 = k;
                if (i2 != 16843551)
                {
                  i3 = k;
                  if (i2 != R.attr.alpha)
                  {
                    i3 = k;
                    if (i2 != R.attr.lStar)
                    {
                      if (paramAttributeSet.getAttributeBooleanValue(m, false)) {
                        i3 = i2;
                      } else {
                        i3 = -i2;
                      }
                      localObject4[k] = i3;
                      i3 = k + 1;
                    }
                  }
                }
              }
              m++;
            }
            localObject4 = StateSet.trimStateSet((int[])localObject4, k);
            arrayOfInt = GrowingArrayUtils.append((int[])localObject2, j, modulateColorAlpha(n, f1, f2));
            localObject4 = (int[][])GrowingArrayUtils.append((Object[])localObject1, j, localObject4);
            n = j + 1;
          }
        }
      }
      localObject2 = arrayOfInt;
      localObject1 = localObject4;
    }
    paramXmlPullParser = new int[j];
    paramResources = new int[j][];
    System.arraycopy(localObject2, 0, paramXmlPullParser, 0, j);
    System.arraycopy(localObject1, 0, paramResources, 0, j);
    return new ColorStateList(paramResources, paramXmlPullParser);
  }
  
  private static boolean isColorInt(@NonNull Resources paramResources, @ColorRes int paramInt)
  {
    TypedValue localTypedValue = getTypedValue();
    boolean bool = true;
    paramResources.getValue(paramInt, localTypedValue, true);
    paramInt = type;
    if ((paramInt < 28) || (paramInt > 31)) {
      bool = false;
    }
    return bool;
  }
  
  @ColorInt
  private static int modulateColorAlpha(@ColorInt int paramInt, @FloatRange(from=0.0D, to=1.0D) float paramFloat1, @FloatRange(from=0.0D, to=100.0D) float paramFloat2)
  {
    int i;
    if ((paramFloat2 >= 0.0F) && (paramFloat2 <= 100.0F)) {
      i = 1;
    } else {
      i = 0;
    }
    if ((paramFloat1 == 1.0F) && (i == 0)) {
      return paramInt;
    }
    int j = MathUtils.clamp((int)(Color.alpha(paramInt) * paramFloat1 + 0.5F), 0, 255);
    int k = paramInt;
    if (i != 0)
    {
      CamColor localCamColor = CamColor.fromColor(paramInt);
      k = CamColor.toColor(localCamColor.getHue(), localCamColor.getChroma(), paramFloat2);
    }
    return k & 0xFFFFFF | j << 24;
  }
  
  private static TypedArray obtainAttributes(Resources paramResources, Resources.Theme paramTheme, AttributeSet paramAttributeSet, int[] paramArrayOfInt)
  {
    if (paramTheme == null) {
      paramResources = paramResources.obtainAttributes(paramAttributeSet, paramArrayOfInt);
    } else {
      paramResources = paramTheme.obtainStyledAttributes(paramAttributeSet, paramArrayOfInt, 0, 0);
    }
    return paramResources;
  }
}

/* Location:
 * Qualified Name:     androidx.core.content.res.ColorStateListInflaterCompat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */