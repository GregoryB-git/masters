.class public Lk5/E$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lk5/E;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field public final a:Landroid/os/Handler;

.field public b:Ljava/util/List;

.field public c:Landroidx/media/a;

.field public d:Landroid/content/BroadcastReceiver;

.field public e:Landroid/content/BroadcastReceiver;

.field public f:Landroid/content/Context;

.field public g:Landroid/media/AudioManager;

.field public h:Ljava/lang/Object;

.field public i:Ljava/util/List;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Landroid/os/Handler;

    .line 5
    .line 6
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Lk5/E$a;->a:Landroid/os/Handler;

    .line 14
    .line 15
    new-instance v0, Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, Lk5/E$a;->b:Ljava/util/List;

    .line 21
    .line 22
    new-instance v0, Ljava/util/ArrayList;

    .line 23
    .line 24
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 25
    .line 26
    .line 27
    iput-object v0, p0, Lk5/E$a;->i:Ljava/util/List;

    .line 28
    .line 29
    iput-object p1, p0, Lk5/E$a;->f:Landroid/content/Context;

    .line 30
    .line 31
    const-string v0, "audio"

    .line 32
    .line 33
    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    check-cast p1, Landroid/media/AudioManager;

    .line 38
    .line 39
    iput-object p1, p0, Lk5/E$a;->g:Landroid/media/AudioManager;

    .line 40
    .line 41
    invoke-virtual {p0}, Lk5/E$a;->z()V

    .line 42
    .line 43
    .line 44
    return-void
.end method

