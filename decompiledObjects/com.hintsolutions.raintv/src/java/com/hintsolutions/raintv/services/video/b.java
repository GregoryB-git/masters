/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  com.google.android.exoplayer2.offline.DownloadHelper
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package com.hintsolutions.raintv.services.video;

import android.view.View;
import com.afollestad.materialdialogs.MaterialDialog;
import com.google.android.exoplayer2.offline.DownloadHelper;
import com.hintsolutions.raintv.services.video.DownloadTracker;

public final class b
implements MaterialDialog.ListCallbackSingleChoice {
    public final DownloadTracker.StartDownloadDialogHelper a;
    public final DownloadHelper b;
    public final String c;
    public final int d;
    public final DownloadTracker.PrepareListener e;

    public /* synthetic */ b(DownloadTracker.StartDownloadDialogHelper startDownloadDialogHelper, DownloadHelper downloadHelper, String string, int n, DownloadTracker.PrepareListener prepareListener) {
        this.a = startDownloadDialogHelper;
        this.b = downloadHelper;
        this.c = string;
        this.d = n;
        this.e = prepareListener;
    }

    @Override
    public final boolean onSelection(MaterialDialog materialDialog, View view, int n, CharSequence charSequence) {
        return DownloadTracker.StartDownloadDialogHelper.b(this.a, this.b, this.c, this.d, this.e, materialDialog, view, n, charSequence);
    }
}

