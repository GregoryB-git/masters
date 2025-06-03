package io.flutter.embedding.engine.plugins.contentprovider;

import android.content.ContentProvider;
import b1.k;

/* loaded from: classes.dex */
public interface ContentProviderControlSurface {
    void attachToContentProvider(ContentProvider contentProvider, k kVar);

    void detachFromContentProvider();
}
