.class public final LR2/j3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic o:Ljava/lang/String;

.field public final synthetic p:LR2/R2;


# direct methods
.method public constructor <init>(LR2/R2;Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, LR2/j3;->p:LR2/R2;

    .line 2
    .line 3
    iput-object p2, p0, LR2/j3;->o:Ljava/lang/String;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final synthetic call()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, LR2/j3;->p:LR2/R2;

    .line 2
    .line 3
    invoke-static {v0}, LR2/R2;->o(LR2/R2;)LR2/D5;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, LR2/D5;->o0()V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, LR2/j3;->p:LR2/R2;

    .line 11
    .line 12
    invoke-static {v0}, LR2/R2;->o(LR2/R2;)LR2/D5;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {v0}, LR2/D5;->e0()LR2/p;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    iget-object v1, p0, LR2/j3;->o:Ljava/lang/String;

    .line 21
    .line 22
    invoke-virtual {v0, v1}, LR2/p;->M0(Ljava/lang/String;)Ljava/util/List;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    return-object v0
.end method
