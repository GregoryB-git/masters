.class public Lcom/ryanheise/audioservice/AudioService$d;
.super Landroid/support/v4/media/session/MediaSessionCompat$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ryanheise/audioservice/AudioService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "d"
.end annotation


# instance fields
.field public final synthetic f:Lcom/ryanheise/audioservice/AudioService;


# direct methods
.method public constructor <init>(Lcom/ryanheise/audioservice/AudioService;)V
    .locals 0

    iput-object p1, p0, Lcom/ryanheise/audioservice/AudioService$d;->f:Lcom/ryanheise/audioservice/AudioService;

    invoke-direct {p0}, Landroid/support/v4/media/session/MediaSessionCompat$b;-><init>()V

    return-void
.end method


# virtual methods
.method public A()V
    .locals 1

    .line 1
    invoke-static {}, Lcom/ryanheise/audioservice/AudioService;->u()Lcom/ryanheise/audioservice/AudioService$e;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-static {}, Lcom/ryanheise/audioservice/AudioService;->u()Lcom/ryanheise/audioservice/AudioService$e;

    move-result-object v0

    invoke-interface {v0}, Lcom/ryanheise/audioservice/AudioService$e;->k()V

    return-void
.end method

.method public B(J)V
    .locals 1

    .line 1
    invoke-static {}, Lcom/ryanheise/audioservice/AudioService;->u()Lcom/ryanheise/audioservice/AudioService$e;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-static {}, Lcom/ryanheise/audioservice/AudioService;->u()Lcom/ryanheise/audioservice/AudioService$e;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lcom/ryanheise/audioservice/AudioService$e;->G(J)V

    return-void
.end method

.method public C()V
    .locals 1

    .line 1
    invoke-static {}, Lcom/ryanheise/audioservice/AudioService;->u()Lcom/ryanheise/audioservice/AudioService$e;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-static {}, Lcom/ryanheise/audioservice/AudioService;->u()Lcom/ryanheise/audioservice/AudioService$e;

    move-result-object v0

    invoke-interface {v0}, Lcom/ryanheise/audioservice/AudioService$e;->g()V

    return-void
.end method

.method public final E(Landroid/view/KeyEvent;)Ll5/q;
    .locals 1

    .line 1
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    const/16 v0, 0x4f

    .line 6
    .line 7
    if-eq p1, v0, :cond_2

    .line 8
    .line 9
    const/16 v0, 0x55

    .line 10
    .line 11
    if-eq p1, v0, :cond_2

    .line 12
    .line 13
    const/16 v0, 0x57

    .line 14
    .line 15
    if-eq p1, v0, :cond_1

    .line 16
    .line 17
    const/16 v0, 0x58

    .line 18
    .line 19
    if-eq p1, v0, :cond_0

    .line 20
    .line 21
    sget-object p1, Ll5/q;->o:Ll5/q;

    .line 22
    .line 23
    return-object p1

    .line 24
    :cond_0
    sget-object p1, Ll5/q;->q:Ll5/q;

    .line 25
    .line 26
    return-object p1

    .line 27
    :cond_1
    sget-object p1, Ll5/q;->p:Ll5/q;

    .line 28
    .line 29
    return-object p1

    .line 30
    :cond_2
    sget-object p1, Ll5/q;->o:Ll5/q;

    .line 31
    .line 32
    return-object p1
.end method

.method public b(Landroid/support/v4/media/MediaDescriptionCompat;)V
    .locals 1

    .line 1
    invoke-static {}, Lcom/ryanheise/audioservice/AudioService;->u()Lcom/ryanheise/audioservice/AudioService$e;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-static {}, Lcom/ryanheise/audioservice/AudioService;->u()Lcom/ryanheise/audioservice/AudioService$e;

    move-result-object v0

    invoke-virtual {p1}, Landroid/support/v4/media/MediaDescriptionCompat;->g()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/ryanheise/audioservice/AudioService;->K(Ljava/lang/String;)Landroid/support/v4/media/MediaMetadataCompat;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/ryanheise/audioservice/AudioService$e;->C(Landroid/support/v4/media/MediaMetadataCompat;)V

    return-void
.end method

