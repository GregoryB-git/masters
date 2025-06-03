/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.io.File
 *  java.io.IOException
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
 */
package com.twitter.sdk.android.core.internal.scribe;

import java.io.File;
import java.io.IOException;
import java.util.List;

public interface EventsStorage {
    public void add(byte[] var1) throws IOException;

    public boolean canWorkingFileStore(int var1, int var2);

    public void deleteFilesInRollOverDirectory(List<File> var1);

    public void deleteWorkingFile();

    public List<File> getAllFilesInRollOverDirectory();

    public List<File> getBatchOfFilesToSend(int var1);

    public File getRollOverDirectory();

    public File getWorkingDirectory();

    public int getWorkingFileUsedSizeInBytes();

    public boolean isWorkingFileEmpty();

    public void rollOver(String var1) throws IOException;
}

