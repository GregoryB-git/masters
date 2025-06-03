/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.annotation.TargetApi
 *  android.graphics.Insets
 *  android.view.View
 *  android.view.View$OnApplyWindowInsetsListener
 *  android.view.WindowInsets
 *  android.view.WindowInsets$Builder
 *  android.view.WindowInsetsAnimation
 *  java.lang.Math
 *  java.lang.Object
 *  java.util.Iterator
 *  java.util.List
 */
package io.flutter.plugin.editing;

import I.B;
import I.F;
import I.M;
import I.N;
import I.P;
import I.S;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.graphics.Insets;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import io.flutter.plugin.editing.c;
import io.flutter.plugin.editing.d;
import io.flutter.plugin.editing.e;
import io.flutter.plugin.editing.f;
import io.flutter.plugin.editing.g;
import java.util.Iterator;
import java.util.List;

@SuppressLint(value={"NewApi", "Override"})
@TargetApi(value=30)
@Keep
class ImeSyncDeferringInsetsCallback {
    private boolean animating = false;
    private AnimationCallback animationCallback;
    private final int deferredInsetTypes = S.a();
    private b insetsListener;
    private WindowInsets lastWindowInsets;
    private boolean needsSave = false;
    private View view;

    public ImeSyncDeferringInsetsCallback(@NonNull View view) {
        this.view = view;
        this.animationCallback = new AnimationCallback();
        this.insetsListener = new b(null);
    }

    public WindowInsetsAnimation$Callback getAnimationCallback() {
        return this.animationCallback;
    }

    public View.OnApplyWindowInsetsListener getInsetsListener() {
        return this.insetsListener;
    }

    public void install() {
        io.flutter.plugin.editing.b.a(this.view, this.animationCallback);
        this.view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener)this.insetsListener);
    }

    public void remove() {
        io.flutter.plugin.editing.b.a(this.view, null);
        this.view.setOnApplyWindowInsetsListener(null);
    }

    @Keep
    public class AnimationCallback
    extends WindowInsetsAnimation$Callback {
        public AnimationCallback() {
            super(1);
        }

        public void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
            if (ImeSyncDeferringInsetsCallback.this.animating && (c.a(windowInsetsAnimation) & ImeSyncDeferringInsetsCallback.this.deferredInsetTypes) != 0) {
                ImeSyncDeferringInsetsCallback.this.animating = false;
                if (ImeSyncDeferringInsetsCallback.this.lastWindowInsets != null && ImeSyncDeferringInsetsCallback.this.view != null) {
                    ImeSyncDeferringInsetsCallback.this.view.dispatchApplyWindowInsets(ImeSyncDeferringInsetsCallback.this.lastWindowInsets);
                }
            }
        }

        public void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
            ImeSyncDeferringInsetsCallback.this.needsSave = true;
            if ((c.a(windowInsetsAnimation) & ImeSyncDeferringInsetsCallback.this.deferredInsetTypes) != 0) {
                ImeSyncDeferringInsetsCallback.this.animating = true;
            }
        }

        public WindowInsets onProgress(WindowInsets windowInsets, List<WindowInsetsAnimation> iterator) {
            if (ImeSyncDeferringInsetsCallback.this.animating) {
                if (ImeSyncDeferringInsetsCallback.this.needsSave) {
                    return windowInsets;
                }
                iterator = iterator.iterator();
                int n8 = 0;
                while (iterator.hasNext()) {
                    if ((c.a(d.a(iterator.next())) & ImeSyncDeferringInsetsCallback.this.deferredInsetTypes) == 0) continue;
                    n8 = 1;
                }
                if (n8 == 0) {
                    return windowInsets;
                }
                n8 = ImeSyncDeferringInsetsCallback.this.view.getWindowSystemUiVisibility();
                n8 = (n8 & 512) == 0 && (n8 & 2) == 0 ? A.e.a(M.a(windowInsets, P.a())) : 0;
                g.a();
                iterator = F.a(ImeSyncDeferringInsetsCallback.this.lastWindowInsets);
                Insets insets = e.a(0, 0, 0, Math.max((int)(A.e.a(M.a(windowInsets, ImeSyncDeferringInsetsCallback.this.deferredInsetTypes)) - n8), (int)0));
                f.a((WindowInsets.Builder)iterator, ImeSyncDeferringInsetsCallback.this.deferredInsetTypes, insets);
                ImeSyncDeferringInsetsCallback.this.view.onApplyWindowInsets(B.a((WindowInsets.Builder)iterator));
            }
            return windowInsets;
        }
    }

    public class b
    implements View.OnApplyWindowInsetsListener {
        public b() {
        }

        public /* synthetic */ b( a8) {
            this();
        }

        public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            ImeSyncDeferringInsetsCallback.this.view = view;
            if (ImeSyncDeferringInsetsCallback.this.needsSave) {
                ImeSyncDeferringInsetsCallback.this.lastWindowInsets = windowInsets;
                ImeSyncDeferringInsetsCallback.this.needsSave = false;
            }
            if (ImeSyncDeferringInsetsCallback.this.animating) {
                return N.a();
            }
            return view.onApplyWindowInsets(windowInsets);
        }
    }

}

