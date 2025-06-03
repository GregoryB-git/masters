/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  android.util.AttributeSet
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  com.google.android.gms.cast.framework.media.widget.MiniControllerFragment
 *  java.lang.Exception
 *  java.lang.Object
 */
package tvrain.cast;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.cast.framework.media.widget.MiniControllerFragment;

public class CustomMiniControllerFragment
extends MiniControllerFragment {
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        try {
            bundle = super.onCreateView(layoutInflater, viewGroup, bundle);
            return bundle;
        }
        catch (Exception exception) {
            return layoutInflater.inflate(2131492970, viewGroup, false);
        }
    }

    public void onInflate(Context context, AttributeSet attributeSet, Bundle bundle) {
        try {
            super.onInflate(context, attributeSet, bundle);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}

