package androidx.window.embedding;

import W5.I;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import androidx.window.R.styleable;
import androidx.window.core.ExperimentalWindowApi;
import java.util.HashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.i;
import org.jetbrains.annotations.NotNull;
import org.xmlpull.v1.XmlPullParser;

@Metadata
@ExperimentalWindowApi
public final class SplitRuleParser
{
  private final ComponentName buildClassName(String paramString, CharSequence paramCharSequence)
  {
    if ((paramCharSequence != null) && (paramCharSequence.length() != 0))
    {
      Object localObject = paramCharSequence.toString();
      if (((String)localObject).charAt(0) == '.') {
        return new ComponentName(paramString, Intrinsics.i(paramString, localObject));
      }
      int i = i.C((CharSequence)localObject, '/', 0, false, 6, null);
      paramCharSequence = paramString;
      paramString = (String)localObject;
      if (i > 0)
      {
        paramCharSequence = ((String)localObject).substring(0, i);
        Intrinsics.checkNotNullExpressionValue(paramCharSequence, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        paramString = ((String)localObject).substring(i + 1);
        Intrinsics.checkNotNullExpressionValue(paramString, "(this as java.lang.String).substring(startIndex)");
      }
      if ((!Intrinsics.a(paramString, "*")) && (i.C(paramString, '.', 0, false, 6, null) < 0))
      {
        localObject = new StringBuilder(paramCharSequence);
        ((StringBuilder)localObject).append('.');
        ((StringBuilder)localObject).append(paramString);
        return new ComponentName(paramCharSequence, ((StringBuilder)localObject).toString());
      }
      return new ComponentName(paramCharSequence, paramString);
    }
    throw new IllegalArgumentException("Activity name must not be null");
  }
  
  private final ActivityFilter parseActivityFilter(Context paramContext, XmlResourceParser paramXmlResourceParser)
  {
    Object localObject = paramContext.getTheme().obtainStyledAttributes(paramXmlResourceParser, R.styleable.ActivityFilter, 0, 0);
    paramXmlResourceParser = ((TypedArray)localObject).getString(R.styleable.ActivityFilter_activityName);
    localObject = ((TypedArray)localObject).getString(R.styleable.ActivityFilter_activityAction);
    paramContext = paramContext.getApplicationContext().getPackageName();
    Intrinsics.checkNotNullExpressionValue(paramContext, "packageName");
    return new ActivityFilter(buildClassName(paramContext, paramXmlResourceParser), (String)localObject);
  }
  
  private final ActivityRule parseSplitActivityRule(Context paramContext, XmlResourceParser paramXmlResourceParser)
  {
    boolean bool = paramContext.getTheme().obtainStyledAttributes(paramXmlResourceParser, R.styleable.ActivityRule, 0, 0).getBoolean(R.styleable.ActivityRule_alwaysExpand, false);
    return new ActivityRule(I.b(), bool);
  }
  
  private final SplitPairFilter parseSplitPairFilter(Context paramContext, XmlResourceParser paramXmlResourceParser)
  {
    Object localObject = paramContext.getTheme().obtainStyledAttributes(paramXmlResourceParser, R.styleable.SplitPairFilter, 0, 0);
    String str = ((TypedArray)localObject).getString(R.styleable.SplitPairFilter_primaryActivityName);
    paramXmlResourceParser = ((TypedArray)localObject).getString(R.styleable.SplitPairFilter_secondaryActivityName);
    localObject = ((TypedArray)localObject).getString(R.styleable.SplitPairFilter_secondaryActivityAction);
    paramContext = paramContext.getApplicationContext().getPackageName();
    Intrinsics.checkNotNullExpressionValue(paramContext, "packageName");
    return new SplitPairFilter(buildClassName(paramContext, str), buildClassName(paramContext, paramXmlResourceParser), (String)localObject);
  }
  
  private final SplitPairRule parseSplitPairRule(Context paramContext, XmlResourceParser paramXmlResourceParser)
  {
    paramContext = paramContext.getTheme().obtainStyledAttributes(paramXmlResourceParser, R.styleable.SplitPairRule, 0, 0);
    float f = paramContext.getFloat(R.styleable.SplitPairRule_splitRatio, 0.0F);
    int i = (int)paramContext.getDimension(R.styleable.SplitPairRule_splitMinWidth, 0.0F);
    int j = (int)paramContext.getDimension(R.styleable.SplitPairRule_splitMinSmallestWidth, 0.0F);
    int k = paramContext.getInt(R.styleable.SplitPairRule_splitLayoutDirection, 3);
    boolean bool1 = paramContext.getBoolean(R.styleable.SplitPairRule_finishPrimaryWithSecondary, false);
    boolean bool2 = paramContext.getBoolean(R.styleable.SplitPairRule_finishSecondaryWithPrimary, true);
    boolean bool3 = paramContext.getBoolean(R.styleable.SplitPairRule_clearTop, false);
    return new SplitPairRule(I.b(), bool1, bool2, bool3, i, j, f, k);
  }
  
  private final SplitPlaceholderRule parseSplitPlaceholderRule(Context paramContext, XmlResourceParser paramXmlResourceParser)
  {
    TypedArray localTypedArray = paramContext.getTheme().obtainStyledAttributes(paramXmlResourceParser, R.styleable.SplitPlaceholderRule, 0, 0);
    paramXmlResourceParser = localTypedArray.getString(R.styleable.SplitPlaceholderRule_placeholderActivityName);
    float f = localTypedArray.getFloat(R.styleable.SplitPlaceholderRule_splitRatio, 0.0F);
    int i = (int)localTypedArray.getDimension(R.styleable.SplitPlaceholderRule_splitMinWidth, 0.0F);
    int j = (int)localTypedArray.getDimension(R.styleable.SplitPlaceholderRule_splitMinSmallestWidth, 0.0F);
    int k = localTypedArray.getInt(R.styleable.SplitPlaceholderRule_splitLayoutDirection, 3);
    paramContext = paramContext.getApplicationContext().getPackageName();
    Intrinsics.checkNotNullExpressionValue(paramContext, "packageName");
    paramXmlResourceParser = buildClassName(paramContext, paramXmlResourceParser);
    paramContext = I.b();
    paramXmlResourceParser = new Intent().setComponent(paramXmlResourceParser);
    Intrinsics.checkNotNullExpressionValue(paramXmlResourceParser, "Intent().setComponent(pl…eholderActivityClassName)");
    return new SplitPlaceholderRule(paramContext, paramXmlResourceParser, i, j, f, k);
  }
  
  private final Set<EmbeddingRule> parseSplitXml(Context paramContext, int paramInt)
  {
    Object localObject1 = paramContext.getResources();
    try
    {
      XmlResourceParser localXmlResourceParser = ((Resources)localObject1).getXml(paramInt);
      Intrinsics.checkNotNullExpressionValue(localXmlResourceParser, "resources.getXml(splitResourceId)");
      HashSet localHashSet = new HashSet();
      int i = localXmlResourceParser.getDepth();
      paramInt = localXmlResourceParser.next();
      Object localObject2 = null;
      Object localObject3 = localObject2;
      Object localObject6;
      for (localObject1 = localObject3; (paramInt != 1) && ((paramInt != 3) || (localXmlResourceParser.getDepth() > i)); localObject1 = localObject6)
      {
        Object localObject4 = localObject2;
        Object localObject5 = localObject3;
        localObject6 = localObject1;
        if (localXmlResourceParser.getEventType() == 2) {
          if (Intrinsics.a("split-config", localXmlResourceParser.getName()))
          {
            localObject4 = localObject2;
            localObject5 = localObject3;
            localObject6 = localObject1;
          }
          else
          {
            Object localObject7 = localXmlResourceParser.getName();
            localObject4 = localObject2;
            localObject5 = localObject3;
            localObject6 = localObject1;
            if (localObject7 != null) {
              switch (((String)localObject7).hashCode())
              {
              default: 
                localObject4 = localObject2;
                localObject5 = localObject3;
                localObject6 = localObject1;
                break;
              case 2050988213: 
                if (!((String)localObject7).equals("SplitPlaceholderRule"))
                {
                  localObject4 = localObject2;
                  localObject5 = localObject3;
                  localObject6 = localObject1;
                }
                else
                {
                  localObject1 = parseSplitPlaceholderRule(paramContext, localXmlResourceParser);
                  localHashSet.add(localObject1);
                  localObject4 = null;
                  localObject3 = localObject4;
                }
                break;
              case 1793077963: 
              case 1579230604: 
              case 520447504: 
              case 511422343: 
                for (;;)
                {
                  localObject5 = localObject3;
                  localObject6 = localObject1;
                  break;
                  if (!((String)localObject7).equals("ActivityRule"))
                  {
                    localObject4 = localObject2;
                    localObject5 = localObject3;
                    localObject6 = localObject1;
                    break;
                  }
                  localObject4 = parseSplitActivityRule(paramContext, localXmlResourceParser);
                  localHashSet.add(localObject4);
                  localObject3 = null;
                  localObject1 = localObject3;
                  for (;;)
                  {
                    localObject5 = localObject3;
                    localObject6 = localObject1;
                    break label614;
                    if (!((String)localObject7).equals("SplitPairFilter"))
                    {
                      localObject4 = localObject2;
                      localObject5 = localObject3;
                      localObject6 = localObject1;
                      break label614;
                    }
                    if (localObject3 != null)
                    {
                      localObject4 = parseSplitPairFilter(paramContext, localXmlResourceParser);
                      localHashSet.remove(localObject3);
                      localObject3 = ((SplitPairRule)localObject3).plus$window_release((SplitPairFilter)localObject4);
                      localHashSet.add(localObject3);
                      localObject4 = localObject2;
                    }
                    for (;;)
                    {
                      localObject5 = localObject3;
                      localObject6 = localObject1;
                      break;
                      throw new IllegalArgumentException("Found orphaned SplitPairFilter outside of SplitPairRule");
                      if (!((String)localObject7).equals("SplitPairRule"))
                      {
                        localObject4 = localObject2;
                        localObject5 = localObject3;
                        localObject6 = localObject1;
                        break;
                      }
                      localObject3 = parseSplitPairRule(paramContext, localXmlResourceParser);
                      localHashSet.add(localObject3);
                      localObject4 = null;
                      localObject1 = localObject4;
                    }
                    if (!((String)localObject7).equals("ActivityFilter"))
                    {
                      localObject4 = localObject2;
                      localObject5 = localObject3;
                      localObject6 = localObject1;
                      break label614;
                    }
                    if ((localObject2 == null) && (localObject1 == null)) {
                      throw new IllegalArgumentException("Found orphaned ActivityFilter");
                    }
                    localObject7 = parseActivityFilter(paramContext, localXmlResourceParser);
                    if (localObject2 == null) {
                      break;
                    }
                    localHashSet.remove(localObject2);
                    localObject4 = ((ActivityRule)localObject2).plus$window_release((ActivityFilter)localObject7);
                    localHashSet.add(localObject4);
                  }
                  localObject4 = localObject2;
                  localObject5 = localObject3;
                  localObject6 = localObject1;
                  if (localObject1 == null) {
                    break;
                  }
                  localHashSet.remove(localObject1);
                  localObject1 = ((SplitPlaceholderRule)localObject1).plus$window_release((ActivityFilter)localObject7);
                  localHashSet.add(localObject1);
                  localObject4 = localObject2;
                }
              }
            }
          }
        }
        label614:
        paramInt = localXmlResourceParser.next();
        localObject2 = localObject4;
        localObject3 = localObject5;
      }
      return localHashSet;
    }
    catch (Resources.NotFoundException paramContext) {}
    return null;
  }
  
  public final Set<EmbeddingRule> parseSplitRules$window_release(@NotNull Context paramContext, int paramInt)
  {
    Intrinsics.checkNotNullParameter(paramContext, "context");
    return parseSplitXml(paramContext, paramInt);
  }
}

/* Location:
 * Qualified Name:     androidx.window.embedding.SplitRuleParser
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */