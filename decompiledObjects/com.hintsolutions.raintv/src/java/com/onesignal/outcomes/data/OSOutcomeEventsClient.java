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
 *  org.json.JSONObject
 */
package com.onesignal.outcomes.data;

import com.onesignal.OneSignalAPIClient;
import com.onesignal.OneSignalApiResponseHandler;
import com.onesignal.outcomes.data.OutcomeEventsService;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

@Metadata(d1={"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b \u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH&R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\r"}, d2={"Lcom/onesignal/outcomes/data/OSOutcomeEventsClient;", "Lcom/onesignal/outcomes/data/OutcomeEventsService;", "client", "Lcom/onesignal/OneSignalAPIClient;", "(Lcom/onesignal/OneSignalAPIClient;)V", "getClient", "()Lcom/onesignal/OneSignalAPIClient;", "sendOutcomeEvent", "", "jsonObject", "Lorg/json/JSONObject;", "responseHandler", "Lcom/onesignal/OneSignalApiResponseHandler;", "onesignal_release"}, k=1, mv={1, 5, 1}, xi=48)
public abstract class OSOutcomeEventsClient
implements OutcomeEventsService {
    @NotNull
    private final OneSignalAPIClient client;

    public OSOutcomeEventsClient(@NotNull OneSignalAPIClient oneSignalAPIClient) {
        Intrinsics.checkNotNullParameter((Object)oneSignalAPIClient, (String)"client");
        this.client = oneSignalAPIClient;
    }

    @NotNull
    public final OneSignalAPIClient getClient() {
        return this.client;
    }

    @Override
    public abstract void sendOutcomeEvent(@NotNull JSONObject var1, @NotNull OneSignalApiResponseHandler var2);
}

