.class public final LR2/M3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Executor;


# instance fields
.field public final synthetic o:LR2/C3;


# direct methods
.method public constructor <init>(LR2/C3;)V
    .locals 0

    .line 1
    iput-object p1, p0, LR2/M3;->o:LR2/C3;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final execute(Ljava/lang/Runnable;)V
    .locals 1

    .line 1
    iget-object v0, p0, LR2/M3;->o:LR2/C3;

    .line 2
    .line 3
    invoke-virtual {v0}, LR2/m3;->e()LR2/G2;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0, p1}, LR2/G2;->D(Ljava/lang/Runnable;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
