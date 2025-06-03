package androidx.core.text.util;

import android.os.Build.VERSION;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.text.util.Linkify;
import android.text.util.Linkify.MatchFilter;
import android.text.util.Linkify.TransformFilter;
import android.webkit.WebView;
import android.widget.TextView;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.util.PatternsCompat;
import java.io.UnsupportedEncodingException;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import z2;

public final class LinkifyCompat
{
  private static final Comparator<LinkSpec> COMPARATOR = new a();
  private static final String[] EMPTY_STRING = new String[0];
  
  private static void addLinkMovementMethod(@NonNull TextView paramTextView)
  {
    if ((!(paramTextView.getMovementMethod() instanceof LinkMovementMethod)) && (paramTextView.getLinksClickable())) {
      paramTextView.setMovementMethod(LinkMovementMethod.getInstance());
    }
  }
  
  public static void addLinks(@NonNull TextView paramTextView, @NonNull Pattern paramPattern, @Nullable String paramString)
  {
    if (shouldAddLinksFallbackToFramework())
    {
      Linkify.addLinks(paramTextView, paramPattern, paramString);
      return;
    }
    addLinks(paramTextView, paramPattern, paramString, null, null, null);
  }
  
  public static void addLinks(@NonNull TextView paramTextView, @NonNull Pattern paramPattern, @Nullable String paramString, @Nullable Linkify.MatchFilter paramMatchFilter, @Nullable Linkify.TransformFilter paramTransformFilter)
  {
    if (shouldAddLinksFallbackToFramework())
    {
      Linkify.addLinks(paramTextView, paramPattern, paramString, paramMatchFilter, paramTransformFilter);
      return;
    }
    addLinks(paramTextView, paramPattern, paramString, null, paramMatchFilter, paramTransformFilter);
  }
  
  public static void addLinks(@NonNull TextView paramTextView, @NonNull Pattern paramPattern, @Nullable String paramString, @Nullable String[] paramArrayOfString, @Nullable Linkify.MatchFilter paramMatchFilter, @Nullable Linkify.TransformFilter paramTransformFilter)
  {
    if (shouldAddLinksFallbackToFramework())
    {
      Api24Impl.addLinks(paramTextView, paramPattern, paramString, paramArrayOfString, paramMatchFilter, paramTransformFilter);
      return;
    }
    SpannableString localSpannableString = SpannableString.valueOf(paramTextView.getText());
    if (addLinks(localSpannableString, paramPattern, paramString, paramArrayOfString, paramMatchFilter, paramTransformFilter))
    {
      paramTextView.setText(localSpannableString);
      addLinkMovementMethod(paramTextView);
    }
  }
  
  public static boolean addLinks(@NonNull Spannable paramSpannable, int paramInt)
  {
    if (shouldAddLinksFallbackToFramework()) {
      return Linkify.addLinks(paramSpannable, paramInt);
    }
    if (paramInt == 0) {
      return false;
    }
    Object localObject1 = (URLSpan[])paramSpannable.getSpans(0, paramSpannable.length(), URLSpan.class);
    for (int i = localObject1.length - 1; i >= 0; i--) {
      paramSpannable.removeSpan(localObject1[i]);
    }
    if ((paramInt & 0x4) != 0) {
      Linkify.addLinks(paramSpannable, 4);
    }
    localObject1 = new ArrayList();
    if ((paramInt & 0x1) != 0)
    {
      localObject2 = PatternsCompat.AUTOLINK_WEB_URL;
      Linkify.MatchFilter localMatchFilter = Linkify.sUrlMatchFilter;
      gatherLinks((ArrayList)localObject1, paramSpannable, (Pattern)localObject2, new String[] { "http://", "https://", "rtsp://" }, localMatchFilter, null);
    }
    if ((paramInt & 0x2) != 0) {
      gatherLinks((ArrayList)localObject1, paramSpannable, PatternsCompat.AUTOLINK_EMAIL_ADDRESS, new String[] { "mailto:" }, null, null);
    }
    if ((paramInt & 0x8) != 0) {
      gatherMapLinks((ArrayList)localObject1, paramSpannable);
    }
    pruneOverlaps((ArrayList)localObject1, paramSpannable);
    if (((ArrayList)localObject1).size() == 0) {
      return false;
    }
    Object localObject2 = ((ArrayList)localObject1).iterator();
    while (((Iterator)localObject2).hasNext())
    {
      localObject1 = (LinkSpec)((Iterator)localObject2).next();
      if (frameworkAddedSpan == null) {
        applyLink(url, start, end, paramSpannable);
      }
    }
    return true;
  }
  
  public static boolean addLinks(@NonNull Spannable paramSpannable, @NonNull Pattern paramPattern, @Nullable String paramString)
  {
    if (shouldAddLinksFallbackToFramework()) {
      return Linkify.addLinks(paramSpannable, paramPattern, paramString);
    }
    return addLinks(paramSpannable, paramPattern, paramString, null, null, null);
  }
  
