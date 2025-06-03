/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.hintsolutions.raintv.news.GalleryFragment
 *  java.lang.Object
 *  java.lang.Override
 *  ru.tvrain.core.data.GalleryItem
 */
import com.hintsolutions.raintv.adapters.GalleryAdapter;
import com.hintsolutions.raintv.news.GalleryFragment;
import com.hintsolutions.raintv.news.GalleryImageOverlayView;
import ru.tvrain.core.data.GalleryItem;

public final class c2
implements GalleryImageOverlayView.OnCloseClickListener,
GalleryAdapter.OnItemClickListener {
    public final GalleryFragment a;

    public /* synthetic */ c2(GalleryFragment galleryFragment) {
        this.a = galleryFragment;
    }

    @Override
    public final void onClick() {
        GalleryFragment.e((GalleryFragment)this.a);
    }

    @Override
    public final void onClick(GalleryItem galleryItem, int n) {
        GalleryFragment.c((GalleryFragment)this.a, (GalleryItem)galleryItem, (int)n);
    }
}

