.class public LV3/x$j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LV3/x;->U()Ljava/util/List;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic o:LV3/x;


# direct methods
.method public constructor <init>(LV3/x;)V
    .locals 0

    .line 1
    iput-object p1, p0, LV3/x$j;->o:LV3/x;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a()Ljava/util/List;
    .locals 5

    .line 1
    iget-object v0, p0, LV3/x$j;->o:LV3/x;

    .line 2
    .line 3
    invoke-static {v0}, LV3/x;->c(LV3/x;)LX3/e;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-interface {v0}, LX3/e;->a()V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, LV3/x$j;->o:LV3/x;

    .line 11
    .line 12
    invoke-static {v0}, LV3/x;->j(LV3/x;)LV3/F;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {v0}, LV3/F;->k()Ljava/util/List;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    return-object v0

    .line 31
    :cond_0
    new-instance v0, LY3/d;

    .line 32
    .line 33
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 34
    .line 35
    invoke-direct {v0, v1}, LY3/d;-><init>(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    iget-object v1, p0, LV3/x$j;->o:LV3/x;

    .line 39
    .line 40
    new-instance v2, LW3/a;

    .line 41
    .line 42
    invoke-static {}, LV3/k;->Y()LV3/k;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    const/4 v4, 0x1

    .line 47
    invoke-direct {v2, v3, v0, v4}, LW3/a;-><init>(LV3/k;LY3/d;Z)V

    .line 48
    .line 49
    .line 50
    invoke-static {v1, v2}, LV3/x;->k(LV3/x;LW3/d;)Ljava/util/List;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    return-object v0
.end method

.method public bridge synthetic call()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, LV3/x$j;->a()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
