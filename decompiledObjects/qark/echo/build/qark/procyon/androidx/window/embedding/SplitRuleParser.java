// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package androidx.window.embedding;

import org.xmlpull.v1.XmlPullParser;
import org.jetbrains.annotations.NotNull;
import android.content.res.Resources;
import android.content.res.Resources$NotFoundException;
import java.util.HashSet;
import android.content.Intent;
import java.util.Set;
import W5.I;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.window.R;
import android.content.res.XmlResourceParser;
import android.content.Context;
import kotlin.text.i;
import kotlin.jvm.internal.Intrinsics;
import android.content.ComponentName;
import androidx.window.core.ExperimentalWindowApi;
import kotlin.Metadata;

@Metadata
@ExperimentalWindowApi
public final class SplitRuleParser
{
    private final ComponentName buildClassName(String substring, final CharSequence charSequence) {
        if (charSequence == null || charSequence.length() == 0) {
            throw new IllegalArgumentException("Activity name must not be null");
        }
        final String string = charSequence.toString();
        if (string.charAt(0) == '.') {
            return new ComponentName(substring, Intrinsics.i(substring, string));
        }
        final int c = i.C(string, '/', 0, false, 6, null);
        String substring2 = substring;
        substring = string;
        if (c > 0) {
            substring2 = string.substring(0, c);
            Intrinsics.checkNotNullExpressionValue(substring2, "(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
            substring = string.substring(c + 1);
            Intrinsics.checkNotNullExpressionValue(substring, "(this as java.lang.String).substring(startIndex)");
        }
        if (!Intrinsics.a(substring, "*") && i.C(substring, '.', 0, false, 6, null) < 0) {
            final StringBuilder sb = new StringBuilder(substring2);
            sb.append('.');
            sb.append(substring);
            return new ComponentName(substring2, sb.toString());
        }
        return new ComponentName(substring2, substring);
    }
    
    private final ActivityFilter parseActivityFilter(final Context context, final XmlResourceParser xmlResourceParser) {
        final TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes((AttributeSet)xmlResourceParser, R.styleable.ActivityFilter, 0, 0);
        final String string = obtainStyledAttributes.getString(R.styleable.ActivityFilter_activityName);
        final String string2 = obtainStyledAttributes.getString(R.styleable.ActivityFilter_activityAction);
        final String packageName = context.getApplicationContext().getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "packageName");
        return new ActivityFilter(this.buildClassName(packageName, string), string2);
    }
    
    private final ActivityRule parseSplitActivityRule(final Context context, final XmlResourceParser xmlResourceParser) {
        return new ActivityRule(I.b(), context.getTheme().obtainStyledAttributes((AttributeSet)xmlResourceParser, R.styleable.ActivityRule, 0, 0).getBoolean(R.styleable.ActivityRule_alwaysExpand, false));
    }
    
