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
public final class ActivityFilter {
    @NotNull
    private final ComponentName componentName;
    private final String intentAction;

    public ActivityFilter(@NotNull ComponentName object, String string2) {
        Intrinsics.checkNotNullParameter(object, "componentName");
        this.componentName = object;
        this.intentAction = string2;
        string2 = object.getPackageName();
        Intrinsics.checkNotNullExpressionValue(string2, "componentName.packageName");
        object = object.getClassName();
        Intrinsics.checkNotNullExpressionValue(object, "componentName.className");
        int n8 = string2.length();
        int n9 = 1;
        n8 = n8 > 0 ? 1 : 0;
        if (n8 != 0) {
            n8 = object.length() > 0 ? 1 : 0;
            if (n8 != 0) {
                n8 = i.v(string2, "*", false, 2, null) && i.D(string2, "*", 0, false, 6, null) != string2.length() - 1 ? 0 : 1;
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
            throw new IllegalArgumentException("Activity class name must not be empty.".toString());
        }
        throw new IllegalArgumentException("Package name must not be empty".toString());
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof ActivityFilter)) {
            return false;
        }
        ComponentName componentName = this.componentName;
        object = (ActivityFilter)object;
        if (!Intrinsics.a((Object)componentName, (Object)object.componentName)) {
            return false;
        }
        if (!Intrinsics.a(this.intentAction, object.intentAction)) {
            return false;
        }
        return true;
    }

    @NotNull
    public final ComponentName getComponentName() {
        return this.componentName;
    }

    public final String getIntentAction() {
        return this.intentAction;
    }

    public int hashCode() {
        int n8 = this.componentName.hashCode();
        String string2 = this.intentAction;
        int n9 = string2 == null ? 0 : string2.hashCode();
        return n8 * 31 + n9;
    }

    public final boolean matchesActivity(@NotNull Activity object) {
        block2 : {
            block3 : {
                Intrinsics.checkNotNullParameter(object, "activity");
                if (!MatcherUtils.INSTANCE.areActivityOrIntentComponentsMatching$window_release((Activity)object, this.componentName)) break block2;
                String string2 = this.intentAction;
                if (string2 == null) break block3;
                object = (object = object.getIntent()) == null ? null : object.getAction();
                if (!Intrinsics.a(string2, object)) break block2;
            }
            return true;
        }
        return false;
    }

    public final boolean matchesIntent(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter((Object)intent, "intent");
        boolean bl = MatcherUtils.INSTANCE.areComponentsMatching$window_release(intent.getComponent(), this.componentName);
        boolean bl2 = false;
        if (!bl) {
            return false;
        }
        String string2 = this.intentAction;
        if (string2 == null || Intrinsics.a(string2, intent.getAction())) {
            bl2 = true;
        }
        return bl2;
    }

    @NotNull
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ActivityFilter(componentName=");
        stringBuilder.append((Object)this.componentName);
        stringBuilder.append(", intentAction=");
        stringBuilder.append((Object)this.intentAction);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

