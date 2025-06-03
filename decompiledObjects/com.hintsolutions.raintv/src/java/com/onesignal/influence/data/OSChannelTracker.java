/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
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
package com.onesignal.influence.data;

import com.onesignal.OSLogger;
import com.onesignal.OSTime;
import com.onesignal.influence.data.OSInfluenceDataRepository;
import com.onesignal.influence.domain.OSInfluence;
import com.onesignal.influence.domain.OSInfluenceChannel;
import com.onesignal.influence.domain.OSInfluenceType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1={"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b&\u0018\u00002\u00020\u0001B\u001f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0018\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020\u0012H&J\b\u0010A\u001a\u00020=H&J\u0013\u0010B\u001a\u0002002\b\u0010C\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\u0012\u0010D\u001a\u00020$2\b\u0010E\u001a\u0004\u0018\u00010\u001aH&J\b\u0010F\u001a\u00020\nH\u0016J\b\u0010G\u001a\u00020=H&J\u0006\u0010H\u001a\u00020=J\u0010\u0010I\u001a\u00020=2\u0006\u0010J\u001a\u00020$H&J\u0010\u0010K\u001a\u00020=2\b\u0010E\u001a\u0004\u0018\u00010\u001aJ\b\u0010L\u001a\u00020\u001aH\u0016R\u0012\u0010\t\u001a\u00020\nX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0012\u0010\r\u001a\u00020\u000eX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u00128F\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0002\u001a\u00020\u0003X\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0012\u0010\u001f\u001a\u00020\u001aX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b \u0010\u001cR\u0012\u0010!\u001a\u00020\nX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\"\u0010\fR\u001c\u0010#\u001a\u0004\u0018\u00010$X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001c\u0010)\u001a\u0004\u0018\u00010*X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u0014\u0010/\u001a\u0002008BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b/\u00101R\u0014\u00102\u001a\u0002008BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b2\u00101R\u0014\u00103\u001a\u0002008BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b3\u00101R\u0014\u00104\u001a\u00020$8fX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b5\u0010&R\u0011\u00106\u001a\u00020$8F\u00a2\u0006\u0006\u001a\u0004\b7\u0010&R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006M"}, d2={"Lcom/onesignal/influence/data/OSChannelTracker;", "", "dataRepository", "Lcom/onesignal/influence/data/OSInfluenceDataRepository;", "logger", "Lcom/onesignal/OSLogger;", "timeProvider", "Lcom/onesignal/OSTime;", "(Lcom/onesignal/influence/data/OSInfluenceDataRepository;Lcom/onesignal/OSLogger;Lcom/onesignal/OSTime;)V", "channelLimit", "", "getChannelLimit", "()I", "channelType", "Lcom/onesignal/influence/domain/OSInfluenceChannel;", "getChannelType", "()Lcom/onesignal/influence/domain/OSInfluenceChannel;", "currentSessionInfluence", "Lcom/onesignal/influence/domain/OSInfluence;", "getCurrentSessionInfluence", "()Lcom/onesignal/influence/domain/OSInfluence;", "getDataRepository", "()Lcom/onesignal/influence/data/OSInfluenceDataRepository;", "setDataRepository", "(Lcom/onesignal/influence/data/OSInfluenceDataRepository;)V", "directId", "", "getDirectId", "()Ljava/lang/String;", "setDirectId", "(Ljava/lang/String;)V", "idTag", "getIdTag", "indirectAttributionWindow", "getIndirectAttributionWindow", "indirectIds", "Lorg/json/JSONArray;", "getIndirectIds", "()Lorg/json/JSONArray;", "setIndirectIds", "(Lorg/json/JSONArray;)V", "influenceType", "Lcom/onesignal/influence/domain/OSInfluenceType;", "getInfluenceType", "()Lcom/onesignal/influence/domain/OSInfluenceType;", "setInfluenceType", "(Lcom/onesignal/influence/domain/OSInfluenceType;)V", "isDirectSessionEnabled", "", "()Z", "isIndirectSessionEnabled", "isUnattributedSessionEnabled", "lastChannelObjects", "getLastChannelObjects", "lastReceivedIds", "getLastReceivedIds", "getLogger", "()Lcom/onesignal/OSLogger;", "setLogger", "(Lcom/onesignal/OSLogger;)V", "addSessionData", "", "jsonObject", "Lorg/json/JSONObject;", "influence", "cacheState", "equals", "other", "getLastChannelObjectsReceivedByNewId", "id", "hashCode", "initInfluencedTypeFromCache", "resetAndInitInfluence", "saveChannelObjects", "channelObjects", "saveLastId", "toString", "onesignal_release"}, k=1, mv={1, 5, 1}, xi=48)
public abstract class OSChannelTracker {
    @NotNull
    private OSInfluenceDataRepository dataRepository;
    @Nullable
    private String directId;
    @Nullable
    private JSONArray indirectIds;
    @Nullable
    private OSInfluenceType influenceType;
    @NotNull
    private OSLogger logger;
    @NotNull
    private OSTime timeProvider;

