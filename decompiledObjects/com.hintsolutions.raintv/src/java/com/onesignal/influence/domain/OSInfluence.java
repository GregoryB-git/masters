/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.onesignal.influence.domain;

import com.onesignal.influence.domain.OSInfluenceChannel;
import com.onesignal.influence.domain.OSInfluenceType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1={"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B!\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0002\u0010\u000bJ\u0006\u0010\u001a\u001a\u00020\u0000J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\u0006\u0010 \u001a\u00020\u0003J\b\u0010!\u001a\u00020\u0003H\u0016R\u0013\u0010\f\u001a\u0004\u0018\u00010\u00038F\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0006@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019\u00a8\u0006\""}, d2={"Lcom/onesignal/influence/domain/OSInfluence;", "", "jsonString", "", "(Ljava/lang/String;)V", "influenceChannel", "Lcom/onesignal/influence/domain/OSInfluenceChannel;", "influenceType", "Lcom/onesignal/influence/domain/OSInfluenceType;", "ids", "Lorg/json/JSONArray;", "(Lcom/onesignal/influence/domain/OSInfluenceChannel;Lcom/onesignal/influence/domain/OSInfluenceType;Lorg/json/JSONArray;)V", "directId", "getDirectId", "()Ljava/lang/String;", "getIds", "()Lorg/json/JSONArray;", "setIds", "(Lorg/json/JSONArray;)V", "<set-?>", "getInfluenceChannel", "()Lcom/onesignal/influence/domain/OSInfluenceChannel;", "getInfluenceType", "()Lcom/onesignal/influence/domain/OSInfluenceType;", "setInfluenceType", "(Lcom/onesignal/influence/domain/OSInfluenceType;)V", "copy", "equals", "", "o", "hashCode", "", "toJSONString", "toString", "onesignal_release"}, k=1, mv={1, 5, 1}, xi=48)
public final class OSInfluence {
    @Nullable
    private JSONArray ids;
    @NotNull
    private OSInfluenceChannel influenceChannel;
    @NotNull
    private OSInfluenceType influenceType;

    public OSInfluence(@NotNull OSInfluenceChannel oSInfluenceChannel, @NotNull OSInfluenceType oSInfluenceType, @Nullable JSONArray jSONArray) {
        Intrinsics.checkNotNullParameter((Object)((Object)oSInfluenceChannel), (String)"influenceChannel");
        Intrinsics.checkNotNullParameter((Object)((Object)oSInfluenceType), (String)"influenceType");
        this.influenceChannel = oSInfluenceChannel;
        this.influenceType = oSInfluenceType;
        this.ids = jSONArray;
    }

    public OSInfluence(@NotNull String string2) throws JSONException {
        Intrinsics.checkNotNullParameter((Object)string2, (String)"jsonString");
        Object object = new JSONObject(string2);
        String string3 = object.getString("influence_channel");
        string2 = object.getString("influence_type");
        object = object.getString("influence_ids");
        this.influenceChannel = OSInfluenceChannel.Companion.fromString(string3);
        this.influenceType = OSInfluenceType.Companion.fromString(string2);
        Intrinsics.checkNotNullExpressionValue((Object)object, (String)"ids");
        boolean bl = object.length() == 0;
        string2 = bl ? null : new JSONArray((String)object);
        this.ids = string2;
    }

    @NotNull
    public final OSInfluence copy() {
        return new OSInfluence(this.influenceChannel, this.influenceType, this.ids);
    }

    public boolean equals(@Nullable Object object) {
        boolean bl = true;
        if (this == object) {
            return true;
        }
        if (object != null && Intrinsics.areEqual(OSInfluence.class, (Object)object.getClass())) {
            object = (OSInfluence)object;
            if (this.influenceChannel != ((OSInfluence)object).influenceChannel || this.influenceType != ((OSInfluence)object).influenceType) {
                bl = false;
            }
            return bl;
        }
        return false;
    }

    @Nullable
    public final String getDirectId() throws JSONException {
        JSONArray jSONArray = this.ids;
        String string2 = null;
        if (jSONArray != null && jSONArray.length() > 0) {
            string2 = jSONArray.getString(0);
        }
        return string2;
    }

    @Nullable
    public final JSONArray getIds() {
        return this.ids;
    }

    @NotNull
    public final OSInfluenceChannel getInfluenceChannel() {
        return this.influenceChannel;
    }

    @NotNull
    public final OSInfluenceType getInfluenceType() {
        return this.influenceType;
    }

    public int hashCode() {
        int n = this.influenceChannel.hashCode();
        return this.influenceType.hashCode() + n * 31;
    }

    public final void setIds(@Nullable JSONArray jSONArray) {
        this.ids = jSONArray;
    }

    public final void setInfluenceType(@NotNull OSInfluenceType oSInfluenceType) {
        Intrinsics.checkNotNullParameter((Object)((Object)oSInfluenceType), (String)"<set-?>");
        this.influenceType = oSInfluenceType;
    }

    @NotNull
    public final String toJSONString() throws JSONException {
        JSONObject jSONObject = new JSONObject().put("influence_channel", (Object)this.influenceChannel.toString()).put("influence_type", (Object)this.influenceType.toString());
        Object object = this.ids;
        object = object != null ? String.valueOf((Object)object) : "";
        object = jSONObject.put("influence_ids", object).toString();
        Intrinsics.checkNotNullExpressionValue((Object)object, (String)"JSONObject()\n        .pu\u2026e \"\")\n        .toString()");
        return object;
    }

    @NotNull
    public String toString() {
        StringBuilder stringBuilder = z2.t("SessionInfluence{influenceChannel=");
        stringBuilder.append((Object)this.influenceChannel);
        stringBuilder.append(", influenceType=");
        stringBuilder.append((Object)this.influenceType);
        stringBuilder.append(", ids=");
        stringBuilder.append((Object)this.ids);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

