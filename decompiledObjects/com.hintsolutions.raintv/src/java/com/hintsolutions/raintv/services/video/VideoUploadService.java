/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.NotificationManager
 *  android.app.Service
 *  android.content.Context
 *  android.content.Intent
 *  android.media.RingtoneManager
 *  android.net.Uri
 *  android.os.IBinder
 *  androidx.core.app.NotificationCompat$Builder
 *  com.hintsolutions.raintv.services.video.a
 *  java.io.File
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  javax.inject.Inject
 *  okhttp3.MediaType
 *  okhttp3.RequestBody
 *  ru.tvrain.core.Consts
 *  ru.tvrain.core.data.eagle.Record
 *  ru.tvrain.core.services.EagleService
 *  rx.android.schedulers.AndroidSchedulers
 *  rx.functions.Action1
 *  rx.schedulers.Schedulers
 *  tvrain.services.bus.BusProvider
 *  tvrain.services.bus.events.VideoUploadedEvent
 *  v1
 */
package com.hintsolutions.raintv.services.video;

import android.app.NotificationManager;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.IBinder;
import androidx.core.app.NotificationCompat;
import com.hintsolutions.raintv.RainApplication;
import com.hintsolutions.raintv.services.video.a;
import com.hintsolutions.raintv.utils.Cache;
import java.io.File;
import javax.inject.Inject;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import ru.tvrain.core.Consts;
import ru.tvrain.core.data.eagle.Record;
import ru.tvrain.core.services.EagleService;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.schedulers.Schedulers;
import tvrain.services.bus.BusProvider;
import tvrain.services.bus.events.VideoUploadedEvent;

public class VideoUploadService
extends Service
implements Consts {
    public static final String INTENT_EXTRA_UPLOAD_LINK = "upload_link";
    private static int NOTIFICATION_ID_VIDEO_UPLOADING = 21;
    @Inject
    public Cache cache;
    @Inject
    public EagleService eagleApi;
    private NotificationManager notificationManager;

    public static /* synthetic */ void a(Throwable throwable) {
        VideoUploadService.lambda$uploadVideoToEagle$1(throwable);
    }

    public static /* synthetic */ void b(VideoUploadService videoUploadService, Record record) {
        videoUploadService.lambda$uploadVideoToEagle$0(record);
    }

    private /* synthetic */ void lambda$uploadVideoToEagle$0(Record record) {
        BusProvider.getInstance().post(new VideoUploadedEvent(null));
        this.showSuccessNotification();
    }

    private static /* synthetic */ void lambda$uploadVideoToEagle$1(Throwable throwable) {
        BusProvider.getInstance().post(new VideoUploadedEvent(throwable));
    }

    private void showSuccessNotification() {
        Uri uri;
        try {
            uri = RingtoneManager.getDefaultUri((int)2);
        }
        catch (Exception exception) {
            exception.printStackTrace();
            uri = null;
        }
        NotificationCompat.Builder builder = new NotificationCompat.Builder((Context)this).setSmallIcon(2131231182).setAutoCancel(true).setContentTitle((CharSequence)this.getString(2131755051)).setDefaults(1).setPriority(0).setVisibility(1).setContentText((CharSequence)this.getString(2131755650)).setColor(this.getResources().getColor(2131099728));
        if (uri != null) {
            builder.setSound(uri);
        }
        this.notificationManager.notify(NOTIFICATION_ID_VIDEO_UPLOADING, builder.build());
    }

    private void showVideoUploadingNotification() {
        NotificationCompat.Builder builder = new NotificationCompat.Builder((Context)this).setSmallIcon(2131231182).setContentTitle((CharSequence)this.getString(2131755051)).setContentText((CharSequence)this.getString(2131755649)).setOngoing(true).setColor(this.getResources().getColor(2131099728));
        this.notificationManager.notify(NOTIFICATION_ID_VIDEO_UPLOADING, builder.build());
    }

    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onCreate() {
        super.onCreate();
        RainApplication.getAppComponent().inject(this);
        this.notificationManager = (NotificationManager)this.getSystemService("notification");
    }

    public int onStartCommand(Intent intent, int n, int n2) {
        if (intent != null && intent.hasExtra(INTENT_EXTRA_UPLOAD_LINK)) {
            try {
                this.uploadVideoToEagle(intent.getStringExtra(INTENT_EXTRA_UPLOAD_LINK));
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
        return super.onStartCommand(intent, n, n2);
    }

    public void uploadVideoToEagle(String string) {
        this.showVideoUploadingNotification();
        RequestBody requestBody = RequestBody.create((MediaType)MediaType.parse((String)"video/mp4"), (File)new File(this.cache.getLatestVideoPath()));
        this.eagleApi.uploadVideo(string, requestBody).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe((Action1)new a((Object)this), (Action1)new v1(29));
    }
}