    public OSChannelTracker(@NotNull OSInfluenceDataRepository oSInfluenceDataRepository, @NotNull OSLogger oSLogger, @NotNull OSTime oSTime) {
        Intrinsics.checkNotNullParameter((Object)oSInfluenceDataRepository, (String)"dataRepository");
        Intrinsics.checkNotNullParameter((Object)oSLogger, (String)"logger");
        Intrinsics.checkNotNullParameter((Object)oSTime, (String)"timeProvider");
        this.dataRepository = oSInfluenceDataRepository;
        this.logger = oSLogger;
        this.timeProvider = oSTime;
    }

    private final boolean isDirectSessionEnabled() {
        return this.dataRepository.isDirectInfluenceEnabled();
    }

    private final boolean isIndirectSessionEnabled() {
        return this.dataRepository.isIndirectInfluenceEnabled();
    }

    private final boolean isUnattributedSessionEnabled() {
        return this.dataRepository.isUnattributedInfluenceEnabled();
    }

    public abstract void addSessionData(@NotNull JSONObject var1, @NotNull OSInfluence var2);

    public abstract void cacheState();

    public boolean equals(@Nullable Object object) {
        boolean bl = true;
        if (this == object) {
            return true;
        }
        if (object != null && Intrinsics.areEqual((Object)this.getClass(), (Object)object.getClass())) {
            object = (OSChannelTracker)object;
            if (this.influenceType != ((OSChannelTracker)object).influenceType || !Intrinsics.areEqual((Object)((OSChannelTracker)object).getIdTag(), (Object)this.getIdTag())) {
                bl = false;
            }
            return bl;
        }
        return false;
    }

    public abstract int getChannelLimit();

    @NotNull
    public abstract OSInfluenceChannel getChannelType();

    @NotNull
    public final OSInfluence getCurrentSessionInfluence() {
        Enum enum_ = this.getChannelType();
        Enum enum_2 = OSInfluenceType.DISABLED;
        OSInfluence oSInfluence = new OSInfluence((OSInfluenceChannel)enum_, (OSInfluenceType)enum_2, null);
        if (this.influenceType == null) {
            this.initInfluencedTypeFromCache();
        }
        if ((enum_ = this.influenceType) != null) {
            enum_2 = enum_;
        }
        if (((OSInfluenceType)enum_2).isDirect()) {
            if (this.isDirectSessionEnabled()) {
                oSInfluence.setIds(new JSONArray().put((Object)this.getDirectId()));
                oSInfluence.setInfluenceType(OSInfluenceType.DIRECT);
            }
        } else if (((OSInfluenceType)enum_2).isIndirect()) {
            if (this.isIndirectSessionEnabled()) {
                oSInfluence.setIds(this.getIndirectIds());
                oSInfluence.setInfluenceType(OSInfluenceType.INDIRECT);
            }
        } else if (this.isUnattributedSessionEnabled()) {
            oSInfluence.setInfluenceType(OSInfluenceType.UNATTRIBUTED);
        }
        return oSInfluence;
    }

    @NotNull
    public final OSInfluenceDataRepository getDataRepository() {
        return this.dataRepository;
    }

    @Nullable
    public final String getDirectId() {
        return this.directId;
    }

    @NotNull
    public abstract String getIdTag();

    public abstract int getIndirectAttributionWindow();

    @Nullable
    public final JSONArray getIndirectIds() {
        return this.indirectIds;
    }

    @Nullable
    public final OSInfluenceType getInfluenceType() {
        return this.influenceType;
    }

    @NotNull
    public abstract JSONArray getLastChannelObjects() throws JSONException;

    @NotNull
    public abstract JSONArray getLastChannelObjectsReceivedByNewId(@Nullable String var1);

    @NotNull
    public final JSONArray getLastReceivedIds() {
        JSONArray jSONArray;
        block7: {
            int n;
            jSONArray = new JSONArray();
            JSONArray jSONArray2 = this.getLastChannelObjects();
            this.logger.debug(Intrinsics.stringPlus((String)"OneSignal ChannelTracker getLastReceivedIds lastChannelObjectReceived: ", (Object)jSONArray2));
            long l = this.getIndirectAttributionWindow() * 60;
            long l2 = this.timeProvider.getCurrentTimeMillis();
            int n2 = 0;
            try {
                n = jSONArray2.length();
                if (n <= 0) break block7;
            }
            catch (JSONException jSONException) {
                this.logger.error("Generating tracker getLastReceivedIds JSONObject ", jSONException);
            }
            while (true) {
                int n3 = n2 + 1;
                JSONObject jSONObject = jSONArray2.getJSONObject(n2);
                if (l2 - jSONObject.getLong("time") <= l * 1000L) {
                    jSONArray.put((Object)jSONObject.getString(this.getIdTag()));
                }
                if (n3 < n) {
                    n2 = n3;
                    continue;
                }
                break;
            }
        }
        return jSONArray;
    }

