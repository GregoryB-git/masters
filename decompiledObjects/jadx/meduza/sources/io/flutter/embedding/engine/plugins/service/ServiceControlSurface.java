package io.flutter.embedding.engine.plugins.service;

import android.app.Service;
import b1.k;

/* loaded from: classes.dex */
public interface ServiceControlSurface {
    void attachToService(Service service, k kVar, boolean z10);

    void detachFromService();

    void onMoveToBackground();

    void onMoveToForeground();
}
