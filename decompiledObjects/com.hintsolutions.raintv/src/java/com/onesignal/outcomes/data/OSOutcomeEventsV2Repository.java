/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  org.jetbrains.annotations.NotNull
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.onesignal.outcomes.data;

import com.onesignal.OSLogger;
import com.onesignal.OneSignalApiResponseHandler;
import com.onesignal.outcomes.data.OSOutcomeEventsCache;
import com.onesignal.outcomes.data.OSOutcomeEventsRepository;
import com.onesignal.outcomes.data.OutcomeEventsService;
import com.onesignal.outcomes.domain.OSOutcomeEventParams;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1={"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ(\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016\u00a8\u0006\u0013"}, d2={"Lcom/onesignal/outcomes/data/OSOutcomeEventsV2Repository;", "Lcom/onesignal/outcomes/data/OSOutcomeEventsRepository;", "logger", "Lcom/onesignal/OSLogger;", "outcomeEventsCache", "Lcom/onesignal/outcomes/data/OSOutcomeEventsCache;", "outcomeEventsService", "Lcom/onesignal/outcomes/data/OutcomeEventsService;", "(Lcom/onesignal/OSLogger;Lcom/onesignal/outcomes/data/OSOutcomeEventsCache;Lcom/onesignal/outcomes/data/OutcomeEventsService;)V", "requestMeasureOutcomeEvent", "", "appId", "", "deviceType", "", "event", "Lcom/onesignal/outcomes/domain/OSOutcomeEventParams;", "responseHandler", "Lcom/onesignal/OneSignalApiResponseHandler;", "onesignal_release"}, k=1, mv={1, 5, 1}, xi=48)
public final class OSOutcomeEventsV2Repository
extends OSOutcomeEventsRepository {
    public OSOutcomeEventsV2Repository(@NotNull OSLogger oSLogger, @NotNull OSOutcomeEventsCache oSOutcomeEventsCache, @NotNull OutcomeEventsService outcomeEventsService) {
        Intrinsics.checkNotNullParameter((Object)oSLogger, (String)"logger");
        Intrinsics.checkNotNullParameter((Object)oSOutcomeEventsCache, (String)"outcomeEventsCache");
        Intrinsics.checkNotNullParameter((Object)outcomeEventsService, (String)"outcomeEventsService");
        super(oSLogger, oSOutcomeEventsCache, outcomeEventsService);
    }

    @Override
    public void requestMeasureOutcomeEvent(@NotNull String string, int n4, @NotNull OSOutcomeEventParams object, @NotNull OneSignalApiResponseHandler oneSignalApiResponseHandler) {
        Intrinsics.checkNotNullParameter((Object)string, (String)"appId");
        Intrinsics.checkNotNullParameter((Object)object, (String)"event");
        Intrinsics.checkNotNullParameter((Object)oneSignalApiResponseHandler, (String)"responseHandler");
        try {
            string = ((OSOutcomeEventParams)object).toJSONObject().put("app_id", (Object)string).put("device_type", n4);
            object = this.getOutcomeEventsService();
            Intrinsics.checkNotNullExpressionValue((Object)string, (String)"jsonObject");
            object.sendOutcomeEvent((JSONObject)string, oneSignalApiResponseHandler);
        }
        catch (JSONException jSONException) {
            this.getLogger().error("Generating indirect outcome:JSON Failed.", jSONException);
        }
    }
}

