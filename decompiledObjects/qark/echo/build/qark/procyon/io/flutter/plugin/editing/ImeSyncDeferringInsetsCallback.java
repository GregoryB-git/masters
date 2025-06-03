// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package io.flutter.plugin.editing;

import I.N;
import android.view.WindowInsets$Builder;
import java.util.Iterator;
import I.B;
import I.F;
import A.e;
import I.M;
import I.P;
import java.util.List;
import android.view.WindowInsetsAnimation;
import android.view.View$OnApplyWindowInsetsListener;
import android.view.WindowInsetsAnimation$Callback;
import I.S;
import androidx.annotation.NonNull;
import android.view.View;
import android.view.WindowInsets;
import androidx.annotation.Keep;
import android.annotation.TargetApi;
import android.annotation.SuppressLint;

@SuppressLint({ "NewApi", "Override" })
@TargetApi(30)
@Keep
class ImeSyncDeferringInsetsCallback
{
    private boolean animating;
    private AnimationCallback animationCallback;
    private final int deferredInsetTypes;
    private b insetsListener;
    private WindowInsets lastWindowInsets;
    private boolean needsSave;
    private View view;
    
    public ImeSyncDeferringInsetsCallback(@NonNull final View view) {
        this.deferredInsetTypes = S.a();
        this.animating = false;
        this.needsSave = false;
        this.view = view;
        this.animationCallback = new AnimationCallback();
        this.insetsListener = new b(null);
    }
    
    public static /* synthetic */ boolean access$100(final ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback) {
        return imeSyncDeferringInsetsCallback.needsSave;
    }
    
    public static /* synthetic */ boolean access$102(final ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback, final boolean needsSave) {
        return imeSyncDeferringInsetsCallback.needsSave = needsSave;
    }
    
    public static /* synthetic */ int access$200(final ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback) {
        return imeSyncDeferringInsetsCallback.deferredInsetTypes;
    }
    
    public static /* synthetic */ boolean access$300(final ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback) {
        return imeSyncDeferringInsetsCallback.animating;
    }
    
    public static /* synthetic */ boolean access$302(final ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback, final boolean animating) {
        return imeSyncDeferringInsetsCallback.animating = animating;
    }
    
    public static /* synthetic */ View access$400(final ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback) {
        return imeSyncDeferringInsetsCallback.view;
    }
    
    public static /* synthetic */ View access$402(final ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback, final View view) {
        return imeSyncDeferringInsetsCallback.view = view;
    }
    
    public static /* synthetic */ WindowInsets access$500(final ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback) {
        return imeSyncDeferringInsetsCallback.lastWindowInsets;
    }
    
    public static /* synthetic */ WindowInsets access$502(final ImeSyncDeferringInsetsCallback imeSyncDeferringInsetsCallback, final WindowInsets lastWindowInsets) {
        return imeSyncDeferringInsetsCallback.lastWindowInsets = lastWindowInsets;
    }
    
    public WindowInsetsAnimation$Callback getAnimationCallback() {
        return this.animationCallback;
    }
    
    public View$OnApplyWindowInsetsListener getInsetsListener() {
        return (View$OnApplyWindowInsetsListener)this.insetsListener;
    }
    
    public void install() {
        io.flutter.plugin.editing.b.a(this.view, (WindowInsetsAnimation$Callback)this.animationCallback);
        this.view.setOnApplyWindowInsetsListener((View$OnApplyWindowInsetsListener)this.insetsListener);
    }
    
    public void remove() {
        io.flutter.plugin.editing.b.a(this.view, (WindowInsetsAnimation$Callback)null);
        this.view.setOnApplyWindowInsetsListener((View$OnApplyWindowInsetsListener)null);
    }
    
    @Keep
    public class AnimationCallback extends WindowInsetsAnimation$Callback
    {
        public AnimationCallback() {
            super(1);
        }
        
