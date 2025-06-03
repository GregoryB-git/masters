package androidx.core.content.res;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.Base64;
import android.util.Xml;
import androidx.annotation.ArrayRes;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.R.styleable;
import androidx.core.provider.FontRequest;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

@RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class FontResourcesParserCompat
{
  private static final int DEFAULT_TIMEOUT_MILLIS = 500;
  public static final int FETCH_STRATEGY_ASYNC = 1;
  public static final int FETCH_STRATEGY_BLOCKING = 0;
  public static final int INFINITE_TIMEOUT_VALUE = -1;
  private static final int ITALIC = 1;
  private static final int NORMAL_WEIGHT = 400;
  
  private static int getType(TypedArray paramTypedArray, int paramInt)
  {
    return Api21Impl.getType(paramTypedArray, paramInt);
  }
  
  @Nullable
  public static FamilyResourceEntry parse(@NonNull XmlPullParser paramXmlPullParser, @NonNull Resources paramResources)
    throws XmlPullParserException, IOException
  {
    int i;
    do
    {
      i = paramXmlPullParser.next();
    } while ((i != 2) && (i != 1));
    if (i == 2) {
      return readFamilies(paramXmlPullParser, paramResources);
    }
    throw new XmlPullParserException("No start tag found");
  }
  
  @NonNull
  public static List<List<byte[]>> readCerts(@NonNull Resources paramResources, @ArrayRes int paramInt)
  {
    if (paramInt == 0) {
      return Collections.emptyList();
    }
    TypedArray localTypedArray = paramResources.obtainTypedArray(paramInt);
    try
    {
      if (localTypedArray.length() == 0)
      {
        paramResources = Collections.emptyList();
        return paramResources;
      }
      ArrayList localArrayList = new java/util/ArrayList;
      localArrayList.<init>();
      if (getType(localTypedArray, 0) == 1) {
        for (paramInt = 0; paramInt < localTypedArray.length(); paramInt++)
        {
          int i = localTypedArray.getResourceId(paramInt, 0);
          if (i != 0) {
            localArrayList.add(toByteArrayList(paramResources.getStringArray(i)));
          }
        }
      }
      localArrayList.add(toByteArrayList(paramResources.getStringArray(paramInt)));
      return localArrayList;
    }
    finally
    {
      localTypedArray.recycle();
    }
  }
  
  @Nullable
  private static FamilyResourceEntry readFamilies(XmlPullParser paramXmlPullParser, Resources paramResources)
    throws XmlPullParserException, IOException
  {
    paramXmlPullParser.require(2, null, "font-family");
    if (paramXmlPullParser.getName().equals("font-family")) {
      return readFamily(paramXmlPullParser, paramResources);
    }
    skip(paramXmlPullParser);
    return null;
  }
  
  @Nullable
  private static FamilyResourceEntry readFamily(XmlPullParser paramXmlPullParser, Resources paramResources)
    throws XmlPullParserException, IOException
  {
    TypedArray localTypedArray = paramResources.obtainAttributes(Xml.asAttributeSet(paramXmlPullParser), R.styleable.FontFamily);
    String str1 = localTypedArray.getString(R.styleable.FontFamily_fontProviderAuthority);
    Object localObject = localTypedArray.getString(R.styleable.FontFamily_fontProviderPackage);
    String str2 = localTypedArray.getString(R.styleable.FontFamily_fontProviderQuery);
    int i = localTypedArray.getResourceId(R.styleable.FontFamily_fontProviderCerts, 0);
    int j = localTypedArray.getInteger(R.styleable.FontFamily_fontProviderFetchStrategy, 1);
    int k = localTypedArray.getInteger(R.styleable.FontFamily_fontProviderFetchTimeout, 500);
    String str3 = localTypedArray.getString(R.styleable.FontFamily_fontProviderSystemFontFamily);
    localTypedArray.recycle();
    if ((str1 != null) && (localObject != null) && (str2 != null))
    {
      while (paramXmlPullParser.next() != 3) {
        skip(paramXmlPullParser);
      }
      return new ProviderResourceEntry(new FontRequest(str1, (String)localObject, str2, readCerts(paramResources, i)), j, k, str3);
    }
    localObject = new ArrayList();
    while (paramXmlPullParser.next() != 3) {
      if (paramXmlPullParser.getEventType() == 2) {
        if (paramXmlPullParser.getName().equals("font")) {
          ((ArrayList)localObject).add(readFont(paramXmlPullParser, paramResources));
        } else {
          skip(paramXmlPullParser);
        }
      }
    }
    if (((ArrayList)localObject).isEmpty()) {
      return null;
    }
    return new FontFamilyFilesResourceEntry((FontFileResourceEntry[])((ArrayList)localObject).toArray(new FontFileResourceEntry[0]));
  }
  
  private static FontFileResourceEntry readFont(XmlPullParser paramXmlPullParser, Resources paramResources)
    throws XmlPullParserException, IOException
  {
    TypedArray localTypedArray = paramResources.obtainAttributes(Xml.asAttributeSet(paramXmlPullParser), R.styleable.FontFamilyFont);
    int i = R.styleable.FontFamilyFont_fontWeight;
    if (!localTypedArray.hasValue(i)) {
      i = R.styleable.FontFamilyFont_android_fontWeight;
    }
    int j = localTypedArray.getInt(i, 400);
    i = R.styleable.FontFamilyFont_fontStyle;
    if (!localTypedArray.hasValue(i)) {
      i = R.styleable.FontFamilyFont_android_fontStyle;
    }
    boolean bool;
    if (1 == localTypedArray.getInt(i, 0)) {
      bool = true;
    } else {
      bool = false;
    }
    i = R.styleable.FontFamilyFont_ttcIndex;
    if (!localTypedArray.hasValue(i)) {
      i = R.styleable.FontFamilyFont_android_ttcIndex;
    }
    int k = R.styleable.FontFamilyFont_fontVariationSettings;
    if (!localTypedArray.hasValue(k)) {
      k = R.styleable.FontFamilyFont_android_fontVariationSettings;
    }
    String str = localTypedArray.getString(k);
    k = localTypedArray.getInt(i, 0);
    i = R.styleable.FontFamilyFont_font;
    if (!localTypedArray.hasValue(i)) {
      i = R.styleable.FontFamilyFont_android_font;
    }
    int m = localTypedArray.getResourceId(i, 0);
    paramResources = localTypedArray.getString(i);
    localTypedArray.recycle();
    while (paramXmlPullParser.next() != 3) {
      skip(paramXmlPullParser);
    }
    return new FontFileResourceEntry(paramResources, j, bool, str, k, m);
  }
  
  private static void skip(XmlPullParser paramXmlPullParser)
    throws XmlPullParserException, IOException
  {
    int i = 1;
    while (i > 0)
    {
      int j = paramXmlPullParser.next();
      if (j != 2)
      {
        if (j == 3) {
          i--;
        }
      }
      else {
        i++;
      }
    }
  }
  
  private static List<byte[]> toByteArrayList(String[] paramArrayOfString)
  {
    ArrayList localArrayList = new ArrayList();
    int i = paramArrayOfString.length;
    for (int j = 0; j < i; j++) {
      localArrayList.add(Base64.decode(paramArrayOfString[j], 0));
    }
    return localArrayList;
  }
  
  @RequiresApi(21)
  public static class Api21Impl
  {
    @DoNotInline
    public static int getType(TypedArray paramTypedArray, int paramInt)
    {
      return paramTypedArray.getType(paramInt);
    }
  }
  
  public static abstract interface FamilyResourceEntry {}
  
  @Retention(RetentionPolicy.SOURCE)
  public static @interface FetchStrategy {}
  
  public static final class FontFamilyFilesResourceEntry
    implements FontResourcesParserCompat.FamilyResourceEntry
  {
    @NonNull
    private final FontResourcesParserCompat.FontFileResourceEntry[] mEntries;
    
    public FontFamilyFilesResourceEntry(@NonNull FontResourcesParserCompat.FontFileResourceEntry[] paramArrayOfFontFileResourceEntry)
    {
      mEntries = paramArrayOfFontFileResourceEntry;
    }
    
    @NonNull
    public FontResourcesParserCompat.FontFileResourceEntry[] getEntries()
    {
      return mEntries;
    }
  }
  
  public static final class FontFileResourceEntry
  {
    @NonNull
    private final String mFileName;
    private final boolean mItalic;
    private final int mResourceId;
    private final int mTtcIndex;
    private final String mVariationSettings;
    private final int mWeight;
    
    public FontFileResourceEntry(@NonNull String paramString1, int paramInt1, boolean paramBoolean, @Nullable String paramString2, int paramInt2, int paramInt3)
    {
      mFileName = paramString1;
      mWeight = paramInt1;
      mItalic = paramBoolean;
      mVariationSettings = paramString2;
      mTtcIndex = paramInt2;
      mResourceId = paramInt3;
    }
    
    @NonNull
    public String getFileName()
    {
      return mFileName;
    }
    
    public int getResourceId()
    {
      return mResourceId;
    }
    
    public int getTtcIndex()
    {
      return mTtcIndex;
    }
    
    @Nullable
    public String getVariationSettings()
    {
      return mVariationSettings;
    }
    
    public int getWeight()
    {
      return mWeight;
    }
    
    public boolean isItalic()
    {
      return mItalic;
    }
  }
  
  public static final class ProviderResourceEntry
    implements FontResourcesParserCompat.FamilyResourceEntry
  {
    @NonNull
    private final FontRequest mRequest;
    private final int mStrategy;
    @Nullable
    private final String mSystemFontFamilyName;
    private final int mTimeoutMs;
    
    public ProviderResourceEntry(@NonNull FontRequest paramFontRequest, int paramInt1, int paramInt2)
    {
      this(paramFontRequest, paramInt1, paramInt2, null);
    }
    
    @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public ProviderResourceEntry(@NonNull FontRequest paramFontRequest, int paramInt1, int paramInt2, @Nullable String paramString)
    {
      mRequest = paramFontRequest;
      mStrategy = paramInt1;
      mTimeoutMs = paramInt2;
      mSystemFontFamilyName = paramString;
    }
    
    public int getFetchStrategy()
    {
      return mStrategy;
    }
    
    @NonNull
    public FontRequest getRequest()
    {
      return mRequest;
    }
    
    @Nullable
    @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public String getSystemFontFamilyName()
    {
      return mSystemFontFamilyName;
    }
    
    public int getTimeout()
    {
      return mTimeoutMs;
    }
  }
}

/* Location:
 * Qualified Name:     androidx.core.content.res.FontResourcesParserCompat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */