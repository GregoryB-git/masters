/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  com.hintsolutions.raintv.adapters.GalleryAdapter
 *  java.lang.Object
 *  ru.tvrain.core.data.GalleryItem
 */
import android.view.View;
import com.hintsolutions.raintv.adapters.GalleryAdapter;
import ru.tvrain.core.data.GalleryItem;

public final class b2
implements View.OnClickListener {
    public final GalleryAdapter a;
    public final GalleryItem b;
    public final int c;

    public /* synthetic */ b2(GalleryAdapter galleryAdapter, GalleryItem galleryItem, int n) {
        this.a = galleryAdapter;
        this.b = galleryItem;
        this.c = n;
    }

    public final void onClick(View view) {
        GalleryAdapter.a((GalleryAdapter)this.a, (GalleryItem)this.b, (int)this.c, (View)view);
    }
}

