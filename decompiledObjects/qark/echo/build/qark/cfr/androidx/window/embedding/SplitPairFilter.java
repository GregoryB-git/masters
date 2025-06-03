/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.ComponentName
 *  android.content.Intent
 *  java.lang.CharSequence
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package androidx.window.embedding;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import androidx.window.core.ExperimentalWindowApi;
import androidx.window.embedding.MatcherUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.i;
import org.jetbrains.annotations.NotNull;

@Metadata
@ExperimentalWindowApi
public final class SplitPairFilter {
    @NotNull
    private final ComponentName primaryActivityName;
    private final String secondaryActivityIntentAction;
    @NotNull
    private final ComponentName secondaryActivityName;

    public SplitPairFilter(@NotNull ComponentName object, @NotNull ComponentName componentName, String string2) {
        Intrinsics.checkNotNullParameter(object, "primaryActivityName");
        Intrinsics.checkNotNullParameter((Object)componentName, "secondaryActivityName");
        this.primaryActivityName = object;
        this.secondaryActivityName = componentName;
        this.secondaryActivityIntentAction = string2;
        string2 = object.getPackageName();
        Intrinsics.checkNotNullExpressionValue(string2, "primaryActivityName.packageName");
        String string3 = object.getClassName();
        Intrinsics.checkNotNullExpressionValue(string3, "primaryActivityName.className");
        String string4 = componentName.getPackageName();
        Intrinsics.checkNotNullExpressionValue(string4, "secondaryActivityName.packageName");
        object = componentName.getClassName();
        Intrinsics.checkNotNullExpressionValue(object, "secondaryActivityName.className");
        int n8 = string2.length();
        int n9 = 1;
        n8 = n8 == 0 || string4.length() == 0 ? 0 : 1;
        if (n8 != 0) {
            n8 = string3.length() == 0 || object.length() == 0 ? 0 : 1;
            if (n8 != 0) {
                n8 = i.v(string2, "*", false, 2, null) && i.D(string2, "*", 0, false, 6, null) != string2.length() - 1 ? 0 : 1;
                if (n8 != 0) {
                    n8 = i.v(string3, "*", false, 2, null) && i.D(string3, "*", 0, false, 6, null) != string3.length() - 1 ? 0 : 1;
                    if (n8 != 0) {
                        n8 = i.v(string4, "*", false, 2, null) && i.D(string4, "*", 0, false, 6, null) != string4.length() - 1 ? 0 : 1;
                        if (n8 != 0) {
                            n8 = n9;
                            if (i.v((CharSequence)object, "*", false, 2, null)) {
                                n8 = i.D((CharSequence)object, "*", 0, false, 6, null) == object.length() - 1 ? n9 : 0;
                            }
                            if (n8 != 0) {
                                return;
                            }
                            throw new IllegalArgumentException("Wildcard in class name is only allowed at the end.".toString());
                        }
                        throw new IllegalArgumentException("Wildcard in package name is only allowed at the end.".toString());
                    }
                    throw new IllegalArgumentException("Wildcard in class name is only allowed at the end.".toString());
                }
                throw new IllegalArgumentException("Wildcard in package name is only allowed at the end.".toString());
            }
            throw new IllegalArgumentException("Activity class name must not be empty.".toString());
        }
        throw new IllegalArgumentException("Package name must not be empty".toString());
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof SplitPairFilter)) {
            return false;
        }
        ComponentName componentName = this.primaryActivityName;
        object = (SplitPairFilter)object;
        if (!Intrinsics.a((Object)componentName, (Object)object.primaryActivityName)) {
            return false;
        }
        if (!Intrinsics.a((Object)this.secondaryActivityName, (Object)object.secondaryActivityName)) {
            return false;
        }
        if (!Intrinsics.a(this.secondaryActivityIntentAction, object.secondaryActivityIntentAction)) {
            return false;
        }
        return true;
    }

    @NotNull
    public final ComponentName getPrimaryActivityName() {
        return this.primaryActivityName;
    }

    public final String getSecondaryActivityIntentAction() {
        return this.secondaryActivityIntentAction;
    }

    @NotNull
    public final ComponentName getSecondaryActivityName() {
        return this.secondaryActivityName;
    }

    public int hashCode() {
        int n8 = this.primaryActivityName.hashCode();
        int n9 = this.secondaryActivityName.hashCode();
        String string2 = this.secondaryActivityIntentAction;
        int n10 = string2 == null ? 0 : string2.hashCode();
        return (n8 * 31 + n9) * 31 + n10;
    }

    public final boolean matchesActivityIntentPair(@NotNull Activity object, @NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(object, "primaryActivity");
        Intrinsics.checkNotNullParameter((Object)intent, "secondaryActivityIntent");
        object = object.getComponentName();
        MatcherUtils matcherUtils = MatcherUtils.INSTANCE;
        boolean bl = matcherUtils.areComponentsMatching$window_release((ComponentName)object, this.primaryActivityName);
        boolean bl2 = false;
        if (!bl) {
            return false;
        }
        if (!matcherUtils.areComponentsMatching$window_release(intent.getComponent(), this.secondaryActivityName)) {
            return false;
        }
        object = this.secondaryActivityIntentAction;
        if (object == null || Intrinsics.a(object, intent.getAction())) {
            bl2 = true;
        }
        return bl2;
    }

    public final boolean matchesActivityPair(@NotNull Activity activity, @NotNull Activity activity2) {
        Intrinsics.checkNotNullParameter((Object)activity, "primaryActivity");
        Intrinsics.checkNotNullParameter((Object)activity2, "secondaryActivity");
        MatcherUtils matcherUtils = MatcherUtils.INSTANCE;
        boolean bl = matcherUtils.areComponentsMatching$window_release(activity.getComponentName(), this.primaryActivityName);
        boolean bl2 = false;
        bl = bl && matcherUtils.areComponentsMatching$window_release(activity2.getComponentName(), this.secondaryActivityName);
        boolean bl3 = bl;
        if (activity2.getIntent() != null) {
            bl3 = bl2;
            if (bl) {
                activity2 = activity2.getIntent();
                Intrinsics.checkNotNullExpressionValue((Object)activity2, "secondaryActivity.intent");
                bl3 = bl2;
                if (this.matchesActivityIntentPair(activity, (Intent)activity2)) {
                    bl3 = true;
                }
            }
        }
        return bl3;
    }

    @NotNull
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SplitPairFilter{primaryActivityName=");
        stringBuilder.append((Object)this.primaryActivityName);
        stringBuilder.append(", secondaryActivityName=");
        stringBuilder.append((Object)this.secondaryActivityName);
        stringBuilder.append(", secondaryActivityAction=");
        stringBuilder.append((Object)this.secondaryActivityIntentAction);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

