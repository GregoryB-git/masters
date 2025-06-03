/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.MenuItem
 *  androidx.appcompat.widget.Toolbar$OnMenuItemClickListener
 *  com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader
 *  com.google.android.datatransport.runtime.synchronization.SynchronizationGuard$CriticalSection
 *  com.hintsolutions.raintv.adapters.SavedVideosAdapter
 *  com.hintsolutions.raintv.news.GalleryFragment
 *  com.hintsolutions.raintv.news.NewsActivity
 *  com.hintsolutions.raintv.video.ExoVideoView
 *  com.stfalcon.frescoimageviewer.ImageViewer$OnImageChangeListener
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.util.List
 *  java.util.Map
 *  okhttp3.ResponseBody
 *  ru.tvrain.core.data.Article
 *  rx.functions.Action1
 *  tvrain.utils.CurrentlyOnAirGetter
 */
import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import com.devbrackets.android.exomedia.listener.OnPreparedListener;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import com.hintsolutions.raintv.adapters.SavedVideosAdapter;
import com.hintsolutions.raintv.news.GalleryFragment;
import com.hintsolutions.raintv.news.GalleryImageOverlayView;
import com.hintsolutions.raintv.news.NewsActivity;
import com.hintsolutions.raintv.services.video.SavedVideoHolder;
import com.hintsolutions.raintv.video.ExoVideoView;
import com.stfalcon.frescoimageviewer.ImageViewer;
import java.util.List;
import java.util.Map;
import okhttp3.ResponseBody;
import ru.tvrain.core.data.Article;
import rx.functions.Action1;
import tvrain.utils.CurrentlyOnAirGetter;

public final class y4
implements SynchronizationGuard.CriticalSection,
Toolbar.OnMenuItemClickListener,
ImageViewer.OnImageChangeListener,
Action1,
OnPreparedListener {
    public final int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ y4(Object object, Object object2, int n) {
        this.a = n;
        this.b = object;
        this.c = object2;
    }

    public final void call(Object object) {
        switch (this.a) {
            default: {
                break;
            }
            case 4: {
                NewsActivity.H((NewsActivity)((NewsActivity)this.b), (Article)((Article)this.c), (ResponseBody)((ResponseBody)object));
                return;
            }
        }
        CurrentlyOnAirGetter.a((CurrentlyOnAirGetter)((CurrentlyOnAirGetter)this.b), (String)((String)this.c), (List)((List)object));
    }

    public final Object execute() {
        switch (this.a) {
            default: {
                break;
            }
            case 0: {
                return Uploader.g((Uploader)((Uploader)this.b), (Iterable)((Iterable)this.c));
            }
        }
        return Uploader.c((Uploader)((Uploader)this.b), (Map)((Map)this.c));
    }

    public final void onImageChange(int n) {
        GalleryFragment.d((GalleryFragment)((GalleryFragment)this.b), (GalleryImageOverlayView)((GalleryImageOverlayView)((Object)this.c)), (int)n);
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        return SavedVideosAdapter.a((SavedVideosAdapter)((SavedVideosAdapter)this.b), (SavedVideoHolder)((SavedVideoHolder)this.c), (MenuItem)menuItem);
    }

    @Override
    public final void onPrepared() {
        ExoVideoView.a((ExoVideoView)((ExoVideoView)this.b), (OnPreparedListener)((OnPreparedListener)this.c));
    }
}

