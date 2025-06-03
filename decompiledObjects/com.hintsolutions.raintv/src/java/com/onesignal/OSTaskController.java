/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Thread
 *  java.util.Queue
 *  java.util.concurrent.ExecutorService
 *  java.util.concurrent.Executors
 *  java.util.concurrent.LinkedBlockingQueue
 *  java.util.concurrent.RejectedExecutionException
 *  java.util.concurrent.ThreadFactory
 *  java.util.concurrent.atomic.AtomicLong
 */
package com.onesignal;

import androidx.annotation.NonNull;
import com.onesignal.OSLogger;
import com.onesignal.OneSignal;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

class OSTaskController {
    public static final String OS_PENDING_EXECUTOR = "OS_PENDING_EXECUTOR_";
    private final AtomicLong lastTaskId;
    public final OSLogger logger;
    private ExecutorService pendingTaskExecutor;
    private final Queue<Runnable> taskQueueWaitingForInit = new LinkedBlockingQueue();

    public OSTaskController(OSLogger oSLogger) {
        this.lastTaskId = new AtomicLong();
        this.logger = oSLogger;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void addTaskToQueue(PendingTaskRunnable pendingTaskRunnable) {
        Queue<Runnable> queue;
        Queue<Runnable> queue2 = queue = this.taskQueueWaitingForInit;
        synchronized (queue2) {
            PendingTaskRunnable.access$002(pendingTaskRunnable, this.lastTaskId.incrementAndGet());
            Object object = this.pendingTaskExecutor;
            if (object == null) {
                object = this.logger;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Adding a task to the pending queue with ID: ");
                stringBuilder.append(pendingTaskRunnable.taskId);
                object.debug(stringBuilder.toString());
                this.taskQueueWaitingForInit.add((Object)pendingTaskRunnable);
            } else if (!object.isShutdown()) {
                object = this.logger;
                Object object2 = new StringBuilder();
                object2.append("Executor is still running, add to the executor with ID: ");
                object2.append(pendingTaskRunnable.taskId);
                object.debug(object2.toString());
                try {
                    this.pendingTaskExecutor.submit((Runnable)pendingTaskRunnable);
                }
                catch (RejectedExecutionException rejectedExecutionException) {
                    object2 = this.logger;
                    object = new StringBuilder();
                    object.append("Executor is shutdown, running task manually with ID: ");
                    object.append(pendingTaskRunnable.taskId);
                    object2.info(object.toString());
                    pendingTaskRunnable.run();
                    rejectedExecutionException.printStackTrace();
                }
            }
            return;
        }
    }

    private void onTaskRan(long l) {
        if (this.lastTaskId.get() == l) {
            OneSignal.Log(OneSignal.LOG_LEVEL.INFO, "Last Pending Task has ran, shutting down");
            this.pendingTaskExecutor.shutdown();
        }
    }

    public void addTaskToQueue(Runnable runnable) {
        this.addTaskToQueue(new PendingTaskRunnable(this, runnable));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Queue<Runnable> getTaskQueueWaitingForInit() {
        Queue<Runnable> queue;
        Queue<Runnable> queue2 = queue = this.taskQueueWaitingForInit;
        synchronized (queue2) {
            return this.taskQueueWaitingForInit;
        }
    }

    public boolean shouldRunTaskThroughQueue() {
        if (Thread.currentThread().getName().contains((CharSequence)OS_PENDING_EXECUTOR)) {
            return false;
        }
        if (OneSignal.isInitDone() && this.pendingTaskExecutor == null) {
            return false;
        }
        if (!OneSignal.isInitDone() && this.pendingTaskExecutor == null) {
            return true;
        }
        return this.pendingTaskExecutor.isShutdown() ^ true;
    }

    public void shutdownNow() {
        ExecutorService executorService = this.pendingTaskExecutor;
        if (executorService != null) {
            executorService.shutdownNow();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void startPendingTasks() {
        Queue<Runnable> queue;
        Queue<Runnable> queue2 = queue = this.taskQueueWaitingForInit;
        synchronized (queue2) {
            Object object = OneSignal.LOG_LEVEL.DEBUG;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("startPendingTasks with task queue quantity: ");
            stringBuilder.append(this.taskQueueWaitingForInit.size());
            OneSignal.Log(object, stringBuilder.toString());
            if (!this.taskQueueWaitingForInit.isEmpty()) {
                object = new ThreadFactory(this){
                    public final OSTaskController this$0;
                    {
                        this.this$0 = oSTaskController;
                    }

                    public Thread newThread(@NonNull Runnable runnable) {
                        Thread thread = new Thread(runnable);
                        runnable = z2.t(OSTaskController.OS_PENDING_EXECUTOR);
                        runnable.append(thread.getId());
                        thread.setName(runnable.toString());
                        return thread;
                    }
                };
                this.pendingTaskExecutor = Executors.newSingleThreadExecutor((ThreadFactory)object);
                while (!this.taskQueueWaitingForInit.isEmpty()) {
                    this.pendingTaskExecutor.submit((Runnable)this.taskQueueWaitingForInit.poll());
                }
            }
            return;
        }
    }

    public static class PendingTaskRunnable
    implements Runnable {
        private OSTaskController controller;
        private Runnable innerTask;
        private long taskId;

        public PendingTaskRunnable(OSTaskController oSTaskController, Runnable runnable) {
            this.controller = oSTaskController;
            this.innerTask = runnable;
        }

        public static /* synthetic */ long access$002(PendingTaskRunnable pendingTaskRunnable, long l) {
            pendingTaskRunnable.taskId = l;
            return l;
        }

        public void run() {
            this.innerTask.run();
            this.controller.onTaskRan(this.taskId);
        }

        public String toString() {
            StringBuilder stringBuilder = z2.t("PendingTaskRunnable{innerTask=");
            stringBuilder.append((Object)this.innerTask);
            stringBuilder.append(", taskId=");
            return a.o(stringBuilder, this.taskId, '}');
        }
    }
}

