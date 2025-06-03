/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnLongClickListener
 *  androidx.core.view.DragStartHelper
 *  java.lang.Object
 */
import android.view.View;
import androidx.core.view.DragStartHelper;

public final class d1
implements View.OnLongClickListener {
    public final DragStartHelper a;

    public /* synthetic */ d1(DragStartHelper dragStartHelper) {
        this.a = dragStartHelper;
    }

    public final boolean onLongClick(View view) {
        return this.a.onLongClick(view);
    }
}

