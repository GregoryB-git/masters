/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.onesignal.outcomes.data.OSOutcomeEventsRepository
 *  com.onesignal.outcomes.data.OSOutcomeEventsV1Repository
 *  com.onesignal.outcomes.data.OSOutcomeEventsV1Service
 *  com.onesignal.outcomes.data.OSOutcomeEventsV2Repository
 *  com.onesignal.outcomes.data.OSOutcomeEventsV2Service
 *  java.lang.Object
 *  java.lang.String
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package com.onesignal.outcomes.data;

import com.onesignal.OSLogger;
import com.onesignal.OSSharedPreferences;
import com.onesignal.OneSignalAPIClient;
import com.onesignal.OneSignalDb;
import com.onesignal.outcomes.data.OSOutcomeEventsCache;
import com.onesignal.outcomes.data.OSOutcomeEventsRepository;
import com.onesignal.outcomes.data.OSOutcomeEventsV1Repository;
import com.onesignal.outcomes.data.OSOutcomeEventsV1Service;
import com.onesignal.outcomes.data.OSOutcomeEventsV2Repository;
import com.onesignal.outcomes.data.OSOutcomeEventsV2Service;
import com.onesignal.outcomes.data.OutcomeEventsService;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1={"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0002\u0010\nJ\b\u0010\u000f\u001a\u00020\u0010H\u0002J\u0006\u0010\u0011\u001a\u00020\u000eJ\b\u0010\u0012\u001a\u00020\u000eH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2={"Lcom/onesignal/outcomes/data/OSOutcomeEventsFactory;", "", "logger", "Lcom/onesignal/OSLogger;", "apiClient", "Lcom/onesignal/OneSignalAPIClient;", "dbHelper", "Lcom/onesignal/OneSignalDb;", "preferences", "Lcom/onesignal/OSSharedPreferences;", "(Lcom/onesignal/OSLogger;Lcom/onesignal/OneSignalAPIClient;Lcom/onesignal/OneSignalDb;Lcom/onesignal/OSSharedPreferences;)V", "outcomeEventsCache", "Lcom/onesignal/outcomes/data/OSOutcomeEventsCache;", "repository", "Lcom/onesignal/outcomes/domain/OSOutcomeEventsRepository;", "createRepository", "Lcom/onesignal/outcomes/data/OSOutcomeEventsRepository;", "getRepository", "validateRepositoryVersion", "onesignal_release"}, k=1, mv={1, 5, 1}, xi=48)
public final class OSOutcomeEventsFactory {
    @NotNull
    private final OneSignalAPIClient apiClient;
    @NotNull
    private final OSLogger logger;
    @NotNull
    private final OSOutcomeEventsCache outcomeEventsCache;
    @Nullable
    private com.onesignal.outcomes.domain.OSOutcomeEventsRepository repository;

    public OSOutcomeEventsFactory(@NotNull OSLogger oSLogger, @NotNull OneSignalAPIClient oneSignalAPIClient, @Nullable OneSignalDb oneSignalDb, @Nullable OSSharedPreferences oSSharedPreferences) {
        Intrinsics.checkNotNullParameter((Object)oSLogger, (String)"logger");
        Intrinsics.checkNotNullParameter((Object)oneSignalAPIClient, (String)"apiClient");
        this.logger = oSLogger;
        this.apiClient = oneSignalAPIClient;
        Intrinsics.checkNotNull((Object)oneSignalDb);
        Intrinsics.checkNotNull((Object)oSSharedPreferences);
        this.outcomeEventsCache = new OSOutcomeEventsCache(oSLogger, oneSignalDb, oSSharedPreferences);
    }

    private final OSOutcomeEventsRepository createRepository() {
        Object object = this.outcomeEventsCache.isOutcomesV2ServiceEnabled() ? new OSOutcomeEventsV2Repository(this.logger, this.outcomeEventsCache, (OutcomeEventsService)new OSOutcomeEventsV2Service(this.apiClient)) : new OSOutcomeEventsV1Repository(this.logger, this.outcomeEventsCache, (OutcomeEventsService)new OSOutcomeEventsV1Service(this.apiClient));
        return object;
    }

    private final com.onesignal.outcomes.domain.OSOutcomeEventsRepository validateRepositoryVersion() {
        com.onesignal.outcomes.domain.OSOutcomeEventsRepository oSOutcomeEventsRepository;
        if (!this.outcomeEventsCache.isOutcomesV2ServiceEnabled() && (oSOutcomeEventsRepository = this.repository) instanceof OSOutcomeEventsV1Repository) {
            Intrinsics.checkNotNull((Object)oSOutcomeEventsRepository);
            return oSOutcomeEventsRepository;
        }
        if (this.outcomeEventsCache.isOutcomesV2ServiceEnabled() && (oSOutcomeEventsRepository = this.repository) instanceof OSOutcomeEventsV2Repository) {
            Intrinsics.checkNotNull((Object)oSOutcomeEventsRepository);
            return oSOutcomeEventsRepository;
        }
        return this.createRepository();
    }

    @NotNull
    public final com.onesignal.outcomes.domain.OSOutcomeEventsRepository getRepository() {
        com.onesignal.outcomes.domain.OSOutcomeEventsRepository oSOutcomeEventsRepository = this.repository != null ? this.validateRepositoryVersion() : this.createRepository();
        return oSOutcomeEventsRepository;
    }
}

