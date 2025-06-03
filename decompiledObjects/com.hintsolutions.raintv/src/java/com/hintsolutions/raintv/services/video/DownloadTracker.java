/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.Intent
 *  android.net.Uri
 *  android.os.Handler
 *  android.os.HandlerThread
 *  android.view.View
 *  android.widget.Toast
 *  com.google.android.exoplayer2.offline.ActionFile
 *  com.google.android.exoplayer2.offline.DownloadAction
 *  com.google.android.exoplayer2.offline.DownloadAction$Deserializer
 *  com.google.android.exoplayer2.offline.DownloadHelper
 *  com.google.android.exoplayer2.offline.DownloadHelper$Callback
 *  com.google.android.exoplayer2.offline.DownloadManager
 *  com.google.android.exoplayer2.offline.DownloadManager$Listener
 *  com.google.android.exoplayer2.offline.DownloadManager$TaskState
 *  com.google.android.exoplayer2.offline.DownloadService
 *  com.google.android.exoplayer2.offline.ProgressiveDownloadHelper
 *  com.google.android.exoplayer2.offline.StreamKey
 *  com.google.android.exoplayer2.offline.TrackKey
 *  com.google.android.exoplayer2.source.TrackGroup
 *  com.google.android.exoplayer2.source.dash.offline.DashDownloadHelper
 *  com.google.android.exoplayer2.source.hls.offline.HlsDownloadHelper
 *  com.google.android.exoplayer2.source.smoothstreaming.offline.SsDownloadHelper
 *  com.google.android.exoplayer2.upstream.DataSource$Factory
 *  com.google.android.exoplayer2.util.Log
 *  com.google.android.exoplayer2.util.Util
 *  com.google.gson.Gson
 *  com.hintsolutions.raintv.common.BaseActivity
 *  com.hintsolutions.raintv.services.video.a
 *  com.squareup.picasso.Picasso
 *  java.io.File
 *  java.io.IOException
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.IllegalStateException
 *  java.lang.Integer
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.HashMap
 *  java.util.List
 *  java.util.Map
 *  java.util.concurrent.ConcurrentHashMap
 *  java.util.concurrent.CopyOnWriteArraySet
 *  javax.inject.Inject
 *  tvrain.managers.PrefsManager
 */
package com.hintsolutions.raintv.services.video;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.View;
import android.widget.Toast;
import com.afollestad.materialdialogs.MaterialDialog;
import com.google.android.exoplayer2.offline.ActionFile;
import com.google.android.exoplayer2.offline.DownloadAction;
import com.google.android.exoplayer2.offline.DownloadHelper;
import com.google.android.exoplayer2.offline.DownloadManager;
import com.google.android.exoplayer2.offline.DownloadService;
import com.google.android.exoplayer2.offline.ProgressiveDownloadHelper;
import com.google.android.exoplayer2.offline.StreamKey;
import com.google.android.exoplayer2.offline.TrackKey;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.dash.offline.DashDownloadHelper;
import com.google.android.exoplayer2.source.hls.offline.HlsDownloadHelper;
import com.google.android.exoplayer2.source.smoothstreaming.offline.SsDownloadHelper;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.Util;
import com.google.gson.Gson;
import com.hintsolutions.raintv.RainApplication;
import com.hintsolutions.raintv.common.BaseActivity;
import com.hintsolutions.raintv.interfaces.TaskCallback;
import com.hintsolutions.raintv.services.video.AutoVideoDownloadService;
import com.hintsolutions.raintv.services.video.SavedVideoHolder;
import com.hintsolutions.raintv.services.video.SavedVideos;
import com.hintsolutions.raintv.services.video.b;
import com.hintsolutions.raintv.utils.Cache;
import com.squareup.picasso.Picasso;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import javax.inject.Inject;
import tvrain.managers.PrefsManager;

