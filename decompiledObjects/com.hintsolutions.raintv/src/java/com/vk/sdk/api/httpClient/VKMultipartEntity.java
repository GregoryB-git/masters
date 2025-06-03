/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Pair
 *  android.webkit.MimeTypeMap
 *  java.io.File
 *  java.io.FileInputStream
 *  java.io.IOException
 *  java.io.InputStream
 *  java.io.OutputStream
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.UnsupportedOperationException
 *  java.util.Locale
 *  java.util.Random
 */
package com.vk.sdk.api.httpClient;

import android.util.Pair;
import android.webkit.MimeTypeMap;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Locale;
import java.util.Random;

public class VKMultipartEntity {
    private static final String VK_BOUNDARY = "Boundary(======VK_SDK_%d======)";
    private final String mBoundary = String.format((Locale)Locale.US, (String)"Boundary(======VK_SDK_%d======)", (Object[])new Object[]{new Random().nextInt()});
    private final File[] mFiles;
    private String mType;

    public VKMultipartEntity(File[] fileArray) {
        this.mFiles = fileArray;
    }

    public VKMultipartEntity(File[] fileArray, String string2) {
        this.mFiles = fileArray;
        this.mType = string2;
    }

    private String getBoundaryEnd() {
        return String.format((String)"\r\n--%s--\r\n", (Object[])new Object[]{this.mBoundary});
    }

    public static String getMimeType(String string2) {
        string2 = (string2 = MimeTypeMap.getFileExtensionFromUrl((String)string2)) != null ? MimeTypeMap.getSingleton().getMimeTypeFromExtension(string2) : null;
        return string2;
    }

    public InputStream getContent() throws IOException, IllegalStateException {
        throw new UnsupportedOperationException("Multipart form entity does not implement #getContent()");
    }

    public long getContentLength() {
        File file;
        long l2 = 0L;
        for (int k = 0; k < ((File[])(file = this.mFiles)).length; ++k) {
            file = file[k];
            long l3 = file.length();
            l2 = (long)this.getFileDescription(file, k).length() + (l3 + l2);
        }
        return l2 + (long)this.getBoundaryEnd().length();
    }

    public Pair<String, String> getContentType() {
        return new Pair((Object)"Content-Type", (Object)String.format((String)"multipart/form-data; boundary=%s", (Object[])new Object[]{this.mBoundary}));
    }

    public String getFileDescription(File file, int n) {
        String string2 = this.mType;
        string2 = string2 != null && string2.equals((Object)"doc") ? "file" : String.format((Locale)Locale.US, (String)"file%d", (Object[])new Object[]{n + 1});
        String string3 = MimeTypeMap.getFileExtensionFromUrl((String)file.getAbsolutePath());
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(String.format((String)"\r\n--%s\r\n", (Object[])new Object[]{this.mBoundary}));
        stringBuilder.append(String.format((String)"Content-Disposition: form-data; name=\"%s\"; filename=\"%s.%s\"\r\n", (Object[])new Object[]{string2, string2, string3}));
        stringBuilder.append(String.format((String)"Content-Type: %s\r\n\r\n", (Object[])new Object[]{VKMultipartEntity.getMimeType(file.getAbsolutePath())}));
        return stringBuilder.toString();
    }

    public void writeTo(OutputStream outputStream) throws IOException {
        File file;
        for (int k = 0; k < ((File[])(file = this.mFiles)).length; ++k) {
            int n;
            file = file[k];
            outputStream.write(this.getFileDescription(file, k).getBytes("UTF-8"));
            file = new FileInputStream(file);
            byte[] byArray = new byte[2048];
            while ((n = file.read(byArray)) != -1) {
                outputStream.write(byArray, 0, n);
            }
            file.close();
        }
        outputStream.write(this.getBoundaryEnd().getBytes("UTF-8"));
    }
}

