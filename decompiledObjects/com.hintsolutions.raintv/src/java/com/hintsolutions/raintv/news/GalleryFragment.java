/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Configuration
 *  android.os.Bundle
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  androidx.annotation.ColorInt
 *  androidx.annotation.ColorRes
 *  androidx.annotation.DimenRes
 *  androidx.recyclerview.widget.LinearLayoutManager
 *  androidx.recyclerview.widget.RecyclerView
 *  androidx.recyclerview.widget.RecyclerView$Adapter
 *  androidx.recyclerview.widget.RecyclerView$LayoutManager
 *  butterknife.BindView
 *  butterknife.ButterKnife
 *  com.facebook.drawee.backends.pipeline.Fresco
 *  com.facebook.drawee.generic.GenericDraweeHierarchyBuilder
 *  com.facebook.imagepipeline.request.ImageRequestBuilder
 *  java.io.Serializable
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.ref.WeakReference
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.Collection
 *  java.util.List
 *  ru.tvrain.core.Gallery
 *  ru.tvrain.core.data.GalleryItem
 */
package com.hintsolutions.raintv.news;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.generic.GenericDraweeHierarchyBuilder;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.hintsolutions.raintv.adapters.GalleryAdapter;
import com.hintsolutions.raintv.common.BaseFragment;
import com.hintsolutions.raintv.news.GalleryImageOverlayView;
import com.hintsolutions.raintv.utils.CommonUtils;
import com.stfalcon.frescoimageviewer.ImageViewer;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import ru.tvrain.core.Gallery;
import ru.tvrain.core.data.GalleryItem;

