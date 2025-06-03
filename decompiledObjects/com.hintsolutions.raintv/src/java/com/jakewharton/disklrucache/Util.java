/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.io.Closeable
 *  java.io.File
 *  java.io.IOException
 *  java.io.Reader
 *  java.io.StringWriter
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.nio.charset.Charset
 */
package com.jakewharton.disklrucache;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.Reader;
import java.io.StringWriter;
import java.nio.charset.Charset;

public final class Util {
    public static final Charset US_ASCII = Charset.forName((String)"US-ASCII");
    public static final Charset UTF_8 = Charset.forName((String)"UTF-8");

    private Util() {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void closeQuietly(Closeable closeable) {
        if (closeable == null) return;
        try {
            closeable.close();
            return;
        }
        catch (RuntimeException runtimeException) {
            throw runtimeException;
        }
        catch (Exception exception) {
            return;
        }
    }

    public static void deleteContents(File file) throws IOException {
        StringBuilder stringBuilder = file.listFiles();
        if (stringBuilder != null) {
            int n = ((File[])stringBuilder).length;
            for (int i = 0; i < n; ++i) {
                file = stringBuilder[i];
                if (file.isDirectory()) {
                    Util.deleteContents(file);
                }
                if (file.delete()) {
                    continue;
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append("failed to delete file: ");
                stringBuilder.append((Object)file);
                throw new IOException(stringBuilder.toString());
            }
            return;
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append("not a readable directory: ");
        stringBuilder.append((Object)file);
        throw new IOException(stringBuilder.toString());
    }

    public static String readFully(Reader reader) throws IOException {
        try {
            int n;
            Object object = new StringWriter();
            char[] cArray = new char[1024];
            while ((n = reader.read(cArray)) != -1) {
                object.write(cArray, 0, n);
            }
            object = object.toString();
            return object;
        }
        finally {
            reader.close();
        }
    }
}