    private final SplitPairFilter parseSplitPairFilter(final Context context, final XmlResourceParser xmlResourceParser) {
        final TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes((AttributeSet)xmlResourceParser, R.styleable.SplitPairFilter, 0, 0);
        final String string = obtainStyledAttributes.getString(R.styleable.SplitPairFilter_primaryActivityName);
        final String string2 = obtainStyledAttributes.getString(R.styleable.SplitPairFilter_secondaryActivityName);
        final String string3 = obtainStyledAttributes.getString(R.styleable.SplitPairFilter_secondaryActivityAction);
        final String packageName = context.getApplicationContext().getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "packageName");
        return new SplitPairFilter(this.buildClassName(packageName, string), this.buildClassName(packageName, string2), string3);
    }
    
    private final SplitPairRule parseSplitPairRule(final Context context, final XmlResourceParser xmlResourceParser) {
        final TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes((AttributeSet)xmlResourceParser, R.styleable.SplitPairRule, 0, 0);
        return new SplitPairRule(I.b(), obtainStyledAttributes.getBoolean(R.styleable.SplitPairRule_finishPrimaryWithSecondary, false), obtainStyledAttributes.getBoolean(R.styleable.SplitPairRule_finishSecondaryWithPrimary, true), obtainStyledAttributes.getBoolean(R.styleable.SplitPairRule_clearTop, false), (int)obtainStyledAttributes.getDimension(R.styleable.SplitPairRule_splitMinWidth, 0.0f), (int)obtainStyledAttributes.getDimension(R.styleable.SplitPairRule_splitMinSmallestWidth, 0.0f), obtainStyledAttributes.getFloat(R.styleable.SplitPairRule_splitRatio, 0.0f), obtainStyledAttributes.getInt(R.styleable.SplitPairRule_splitLayoutDirection, 3));
    }
    
    private final SplitPlaceholderRule parseSplitPlaceholderRule(final Context context, final XmlResourceParser xmlResourceParser) {
        final TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes((AttributeSet)xmlResourceParser, R.styleable.SplitPlaceholderRule, 0, 0);
        final String string = obtainStyledAttributes.getString(R.styleable.SplitPlaceholderRule_placeholderActivityName);
        final float float1 = obtainStyledAttributes.getFloat(R.styleable.SplitPlaceholderRule_splitRatio, 0.0f);
        final int n = (int)obtainStyledAttributes.getDimension(R.styleable.SplitPlaceholderRule_splitMinWidth, 0.0f);
        final int n2 = (int)obtainStyledAttributes.getDimension(R.styleable.SplitPlaceholderRule_splitMinSmallestWidth, 0.0f);
        final int int1 = obtainStyledAttributes.getInt(R.styleable.SplitPlaceholderRule_splitLayoutDirection, 3);
        final String packageName = context.getApplicationContext().getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "packageName");
        final ComponentName buildClassName = this.buildClassName(packageName, string);
        final Set b = I.b();
        final Intent setComponent = new Intent().setComponent(buildClassName);
        Intrinsics.checkNotNullExpressionValue(setComponent, "Intent().setComponent(pl\u2026eholderActivityClassName)");
        return new SplitPlaceholderRule(b, setComponent, n, n2, float1, int1);
    }
    
    private final Set<EmbeddingRule> parseSplitXml(final Context context, int n) {
        final Resources resources = context.getResources();
        try {
            final XmlResourceParser xml = resources.getXml(n);
            Intrinsics.checkNotNullExpressionValue(xml, "resources.getXml(splitResourceId)");
            final HashSet<EmbeddingRule> set = new HashSet<EmbeddingRule>();
            final int depth = ((XmlPullParser)xml).getDepth();
            n = ((XmlPullParser)xml).next();
            SplitRule o = null;
            SplitRule o3;
            SplitRule o2 = o3 = o;
            while (n != 1 && (n != 3 || ((XmlPullParser)xml).getDepth() > depth)) {
                EmbeddingRule embeddingRule = o;
                SplitRule splitRule = o2;
                SplitPlaceholderRule splitPlaceholderRule = (SplitPlaceholderRule)o3;
                Label_0638: {
                    if (((XmlPullParser)xml).getEventType() == 2) {
                        if (Intrinsics.a("split-config", ((XmlPullParser)xml).getName())) {
                            embeddingRule = o;
                            splitRule = o2;
                            splitPlaceholderRule = (SplitPlaceholderRule)o3;
                        }
                        else {
                            final String name = ((XmlPullParser)xml).getName();
                            embeddingRule = o;
                            splitRule = o2;
                            splitPlaceholderRule = (SplitPlaceholderRule)o3;
                            if (name != null) {
                                SplitPairRule splitPairRule = null;
                                Label_0422: {
                                    Label_0342: {
                                        SplitPlaceholderRule splitPlaceholderRule2 = null;
                                        switch (name.hashCode()) {
                                            default: {
                                                embeddingRule = o;
                                                splitRule = o2;
                                                splitPlaceholderRule = (SplitPlaceholderRule)o3;
                                                break Label_0638;
                                            }
                                            case 2050988213: {
                                                if (!name.equals("SplitPlaceholderRule")) {
                                                    embeddingRule = o;
                                                    splitRule = o2;
                                                    splitPlaceholderRule = (SplitPlaceholderRule)o3;
                                                    break Label_0638;
                                                }
                                                splitPlaceholderRule2 = this.parseSplitPlaceholderRule(context, xml);
                                                set.add(splitPlaceholderRule2);
                                                embeddingRule = (o2 = null);
                                                break;
                                            }
                                            case 1793077963: {
                                                if (!name.equals("ActivityRule")) {
                                                    embeddingRule = o;
                                                    splitRule = o2;
                                                    splitPlaceholderRule = (SplitPlaceholderRule)o3;
                                                    break Label_0638;
                                                }
                                                embeddingRule = this.parseSplitActivityRule(context, xml);
                                                set.add(embeddingRule);
                                                o2 = (o3 = null);
                                                break Label_0342;
                                            }
                                            case 1579230604: {
                                                if (!name.equals("SplitPairFilter")) {
                                                    embeddingRule = o;
                                                    splitRule = o2;
                                                    splitPlaceholderRule = (SplitPlaceholderRule)o3;
                                                    break Label_0638;
                                                }
                                                if (o2 != null) {
                                                    final SplitPairFilter splitPairFilter = this.parseSplitPairFilter(context, xml);
                                                    set.remove(o2);
                                                    splitPairRule = ((SplitPairRule)o2).plus$window_release(splitPairFilter);
                                                    set.add(splitPairRule);
                                                    embeddingRule = o;
                                                    break Label_0422;
                                                }
                                                throw new IllegalArgumentException("Found orphaned SplitPairFilter outside of SplitPairRule");
                                            }
                                            case 520447504: {
                                                if (!name.equals("SplitPairRule")) {
                                                    embeddingRule = o;
                                                    splitRule = o2;
                                                    splitPlaceholderRule = (SplitPlaceholderRule)o3;
                                                    break Label_0638;
                                                }
                                                splitPairRule = this.parseSplitPairRule(context, xml);
                                                set.add(splitPairRule);
                                                embeddingRule = (o3 = null);
                                                break Label_0422;
                                            }
                                            case 511422343: {
                                                if (!name.equals("ActivityFilter")) {
                                                    embeddingRule = o;
                                                    splitRule = o2;
                                                    splitPlaceholderRule = (SplitPlaceholderRule)o3;
                                                    break Label_0638;
                                                }
                                                if (o == null && o3 == null) {
                                                    throw new IllegalArgumentException("Found orphaned ActivityFilter");
                                                }
                                                final ActivityFilter activityFilter = this.parseActivityFilter(context, xml);
                                                if (o != null) {
                                                    set.remove(o);
                                                    embeddingRule = ((ActivityRule)o).plus$window_release(activityFilter);
                                                    set.add(embeddingRule);
                                                    break Label_0342;
                                                }
                                                embeddingRule = o;
                                                splitRule = o2;
                                                if ((splitPlaceholderRule = (SplitPlaceholderRule)o3) != null) {
                                                    set.remove(o3);
                                                    splitPlaceholderRule2 = ((SplitPlaceholderRule)o3).plus$window_release(activityFilter);
                                                    set.add(splitPlaceholderRule2);
                                                    embeddingRule = o;
                                                    break;
                                                }
                                                break Label_0638;
                                            }
                                        }
                                        splitRule = o2;
                                        splitPlaceholderRule = splitPlaceholderRule2;
                                        break Label_0638;
                                    }
                                    splitRule = o2;
                                    splitPlaceholderRule = (SplitPlaceholderRule)o3;
                                    break Label_0638;
                                }
                                splitRule = splitPairRule;
                                splitPlaceholderRule = (SplitPlaceholderRule)o3;
                            }
                        }
                    }
                }
                n = ((XmlPullParser)xml).next();
                o = (SplitRule)embeddingRule;
                o2 = splitRule;
                o3 = splitPlaceholderRule;
            }
            return set;
        }
        catch (Resources$NotFoundException ex) {
            return null;
        }
    }
    
    public final Set<EmbeddingRule> parseSplitRules$window_release(@NotNull final Context context, final int n) {
        Intrinsics.checkNotNullParameter(context, "context");
        return this.parseSplitXml(context, n);
    }
}
