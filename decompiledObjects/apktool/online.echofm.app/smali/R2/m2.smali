.class public final LR2/m2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic o:Z

.field public final synthetic p:LR2/j2;


# direct methods
.method public constructor <init>(LR2/j2;Z)V
    .locals 0

    .line 1
    iput-object p1, p0, LR2/m2;->p:LR2/j2;

    .line 2
    .line 3
    iput-boolean p2, p0, LR2/m2;->o:Z

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
    iget-object v0, p0, LR2/m2;->p:LR2/j2;

    .line 2
    .line 3
    invoke-static {v0}, LR2/j2;->a(LR2/j2;)LR2/D5;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-boolean v1, p0, LR2/m2;->o:Z

    .line 8
    .line 9
    invoke-virtual {v0, v1}, LR2/D5;->H(Z)V

    .line 10
    .line 11
    .line 12
    return-void
.end method
