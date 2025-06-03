// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package android.support.v4.media.session;

import android.os.Looper;
import android.media.session.PlaybackState;
import android.media.MediaMetadata;
import androidx.media.AudioAttributesCompat;
import android.media.session.MediaController$PlaybackInfo;
import android.os.Message;
import android.media.session.MediaController$Callback;
import android.os.IBinder$DeathRecipient;
import android.support.v4.media.MediaMetadataCompat;
import w.d;
import java.lang.ref.WeakReference;
import android.os.ResultReceiver;
import java.util.Iterator;
import android.os.Bundle;
import android.os.RemoteException;
import android.media.session.MediaSession$Token;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import android.media.session.MediaController;
import android.util.Log;
import android.os.Handler;
import android.app.PendingIntent;
import android.view.KeyEvent;
import a0.n;
import android.app.Activity;
import android.os.Build$VERSION;
import java.util.Collections;
import java.util.HashSet;
import android.content.Context;
import java.util.Set;

public final class MediaControllerCompat
{
    public final b a;
    public final MediaSessionCompat.Token b;
    public final Set c;
    
    public MediaControllerCompat(final Context context, final MediaSessionCompat.Token b) {
        if (b != null) {
            this.c = Collections.synchronizedSet(new HashSet<Object>());
            this.b = b;
            b a;
            if (Build$VERSION.SDK_INT >= 29) {
                a = new c(context, b);
            }
            else {
                a = new MediaControllerImplApi21(context, b);
            }
            this.a = a;
            return;
        }
        throw new IllegalArgumentException("sessionToken must not be null");
    }
    
    public MediaControllerCompat(final Context context, final MediaSessionCompat mediaSessionCompat) {
        this(context, mediaSessionCompat.c());
    }
    
    public static void f(final Activity activity, final MediaControllerCompat mediaControllerCompat) {
        activity.getWindow().getDecorView().setTag(n.a, (Object)mediaControllerCompat);
        MediaControllerImplApi21.h(activity, mediaControllerCompat);
    }
    
    public boolean a(final KeyEvent keyEvent) {
        if (keyEvent != null) {
            return this.a.c(keyEvent);
        }
        throw new IllegalArgumentException("KeyEvent may not be null");
    }
    
    public PendingIntent b() {
        return this.a.a();
    }
    
    public MediaSessionCompat.Token c() {
        return this.b;
    }
    
    public void d(final a a) {
        this.e(a, null);
    }
    
    public void e(final a a, final Handler handler) {
        if (a == null) {
            throw new IllegalArgumentException("callback must not be null");
        }
        if (!this.c.add(a)) {
            Log.w("MediaControllerCompat", "the callback has already been registered");
            return;
        }
        Handler handler2;
        if ((handler2 = handler) == null) {
            handler2 = new Handler();
        }
        a.n(handler2);
        this.a.d(a, handler2);
    }
    
    public void g(final a a) {
        if (a != null) {
            if (!this.c.remove(a)) {
                Log.w("MediaControllerCompat", "the callback has never been registered");
                return;
            }
            try {
                this.a.b(a);
                return;
            }
            finally {
                a.n(null);
            }
        }
        throw new IllegalArgumentException("callback must not be null");
    }
    
    public static class MediaControllerImplApi21 implements MediaControllerCompat.b
    {
        public final MediaController a;
        public final Object b;
        public final List c;
        public HashMap d;
        public final MediaSessionCompat.Token e;
        
        public MediaControllerImplApi21(final Context context, final MediaSessionCompat.Token e) {
            this.b = new Object();
            this.c = new ArrayList();
            this.d = new HashMap();
            this.e = e;
            this.a = new MediaController(context, (MediaSession$Token)e.e());
            if (e.c() == null) {
                this.f();
            }
        }
        
        public static void h(final Activity activity, final MediaControllerCompat mediaControllerCompat) {
            MediaController mediaController;
            if (mediaControllerCompat != null) {
                mediaController = new MediaController((Context)activity, (MediaSession$Token)mediaControllerCompat.c().e());
            }
            else {
                mediaController = null;
            }
            activity.setMediaController(mediaController);
        }
        
        @Override
        public PendingIntent a() {
            return this.a.getSessionActivity();
        }
        
