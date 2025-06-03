.class public LV3/x$k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LV3/x;->A(LV3/k;Ld4/n;)Ljava/util/List;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic o:LV3/k;

.field public final synthetic p:Ld4/n;

.field public final synthetic q:LV3/x;


# direct methods
.method public constructor <init>(LV3/x;LV3/k;Ld4/n;)V
    .locals 0

    .line 1
    iput-object p1, p0, LV3/x$k;->q:LV3/x;

    .line 2
    .line 3
    iput-object p2, p0, LV3/x$k;->o:LV3/k;

    .line 4
    .line 5
    iput-object p3, p0, LV3/x$k;->p:Ld4/n;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public a()Ljava/util/List;
    .locals 5

    .line 1
    iget-object v0, p0, LV3/x$k;->q:LV3/x;

    .line 2
    .line 3
    invoke-static {v0}, LV3/x;->c(LV3/x;)LX3/e;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, LV3/x$k;->o:LV3/k;

    .line 8
    .line 9
    invoke-static {v1}, La4/i;->a(LV3/k;)La4/i;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iget-object v2, p0, LV3/x$k;->p:Ld4/n;

    .line 14
    .line 15
    invoke-interface {v0, v1, v2}, LX3/e;->j(La4/i;Ld4/n;)V

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, LV3/x$k;->q:LV3/x;

    .line 19
    .line 20
    new-instance v1, LW3/f;

    .line 21
    .line 22
    sget-object v2, LW3/e;->e:LW3/e;

    .line 23
    .line 24
    iget-object v3, p0, LV3/x$k;->o:LV3/k;

    .line 25
    .line 26
    iget-object v4, p0, LV3/x$k;->p:Ld4/n;

    .line 27
    .line 28
    invoke-direct {v1, v2, v3, v4}, LW3/f;-><init>(LW3/e;LV3/k;Ld4/n;)V

    .line 29
    .line 30
    .line 31
    invoke-static {v0, v1}, LV3/x;->k(LV3/x;LW3/d;)Ljava/util/List;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    return-object v0
.end method

.method public bridge synthetic call()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, LV3/x$k;->a()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
