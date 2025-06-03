.class public final LR2/o4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic o:Z

.field public final synthetic p:Landroid/net/Uri;

.field public final synthetic q:Ljava/lang/String;

.field public final synthetic r:Ljava/lang/String;

.field public final synthetic s:LR2/k4;


# direct methods
.method public constructor <init>(LR2/k4;ZLandroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, LR2/o4;->s:LR2/k4;

    .line 2
    .line 3
    iput-boolean p2, p0, LR2/o4;->o:Z

    .line 4
    .line 5
    iput-object p3, p0, LR2/o4;->p:Landroid/net/Uri;

    .line 6
    .line 7
    iput-object p4, p0, LR2/o4;->q:Ljava/lang/String;

    .line 8
    .line 9
    iput-object p5, p0, LR2/o4;->r:Ljava/lang/String;

    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 1
    iget-object v0, p0, LR2/o4;->s:LR2/k4;

    .line 2
    .line 3
    iget-boolean v1, p0, LR2/o4;->o:Z

    .line 4
    .line 5
    iget-object v2, p0, LR2/o4;->p:Landroid/net/Uri;

    .line 6
    .line 7
    iget-object v3, p0, LR2/o4;->q:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v4, p0, LR2/o4;->r:Ljava/lang/String;

    .line 10
    .line 11
    invoke-static {v0, v1, v2, v3, v4}, LR2/k4;->a(LR2/k4;ZLandroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method
