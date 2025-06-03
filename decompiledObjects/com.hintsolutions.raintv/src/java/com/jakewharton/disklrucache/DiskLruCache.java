/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.io.BufferedWriter
 *  java.io.Closeable
 *  java.io.EOFException
 *  java.io.File
 *  java.io.FileInputStream
 *  java.io.FileNotFoundException
 *  java.io.FileOutputStream
 *  java.io.FilterOutputStream
 *  java.io.IOException
 *  java.io.InputStream
 *  java.io.InputStreamReader
 *  java.io.OutputStream
 *  java.io.OutputStreamWriter
 *  java.io.PrintStream
 *  java.io.Reader
 *  java.io.Writer
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.NumberFormatException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.Throwable
 *  java.lang.Void
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.Iterator
 *  java.util.LinkedHashMap
 *  java.util.Map$Entry
 *  java.util.concurrent.BlockingQueue
 *  java.util.concurrent.Callable
 *  java.util.concurrent.LinkedBlockingQueue
 *  java.util.concurrent.ThreadPoolExecutor
 *  java.util.concurrent.TimeUnit
 *  java.util.regex.Pattern
 */
package com.jakewharton.disklrucache;

import com.jakewharton.disklrucache.StrictLineReader;
import com.jakewharton.disklrucache.Util;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

