/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Bitmap
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.drawable.Drawable
 *  android.net.Uri
 *  android.widget.ImageView
 *  androidx.annotation.DrawableRes
 *  androidx.appcompat.content.res.AppCompatResources
 *  com.mikepenz.iconics.IconicsDrawable
 *  com.mikepenz.iconics.typeface.IIcon
 *  java.io.FileNotFoundException
 *  java.io.InputStream
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package com.mikepenz.materialdrawer.holder;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import androidx.annotation.DrawableRes;
import androidx.appcompat.content.res.AppCompatResources;
import com.mikepenz.iconics.IconicsDrawable;
import com.mikepenz.iconics.typeface.IIcon;
import com.mikepenz.materialdrawer.util.DrawerImageLoader;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class ImageHolder
extends com.mikepenz.materialize.holder.ImageHolder {
    private IIcon mIIcon;

    public ImageHolder(@DrawableRes int n) {
        super(n);
    }

    public ImageHolder(Bitmap bitmap) {
        super(bitmap);
    }

    public ImageHolder(Drawable drawable) {
        super(drawable);
    }

    public ImageHolder(Uri uri) {
        super(uri);
    }

    public ImageHolder(IIcon iIcon) {
        super((Bitmap)null);
        this.mIIcon = iIcon;
    }

    public ImageHolder(String string) {
        super(string);
    }

    public static void applyDecidedIconOrSetGone(ImageHolder imageHolder, ImageView imageView, int n, boolean bl, int n2) {
        if (imageHolder != null && imageView != null) {
            Drawable drawable = ImageHolder.decideIcon(imageHolder, imageView.getContext(), n, bl, n2);
            if (drawable != null) {
                imageView.setImageDrawable(drawable);
                imageView.setVisibility(0);
            } else if (imageHolder.getBitmap() != null) {
                imageView.setImageBitmap(imageHolder.getBitmap());
                imageView.setVisibility(0);
            } else {
                imageView.setVisibility(8);
            }
        } else if (imageView != null) {
            imageView.setVisibility(8);
        }
    }

    public static Drawable decideIcon(ImageHolder imageHolder, Context context, int n, boolean bl, int n2) {
        if (imageHolder == null) {
            return null;
        }
        return imageHolder.decideIcon(context, n, bl, n2);
    }

    @Override
    public boolean applyTo(ImageView imageView, String string) {
        block10: {
            block6: {
                block9: {
                    block8: {
                        block7: {
                            block5: {
                                if (this.getUri() == null) break block5;
                                if (!DrawerImageLoader.getInstance().setImage(imageView, this.getUri(), string)) {
                                    imageView.setImageURI(this.getUri());
                                }
                                break block6;
                            }
                            if (this.getIcon() == null) break block7;
                            imageView.setImageDrawable(this.getIcon());
                            break block6;
                        }
                        if (this.getBitmap() == null) break block8;
                        imageView.setImageBitmap(this.getBitmap());
                        break block6;
                    }
                    if (this.getIconRes() == -1) break block9;
                    imageView.setImageResource(this.getIconRes());
                    break block6;
                }
                if (this.mIIcon == null) break block10;
                imageView.setImageDrawable((Drawable)new IconicsDrawable(imageView.getContext(), this.mIIcon).actionBar());
            }
            return true;
        }
        imageView.setImageBitmap(null);
        return false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Drawable decideIcon(Context context, int n, boolean bl, int n2) {
        Drawable drawable;
        Drawable drawable2 = this.getIcon();
        if (this.mIIcon != null) {
            drawable = new IconicsDrawable(context, this.mIIcon).color(n).sizeDp(24).paddingDp(n2);
        } else if (this.getIconRes() != -1) {
            drawable = AppCompatResources.getDrawable((Context)context, (int)this.getIconRes());
        } else {
            drawable = drawable2;
            if (this.getUri() != null) {
                try {
                    drawable = Drawable.createFromStream((InputStream)context.getContentResolver().openInputStream(this.getUri()), (String)this.getUri().toString());
                }
                catch (FileNotFoundException fileNotFoundException) {
                    drawable = drawable2;
                }
            }
        }
        context = drawable;
        if (drawable != null) {
            context = drawable;
            if (bl) {
                context = drawable;
                if (this.mIIcon == null) {
                    context = drawable.mutate();
                    context.setColorFilter(n, PorterDuff.Mode.SRC_IN);
                }
            }
        }
        return context;
    }

    public IIcon getIIcon() {
        return this.mIIcon;
    }

    public void setIIcon(IIcon iIcon) {
        this.mIIcon = iIcon;
    }
}