        public void onEnd(final WindowInsetsAnimation windowInsetsAnimation) {
            if (ImeSyncDeferringInsetsCallback.access$300(ImeSyncDeferringInsetsCallback.this) && (c.a(windowInsetsAnimation) & ImeSyncDeferringInsetsCallback.access$200(ImeSyncDeferringInsetsCallback.this)) != 0x0) {
                ImeSyncDeferringInsetsCallback.access$302(ImeSyncDeferringInsetsCallback.this, false);
                if (ImeSyncDeferringInsetsCallback.access$500(ImeSyncDeferringInsetsCallback.this) != null && ImeSyncDeferringInsetsCallback.access$400(ImeSyncDeferringInsetsCallback.this) != null) {
                    ImeSyncDeferringInsetsCallback.access$400(ImeSyncDeferringInsetsCallback.this).dispatchApplyWindowInsets(ImeSyncDeferringInsetsCallback.access$500(ImeSyncDeferringInsetsCallback.this));
                }
            }
        }
        
        public void onPrepare(final WindowInsetsAnimation windowInsetsAnimation) {
            ImeSyncDeferringInsetsCallback.access$102(ImeSyncDeferringInsetsCallback.this, true);
            if ((c.a(windowInsetsAnimation) & ImeSyncDeferringInsetsCallback.access$200(ImeSyncDeferringInsetsCallback.this)) != 0x0) {
                ImeSyncDeferringInsetsCallback.access$302(ImeSyncDeferringInsetsCallback.this, true);
            }
        }
        
        public WindowInsets onProgress(final WindowInsets windowInsets, final List<WindowInsetsAnimation> list) {
            if (ImeSyncDeferringInsetsCallback.access$300(ImeSyncDeferringInsetsCallback.this)) {
                if (ImeSyncDeferringInsetsCallback.access$100(ImeSyncDeferringInsetsCallback.this)) {
                    return windowInsets;
                }
                final Iterator<WindowInsetsAnimation> iterator = list.iterator();
                boolean b = false;
                while (iterator.hasNext()) {
                    if ((c.a(d.a((Object)iterator.next())) & ImeSyncDeferringInsetsCallback.access$200(ImeSyncDeferringInsetsCallback.this)) != 0x0) {
                        b = true;
                    }
                }
                if (!b) {
                    return windowInsets;
                }
                final int windowSystemUiVisibility = ImeSyncDeferringInsetsCallback.access$400(ImeSyncDeferringInsetsCallback.this).getWindowSystemUiVisibility();
                int a;
                if ((windowSystemUiVisibility & 0x200) == 0x0 && (windowSystemUiVisibility & 0x2) == 0x0) {
                    a = e.a(M.a(windowInsets, P.a()));
                }
                else {
                    a = 0;
                }
                g.a();
                final WindowInsets$Builder a2 = F.a(ImeSyncDeferringInsetsCallback.access$500(ImeSyncDeferringInsetsCallback.this));
                f.a(a2, ImeSyncDeferringInsetsCallback.access$200(ImeSyncDeferringInsetsCallback.this), io.flutter.plugin.editing.e.a(0, 0, 0, Math.max(e.a(M.a(windowInsets, ImeSyncDeferringInsetsCallback.access$200(ImeSyncDeferringInsetsCallback.this))) - a, 0)));
                ImeSyncDeferringInsetsCallback.access$400(ImeSyncDeferringInsetsCallback.this).onApplyWindowInsets(B.a(a2));
            }
            return windowInsets;
        }
    }
    
    public class b implements View$OnApplyWindowInsetsListener
    {
        public WindowInsets onApplyWindowInsets(final View view, final WindowInsets windowInsets) {
            ImeSyncDeferringInsetsCallback.access$402(ImeSyncDeferringInsetsCallback.this, view);
            if (ImeSyncDeferringInsetsCallback.access$100(ImeSyncDeferringInsetsCallback.this)) {
                ImeSyncDeferringInsetsCallback.access$502(ImeSyncDeferringInsetsCallback.this, windowInsets);
                ImeSyncDeferringInsetsCallback.access$102(ImeSyncDeferringInsetsCallback.this, false);
            }
            if (ImeSyncDeferringInsetsCallback.access$300(ImeSyncDeferringInsetsCallback.this)) {
                return N.a();
            }
            return view.onApplyWindowInsets(windowInsets);
        }
    }
}
