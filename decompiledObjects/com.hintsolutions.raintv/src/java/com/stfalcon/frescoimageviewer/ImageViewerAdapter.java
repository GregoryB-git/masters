/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.drawable.Animatable
 *  android.net.Uri
 *  android.view.View
 *  android.view.ViewGroup
 *  com.facebook.drawee.backends.pipeline.Fresco
 *  com.facebook.drawee.backends.pipeline.PipelineDraweeControllerBuilder
 *  com.facebook.drawee.controller.BaseControllerListener
 *  com.facebook.drawee.controller.ControllerListener
 *  com.facebook.drawee.drawable.ScalingUtils$ScaleType
 *  com.facebook.drawee.generic.GenericDraweeHierarchyBuilder
 *  com.facebook.drawee.interfaces.DraweeController
 *  com.facebook.drawee.interfaces.DraweeHierarchy
 *  com.facebook.imagepipeline.image.ImageInfo
 *  com.facebook.imagepipeline.request.ImageRequestBuilder
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.util.HashSet
 *  me.relex.photodraweeview.OnScaleChangeListener
 */
package com.stfalcon.frescoimageviewer;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.drawee.backends.pipeline.PipelineDraweeControllerBuilder;
import com.facebook.drawee.controller.BaseControllerListener;
import com.facebook.drawee.controller.ControllerListener;
import com.facebook.drawee.drawable.ScalingUtils;
import com.facebook.drawee.generic.GenericDraweeHierarchyBuilder;
import com.facebook.drawee.interfaces.DraweeController;
import com.facebook.drawee.interfaces.DraweeHierarchy;
import com.facebook.imagepipeline.image.ImageInfo;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.stfalcon.frescoimageviewer.ImageViewer;
import com.stfalcon.frescoimageviewer.adapter.RecyclingPagerAdapter;
import com.stfalcon.frescoimageviewer.drawee.ZoomableDraweeView;
import java.util.HashSet;
import me.relex.photodraweeview.OnScaleChangeListener;

class ImageViewerAdapter
extends RecyclingPagerAdapter<ImageViewHolder> {
    private Context context;
    private ImageViewer.DataSet<?> dataSet;
    private GenericDraweeHierarchyBuilder hierarchyBuilder;
    private HashSet<ImageViewHolder> holders;
    private ImageRequestBuilder imageRequestBuilder;
    private boolean isZoomingAllowed;

    public ImageViewerAdapter(Context context, ImageViewer.DataSet<?> dataSet, ImageRequestBuilder imageRequestBuilder, GenericDraweeHierarchyBuilder genericDraweeHierarchyBuilder, boolean bl) {
        this.context = context;
        this.dataSet = dataSet;
        this.holders = new HashSet();
        this.imageRequestBuilder = imageRequestBuilder;
        this.hierarchyBuilder = genericDraweeHierarchyBuilder;
        this.isZoomingAllowed = bl;
    }

    private BaseControllerListener<ImageInfo> getDraweeControllerListener(ZoomableDraweeView zoomableDraweeView) {
        return new BaseControllerListener<ImageInfo>(this, zoomableDraweeView){
            public final ImageViewerAdapter this$0;
            public final ZoomableDraweeView val$drawee;
            {
                this.this$0 = imageViewerAdapter;
                this.val$drawee = zoomableDraweeView;
            }

            public void onFinalImageSet(String string, ImageInfo imageInfo, Animatable animatable) {
                super.onFinalImageSet(string, (Object)imageInfo, animatable);
                if (imageInfo == null) {
                    return;
                }
                this.val$drawee.update(imageInfo.getWidth(), imageInfo.getHeight());
            }
        };
    }

    @Override
    public int getItemCount() {
        return this.dataSet.getData().size();
    }

    public String getUrl(int n4) {
        return this.dataSet.format(n4);
    }

    public boolean isScaled(int n4) {
        for (ImageViewHolder imageViewHolder : this.holders) {
            if (imageViewHolder.position != n4) continue;
            return imageViewHolder.isScaled;
        }
        return false;
    }

    @Override
    public void onBindViewHolder(ImageViewHolder imageViewHolder, int n4) {
        imageViewHolder.bind(n4);
    }

    @Override
    public ImageViewHolder onCreateViewHolder(ViewGroup object, int n4) {
        object = new ZoomableDraweeView(this.context);
        object.setEnabled(this.isZoomingAllowed);
        object = new OnScaleChangeListener(this, (View)object){
            private ZoomableDraweeView drawee;
            private boolean isScaled;
            private int position;
            public final ImageViewerAdapter this$0;
            {
                this.this$0 = imageViewerAdapter;
                super(view);
                this.position = -1;
                this.drawee = (ZoomableDraweeView)view;
            }

            private void setController(String string) {
                PipelineDraweeControllerBuilder pipelineDraweeControllerBuilder = Fresco.newDraweeControllerBuilder();
                pipelineDraweeControllerBuilder.setUri(string);
                pipelineDraweeControllerBuilder.setOldController(this.drawee.getController());
                pipelineDraweeControllerBuilder.setControllerListener((ControllerListener)this.this$0.getDraweeControllerListener(this.drawee));
                if (this.this$0.imageRequestBuilder != null) {
                    this.this$0.imageRequestBuilder.setSource(Uri.parse((String)string));
                    pipelineDraweeControllerBuilder.setImageRequest((Object)this.this$0.imageRequestBuilder.build());
                }
                this.drawee.setController((DraweeController)pipelineDraweeControllerBuilder.build());
            }

            private void tryToSetHierarchy() {
                if (this.this$0.hierarchyBuilder != null) {
                    this.this$0.hierarchyBuilder.setActualImageScaleType(ScalingUtils.ScaleType.FIT_CENTER);
                    this.drawee.setHierarchy((DraweeHierarchy)this.this$0.hierarchyBuilder.build());
                }
            }

            public void bind(int n4) {
                this.position = n4;
                this.tryToSetHierarchy();
                this.setController(this.this$0.dataSet.format(n4));
                this.drawee.setOnScaleChangeListener(this);
            }

            public void onScaleChange(float f, float f2, float f3) {
                boolean bl = this.drawee.getScale() > 1.0f;
                this.isScaled = bl;
            }

            public void resetScale() {
                this.drawee.setScale(1.0f, true);
            }
        };
        this.holders.add(object);
        return object;
    }

    public void resetScale(int n4) {
        for (ImageViewHolder imageViewHolder : this.holders) {
            if (imageViewHolder.position != n4) continue;
            imageViewHolder.resetScale();
            break;
        }
    }
}

