package io.flutter.plugin.platform;

import android.view.View;

/* loaded from: classes.dex */
public interface PlatformView {
    void dispose();

    View getView();

    void onFlutterViewAttached(View view);

    void onFlutterViewDetached();

    void onInputConnectionLocked();

    void onInputConnectionUnlocked();
}
