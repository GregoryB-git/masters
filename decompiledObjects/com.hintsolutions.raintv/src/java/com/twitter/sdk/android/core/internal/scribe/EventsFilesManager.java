/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  java.io.File
 *  java.io.IOException
 *  java.lang.Exception
 *  java.lang.Long
 *  java.lang.NumberFormatException
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Comparator
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Locale
 *  java.util.TreeSet
 *  java.util.concurrent.CopyOnWriteArrayList
 */
package com.twitter.sdk.android.core.internal.scribe;

import android.content.Context;
import com.twitter.sdk.android.core.internal.CommonUtils;
import com.twitter.sdk.android.core.internal.CurrentTimeProvider;
import com.twitter.sdk.android.core.internal.scribe.EventTransform;
import com.twitter.sdk.android.core.internal.scribe.EventsStorage;
import com.twitter.sdk.android.core.internal.scribe.EventsStorageListener;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArrayList;

public abstract class EventsFilesManager<T> {
    public static final int MAX_BYTE_SIZE_PER_FILE = 8000;
    public static final int MAX_FILES_IN_BATCH = 1;
    public static final int MAX_FILES_TO_KEEP = 100;
    public static final String ROLL_OVER_FILE_NAME_SEPARATOR = "_";
    public final Context context;
    public final CurrentTimeProvider currentTimeProvider;
    private final int defaultMaxFilesToKeep;
    public final EventsStorage eventStorage;
    public volatile long lastRollOverTime;
    public final List<EventsStorageListener> rollOverListeners = new CopyOnWriteArrayList();
    public final EventTransform<T> transform;

    public EventsFilesManager(Context context, EventTransform<T> eventTransform, CurrentTimeProvider currentTimeProvider, EventsStorage eventsStorage, int n) throws IOException {
        this.context = context.getApplicationContext();
        this.transform = eventTransform;
        this.eventStorage = eventsStorage;
        this.currentTimeProvider = currentTimeProvider;
        this.lastRollOverTime = currentTimeProvider.getCurrentTimeMillis();
        this.defaultMaxFilesToKeep = n;
    }

    private void rollFileOverIfNeeded(int n) throws IOException {
        if (!this.eventStorage.canWorkingFileStore(n, this.getMaxByteSizePerFile())) {
            String string2 = String.format((Locale)Locale.US, (String)"session analytics events file is %d bytes, new event is %d bytes, this is over flush limit of %d, rolling it over", (Object[])new Object[]{this.eventStorage.getWorkingFileUsedSizeInBytes(), n, this.getMaxByteSizePerFile()});
            CommonUtils.logControlled(this.context, 4, "Twitter", string2);
            this.rollFileOver();
        }
    }

    private void triggerRollOverOnListeners(String string2) {
        for (EventsStorageListener eventsStorageListener : this.rollOverListeners) {
            try {
                eventsStorageListener.onRollOver(string2);
            }
            catch (Exception exception) {
                CommonUtils.logControlledError(this.context, "One of the roll over listeners threw an exception", exception);
            }
        }
    }

    public void deleteAllEventsFiles() {
        EventsStorage eventsStorage = this.eventStorage;
        eventsStorage.deleteFilesInRollOverDirectory(eventsStorage.getAllFilesInRollOverDirectory());
        this.eventStorage.deleteWorkingFile();
    }

    public void deleteOldestInRollOverIfOverMax() {
        Iterator iterator = this.eventStorage.getAllFilesInRollOverDirectory();
        int n = this.getMaxFilesToKeep();
        if (iterator.size() <= n) {
            return;
        }
        int n2 = iterator.size() - n;
        CommonUtils.logControlled(this.context, String.format((Locale)Locale.US, (String)"Found %d files in  roll over directory, this is greater than %d, deleting %d oldest files", (Object[])new Object[]{iterator.size(), n, n2}));
        TreeSet treeSet = new TreeSet((Comparator)new Comparator<FileWithTimestamp>(this){
            public final EventsFilesManager this$0;
            {
                this.this$0 = eventsFilesManager;
            }

            public int compare(FileWithTimestamp fileWithTimestamp, FileWithTimestamp fileWithTimestamp2) {
                return (int)(fileWithTimestamp.timestamp - fileWithTimestamp2.timestamp);
            }
        });
        for (File file : iterator) {
            treeSet.add((Object)new FileWithTimestamp(file, this.parseCreationTimestampFromFileName(file.getName())));
        }
        iterator = new ArrayList();
        treeSet = treeSet.iterator();
        while (treeSet.hasNext()) {
            iterator.add((Object)((FileWithTimestamp)treeSet.next()).file);
            if (iterator.size() != n2) continue;
        }
        this.eventStorage.deleteFilesInRollOverDirectory((List<File>)iterator);
    }

    public void deleteSentFiles(List<File> list) {
        this.eventStorage.deleteFilesInRollOverDirectory(list);
    }

    public abstract String generateUniqueRollOverFileName();

    public List<File> getBatchOfFilesToSend() {
        return this.eventStorage.getBatchOfFilesToSend(1);
    }

    public long getLastRollOverTime() {
        return this.lastRollOverTime;
    }

    public int getMaxByteSizePerFile() {
        return 8000;
    }

    public int getMaxFilesToKeep() {
        return this.defaultMaxFilesToKeep;
    }

    public long parseCreationTimestampFromFileName(String stringArray) {
        if ((stringArray = stringArray.split(ROLL_OVER_FILE_NAME_SEPARATOR)).length != 3) {
            return 0L;
        }
        try {
            long l = Long.valueOf((String)stringArray[2]);
            return l;
        }
        catch (NumberFormatException numberFormatException) {
            return 0L;
        }
    }

    public void registerRollOverListener(EventsStorageListener eventsStorageListener) {
        if (eventsStorageListener != null) {
            this.rollOverListeners.add((Object)eventsStorageListener);
        }
    }

    public boolean rollFileOver() throws IOException {
        String string2;
        boolean bl = this.eventStorage.isWorkingFileEmpty();
        boolean bl2 = true;
        if (!bl) {
            string2 = this.generateUniqueRollOverFileName();
            this.eventStorage.rollOver(string2);
            CommonUtils.logControlled(this.context, 4, "Twitter", String.format((Locale)Locale.US, (String)"generated new file %s", (Object[])new Object[]{string2}));
            this.lastRollOverTime = this.currentTimeProvider.getCurrentTimeMillis();
        } else {
            string2 = null;
            bl2 = false;
        }
        this.triggerRollOverOnListeners(string2);
        return bl2;
    }

    public void writeEvent(T object) throws IOException {
        object = this.transform.toBytes(object);
        this.rollFileOverIfNeeded(((T)object).length);
        this.eventStorage.add((byte[])object);
    }

    public static class FileWithTimestamp {
        public final File file;
        public final long timestamp;

        public FileWithTimestamp(File file, long l) {
            this.file = file;
            this.timestamp = l;
        }
    }
}

