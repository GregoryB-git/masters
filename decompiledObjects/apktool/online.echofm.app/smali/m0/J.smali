.class public final synthetic Lm0/J;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic o:Landroid/media/AudioTrack;

.field public final synthetic p:Lm0/z$d;

.field public final synthetic q:Landroid/os/Handler;

.field public final synthetic r:Lm0/z$a;

.field public final synthetic s:Lg0/f;


# direct methods
.method public synthetic constructor <init>(Landroid/media/AudioTrack;Lm0/z$d;Landroid/os/Handler;Lm0/z$a;Lg0/f;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lm0/J;->o:Landroid/media/AudioTrack;

    .line 5
    .line 6
    iput-object p2, p0, Lm0/J;->p:Lm0/z$d;

    .line 7
    .line 8
    iput-object p3, p0, Lm0/J;->q:Landroid/os/Handler;

    .line 9
    .line 10
    iput-object p4, p0, Lm0/J;->r:Lm0/z$a;

    .line 11
    .line 12
    iput-object p5, p0, Lm0/J;->s:Lg0/f;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 1
    iget-object v0, p0, Lm0/J;->o:Landroid/media/AudioTrack;

    .line 2
    .line 3
    iget-object v1, p0, Lm0/J;->p:Lm0/z$d;

    .line 4
    .line 5
    iget-object v2, p0, Lm0/J;->q:Landroid/os/Handler;

    .line 6
    .line 7
    iget-object v3, p0, Lm0/J;->r:Lm0/z$a;

    .line 8
    .line 9
    iget-object v4, p0, Lm0/J;->s:Lg0/f;

    .line 10
    .line 11
    invoke-static {v0, v1, v2, v3, v4}, Lm0/N;->D(Landroid/media/AudioTrack;Lm0/z$d;Landroid/os/Handler;Lm0/z$a;Lg0/f;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method
