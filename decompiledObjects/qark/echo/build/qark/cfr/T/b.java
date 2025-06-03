/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.media.MediaDataSource
 *  android.media.MediaMetadataRetriever
 *  android.system.Os
 *  java.io.FileDescriptor
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package T;

import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.system.Os;
import java.io.FileDescriptor;

public abstract class b {
    public static String a(byte[] arrby) {
        StringBuilder stringBuilder = new StringBuilder(arrby.length * 2);
        for (int i8 = 0; i8 < arrby.length; ++i8) {
            stringBuilder.append(String.format((String)"%02x", (Object[])new Object[]{arrby[i8]}));
        }
        return stringBuilder.toString();
    }

    public static long[] b(Object arrn) {
        if (arrn instanceof int[]) {
            arrn = arrn;
            long[] arrl = new long[arrn.length];
            for (int i8 = 0; i8 < arrn.length; ++i8) {
                arrl[i8] = arrn[i8];
            }
            return arrl;
        }
        if (arrn instanceof long[]) {
            return arrn;
        }
        return null;
    }

    public static boolean c(byte[] arrby, byte[] arrby2) {
        if (arrby != null) {
            if (arrby2 == null) {
                return false;
            }
            if (arrby.length < arrby2.length) {
                return false;
            }
            for (int i8 = 0; i8 < arrby2.length; ++i8) {
                if (arrby[i8] == arrby2[i8]) continue;
                return false;
            }
            return true;
        }
        return false;
    }

    public static abstract class a {
        public static void a(FileDescriptor fileDescriptor) {
            Os.close((FileDescriptor)fileDescriptor);
        }

        public static FileDescriptor b(FileDescriptor fileDescriptor) {
            return Os.dup((FileDescriptor)fileDescriptor);
        }

        public static long c(FileDescriptor fileDescriptor, long l8, int n8) {
            return Os.lseek((FileDescriptor)fileDescriptor, (long)l8, (int)n8);
        }
    }

    public static abstract class b {
        public static void a(MediaMetadataRetriever mediaMetadataRetriever, MediaDataSource mediaDataSource) {
            mediaMetadataRetriever.setDataSource(mediaDataSource);
        }
    }

}