  public static boolean addLinks(@NonNull Spannable paramSpannable, @NonNull Pattern paramPattern, @Nullable String paramString, @Nullable Linkify.MatchFilter paramMatchFilter, @Nullable Linkify.TransformFilter paramTransformFilter)
  {
    if (shouldAddLinksFallbackToFramework()) {
      return Linkify.addLinks(paramSpannable, paramPattern, paramString, paramMatchFilter, paramTransformFilter);
    }
    return addLinks(paramSpannable, paramPattern, paramString, null, paramMatchFilter, paramTransformFilter);
  }
  
  public static boolean addLinks(@NonNull Spannable paramSpannable, @NonNull Pattern paramPattern, @Nullable String paramString, @Nullable String[] paramArrayOfString, @Nullable Linkify.MatchFilter paramMatchFilter, @Nullable Linkify.TransformFilter paramTransformFilter)
  {
    if (shouldAddLinksFallbackToFramework()) {
      return Api24Impl.addLinks(paramSpannable, paramPattern, paramString, paramArrayOfString, paramMatchFilter, paramTransformFilter);
    }
    String str = paramString;
    if (paramString == null) {
      str = "";
    }
    if (paramArrayOfString != null)
    {
      paramString = paramArrayOfString;
      if (paramArrayOfString.length >= 1) {}
    }
    else
    {
      paramString = EMPTY_STRING;
    }
    String[] arrayOfString = new String[paramString.length + 1];
    arrayOfString[0] = str.toLowerCase(Locale.ROOT);
    int i = 0;
    while (i < paramString.length)
    {
      paramArrayOfString = paramString[i];
      i++;
      if (paramArrayOfString == null) {
        paramArrayOfString = "";
      } else {
        paramArrayOfString = paramArrayOfString.toLowerCase(Locale.ROOT);
      }
      arrayOfString[i] = paramArrayOfString;
    }
    paramPattern = paramPattern.matcher(paramSpannable);
    for (boolean bool1 = false; paramPattern.find(); bool1 = true)
    {
      label120:
      int j = paramPattern.start();
      i = paramPattern.end();
      paramString = paramPattern.group(0);
      boolean bool2;
      if (paramMatchFilter != null) {
        bool2 = paramMatchFilter.acceptMatch(paramSpannable, j, i);
      } else {
        bool2 = true;
      }
      if ((!bool2) || (paramString == null)) {
        break label120;
      }
      applyLink(makeUrl(paramString, arrayOfString, paramPattern, paramTransformFilter), j, i, paramSpannable);
    }
    return bool1;
  }
  
  public static boolean addLinks(@NonNull TextView paramTextView, int paramInt)
  {
    if (shouldAddLinksFallbackToFramework()) {
      return Linkify.addLinks(paramTextView, paramInt);
    }
    if (paramInt == 0) {
      return false;
    }
    Object localObject = paramTextView.getText();
    if ((localObject instanceof Spannable))
    {
      if (addLinks((Spannable)localObject, paramInt))
      {
        addLinkMovementMethod(paramTextView);
        return true;
      }
    }
    else
    {
      localObject = SpannableString.valueOf((CharSequence)localObject);
      if (addLinks((Spannable)localObject, paramInt))
      {
        addLinkMovementMethod(paramTextView);
        paramTextView.setText((CharSequence)localObject);
        return true;
      }
    }
    return false;
  }
  
  private static void applyLink(String paramString, int paramInt1, int paramInt2, Spannable paramSpannable)
  {
    paramSpannable.setSpan(new URLSpan(paramString), paramInt1, paramInt2, 33);
  }
  
  private static String findAddress(String paramString)
  {
    if (Build.VERSION.SDK_INT >= 28) {
      return WebView.findAddress(paramString);
    }
    return FindAddress.findAddress(paramString);
  }
  
  private static void gatherLinks(ArrayList<LinkSpec> paramArrayList, Spannable paramSpannable, Pattern paramPattern, String[] paramArrayOfString, Linkify.MatchFilter paramMatchFilter, Linkify.TransformFilter paramTransformFilter)
  {
    Matcher localMatcher = paramPattern.matcher(paramSpannable);
    while (localMatcher.find())
    {
      int i = localMatcher.start();
      int j = localMatcher.end();
      paramPattern = localMatcher.group(0);
      if (((paramMatchFilter == null) || (paramMatchFilter.acceptMatch(paramSpannable, i, j))) && (paramPattern != null))
      {
        LinkSpec localLinkSpec = new LinkSpec();
        url = makeUrl(paramPattern, paramArrayOfString, localMatcher, paramTransformFilter);
        start = i;
        end = j;
        paramArrayList.add(localLinkSpec);
      }
    }
  }
  
