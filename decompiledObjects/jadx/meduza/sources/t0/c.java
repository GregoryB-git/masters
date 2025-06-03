package t0;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.emoji2.text.EmojiCompatInitializer;
import b1.k;
import b1.o;

/* loaded from: classes.dex */
public final class c implements b1.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f14385a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EmojiCompatInitializer f14386b;

    public c(EmojiCompatInitializer emojiCompatInitializer, k kVar) {
        this.f14386b = emojiCompatInitializer;
        this.f14385a = kVar;
    }

    @Override // b1.d
    public final void onCreate(o oVar) {
    }

    @Override // b1.d
    public final void onDestroy(o oVar) {
    }

    @Override // b1.d
    public final void onPause(o oVar) {
    }

    @Override // b1.d
    public final void onResume(o oVar) {
        this.f14386b.getClass();
        (Build.VERSION.SDK_INT >= 28 ? b.a(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new EmojiCompatInitializer.c(), 500L);
        this.f14385a.c(this);
    }

    @Override // b1.d
    public final void onStart(o oVar) {
    }

    @Override // b1.d
    public final void onStop(o oVar) {
    }
}
