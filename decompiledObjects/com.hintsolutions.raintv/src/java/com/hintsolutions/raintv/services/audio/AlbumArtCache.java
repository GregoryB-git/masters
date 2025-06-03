/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.os.AsyncTask
 *  android.util.LruCache
 *  java.lang.Exception
 *  java.lang.IllegalArgumentException
 *  java.lang.Integer
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Runtime
 *  java.lang.String
 *  java.lang.Void
 */
package com.hintsolutions.raintv.services.audio;

import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.util.LruCache;
import com.hintsolutions.raintv.services.audio.BitmapHelper;
import com.hintsolutions.raintv.services.audio.LogHelper;

public final class AlbumArtCache {
    private static final int BIG_BITMAP_INDEX = 0;
    private static final int ICON_BITMAP_INDEX = 1;
    private static final int MAX_ALBUM_ART_CACHE_SIZE = 0xC00000;
    private static final int MAX_ART_HEIGHT = 480;
    private static final int MAX_ART_HEIGHT_ICON = 128;
    private static final int MAX_ART_WIDTH = 800;
    private static final int MAX_ART_WIDTH_ICON = 128;
    private static final String TAG = LogHelper.makeLogTag(AlbumArtCache.class);
    private static final AlbumArtCache sInstance = new AlbumArtCache();
    private final LruCache<String, Bitmap[]> mCache = new LruCache<String, Bitmap[]>(this, Math.min((int)0xC00000, (int)((int)Math.min((long)Integer.MAX_VALUE, (long)(Runtime.getRuntime().maxMemory() / 4L))))){
        public final AlbumArtCache this$0;
        {
            this.this$0 = albumArtCache;
            super(n);
        }

        public int sizeOf(String string2, Bitmap[] bitmapArray) {
            int n = bitmapArray[0].getByteCount();
            return bitmapArray[1].getByteCount() + n;
        }
    };

    private AlbumArtCache() {
    }

    public static AlbumArtCache getInstance() {
        return sInstance;
    }

    public void fetch(String string2, FetchListener fetchListener) {
        Bitmap[] bitmapArray = (Bitmap[])this.mCache.get((Object)string2);
        if (bitmapArray != null) {
            LogHelper.d(TAG, "getOrFetch: album art is in cache, using it", string2);
            fetchListener.onFetched(string2, bitmapArray[0], bitmapArray[1]);
            return;
        }
        LogHelper.d(TAG, "getOrFetch: starting asynctask to fetch ", string2);
        new AsyncTask<Void, Void, Bitmap[]>(this, string2, fetchListener){
            public final AlbumArtCache this$0;
            public final String val$artUrl;
            public final FetchListener val$listener;
            {
                this.this$0 = albumArtCache;
                this.val$artUrl = string2;
                this.val$listener = fetchListener;
            }

            public Bitmap[] doInBackground(Void[] voidArray) {
                Bitmap bitmap;
                Object object;
                try {
                    object = BitmapHelper.fetchAndRescaleBitmap(this.val$artUrl, 800, 480);
                    bitmap = BitmapHelper.scaleBitmap(object, 128, 128);
                    voidArray = new Bitmap[]{object, bitmap};
                }
                catch (Exception exception) {
                    return null;
                }
                this.this$0.mCache.put((Object)this.val$artUrl, (Object)voidArray);
                object = TAG;
                bitmap = z2.t("doInBackground: putting bitmap in cache. cache size=");
                bitmap.append(this.this$0.mCache.size());
                LogHelper.d((String)object, bitmap.toString());
                return voidArray;
            }

            public void onPostExecute(Bitmap[] bitmapArray) {
                if (bitmapArray == null) {
                    this.val$listener.onError(this.val$artUrl, (Exception)((Object)new IllegalArgumentException("got null bitmaps")));
                } else {
                    this.val$listener.onFetched(this.val$artUrl, bitmapArray[0], bitmapArray[1]);
                }
            }
        }.execute((Object[])new Void[0]);
    }

    public Bitmap getBigImage(String object) {
        object = (object = (Bitmap)this.mCache.get(object)) == null ? null : object[0];
        return object;
    }

    public Bitmap getIconImage(String object) {
        object = (object = (Bitmap)this.mCache.get(object)) == null ? null : object[1];
        return object;
    }

    public static abstract class FetchListener {
        public void onError(String string2, Exception exception) {
            LogHelper.e(TAG, exception, z2.o("AlbumArtFetchListener: error while downloading ", string2));
        }

        public abstract void onFetched(String var1, Bitmap var2, Bitmap var3);
    }
}

