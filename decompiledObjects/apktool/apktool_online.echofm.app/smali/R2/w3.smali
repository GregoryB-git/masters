.class public final LR2/w3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LR2/W1;


# instance fields
.field public final synthetic a:LR2/N2;


# direct methods
.method public constructor <init>(LR2/x3;LR2/N2;)V
    .locals 0

    .line 1
    iput-object p2, p0, LR2/w3;->a:LR2/N2;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 2

    .line 1
    iget-object v0, p0, LR2/w3;->a:LR2/N2;

    .line 2
    .line 3
    invoke-virtual {v0}, LR2/N2;->r()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, LR2/w3;->a:LR2/N2;

    .line 10
    .line 11
    invoke-virtual {v0}, LR2/N2;->j()LR2/Y1;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const/4 v1, 0x3

    .line 16
    invoke-virtual {v0, v1}, LR2/Y1;->C(I)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    const/4 v0, 0x1

    .line 23
    return v0

    .line 24
    :cond_0
    const/4 v0, 0x0

    .line 25
    return v0
.end method
