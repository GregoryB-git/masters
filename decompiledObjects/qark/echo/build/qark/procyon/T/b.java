// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package T;

import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.system.Os;
import java.io.FileDescriptor;

public abstract class b
{
    public static String a(final byte[] array) {
        final StringBuilder sb = new StringBuilder(array.length * 2);
        for (int i = 0; i < array.length; ++i) {
            sb.append(String.format("%02x", array[i]));
        }
        return sb.toString();
    }
    
    public static long[] b(final Object o) {
        if (o instanceof int[]) {
            final int[] array = (int[])o;
            final long[] array2 = new long[array.length];
            for (int i = 0; i < array.length; ++i) {
                array2[i] = array[i];
            }
            return array2;
        }
        if (o instanceof long[]) {
            return (long[])o;
        }
        return null;
    }
    
    public static boolean c(final byte[] array, final byte[] array2) {
        if (array == null) {
            return false;
        }
        if (array2 == null) {
            return false;
        }
        if (array.length < array2.length) {
            return false;
        }
        for (int i = 0; i < array2.length; ++i) {
            if (array[i] != array2[i]) {
                return false;
            }
        }
        return true;
    }
    
    public abstract static class a
    {
        public static void a(final FileDescriptor fileDescriptor) {
            Os.close(fileDescriptor);
        }
        
        public static FileDescriptor b(final FileDescriptor fileDescriptor) {
            return Os.dup(fileDescriptor);
        }
        
        public static long c(final FileDescriptor fileDescriptor, final long n, final int n2) {
            return Os.lseek(fileDescriptor, n, n2);
        }
    }
    
    public abstract static class b
    {
        public static void a(final MediaMetadataRetriever mediaMetadataRetriever, final MediaDataSource dataSource) {
            mediaMetadataRetriever.setDataSource(dataSource);
        }
    }
}
