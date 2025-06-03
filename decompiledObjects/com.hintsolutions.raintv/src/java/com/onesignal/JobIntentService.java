/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Service
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.Intent
 *  android.os.AsyncTask
 *  android.os.Build$VERSION
 *  android.os.IBinder
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  com.onesignal.JobIntentService$CompatWorkItem
 *  java.lang.Class
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Void
 *  java.util.ArrayList
 *  java.util.HashMap
 */
package com.onesignal;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build;
import android.os.IBinder;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.onesignal.JobIntentService;
import java.util.ArrayList;
import java.util.HashMap;

abstract class JobIntentService
extends Service {
    public static final boolean DEBUG = false;
    public static final String TAG = "JobIntentService";
    public static final HashMap<ComponentNameWithWakeful, WorkEnqueuer> sClassWorkEnqueuer;
    public static final Object sLock;
    public final ArrayList<CompatWorkItem> mCompatQueue = new ArrayList();
    public WorkEnqueuer mCompatWorkEnqueuer;
    public CommandProcessor mCurProcessor;
    public boolean mDestroyed = false;
    public boolean mInterruptIfStopped = false;
    public CompatJobEngine mJobImpl;
    public boolean mStopped = false;

    static {
        sLock = new Object();
        sClassWorkEnqueuer = new HashMap();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void enqueueWork(@NonNull Context context, @NonNull ComponentName componentName, int n, @NonNull Intent intent, boolean bl) {
        Object object;
        if (intent == null) {
            throw new IllegalArgumentException("work must not be null");
        }
        Object object2 = object = sLock;
        synchronized (object2) {
            IllegalStateException illegalStateException2;
            block5: {
                WorkEnqueuer workEnqueuer = JobIntentService.getWorkEnqueuer(context, componentName, true, n, bl);
                workEnqueuer.ensureJobId(n);
                try {
                    workEnqueuer.enqueueWork(intent);
                }
                catch (IllegalStateException illegalStateException2) {
                    if (!bl) break block5;
                    JobIntentService.getWorkEnqueuer(context, componentName, true, n, false).enqueueWork(intent);
                }
                return;
            }
            throw illegalStateException2;
        }
    }

    public static void enqueueWork(@NonNull Context context, @NonNull Class clazz, int n, @NonNull Intent intent, boolean bl) {
        JobIntentService.enqueueWork(context, new ComponentName(context, clazz), n, intent, bl);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static WorkEnqueuer getWorkEnqueuer(Context context, ComponentName componentName, boolean bl, int n, boolean bl2) {
        WorkEnqueuer workEnqueuer;
        ComponentNameWithWakeful componentNameWithWakeful = new ComponentNameWithWakeful(componentName, bl2);
        HashMap<ComponentNameWithWakeful, WorkEnqueuer> hashMap = sClassWorkEnqueuer;
        WorkEnqueuer workEnqueuer2 = workEnqueuer = (WorkEnqueuer)hashMap.get((Object)componentNameWithWakeful);
        if (workEnqueuer != null) return workEnqueuer2;
        if (Build.VERSION.SDK_INT >= 26 && !bl2) {
            if (!bl) throw new IllegalArgumentException("Can't be here without a job id");
            context = new /* Unavailable Anonymous Inner Class!! */;
        } else {
            context = new /* Unavailable Anonymous Inner Class!! */;
        }
        hashMap.put((Object)componentNameWithWakeful, (Object)context);
        return context;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public GenericWorkItem dequeueWork() {
        Object object = this.mJobImpl;
        if (object != null && (object = object.dequeueWork()) != null) {
            return object;
        }
        ArrayList<CompatWorkItem> arrayList = object = this.mCompatQueue;
        synchronized (arrayList) {
            if (this.mCompatQueue.size() <= 0) return null;
            return (GenericWorkItem)this.mCompatQueue.remove(0);
        }
    }

    public boolean doStopCurrentWork() {
        CommandProcessor commandProcessor = this.mCurProcessor;
        if (commandProcessor != null) {
            commandProcessor.cancel(this.mInterruptIfStopped);
        }
        this.mStopped = true;
        return this.onStopCurrentWork();
    }

    public void ensureProcessorRunningLocked(boolean bl) {
        if (this.mCurProcessor == null) {
            this.mCurProcessor = new CommandProcessor(this);
            WorkEnqueuer workEnqueuer = this.mCompatWorkEnqueuer;
            if (workEnqueuer != null && bl) {
                workEnqueuer.serviceProcessingStarted();
            }
            this.mCurProcessor.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    public boolean isStopped() {
        return this.mStopped;
    }

    public IBinder onBind(@NonNull Intent object) {
        object = this.mJobImpl;
        if (object != null) {
            return object.compatGetBinder();
        }
        return null;
    }

    public void onCreate() {
        super.onCreate();
        if (Build.VERSION.SDK_INT >= 26) {
            this.mJobImpl = new /* Unavailable Anonymous Inner Class!! */;
            this.mCompatWorkEnqueuer = null;
        }
        this.mCompatWorkEnqueuer = JobIntentService.getWorkEnqueuer((Context)this, new ComponentName((Context)this, this.getClass()), false, 0, true);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void onDestroy() {
        ArrayList<CompatWorkItem> arrayList;
        super.onDestroy();
        this.doStopCurrentWork();
        ArrayList<CompatWorkItem> arrayList2 = arrayList = this.mCompatQueue;
        synchronized (arrayList2) {
            this.mDestroyed = true;
            this.mCompatWorkEnqueuer.serviceProcessingFinished();
            return;
        }
    }

    public abstract void onHandleWork(@NonNull Intent var1);

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public int onStartCommand(@Nullable Intent intent, int n, int n2) {
        ArrayList<CompatWorkItem> arrayList;
        this.mCompatWorkEnqueuer.serviceStartReceived();
        ArrayList<CompatWorkItem> arrayList2 = arrayList = this.mCompatQueue;
        synchronized (arrayList2) {
            ArrayList<CompatWorkItem> arrayList3 = this.mCompatQueue;
            if (intent == null) {
                intent = new Intent();
            }
            CompatWorkItem compatWorkItem = new /* Unavailable Anonymous Inner Class!! */;
            arrayList3.add((Object)compatWorkItem);
            this.ensureProcessorRunningLocked(true);
            return 3;
        }
    }

    public boolean onStopCurrentWork() {
        return true;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void processorFinished() {
        ArrayList<CompatWorkItem> arrayList = this.mCompatQueue;
        if (arrayList == null) return;
        ArrayList<CompatWorkItem> arrayList2 = arrayList;
        synchronized (arrayList2) {
            this.mCurProcessor = null;
            ArrayList<CompatWorkItem> arrayList3 = this.mCompatQueue;
            if (arrayList3 != null && arrayList3.size() > 0) {
                this.ensureProcessorRunningLocked(false);
            } else {
                if (this.mDestroyed) return;
                this.mCompatWorkEnqueuer.serviceProcessingFinished();
            }
            return;
        }
    }

    public void setInterruptIfStopped(boolean bl) {
        this.mInterruptIfStopped = bl;
    }

    public final class CommandProcessor
    extends AsyncTask<Void, Void, Void> {
        public final JobIntentService this$0;

        public CommandProcessor(JobIntentService jobIntentService) {
            this.this$0 = jobIntentService;
        }

        public Void doInBackground(Void ... object) {
            while ((object = this.this$0.dequeueWork()) != null) {
                this.this$0.onHandleWork(object.getIntent());
                object.complete();
            }
            return null;
        }

        public void onCancelled(Void void_) {
            this.this$0.processorFinished();
        }

        public void onPostExecute(Void void_) {
            this.this$0.processorFinished();
        }
    }

    public static interface CompatJobEngine {
        public IBinder compatGetBinder();

        public GenericWorkItem dequeueWork();
    }

    public static class ComponentNameWithWakeful {
        private ComponentName componentName;
        private boolean useWakefulService;

        public ComponentNameWithWakeful(ComponentName componentName, boolean bl) {
            this.componentName = componentName;
            this.useWakefulService = bl;
        }
    }

    public static interface GenericWorkItem {
        public void complete();

        public Intent getIntent();
    }

    public static abstract class WorkEnqueuer {
        public final ComponentName mComponentName;
        public boolean mHasJobId;
        public int mJobId;

        public WorkEnqueuer(ComponentName componentName) {
            this.mComponentName = componentName;
        }

        public abstract void enqueueWork(Intent var1);

        public void ensureJobId(int n) {
            block4: {
                block3: {
                    block2: {
                        if (this.mHasJobId) break block2;
                        this.mHasJobId = true;
                        this.mJobId = n;
                        break block3;
                    }
                    if (this.mJobId != n) break block4;
                }
                return;
            }
            StringBuilder stringBuilder = a.r("Given job ID ", n, " is different than previous ");
            stringBuilder.append(this.mJobId);
            throw new IllegalArgumentException(stringBuilder.toString());
        }

        public void serviceProcessingFinished() {
        }

        public void serviceProcessingStarted() {
        }

        public void serviceStartReceived() {
        }
    }
}

