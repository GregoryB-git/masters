/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
 *  java.util.Set
 *  kotlin.Metadata
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package com.onesignal.outcomes.domain;

import com.onesignal.OneSignalApiResponseHandler;
import com.onesignal.influence.domain.OSInfluence;
import com.onesignal.outcomes.domain.OSOutcomeEventParams;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&J$\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u00052\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\bH&J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\bH&J\u0010\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000fH&J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\rH&J(\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u0018H&J\u0010\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\rH&J\u0016\u0010\u001a\u001a\u00020\u00032\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00050\u000fH&J\u0010\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\rH&\u00a8\u0006\u001e"}, d2={"Lcom/onesignal/outcomes/domain/OSOutcomeEventsRepository;", "", "cleanCachedUniqueOutcomeEventNotifications", "", "notificationTableName", "", "notificationIdColumnName", "getNotCachedUniqueOutcome", "", "Lcom/onesignal/influence/domain/OSInfluence;", "name", "influences", "getSavedOutcomeEvents", "Lcom/onesignal/outcomes/domain/OSOutcomeEventParams;", "getUnattributedUniqueOutcomeEventsSent", "", "removeEvent", "outcomeEvent", "requestMeasureOutcomeEvent", "appId", "deviceType", "", "event", "responseHandler", "Lcom/onesignal/OneSignalApiResponseHandler;", "saveOutcomeEvent", "saveUnattributedUniqueOutcomeEventsSent", "unattributedUniqueOutcomeEvents", "saveUniqueOutcomeNotifications", "eventParams", "onesignal_release"}, k=1, mv={1, 5, 1}, xi=48)
public interface OSOutcomeEventsRepository {
    public void cleanCachedUniqueOutcomeEventNotifications(@NotNull String var1, @NotNull String var2);

    @NotNull
    public List<OSInfluence> getNotCachedUniqueOutcome(@NotNull String var1, @NotNull List<OSInfluence> var2);

    @NotNull
    public List<OSOutcomeEventParams> getSavedOutcomeEvents();

    @Nullable
    public Set<String> getUnattributedUniqueOutcomeEventsSent();

    public void removeEvent(@NotNull OSOutcomeEventParams var1);

    public void requestMeasureOutcomeEvent(@NotNull String var1, int var2, @NotNull OSOutcomeEventParams var3, @NotNull OneSignalApiResponseHandler var4);

    public void saveOutcomeEvent(@NotNull OSOutcomeEventParams var1);

    public void saveUnattributedUniqueOutcomeEventsSent(@NotNull Set<String> var1);

    public void saveUniqueOutcomeNotifications(@NotNull OSOutcomeEventParams var1);
}