        @Override
        public final void b(final MediaControllerCompat.a a) {
            this.a.unregisterCallback(a.a);
            final Object b = this.b;
            // monitorenter(b)
            while (true) {
                Label_0084: {
                    try {
                        if (this.e.c() == null) {
                            break Label_0084;
                        }
                        final MediaControllerImplApi21 mediaControllerImplApi21 = this;
                        final HashMap hashMap = mediaControllerImplApi21.d;
                        final MediaControllerCompat.a a2 = a;
                        final a a3 = hashMap.remove(a2);
                        final a a4 = a3;
                        final a a6;
                        final a a5 = a6 = a4;
                        if (a6 != null) {
                            final MediaControllerCompat.a a7 = a;
                            final android.support.v4.media.session.a a8 = null;
                            a7.c = a8;
                            final MediaControllerImplApi21 mediaControllerImplApi22 = this;
                            final MediaSessionCompat.Token token = mediaControllerImplApi22.e;
                            final b b2 = token.c();
                            final a a9 = a5;
                            b2.u0(a9);
                        }
                        break Label_0095;
                    }
                    finally {
                        // monitorexit(b)
                        // monitorexit(b)
                        return;
                        this.c.remove(a);
                        continue;
                    }
                }
                try {
                    final MediaControllerImplApi21 mediaControllerImplApi21 = this;
                    final HashMap hashMap = mediaControllerImplApi21.d;
                    final MediaControllerCompat.a a2 = a;
                    final a a3 = hashMap.remove(a2);
                    final a a4 = a3;
                    final a a6;
                    final a a5 = a6 = a4;
                    if (a6 != null) {
                        final MediaControllerCompat.a a7 = a;
                        final android.support.v4.media.session.a a8 = null;
                        a7.c = a8;
                        final MediaControllerImplApi21 mediaControllerImplApi22 = this;
                        final MediaSessionCompat.Token token = mediaControllerImplApi22.e;
                        final b b2 = token.c();
                        final a a9 = a5;
                        b2.u0(a9);
                        continue;
                    }
                    continue;
                }
                catch (RemoteException ex) {}
                break;
            }
        }
        
        @Override
        public boolean c(final KeyEvent keyEvent) {
            return this.a.dispatchMediaButtonEvent(keyEvent);
        }
        
        @Override
        public final void d(final MediaControllerCompat.a key, Handler b) {
            this.a.registerCallback(key.a, b);
            b = (Handler)this.b;
            // monitorenter(b)
            while (true) {
                a a = null;
                Label_0094: {
                    try {
                        if (this.e.c() != null) {
                            a = new a(key);
                            this.d.put(key, a);
                            key.c = a;
                            final MediaControllerImplApi21 mediaControllerImplApi21 = this;
                            final MediaSessionCompat.Token token = mediaControllerImplApi21.e;
                            final b b2 = token.c();
                            final a a2 = a;
                            b2.A(a2);
                            final MediaControllerCompat.a a3 = key;
                            final int n = 13;
                            final Object o = null;
                            final Bundle bundle = null;
                            a3.m(n, o, bundle);
                            break Label_0110;
                        }
                        break Label_0094;
                    }
                    finally {
                        // monitorexit(b)
                        // monitorexit(b)
                        return;
                        key.c = null;
                        this.c.add(key);
                        continue;
                    }
                }
                try {
                    final MediaControllerImplApi21 mediaControllerImplApi21 = this;
                    final MediaSessionCompat.Token token = mediaControllerImplApi21.e;
                    final b b2 = token.c();
                    final a a2 = a;
                    b2.A(a2);
                    final MediaControllerCompat.a a3 = key;
                    final int n = 13;
                    final Object o = null;
                    final Bundle bundle = null;
                    a3.m(n, o, bundle);
                    continue;
                }
                catch (RemoteException ex) {}
                break;
            }
        }
        
        public void e() {
            if (this.e.c() == null) {
                return;
            }
            for (final MediaControllerCompat.a key : this.c) {
                final a a = new a(key);
                this.d.put(key, a);
                key.c = a;
                try {
                    this.e.c().A(a);
                    key.m(13, null, null);
                    continue;
                }
                catch (RemoteException ex) {
                    Log.e("MediaControllerCompat", "Dead object in registerCallback.", (Throwable)ex);
                }
                break;
            }
            this.c.clear();
        }
        
        public final void f() {
            this.g("android.support.v4.media.session.command.GET_EXTRA_BINDER", null, new ExtraBinderRequestResultReceiver(this));
        }
        
        public void g(final String s, final Bundle bundle, final ResultReceiver resultReceiver) {
            this.a.sendCommand(s, bundle, resultReceiver);
        }
        
        public static class ExtraBinderRequestResultReceiver extends ResultReceiver
        {
            public WeakReference o;
            
            public ExtraBinderRequestResultReceiver(final MediaControllerImplApi21 referent) {
                super((Handler)null);
                this.o = new WeakReference((T)referent);
            }
            
