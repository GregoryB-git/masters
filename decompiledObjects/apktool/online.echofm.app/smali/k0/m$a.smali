.class public Lk0/m$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/media/AudioManager$OnAudioFocusChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lk0/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "a"
.end annotation


# instance fields
.field public final o:Landroid/os/Handler;

.field public final synthetic p:Lk0/m;


# direct methods
.method public constructor <init>(Lk0/m;Landroid/os/Handler;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lk0/m$a;->p:Lk0/m;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, Lk0/m$a;->o:Landroid/os/Handler;

    .line 7
    .line 8
    return-void
.end method

.method public static synthetic a(Lk0/m$a;I)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lk0/m$a;->b(I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final synthetic b(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lk0/m$a;->p:Lk0/m;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lk0/m;->d(Lk0/m;I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public onAudioFocusChange(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lk0/m$a;->o:Landroid/os/Handler;

    .line 2
    .line 3
    new-instance v1, Lk0/l;

    .line 4
    .line 5
    invoke-direct {v1, p0, p1}, Lk0/l;-><init>(Lk0/m$a;I)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 9
    .line 10
    .line 11
    return-void
.end method