public final class DiskLruCache
implements Closeable {
    public static final long ANY_SEQUENCE_NUMBER = -1L;
    private static final String CLEAN = "CLEAN";
    private static final String DIRTY = "DIRTY";
    public static final String JOURNAL_FILE = "journal";
    public static final String JOURNAL_FILE_BACKUP = "journal.bkp";
    public static final String JOURNAL_FILE_TEMP = "journal.tmp";
    public static final Pattern LEGAL_KEY_PATTERN = Pattern.compile((String)"[a-z0-9_-]{1,64}");
    public static final String MAGIC = "libcore.io.DiskLruCache";
    private static final OutputStream NULL_OUTPUT_STREAM = new OutputStream(){

        public void write(int n) throws IOException {
        }
    };
    private static final String READ = "READ";
    private static final String REMOVE = "REMOVE";
    public static final String VERSION_1 = "1";
    private final int appVersion;
    private final Callable<Void> cleanupCallable;
    private final File directory;
    public final ThreadPoolExecutor executorService;
    private final File journalFile;
    private final File journalFileBackup;
    private final File journalFileTmp;
    private Writer journalWriter;
    private final LinkedHashMap<String, Entry> lruEntries = new LinkedHashMap(0, 0.75f, true);
    private long maxSize;
    private long nextSequenceNumber = 0L;
    private int redundantOpCount;
    private long size = 0L;
    private final int valueCount;

    private DiskLruCache(File file, int n, int n2, long l) {
        this.executorService = new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, (BlockingQueue)new LinkedBlockingQueue());
        this.cleanupCallable = new Callable<Void>(this){
            public final DiskLruCache this$0;
            {
                this.this$0 = diskLruCache;
            }

            /*
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             */
            public Void call() throws Exception {
                DiskLruCache diskLruCache;
                DiskLruCache diskLruCache2 = diskLruCache = this.this$0;
                synchronized (diskLruCache2) {
                    if (this.this$0.journalWriter == null) {
                        return null;
                    }
                    this.this$0.trimToSize();
                    if (this.this$0.journalRebuildRequired()) {
                        this.this$0.rebuildJournal();
                        DiskLruCache.access$402(this.this$0, 0);
                    }
                    return null;
                }
            }
        };
        this.directory = file;
        this.appVersion = n;
        this.journalFile = new File(file, JOURNAL_FILE);
        this.journalFileTmp = new File(file, JOURNAL_FILE_TEMP);
        this.journalFileBackup = new File(file, JOURNAL_FILE_BACKUP);
        this.valueCount = n2;
        this.maxSize = l;
    }

    public static /* synthetic */ int access$402(DiskLruCache diskLruCache, int n) {
        diskLruCache.redundantOpCount = n;
        return n;
    }

    private void checkNotClosed() {
        if (this.journalWriter != null) {
            return;
        }
        throw new IllegalStateException("cache is closed");
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void completeEdit(Editor editor, boolean bl) throws IOException {
        DiskLruCache diskLruCache = this;
        synchronized (diskLruCache) {
            long l;
            File file;
            void var2_2;
            int n;
            Entry entry = editor.entry;
            if (entry.currentEditor != editor) {
                editor = new IllegalStateException();
                throw editor;
            }
            int n2 = n = 0;
            if (var2_2 != false) {
                n2 = n;
                if (!entry.readable) {
                    int n3 = 0;
                    while (true) {
                        n2 = n;
                        if (n3 >= this.valueCount) break;
                        if (!editor.written[n3]) {
                            editor.abort();
                            entry = new StringBuilder();
                            entry.append("Newly created entry didn't create value for index ");
                            entry.append(n3);
                            editor = new IllegalStateException(entry.toString());
                            throw editor;
                        }
                        if (!entry.getDirtyFile(n3).exists()) {
                            editor.abort();
                            return;
                        }
                        ++n3;
                    }
                }
            }
            while (n2 < this.valueCount) {
                file = entry.getDirtyFile(n2);
                if (var2_2 != false) {
                    if (file.exists()) {
                        long l2;
                        editor = entry.getCleanFile(n2);
                        file.renameTo((File)editor);
                        l = entry.lengths[n2];
                        ((Entry)entry).lengths[n2] = l2 = editor.length();
                        this.size = this.size - l + l2;
                    }
                } else {
                    DiskLruCache.deleteIfExists(file);
                }
                ++n2;
            }
            ++this.redundantOpCount;
            Entry.access$702(entry, null);
            if ((entry.readable | var2_2) != 0) {
                Entry.access$602(entry, true);
                editor = this.journalWriter;
                file = new StringBuilder();
                file.append("CLEAN ");
                file.append(entry.key);
                file.append(entry.getLengths());
                file.append('\n');
                editor.write(file.toString());
                if (var2_2 != false) {
                    l = this.nextSequenceNumber;
                    this.nextSequenceNumber = 1L + l;
                    Entry.access$1202(entry, l);
                }
            } else {
                this.lruEntries.remove((Object)entry.key);
                file = this.journalWriter;
                editor = new StringBuilder();
                editor.append("REMOVE ");
                editor.append(entry.key);
                editor.append('\n');
                file.write(editor.toString());
            }
            this.journalWriter.flush();
            if (this.size > this.maxSize || this.journalRebuildRequired()) {
                this.executorService.submit(this.cleanupCallable);
            }
            return;
        }
    }

    private static void deleteIfExists(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private Editor edit(String string2, long l) throws IOException {
        DiskLruCache diskLruCache = this;
        synchronized (diskLruCache) {
            Editor editor;
            long l2;
            void var2_2;
            this.checkNotClosed();
            this.validateKey(string2);
            Entry entry = (Entry)this.lruEntries.get((Object)string2);
            if (var2_2 != -1L && (entry == null || (l2 = entry.sequenceNumber) != var2_2)) {
                return null;
            }
            if (entry == null) {
                entry = new Entry(this, string2, null);
                this.lruEntries.put((Object)string2, (Object)entry);
            } else {
                editor = entry.currentEditor;
                if (editor != null) {
                    return null;
                }
            }
            editor = new Editor(this, entry, null);
            Entry.access$702(entry, editor);
            entry = this.journalWriter;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("DIRTY ");
            stringBuilder.append(string2);
            stringBuilder.append('\n');
            entry.write(stringBuilder.toString());
            this.journalWriter.flush();
            return editor;
        }
    }

    private static String inputStreamToString(InputStream inputStream) throws IOException {
        return Util.readFully((Reader)new InputStreamReader(inputStream, Util.UTF_8));
    }

    private boolean journalRebuildRequired() {
        int n = this.redundantOpCount;
        boolean bl = n >= 2000 && n >= this.lruEntries.size();
        return bl;
    }

    public static DiskLruCache open(File object, int n, int n2, long l) throws IOException {
        if (l > 0L) {
            if (n2 > 0) {
                Object object2;
                File file = new File((File)object, JOURNAL_FILE_BACKUP);
                if (file.exists()) {
                    object2 = new File((File)object, JOURNAL_FILE);
                    if (object2.exists()) {
                        file.delete();
                    } else {
                        DiskLruCache.renameTo(file, (File)object2, false);
                    }
                }
                object2 = new DiskLruCache((File)object, n, n2, l);
                if (((DiskLruCache)object2).journalFile.exists()) {
                    try {
                        super.readJournal();
                        super.processJournal();
                        file = new FileOutputStream(((DiskLruCache)object2).journalFile, true);
                        OutputStreamWriter outputStreamWriter = new OutputStreamWriter((OutputStream)file, Util.US_ASCII);
                        BufferedWriter bufferedWriter = new BufferedWriter((Writer)outputStreamWriter);
                        ((DiskLruCache)object2).journalWriter = bufferedWriter;
                        return object2;
                    }
                    catch (IOException iOException) {
                        PrintStream printStream = System.out;
                        file = new StringBuilder();
                        file.append("DiskLruCache ");
                        file.append(object);
                        file.append(" is corrupt: ");
                        file.append(iOException.getMessage());
                        file.append(", removing");
                        printStream.println(file.toString());
                        ((DiskLruCache)object2).delete();
                    }
                }
                object.mkdirs();
                object = new DiskLruCache((File)object, n, n2, l);
                super.rebuildJournal();
                return object;
            }
            throw new IllegalArgumentException("valueCount <= 0");
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    private void processJournal() throws IOException {
        DiskLruCache.deleteIfExists(this.journalFileTmp);
        Iterator iterator = this.lruEntries.values().iterator();
        while (iterator.hasNext()) {
            int n;
            Entry entry = (Entry)iterator.next();
            Editor editor = entry.currentEditor;
            int n2 = 0;
            if (editor == null) {
                for (n = 0; n < this.valueCount; ++n) {
                    this.size += entry.lengths[n];
                }
                continue;
            }
            Entry.access$702(entry, null);
            for (n = n2; n < this.valueCount; ++n) {
                DiskLruCache.deleteIfExists(entry.getCleanFile(n));
                DiskLruCache.deleteIfExists(entry.getDirtyFile(n));
            }
            iterator.remove();
        }
    }

    /*
     * Loose catch block
     */
    private void readJournal() throws IOException {
        String string2;
        String string3;
        Object object;
        String string4;
        String string5;
        StrictLineReader strictLineReader;
        block8: {
            boolean bl;
            strictLineReader = new StrictLineReader((InputStream)new FileInputStream(this.journalFile), Util.US_ASCII);
            string5 = strictLineReader.readLine();
            string4 = strictLineReader.readLine();
            object = strictLineReader.readLine();
            string3 = strictLineReader.readLine();
            string2 = strictLineReader.readLine();
            if (!MAGIC.equals((Object)string5) || !VERSION_1.equals((Object)string4) || !Integer.toString((int)this.appVersion).equals(object) || !Integer.toString((int)this.valueCount).equals((Object)string3) || !(bl = "".equals((Object)string2))) break block8;
            int n = 0;
            while (true) {
                try {
                    this.readJournalLine(strictLineReader.readLine());
                    ++n;
                }
                catch (EOFException eOFException) {
                    this.redundantOpCount = n - this.lruEntries.size();
                    return;
                }
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("unexpected journal header: [");
        stringBuilder.append(string5);
        stringBuilder.append(", ");
        stringBuilder.append(string4);
        stringBuilder.append(", ");
        stringBuilder.append(string3);
        stringBuilder.append(", ");
        stringBuilder.append(string2);
        stringBuilder.append("]");
        object = new IOException(stringBuilder.toString());
        throw object;
        {
            catch (Throwable throwable) {
                throw throwable;
            }
        }
        finally {
            Util.closeQuietly(strictLineReader);
        }
    }

    private void readJournalLine(String stringArray) throws IOException {
        block9: {
            block13: {
                block11: {
                    int n;
                    int n2;
                    block12: {
                        Object object;
                        block10: {
                            String string2;
                            n2 = stringArray.indexOf(32);
                            if (n2 == -1) break block9;
                            int n3 = n2 + 1;
                            n = stringArray.indexOf(32, n3);
                            if (n == -1) {
                                object = stringArray.substring(n3);
                                string2 = object;
                                if (n2 == 6) {
                                    string2 = object;
                                    if (stringArray.startsWith(REMOVE)) {
                                        this.lruEntries.remove(object);
                                        return;
                                    }
                                }
                            } else {
                                string2 = stringArray.substring(n3, n);
                            }
                            Entry entry = (Entry)this.lruEntries.get((Object)string2);
                            object = entry;
                            if (entry == null) {
                                object = new Entry(this, string2, null);
                                this.lruEntries.put((Object)string2, object);
                            }
                            if (n == -1 || n2 != 5 || !stringArray.startsWith(CLEAN)) break block10;
                            stringArray = stringArray.substring(n + 1).split(" ");
                            Entry.access$602((Entry)object, true);
                            Entry.access$702((Entry)object, null);
                            ((Entry)object).setLengths(stringArray);
                            break block11;
                        }
                        if (n != -1 || n2 != 5 || !stringArray.startsWith(DIRTY)) break block12;
                        Entry.access$702((Entry)object, new Editor(this, (Entry)object, null));
                        break block11;
                    }
                    if (n != -1 || n2 != 4 || !stringArray.startsWith(READ)) break block13;
                }
                return;
            }
            throw new IOException(z2.o("unexpected journal line: ", (String)stringArray));
        }
        throw new IOException(z2.o("unexpected journal line: ", (String)stringArray));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void rebuildJournal() throws IOException {
        DiskLruCache diskLruCache = this;
        synchronized (diskLruCache) {
            Object object2;
            FileOutputStream fileOutputStream;
            Writer writer;
            block9: {
                writer = this.journalWriter;
                if (writer != null) {
                    writer.close();
                }
                fileOutputStream = new FileOutputStream(this.journalFileTmp);
                object2 = new OutputStreamWriter((OutputStream)fileOutputStream, Util.US_ASCII);
                writer = new BufferedWriter((Writer)object2);
                writer.write(MAGIC);
                writer.write("\n");
                writer.write(VERSION_1);
                writer.write("\n");
                writer.write(Integer.toString((int)this.appVersion));
                writer.write("\n");
                writer.write(Integer.toString((int)this.valueCount));
                writer.write("\n");
                writer.write("\n");
                for (Object object2 : this.lruEntries.values()) {
                    StringBuilder stringBuilder;
                    if (((Entry)object2).currentEditor != null) {
                        stringBuilder = new StringBuilder();
                        stringBuilder.append("DIRTY ");
                        stringBuilder.append(((Entry)object2).key);
                        stringBuilder.append('\n');
                        writer.write(stringBuilder.toString());
                        continue;
                    }
                    stringBuilder = new StringBuilder();
                    stringBuilder.append("CLEAN ");
                    stringBuilder.append(((Entry)object2).key);
                    stringBuilder.append(((Entry)object2).getLengths());
                    stringBuilder.append('\n');
                    writer.write(stringBuilder.toString());
                }
                if (!this.journalFile.exists()) break block9;
                DiskLruCache.renameTo(this.journalFile, this.journalFileBackup, true);
            }
            DiskLruCache.renameTo(this.journalFileTmp, this.journalFile, false);
            this.journalFileBackup.delete();
            object2 = new FileOutputStream(this.journalFile, true);
            writer = new OutputStreamWriter((OutputStream)object2, Util.US_ASCII);
            fileOutputStream = new BufferedWriter(writer);
            this.journalWriter = fileOutputStream;
            return;
            finally {
                writer.close();
            }
        }
    }

    private static void renameTo(File file, File file2, boolean bl) throws IOException {
        if (bl) {
            DiskLruCache.deleteIfExists(file2);
        }
        if (file.renameTo(file2)) {
            return;
        }
        throw new IOException();
    }

    private void trimToSize() throws IOException {
        while (this.size > this.maxSize) {
            this.remove((String)((Map.Entry)this.lruEntries.entrySet().iterator().next()).getKey());
        }
    }

    private void validateKey(String string2) {
        if (LEGAL_KEY_PATTERN.matcher((CharSequence)string2).matches()) {
            return;
        }
        throw new IllegalArgumentException(z2.p("keys must match regex [a-z0-9_-]{1,64}: \"", string2, "\""));
    }

    public void close() throws IOException {
        DiskLruCache diskLruCache = this;
        synchronized (diskLruCache) {
            Writer writer;
            block5: {
                writer = this.journalWriter;
                if (writer != null) break block5;
                return;
            }
            writer = new ArrayList(this.lruEntries.values());
            for (Entry entry : writer) {
                if (entry.currentEditor == null) continue;
                entry.currentEditor.abort();
            }
            this.trimToSize();
            this.journalWriter.close();
            this.journalWriter = null;
            return;
        }
    }

    public void delete() throws IOException {
        this.close();
        Util.deleteContents(this.directory);
    }

    public Editor edit(String string2) throws IOException {
        return this.edit(string2, -1L);
    }

    public void flush() throws IOException {
        DiskLruCache diskLruCache = this;
        synchronized (diskLruCache) {
            this.checkNotClosed();
            this.trimToSize();
            this.journalWriter.flush();
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Snapshot get(String object) throws IOException {
        DiskLruCache diskLruCache = this;
        synchronized (diskLruCache) {
            int n;
            InputStream[] inputStreamArray;
            block12: {
                Writer writer;
                this.checkNotClosed();
                this.validateKey((String)object);
                Entry entry = (Entry)this.lruEntries.get(object);
                if (entry == null) {
                    return null;
                }
                boolean bl = entry.readable;
                if (!bl) {
                    return null;
                }
                inputStreamArray = new InputStream[this.valueCount];
                int n2 = 0;
                try {
                    for (n = 0; n < this.valueCount; ++n) {
                        inputStreamArray[n] = new FileInputStream(entry.getCleanFile(n));
                    }
                    ++this.redundantOpCount;
                    writer = this.journalWriter;
                }
                catch (FileNotFoundException fileNotFoundException) {
                    n = n2;
                    break block12;
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("READ ");
                stringBuilder.append((String)object);
                stringBuilder.append('\n');
                writer.append((CharSequence)stringBuilder.toString());
                if (!this.journalRebuildRequired()) return new Snapshot(this, (String)object, entry.sequenceNumber, inputStreamArray, entry.lengths, null);
                this.executorService.submit(this.cleanupCallable);
                return new Snapshot(this, (String)object, entry.sequenceNumber, inputStreamArray, entry.lengths, null);
            }
            while (n < this.valueCount) {
                InputStream inputStream = inputStreamArray[n];
                if (inputStream == null) return null;
                Util.closeQuietly((Closeable)inputStream);
                ++n;
            }
            return null;
        }
    }

    public File getDirectory() {
        return this.directory;
    }

    public long getMaxSize() {
        DiskLruCache diskLruCache = this;
        synchronized (diskLruCache) {
            long l = this.maxSize;
            return l;
        }
    }

    public boolean isClosed() {
        DiskLruCache diskLruCache = this;
        synchronized (diskLruCache) {
            Writer writer = this.journalWriter;
            boolean bl = writer == null;
            return bl;
        }
    }

    public boolean remove(String object) throws IOException {
        DiskLruCache diskLruCache = this;
        synchronized (diskLruCache) {
            block8: {
                File file;
                this.checkNotClosed();
                this.validateKey((String)object);
                Entry entry = (Entry)this.lruEntries.get(object);
                if (entry == null) break block8;
                if (entry.currentEditor != null) break block8;
                for (int i = 0; i < this.valueCount; ++i) {
                    file = entry.getCleanFile(i);
                    if (file.exists() && !file.delete()) {
                        entry = new StringBuilder();
                        entry.append("failed to delete ");
                        entry.append(file);
                        object = new IOException(entry.toString());
                        throw object;
                    }
                    this.size -= entry.lengths[i];
                    ((Entry)entry).lengths[i] = 0L;
                }
                ++this.redundantOpCount;
                file = this.journalWriter;
                entry = new StringBuilder();
                entry.append("REMOVE ");
                entry.append((String)object);
                entry.append('\n');
                file.append((CharSequence)entry.toString());
                this.lruEntries.remove(object);
                if (this.journalRebuildRequired()) {
                    this.executorService.submit(this.cleanupCallable);
                }
                return true;
            }
            return false;
        }
    }

    public void setMaxSize(long l) {
        DiskLruCache diskLruCache = this;
        synchronized (diskLruCache) {
            this.maxSize = l;
            this.executorService.submit(this.cleanupCallable);
            return;
        }
    }

    public long size() {
        DiskLruCache diskLruCache = this;
        synchronized (diskLruCache) {
            long l = this.size;
            return l;
        }
    }

    public final class Editor {
        private boolean committed;
        private final Entry entry;
        private boolean hasErrors;
        public final DiskLruCache this$0;
        private final boolean[] written;

        private Editor(DiskLruCache object, Entry entry) {
            this.this$0 = object;
            this.entry = entry;
            object = entry.readable ? null : (Object)new boolean[((DiskLruCache)object).valueCount];
            this.written = (boolean[])object;
        }

        public /* synthetic */ Editor(DiskLruCache diskLruCache, Entry entry, 1 var3_3) {
            this(diskLruCache, entry);
        }

        public static /* synthetic */ boolean access$2302(Editor editor, boolean bl) {
            editor.hasErrors = bl;
            return bl;
        }

        public void abort() throws IOException {
            this.this$0.completeEdit(this, false);
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public void abortUnlessCommitted() {
            if (this.committed) return;
            try {
                this.abort();
                return;
            }
            catch (IOException iOException) {
                return;
            }
        }

        public void commit() throws IOException {
            if (this.hasErrors) {
                this.this$0.completeEdit(this, false);
                this.this$0.remove(this.entry.key);
            } else {
                this.this$0.completeEdit(this, true);
            }
            this.committed = true;
        }

        public String getString(int n) throws IOException {
            Object object = this.newInputStream(n);
            object = object != null ? DiskLruCache.inputStreamToString(object) : null;
            return object;
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public InputStream newInputStream(int n) throws IOException {
            DiskLruCache diskLruCache;
            DiskLruCache diskLruCache2 = diskLruCache = this.this$0;
            synchronized (diskLruCache2) {
                if (this.entry.currentEditor != this) {
                    IllegalStateException illegalStateException = new IllegalStateException();
                    throw illegalStateException;
                }
                if (!this.entry.readable) {
                    return null;
                }
                try {
                    return new FileInputStream(this.entry.getCleanFile(n));
                }
                catch (FileNotFoundException fileNotFoundException) {
                    return null;
                }
            }
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public OutputStream newOutputStream(int n) throws IOException {
            DiskLruCache diskLruCache;
            DiskLruCache diskLruCache2 = diskLruCache = this.this$0;
            synchronized (diskLruCache2) {
                FileOutputStream fileOutputStream;
                if (this.entry.currentEditor != this) {
                    IllegalStateException illegalStateException = new IllegalStateException();
                    throw illegalStateException;
                }
                if (!this.entry.readable) {
                    this.written[n] = true;
                }
                Object object = this.entry.getDirtyFile(n);
                try {
                    fileOutputStream = new FileOutputStream(object);
                    return new FaultHidingOutputStream(this, (OutputStream)fileOutputStream, null);
                }
                catch (FileNotFoundException fileNotFoundException) {
                    this.this$0.directory.mkdirs();
                    try {
                        fileOutputStream = new FileOutputStream(object);
                        return new FaultHidingOutputStream(this, (OutputStream)fileOutputStream, null);
                    }
                    catch (FileNotFoundException fileNotFoundException2) {
                        return NULL_OUTPUT_STREAM;
                    }
                }
            }
        }

        /*
         * WARNING - void declaration
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public void set(int n, String string2) throws IOException {
            void var2_5;
            OutputStreamWriter outputStreamWriter;
            block4: {
                OutputStreamWriter outputStreamWriter2;
                outputStreamWriter = null;
                try {
                    outputStreamWriter2 = new OutputStreamWriter(this.newOutputStream(n), Util.UTF_8);
                }
                catch (Throwable throwable) {
                    // empty catch block
                    break block4;
                }
                try {
                    outputStreamWriter2.write(string2);
                }
                catch (Throwable throwable) {
                    outputStreamWriter = outputStreamWriter2;
                    break block4;
                }
                Util.closeQuietly((Closeable)outputStreamWriter2);
                return;
            }
            Util.closeQuietly(outputStreamWriter);
            throw var2_5;
        }

        public class FaultHidingOutputStream
        extends FilterOutputStream {
            public final Editor this$1;

            private FaultHidingOutputStream(Editor editor, OutputStream outputStream) {
                this.this$1 = editor;
                super(outputStream);
            }

            public /* synthetic */ FaultHidingOutputStream(Editor editor, OutputStream outputStream, 1 var3_3) {
                this(editor, outputStream);
            }

            public void close() {
                try {
                    this.out.close();
                }
                catch (IOException iOException) {
                    Editor.access$2302(this.this$1, true);
                }
            }

            public void flush() {
                try {
                    this.out.flush();
                }
                catch (IOException iOException) {
                    Editor.access$2302(this.this$1, true);
                }
            }

            public void write(int n) {
                try {
                    this.out.write(n);
                }
                catch (IOException iOException) {
                    Editor.access$2302(this.this$1, true);
                }
            }

            public void write(byte[] byArray, int n, int n2) {
                try {
                    this.out.write(byArray, n, n2);
                }
                catch (IOException iOException) {
                    Editor.access$2302(this.this$1, true);
                }
            }
        }
    }

    public final class Entry {
        private Editor currentEditor;
        private final String key;
        private final long[] lengths;
        private boolean readable;
        private long sequenceNumber;
        public final DiskLruCache this$0;

        private Entry(DiskLruCache diskLruCache, String string2) {
            this.this$0 = diskLruCache;
            this.key = string2;
            this.lengths = new long[diskLruCache.valueCount];
        }

        public /* synthetic */ Entry(DiskLruCache diskLruCache, String string2, 1 var3_3) {
            this(diskLruCache, string2);
        }

        public static /* synthetic */ long access$1202(Entry entry, long l) {
            entry.sequenceNumber = l;
            return l;
        }

        public static /* synthetic */ boolean access$602(Entry entry, boolean bl) {
            entry.readable = bl;
            return bl;
        }

        public static /* synthetic */ Editor access$702(Entry entry, Editor editor) {
            entry.currentEditor = editor;
            return editor;
        }

        private IOException invalidLengths(String[] stringArray) throws IOException {
            StringBuilder stringBuilder = z2.t("unexpected journal line: ");
            stringBuilder.append(Arrays.toString((Object[])stringArray));
            throw new IOException(stringBuilder.toString());
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        private void setLengths(String[] stringArray) throws IOException {
            if (stringArray.length != this.this$0.valueCount) {
                throw this.invalidLengths(stringArray);
            }
            int n = 0;
            try {
                while (true) {
                    if (n >= stringArray.length) {
                        return;
                    }
                    this.lengths[n] = Long.parseLong((String)stringArray[n]);
                    ++n;
                }
            }
            catch (NumberFormatException numberFormatException) {
                throw this.invalidLengths(stringArray);
            }
        }

        public File getCleanFile(int n) {
            File file = this.this$0.directory;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.key);
            stringBuilder.append(".");
            stringBuilder.append(n);
            return new File(file, stringBuilder.toString());
        }

        public File getDirtyFile(int n) {
            File file = this.this$0.directory;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.key);
            stringBuilder.append(".");
            stringBuilder.append(n);
            stringBuilder.append(".tmp");
            return new File(file, stringBuilder.toString());
        }

        public String getLengths() throws IOException {
            StringBuilder stringBuilder = new StringBuilder();
            for (long l : this.lengths) {
                stringBuilder.append(' ');
                stringBuilder.append(l);
            }
            return stringBuilder.toString();
        }
    }

    public final class Snapshot
    implements Closeable {
        private final InputStream[] ins;
        private final String key;
        private final long[] lengths;
        private final long sequenceNumber;
        public final DiskLruCache this$0;

        private Snapshot(DiskLruCache diskLruCache, String string2, long l, InputStream[] inputStreamArray, long[] lArray) {
            this.this$0 = diskLruCache;
            this.key = string2;
            this.sequenceNumber = l;
            this.ins = inputStreamArray;
            this.lengths = lArray;
        }

        public /* synthetic */ Snapshot(DiskLruCache diskLruCache, String string2, long l, InputStream[] inputStreamArray, long[] lArray, 1 var7_6) {
            this(diskLruCache, string2, l, inputStreamArray, lArray);
        }

        public void close() {
            InputStream[] inputStreamArray = this.ins;
            int n = inputStreamArray.length;
            for (int i = 0; i < n; ++i) {
                Util.closeQuietly((Closeable)inputStreamArray[i]);
            }
        }

        public Editor edit() throws IOException {
            return this.this$0.edit(this.key, this.sequenceNumber);
        }

        public InputStream getInputStream(int n) {
            return this.ins[n];
        }

        public long getLength(int n) {
            return this.lengths[n];
        }

        public String getString(int n) throws IOException {
            return DiskLruCache.inputStreamToString(this.getInputStream(n));
        }
    }
}