    @NotNull
    public final OSLogger getLogger() {
        return this.logger;
    }

    public int hashCode() {
        OSInfluenceType oSInfluenceType = this.influenceType;
        int n = oSInfluenceType != null ? oSInfluenceType.hashCode() : 0;
        return this.getIdTag().hashCode() + n * 31;
    }

    public abstract void initInfluencedTypeFromCache();

    public final void resetAndInitInfluence() {
        this.directId = null;
        Object object = this.getLastReceivedIds();
        this.indirectIds = object;
        int n = object == null ? 0 : object.length();
        object = n > 0 ? OSInfluenceType.INDIRECT : OSInfluenceType.UNATTRIBUTED;
        this.influenceType = object;
        this.cacheState();
        object = this.logger;
        StringBuilder stringBuilder = z2.t("OneSignal OSChannelTracker resetAndInitInfluence: ");
        stringBuilder.append(this.getIdTag());
        stringBuilder.append(" finish with influenceType: ");
        stringBuilder.append((Object)this.influenceType);
        object.debug(stringBuilder.toString());
    }

    public abstract void saveChannelObjects(@NotNull JSONArray var1);

    public final void saveLastId(@Nullable String string2) {
        int n;
        OSLogger oSLogger = this.logger;
        Object object = z2.t("OneSignal OSChannelTracker for: ");
        object.append(this.getIdTag());
        object.append(" saveLastId: ");
        object.append((Object)string2);
        oSLogger.debug(object.toString());
        if (string2 != null && (n = string2.length() == 0 ? 1 : 0) == 0) {
            object = this.getLastChannelObjectsReceivedByNewId(string2);
            Object object2 = this.logger;
            oSLogger = z2.t("OneSignal OSChannelTracker for: ");
            oSLogger.append(this.getIdTag());
            oSLogger.append(" saveLastId with lastChannelObjectsReceived: ");
            oSLogger.append(object);
            object2.debug(oSLogger.toString());
            try {
                object2 = this.timeProvider;
                oSLogger = new JSONObject();
                object.put((Object)oSLogger.put(this.getIdTag(), string2).put("time", object2.getCurrentTimeMillis()));
                string2 = object;
            }
            catch (JSONException jSONException) {
                this.logger.error("Generating tracker newInfluenceId JSONObject ", jSONException);
            }
            if (object.length() > this.getChannelLimit()) {
                n = object.length() - this.getChannelLimit();
                string2 = new JSONArray();
                int n2 = object.length();
                if (n < n2) {
                    while (true) {
                        int n3 = n + 1;
                        try {
                            string2.put(object.get(n));
                        }
                        catch (JSONException jSONException) {
                            this.logger.error("Generating tracker lastChannelObjectsReceived get JSONObject ", jSONException);
                        }
                        if (n3 >= n2) break;
                        n = n3;
                    }
                }
            }
            object = this.logger;
            oSLogger = z2.t("OneSignal OSChannelTracker for: ");
            oSLogger.append(this.getIdTag());
            oSLogger.append(" with channelObjectToSave: ");
            oSLogger.append(string2);
            object.debug(oSLogger.toString());
            this.saveChannelObjects((JSONArray)string2);
            return;
        }
    }

    public final void setDataRepository(@NotNull OSInfluenceDataRepository oSInfluenceDataRepository) {
        Intrinsics.checkNotNullParameter((Object)oSInfluenceDataRepository, (String)"<set-?>");
        this.dataRepository = oSInfluenceDataRepository;
    }

    public final void setDirectId(@Nullable String string2) {
        this.directId = string2;
    }

    public final void setIndirectIds(@Nullable JSONArray jSONArray) {
        this.indirectIds = jSONArray;
    }

    public final void setInfluenceType(@Nullable OSInfluenceType oSInfluenceType) {
        this.influenceType = oSInfluenceType;
    }

    public final void setLogger(@NotNull OSLogger oSLogger) {
        Intrinsics.checkNotNullParameter((Object)oSLogger, (String)"<set-?>");
        this.logger = oSLogger;
    }

    @NotNull
    public String toString() {
        StringBuilder stringBuilder = z2.t("OSChannelTracker{tag=");
        stringBuilder.append(this.getIdTag());
        stringBuilder.append(", influenceType=");
        stringBuilder.append((Object)this.influenceType);
        stringBuilder.append(", indirectIds=");
        stringBuilder.append((Object)this.indirectIds);
        stringBuilder.append(", directId=");
        stringBuilder.append((Object)this.directId);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

