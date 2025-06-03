/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.graphics.BitmapFactory
 *  java.io.BufferedInputStream
 *  java.io.BufferedOutputStream
 *  java.io.File
 *  java.io.FilterOutputStream
 *  java.io.IOException
 *  java.io.InputStream
 *  java.io.ObjectInputStream
 *  java.io.ObjectOutputStream
 *  java.io.OutputStream
 *  java.io.Serializable
 *  java.lang.AssertionError
 *  java.lang.Class
 *  java.lang.ClassNotFoundException
 *  java.lang.Exception
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.math.BigInteger
 *  java.security.MessageDigest
 *  java.util.ArrayList
 *  java.util.HashMap
 *  java.util.List
 *  java.util.Map
 *  org.apache.commons.io.IOUtils
 */
package ru.tvrain.core.simplediskcache;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.jakewharton.disklrucache.DiskLruCache;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.commons.io.IOUtils;

public class SimpleDiskCache {
    private static final int METADATA_IDX = 1;
    private static final int VALUE_IDX = 0;
    private static final List<File> usedDirs = new ArrayList();
    private DiskLruCache diskLruCache;
    private int mAppVersion;

    private SimpleDiskCache(File file, int n3, long l4) throws IOException {
        this.mAppVersion = n3;
        this.diskLruCache = DiskLruCache.open(file, n3, 2, l4);
    }

    private String md5(String string2) {
        try {
            Object object = MessageDigest.getInstance((String)"MD5");
            object.update(string2.getBytes("UTF-8"));
            object = object.digest();
            string2 = new BigInteger(1, (byte[])object);
            string2 = string2.toString(16);
            return string2;
        }
        catch (Exception exception) {
            throw new AssertionError();
        }
    }