.method public static synthetic a(Lk5/E$a;I)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lk5/E$a;->K(I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public varargs A(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lk5/E$a;->b:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Lk5/E;

    .line 18
    .line 19
    new-instance v2, Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-static {p2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 26
    .line 27
    .line 28
    iget-object v1, v1, Lk5/E;->b:LE5/k;

    .line 29
    .line 30
    invoke-virtual {v1, p1, v2}, LE5/k;->c(Ljava/lang/String;Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    return-void
.end method

.method public B()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lk5/E$a;->g:Landroid/media/AudioManager;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/media/AudioManager;->isBluetoothScoAvailableOffCall()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method

.method public C()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lk5/E$a;->g:Landroid/media/AudioManager;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/media/AudioManager;->isBluetoothScoOn()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method

.method public D()Z
    .locals 1

    .line 1
    iget-object v0, p0, Lk5/E$a;->b:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    :goto_0
    return v0
.end method

.method public E()Ljava/lang/Object;
    .locals 1

    .line 1
    const/16 v0, 0x1d

    .line 2
    .line 3
    invoke-static {v0}, Lk5/E;->h(I)V

    .line 4
    .line 5
    .line 6
    invoke-static {}, Lk5/n;->a()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    return-object v0
.end method

.method public F()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lk5/E$a;->g:Landroid/media/AudioManager;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/media/AudioManager;->isMicrophoneMute()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method

.method public G()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lk5/E$a;->g:Landroid/media/AudioManager;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/media/AudioManager;->isMusicActive()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method

.method public H()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lk5/E$a;->g:Landroid/media/AudioManager;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/media/AudioManager;->isSpeakerphoneOn()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method

.method public I(I)Ljava/lang/Object;
    .locals 1

    .line 1
    const/16 v0, 0x17

    .line 2
    .line 3
    invoke-static {v0}, Lk5/E;->h(I)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lk5/E$a;->g:Landroid/media/AudioManager;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Landroid/media/AudioManager;->isStreamMute(I)Z

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    return-object p1
.end method

.method public J()Ljava/lang/Object;
    .locals 1

    .line 1
    const/16 v0, 0x15

    .line 2
    .line 3
    invoke-static {v0}, Lk5/E;->h(I)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lk5/E$a;->g:Landroid/media/AudioManager;

    .line 7
    .line 8
    invoke-virtual {v0}, Landroid/media/AudioManager;->isVolumeFixed()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    return-object v0
.end method

.method public final synthetic K(I)V
    .locals 2

    .line 1
    const/4 v0, -0x1

    .line 2
    if-ne p1, v0, :cond_0

    .line 3
    .line 4
    invoke-virtual {p0}, Lk5/E$a;->b()Z

    .line 5
    .line 6
    .line 7
    :cond_0
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    const/4 v0, 0x1

    .line 12
    new-array v0, v0, [Ljava/lang/Object;

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    aput-object p1, v0, v1

    .line 16
    .line 17
    const-string p1, "onAudioFocusChanged"

    .line 18
    .line 19
    invoke-virtual {p0, p1, v0}, Lk5/E$a;->A(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public L()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lk5/E$a;->g:Landroid/media/AudioManager;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/media/AudioManager;->loadSoundEffects()V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    return-object v0
.end method

.method public M(ILjava/lang/Double;)Ljava/lang/Object;
    .locals 3

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    iget-object v0, p0, Lk5/E$a;->g:Landroid/media/AudioManager;

    .line 4
    .line 5
    invoke-virtual {p2}, Ljava/lang/Double;->doubleValue()D

    .line 6
    .line 7
    .line 8
    move-result-wide v1

    .line 9
    double-to-float p2, v1

    .line 10
    invoke-virtual {v0, p1, p2}, Landroid/media/AudioManager;->playSoundEffect(IF)V

    .line 11
    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    iget-object p2, p0, Lk5/E$a;->g:Landroid/media/AudioManager;

    .line 15
    .line 16
    invoke-virtual {p2, p1}, Landroid/media/AudioManager;->playSoundEffect(I)V

    .line 17
    .line 18
    .line 19
    :goto_0
    const/4 p1, 0x0

    .line 20
    return-object p1
.end method

.method public final N()V
    .locals 4

    .line 1
    iget-object v0, p0, Lk5/E$a;->d:Landroid/content/BroadcastReceiver;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    new-instance v0, Lk5/E$a$b;

    .line 7
    .line 8
    invoke-direct {v0, p0}, Lk5/E$a$b;-><init>(Lk5/E$a;)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lk5/E$a;->d:Landroid/content/BroadcastReceiver;

    .line 12
    .line 13
    iget-object v1, p0, Lk5/E$a;->f:Landroid/content/Context;

    .line 14
    .line 15
    new-instance v2, Landroid/content/IntentFilter;

    .line 16
    .line 17
    const-string v3, "android.media.AUDIO_BECOMING_NOISY"

    .line 18
    .line 19
    invoke-direct {v2, v3}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    const/4 v3, 0x2

    .line 23
    invoke-static {v1, v0, v2, v3}, Lx/a;->h(Landroid/content/Context;Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;I)Landroid/content/Intent;

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public final O()V
    .locals 4

    .line 1
    iget-object v0, p0, Lk5/E$a;->e:Landroid/content/BroadcastReceiver;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    new-instance v0, Lk5/E$a$c;

    .line 7
    .line 8
    invoke-direct {v0, p0}, Lk5/E$a$c;-><init>(Lk5/E$a;)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lk5/E$a;->e:Landroid/content/BroadcastReceiver;

    .line 12
    .line 13
    iget-object v1, p0, Lk5/E$a;->f:Landroid/content/Context;

    .line 14
    .line 15
    new-instance v2, Landroid/content/IntentFilter;

    .line 16
    .line 17
    const-string v3, "android.media.ACTION_SCO_AUDIO_STATE_UPDATED"

    .line 18
    .line 19
    invoke-direct {v2, v3}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    const/4 v3, 0x2

    .line 23
    invoke-static {v1, v0, v2, v3}, Lx/a;->h(Landroid/content/Context;Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;I)Landroid/content/Intent;

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public P(Lk5/E;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lk5/E$a;->b:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public Q(Ljava/util/List;)Z
    .locals 5

    .line 1
    iget-object v0, p0, Lk5/E$a;->c:Landroidx/media/a;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    check-cast p1, Ljava/util/Map;

    .line 13
    .line 14
    new-instance v2, Landroidx/media/a$b;

    .line 15
    .line 16
    const-string v3, "gainType"

    .line 17
    .line 18
    invoke-interface {p1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    check-cast v3, Ljava/lang/Integer;

    .line 23
    .line 24
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    invoke-direct {v2, v3}, Landroidx/media/a$b;-><init>(I)V

    .line 29
    .line 30
    .line 31
    new-instance v3, Lk5/D;

    .line 32
    .line 33
    invoke-direct {v3, p0}, Lk5/D;-><init>(Lk5/E$a;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v2, v3}, Landroidx/media/a$b;->e(Landroid/media/AudioManager$OnAudioFocusChangeListener;)Landroidx/media/a$b;

    .line 37
    .line 38
    .line 39
    const-string v3, "audioAttributes"

    .line 40
    .line 41
    invoke-interface {p1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    if-eqz v4, :cond_1

    .line 46
    .line 47
    invoke-interface {p1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    check-cast v3, Ljava/util/Map;

    .line 52
    .line 53
    invoke-virtual {p0, v3}, Lk5/E$a;->h(Ljava/util/Map;)Landroidx/media/AudioAttributesCompat;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    invoke-virtual {v2, v3}, Landroidx/media/a$b;->c(Landroidx/media/AudioAttributesCompat;)Landroidx/media/a$b;

    .line 58
    .line 59
    .line 60
    :cond_1
    const-string v3, "willPauseWhenDucked"

    .line 61
    .line 62
    invoke-interface {p1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v4

    .line 66
    if-eqz v4, :cond_2

    .line 67
    .line 68
    invoke-interface {p1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    check-cast p1, Ljava/lang/Boolean;

    .line 73
    .line 74
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 75
    .line 76
    .line 77
    move-result p1

    .line 78
    invoke-virtual {v2, p1}, Landroidx/media/a$b;->g(Z)Landroidx/media/a$b;

    .line 79
    .line 80
    .line 81
    :cond_2
    invoke-virtual {v2}, Landroidx/media/a$b;->a()Landroidx/media/a;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    iput-object p1, p0, Lk5/E$a;->c:Landroidx/media/a;

    .line 86
    .line 87
    iget-object v2, p0, Lk5/E$a;->g:Landroid/media/AudioManager;

    .line 88
    .line 89
    invoke-static {v2, p1}, La0/b;->b(Landroid/media/AudioManager;Landroidx/media/a;)I

    .line 90
    .line 91
    .line 92
    move-result p1

    .line 93
    if-ne p1, v1, :cond_3

    .line 94
    .line 95
    goto :goto_0

    .line 96
    :cond_3
    move v1, v0

    .line 97
    :goto_0
    if-eqz v1, :cond_4

    .line 98
    .line 99
    invoke-virtual {p0}, Lk5/E$a;->N()V

    .line 100
    .line 101
    .line 102
    invoke-virtual {p0}, Lk5/E$a;->O()V

    .line 103
    .line 104
    .line 105
    :cond_4
    return v1
.end method

.method public R(I)Ljava/lang/Object;
    .locals 1

    .line 1
    const/16 v0, 0x1d

    .line 2
    .line 3
    invoke-static {v0}, Lk5/E;->h(I)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lk5/E$a;->g:Landroid/media/AudioManager;

    .line 7
    .line 8
    invoke-static {v0, p1}, Lk5/s;->a(Landroid/media/AudioManager;I)V

    .line 9
    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    return-object p1
.end method

.method public S(Z)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lk5/E$a;->g:Landroid/media/AudioManager;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/media/AudioManager;->setBluetoothScoOn(Z)V

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    return-object p1
.end method

.method public T(Ljava/lang/Integer;)Z
    .locals 4

    .line 1
    const/16 v0, 0x1f

    .line 2
    .line 3
    invoke-static {v0}, Lk5/E;->h(I)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lk5/E$a;->i:Ljava/util/List;

    .line 7
    .line 8
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_1

    .line 17
    .line 18
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    check-cast v1, Landroid/media/AudioDeviceInfo;

    .line 23
    .line 24
    invoke-virtual {v1}, Landroid/media/AudioDeviceInfo;->getId()I

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    if-ne v2, v3, :cond_0

    .line 33
    .line 34
    iget-object p1, p0, Lk5/E$a;->g:Landroid/media/AudioManager;

    .line 35
    .line 36
    invoke-static {p1, v1}, Lk5/u;->a(Landroid/media/AudioManager;Landroid/media/AudioDeviceInfo;)Z

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    return p1

    .line 41
    :cond_1
    const/4 p1, 0x0

    .line 42
    return p1
.end method

.method public U(Z)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lk5/E$a;->g:Landroid/media/AudioManager;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/media/AudioManager;->setMicrophoneMute(Z)V

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    return-object p1
.end method

.method public V(I)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lk5/E$a;->g:Landroid/media/AudioManager;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/media/AudioManager;->setMode(I)V

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    return-object p1
.end method

.method public W(Ljava/lang/String;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lk5/E$a;->g:Landroid/media/AudioManager;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/media/AudioManager;->setParameters(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    return-object p1
.end method

.method public X(I)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lk5/E$a;->g:Landroid/media/AudioManager;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/media/AudioManager;->setRingerMode(I)V

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    return-object p1
.end method

.method public Y(Z)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lk5/E$a;->g:Landroid/media/AudioManager;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/media/AudioManager;->setSpeakerphoneOn(Z)V

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    return-object p1
.end method

.method public Z(III)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lk5/E$a;->g:Landroid/media/AudioManager;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2, p3}, Landroid/media/AudioManager;->setStreamVolume(III)V

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    return-object p1
.end method

.method public a0()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lk5/E$a;->g:Landroid/media/AudioManager;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/media/AudioManager;->startBluetoothSco()V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    return-object v0
.end method

.method public b()Z
    .locals 4

    .line 1
    iget-object v0, p0, Lk5/E$a;->f:Landroid/content/Context;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    invoke-virtual {p0}, Lk5/E$a;->d0()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lk5/E$a;->e0()V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Lk5/E$a;->c:Landroidx/media/a;

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    if-nez v0, :cond_1

    .line 17
    .line 18
    return v2

    .line 19
    :cond_1
    iget-object v3, p0, Lk5/E$a;->g:Landroid/media/AudioManager;

    .line 20
    .line 21
    invoke-static {v3, v0}, La0/b;->a(Landroid/media/AudioManager;Landroidx/media/a;)I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    const/4 v3, 0x0

    .line 26
    iput-object v3, p0, Lk5/E$a;->c:Landroidx/media/a;

    .line 27
    .line 28
    if-ne v0, v2, :cond_2

    .line 29
    .line 30
    move v1, v2

    .line 31
    :cond_2
    return v1
.end method

.method public b0()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lk5/E$a;->g:Landroid/media/AudioManager;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/media/AudioManager;->stopBluetoothSco()V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    return-object v0
.end method

.method public c(Lk5/E;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lk5/E$a;->b:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public c0()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lk5/E$a;->g:Landroid/media/AudioManager;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/media/AudioManager;->unloadSoundEffects()V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    return-object v0
.end method

.method public d(III)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lk5/E$a;->g:Landroid/media/AudioManager;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2, p3}, Landroid/media/AudioManager;->adjustStreamVolume(III)V

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    return-object p1
.end method

.method public final d0()V
    .locals 2

    .line 1
    iget-object v0, p0, Lk5/E$a;->d:Landroid/content/BroadcastReceiver;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v1, p0, Lk5/E$a;->f:Landroid/content/Context;

    .line 6
    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-virtual {v1, v0}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 11
    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    iput-object v0, p0, Lk5/E$a;->d:Landroid/content/BroadcastReceiver;

    .line 15
    .line 16
    :cond_1
    :goto_0
    return-void
.end method

.method public e(III)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lk5/E$a;->g:Landroid/media/AudioManager;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2, p3}, Landroid/media/AudioManager;->adjustSuggestedStreamVolume(III)V

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    return-object p1
.end method

.method public final e0()V
    .locals 2

    .line 1
    iget-object v0, p0, Lk5/E$a;->e:Landroid/content/BroadcastReceiver;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v1, p0, Lk5/E$a;->f:Landroid/content/Context;

    .line 6
    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-virtual {v1, v0}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 11
    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    iput-object v0, p0, Lk5/E$a;->e:Landroid/content/BroadcastReceiver;

    .line 15
    .line 16
    :cond_1
    :goto_0
    return-void
.end method

.method public f(II)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lk5/E$a;->g:Landroid/media/AudioManager;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Landroid/media/AudioManager;->adjustVolume(II)V

    .line 4
    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    return-object p1
.end method

.method public g()Ljava/lang/Object;
    .locals 1

    .line 1
    const/16 v0, 0x1f

    .line 2
    .line 3
    invoke-static {v0}, Lk5/E;->h(I)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lk5/E$a;->g:Landroid/media/AudioManager;

    .line 7
    .line 8
    invoke-static {v0}, Lk5/q;->a(Landroid/media/AudioManager;)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    return-object v0
.end method

.method public final h(Ljava/util/Map;)Landroidx/media/AudioAttributesCompat;
    .locals 3

    .line 1
    new-instance v0, Landroidx/media/AudioAttributesCompat$a;

    .line 2
    .line 3
    invoke-direct {v0}, Landroidx/media/AudioAttributesCompat$a;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "contentType"

    .line 7
    .line 8
    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    if-eqz v2, :cond_0

    .line 13
    .line 14
    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    check-cast v1, Ljava/lang/Integer;

    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    invoke-virtual {v0, v1}, Landroidx/media/AudioAttributesCompat$a;->b(I)Landroidx/media/AudioAttributesCompat$a;

    .line 25
    .line 26
    .line 27
    :cond_0
    const-string v1, "flags"

    .line 28
    .line 29
    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    if-eqz v2, :cond_1

    .line 34
    .line 35
    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    check-cast v1, Ljava/lang/Integer;

    .line 40
    .line 41
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    invoke-virtual {v0, v1}, Landroidx/media/AudioAttributesCompat$a;->c(I)Landroidx/media/AudioAttributesCompat$a;

    .line 46
    .line 47
    .line 48
    :cond_1
    const-string v1, "usage"

    .line 49
    .line 50
    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    if-eqz v2, :cond_2

    .line 55
    .line 56
    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    check-cast p1, Ljava/lang/Integer;

    .line 61
    .line 62
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 63
    .line 64
    .line 65
    move-result p1

    .line 66
    invoke-virtual {v0, p1}, Landroidx/media/AudioAttributesCompat$a;->d(I)Landroidx/media/AudioAttributesCompat$a;

    .line 67
    .line 68
    .line 69
    :cond_2
    invoke-virtual {v0}, Landroidx/media/AudioAttributesCompat$a;->a()Landroidx/media/AudioAttributesCompat;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    return-object p1
.end method

.method public i(Ljava/util/Map;)Ljava/lang/Object;
    .locals 14

    .line 1
    new-instance v13, Landroid/view/KeyEvent;

    .line 2
    .line 3
    const-string v0, "downTime"

    .line 4
    .line 5
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {v0}, Lk5/E;->e(Ljava/lang/Object;)Ljava/lang/Long;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 14
    .line 15
    .line 16
    move-result-wide v1

    .line 17
    const-string v0, "eventTime"

    .line 18
    .line 19
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-static {v0}, Lk5/E;->e(Ljava/lang/Object;)Ljava/lang/Long;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 28
    .line 29
    .line 30
    move-result-wide v3

    .line 31
    const-string v0, "action"

    .line 32
    .line 33
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    check-cast v0, Ljava/lang/Integer;

    .line 38
    .line 39
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 40
    .line 41
    .line 42
    move-result v5

    .line 43
    const-string v0, "keyCode"

    .line 44
    .line 45
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    check-cast v0, Ljava/lang/Integer;

    .line 50
    .line 51
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 52
    .line 53
    .line 54
    move-result v6

    .line 55
    const-string v0, "repeatCount"

    .line 56
    .line 57
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    check-cast v0, Ljava/lang/Integer;

    .line 62
    .line 63
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 64
    .line 65
    .line 66
    move-result v7

    .line 67
    const-string v0, "metaState"

    .line 68
    .line 69
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    check-cast v0, Ljava/lang/Integer;

    .line 74
    .line 75
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 76
    .line 77
    .line 78
    move-result v8

    .line 79
    const-string v0, "deviceId"

    .line 80
    .line 81
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    check-cast v0, Ljava/lang/Integer;

    .line 86
    .line 87
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 88
    .line 89
    .line 90
    move-result v9

    .line 91
    const-string v0, "scanCode"

    .line 92
    .line 93
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    check-cast v0, Ljava/lang/Integer;

    .line 98
    .line 99
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 100
    .line 101
    .line 102
    move-result v10

    .line 103
    const-string v0, "flags"

    .line 104
    .line 105
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    check-cast v0, Ljava/lang/Integer;

    .line 110
    .line 111
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 112
    .line 113
    .line 114
    move-result v11

    .line 115
    const-string v0, "source"

    .line 116
    .line 117
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    check-cast p1, Ljava/lang/Integer;

    .line 122
    .line 123
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 124
    .line 125
    .line 126
    move-result v12

    .line 127
    move-object v0, v13

    .line 128
    invoke-direct/range {v0 .. v12}, Landroid/view/KeyEvent;-><init>(JJIIIIIIII)V

    .line 129
    .line 130
    .line 131
    iget-object p1, p0, Lk5/E$a;->g:Landroid/media/AudioManager;

    .line 132
    .line 133
    invoke-virtual {p1, v13}, Landroid/media/AudioManager;->dispatchMediaKeyEvent(Landroid/view/KeyEvent;)V

    .line 134
    .line 135
    .line 136
    const/4 p1, 0x0

    .line 137
    return-object p1
.end method

.method public j()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Lk5/E$a;->b()Z

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lk5/E$a;->k()V

    .line 5
    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    iput-object v0, p0, Lk5/E$a;->f:Landroid/content/Context;

    .line 9
    .line 10
    iput-object v0, p0, Lk5/E$a;->g:Landroid/media/AudioManager;

    .line 11
    .line 12
    return-void
.end method

.method public final k()V
    .locals 2

    .line 1
    iget-object v0, p0, Lk5/E$a;->g:Landroid/media/AudioManager;

    .line 2
    .line 3
    iget-object v1, p0, Lk5/E$a;->h:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Landroid/media/AudioDeviceCallback;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Landroid/media/AudioManager;->unregisterAudioDeviceCallback(Landroid/media/AudioDeviceCallback;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public l()Ljava/lang/Object;
    .locals 1

    .line 1
    const/16 v0, 0x15

    .line 2
    .line 3
    invoke-static {v0}, Lk5/E;->h(I)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lk5/E$a;->g:Landroid/media/AudioManager;

    .line 7
    .line 8
    invoke-virtual {v0}, Landroid/media/AudioManager;->generateAudioSessionId()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    return-object v0
.end method

.method public m()Ljava/lang/Object;
    .locals 1

    .line 1
    const/16 v0, 0x1d

    .line 2
    .line 3
    invoke-static {v0}, Lk5/E;->h(I)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lk5/E$a;->g:Landroid/media/AudioManager;

    .line 7
    .line 8
    invoke-static {v0}, Lk5/r;->a(Landroid/media/AudioManager;)I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    return-object v0
.end method

.method public n()Ljava/util/List;
    .locals 3

    .line 1
    const/16 v0, 0x1f

    .line 2
    .line 3
    invoke-static {v0}, Lk5/E;->h(I)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lk5/E$a;->g:Landroid/media/AudioManager;

    .line 7
    .line 8
    invoke-static {v0}, Lk5/t;->a(Landroid/media/AudioManager;)Ljava/util/List;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iput-object v0, p0, Lk5/E$a;->i:Ljava/util/List;

    .line 13
    .line 14
    new-instance v0, Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 17
    .line 18
    .line 19
    iget-object v1, p0, Lk5/E$a;->i:Ljava/util/List;

    .line 20
    .line 21
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-eqz v2, :cond_0

    .line 30
    .line 31
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    check-cast v2, Landroid/media/AudioDeviceInfo;

    .line 36
    .line 37
    invoke-static {v2}, Lk5/E;->c(Landroid/media/AudioDeviceInfo;)Ljava/util/Map;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    return-object v0
.end method

.method public o()Ljava/util/Map;
    .locals 1

    .line 1
    const/16 v0, 0x1f

    .line 2
    .line 3
    invoke-static {v0}, Lk5/E;->h(I)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lk5/E$a;->g:Landroid/media/AudioManager;

    .line 7
    .line 8
    invoke-static {v0}, Lk5/o;->a(Landroid/media/AudioManager;)Landroid/media/AudioDeviceInfo;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-static {v0}, Lk5/E;->c(Landroid/media/AudioDeviceInfo;)Ljava/util/Map;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    return-object v0
.end method

.method public p(I)Ljava/lang/Object;
    .locals 19

    .line 1
    const/16 v1, 0x17

    .line 2
    .line 3
    invoke-static {v1}, Lk5/E;->h(I)V

    .line 4
    .line 5
    .line 6
    new-instance v1, Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 9
    .line 10
    .line 11
    move-object/from16 v2, p0

    .line 12
    .line 13
    iget-object v3, v2, Lk5/E$a;->g:Landroid/media/AudioManager;

    .line 14
    .line 15
    move/from16 v4, p1

    .line 16
    .line 17
    invoke-virtual {v3, v4}, Landroid/media/AudioManager;->getDevices(I)[Landroid/media/AudioDeviceInfo;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    const/4 v4, 0x0

    .line 22
    move v5, v4

    .line 23
    :goto_0
    array-length v6, v3

    .line 24
    if-ge v5, v6, :cond_1

    .line 25
    .line 26
    aget-object v6, v3, v5

    .line 27
    .line 28
    sget v7, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 29
    .line 30
    const/16 v8, 0x1c

    .line 31
    .line 32
    if-lt v7, v8, :cond_0

    .line 33
    .line 34
    invoke-static {v6}, Lk5/a;->a(Landroid/media/AudioDeviceInfo;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v7

    .line 38
    goto :goto_1

    .line 39
    :cond_0
    const/4 v7, 0x0

    .line 40
    :goto_1
    invoke-virtual {v6}, Landroid/media/AudioDeviceInfo;->getId()I

    .line 41
    .line 42
    .line 43
    move-result v8

    .line 44
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 45
    .line 46
    .line 47
    move-result-object v8

    .line 48
    invoke-virtual {v6}, Landroid/media/AudioDeviceInfo;->getProductName()Ljava/lang/CharSequence;

    .line 49
    .line 50
    .line 51
    move-result-object v9

    .line 52
    invoke-virtual {v6}, Landroid/media/AudioDeviceInfo;->isSource()Z

    .line 53
    .line 54
    .line 55
    move-result v10

    .line 56
    invoke-static {v10}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 57
    .line 58
    .line 59
    move-result-object v10

    .line 60
    invoke-virtual {v6}, Landroid/media/AudioDeviceInfo;->isSink()Z

    .line 61
    .line 62
    .line 63
    move-result v11

    .line 64
    invoke-static {v11}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 65
    .line 66
    .line 67
    move-result-object v11

    .line 68
    invoke-virtual {v6}, Landroid/media/AudioDeviceInfo;->getSampleRates()[I

    .line 69
    .line 70
    .line 71
    move-result-object v12

    .line 72
    invoke-static {v12}, Lk5/E;->f([I)Ljava/util/ArrayList;

    .line 73
    .line 74
    .line 75
    move-result-object v12

    .line 76
    invoke-virtual {v6}, Landroid/media/AudioDeviceInfo;->getChannelMasks()[I

    .line 77
    .line 78
    .line 79
    move-result-object v13

    .line 80
    invoke-static {v13}, Lk5/E;->f([I)Ljava/util/ArrayList;

    .line 81
    .line 82
    .line 83
    move-result-object v13

    .line 84
    invoke-virtual {v6}, Landroid/media/AudioDeviceInfo;->getChannelIndexMasks()[I

    .line 85
    .line 86
    .line 87
    move-result-object v14

    .line 88
    invoke-static {v14}, Lk5/E;->f([I)Ljava/util/ArrayList;

    .line 89
    .line 90
    .line 91
    move-result-object v14

    .line 92
    invoke-virtual {v6}, Landroid/media/AudioDeviceInfo;->getChannelCounts()[I

    .line 93
    .line 94
    .line 95
    move-result-object v15

    .line 96
    invoke-static {v15}, Lk5/E;->f([I)Ljava/util/ArrayList;

    .line 97
    .line 98
    .line 99
    move-result-object v15

    .line 100
    invoke-virtual {v6}, Landroid/media/AudioDeviceInfo;->getEncodings()[I

    .line 101
    .line 102
    .line 103
    move-result-object v16

    .line 104
    invoke-static/range {v16 .. v16}, Lk5/E;->f([I)Ljava/util/ArrayList;

    .line 105
    .line 106
    .line 107
    move-result-object v16

    .line 108
    invoke-virtual {v6}, Landroid/media/AudioDeviceInfo;->getType()I

    .line 109
    .line 110
    .line 111
    move-result v6

    .line 112
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 113
    .line 114
    .line 115
    move-result-object v6

    .line 116
    const/16 v0, 0x16

    .line 117
    .line 118
    new-array v0, v0, [Ljava/lang/Object;

    .line 119
    .line 120
    const-string v18, "id"

    .line 121
    .line 122
    aput-object v18, v0, v4

    .line 123
    .line 124
    const/16 v17, 0x1

    .line 125
    .line 126
    aput-object v8, v0, v17

    .line 127
    .line 128
    const-string v8, "productName"

    .line 129
    .line 130
    const/16 v18, 0x2

    .line 131
    .line 132
    aput-object v8, v0, v18

    .line 133
    .line 134
    const/4 v8, 0x3

    .line 135
    aput-object v9, v0, v8

    .line 136
    .line 137
    const-string v8, "address"

    .line 138
    .line 139
    const/4 v9, 0x4

    .line 140
    aput-object v8, v0, v9

    .line 141
    .line 142
    const/4 v8, 0x5

    .line 143
    aput-object v7, v0, v8

    .line 144
    .line 145
    const-string v7, "isSource"

    .line 146
    .line 147
    const/4 v8, 0x6

    .line 148
    aput-object v7, v0, v8

    .line 149
    .line 150
    const/4 v7, 0x7

    .line 151
    aput-object v10, v0, v7

    .line 152
    .line 153
    const-string v7, "isSink"

    .line 154
    .line 155
    const/16 v8, 0x8

    .line 156
    .line 157
    aput-object v7, v0, v8

    .line 158
    .line 159
    const/16 v7, 0x9

    .line 160
    .line 161
    aput-object v11, v0, v7

    .line 162
    .line 163
    const-string v7, "sampleRates"

    .line 164
    .line 165
    const/16 v8, 0xa

    .line 166
    .line 167
    aput-object v7, v0, v8

    .line 168
    .line 169
    const/16 v7, 0xb

    .line 170
    .line 171
    aput-object v12, v0, v7

    .line 172
    .line 173
    const-string v7, "channelMasks"

    .line 174
    .line 175
    const/16 v8, 0xc

    .line 176
    .line 177
    aput-object v7, v0, v8

    .line 178
    .line 179
    const/16 v7, 0xd

    .line 180
    .line 181
    aput-object v13, v0, v7

    .line 182
    .line 183
    const-string v7, "channelIndexMasks"

    .line 184
    .line 185
    const/16 v8, 0xe

    .line 186
    .line 187
    aput-object v7, v0, v8

    .line 188
    .line 189
    const/16 v7, 0xf

    .line 190
    .line 191
    aput-object v14, v0, v7

    .line 192
    .line 193
    const-string v7, "channelCounts"

    .line 194
    .line 195
    const/16 v8, 0x10

    .line 196
    .line 197
    aput-object v7, v0, v8

    .line 198
    .line 199
    const/16 v7, 0x11

    .line 200
    .line 201
    aput-object v15, v0, v7

    .line 202
    .line 203
    const-string v7, "encodings"

    .line 204
    .line 205
    const/16 v8, 0x12

    .line 206
    .line 207
    aput-object v7, v0, v8

    .line 208
    .line 209
    const/16 v7, 0x13

    .line 210
    .line 211
    aput-object v16, v0, v7

    .line 212
    .line 213
    const-string v7, "type"

    .line 214
    .line 215
    const/16 v8, 0x14

    .line 216
    .line 217
    aput-object v7, v0, v8

    .line 218
    .line 219
    const/16 v7, 0x15

    .line 220
    .line 221
    aput-object v6, v0, v7

    .line 222
    .line 223
    invoke-static {v0}, Lk5/E;->g([Ljava/lang/Object;)Ljava/util/Map;

    .line 224
    .line 225
    .line 226
    move-result-object v0

    .line 227
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 228
    .line 229
    .line 230
    const/4 v0, 0x1

    .line 231
    add-int/2addr v5, v0

    .line 232
    goto/16 :goto_0

    .line 233
    .line 234
    :cond_1
    return-object v1
.end method

.method public q()Ljava/lang/Object;
    .locals 23

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    const/4 v2, 0x2

    .line 4
    const/16 v3, 0x1c

    .line 5
    .line 6
    invoke-static {v3}, Lk5/E;->h(I)V

    .line 7
    .line 8
    .line 9
    new-instance v4, Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 12
    .line 13
    .line 14
    move-object/from16 v5, p0

    .line 15
    .line 16
    iget-object v6, v5, Lk5/E$a;->g:Landroid/media/AudioManager;

    .line 17
    .line 18
    invoke-static {v6}, Lk5/p;->a(Landroid/media/AudioManager;)Ljava/util/List;

    .line 19
    .line 20
    .line 21
    move-result-object v6

    .line 22
    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 23
    .line 24
    .line 25
    move-result-object v6

    .line 26
    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 27
    .line 28
    .line 29
    move-result v7

    .line 30
    if-eqz v7, :cond_2

    .line 31
    .line 32
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v7

    .line 36
    invoke-static {v7}, Lk5/C;->a(Ljava/lang/Object;)Landroid/media/MicrophoneInfo;

    .line 37
    .line 38
    .line 39
    move-result-object v7

    .line 40
    new-instance v8, Ljava/util/ArrayList;

    .line 41
    .line 42
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 43
    .line 44
    .line 45
    invoke-static {v7}, Lk5/f;->a(Landroid/media/MicrophoneInfo;)Ljava/util/List;

    .line 46
    .line 47
    .line 48
    move-result-object v9

    .line 49
    invoke-interface {v9}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 50
    .line 51
    .line 52
    move-result-object v9

    .line 53
    :goto_1
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 54
    .line 55
    .line 56
    move-result v10

    .line 57
    if-eqz v10, :cond_0

    .line 58
    .line 59
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v10

    .line 63
    check-cast v10, Landroid/util/Pair;

    .line 64
    .line 65
    new-instance v11, Ljava/util/ArrayList;

    .line 66
    .line 67
    iget-object v12, v10, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v12, Ljava/lang/Float;

    .line 70
    .line 71
    invoke-virtual {v12}, Ljava/lang/Float;->floatValue()F

    .line 72
    .line 73
    .line 74
    move-result v12

    .line 75
    float-to-double v12, v12

    .line 76
    invoke-static {v12, v13}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 77
    .line 78
    .line 79
    move-result-object v12

    .line 80
    iget-object v10, v10, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast v10, Ljava/lang/Float;

    .line 83
    .line 84
    invoke-virtual {v10}, Ljava/lang/Float;->floatValue()F

    .line 85
    .line 86
    .line 87
    move-result v10

    .line 88
    float-to-double v13, v10

    .line 89
    invoke-static {v13, v14}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 90
    .line 91
    .line 92
    move-result-object v10

    .line 93
    new-array v13, v2, [Ljava/lang/Double;

    .line 94
    .line 95
    aput-object v12, v13, v1

    .line 96
    .line 97
    aput-object v10, v13, v0

    .line 98
    .line 99
    invoke-static {v13}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 100
    .line 101
    .line 102
    move-result-object v10

    .line 103
    invoke-direct {v11, v10}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 104
    .line 105
    .line 106
    invoke-interface {v8, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    goto :goto_1

    .line 110
    :cond_0
    new-instance v9, Ljava/util/ArrayList;

    .line 111
    .line 112
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 113
    .line 114
    .line 115
    invoke-static {v7}, Lk5/g;->a(Landroid/media/MicrophoneInfo;)Ljava/util/List;

    .line 116
    .line 117
    .line 118
    move-result-object v10

    .line 119
    invoke-interface {v10}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 120
    .line 121
    .line 122
    move-result-object v10

    .line 123
    :goto_2
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 124
    .line 125
    .line 126
    move-result v11

    .line 127
    if-eqz v11, :cond_1

    .line 128
    .line 129
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v11

    .line 133
    check-cast v11, Landroid/util/Pair;

    .line 134
    .line 135
    new-instance v12, Ljava/util/ArrayList;

    .line 136
    .line 137
    iget-object v13, v11, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 138
    .line 139
    check-cast v13, Ljava/lang/Integer;

    .line 140
    .line 141
    iget-object v11, v11, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 142
    .line 143
    check-cast v11, Ljava/lang/Integer;

    .line 144
    .line 145
    new-array v14, v2, [Ljava/lang/Integer;

    .line 146
    .line 147
    aput-object v13, v14, v1

    .line 148
    .line 149
    aput-object v11, v14, v0

    .line 150
    .line 151
    invoke-static {v14}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 152
    .line 153
    .line 154
    move-result-object v11

    .line 155
    invoke-direct {v12, v11}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 156
    .line 157
    .line 158
    invoke-interface {v9, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 159
    .line 160
    .line 161
    goto :goto_2

    .line 162
    :cond_1
    invoke-static {v7}, Lk5/h;->a(Landroid/media/MicrophoneInfo;)Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object v10

    .line 166
    invoke-static {v7}, Lk5/i;->a(Landroid/media/MicrophoneInfo;)I

    .line 167
    .line 168
    .line 169
    move-result v11

    .line 170
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 171
    .line 172
    .line 173
    move-result-object v11

    .line 174
    invoke-static {v7}, Lk5/j;->a(Landroid/media/MicrophoneInfo;)I

    .line 175
    .line 176
    .line 177
    move-result v12

    .line 178
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 179
    .line 180
    .line 181
    move-result-object v12

    .line 182
    invoke-static {v7}, Lk5/k;->a(Landroid/media/MicrophoneInfo;)Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object v13

    .line 186
    invoke-static {v7}, Lk5/l;->a(Landroid/media/MicrophoneInfo;)I

    .line 187
    .line 188
    .line 189
    move-result v14

    .line 190
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 191
    .line 192
    .line 193
    move-result-object v14

    .line 194
    invoke-static {v7}, Lk5/m;->a(Landroid/media/MicrophoneInfo;)I

    .line 195
    .line 196
    .line 197
    move-result v15

    .line 198
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 199
    .line 200
    .line 201
    move-result-object v15

    .line 202
    invoke-static {v7}, Lk5/v;->a(Landroid/media/MicrophoneInfo;)I

    .line 203
    .line 204
    .line 205
    move-result v16

    .line 206
    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 207
    .line 208
    .line 209
    move-result-object v16

    .line 210
    invoke-static {v7}, Lk5/w;->a(Landroid/media/MicrophoneInfo;)Landroid/media/MicrophoneInfo$Coordinate3F;

    .line 211
    .line 212
    .line 213
    move-result-object v17

    .line 214
    invoke-static/range {v17 .. v17}, Lk5/E;->a(Landroid/media/MicrophoneInfo$Coordinate3F;)Ljava/util/ArrayList;

    .line 215
    .line 216
    .line 217
    move-result-object v17

    .line 218
    invoke-static {v7}, Lk5/x;->a(Landroid/media/MicrophoneInfo;)Landroid/media/MicrophoneInfo$Coordinate3F;

    .line 219
    .line 220
    .line 221
    move-result-object v18

    .line 222
    invoke-static/range {v18 .. v18}, Lk5/E;->a(Landroid/media/MicrophoneInfo$Coordinate3F;)Ljava/util/ArrayList;

    .line 223
    .line 224
    .line 225
    move-result-object v18

    .line 226
    invoke-static {v7}, Lk5/y;->a(Landroid/media/MicrophoneInfo;)F

    .line 227
    .line 228
    .line 229
    move-result v19

    .line 230
    invoke-static/range {v19 .. v19}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 231
    .line 232
    .line 233
    move-result-object v19

    .line 234
    invoke-static {v7}, Lk5/z;->a(Landroid/media/MicrophoneInfo;)F

    .line 235
    .line 236
    .line 237
    move-result v20

    .line 238
    invoke-static/range {v20 .. v20}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 239
    .line 240
    .line 241
    move-result-object v20

    .line 242
    invoke-static {v7}, Lk5/A;->a(Landroid/media/MicrophoneInfo;)F

    .line 243
    .line 244
    .line 245
    move-result v21

    .line 246
    invoke-static/range {v21 .. v21}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 247
    .line 248
    .line 249
    move-result-object v21

    .line 250
    invoke-static {v7}, Lk5/B;->a(Landroid/media/MicrophoneInfo;)I

    .line 251
    .line 252
    .line 253
    move-result v7

    .line 254
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 255
    .line 256
    .line 257
    move-result-object v7

    .line 258
    const/16 v3, 0x1e

    .line 259
    .line 260
    new-array v3, v3, [Ljava/lang/Object;

    .line 261
    .line 262
    const-string v22, "description"

    .line 263
    .line 264
    aput-object v22, v3, v1

    .line 265
    .line 266
    aput-object v10, v3, v0

    .line 267
    .line 268
    const-string v10, "id"

    .line 269
    .line 270
    aput-object v10, v3, v2

    .line 271
    .line 272
    const/4 v10, 0x3

    .line 273
    aput-object v11, v3, v10

    .line 274
    .line 275
    const-string v10, "type"

    .line 276
    .line 277
    const/4 v11, 0x4

    .line 278
    aput-object v10, v3, v11

    .line 279
    .line 280
    const/4 v10, 0x5

    .line 281
    aput-object v12, v3, v10

    .line 282
    .line 283
    const-string v10, "address"

    .line 284
    .line 285
    const/4 v11, 0x6

    .line 286
    aput-object v10, v3, v11

    .line 287
    .line 288
    const/4 v10, 0x7

    .line 289
    aput-object v13, v3, v10

    .line 290
    .line 291
    const-string v10, "location"

    .line 292
    .line 293
    const/16 v11, 0x8

    .line 294
    .line 295
    aput-object v10, v3, v11

    .line 296
    .line 297
    const/16 v10, 0x9

    .line 298
    .line 299
    aput-object v14, v3, v10

    .line 300
    .line 301
    const-string v10, "group"

    .line 302
    .line 303
    const/16 v11, 0xa

    .line 304
    .line 305
    aput-object v10, v3, v11

    .line 306
    .line 307
    const/16 v10, 0xb

    .line 308
    .line 309
    aput-object v15, v3, v10

    .line 310
    .line 311
    const-string v10, "indexInTheGroup"

    .line 312
    .line 313
    const/16 v11, 0xc

    .line 314
    .line 315
    aput-object v10, v3, v11

    .line 316
    .line 317
    const/16 v10, 0xd

    .line 318
    .line 319
    aput-object v16, v3, v10

    .line 320
    .line 321
    const-string v10, "position"

    .line 322
    .line 323
    const/16 v11, 0xe

    .line 324
    .line 325
    aput-object v10, v3, v11

    .line 326
    .line 327
    const/16 v10, 0xf

    .line 328
    .line 329
    aput-object v17, v3, v10

    .line 330
    .line 331
    const-string v10, "orientation"

    .line 332
    .line 333
    const/16 v11, 0x10

    .line 334
    .line 335
    aput-object v10, v3, v11

    .line 336
    .line 337
    const/16 v10, 0x11

    .line 338
    .line 339
    aput-object v18, v3, v10

    .line 340
    .line 341
    const-string v10, "frequencyResponse"

    .line 342
    .line 343
    const/16 v11, 0x12

    .line 344
    .line 345
    aput-object v10, v3, v11

    .line 346
    .line 347
    const/16 v10, 0x13

    .line 348
    .line 349
    aput-object v8, v3, v10

    .line 350
    .line 351
    const-string v8, "channelMapping"

    .line 352
    .line 353
    const/16 v10, 0x14

    .line 354
    .line 355
    aput-object v8, v3, v10

    .line 356
    .line 357
    const/16 v8, 0x15

    .line 358
    .line 359
    aput-object v9, v3, v8

    .line 360
    .line 361
    const-string v8, "sensitivity"

    .line 362
    .line 363
    const/16 v9, 0x16

    .line 364
    .line 365
    aput-object v8, v3, v9

    .line 366
    .line 367
    const/16 v8, 0x17

    .line 368
    .line 369
    aput-object v19, v3, v8

    .line 370
    .line 371
    const-string v8, "maxSpl"

    .line 372
    .line 373
    const/16 v9, 0x18

    .line 374
    .line 375
    aput-object v8, v3, v9

    .line 376
    .line 377
    const/16 v8, 0x19

    .line 378
    .line 379
    aput-object v20, v3, v8

    .line 380
    .line 381
    const-string v8, "minSpl"

    .line 382
    .line 383
    const/16 v9, 0x1a

    .line 384
    .line 385
    aput-object v8, v3, v9

    .line 386
    .line 387
    const/16 v8, 0x1b

    .line 388
    .line 389
    aput-object v21, v3, v8

    .line 390
    .line 391
    const-string v8, "directionality"

    .line 392
    .line 393
    const/16 v9, 0x1c

    .line 394
    .line 395
    aput-object v8, v3, v9

    .line 396
    .line 397
    const/16 v8, 0x1d

    .line 398
    .line 399
    aput-object v7, v3, v8

    .line 400
    .line 401
    invoke-static {v3}, Lk5/E;->g([Ljava/lang/Object;)Ljava/util/Map;

    .line 402
    .line 403
    .line 404
    move-result-object v3

    .line 405
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 406
    .line 407
    .line 408
    move v3, v9

    .line 409
    goto/16 :goto_0

    .line 410
    .line 411
    :cond_2
    return-object v4
.end method

.method public r()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lk5/E$a;->g:Landroid/media/AudioManager;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/media/AudioManager;->getMode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method

.method public s(Ljava/lang/String;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lk5/E$a;->g:Landroid/media/AudioManager;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/media/AudioManager;->getParameters(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public t(Ljava/lang/String;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lk5/E$a;->g:Landroid/media/AudioManager;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/media/AudioManager;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method

.method public u()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lk5/E$a;->g:Landroid/media/AudioManager;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/media/AudioManager;->getRingerMode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0
.end method

.method public v(I)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lk5/E$a;->g:Landroid/media/AudioManager;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/media/AudioManager;->getStreamMaxVolume(I)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1
.end method

.method public w(I)Ljava/lang/Object;
    .locals 1

    .line 1
    const/16 v0, 0x1c

    .line 2
    .line 3
    invoke-static {v0}, Lk5/E;->h(I)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lk5/E$a;->g:Landroid/media/AudioManager;

    .line 7
    .line 8
    invoke-static {v0, p1}, Lk0/f1;->a(Landroid/media/AudioManager;I)I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    return-object p1
.end method

.method public x(I)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lk5/E$a;->g:Landroid/media/AudioManager;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Landroid/media/AudioManager;->getStreamVolume(I)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1
.end method

.method public y(III)Ljava/lang/Object;
    .locals 1

    .line 1
    const/16 v0, 0x1c

    .line 2
    .line 3
    invoke-static {v0}, Lk5/E;->h(I)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lk5/E$a;->g:Landroid/media/AudioManager;

    .line 7
    .line 8
    invoke-static {v0, p1, p2, p3}, Lk5/e;->a(Landroid/media/AudioManager;III)F

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    return-object p1
.end method

.method public final z()V
    .locals 3

    .line 1
    new-instance v0, Lk5/E$a$a;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lk5/E$a$a;-><init>(Lk5/E$a;)V

    .line 4
    .line 5
    .line 6
    iput-object v0, p0, Lk5/E$a;->h:Ljava/lang/Object;

    .line 7
    .line 8
    iget-object v1, p0, Lk5/E$a;->g:Landroid/media/AudioManager;

    .line 9
    .line 10
    check-cast v0, Landroid/media/AudioDeviceCallback;

    .line 11
    .line 12
    iget-object v2, p0, Lk5/E$a;->a:Landroid/os/Handler;

    .line 13
    .line 14
    invoke-virtual {v1, v0, v2}, Landroid/media/AudioManager;->registerAudioDeviceCallback(Landroid/media/AudioDeviceCallback;Landroid/os/Handler;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method
