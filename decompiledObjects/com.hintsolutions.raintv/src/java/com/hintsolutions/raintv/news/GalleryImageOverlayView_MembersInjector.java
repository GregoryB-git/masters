/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  dagger.MembersInjector
 *  java.lang.Object
 *  javax.inject.Provider
 */
package com.hintsolutions.raintv.news;

import android.content.Context;
import com.hintsolutions.raintv.news.GalleryImageOverlayView;
import dagger.MembersInjector;
import javax.inject.Provider;

public final class GalleryImageOverlayView_MembersInjector
implements MembersInjector<GalleryImageOverlayView> {
    private final Provider<Context> contextProvider;

    public GalleryImageOverlayView_MembersInjector(Provider<Context> provider) {
        this.contextProvider = provider;
    }

    public static MembersInjector<GalleryImageOverlayView> create(Provider<Context> provider) {
        return new GalleryImageOverlayView_MembersInjector(provider);
    }

    public static void injectContext(GalleryImageOverlayView galleryImageOverlayView, Context context) {
        galleryImageOverlayView.context = context;
    }

    public void injectMembers(GalleryImageOverlayView galleryImageOverlayView) {
        GalleryImageOverlayView_MembersInjector.injectContext(galleryImageOverlayView, (Context)this.contextProvider.get());
    }
}