            public void onReceiveResult(final int n, final Bundle bundle) {
                final MediaControllerImplApi21 mediaControllerImplApi21 = (MediaControllerImplApi21)this.o.get();
                if (mediaControllerImplApi21 != null) {
                    if (bundle == null) {
                        return;
                    }
                    synchronized (mediaControllerImplApi21.b) {
                        mediaControllerImplApi21.e.f(android.support.v4.media.session.b.a.n(w.d.a(bundle, "android.support.v4.media.session.EXTRA_BINDER")));
                        mediaControllerImplApi21.e.g(v1.a.b(bundle, "android.support.v4.media.session.SESSION_TOKEN2"));
                        mediaControllerImplApi21.e();
                    }
                }
            }
        }
        
        public static class a extends MediaControllerCompat.a.c
        {
            public a(final MediaControllerCompat.a a) {
                super(a);
            }
            
            public void C() {
                throw new AssertionError();
            }
            
            public void E(final MediaMetadataCompat mediaMetadataCompat) {
                throw new AssertionError();
            }
            
            public void X0(final ParcelableVolumeInfo parcelableVolumeInfo) {
                throw new AssertionError();
            }
            
            public void g0(final Bundle bundle) {
                throw new AssertionError();
            }
            
            public void l0(final List list) {
                throw new AssertionError();
            }
            
            public void x(final CharSequence charSequence) {
                throw new AssertionError();
            }
        }
    }
    
    public abstract static class a implements IBinder$DeathRecipient
    {
        public final MediaController$Callback a;
        public b b;
        public a c;
        
        public a() {
            this.a = new MediaControllerCompat.a.a(this);
        }
        
        public void a(final d d) {
        }
        
        public void b(final boolean b) {
        }
        
        public void binderDied() {
            this.m(8, null, null);
        }
        
        public void c(final Bundle bundle) {
        }
        
        public void d(final MediaMetadataCompat mediaMetadataCompat) {
        }
        
        public void e(final PlaybackStateCompat playbackStateCompat) {
        }
        
        public void f(final List list) {
        }
        
        public void g(final CharSequence charSequence) {
        }
        
        public void h(final int n) {
        }
        
        public void i() {
        }
        
        public void j(final String s, final Bundle bundle) {
        }
        
        public void k() {
        }
        
        public void l(final int n) {
        }
        
        public void m(final int n, final Object o, final Bundle data) {
            final b b = this.b;
            if (b != null) {
                final Message obtainMessage = b.obtainMessage(n, o);
                obtainMessage.setData(data);
                obtainMessage.sendToTarget();
            }
        }
        
        public void n(final Handler handler) {
            if (handler == null) {
                final b b = this.b;
                if (b != null) {
                    b.a = false;
                    b.removeCallbacksAndMessages((Object)null);
                    this.b = null;
                }
            }
            else {
                final b b2 = new b(handler.getLooper());
                this.b = b2;
                b2.a = true;
            }
        }
        
        public static class a extends MediaController$Callback
        {
            public final WeakReference a;
            
            public a(final MediaControllerCompat.a referent) {
                this.a = new WeakReference((T)referent);
            }
            
            public void onAudioInfoChanged(final MediaController$PlaybackInfo mediaController$PlaybackInfo) {
                final MediaControllerCompat.a a = (MediaControllerCompat.a)this.a.get();
                if (a != null) {
                    a.a(new d(mediaController$PlaybackInfo.getPlaybackType(), AudioAttributesCompat.f(mediaController$PlaybackInfo.getAudioAttributes()), mediaController$PlaybackInfo.getVolumeControl(), mediaController$PlaybackInfo.getMaxVolume(), mediaController$PlaybackInfo.getCurrentVolume()));
                }
            }
            
            public void onExtrasChanged(final Bundle bundle) {
                MediaSessionCompat.a(bundle);
                final MediaControllerCompat.a a = (MediaControllerCompat.a)this.a.get();
                if (a != null) {
                    a.c(bundle);
                }
            }
            
            public void onMetadataChanged(final MediaMetadata mediaMetadata) {
                final MediaControllerCompat.a a = (MediaControllerCompat.a)this.a.get();
                if (a != null) {
                    a.d(MediaMetadataCompat.b(mediaMetadata));
                }
            }
            
            public void onPlaybackStateChanged(final PlaybackState playbackState) {
                final MediaControllerCompat.a a = (MediaControllerCompat.a)this.a.get();
                if (a != null) {
                    if (a.c != null) {
                        return;
                    }
                    a.e(PlaybackStateCompat.a(playbackState));
                }
            }
            
