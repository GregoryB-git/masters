.class public final LR2/G5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic o:LR2/P5;

.field public final synthetic p:LR2/D5;


# direct methods
.method public constructor <init>(LR2/D5;LR2/P5;)V
    .locals 0

    .line 1
    iput-object p1, p0, LR2/G5;->p:LR2/D5;

    .line 2
    .line 3
    iput-object p2, p0, LR2/G5;->o:LR2/P5;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, LR2/G5;->p:LR2/D5;

    .line 2
    .line 3
    iget-object v1, p0, LR2/G5;->o:LR2/P5;

    .line 4
    .line 5
    invoke-static {v0, v1}, LR2/D5;->t(LR2/D5;LR2/P5;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, LR2/G5;->p:LR2/D5;

    .line 9
    .line 10
    invoke-virtual {v0}, LR2/D5;->s0()V

    .line 11
    .line 12
    .line 13
    return-void
.end method
