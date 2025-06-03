/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  kotlin.Metadata
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.onesignal.outcomes.domain;

import com.onesignal.outcomes.domain.OSOutcomeSourceBody;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@Metadata(d1={"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0005J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003J\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003J\u0006\u0010\f\u001a\u00020\rJ\b\u0010\u000e\u001a\u00020\u000fH\u0016R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t\u00a8\u0006\u0010"}, d2={"Lcom/onesignal/outcomes/domain/OSOutcomeSource;", "", "directBody", "Lcom/onesignal/outcomes/domain/OSOutcomeSourceBody;", "indirectBody", "(Lcom/onesignal/outcomes/domain/OSOutcomeSourceBody;Lcom/onesignal/outcomes/domain/OSOutcomeSourceBody;)V", "getDirectBody", "()Lcom/onesignal/outcomes/domain/OSOutcomeSourceBody;", "setDirectBody", "(Lcom/onesignal/outcomes/domain/OSOutcomeSourceBody;)V", "getIndirectBody", "setIndirectBody", "toJSONObject", "Lorg/json/JSONObject;", "toString", "", "onesignal_release"}, k=1, mv={1, 5, 1}, xi=48)
public final class OSOutcomeSource {
    @Nullable
    private OSOutcomeSourceBody directBody;
    @Nullable
    private OSOutcomeSourceBody indirectBody;

    public OSOutcomeSource(@Nullable OSOutcomeSourceBody oSOutcomeSourceBody, @Nullable OSOutcomeSourceBody oSOutcomeSourceBody2) {
        this.directBody = oSOutcomeSourceBody;
        this.indirectBody = oSOutcomeSourceBody2;
    }

    @Nullable
    public final OSOutcomeSourceBody getDirectBody() {
        return this.directBody;
    }

    @Nullable
    public final OSOutcomeSourceBody getIndirectBody() {
        return this.indirectBody;
    }

    @NotNull
    public final OSOutcomeSource setDirectBody(@Nullable OSOutcomeSourceBody oSOutcomeSourceBody) {
        this.setDirectBody(oSOutcomeSourceBody);
        return this;
    }

    public final void setDirectBody(@Nullable OSOutcomeSourceBody oSOutcomeSourceBody) {
        this.directBody = oSOutcomeSourceBody;
    }

    @NotNull
    public final OSOutcomeSource setIndirectBody(@Nullable OSOutcomeSourceBody oSOutcomeSourceBody) {
        this.setIndirectBody(oSOutcomeSourceBody);
        return this;
    }

    public final void setIndirectBody(@Nullable OSOutcomeSourceBody oSOutcomeSourceBody) {
        this.indirectBody = oSOutcomeSourceBody;
    }

    @NotNull
    public final JSONObject toJSONObject() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        OSOutcomeSourceBody oSOutcomeSourceBody = this.directBody;
        if (oSOutcomeSourceBody != null) {
            jSONObject.put("direct", (Object)oSOutcomeSourceBody.toJSONObject());
        }
        oSOutcomeSourceBody = this.indirectBody;
        if (oSOutcomeSourceBody != null) {
            jSONObject.put("indirect", (Object)oSOutcomeSourceBody.toJSONObject());
        }
        return jSONObject;
    }

    @NotNull
    public String toString() {
        StringBuilder stringBuilder = z2.t("OSOutcomeSource{directBody=");
        stringBuilder.append((Object)this.directBody);
        stringBuilder.append(", indirectBody=");
        stringBuilder.append((Object)this.indirectBody);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

