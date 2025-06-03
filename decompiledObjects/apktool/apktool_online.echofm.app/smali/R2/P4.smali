.class public final LR2/P4;
.super LR2/x;
.source "SourceFile"


# instance fields
.field public final synthetic e:LR2/D4;


# direct methods
.method public constructor <init>(LR2/D4;LR2/o3;)V
    .locals 0

    .line 1
    iput-object p1, p0, LR2/P4;->e:LR2/D4;

    .line 2
    .line 3
    invoke-direct {p0, p2}, LR2/x;-><init>(LR2/o3;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final d()V
    .locals 2

    .line 1
    iget-object v0, p0, LR2/P4;->e:LR2/D4;

    .line 2
    .line 3
    invoke-virtual {v0}, LR2/m3;->j()LR2/Y1;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, LR2/Y1;->L()LR2/a2;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const-string v1, "Tasks have been queued for a long time"

    .line 12
    .line 13
    invoke-virtual {v0, v1}, LR2/a2;->a(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method
