.class public final LR2/f3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic o:LR2/I;

.field public final synthetic p:LR2/W5;

.field public final synthetic q:LR2/R2;


# direct methods
.method public constructor <init>(LR2/R2;LR2/I;LR2/W5;)V
    .locals 0

    .line 1
    iput-object p1, p0, LR2/f3;->q:LR2/R2;

    .line 2
    .line 3
    iput-object p2, p0, LR2/f3;->o:LR2/I;

    .line 4
    .line 5
    iput-object p3, p0, LR2/f3;->p:LR2/W5;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, LR2/f3;->q:LR2/R2;

    .line 2
    .line 3
    iget-object v1, p0, LR2/f3;->o:LR2/I;

    .line 4
    .line 5
    iget-object v2, p0, LR2/f3;->p:LR2/W5;

    .line 6
    .line 7
    invoke-virtual {v0, v1, v2}, LR2/R2;->b1(LR2/I;LR2/W5;)LR2/I;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget-object v1, p0, LR2/f3;->q:LR2/R2;

    .line 12
    .line 13
    iget-object v2, p0, LR2/f3;->p:LR2/W5;

    .line 14
    .line 15
    invoke-virtual {v1, v0, v2}, LR2/R2;->d1(LR2/I;LR2/W5;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method
