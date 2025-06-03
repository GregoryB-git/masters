.class public final Lk0/f0$g;
.super Landroid/media/AudioDeviceCallback;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lk0/f0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "g"
.end annotation


# instance fields
.field public final synthetic a:Lk0/f0;


# direct methods
.method public constructor <init>(Lk0/f0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lk0/f0$g;->a:Lk0/f0;

    invoke-direct {p0}, Landroid/media/AudioDeviceCallback;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lk0/f0;Lk0/f0$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lk0/f0$g;-><init>(Lk0/f0;)V

    return-void
.end method


# virtual methods
.method public onAudioDevicesAdded([Landroid/media/AudioDeviceInfo;)V
    .locals 3

    .line 1
    iget-object p1, p0, Lk0/f0$g;->a:Lk0/f0;

    .line 2
    .line 3
    invoke-static {p1}, Lk0/f0;->T0(Lk0/f0;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    iget-object p1, p0, Lk0/f0$g;->a:Lk0/f0;

    .line 10
    .line 11
    invoke-static {p1}, Lk0/f0;->U0(Lk0/f0;)Lk0/U0;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    iget p1, p1, Lk0/U0;->n:I

    .line 16
    .line 17
    const/4 v0, 0x3

    .line 18
    if-ne p1, v0, :cond_0

    .line 19
    .line 20
    iget-object p1, p0, Lk0/f0$g;->a:Lk0/f0;

    .line 21
    .line 22
    invoke-static {p1}, Lk0/f0;->U0(Lk0/f0;)Lk0/U0;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    iget-boolean v0, v0, Lk0/U0;->l:Z

    .line 27
    .line 28
    const/4 v1, 0x1

    .line 29
    const/4 v2, 0x0

    .line 30
    invoke-static {p1, v0, v1, v2}, Lk0/f0;->V0(Lk0/f0;ZII)V

    .line 31
    .line 32
    .line 33
    :cond_0
    return-void
.end method

.method public onAudioDevicesRemoved([Landroid/media/AudioDeviceInfo;)V
    .locals 3

    .line 1
    iget-object p1, p0, Lk0/f0$g;->a:Lk0/f0;

    .line 2
    .line 3
    invoke-static {p1}, Lk0/f0;->T0(Lk0/f0;)Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    if-nez p1, :cond_0

    .line 8
    .line 9
    iget-object p1, p0, Lk0/f0$g;->a:Lk0/f0;

    .line 10
    .line 11
    invoke-static {p1}, Lk0/f0;->U0(Lk0/f0;)Lk0/U0;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-boolean v0, v0, Lk0/U0;->l:Z

    .line 16
    .line 17
    const/4 v1, 0x1

    .line 18
    const/4 v2, 0x3

    .line 19
    invoke-static {p1, v0, v1, v2}, Lk0/f0;->V0(Lk0/f0;ZII)V

    .line 20
    .line 21
    .line 22
    :cond_0
    return-void
.end method