    public static SimpleDiskCache open(File object, int n3, long l4) throws IOException {
        Class<SimpleDiskCache> clazz = SimpleDiskCache.class;
        synchronized (SimpleDiskCache.class) {
            StringBuilder stringBuilder;
            block4: {
                stringBuilder = usedDirs;
                if (stringBuilder.contains(object)) break block4;
                stringBuilder.add(object);
                object = new SimpleDiskCache((File)object, n3, l4);
                // ** MonitorExit[var6_4] (shouldn't be in output)
                return object;
            }
            stringBuilder = new StringBuilder();
            stringBuilder.append("Cache dir ");
            stringBuilder.append(object.getAbsolutePath());
            stringBuilder.append(" was used before.");
            IllegalStateException illegalStateException = new IllegalStateException(stringBuilder.toString());
            throw illegalStateException;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private Map<String, Serializable> readMetadata(DiskLruCache.Snapshot snapshot) throws IOException {
        void var1_4;
        DiskLruCache.Snapshot snapshot2;
        block7: {
            Object object;
            RuntimeException runtimeException;
            block8: {
                DiskLruCache.Snapshot snapshot3;
                runtimeException = null;
                snapshot2 = snapshot3 = null;
                try {
                    snapshot2 = snapshot3;
                    snapshot2 = snapshot3;
                    BufferedInputStream bufferedInputStream = new BufferedInputStream(snapshot.getInputStream(1));
                    snapshot2 = snapshot3;
                    object = new ObjectInputStream((InputStream)bufferedInputStream);
                }
                catch (Throwable throwable) {
                    break block7;
                }
                catch (ClassNotFoundException classNotFoundException) {
                    snapshot = runtimeException;
                    break block8;
                }
                try {
                    snapshot = (Map)object.readObject();
                }
                catch (Throwable throwable) {
                    snapshot2 = object;
                    break block7;
                }
                catch (ClassNotFoundException classNotFoundException) {
                    snapshot = object;
                    object = classNotFoundException;
                    break block8;
                }
                IOUtils.closeQuietly((InputStream)object);
                return snapshot;
            }
            snapshot2 = snapshot;
            {
                snapshot2 = snapshot;
                runtimeException = new RuntimeException((Throwable)object);
                snapshot2 = snapshot;
                throw runtimeException;
            }
        }
        IOUtils.closeQuietly(snapshot2);
        throw var1_4;
    }

    private String toInternalKey(String string2) {
        return this.md5(string2);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void writeMetadata(Map<String, ? extends Serializable> map, DiskLruCache.Editor editor) throws IOException {
        void var1_4;
        block4: {
            ObjectOutputStream objectOutputStream;
            Object var3_6 = null;
            try {
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(editor.newOutputStream(1));
                objectOutputStream = new ObjectOutputStream((OutputStream)bufferedOutputStream);
            }
            catch (Throwable throwable) {
                editor = var3_6;
                break block4;
            }
            try {
                objectOutputStream.writeObject(map);
            }
            catch (Throwable throwable) {
                editor = objectOutputStream;
                break block4;
            }
            IOUtils.closeQuietly((OutputStream)objectOutputStream);
            return;
        }
        IOUtils.closeQuietly((OutputStream)editor);
        throw var1_4;
    }

    public void clear() throws IOException {
        File file = this.diskLruCache.getDirectory();
        long l4 = this.diskLruCache.getMaxSize();
        this.diskLruCache.delete();
        this.diskLruCache = DiskLruCache.open(file, this.mAppVersion, 2, l4);
    }

    public boolean contains(String object) throws IOException {
        if ((object = this.diskLruCache.get(this.toInternalKey((String)object))) == null) {
            return false;
        }
        ((DiskLruCache.Snapshot)object).close();
        return true;
    }

    public BitmapEntry getBitmap(String object) throws IOException {
        if ((object = this.diskLruCache.get(this.toInternalKey((String)object))) == null) {
            return null;
        }
        try {
            BitmapEntry bitmapEntry = new BitmapEntry(BitmapFactory.decodeStream((InputStream)((DiskLruCache.Snapshot)object).getInputStream(0)), this.readMetadata((DiskLruCache.Snapshot)object));
            return bitmapEntry;
        }
        finally {
            ((DiskLruCache.Snapshot)object).close();
        }
    }

    public DiskLruCache getCache() {
        return this.diskLruCache;
    }

    public InputStreamEntry getInputStream(String object) throws IOException {
        if ((object = this.diskLruCache.get(this.toInternalKey((String)object))) == null) {
            return null;
        }
        return new InputStreamEntry((DiskLruCache.Snapshot)object, this.readMetadata((DiskLruCache.Snapshot)object));
    }

    public StringEntry getString(String object) throws IOException {
        if ((object = this.diskLruCache.get(this.toInternalKey((String)object))) == null) {
            return null;
        }
        try {
            StringEntry stringEntry = new StringEntry(((DiskLruCache.Snapshot)object).getString(0), this.readMetadata((DiskLruCache.Snapshot)object));
            return stringEntry;
        }
        finally {
            ((DiskLruCache.Snapshot)object).close();
        }
    }

    public OutputStream openStream(String string2) throws IOException {
        return this.openStream(string2, (Map<String, ? extends Serializable>)new HashMap());
    }

    public OutputStream openStream(String object, Map<String, ? extends Serializable> object2) throws IOException {
        object = this.diskLruCache.edit(this.toInternalKey((String)object));
        try {
            this.writeMetadata((Map<String, ? extends Serializable>)object2, (DiskLruCache.Editor)object);
            object2 = new BufferedOutputStream(((DiskLruCache.Editor)object).newOutputStream(0));
            object2 = new CacheOutputStream(this, (OutputStream)object2, (DiskLruCache.Editor)object, null);
            return object2;
        }
        catch (IOException iOException) {
            ((DiskLruCache.Editor)object).abort();
            throw iOException;
        }
    }

    public void put(String string2, InputStream inputStream) throws IOException {
        this.put(string2, inputStream, (Map<String, Serializable>)new HashMap());
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void put(String string2, InputStream inputStream, Map<String, Serializable> outputStream) throws IOException {
        void var1_4;
        block5: {
            block6: {
                try {
                    outputStream = this.openStream(string2, (Map<String, ? extends Serializable>)outputStream);
                }
                catch (Throwable throwable) {
                    inputStream = null;
                    break block5;
                }
                try {
                    IOUtils.copy((InputStream)inputStream, (OutputStream)outputStream);
                    if (outputStream == null) break block6;
                }
                catch (Throwable throwable) {
                    inputStream = outputStream;
                    break block5;
                }
                outputStream.close();
            }
            return;
        }
        if (inputStream != null) {
            inputStream.close();
        }
        throw var1_4;
    }

    public void put(String string2, String string3) throws IOException {
        this.put(string2, string3, (Map<String, ? extends Serializable>)new HashMap());
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void put(String string2, String string3, Map<String, ? extends Serializable> map) throws IOException {
        void var2_5;
        block5: {
            try {
                string2 = this.openStream(string2, map);
            }
            catch (Throwable throwable) {
                string2 = null;
                break block5;
            }
            try {
                string2.write(string3.getBytes());
            }
            catch (Throwable throwable) {
                break block5;
            }
            string2.close();
            return;
        }
        if (string2 != null) {
            string2.close();
        }
        throw var2_5;
    }

    public static class BitmapEntry {
        private final Bitmap bitmap;
        private final Map<String, Serializable> metadata;

        public BitmapEntry(Bitmap bitmap, Map<String, Serializable> map) {
            this.bitmap = bitmap;
            this.metadata = map;
        }

        public Bitmap getBitmap() {
            return this.bitmap;
        }

        public Map<String, Serializable> getMetadata() {
            return this.metadata;
        }
    }

    public class CacheOutputStream
    extends FilterOutputStream {
        private final DiskLruCache.Editor editor;
        private boolean failed;
        public final SimpleDiskCache this$0;

        private CacheOutputStream(SimpleDiskCache simpleDiskCache, OutputStream outputStream, DiskLruCache.Editor editor) {
            this.this$0 = simpleDiskCache;
            super(outputStream);
            this.failed = false;
            this.editor = editor;
        }

        public /* synthetic */ CacheOutputStream(SimpleDiskCache simpleDiskCache, OutputStream outputStream, DiskLruCache.Editor editor, 1 var4_4) {
            this(simpleDiskCache, outputStream, editor);
        }

        public void close() throws IOException {
            Object var1_1;
            try {
                super.close();
                var1_1 = null;
            }
            catch (IOException iOException) {
                // empty catch block
            }
            if (this.failed) {
                this.editor.abort();
            } else {
                this.editor.commit();
            }
            if (var1_1 == null) {
                return;
            }
            throw var1_1;
        }

        public void flush() throws IOException {
            try {
                super.flush();
                return;
            }
            catch (IOException iOException) {
                this.failed = true;
                throw iOException;
            }
        }

        public void write(int n3) throws IOException {
            try {
                super.write(n3);
                return;
            }
            catch (IOException iOException) {
                this.failed = true;
                throw iOException;
            }
        }

        public void write(byte[] byArray) throws IOException {
            try {
                super.write(byArray);
                return;
            }
            catch (IOException iOException) {
                this.failed = true;
                throw iOException;
            }
        }

        public void write(byte[] byArray, int n3, int n7) throws IOException {
            try {
                super.write(byArray, n3, n7);
                return;
            }
            catch (IOException iOException) {
                this.failed = true;
                throw iOException;
            }
        }
    }

    public static class InputStreamEntry {
        private final Map<String, Serializable> metadata;
        private final DiskLruCache.Snapshot snapshot;

        public InputStreamEntry(DiskLruCache.Snapshot snapshot, Map<String, Serializable> map) {
            this.metadata = map;
            this.snapshot = snapshot;
        }

        public void close() {
            this.snapshot.close();
        }

        public InputStream getInputStream() {
            return this.snapshot.getInputStream(0);
        }

        public Map<String, Serializable> getMetadata() {
            return this.metadata;
        }
    }

    public static class StringEntry {
        private final Map<String, Serializable> metadata;
        private final String string;

        public StringEntry(String string2, Map<String, Serializable> map) {
            this.string = string2;
            this.metadata = map;
        }

        public Map<String, Serializable> getMetadata() {
            return this.metadata;
        }

        public String getString() {
            return this.string;
        }
    }
}

