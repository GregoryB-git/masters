/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.util.List
 *  java.util.Set
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package com.onesignal.outcomes.data;

import com.onesignal.OSLogger;
import com.onesignal.OneSignalApiResponseHandler;
import com.onesignal.influence.domain.OSInfluence;
import com.onesignal.outcomes.data.OSOutcomeEventsCache;
import com.onesignal.outcomes.data.OutcomeEventsService;
import com.onesignal.outcomes.domain.OSOutcomeEventParams;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b \u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J$\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0015\u001a\u00020\u00102\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0016J\u000e\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0013H\u0016J\u0010\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u001aH\u0016J\u0010\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u0018H\u0016J(\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020#H&J\u0010\u0010$\u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\u0018H\u0016J\u0016\u0010%\u001a\u00020\u000e2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00100\u001aH\u0016J\u0010\u0010'\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020\u0018H\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006)"}, d2={"Lcom/onesignal/outcomes/data/OSOutcomeEventsRepository;", "Lcom/onesignal/outcomes/domain/OSOutcomeEventsRepository;", "logger", "Lcom/onesignal/OSLogger;", "outcomeEventsCache", "Lcom/onesignal/outcomes/data/OSOutcomeEventsCache;", "outcomeEventsService", "Lcom/onesignal/outcomes/data/OutcomeEventsService;", "(Lcom/onesignal/OSLogger;Lcom/onesignal/outcomes/data/OSOutcomeEventsCache;Lcom/onesignal/outcomes/data/OutcomeEventsService;)V", "getLogger", "()Lcom/onesignal/OSLogger;", "getOutcomeEventsService", "()Lcom/onesignal/outcomes/data/OutcomeEventsService;", "cleanCachedUniqueOutcomeEventNotifications", "", "notificationTableName", "", "notificationIdColumnName", "getNotCachedUniqueOutcome", "", "Lcom/onesignal/influence/domain/OSInfluence;", "name", "influences", "getSavedOutcomeEvents", "Lcom/onesignal/outcomes/domain/OSOutcomeEventParams;", "getUnattributedUniqueOutcomeEventsSent", "", "removeEvent", "outcomeEvent", "requestMeasureOutcomeEvent", "appId", "deviceType", "", "event", "responseHandler", "Lcom/onesignal/OneSignalApiResponseHandler;", "saveOutcomeEvent", "saveUnattributedUniqueOutcomeEventsSent", "unattributedUniqueOutcomeEvents", "saveUniqueOutcomeNotifications", "eventParams", "onesignal_release"}, k=1, mv={1, 5, 1}, xi=48)
public abstract class OSOutcomeEventsRepository
implements com.onesignal.outcomes.domain.OSOutcomeEventsRepository {
    @NotNull
    private final OSLogger logger;
    @NotNull
    private final OSOutcomeEventsCache outcomeEventsCache;
    @NotNull
    private final OutcomeEventsService outcomeEventsService;

    public OSOutcomeEventsRepository(@NotNull OSLogger oSLogger, @NotNull OSOutcomeEventsCache oSOutcomeEventsCache, @NotNull OutcomeEventsService outcomeEventsService) {
        Intrinsics.checkNotNullParameter((Object)oSLogger, (String)"logger");
        Intrinsics.checkNotNullParameter((Object)oSOutcomeEventsCache, (String)"outcomeEventsCache");
        Intrinsics.checkNotNullParameter((Object)outcomeEventsService, (String)"outcomeEventsService");
        this.logger = oSLogger;
        this.outcomeEventsCache = oSOutcomeEventsCache;
        this.outcomeEventsService = outcomeEventsService;
    }

    @Override
    public void cleanCachedUniqueOutcomeEventNotifications(@NotNull String string2, @NotNull String string3) {
        Intrinsics.checkNotNullParameter((Object)string2, (String)"notificationTableName");
        Intrinsics.checkNotNullParameter((Object)string3, (String)"notificationIdColumnName");
        this.outcomeEventsCache.cleanCachedUniqueOutcomeEventNotifications(string2, string3);
    }

    @NotNull
    public final OSLogger getLogger() {
        return this.logger;
    }

    @Override
    @NotNull
    public List<OSInfluence> getNotCachedUniqueOutcome(@NotNull String list, @NotNull List<OSInfluence> list2) {
        Intrinsics.checkNotNullParameter((Object)list, (String)"name");
        Intrinsics.checkNotNullParameter(list2, (String)"influences");
        list = this.outcomeEventsCache.getNotCachedUniqueInfluencesForOutcome((String)list, list2);
        this.logger.debug(Intrinsics.stringPlus((String)"OneSignal getNotCachedUniqueOutcome influences: ", list));
        return list;
    }

    @NotNull
    public final OutcomeEventsService getOutcomeEventsService() {
        return this.outcomeEventsService;
    }

    @Override
    @NotNull
    public List<OSOutcomeEventParams> getSavedOutcomeEvents() {
        return this.outcomeEventsCache.getAllEventsToSend();
    }

    @Override
    @Nullable
    public Set<String> getUnattributedUniqueOutcomeEventsSent() {
        Set<String> set = this.outcomeEventsCache.getUnattributedUniqueOutcomeEventsSentByChannel();
        this.logger.debug(Intrinsics.stringPlus((String)"OneSignal getUnattributedUniqueOutcomeEventsSentByChannel: ", set));
        return set;
    }

    @Override
    public void removeEvent(@NotNull OSOutcomeEventParams oSOutcomeEventParams) {
        Intrinsics.checkNotNullParameter((Object)oSOutcomeEventParams, (String)"outcomeEvent");
        this.outcomeEventsCache.deleteOldOutcomeEvent(oSOutcomeEventParams);
    }

    @Override
    public abstract void requestMeasureOutcomeEvent(@NotNull String var1, int var2, @NotNull OSOutcomeEventParams var3, @NotNull OneSignalApiResponseHandler var4);

    @Override
    public void saveOutcomeEvent(@NotNull OSOutcomeEventParams oSOutcomeEventParams) {
        Intrinsics.checkNotNullParameter((Object)oSOutcomeEventParams, (String)"event");
        this.outcomeEventsCache.saveOutcomeEvent(oSOutcomeEventParams);
    }

    @Override
    public void saveUnattributedUniqueOutcomeEventsSent(@NotNull Set<String> set) {
        Intrinsics.checkNotNullParameter(set, (String)"unattributedUniqueOutcomeEvents");
        this.logger.debug(Intrinsics.stringPlus((String)"OneSignal save unattributedUniqueOutcomeEvents: ", set));
        this.outcomeEventsCache.saveUnattributedUniqueOutcomeEventsSentByChannel(set);
    }

    @Override
    public void saveUniqueOutcomeNotifications(@NotNull OSOutcomeEventParams oSOutcomeEventParams) {
        Intrinsics.checkNotNullParameter((Object)oSOutcomeEventParams, (String)"eventParams");
        this.outcomeEventsCache.saveUniqueOutcomeEventParams(oSOutcomeEventParams);
    }
}