            public void onQueueChanged(final List list) {
                final MediaControllerCompat.a a = (MediaControllerCompat.a)this.a.get();
                if (a != null) {
                    a.f(MediaSessionCompat.QueueItem.b(list));
                }
            }
            
            public void onQueueTitleChanged(final CharSequence charSequence) {
                final MediaControllerCompat.a a = (MediaControllerCompat.a)this.a.get();
                if (a != null) {
                    a.g(charSequence);
                }
            }
            
            public void onSessionDestroyed() {
                final MediaControllerCompat.a a = (MediaControllerCompat.a)this.a.get();
                if (a != null) {
                    a.i();
                }
            }
            
            public void onSessionEvent(final String s, final Bundle bundle) {
                MediaSessionCompat.a(bundle);
                final MediaControllerCompat.a a = (MediaControllerCompat.a)this.a.get();
                if (a != null) {
                    a.j(s, bundle);
                }
            }
        }
        
        public class b extends Handler
        {
            public boolean a;
            
            public b(final Looper looper) {
                super(looper);
                this.a = false;
            }
            
            public void handleMessage(final Message message) {
                if (!this.a) {
                    return;
                }
                switch (message.what) {
                    default: {}
                    case 13: {
                        MediaControllerCompat.a.this.k();
                    }
                    case 12: {
                        MediaControllerCompat.a.this.l((int)message.obj);
                    }
                    case 11: {
                        MediaControllerCompat.a.this.b((boolean)message.obj);
                    }
                    case 9: {
                        MediaControllerCompat.a.this.h((int)message.obj);
                    }
                    case 8: {
                        MediaControllerCompat.a.this.i();
                    }
                    case 7: {
                        final Bundle bundle = (Bundle)message.obj;
                        MediaSessionCompat.a(bundle);
                        MediaControllerCompat.a.this.c(bundle);
                    }
                    case 6: {
                        MediaControllerCompat.a.this.g((CharSequence)message.obj);
                    }
                    case 5: {
                        MediaControllerCompat.a.this.f((List)message.obj);
                    }
                    case 4: {
                        MediaControllerCompat.a.this.a((d)message.obj);
                    }
                    case 3: {
                        MediaControllerCompat.a.this.d((MediaMetadataCompat)message.obj);
                    }
                    case 2: {
                        MediaControllerCompat.a.this.e((PlaybackStateCompat)message.obj);
                    }
                    case 1: {
                        final Bundle data = message.getData();
                        MediaSessionCompat.a(data);
                        MediaControllerCompat.a.this.j((String)message.obj, data);
                    }
                }
            }
        }
        
        public abstract static class c extends a.a
        {
            public final WeakReference b;
            
            public c(final MediaControllerCompat.a referent) {
                this.b = new WeakReference((T)referent);
            }
            
            public void J0(final boolean b) {
                final MediaControllerCompat.a a = (MediaControllerCompat.a)this.b.get();
                if (a != null) {
                    a.m(11, b, null);
                }
            }
            
            public void Q0(final PlaybackStateCompat playbackStateCompat) {
                final MediaControllerCompat.a a = (MediaControllerCompat.a)this.b.get();
                if (a != null) {
                    a.m(2, playbackStateCompat, null);
                }
            }
            
            public void d0(final int i) {
                final MediaControllerCompat.a a = (MediaControllerCompat.a)this.b.get();
                if (a != null) {
                    a.m(12, i, null);
                }
            }
            
            public void f0() {
                final MediaControllerCompat.a a = (MediaControllerCompat.a)this.b.get();
                if (a != null) {
                    a.m(13, null, null);
                }
            }
            
            public void m(final int i) {
                final MediaControllerCompat.a a = (MediaControllerCompat.a)this.b.get();
                if (a != null) {
                    a.m(9, i, null);
                }
            }
            
            public void t(final String s, final Bundle bundle) {
                final MediaControllerCompat.a a = (MediaControllerCompat.a)this.b.get();
                if (a != null) {
                    a.m(1, s, bundle);
                }
            }
            
            public void w(final boolean b) {
            }
        }
    }
    
    public interface b
    {
        PendingIntent a();
        
        void b(final MediaControllerCompat.a p0);
        
        boolean c(final KeyEvent p0);
        
        void d(final MediaControllerCompat.a p0, final Handler p1);
    }
    
    public static class c extends MediaControllerImplApi21
    {
        public c(final Context context, final MediaSessionCompat.Token token) {
            super(context, token);
        }
    }
    
    public static final class d
    {
        public final int a;
        public final AudioAttributesCompat b;
        public final int c;
        public final int d;
        public final int e;
        
        public d(final int a, final AudioAttributesCompat b, final int c, final int d, final int e) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
            this.e = e;
        }
    }
}