  private static void gatherMapLinks(ArrayList<LinkSpec> paramArrayList, Spannable paramSpannable)
  {
    paramSpannable = paramSpannable.toString();
    int i = 0;
    for (;;)
    {
      try
      {
        localObject = findAddress(paramSpannable);
        if (localObject != null)
        {
          int j = paramSpannable.indexOf((String)localObject);
          if (j >= 0)
          {
            localLinkSpec = new androidx/core/text/util/LinkifyCompat$LinkSpec;
            localLinkSpec.<init>();
            int k = ((String)localObject).length() + j;
            start = (j + i);
            i += k;
            end = i;
            paramSpannable = paramSpannable.substring(k);
          }
        }
      }
      catch (UnsupportedOperationException paramArrayList)
      {
        Object localObject;
        LinkSpec localLinkSpec;
        String str;
        continue;
      }
      try
      {
        str = URLEncoder.encode((String)localObject, "UTF-8");
        localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>();
        ((StringBuilder)localObject).append("geo:0,0?q=");
        ((StringBuilder)localObject).append(str);
        url = ((StringBuilder)localObject).toString();
        paramArrayList.add(localLinkSpec);
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException) {}
      return;
    }
  }
  
  private static String makeUrl(@NonNull String paramString, @NonNull String[] paramArrayOfString, Matcher paramMatcher, @Nullable Linkify.TransformFilter paramTransformFilter)
  {
    String str = paramString;
    if (paramTransformFilter != null) {
      str = paramTransformFilter.transformUrl(paramMatcher, paramString);
    }
    int i = paramArrayOfString.length;
    for (int j = 0;; j++)
    {
      int k = 1;
      if (j >= i) {
        break;
      }
      paramMatcher = paramArrayOfString[j];
      if (str.regionMatches(true, 0, paramMatcher, 0, paramMatcher.length()))
      {
        j = k;
        paramString = str;
        if (str.regionMatches(false, 0, paramMatcher, 0, paramMatcher.length())) {
          break label121;
        }
        paramString = z2.t(paramMatcher);
        paramString.append(str.substring(paramMatcher.length()));
        paramString = paramString.toString();
        j = k;
        break label121;
      }
    }
    j = 0;
    paramString = str;
    label121:
    paramMatcher = paramString;
    if (j == 0)
    {
      paramMatcher = paramString;
      if (paramArrayOfString.length > 0) {
        paramMatcher = z2.s(new StringBuilder(), paramArrayOfString[0], paramString);
      }
    }
    return paramMatcher;
  }
  
  private static void pruneOverlaps(ArrayList<LinkSpec> paramArrayList, Spannable paramSpannable)
  {
    int i = paramSpannable.length();
    int j = 0;
    Object localObject;
    LinkSpec localLinkSpec;
    for (localObject : (URLSpan[])paramSpannable.getSpans(0, i, URLSpan.class))
    {
      localLinkSpec = new LinkSpec();
      frameworkAddedSpan = ((URLSpan)localObject);
      start = paramSpannable.getSpanStart(localObject);
      end = paramSpannable.getSpanEnd(localObject);
      paramArrayList.add(localLinkSpec);
    }
    Collections.sort(paramArrayList, COMPARATOR);
    ??? = paramArrayList.size();
    i = j;
    while (i < ??? - 1)
    {
      localLinkSpec = (LinkSpec)paramArrayList.get(i);
      int m = i + 1;
      localObject = (LinkSpec)paramArrayList.get(m);
      j = start;
      int n = start;
      if (j <= n)
      {
        int i1 = end;
        if (i1 > n)
        {
          int i2 = end;
          if (i2 <= i1) {}
          while (i1 - j > i2 - n)
          {
            j = m;
            break;
          }
          if (i1 - j < i2 - n) {
            j = i;
          } else {
            j = -1;
          }
          if (j != -1)
          {
            localObject = getframeworkAddedSpan;
            if (localObject != null) {
              paramSpannable.removeSpan(localObject);
            }
            paramArrayList.remove(j);
            ???--;
            continue;
          }
        }
      }
      i = m;
    }
  }
  
  private static boolean shouldAddLinksFallbackToFramework()
  {
    boolean bool;
    if (Build.VERSION.SDK_INT >= 28) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  @RequiresApi(24)
  public static class Api24Impl
  {
    @DoNotInline
    public static void addLinks(TextView paramTextView, Pattern paramPattern, String paramString, String[] paramArrayOfString, Linkify.MatchFilter paramMatchFilter, Linkify.TransformFilter paramTransformFilter)
    {
      Linkify.addLinks(paramTextView, paramPattern, paramString, paramArrayOfString, paramMatchFilter, paramTransformFilter);
    }
    
    @DoNotInline
    public static boolean addLinks(Spannable paramSpannable, Pattern paramPattern, String paramString, String[] paramArrayOfString, Linkify.MatchFilter paramMatchFilter, Linkify.TransformFilter paramTransformFilter)
    {
      return Linkify.addLinks(paramSpannable, paramPattern, paramString, paramArrayOfString, paramMatchFilter, paramTransformFilter);
    }
  }
  
  public static class LinkSpec
  {
    public int end;
    public URLSpan frameworkAddedSpan;
    public int start;
    public String url;
  }
  
  @Retention(RetentionPolicy.SOURCE)
  @RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
  public static @interface LinkifyMask {}
}

/* Location:
 * Qualified Name:     androidx.core.text.util.LinkifyCompat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */