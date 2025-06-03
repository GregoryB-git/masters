/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.Intent
 *  android.content.res.Resources
 *  android.content.res.Resources$NotFoundException
 *  android.content.res.Resources$Theme
 *  android.content.res.TypedArray
 *  android.content.res.XmlResourceParser
 *  android.util.AttributeSet
 *  java.lang.CharSequence
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.HashSet
 *  java.util.Set
 */
package androidx.window.embedding;

import W5.I;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import androidx.window.R;
import androidx.window.core.ExperimentalWindowApi;
import androidx.window.embedding.ActivityFilter;
import androidx.window.embedding.ActivityRule;
import androidx.window.embedding.EmbeddingRule;
import androidx.window.embedding.SplitPairFilter;
import androidx.window.embedding.SplitPairRule;
import androidx.window.embedding.SplitPlaceholderRule;
import java.util.HashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.i;
import org.jetbrains.annotations.NotNull;

@Metadata
@ExperimentalWindowApi
public final class SplitRuleParser {
    private final ComponentName buildClassName(String string2, CharSequence charSequence) {
        if (charSequence != null && charSequence.length() != 0) {
            String string3 = charSequence.toString();
            if (string3.charAt(0) == '.') {
                return new ComponentName(string2, Intrinsics.i(string2, string3));
            }
            int n8 = i.C(string3, '/', 0, false, 6, null);
            charSequence = string2;
            string2 = string3;
            if (n8 > 0) {
                charSequence = string3.substring(0, n8);
                Intrinsics.checkNotNullExpressionValue((Object)charSequence, "(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
                string2 = string3.substring(n8 + 1);
                Intrinsics.checkNotNullExpressionValue(string2, "(this as java.lang.String).substring(startIndex)");
            }
            if (!Intrinsics.a(string2, "*") && i.C(string2, '.', 0, false, 6, null) < 0) {
                string3 = new StringBuilder((String)charSequence);
                string3.append('.');
                string3.append(string2);
                return new ComponentName((String)charSequence, string3.toString());
            }
            return new ComponentName((String)charSequence, string2);
        }
        throw new IllegalArgumentException("Activity name must not be null");
    }

    private final ActivityFilter parseActivityFilter(Context object, XmlResourceParser object2) {
        Object object3 = object.getTheme().obtainStyledAttributes((AttributeSet)object2, R.styleable.ActivityFilter, 0, 0);
        object2 = object3.getString(R.styleable.ActivityFilter_activityName);
        object3 = object3.getString(R.styleable.ActivityFilter_activityAction);
        object = object.getApplicationContext().getPackageName();
        Intrinsics.checkNotNullExpressionValue(object, "packageName");
        return new ActivityFilter(this.buildClassName((String)object, (CharSequence)object2), (String)object3);
    }

    private final ActivityRule parseSplitActivityRule(Context context, XmlResourceParser xmlResourceParser) {
        boolean bl = context.getTheme().obtainStyledAttributes((AttributeSet)xmlResourceParser, R.styleable.ActivityRule, 0, 0).getBoolean(R.styleable.ActivityRule_alwaysExpand, false);
        return new ActivityRule(I.b(), bl);
    }

    private final SplitPairFilter parseSplitPairFilter(Context object, XmlResourceParser object2) {
        Object object3 = object.getTheme().obtainStyledAttributes((AttributeSet)object2, R.styleable.SplitPairFilter, 0, 0);
        object2 = object3.getString(R.styleable.SplitPairFilter_primaryActivityName);
        String string2 = object3.getString(R.styleable.SplitPairFilter_secondaryActivityName);
        object3 = object3.getString(R.styleable.SplitPairFilter_secondaryActivityAction);
        object = object.getApplicationContext().getPackageName();
        Intrinsics.checkNotNullExpressionValue(object, "packageName");
        return new SplitPairFilter(this.buildClassName((String)object, (CharSequence)object2), this.buildClassName((String)object, string2), (String)object3);
    }

    private final SplitPairRule parseSplitPairRule(Context context, XmlResourceParser xmlResourceParser) {
        context = context.getTheme().obtainStyledAttributes((AttributeSet)xmlResourceParser, R.styleable.SplitPairRule, 0, 0);
        float f8 = context.getFloat(R.styleable.SplitPairRule_splitRatio, 0.0f);
        int n8 = (int)context.getDimension(R.styleable.SplitPairRule_splitMinWidth, 0.0f);
        int n9 = (int)context.getDimension(R.styleable.SplitPairRule_splitMinSmallestWidth, 0.0f);
        int n10 = context.getInt(R.styleable.SplitPairRule_splitLayoutDirection, 3);
        boolean bl = context.getBoolean(R.styleable.SplitPairRule_finishPrimaryWithSecondary, false);
        boolean bl2 = context.getBoolean(R.styleable.SplitPairRule_finishSecondaryWithPrimary, true);
        boolean bl3 = context.getBoolean(R.styleable.SplitPairRule_clearTop, false);
        return new SplitPairRule(I.b(), bl, bl2, bl3, n8, n9, f8, n10);
    }

    private final SplitPlaceholderRule parseSplitPlaceholderRule(Context object, XmlResourceParser object2) {
        TypedArray typedArray = object.getTheme().obtainStyledAttributes((AttributeSet)object2, R.styleable.SplitPlaceholderRule, 0, 0);
        object2 = typedArray.getString(R.styleable.SplitPlaceholderRule_placeholderActivityName);
        float f8 = typedArray.getFloat(R.styleable.SplitPlaceholderRule_splitRatio, 0.0f);
        int n8 = (int)typedArray.getDimension(R.styleable.SplitPlaceholderRule_splitMinWidth, 0.0f);
        int n9 = (int)typedArray.getDimension(R.styleable.SplitPlaceholderRule_splitMinSmallestWidth, 0.0f);
        int n10 = typedArray.getInt(R.styleable.SplitPlaceholderRule_splitLayoutDirection, 3);
        object = object.getApplicationContext().getPackageName();
        Intrinsics.checkNotNullExpressionValue(object, "packageName");
        object2 = this.buildClassName((String)object, (CharSequence)object2);
        object = I.b();
        object2 = new Intent().setComponent((ComponentName)object2);
        Intrinsics.checkNotNullExpressionValue(object2, "Intent().setComponent(pl\u2026eholderActivityClassName)");
        return new SplitPlaceholderRule((Set<ActivityFilter>)object, (Intent)object2, n8, n9, f8, n10);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    private final Set<EmbeddingRule> parseSplitXml(Context var1_1, int var2_3) {
        var4_4 = var1_1.getResources();
        try {}
        catch (Resources.NotFoundException var1_2) {
            return null;
        }
        var10_5 = var4_4.getXml(var2_3);
        Intrinsics.checkNotNullExpressionValue((Object)var10_5, "resources.getXml(splitResourceId)");
        var11_6 = new HashSet();
        var3_7 = var10_5.getDepth();
        var2_3 = var10_5.next();
        var7_8 = null;
        var5_9 = var4_4 = var7_8;
        while (var2_3 != 1) {
            block23 : {
                block25 : {
                    block27 : {
                        block26 : {
                            block24 : {
                                if (var2_3 == 3) {
                                    if (var10_5.getDepth() <= var3_7) return var11_6;
                                }
                                var6_10 = var7_8;
                                var8_11 = var4_4;
                                var9_12 = var5_9;
                                if (var10_5.getEventType() != 2) break block23;
                                if (!Intrinsics.a("split-config", var10_5.getName())) break block24;
                                var6_10 = var7_8;
                                var8_11 = var4_4;
                                var9_12 = var5_9;
                                break block23;
                            }
                            var12_13 = var10_5.getName();
                            var6_10 = var7_8;
                            var8_11 = var4_4;
                            var9_12 = var5_9;
                            if (var12_13 == null) break block23;
                            switch (var12_13.hashCode()) {
                                default: {
                                    var6_10 = var7_8;
                                    var8_11 = var4_4;
                                    var9_12 = var5_9;
                                    ** break;
                                }
                                case 2050988213: {
                                    if (!var12_13.equals((Object)"SplitPlaceholderRule")) {
                                        var6_10 = var7_8;
                                        var8_11 = var4_4;
                                        var9_12 = var5_9;
                                        ** break;
                                    }
                                    var5_9 = this.parseSplitPlaceholderRule(var1_1, var10_5);
                                    var11_6.add(var5_9);
                                    var4_4 = var6_10 = null;
                                    break block25;
                                }
                                case 1793077963: {
                                    if (!var12_13.equals((Object)"ActivityRule")) {
                                        var6_10 = var7_8;
                                        var8_11 = var4_4;
                                        var9_12 = var5_9;
                                        ** break;
                                    }
                                    var6_10 = this.parseSplitActivityRule(var1_1, var10_5);
                                    var11_6.add(var6_10);
                                    var5_9 = var4_4 = null;
                                    break block26;
                                }
                                case 1579230604: {
                                    if (!var12_13.equals((Object)"SplitPairFilter")) {
                                        var6_10 = var7_8;
                                        var8_11 = var4_4;
                                        var9_12 = var5_9;
                                        ** break;
                                    }
                                    if (var4_4 == null) throw new IllegalArgumentException("Found orphaned SplitPairFilter outside of SplitPairRule");
                                    var6_10 = this.parseSplitPairFilter(var1_1, var10_5);
                                    var11_6.remove(var4_4);
                                    var4_4 = var4_4.plus$window_release((SplitPairFilter)var6_10);
                                    var11_6.add(var4_4);
                                    var6_10 = var7_8;
                                    ** GOTO lbl79
                                }
                                case 520447504: {
                                    if (!var12_13.equals((Object)"SplitPairRule")) {
                                        var6_10 = var7_8;
                                        var8_11 = var4_4;
                                        var9_12 = var5_9;
                                        ** break;
                                    }
                                    var4_4 = this.parseSplitPairRule(var1_1, var10_5);
                                    var11_6.add(var4_4);
                                    var5_9 = var6_10 = null;
lbl79: // 2 sources:
                                    var8_11 = var4_4;
                                    var9_12 = var5_9;
                                    ** break;
                                }
                                case 511422343: 
                            }
                            if (!var12_13.equals((Object)"ActivityFilter")) {
                                var6_10 = var7_8;
                                var8_11 = var4_4;
                                var9_12 = var5_9;
                                ** break;
                            }
                            if (var7_8 == null) {
                                if (var5_9 == null) throw new IllegalArgumentException("Found orphaned ActivityFilter");
                            }
                            var12_13 = this.parseActivityFilter(var1_1, var10_5);
                            if (var7_8 == null) break block27;
                            var11_6.remove((Object)var7_8);
                            var6_10 = var7_8.plus$window_release((ActivityFilter)var12_13);
                            var11_6.add(var6_10);
                        }
                        var8_11 = var4_4;
                        var9_12 = var5_9;
                        ** break;
                    }
                    var6_10 = var7_8;
                    var8_11 = var4_4;
                    var9_12 = var5_9;
                    if (var5_9 == null) break block23;
                    var11_6.remove(var5_9);
                    var5_9 = var5_9.plus$window_release((ActivityFilter)var12_13);
                    var11_6.add(var5_9);
                    var6_10 = var7_8;
                }
                var8_11 = var4_4;
                var9_12 = var5_9;
                ** break;
            }
            var2_3 = var10_5.next();
            var7_8 = var6_10;
            var4_4 = var8_11;
            var5_9 = var9_12;
        }
        return var11_6;
    }

    public final Set<EmbeddingRule> parseSplitRules$window_release(@NotNull Context context, int n8) {
        Intrinsics.checkNotNullParameter((Object)context, "context");
        return this.parseSplitXml(context, n8);
    }
}

