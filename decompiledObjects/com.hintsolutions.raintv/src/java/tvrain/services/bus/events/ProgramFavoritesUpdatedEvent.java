/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  kotlin.Metadata
 */
package tvrain.services.bus.events;

import kotlin.Metadata;

@Metadata(d1={"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u00a8\u0006\n"}, d2={"Ltvrain/services/bus/events/ProgramFavoritesUpdatedEvent;", "", "programId", "", "isFavorite", "", "(IZ)V", "()Z", "getProgramId", "()I", "app_release"}, k=1, mv={1, 7, 1}, xi=48)
public final class ProgramFavoritesUpdatedEvent {
    private final boolean isFavorite;
    private final int programId;

    public ProgramFavoritesUpdatedEvent(int n3, boolean bl) {
        this.programId = n3;
        this.isFavorite = bl;
    }

    public final int getProgramId() {
        return this.programId;
    }

    public final boolean isFavorite() {
        return this.isFavorite;
    }
}

