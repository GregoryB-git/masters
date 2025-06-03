.class public La0/d$h$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = La0/d$h;->d(Landroid/support/v4/media/session/MediaSessionCompat$Token;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic o:Landroid/support/v4/media/session/MediaSessionCompat$Token;

.field public final synthetic p:La0/d$h;


# direct methods
.method public constructor <init>(La0/d$h;Landroid/support/v4/media/session/MediaSessionCompat$Token;)V
    .locals 0

    .line 1
    iput-object p1, p0, La0/d$h$a;->p:La0/d$h;

    .line 2
    .line 3
    iput-object p2, p0, La0/d$h$a;->o:Landroid/support/v4/media/session/MediaSessionCompat$Token;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, La0/d$h$a;->p:La0/d$h;

    .line 2
    .line 3
    iget-object v1, p0, La0/d$h$a;->o:Landroid/support/v4/media/session/MediaSessionCompat$Token;

    .line 4
    .line 5
    invoke-virtual {v0, v1}, La0/d$h;->j(Landroid/support/v4/media/session/MediaSessionCompat$Token;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
