.class public LV3/x$o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LV3/x;->F(LV3/k;Ld4/n;LV3/y;)Ljava/util/List;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic o:LV3/y;

.field public final synthetic p:LV3/k;

.field public final synthetic q:Ld4/n;

.field public final synthetic r:LV3/x;


# direct methods
.method public constructor <init>(LV3/x;LV3/y;LV3/k;Ld4/n;)V
    .locals 0

    .line 1
    iput-object p1, p0, LV3/x$o;->r:LV3/x;

    .line 2
    .line 3
    iput-object p2, p0, LV3/x$o;->o:LV3/y;

    .line 4
    .line 5
    iput-object p3, p0, LV3/x$o;->p:LV3/k;

    .line 6
    .line 7
    iput-object p4, p0, LV3/x$o;->q:Ld4/n;

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
    iget-object v0, p0, LV3/x$o;->r:LV3/x;

    .line 2
    .line 3
    iget-object v1, p0, LV3/x$o;->o:LV3/y;

    .line 4
    .line 5
    invoke-static {v0, v1}, LV3/x;->l(LV3/x;LV3/y;)La4/i;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    invoke-virtual {v0}, La4/i;->e()LV3/k;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    iget-object v2, p0, LV3/x$o;->p:LV3/k;

    .line 16
    .line 17
    invoke-static {v1, v2}, LV3/k;->b0(LV3/k;LV3/k;)LV3/k;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {v1}, LV3/k;->isEmpty()Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-eqz v2, :cond_0

    .line 26
    .line 27
    move-object v2, v0

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    iget-object v2, p0, LV3/x$o;->p:LV3/k;

    .line 30
    .line 31
    invoke-static {v2}, La4/i;->a(LV3/k;)La4/i;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    :goto_0
    iget-object v3, p0, LV3/x$o;->r:LV3/x;

    .line 36
    .line 37
    invoke-static {v3}, LV3/x;->c(LV3/x;)LX3/e;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    iget-object v4, p0, LV3/x$o;->q:Ld4/n;

    .line 42
    .line 43
    invoke-interface {v3, v2, v4}, LX3/e;->j(La4/i;Ld4/n;)V

    .line 44
    .line 45
    .line 46
    new-instance v2, LW3/f;

    .line 47
    .line 48
    invoke-virtual {v0}, La4/i;->d()La4/h;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    invoke-static {v3}, LW3/e;->a(La4/h;)LW3/e;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    iget-object v4, p0, LV3/x$o;->q:Ld4/n;

    .line 57
    .line 58
    invoke-direct {v2, v3, v1, v4}, LW3/f;-><init>(LW3/e;LV3/k;Ld4/n;)V

    .line 59
    .line 60
    .line 61
    iget-object v1, p0, LV3/x$o;->r:LV3/x;

    .line 62
    .line 63
    invoke-static {v1, v0, v2}, LV3/x;->m(LV3/x;La4/i;LW3/d;)Ljava/util/List;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    return-object v0

    .line 68
    :cond_1
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    return-object v0
.end method

.method public bridge synthetic call()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, LV3/x$o;->a()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
