.class public Lk5/E$a$a;
.super Landroid/media/AudioDeviceCallback;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lk5/E$a;->z()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lk5/E$a;


# direct methods
.method public constructor <init>(Lk5/E$a;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lk5/E$a$a;->a:Lk5/E$a;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/media/AudioDeviceCallback;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onAudioDevicesAdded([Landroid/media/AudioDeviceInfo;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lk5/E$a$a;->a:Lk5/E$a;

    .line 2
    .line 3
    invoke-static {p1}, Lk5/E;->d([Landroid/media/AudioDeviceInfo;)Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    const/4 v1, 0x1

    .line 8
    new-array v1, v1, [Ljava/lang/Object;

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    aput-object p1, v1, v2

    .line 12
    .line 13
    const-string p1, "onAudioDevicesAdded"

    .line 14
    .line 15
    invoke-virtual {v0, p1, v1}, Lk5/E$a;->A(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public onAudioDevicesRemoved([Landroid/media/AudioDeviceInfo;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lk5/E$a$a;->a:Lk5/E$a;

    .line 2
    .line 3
    invoke-static {p1}, Lk5/E;->d([Landroid/media/AudioDeviceInfo;)Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    const/4 v1, 0x1

    .line 8
    new-array v1, v1, [Ljava/lang/Object;

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    aput-object p1, v1, v2

    .line 12
    .line 13
    const-string p1, "onAudioDevicesRemoved"

    .line 14
    .line 15
    invoke-virtual {v0, p1, v1}, Lk5/E$a;->A(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method