.method public c(Landroid/support/v4/media/MediaDescriptionCompat;I)V
    .locals 1

    .line 1
    invoke-static {}, Lcom/ryanheise/audioservice/AudioService;->u()Lcom/ryanheise/audioservice/AudioService$e;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-static {}, Lcom/ryanheise/audioservice/AudioService;->u()Lcom/ryanheise/audioservice/AudioService$e;

    move-result-object v0

    invoke-virtual {p1}, Landroid/support/v4/media/MediaDescriptionCompat;->g()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/ryanheise/audioservice/AudioService;->K(Ljava/lang/String;)Landroid/support/v4/media/MediaMetadataCompat;

    move-result-object p1

    invoke-interface {v0, p1, p2}, Lcom/ryanheise/audioservice/AudioService$e;->v(Landroid/support/v4/media/MediaMetadataCompat;I)V

    return-void
.end method

.method public e(Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 1

    .line 1
    invoke-static {}, Lcom/ryanheise/audioservice/AudioService;->u()Lcom/ryanheise/audioservice/AudioService$e;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    const-string v0, "com.ryanheise.audioservice.action.STOP"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {}, Lcom/ryanheise/audioservice/AudioService;->u()Lcom/ryanheise/audioservice/AudioService$e;

    move-result-object p1

    invoke-interface {p1}, Lcom/ryanheise/audioservice/AudioService$e;->g()V

    goto :goto_0

    :cond_1
    const-string v0, "com.ryanheise.audioservice.action.FAST_FORWARD"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {}, Lcom/ryanheise/audioservice/AudioService;->u()Lcom/ryanheise/audioservice/AudioService$e;

    move-result-object p1

    invoke-interface {p1}, Lcom/ryanheise/audioservice/AudioService$e;->A()V

    goto :goto_0

    :cond_2
    const-string v0, "com.ryanheise.audioservice.action.REWIND"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {}, Lcom/ryanheise/audioservice/AudioService;->u()Lcom/ryanheise/audioservice/AudioService$e;

    move-result-object p1

    invoke-interface {p1}, Lcom/ryanheise/audioservice/AudioService$e;->r()V

    goto :goto_0

    :cond_3
    invoke-static {}, Lcom/ryanheise/audioservice/AudioService;->u()Lcom/ryanheise/audioservice/AudioService$e;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lcom/ryanheise/audioservice/AudioService$e;->E(Ljava/lang/String;Landroid/os/Bundle;)V

    :goto_0
    return-void
.end method

.method public f()V
    .locals 1

    .line 1
    invoke-static {}, Lcom/ryanheise/audioservice/AudioService;->u()Lcom/ryanheise/audioservice/AudioService$e;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-static {}, Lcom/ryanheise/audioservice/AudioService;->u()Lcom/ryanheise/audioservice/AudioService$e;

    move-result-object v0

    invoke-interface {v0}, Lcom/ryanheise/audioservice/AudioService$e;->A()V

    return-void
.end method

.method public g(Landroid/content/Intent;)Z
    .locals 2

    .line 1
    invoke-static {}, Lcom/ryanheise/audioservice/AudioService;->u()Lcom/ryanheise/audioservice/AudioService$e;

    move-result-object v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    move-result-object p1

    const-string v0, "android.intent.extra.KEY_EVENT"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Landroid/view/KeyEvent;

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    move-result v0

    if-nez v0, :cond_3

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v0

    const/16 v1, 0x4f

    if-eq v0, v1, :cond_2

    const/16 v1, 0x82

    if-eq v0, v1, :cond_1

    const/16 v1, 0x7e

    if-eq v0, v1, :cond_2

    const/16 v1, 0x7f

    if-eq v0, v1, :cond_2

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    invoke-virtual {p0}, Lcom/ryanheise/audioservice/AudioService$d;->i()V

    goto :goto_0

    :pswitch_1
    invoke-virtual {p0}, Lcom/ryanheise/audioservice/AudioService$d;->f()V

    goto :goto_0

    :pswitch_2
    invoke-virtual {p0}, Lcom/ryanheise/audioservice/AudioService$d;->r()V

    goto :goto_0

    :pswitch_3
    invoke-virtual {p0}, Lcom/ryanheise/audioservice/AudioService$d;->C()V

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lcom/ryanheise/audioservice/AudioService$d;->h()V

    goto :goto_0

    :cond_2
    :pswitch_4
    invoke-static {}, Lcom/ryanheise/audioservice/AudioService;->u()Lcom/ryanheise/audioservice/AudioService$e;

    move-result-object v0

    invoke-virtual {p0, p1}, Lcom/ryanheise/audioservice/AudioService$d;->E(Landroid/view/KeyEvent;)Ll5/q;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/ryanheise/audioservice/AudioService$e;->j(Ll5/q;)V

    :cond_3
    :goto_0
    const/4 p1, 0x1

    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x55
        :pswitch_4
        :pswitch_3
        :pswitch_4
        :pswitch_4
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public h()V
    .locals 1

    .line 1
    invoke-static {}, Lcom/ryanheise/audioservice/AudioService;->u()Lcom/ryanheise/audioservice/AudioService$e;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-static {}, Lcom/ryanheise/audioservice/AudioService;->u()Lcom/ryanheise/audioservice/AudioService$e;

    move-result-object v0

    invoke-interface {v0}, Lcom/ryanheise/audioservice/AudioService$e;->w()V

    return-void
.end method

.method public i()V
    .locals 1

    .line 1
    invoke-static {}, Lcom/ryanheise/audioservice/AudioService;->u()Lcom/ryanheise/audioservice/AudioService$e;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-static {}, Lcom/ryanheise/audioservice/AudioService;->u()Lcom/ryanheise/audioservice/AudioService$e;

    move-result-object v0

    invoke-interface {v0}, Lcom/ryanheise/audioservice/AudioService$e;->e()V

    return-void
.end method

.method public j(Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 1

    .line 1
    invoke-static {}, Lcom/ryanheise/audioservice/AudioService;->u()Lcom/ryanheise/audioservice/AudioService$e;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-static {}, Lcom/ryanheise/audioservice/AudioService;->u()Lcom/ryanheise/audioservice/AudioService$e;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lcom/ryanheise/audioservice/AudioService$e;->z(Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method

.method public k(Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 1

    .line 1
    invoke-static {}, Lcom/ryanheise/audioservice/AudioService;->u()Lcom/ryanheise/audioservice/AudioService$e;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-static {}, Lcom/ryanheise/audioservice/AudioService;->u()Lcom/ryanheise/audioservice/AudioService$e;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lcom/ryanheise/audioservice/AudioService$e;->u(Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method

.method public l(Landroid/net/Uri;Landroid/os/Bundle;)V
    .locals 1

    .line 1
    invoke-static {}, Lcom/ryanheise/audioservice/AudioService;->u()Lcom/ryanheise/audioservice/AudioService$e;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-static {}, Lcom/ryanheise/audioservice/AudioService;->u()Lcom/ryanheise/audioservice/AudioService$e;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lcom/ryanheise/audioservice/AudioService$e;->I(Landroid/net/Uri;Landroid/os/Bundle;)V

    return-void
.end method

.method public m()V
    .locals 2

    .line 1
    invoke-static {}, Lcom/ryanheise/audioservice/AudioService;->u()Lcom/ryanheise/audioservice/AudioService$e;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/ryanheise/audioservice/AudioService$d;->f:Lcom/ryanheise/audioservice/AudioService;

    invoke-static {v0}, Lcom/ryanheise/audioservice/AudioService;->v(Lcom/ryanheise/audioservice/AudioService;)Landroid/support/v4/media/session/MediaSessionCompat;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/media/session/MediaSessionCompat;->e()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/ryanheise/audioservice/AudioService$d;->f:Lcom/ryanheise/audioservice/AudioService;

    invoke-static {v0}, Lcom/ryanheise/audioservice/AudioService;->v(Lcom/ryanheise/audioservice/AudioService;)Landroid/support/v4/media/session/MediaSessionCompat;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/support/v4/media/session/MediaSessionCompat;->g(Z)V

    :cond_1
    invoke-static {}, Lcom/ryanheise/audioservice/AudioService;->u()Lcom/ryanheise/audioservice/AudioService$e;

    move-result-object v0

    invoke-interface {v0}, Lcom/ryanheise/audioservice/AudioService$e;->p()V

    return-void
.end method

.method public n(Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-static {}, Lcom/ryanheise/audioservice/AudioService;->u()Lcom/ryanheise/audioservice/AudioService$e;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/ryanheise/audioservice/AudioService$d;->f:Lcom/ryanheise/audioservice/AudioService;

    invoke-static {v0}, Lcom/ryanheise/audioservice/AudioService;->v(Lcom/ryanheise/audioservice/AudioService;)Landroid/support/v4/media/session/MediaSessionCompat;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/media/session/MediaSessionCompat;->e()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/ryanheise/audioservice/AudioService$d;->f:Lcom/ryanheise/audioservice/AudioService;

    invoke-static {v0}, Lcom/ryanheise/audioservice/AudioService;->v(Lcom/ryanheise/audioservice/AudioService;)Landroid/support/v4/media/session/MediaSessionCompat;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/support/v4/media/session/MediaSessionCompat;->g(Z)V

    :cond_1
    invoke-static {}, Lcom/ryanheise/audioservice/AudioService;->u()Lcom/ryanheise/audioservice/AudioService$e;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lcom/ryanheise/audioservice/AudioService$e;->h(Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method

.method public o(Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-static {}, Lcom/ryanheise/audioservice/AudioService;->u()Lcom/ryanheise/audioservice/AudioService$e;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/ryanheise/audioservice/AudioService$d;->f:Lcom/ryanheise/audioservice/AudioService;

    invoke-static {v0}, Lcom/ryanheise/audioservice/AudioService;->v(Lcom/ryanheise/audioservice/AudioService;)Landroid/support/v4/media/session/MediaSessionCompat;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/media/session/MediaSessionCompat;->e()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/ryanheise/audioservice/AudioService$d;->f:Lcom/ryanheise/audioservice/AudioService;

    invoke-static {v0}, Lcom/ryanheise/audioservice/AudioService;->v(Lcom/ryanheise/audioservice/AudioService;)Landroid/support/v4/media/session/MediaSessionCompat;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/support/v4/media/session/MediaSessionCompat;->g(Z)V

    :cond_1
    invoke-static {}, Lcom/ryanheise/audioservice/AudioService;->u()Lcom/ryanheise/audioservice/AudioService$e;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lcom/ryanheise/audioservice/AudioService$e;->F(Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method

.method public p(Landroid/net/Uri;Landroid/os/Bundle;)V
    .locals 2

    .line 1
    invoke-static {}, Lcom/ryanheise/audioservice/AudioService;->u()Lcom/ryanheise/audioservice/AudioService$e;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/ryanheise/audioservice/AudioService$d;->f:Lcom/ryanheise/audioservice/AudioService;

    invoke-static {v0}, Lcom/ryanheise/audioservice/AudioService;->v(Lcom/ryanheise/audioservice/AudioService;)Landroid/support/v4/media/session/MediaSessionCompat;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/media/session/MediaSessionCompat;->e()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/ryanheise/audioservice/AudioService$d;->f:Lcom/ryanheise/audioservice/AudioService;

    invoke-static {v0}, Lcom/ryanheise/audioservice/AudioService;->v(Lcom/ryanheise/audioservice/AudioService;)Landroid/support/v4/media/session/MediaSessionCompat;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/support/v4/media/session/MediaSessionCompat;->g(Z)V

    :cond_1
    invoke-static {}, Lcom/ryanheise/audioservice/AudioService;->u()Lcom/ryanheise/audioservice/AudioService$e;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lcom/ryanheise/audioservice/AudioService$e;->q(Landroid/net/Uri;Landroid/os/Bundle;)V

    return-void
.end method

.method public q(Landroid/support/v4/media/MediaDescriptionCompat;)V
    .locals 1

    .line 1
    invoke-static {}, Lcom/ryanheise/audioservice/AudioService;->u()Lcom/ryanheise/audioservice/AudioService$e;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-static {}, Lcom/ryanheise/audioservice/AudioService;->u()Lcom/ryanheise/audioservice/AudioService$e;

    move-result-object v0

    invoke-virtual {p1}, Landroid/support/v4/media/MediaDescriptionCompat;->g()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/ryanheise/audioservice/AudioService;->K(Ljava/lang/String;)Landroid/support/v4/media/MediaMetadataCompat;

    move-result-object p1

    invoke-interface {v0, p1}, Lcom/ryanheise/audioservice/AudioService$e;->n(Landroid/support/v4/media/MediaMetadataCompat;)V

    return-void
.end method

.method public r()V
    .locals 1

    .line 1
    invoke-static {}, Lcom/ryanheise/audioservice/AudioService;->u()Lcom/ryanheise/audioservice/AudioService$e;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-static {}, Lcom/ryanheise/audioservice/AudioService;->u()Lcom/ryanheise/audioservice/AudioService$e;

    move-result-object v0

    invoke-interface {v0}, Lcom/ryanheise/audioservice/AudioService$e;->r()V

    return-void
.end method

.method public s(J)V
    .locals 1

    .line 1
    invoke-static {}, Lcom/ryanheise/audioservice/AudioService;->u()Lcom/ryanheise/audioservice/AudioService$e;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-static {}, Lcom/ryanheise/audioservice/AudioService;->u()Lcom/ryanheise/audioservice/AudioService$e;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lcom/ryanheise/audioservice/AudioService$e;->B(J)V

    return-void
.end method

.method public t(Z)V
    .locals 1

    .line 1
    invoke-static {}, Lcom/ryanheise/audioservice/AudioService;->u()Lcom/ryanheise/audioservice/AudioService$e;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-static {}, Lcom/ryanheise/audioservice/AudioService;->u()Lcom/ryanheise/audioservice/AudioService$e;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/ryanheise/audioservice/AudioService$e;->f(Z)V

    return-void
.end method

.method public u(F)V
    .locals 1

    .line 1
    invoke-static {}, Lcom/ryanheise/audioservice/AudioService;->u()Lcom/ryanheise/audioservice/AudioService$e;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-static {}, Lcom/ryanheise/audioservice/AudioService;->u()Lcom/ryanheise/audioservice/AudioService$e;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/ryanheise/audioservice/AudioService$e;->o(F)V

    return-void
.end method

.method public v(Landroid/support/v4/media/RatingCompat;)V
    .locals 1

    .line 1
    invoke-static {}, Lcom/ryanheise/audioservice/AudioService;->u()Lcom/ryanheise/audioservice/AudioService$e;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-static {}, Lcom/ryanheise/audioservice/AudioService;->u()Lcom/ryanheise/audioservice/AudioService$e;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/ryanheise/audioservice/AudioService$e;->t(Landroid/support/v4/media/RatingCompat;)V

    return-void
.end method

.method public w(Landroid/support/v4/media/RatingCompat;Landroid/os/Bundle;)V
    .locals 1

    .line 1
    invoke-static {}, Lcom/ryanheise/audioservice/AudioService;->u()Lcom/ryanheise/audioservice/AudioService$e;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-static {}, Lcom/ryanheise/audioservice/AudioService;->u()Lcom/ryanheise/audioservice/AudioService$e;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lcom/ryanheise/audioservice/AudioService$e;->J(Landroid/support/v4/media/RatingCompat;Landroid/os/Bundle;)V

    return-void
.end method

.method public x(I)V
    .locals 1

    .line 1
    invoke-static {}, Lcom/ryanheise/audioservice/AudioService;->u()Lcom/ryanheise/audioservice/AudioService$e;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-static {}, Lcom/ryanheise/audioservice/AudioService;->u()Lcom/ryanheise/audioservice/AudioService$e;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/ryanheise/audioservice/AudioService$e;->c(I)V

    return-void
.end method

.method public y(I)V
    .locals 1

    .line 1
    invoke-static {}, Lcom/ryanheise/audioservice/AudioService;->u()Lcom/ryanheise/audioservice/AudioService$e;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-static {}, Lcom/ryanheise/audioservice/AudioService;->u()Lcom/ryanheise/audioservice/AudioService$e;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/ryanheise/audioservice/AudioService$e;->d(I)V

    return-void
.end method

.method public z()V
    .locals 1

    .line 1
    invoke-static {}, Lcom/ryanheise/audioservice/AudioService;->u()Lcom/ryanheise/audioservice/AudioService$e;

    move-result-object v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-static {}, Lcom/ryanheise/audioservice/AudioService;->u()Lcom/ryanheise/audioservice/AudioService$e;

    move-result-object v0

    invoke-interface {v0}, Lcom/ryanheise/audioservice/AudioService$e;->l()V

    return-void
.end method