public class DownloadTracker
implements DownloadManager.Listener {
    private static final String PLAYLIST_EXTENSION = "m3u8";
    private static final String TAG = "DownloadTracker";
    private static final Map<Uri, SavedVideoHolder> videoHolders = new ConcurrentHashMap();
    private final ActionFile actionFile;
    private final Handler actionFileWriteHandler;
    @Inject
    public Cache cache;
    private final Context context;
    private final DataSource.Factory dataSourceFactory;
    private final HashMap<Uri, Integer> downloadingIds;
    private final CopyOnWriteArraySet<Listener> listeners;
    @Inject
    public PrefsManager prefsManager;
    private final HashMap<Uri, DownloadAction> trackedDownloadStates;

    public DownloadTracker(Context context, DataSource.Factory factory, File file, DownloadAction.Deserializer ... deserializerArray) {
        RainApplication.getAppComponent().inject(this);
        this.context = context.getApplicationContext();
        this.dataSourceFactory = factory;
        this.actionFile = new ActionFile(file);
        this.listeners = new CopyOnWriteArraySet();
        this.trackedDownloadStates = new HashMap();
        this.downloadingIds = new HashMap();
        context = new HandlerThread(TAG);
        context.start();
        this.actionFileWriteHandler = new Handler(context.getLooper());
        if (deserializerArray.length <= 0) {
            deserializerArray = DownloadAction.getDefaultDeserializers();
        }
        this.loadTrackedActions(deserializerArray);
    }

    public static /* synthetic */ void a(DownloadTracker downloadTracker, DownloadAction[] downloadActionArray) {
        downloadTracker.lambda$handleTrackedDownloadStatesChanged$0(downloadActionArray);
    }

    private DownloadHelper getDownloadHelper(Uri uri, String string) {
        int n = Util.inferContentType((Uri)uri, (String)string);
        if (n != 0) {
            if (n != 1) {
                if (n != 2) {
                    if (n == 3) {
                        return new ProgressiveDownloadHelper(uri);
                    }
                    throw new IllegalStateException(a.f("Unsupported type: ", n));
                }
                return new HlsDownloadHelper(uri, this.dataSourceFactory);
            }
            return new SsDownloadHelper(uri, this.dataSourceFactory);
        }
        return new DashDownloadHelper(uri, this.dataSourceFactory);
    }

    private DownloadManager.TaskState getFirstQueuedState(DownloadManager downloadManager2) {
        for (DownloadManager.TaskState taskState : downloadManager2.getAllTaskStates()) {
            if (taskState.state != 0) continue;
            return taskState;
        }
        return null;
    }

    private void handleTrackedDownloadStatesChanged() {
        DownloadAction[] downloadActionArray = this.listeners.iterator();
        while (downloadActionArray.hasNext()) {
            (downloadActionArray.next()).onDownloadsChanged();
        }
        downloadActionArray = (DownloadAction[])this.trackedDownloadStates.values().toArray((Object[])new DownloadAction[0]);
        this.actionFileWriteHandler.post((Runnable)new q5(this, downloadActionArray, 7));
    }

    private boolean hasStartedActions(DownloadManager taskStateArray) {
        for (DownloadManager.TaskState taskState : taskStateArray.getAllTaskStates()) {
            if (taskState.action.isRemoveAction || taskState.state != 1) continue;
            return true;
        }
        return false;
    }

    private /* synthetic */ void lambda$handleTrackedDownloadStatesChanged$0(DownloadAction[] downloadActionArray) {
        try {
            this.actionFile.store(downloadActionArray);
        }
        catch (IOException iOException) {
            Log.e((String)TAG, (String)"Failed to store tracked actions", (Throwable)iOException);
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void loadTrackedActions(DownloadAction.Deserializer[] deserializerArray) {
        int n;
        try {
            deserializerArray = this.actionFile.load(deserializerArray);
            n = deserializerArray.length;
        }
        catch (IOException iOException) {
            Log.e((String)TAG, (String)"Failed to load tracked actions", (Throwable)iOException);
            return;
        }
        for (int i = 0; i < n; ++i) {
            DownloadAction.Deserializer deserializer = deserializerArray[i];
            {
                this.trackedDownloadStates.put((Object)deserializer.uri, (Object)deserializer);
                continue;
            }
        }
    }

    private void restartAction(DownloadManager.TaskState taskState) {
        Intent intent = new Intent(this.context, AutoVideoDownloadService.class);
        intent.setAction("com.google.android.exoplayer.downloadService.action.INIT");
        intent.putExtra("download_action", taskState.action.toByteArray());
        intent.putExtra("foreground", false);
        this.context.startService(intent);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void saveVideoHolder(SavedVideoHolder savedVideoHolder) {
        DownloadTracker downloadTracker = this;
        synchronized (downloadTracker) {
            Throwable throwable2;
            block7: {
                SavedVideos savedVideos;
                try {
                    try {
                        savedVideos = (SavedVideos)this.prefsManager.getObject("saved_videos", SavedVideos.class);
                    }
                    catch (Exception exception) {
                        exception.printStackTrace();
                        savedVideos = null;
                    }
                }
                catch (Throwable throwable2) {
                    break block7;
                }
                SavedVideos savedVideos2 = savedVideos;
                if (savedVideos == null) {
                    savedVideos = new ArrayList();
                    savedVideos2 = new SavedVideos((List<SavedVideoHolder>)savedVideos);
                }
                if (!savedVideos2.isExists(savedVideoHolder.id)) {
                    savedVideos2.videos.add((Object)savedVideoHolder);
                    savedVideos = this.prefsManager;
                    Gson gson = new Gson();
                    savedVideos.putString("saved_videos", gson.toJson((Object)savedVideos2));
                    Picasso.get().load(savedVideoHolder.preview).fetch();
                }
                return;
            }
            throw throwable2;
        }
    }

    private void startDownload(DownloadAction downloadAction, int n) {
        if (this.trackedDownloadStates.containsKey((Object)downloadAction.uri)) {
            return;
        }
        this.trackedDownloadStates.put((Object)downloadAction.uri, (Object)downloadAction);
        this.downloadingIds.put((Object)downloadAction.uri, (Object)n);
        this.handleTrackedDownloadStatesChanged();
        this.startServiceWithAction(downloadAction);
    }

    private void startServiceWithAction(DownloadAction downloadAction) {
        DownloadService.startWithAction((Context)this.context, AutoVideoDownloadService.class, (DownloadAction)downloadAction, (boolean)false);
    }

    public void addListener(Listener listener) {
        this.listeners.add((Object)listener);
    }

    public List<StreamKey> getOfflineStreamKeys(Uri uri) {
        if (!this.trackedDownloadStates.containsKey((Object)uri)) {
            return Collections.emptyList();
        }
        return ((DownloadAction)this.trackedDownloadStates.get((Object)uri)).getKeys();
    }

    public boolean isDownloaded(int n) {
        boolean bl = this.downloadingIds.containsValue((Object)n) || new SavedVideos(this.prefsManager).isExists(String.valueOf((int)n));
        return bl;
    }

    public boolean isDownloaded(Uri uri) {
        return this.trackedDownloadStates.containsKey((Object)uri);
    }

    public void onIdle(DownloadManager downloadManager) {
    }

    public void onInitialized(DownloadManager downloadManager) {
    }

    public void onTaskStateChanged(DownloadManager downloadManager, DownloadManager.TaskState object) {
        DownloadAction downloadAction = object.action;
        Uri uri = downloadAction.uri;
        boolean bl = downloadAction.isRemoveAction;
        if ((bl && object.state == 2 || !bl && object.state == 4) && this.trackedDownloadStates.remove((Object)uri) != null) {
            this.downloadingIds.remove((Object)uri);
            this.handleTrackedDownloadStatesChanged();
        }
        if (!downloadAction.isRemoveAction && object.state == 2) {
            object = (SavedVideoHolder)videoHolders.get((Object)uri);
            if (object != null) {
                this.saveVideoHolder((SavedVideoHolder)object);
            }
            if (!this.hasStartedActions(downloadManager) && (downloadManager = this.getFirstQueuedState(downloadManager)) != null) {
                this.restartAction((DownloadManager.TaskState)downloadManager);
            }
        }
    }

    public void removeListener(Listener listener) {
        this.listeners.remove((Object)listener);
    }

    public void toggleDownload(Activity activity, int n, Uri uri, SavedVideoHolder savedVideoHolder, PrepareListener prepareListener) {
        String string = savedVideoHolder != null ? savedVideoHolder.name : "";
        if (savedVideoHolder != null) {
            videoHolders.put((Object)uri, (Object)savedVideoHolder);
        }
        if (!this.isDownloaded(uri)) {
            new StartDownloadDialogHelper(this, activity, n, this.getDownloadHelper(uri, PLAYLIST_EXTENSION), string, this.cache, prepareListener).prepare();
        }
    }

    public final class StartDownloadDialogHelper
    implements DownloadHelper.Callback {
        private final MaterialDialog.Builder builder;
        private final Cache cache;
        private final Context context;
        private final DownloadHelper downloadHelper;
        private final String name;
        private PrepareListener prepareListener;
        public final DownloadTracker this$0;
        private final List<Integer> trackKeys;

        public StartDownloadDialogHelper(DownloadTracker downloadTracker, Activity activity, int n, DownloadHelper downloadHelper, String string, Cache cache, PrepareListener prepareListener) {
            this.this$0 = downloadTracker;
            downloadTracker = new ArrayList();
            this.trackKeys = downloadTracker;
            this.downloadHelper = downloadHelper;
            this.name = string;
            this.cache = cache;
            this.context = activity;
            this.prepareListener = prepareListener;
            this.builder = new MaterialDialog.Builder((Context)activity).title(2131755140).widgetColorRes(2131099728).items(2130903043).itemsCallbackSingleChoice(0, new b(this, downloadHelper, string, n, prepareListener)).positiveText(2131755138).positiveColorRes(2131099728);
            downloadTracker.clear();
        }

        public static /* synthetic */ void a(StartDownloadDialogHelper startDownloadDialogHelper) {
            startDownloadDialogHelper.lambda$showFirstVideoDialog$1();
        }

        public static /* synthetic */ boolean b(StartDownloadDialogHelper startDownloadDialogHelper, DownloadHelper downloadHelper, String string, int n, PrepareListener prepareListener, MaterialDialog materialDialog, View view, int n2, CharSequence charSequence) {
            return startDownloadDialogHelper.lambda$new$0(downloadHelper, string, n, prepareListener, materialDialog, view, n2, charSequence);
        }

        private /* synthetic */ boolean lambda$new$0(DownloadHelper downloadHelper, String string, int n, PrepareListener prepareListener, MaterialDialog object, View view, int n2, CharSequence charSequence) {
            block3: {
                object = Util.getUtf8Bytes((String)string);
                string = new TrackKey(0, 0, ((Integer)this.trackKeys.get(n2)).intValue());
                downloadHelper = downloadHelper.getDownloadAction((byte[])object, Collections.singletonList((Object)string));
                this.this$0.startDownload((DownloadAction)downloadHelper, n);
                this.showFirstVideoDialog();
                if (prepareListener == null) break block3;
                try {
                    prepareListener.onDownloadStarted();
                }
                catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
            return true;
        }

        private /* synthetic */ void lambda$showFirstVideoDialog$1() {
            this.cache.putBoolean("download_news_feature_shown", true);
        }

        private void showFirstVideoDialog() {
            if (this.cache.getBoolean("download_news_feature_shown", false)) {
                return;
            }
            Context context = this.context;
            ((BaseActivity)context).showDialog(null, context.getString(2131755643), (TaskCallback)new com.hintsolutions.raintv.services.video.a((Object)this), null, true, null, null);
        }

        public void onPrepareError(DownloadHelper object, IOException iOException) {
            Toast.makeText((Context)this.context.getApplicationContext(), (int)2131755206, (int)1).show();
            object = this.prepareListener;
            if (object != null) {
                object.onPrepareError();
            }
            Log.e((String)DownloadTracker.TAG, (String)"Failed to start download", (Throwable)iOException);
        }

        public void onPrepared(DownloadHelper object) {
            object = this.downloadHelper;
            if ((object = object.getTrackGroups(0)) != null) {
                int n;
                TrackGroup trackGroup = object.get(0);
                object = new ArrayList();
                for (n = 0; n < trackGroup.length; ++n) {
                    object.add(n, (Object)trackGroup.getFormat(n).getPixelCount());
                }
                Integer n2 = (Integer)Collections.max((Collection)object);
                trackGroup = (Integer)Collections.min((Collection)object);
                int n3 = object.indexOf((Object)n2);
                n = (int)Math.ceil((double)((float)object.size() / 2.0f));
                int n4 = object.indexOf((Object)trackGroup);
                this.trackKeys.add((Object)n3);
                this.trackKeys.add((Object)n);
                this.trackKeys.add((Object)n4);
            }
            if ((object = this.prepareListener) != null) {
                object.onPrepared();
            }
            this.builder.show();
        }

        public void prepare() {
            PrepareListener prepareListener = this.prepareListener;
            if (prepareListener != null) {
                prepareListener.onBeforePrepare();
            }
            this.downloadHelper.prepare((DownloadHelper.Callback)this);
        }
    }
}

