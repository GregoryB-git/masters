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
 *  androidx.core.content.ContextCompat
 *  java.io.FileNotFoundException
 *  java.io.InputStream
 *  java.lang.Object
 *  java.lang.String
 */
package com.mikepenz.materialize.holder;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import androidx.annotation.DrawableRes;
import androidx.core.content.ContextCompat;
import com.mikepenz.materialize.drawable.PressedEffectStateListDrawable;
import com.mikepenz.materialize.util.UIUtils;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class ImageHolder {
    private Bitmap mBitmap;
    private Drawable mIcon;
    private int mIconRes;
    private Uri mUri;

    public ImageHolder(@DrawableRes int n) {
        this.mIconRes = n;
    }

    public ImageHolder(Bitmap bitmap) {
        this.mIconRes = -1;
        this.mBitmap = bitmap;
    }

    public ImageHolder(Drawable drawable2) {
        this.mIconRes = -1;
        this.mIcon = drawable2;
    }

    public ImageHolder(Uri uri) {
        this.mIconRes = -1;
        this.mUri = uri;
    }

    public ImageHolder(String string2) {
        this.mIconRes = -1;
        this.mUri = Uri.parse((String)string2);
    }

    public static void applyDecidedIconOrSetGone(ImageHolder imageHolder, ImageView imageView, int n, boolean bl) {
        if (imageHolder != null && imageView != null) {
            Drawable drawable2 = ImageHolder.decideIcon(imageHolder, imageView.getContext(), n, bl);
            if (drawable2 != null) {
                imageView.setImageDrawable(drawable2);
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

    public static void applyMultiIconTo(Drawable drawable2, int n, Drawable drawable3, int n2, boolean bl, ImageView imageView) {
        if (drawable2 != null) {
            if (drawable3 != null) {
                if (bl) {
                    imageView.setImageDrawable((Drawable)new PressedEffectStateListDrawable(drawable2, drawable3, n, n2));
                } else {
                    imageView.setImageDrawable((Drawable)UIUtils.getIconStateList(drawable2, drawable3));
                }
            } else if (bl) {
                imageView.setImageDrawable((Drawable)new PressedEffectStateListDrawable(drawable2, n, n2));
            } else {
                imageView.setImageDrawable(drawable2);
            }
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(8);
        }
    }

    public static boolean applyTo(ImageHolder imageHolder, ImageView imageView) {
        return ImageHolder.applyTo(imageHolder, imageView, null);
    }

    public static boolean applyTo(ImageHolder imageHolder, ImageView imageView, String string2) {
        if (imageHolder != null && imageView != null) {
            return imageHolder.applyTo(imageView, string2);
        }
        return false;
    }

    public static void applyToOrSetGone(ImageHolder imageHolder, ImageView imageView) {
        ImageHolder.applyToOrSetGone(imageHolder, imageView, null);
    }

    public static void applyToOrSetGone(ImageHolder imageHolder, ImageView imageView, String string2) {
        boolean bl = ImageHolder.applyTo(imageHolder, imageView, string2);
        if (imageView != null) {
            if (bl) {
                imageView.setVisibility(0);
            } else {
                imageView.setVisibility(8);
            }
        }
    }

    public static void applyToOrSetInvisible(ImageHolder imageHolder, ImageView imageView) {
        ImageHolder.applyToOrSetInvisible(imageHolder, imageView, null);
    }

    public static void applyToOrSetInvisible(ImageHolder imageHolder, ImageView imageView, String string2) {
        boolean bl = ImageHolder.applyTo(imageHolder, imageView, string2);
        if (imageView != null) {
            if (bl) {
                imageView.setVisibility(0);
            } else {
                imageView.setVisibility(4);
            }
        }
    }

    public static Drawable decideIcon(ImageHolder imageHolder, Context context, int n, boolean bl) {
        if (imageHolder == null) {
            return null;
        }
        return imageHolder.decideIcon(context, n, bl);
    }

    public boolean applyTo(ImageView imageView) {
        return this.applyTo(imageView, null);
    }

    public boolean applyTo(ImageView imageView, String string2) {
        block6: {
            block3: {
                block5: {
                    block4: {
                        block2: {
                            string2 = this.mUri;
                            if (string2 == null) break block2;
                            imageView.setImageURI((Uri)string2);
                            break block3;
                        }
                        string2 = this.mIcon;
                        if (string2 == null) break block4;
                        imageView.setImageDrawable((Drawable)string2);
                        break block3;
                    }
                    string2 = this.mBitmap;
                    if (string2 == null) break block5;
                    imageView.setImageBitmap((Bitmap)string2);
                    break block3;
                }
                int n = this.mIconRes;
                if (n == -1) break block6;
                imageView.setImageResource(n);
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
    public Drawable decideIcon(Context context, int n, boolean bl) {
        Drawable drawable2;
        Drawable drawable3 = this.mIcon;
        int n2 = this.mIconRes;
        if (n2 != -1) {
            drawable2 = ContextCompat.getDrawable((Context)context, (int)n2);
        } else {
            drawable2 = drawable3;
            if (this.mUri != null) {
                try {
                    drawable2 = Drawable.createFromStream((InputStream)context.getContentResolver().openInputStream(this.mUri), (String)this.mUri.toString());
                }
                catch (FileNotFoundException fileNotFoundException) {
                    drawable2 = drawable3;
                }
            }
        }
        context = drawable2;
        if (drawable2 != null) {
            context = drawable2;
            if (bl) {
                context = drawable2.mutate();
                context.setColorFilter(n, PorterDuff.Mode.SRC_IN);
            }
        }
        return context;
    }

    public Bitmap getBitmap() {
        return this.mBitmap;
    }

    public Drawable getIcon() {
        return this.mIcon;
    }

    public int getIconRes() {
        return this.mIconRes;
    }

    public Uri getUri() {
        return this.mUri;
    }

    public void setBitmap(Bitmap bitmap) {
        this.mBitmap = bitmap;
    }

    public void setIcon(Drawable drawable2) {
        this.mIcon = drawable2;
    }

    public void setIconRes(int n) {
        this.mIconRes = n;
    }

    public void setUri(Uri uri) {
        this.mUri = uri;
    }
}

