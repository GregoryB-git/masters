/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Float
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  kotlin.Metadata
 *  kotlin.jvm.internal.DefaultConstructorMarker
 *  kotlin.jvm.internal.Intrinsics
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.onesignal.outcomes.domain;

import com.onesignal.outcomes.domain.OSOutcomeSource;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1={"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0006\u0010\u0017\u001a\u00020\u0018J\u0006\u0010\u0019\u001a\u00020\u001aJ\b\u0010\u001b\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\b\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016\u00a8\u0006\u001c"}, d2={"Lcom/onesignal/outcomes/domain/OSOutcomeEventParams;", "", "outcomeId", "", "outcomeSource", "Lcom/onesignal/outcomes/domain/OSOutcomeSource;", "weight", "", "timestamp", "", "(Ljava/lang/String;Lcom/onesignal/outcomes/domain/OSOutcomeSource;FJ)V", "getOutcomeId", "()Ljava/lang/String;", "getOutcomeSource", "()Lcom/onesignal/outcomes/domain/OSOutcomeSource;", "getTimestamp", "()J", "setTimestamp", "(J)V", "getWeight", "()F", "setWeight", "(F)V", "isUnattributed", "", "toJSONObject", "Lorg/json/JSONObject;", "toString", "onesignal_release"}, k=1, mv={1, 5, 1}, xi=48)
public final class OSOutcomeEventParams {
    @NotNull
    private final String outcomeId;
    @Nullable
    private final OSOutcomeSource outcomeSource;
    private long timestamp;
    private float weight;

    public OSOutcomeEventParams(@NotNull String string2, @Nullable OSOutcomeSource oSOutcomeSource, float f, long l) {
        Intrinsics.checkNotNullParameter((Object)string2, (String)"outcomeId");
        this.outcomeId = string2;
        this.outcomeSource = oSOutcomeSource;
        this.weight = f;
        this.timestamp = l;
    }

    public /* synthetic */ OSOutcomeEventParams(String string2, OSOutcomeSource oSOutcomeSource, float f, long l, int n, DefaultConstructorMarker defaultConstructorMarker) {
        if ((n & 8) != 0) {
            l = 0L;
        }
        this(string2, oSOutcomeSource, f, l);
    }

    @NotNull
    public final String getOutcomeId() {
        return this.outcomeId;
    }

    @Nullable
    public final OSOutcomeSource getOutcomeSource() {
        return this.outcomeSource;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public final float getWeight() {
        return this.weight;
    }

    public final boolean isUnattributed() {
        OSOutcomeSource oSOutcomeSource = this.outcomeSource;
        boolean bl = oSOutcomeSource == null || oSOutcomeSource.getDirectBody() == null && this.outcomeSource.getIndirectBody() == null;
        return bl;
    }

    public final void setTimestamp(long l) {
        this.timestamp = l;
    }

    public final void setWeight(float f) {
        this.weight = f;
    }

    @NotNull
    public final JSONObject toJSONObject() throws JSONException {
        long l;
        JSONObject jSONObject = new JSONObject().put("id", (Object)this.outcomeId);
        OSOutcomeSource oSOutcomeSource = this.outcomeSource;
        if (oSOutcomeSource != null) {
            jSONObject.put("sources", (Object)oSOutcomeSource.toJSONObject());
        }
        float f = this.weight;
        if (f > 0.0f) {
            jSONObject.put("weight", (Object)Float.valueOf((float)f));
        }
        if ((l = this.timestamp) > 0L) {
            jSONObject.put("timestamp", l);
        }
        Intrinsics.checkNotNullExpressionValue((Object)jSONObject, (String)"json");
        return jSONObject;
    }

    @NotNull
    public String toString() {
        StringBuilder stringBuilder = z2.t("OSOutcomeEventParams{outcomeId='");
        stringBuilder.append(this.outcomeId);
        stringBuilder.append("', outcomeSource=");
        stringBuilder.append((Object)this.outcomeSource);
        stringBuilder.append(", weight=");
        stringBuilder.append(this.weight);
        stringBuilder.append(", timestamp=");
        return a.o(stringBuilder, this.timestamp, '}');
    }
}

