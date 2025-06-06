/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  org.jetbrains.annotations.NotNull
 */
package tvrain.services.bus.events;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.tvrain.core.data.ScheduleProgram;

@Metadata(d1={"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2={"Ltvrain/services/bus/events/ScheduleChangedEvent;", "", "program", "Lru/tvrain/core/data/ScheduleProgram;", "(Lru/tvrain/core/data/ScheduleProgram;)V", "getProgram", "()Lru/tvrain/core/data/ScheduleProgram;", "app_release"}, k=1, mv={1, 7, 1}, xi=48)
public final class ScheduleChangedEvent {
    @NotNull
    private final ScheduleProgram program;

    public ScheduleChangedEvent(@NotNull ScheduleProgram scheduleProgram) {
        Intrinsics.checkNotNullParameter((Object)scheduleProgram, (String)"program");
        this.program = scheduleProgram;
    }

    @NotNull
    public final ScheduleProgram getProgram() {
        return this.program;
    }
}

