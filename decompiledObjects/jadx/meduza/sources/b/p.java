package b;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public abstract class p {
    private final CopyOnWriteArrayList<c> cancellables = new CopyOnWriteArrayList<>();
    private dc.a<rb.h> enabledChangedCallback;
    private boolean isEnabled;

    public p(boolean z10) {
        this.isEnabled = z10;
    }

    public final void addCancellable(c cVar) {
        ec.i.e(cVar, "cancellable");
        this.cancellables.add(cVar);
    }

    public final dc.a<rb.h> getEnabledChangedCallback$activity_release() {
        return this.enabledChangedCallback;
    }

    public void handleOnBackCancelled() {
    }

    public abstract void handleOnBackPressed();

    public void handleOnBackProgressed(b bVar) {
        ec.i.e(bVar, "backEvent");
    }

    public void handleOnBackStarted(b bVar) {
        ec.i.e(bVar, "backEvent");
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    public final void remove() {
        Iterator<T> it = this.cancellables.iterator();
        while (it.hasNext()) {
            ((c) it.next()).cancel();
        }
    }

    public final void removeCancellable(c cVar) {
        ec.i.e(cVar, "cancellable");
        this.cancellables.remove(cVar);
    }

    public final void setEnabled(boolean z10) {
        this.isEnabled = z10;
        dc.a<rb.h> aVar = this.enabledChangedCallback;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    public final void setEnabledChangedCallback$activity_release(dc.a<rb.h> aVar) {
        this.enabledChangedCallback = aVar;
    }
}
