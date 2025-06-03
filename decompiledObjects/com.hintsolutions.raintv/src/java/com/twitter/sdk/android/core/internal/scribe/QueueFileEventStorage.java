/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  java.io.Closeable
 *  java.io.File
 *  java.io.FileInputStream
 *  java.io.FileOutputStream
 *  java.io.IOException
 *  java.io.InputStream
 *  java.io.OutputStream
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.List
 */
package com.twitter.sdk.android.core.internal.scribe;

import android.content.Context;
import com.twitter.sdk.android.core.internal.CommonUtils;
import com.twitter.sdk.android.core.internal.scribe.EventsStorage;
import com.twitter.sdk.android.core.internal.scribe.QueueFile;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QueueFileEventStorage
implements EventsStorage {
    private final Context context;
    private QueueFile queueFile;
    private File targetDirectory;
    private final String targetDirectoryName;
    private final File workingDirectory;
    private final File workingFile;

    public QueueFileEventStorage(Context context, File file, String string2, String string3) throws IOException {
        this.context = context;
        this.workingDirectory = file;
        this.targetDirectoryName = string3;
        context = new File(file, string2);
        this.workingFile = context;
        this.queueFile = new QueueFile((File)context);
        this.createTargetDirectory();
    }

    private void createTargetDirectory() {
        File file;
        this.targetDirectory = file = new File(this.workingDirectory, this.targetDirectoryName);
        if (!file.exists()) {
            this.targetDirectory.mkdirs();
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void move(File file, File file2) throws IOException {
        void var2_5;
        File file3;
        File file4;
        block4: {
            FileInputStream fileInputStream;
            file4 = null;
            file3 = null;
            try {
                fileInputStream = new FileInputStream(file);
                file4 = file3;
            }
            catch (Throwable throwable) {
                file3 = null;
                break block4;
            }
            try {
                file4 = file2 = this.getMoveOutputStream(file2);
                CommonUtils.copyStream((InputStream)fileInputStream, (OutputStream)file2, new byte[1024]);
            }
            catch (Throwable throwable) {
                file3 = file4;
                file4 = fileInputStream;
                break block4;
            }
            CommonUtils.closeOrLog((Closeable)fileInputStream, "Failed to close file input stream");
            CommonUtils.closeOrLog((Closeable)file2, "Failed to close output stream");
            file.delete();
            return;
        }
        CommonUtils.closeOrLog(file4, "Failed to close file input stream");
        CommonUtils.closeOrLog(file3, "Failed to close output stream");
        file.delete();
        throw var2_5;
    }

    @Override
    public void add(byte[] byArray) throws IOException {
        this.queueFile.add(byArray);
    }

    @Override
    public boolean canWorkingFileStore(int n, int n2) {
        return this.queueFile.hasSpaceFor(n, n2);
    }

    @Override
    public void deleteFilesInRollOverDirectory(List<File> iterator) {
        for (File file : iterator) {
            CommonUtils.logControlled(this.context, String.format((String)"deleting sent analytics file %s", (Object[])new Object[]{file.getName()}));
            file.delete();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void deleteWorkingFile() {
        try {
            this.queueFile.close();
        }
        catch (IOException iOException) {}
        this.workingFile.delete();
    }

    @Override
    public List<File> getAllFilesInRollOverDirectory() {
        return Arrays.asList((Object[])this.targetDirectory.listFiles());
    }

    @Override
    public List<File> getBatchOfFilesToSend(int n) {
        ArrayList arrayList = new ArrayList();
        File[] fileArray = this.targetDirectory.listFiles();
        int n2 = fileArray.length;
        for (int i = 0; i < n2; ++i) {
            arrayList.add((Object)fileArray[i]);
            if (arrayList.size() >= n) break;
        }
        return arrayList;
    }

    public OutputStream getMoveOutputStream(File file) throws IOException {
        return new FileOutputStream(file);
    }

    @Override
    public File getRollOverDirectory() {
        return this.targetDirectory;
    }

    @Override
    public File getWorkingDirectory() {
        return this.workingDirectory;
    }

    @Override
    public int getWorkingFileUsedSizeInBytes() {
        return this.queueFile.usedBytes();
    }

    @Override
    public boolean isWorkingFileEmpty() {
        return this.queueFile.isEmpty();
    }

    @Override
    public void rollOver(String string2) throws IOException {
        this.queueFile.close();
        this.move(this.workingFile, new File(this.targetDirectory, string2));
        this.queueFile = new QueueFile(this.workingFile);
    }
}

