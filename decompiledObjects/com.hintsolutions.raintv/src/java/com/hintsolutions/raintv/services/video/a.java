/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  ru.tvrain.core.data.eagle.Record
 *  rx.functions.Action1
 */
package com.hintsolutions.raintv.services.video;

import com.hintsolutions.raintv.interfaces.TaskCallback;
import com.hintsolutions.raintv.services.video.DownloadTracker;
import com.hintsolutions.raintv.services.video.VideoUploadService;
import ru.tvrain.core.data.eagle.Record;
import rx.functions.Action1;

public final class a
implements TaskCallback,
Action1 {
    public final Object a;

    public /* synthetic */ a(Object object) {
        this.a = object;
    }

    public final void call(Object object) {
        VideoUploadService.b((VideoUploadService)((Object)this.a), (Record)object);
    }

    @Override
    public final void onActionCompleted() {
        DownloadTracker.StartDownloadDialogHelper.a((DownloadTracker.StartDownloadDialogHelper)this.a);
    }
}

