.class public LV3/x$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LV3/x;->E(LV3/k;Ljava/util/Map;LV3/y;)Ljava/util/List;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic o:LV3/y;

.field public final synthetic p:LV3/k;

.field public final synthetic q:Ljava/util/Map;

.field public final synthetic r:LV3/x;


# direct methods
.method public constructor <init>(LV3/x;LV3/y;LV3/k;Ljava/util/Map;)V
    .locals 0

    .line 1
    iput-object p1, p0, LV3/x$a;->r:LV3/x;

    .line 2
    .line 3
    iput-object p2, p0, LV3/x$a;->o:LV3/y;

    .line 4
    .line 5
    iput-object p3, p0, LV3/x$a;->p:LV3/k;

    .line 6
    .line 7
    iput-object p4, p0, LV3/x$a;->q:Ljava/util/Map;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public a()Ljava/util/List;
    .locals 5

    .line 1
    iget-object v0, p0, LV3/x$a;->r:LV3/x;

    .line 2
    .line 3
    iget-object v1, p0, LV3/x$a;->o:LV3/y;

    .line 4
    .line 5
    invoke-static {v0, v1}, LV3/x;->l(LV3/x;LV3/y;)La4/i;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0}, La4/i;->e()LV3/k;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    iget-object v2, p0, LV3/x$a;->p:LV3/k;

    .line 16
    .line 17
    invoke-static {v1, v2}, LV3/k;->b0(LV3/k;LV3/k;)LV3/k;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    iget-object v2, p0, LV3/x$a;->q:Ljava/util/Map;

    .line 22
    .line 23
    invoke-static {v2}, LV3/b;->D(Ljava/util/Map;)LV3/b;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    iget-object v3, p0, LV3/x$a;->r:LV3/x;

    .line 28
    .line 29
    invoke-static {v3}, LV3/x;->c(LV3/x;)LX3/e;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    iget-object v4, p0, LV3/x$a;->p:LV3/k;

    .line 34
    .line 35
    invoke-interface {v3, v4, v2}, LX3/e;->f(LV3/k;LV3/b;)V

    .line 36
    .line 37
    .line 38
    new-instance v3, LW3/c;

    .line 39
    .line 40
    invoke-virtual {v0}, La4/i;->d()La4/h;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    invoke-static {v4}, LW3/e;->a(La4/h;)LW3/e;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    invoke-direct {v3, v4, v1, v2}, LW3/c;-><init>(LW3/e;LV3/k;LV3/b;)V

    .line 49
    .line 50
    .line 51
    iget-object v1, p0, LV3/x$a;->r:LV3/x;

    .line 52
    .line 53
    invoke-static {v1, v0, v3}, LV3/x;->m(LV3/x;La4/i;LW3/d;)Ljava/util/List;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    return-object v0

    .line 58
    :cond_0
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    return-object v0
.end method

.method public bridge synthetic call()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, LV3/x$a;->a()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
