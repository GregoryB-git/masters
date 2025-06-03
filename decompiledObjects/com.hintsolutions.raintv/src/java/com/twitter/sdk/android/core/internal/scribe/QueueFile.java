/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.twitter.sdk.android.core.internal.scribe.QueueFile$1
 *  java.io.Closeable
 *  java.io.File
 *  java.io.FileNotFoundException
 *  java.io.IOException
 *  java.io.InputStream
 *  java.io.RandomAccessFile
 *  java.lang.ArrayIndexOutOfBoundsException
 *  java.lang.AssertionError
 *  java.lang.IndexOutOfBoundsException
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.nio.channels.WritableByteChannel
 *  java.util.NoSuchElementException
 *  java.util.logging.Level
 *  java.util.logging.Logger
 */
package com.twitter.sdk.android.core.internal.scribe;

import com.twitter.sdk.android.core.internal.scribe.QueueFile;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.WritableByteChannel;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class QueueFile
implements Closeable {
    public static final int HEADER_LENGTH = 16;
    private static final int INITIAL_LENGTH = 4096;
    private static final Logger LOGGER = Logger.getLogger((String)QueueFile.class.getName());
    private final byte[] buffer = new byte[16];
    private int elementCount;
    public int fileLength;
    private Element first;
    private Element last;
    private final RandomAccessFile raf;

    public QueueFile(File file) throws IOException {
        if (!file.exists()) {
            QueueFile.initialize(file);
        }
        this.raf = QueueFile.open(file);
        this.readHeader();
    }

    public QueueFile(RandomAccessFile randomAccessFile) throws IOException {
        this.raf = randomAccessFile;
        this.readHeader();
    }

    private void expandIfNecessary(int n) throws IOException {
        int n2;
        int n3;
        int n4 = n + 4;
        int n5 = this.remainingBytes();
        if (n5 >= n4) {
            return;
        }
        n = this.fileLength;
        do {
            n3 = n5 + n;
            n2 = n << 1;
            n5 = n3;
            n = n2;
        } while (n3 < n4);
        this.setLength(n2);
        Element element = this.last;
        n = this.wrapPosition(element.position + 4 + element.length);
        if (n < this.first.position) {
            element = this.raf.getChannel();
            element.position(this.fileLength);
            long l = n - 4;
            if (element.transferTo(16L, l, (WritableByteChannel)element) != l) {
                throw new AssertionError((Object)"Copied insufficient number of bytes!");
            }
        }
        if ((n5 = this.last.position) < (n = this.first.position)) {
            n5 = this.fileLength + n5 - 16;
            this.writeHeader(n2, this.elementCount, n, n5);
            this.last = new Element(n5, this.last.length);
        } else {
            this.writeHeader(n2, this.elementCount, n, n5);
        }
        this.fileLength = n2;
    }

    private static void initialize(File file) throws IOException {
        StringBuilder stringBuilder;
        block3: {
            stringBuilder = new StringBuilder();
            stringBuilder.append(file.getPath());
            stringBuilder.append(".tmp");
            File file2 = new File(stringBuilder.toString());
            stringBuilder = QueueFile.open(file2);
            stringBuilder.setLength(4096L);
            stringBuilder.seek(0L);
            byte[] byArray = new byte[16];
            QueueFile.writeInts(byArray, 4096, 0, 0, 0);
            stringBuilder.write(byArray);
            if (!file2.renameTo(file)) break block3;
            return;
        }
        throw new IOException("Rename failed!");
        finally {
            stringBuilder.close();
        }
    }

    private static <T> T nonNull(T t, String string2) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(string2);
    }

    private static RandomAccessFile open(File file) throws FileNotFoundException {
        return new RandomAccessFile(file, "rwd");
    }

    private Element readElement(int n) throws IOException {
        if (n == 0) {
            return Element.NULL;
        }
        this.raf.seek((long)n);
        return new Element(n, this.raf.readInt());
    }

    private void readHeader() throws IOException {
        int n;
        this.raf.seek(0L);
        this.raf.readFully(this.buffer);
        this.fileLength = n = QueueFile.readInt(this.buffer, 0);
        if ((long)n <= this.raf.length()) {
            this.elementCount = QueueFile.readInt(this.buffer, 4);
            int n2 = QueueFile.readInt(this.buffer, 8);
            n = QueueFile.readInt(this.buffer, 12);
            this.first = this.readElement(n2);
            this.last = this.readElement(n);
            return;
        }
        StringBuilder stringBuilder = z2.t("File is truncated. Expected length: ");
        stringBuilder.append(this.fileLength);
        stringBuilder.append(", Actual length: ");
        stringBuilder.append(this.raf.length());
        throw new IOException(stringBuilder.toString());
    }

    private static int readInt(byte[] byArray, int n) {
        return ((byArray[n] & 0xFF) << 24) + ((byArray[n + 1] & 0xFF) << 16) + ((byArray[n + 2] & 0xFF) << 8) + (byArray[n + 3] & 0xFF);
    }

    private int remainingBytes() {
        return this.fileLength - this.usedBytes();
    }

    private void ringRead(int n, byte[] byArray, int n2, int n3) throws IOException {
        int n4;
        if ((n = this.wrapPosition(n)) + n3 <= (n4 = this.fileLength)) {
            this.raf.seek((long)n);
            this.raf.readFully(byArray, n2, n3);
        } else {
            this.raf.seek((long)n);
            this.raf.readFully(byArray, n2, n4 -= n);
            this.raf.seek(16L);
            this.raf.readFully(byArray, n2 + n4, n3 - n4);
        }
    }

    private void ringWrite(int n, byte[] byArray, int n2, int n3) throws IOException {
        int n4;
        if ((n = this.wrapPosition(n)) + n3 <= (n4 = this.fileLength)) {
            this.raf.seek((long)n);
            this.raf.write(byArray, n2, n3);
        } else {
            this.raf.seek((long)n);
            this.raf.write(byArray, n2, n4 -= n);
            this.raf.seek(16L);
            this.raf.write(byArray, n2 + n4, n3 - n4);
        }
    }

    private void setLength(int n) throws IOException {
        this.raf.setLength((long)n);
        this.raf.getChannel().force(true);
    }

    private int wrapPosition(int n) {
        int n2 = this.fileLength;
        if (n >= n2) {
            n = n + 16 - n2;
        }
        return n;
    }

    private void writeHeader(int n, int n2, int n3, int n4) throws IOException {
        QueueFile.writeInts(this.buffer, n, n2, n3, n4);
        this.raf.seek(0L);
        this.raf.write(this.buffer);
    }

    private static void writeInt(byte[] byArray, int n, int n2) {
        byArray[n] = (byte)(n2 >> 24);
        byArray[n + 1] = (byte)(n2 >> 16);
        byArray[n + 2] = (byte)(n2 >> 8);
        byArray[n + 3] = (byte)n2;
    }

    private static void writeInts(byte[] byArray, int ... nArray) {
        int n = nArray.length;
        int n2 = 0;
        for (int i = 0; i < n; ++i) {
            QueueFile.writeInt(byArray, n2, nArray[i]);
            n2 += 4;
        }
    }

    public void add(byte[] byArray) throws IOException {
        this.add(byArray, 0, byArray.length);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void add(byte[] object, int n, int n2) throws IOException {
        QueueFile queueFile = this;
        synchronized (queueFile) {
            QueueFile.nonNull(object, "buffer");
            if ((n | n2) >= 0 && n2 <= ((byte[])object).length - n) {
                Element element;
                int n3;
                this.expandIfNecessary(n2);
                boolean bl = this.isEmpty();
                if (bl) {
                    n3 = 16;
                } else {
                    element = this.last;
                    n3 = this.wrapPosition(element.position + 4 + element.length);
                }
                element = new Element(n3, n2);
                QueueFile.writeInt(this.buffer, 0, n2);
                this.ringWrite(element.position, this.buffer, 0, 4);
                this.ringWrite(element.position + 4, (byte[])object, n, n2);
                n = bl ? element.position : this.first.position;
                this.writeHeader(this.fileLength, this.elementCount + 1, n, element.position);
                this.last = element;
                ++this.elementCount;
                if (bl) {
                    this.first = element;
                }
                return;
            }
            IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException();
            throw indexOutOfBoundsException;
        }
    }

    public void clear() throws IOException {
        QueueFile queueFile = this;
        synchronized (queueFile) {
            Element element;
            this.writeHeader(4096, 0, 0, 0);
            this.elementCount = 0;
            this.first = element = Element.NULL;
            this.last = element;
            if (this.fileLength > 4096) {
                this.setLength(4096);
            }
            this.fileLength = 4096;
            return;
        }
    }

    public void close() throws IOException {
        QueueFile queueFile = this;
        synchronized (queueFile) {
            this.raf.close();
            return;
        }
    }

    public void forEach(ElementReader elementReader) throws IOException {
        QueueFile queueFile = this;
        synchronized (queueFile) {
            int n = this.first.position;
            int n2 = 0;
            while (true) {
                if (n2 >= this.elementCount) break;
                Element element = this.readElement(n);
                ElementInputStream elementInputStream = new ElementInputStream(this, element, null);
                elementReader.read(elementInputStream, element.length);
                n = this.wrapPosition(element.position + 4 + element.length);
                ++n2;
                continue;
                break;
            }
            return;
        }
    }

    public boolean hasSpaceFor(int n, int n2) {
        boolean bl = this.usedBytes() + 4 + n <= n2;
        return bl;
    }

    public boolean isEmpty() {
        QueueFile queueFile = this;
        synchronized (queueFile) {
            int n = this.elementCount;
            boolean bl = n == 0;
            return bl;
        }
    }

    public void peek(ElementReader elementReader) throws IOException {
        QueueFile queueFile = this;
        synchronized (queueFile) {
            if (this.elementCount > 0) {
                ElementInputStream elementInputStream = new ElementInputStream(this, this.first, null);
                elementReader.read(elementInputStream, this.first.length);
            }
            return;
        }
    }

    public byte[] peek() throws IOException {
        QueueFile queueFile = this;
        synchronized (queueFile) {
            block4: {
                boolean bl = this.isEmpty();
                if (!bl) break block4;
                return null;
            }
            Element element = this.first;
            int n = element.length;
            byte[] byArray = new byte[n];
            this.ringRead(element.position + 4, byArray, 0, n);
            return byArray;
        }
    }

    public void remove() throws IOException {
        QueueFile queueFile = this;
        synchronized (queueFile) {
            if (!this.isEmpty()) {
                if (this.elementCount == 1) {
                    this.clear();
                } else {
                    Element element = this.first;
                    int n = this.wrapPosition(element.position + 4 + element.length);
                    this.ringRead(n, this.buffer, 0, 4);
                    int n2 = QueueFile.readInt(this.buffer, 0);
                    this.writeHeader(this.fileLength, this.elementCount - 1, n, this.last.position);
                    --this.elementCount;
                    this.first = element = new Element(n, n2);
                }
                return;
            }
            NoSuchElementException noSuchElementException = new NoSuchElementException();
            throw noSuchElementException;
        }
    }

    public int size() {
        QueueFile queueFile = this;
        synchronized (queueFile) {
            int n = this.elementCount;
            return n;
        }
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.getClass().getSimpleName());
        stringBuilder.append('[');
        stringBuilder.append("fileLength=");
        stringBuilder.append(this.fileLength);
        stringBuilder.append(", size=");
        stringBuilder.append(this.elementCount);
        stringBuilder.append(", first=");
        stringBuilder.append((Object)this.first);
        stringBuilder.append(", last=");
        stringBuilder.append((Object)this.last);
        stringBuilder.append(", element lengths=[");
        try {
            1 var2_2 = new 1(this, stringBuilder);
            this.forEach((ElementReader)var2_2);
        }
        catch (IOException iOException) {
            LOGGER.log(Level.WARNING, "read error", (Throwable)iOException);
        }
        stringBuilder.append("]]");
        return stringBuilder.toString();
    }

    public int usedBytes() {
        if (this.elementCount == 0) {
            return 16;
        }
        Element element = this.last;
        int n = element.position;
        int n2 = this.first.position;
        if (n >= n2) {
            return n - n2 + 4 + element.length + 16;
        }
        return n + 4 + element.length + this.fileLength - n2;
    }

    public static class Element {
        public static final int HEADER_LENGTH = 4;
        public static final Element NULL = new Element(0, 0);
        public final int length;
        public final int position;

        public Element(int n, int n2) {
            this.position = n;
            this.length = n2;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.getClass().getSimpleName());
            stringBuilder.append("[position = ");
            stringBuilder.append(this.position);
            stringBuilder.append(", length = ");
            return z2.q(stringBuilder, this.length, "]");
        }
    }

    public final class ElementInputStream
    extends InputStream {
        private int position;
        private int remaining;
        public final QueueFile this$0;

        private ElementInputStream(QueueFile queueFile, Element element) {
            this.this$0 = queueFile;
            this.position = queueFile.wrapPosition(element.position + 4);
            this.remaining = element.length;
        }

        public /* synthetic */ ElementInputStream(QueueFile queueFile, Element element, 1 var3_3) {
            this(queueFile, element);
        }

        public int read() throws IOException {
            if (this.remaining == 0) {
                return -1;
            }
            this.this$0.raf.seek((long)this.position);
            int n = this.this$0.raf.read();
            this.position = this.this$0.wrapPosition(this.position + 1);
            --this.remaining;
            return n;
        }

        public int read(byte[] byArray, int n, int n2) throws IOException {
            QueueFile.nonNull(byArray, "buffer");
            if ((n | n2) >= 0 && n2 <= byArray.length - n) {
                int n3 = this.remaining;
                if (n3 > 0) {
                    int n4 = n2;
                    if (n2 > n3) {
                        n4 = n3;
                    }
                    this.this$0.ringRead(this.position, byArray, n, n4);
                    this.position = this.this$0.wrapPosition(this.position + n4);
                    this.remaining -= n4;
                    return n4;
                }
                return -1;
            }
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static interface ElementReader {
        public void read(InputStream var1, int var2) throws IOException;
    }
}

