/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Notification
 *  android.app.PendingIntent
 *  android.content.Context
 *  android.content.Intent
 *  android.net.Uri
 *  com.google.android.exoplayer2.offline.DownloadAction
 *  com.google.android.exoplayer2.offline.DownloadManager
 *  com.google.android.exoplayer2.offline.DownloadManager$TaskState
 *  com.google.android.exoplayer2.offline.DownloadService
 *  com.google.android.exoplayer2.scheduler.PlatformScheduler
 *  com.google.android.exoplayer2.source.hls.offline.HlsDownloadAction
 *  com.google.android.exoplayer2.util.NotificationUtil
 *  com.google.android.exoplayer2.util.Util
 *  com.hintsolutions.raintv.profile.SavedVideosActivity
 *  java.lang.Object
 *  java.lang.String
 */
package com.hintsolutions.raintv.services.video;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.exoplayer2.offline.DownloadAction;
import com.google.android.exoplayer2.offline.DownloadManager;
import com.google.android.exoplayer2.offline.DownloadService;
import com.google.android.exoplayer2.scheduler.PlatformScheduler;
import com.google.android.exoplayer2.source.hls.offline.HlsDownloadAction;
import com.google.android.exoplayer2.util.NotificationUtil;
import com.google.android.exoplayer2.util.Util;
import com.hintsolutions.raintv.RainApplication;
import com.hintsolutions.raintv.profile.SavedVideosActivity;
import com.hintsolutions.raintv.services.video.DownloadNotificationUtil;

public class AutoVideoDownloadService
extends DownloadService {
    public static final String ACTION_REMOVE_ALL_DOWNLOADS = "com.google.android.exoplayer.downloadService.action.REMOVE_ALL_DOWNLOADS";
    private static final String CHANNEL_ID = "download_channel";
    private static final int FOREGROUND_NOTIFICATION_ID = 1;
    private static final int JOB_ID = 1;

    public AutoVideoDownloadService() {
        super(1, 1000L, CHANNEL_ID, 2131755208);
    }

    private boolean alreadyHaveRemoveAction(DownloadManager.TaskState taskState, DownloadManager.TaskState[] taskStateArray) {
        int n = taskStateArray.length;
        for (int i = 0; i < n; ++i) {
            DownloadAction downloadAction = taskStateArray[i].action;
            if (!downloadAction.isRemoveAction || !downloadAction.uri.equals((Object)taskState.action.uri)) continue;
            return true;
        }
        return false;
    }

    public DownloadManager getDownloadManager() {
        return ((RainApplication)this.getApplication()).getDownloadManager();
    }

    public Notification getForegroundNotification(DownloadManager.TaskState[] taskStateArray) {
        this.getDownloadManager().stopDownloads();
        return DownloadNotificationUtil.buildProgressNotification((Context)this, 2131231182, CHANNEL_ID, null, null, taskStateArray);
    }

    public PlatformScheduler getScheduler() {
        PlatformScheduler platformScheduler = Util.SDK_INT >= 21 ? new PlatformScheduler((Context)this, 1) : null;
        return platformScheduler;
    }

    public int onStartCommand(Intent intent, int n, int n2) {
        if (intent.getAction() != null && intent.getAction().equals((Object)ACTION_REMOVE_ALL_DOWNLOADS)) {
            DownloadManager.TaskState[] taskStateArray = this.getDownloadManager().getAllTaskStates();
            int n3 = taskStateArray.length;
            for (int i = 0; i < n3; ++i) {
                DownloadManager.TaskState taskState = taskStateArray[i];
                if (taskState.action.isRemoveAction || this.alreadyHaveRemoveAction(taskState, taskStateArray)) continue;
                DownloadManager downloadManager = this.getDownloadManager();
                taskState = taskState.action;
                downloadManager.handleAction((DownloadAction)HlsDownloadAction.createRemoveAction((Uri)taskState.uri, (byte[])taskState.data));
            }
        }
        return super.onStartCommand(intent, n, n2);
    }

    public void onTaskStateChanged(DownloadManager.TaskState taskState) {
        DownloadAction downloadAction = taskState.action;
        if (downloadAction.isRemoveAction) {
            return;
        }
        int n = taskState.state;
        Notification notification = null;
        if (n == 2) {
            notification = DownloadNotificationUtil.buildDownloadCompletedNotification((Context)this, 2131231182, CHANNEL_ID, PendingIntent.getActivity((Context)this, (int)0, (Intent)new Intent((Context)this, SavedVideosActivity.class), (int)0), Util.fromUtf8Bytes((byte[])taskState.action.data));
            notification.flags |= 0x10;
        } else if (n == 4) {
            notification = DownloadNotificationUtil.buildDownloadFailedNotification((Context)this, 2131231182, CHANNEL_ID, null, Util.fromUtf8Bytes((byte[])downloadAction.data));
        }
        NotificationUtil.setNotification((Context)this, (int)(taskState.taskId + 2), notification);
    }
}

