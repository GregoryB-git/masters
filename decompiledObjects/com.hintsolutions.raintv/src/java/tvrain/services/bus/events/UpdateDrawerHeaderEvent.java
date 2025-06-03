/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  kotlin.Metadata
 *  org.jetbrains.annotations.Nullable
 */
package tvrain.services.bus.events;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;
import ru.tvrain.core.data.rain_country.RCProfileInfo;

@Metadata(d1={"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2={"Ltvrain/services/bus/events/UpdateDrawerHeaderEvent;", "", "profileInfo", "Lru/tvrain/core/data/rain_country/RCProfileInfo;", "(Lru/tvrain/core/data/rain_country/RCProfileInfo;)V", "getProfileInfo", "()Lru/tvrain/core/data/rain_country/RCProfileInfo;", "app_release"}, k=1, mv={1, 7, 1}, xi=48)
public final class UpdateDrawerHeaderEvent {
    @Nullable
    private final RCProfileInfo profileInfo;

    public UpdateDrawerHeaderEvent(@Nullable RCProfileInfo rCProfileInfo) {
        this.profileInfo = rCProfileInfo;
    }

    @Nullable
    public final RCProfileInfo getProfileInfo() {
        return this.profileInfo;
    }
}