public class GalleryFragment
extends BaseFragment {
    private static final String ARG_GALLERY = "gallery";
    private Gallery gallery;
    private WeakReference<GalleryImageOverlayView> galleryImageOverlayView = null;
    @BindView(value=2131296653)
    public RecyclerView galleryView;
    private ImageViewer imageViewer = null;

    public static /* synthetic */ String b(Object object) {
        return GalleryFragment.lambda$onCreateView$2(object);
    }

    public static /* synthetic */ void c(GalleryFragment galleryFragment, GalleryItem galleryItem, int n2) {
        galleryFragment.lambda$onCreateView$3(galleryItem, n2);
    }

    public static /* synthetic */ void d(GalleryFragment galleryFragment, GalleryImageOverlayView galleryImageOverlayView, int n2) {
        galleryFragment.lambda$onCreateView$1(galleryImageOverlayView, n2);
    }

    public static /* synthetic */ void e(GalleryFragment galleryFragment) {
        galleryFragment.lambda$onCreateView$0();
    }

    private /* synthetic */ void lambda$onCreateView$0() {
        ImageViewer imageViewer = this.imageViewer;
        if (imageViewer != null) {
            imageViewer.close();
        }
    }

    private /* synthetic */ void lambda$onCreateView$1(GalleryImageOverlayView galleryImageOverlayView, int n2) {
        GalleryItem galleryItem = (GalleryItem)this.gallery.getItems().get(n2);
        galleryImageOverlayView.setPosition(n2, this.gallery.getItems().size());
        galleryImageOverlayView.setAuthor(galleryItem.getAuthor());
        galleryImageOverlayView.setDescription(galleryItem.getCaption());
        galleryImageOverlayView.setImageShareUrl(galleryItem.getImage());
        this.updateOverlayViewOrientation(galleryImageOverlayView);
        galleryImageOverlayView.setOnCloseClickListener(new c2(this));
        galleryImageOverlayView.scrollDescriptionToTop();
    }

    private static /* synthetic */ String lambda$onCreateView$2(Object object) {
        return ((GalleryItem)object).getImage();
    }

    private /* synthetic */ void lambda$onCreateView$3(GalleryItem object, int n2) {
        object = new GalleryImageOverlayView(this.getContext());
        this.galleryImageOverlayView = new WeakReference(object);
        this.imageViewer = new Object(this.getContext(), this.gallery.getItems()){
            @ColorInt
            private int backgroundColor;
            private int[] containerPaddingPixels;
            private Context context;
            private GenericDraweeHierarchyBuilder customHierarchyBuilder;
            private ImageRequestBuilder customImageRequestBuilder;
            private ImageViewer.DataSet<T> dataSet;
            private int descriptionViewId;
            private ImageViewer.OnImageChangeListener imageChangeListener;
            private int imageMarginPixels;
            private boolean isSwipeToDismissAllowed;
            private boolean isZoomingAllowed;
            private ImageViewer.OnDismissListener onDismissListener;
            private View overlayView;
            private boolean shouldStatusBarHide;
            private int startPosition;
            {
                this.backgroundColor = -16777216;
                this.containerPaddingPixels = new int[4];
                this.shouldStatusBarHide = true;
                this.isZoomingAllowed = true;
                this.isSwipeToDismissAllowed = true;
                this.descriptionViewId = 0;
                this.context = context;
                this.dataSet = new Object(list){
                    private List<T> data;
                    private ImageViewer.Formatter<T> formatter;
                    {
                        this.data = list;
                    }

                    public static /* synthetic */ List access$100(ImageViewer.DataSet dataSet) {
                        return dataSet.data;
                    }

                    public static /* synthetic */ ImageViewer.Formatter access$1702(ImageViewer.DataSet dataSet, ImageViewer.Formatter formatter) {
                        dataSet.formatter = formatter;
                        return formatter;
                    }

                    public String format(int n2) {
                        return this.format(this.data.get(n2));
                    }

                    public String format(T t4) {
                        ImageViewer.Formatter<T> formatter = this.formatter;
                        if (formatter == null) {
                            return t4.toString();
                        }
                        return formatter.format(t4);
                    }

                    public List<T> getData() {
                        return this.data;
                    }
                };
            }
            {
                this(context, (List<T>)new ArrayList((Collection)Arrays.asList((Object[])TArray)));
            }

            public static /* synthetic */ ImageViewer.DataSet access$000(ImageViewer.Builder builder) {
                return builder.dataSet;
            }

            public static /* synthetic */ int access$1000(ImageViewer.Builder builder) {
                return builder.imageMarginPixels;
            }

            public static /* synthetic */ int[] access$1100(ImageViewer.Builder builder) {
                return builder.containerPaddingPixels;
            }

            public static /* synthetic */ int access$1200(ImageViewer.Builder builder) {
                return builder.startPosition;
            }

            public static /* synthetic */ ImageViewer.OnImageChangeListener access$1400(ImageViewer.Builder builder) {
                return builder.imageChangeListener;
            }

            public static /* synthetic */ ImageViewer.OnDismissListener access$1500(ImageViewer.Builder builder) {
                return builder.onDismissListener;
            }

            public static /* synthetic */ boolean access$1600(ImageViewer.Builder builder) {
                return builder.shouldStatusBarHide;
            }

            public static /* synthetic */ Context access$200(ImageViewer.Builder builder) {
                return builder.context;
            }

            public static /* synthetic */ int access$300(ImageViewer.Builder builder) {
                return builder.descriptionViewId;
            }

            public static /* synthetic */ ImageRequestBuilder access$400(ImageViewer.Builder builder) {
                return builder.customImageRequestBuilder;
            }

            public static /* synthetic */ GenericDraweeHierarchyBuilder access$500(ImageViewer.Builder builder) {
                return builder.customHierarchyBuilder;
            }

            public static /* synthetic */ boolean access$600(ImageViewer.Builder builder) {
                return builder.isZoomingAllowed;
            }

            public static /* synthetic */ boolean access$700(ImageViewer.Builder builder) {
                return builder.isSwipeToDismissAllowed;
            }

            public static /* synthetic */ int access$800(ImageViewer.Builder builder) {
                return builder.backgroundColor;
            }

            public static /* synthetic */ View access$900(ImageViewer.Builder builder) {
                return builder.overlayView;
            }

            public ImageViewer.Builder allowSwipeToDismiss(boolean bl) {
                this.isSwipeToDismissAllowed = bl;
                return this;
            }

            public ImageViewer.Builder allowZooming(boolean bl) {
                this.isZoomingAllowed = bl;
                return this;
            }

            public ImageViewer build() {
                return new ImageViewer(this);
            }

            public ImageViewer.Builder hideStatusBar(boolean bl) {
                this.shouldStatusBarHide = bl;
                return this;
            }

            public ImageViewer.Builder setBackgroundColor(@ColorInt int n2) {
                this.backgroundColor = n2;
                return this;
            }

            public ImageViewer.Builder setBackgroundColorRes(@ColorRes int n2) {
                return this.setBackgroundColor(this.context.getResources().getColor(n2));
            }

            public ImageViewer.Builder setContainerPadding(Context context, @DimenRes int n2) {
                n2 = Math.round((float)context.getResources().getDimension(n2));
                this.setContainerPaddingPx(n2, n2, n2, n2);
                return this;
            }

            public ImageViewer.Builder setContainerPadding(Context context, @DimenRes int n2, @DimenRes int n4, @DimenRes int n5, @DimenRes int n6) {
                this.setContainerPaddingPx(Math.round((float)context.getResources().getDimension(n2)), Math.round((float)context.getResources().getDimension(n4)), Math.round((float)context.getResources().getDimension(n5)), Math.round((float)context.getResources().getDimension(n6)));
                return this;
            }

            public ImageViewer.Builder setContainerPaddingPx(int n2) {
                this.containerPaddingPixels = new int[]{n2, n2, n2, n2};
                return this;
            }

            public ImageViewer.Builder setContainerPaddingPx(int n2, int n4, int n5, int n6) {
                this.containerPaddingPixels = new int[]{n2, n4, n5, n6};
                return this;
            }

            public ImageViewer.Builder setCustomDraweeHierarchyBuilder(GenericDraweeHierarchyBuilder genericDraweeHierarchyBuilder) {
                this.customHierarchyBuilder = genericDraweeHierarchyBuilder;
                return this;
            }

            public ImageViewer.Builder setCustomImageRequestBuilder(ImageRequestBuilder imageRequestBuilder) {
                this.customImageRequestBuilder = imageRequestBuilder;
                return this;
            }

            public ImageViewer.Builder setDescriptionViewId(int n2) {
                this.descriptionViewId = n2;
                return this;
            }

            public ImageViewer.Builder setFormatter(ImageViewer.Formatter<T> formatter) {
                ImageViewer.DataSet.access$1702(this.dataSet, formatter);
                return this;
            }

            public ImageViewer.Builder setImageChangeListener(ImageViewer.OnImageChangeListener onImageChangeListener) {
                this.imageChangeListener = onImageChangeListener;
                return this;
            }

            public ImageViewer.Builder setImageMargin(Context context, @DimenRes int n2) {
                this.imageMarginPixels = Math.round((float)context.getResources().getDimension(n2));
                return this;
            }

            public ImageViewer.Builder setImageMarginPx(int n2) {
                this.imageMarginPixels = n2;
                return this;
            }

            public ImageViewer.Builder setOnDismissListener(ImageViewer.OnDismissListener onDismissListener) {
                this.onDismissListener = onDismissListener;
                return this;
            }

            public ImageViewer.Builder setOverlayView(View view) {
                this.overlayView = view;
                return this;
            }

            public ImageViewer.Builder setStartPosition(int n2) {
                this.startPosition = n2;
                return this;
            }

            public ImageViewer show() {
                ImageViewer imageViewer = this.build();
                imageViewer.show();
                return imageViewer;
            }
        }.setOverlayView((View)object).setStartPosition(n2).setDescriptionViewId(2131296536).setImageChangeListener(new y4((Object)this, object, 3)).setFormatter(new v1(10)).show();
    }

    public static GalleryFragment newInstance(Gallery gallery) {
        GalleryFragment galleryFragment = new GalleryFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable(ARG_GALLERY, (Serializable)gallery);
        galleryFragment.setArguments(bundle);
        return galleryFragment;
    }

    private void updateOverlayViewOrientation(GalleryImageOverlayView galleryImageOverlayView) {
        int n2 = this.getResources().getConfiguration().orientation;
        Context context = this.getContext();
        n2 = n2 == 2 ? 100 : 190;
        n2 = CommonUtils.dpToPx(context, n2);
        if (galleryImageOverlayView != null) {
            galleryImageOverlayView.setDescriptionHeight(n2);
        }
    }

    public void onConfigurationChanged(Configuration object) {
        super.onConfigurationChanged((Configuration)object);
        object = this.galleryImageOverlayView;
        if (object != null && (object = (GalleryImageOverlayView)((Object)object.get())) != null) {
            this.updateOverlayViewOrientation((GalleryImageOverlayView)((Object)object));
        }
    }

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.getArguments() != null) {
            this.gallery = (Gallery)this.getArguments().getSerializable(ARG_GALLERY);
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup object, Bundle bundle) {
        layoutInflater = layoutInflater.inflate(2131492972, object, false);
        this.unbinder = ButterKnife.bind((Object)((Object)this), (View)layoutInflater);
        Fresco.initialize((Context)this.getContext());
        this.galleryView.setHasFixedSize(true);
        this.galleryView.setLayoutManager((RecyclerView.LayoutManager)new LinearLayoutManager(this.getContext(), 0, false));
        object = new GalleryAdapter(this.getContext(), (List<GalleryItem>)this.gallery.getItems(), new c2(this));
        this.galleryView.setAdapter((RecyclerView.Adapter)object);
        return layoutInflater;
    }
}

