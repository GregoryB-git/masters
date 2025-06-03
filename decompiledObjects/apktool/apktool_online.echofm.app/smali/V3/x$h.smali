.class public LV3/x$h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LV3/x;->H(LV3/k;LV3/b;LV3/b;JZ)Ljava/util/List;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic o:Z

.field public final synthetic p:LV3/k;

.field public final synthetic q:LV3/b;

.field public final synthetic r:J

.field public final synthetic s:LV3/b;

.field public final synthetic t:LV3/x;


# direct methods
.method public constructor <init>(LV3/x;ZLV3/k;LV3/b;JLV3/b;)V
    .locals 0

    .line 1
    iput-object p1, p0, LV3/x$h;->t:LV3/x;

    .line 2
    .line 3
    iput-boolean p2, p0, LV3/x$h;->o:Z

    .line 4
    .line 5
    iput-object p3, p0, LV3/x$h;->p:LV3/k;

    .line 6
    .line 7
    iput-object p4, p0, LV3/x$h;->q:LV3/b;

    .line 8
    .line 9
    iput-wide p5, p0, LV3/x$h;->r:J

    .line 10
    .line 11
    iput-object p7, p0, LV3/x$h;->s:LV3/b;

    .line 12
    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public a()Ljava/util/List;
    .locals 5

    .line 1
    iget-boolean v0, p0, LV3/x$h;->o:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, LV3/x$h;->t:LV3/x;

    .line 6
    .line 7
    invoke-static {v0}, LV3/x;->c(LV3/x;)LX3/e;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget-object v1, p0, LV3/x$h;->p:LV3/k;

    .line 12
    .line 13
    iget-object v2, p0, LV3/x$h;->q:LV3/b;

    .line 14
    .line 15
    iget-wide v3, p0, LV3/x$h;->r:J

    .line 16
    .line 17
    invoke-interface {v0, v1, v2, v3, v4}, LX3/e;->c(LV3/k;LV3/b;J)V

    .line 18
    .line 19
    .line 20
    :cond_0
    iget-object v0, p0, LV3/x$h;->t:LV3/x;

    .line 21
    .line 22
    invoke-static {v0}, LV3/x;->j(LV3/x;)LV3/F;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    iget-object v1, p0, LV3/x$h;->p:LV3/k;

    .line 27
    .line 28
    iget-object v2, p0, LV3/x$h;->s:LV3/b;

    .line 29
    .line 30
    iget-wide v3, p0, LV3/x$h;->r:J

    .line 31
    .line 32
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    invoke-virtual {v0, v1, v2, v3}, LV3/F;->a(LV3/k;LV3/b;Ljava/lang/Long;)V

    .line 37
    .line 38
    .line 39
    iget-object v0, p0, LV3/x$h;->t:LV3/x;

    .line 40
    .line 41
    new-instance v1, LW3/c;

    .line 42
    .line 43
    sget-object v2, LW3/e;->d:LW3/e;

    .line 44
    .line 45
    iget-object v3, p0, LV3/x$h;->p:LV3/k;

    .line 46
    .line 47
    iget-object v4, p0, LV3/x$h;->s:LV3/b;

    .line 48
    .line 49
    invoke-direct {v1, v2, v3, v4}, LW3/c;-><init>(LW3/e;LV3/k;LV3/b;)V

    .line 50
    .line 51
    .line 52
    invoke-static {v0, v1}, LV3/x;->k(LV3/x;LW3/d;)Ljava/util/List;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    return-object v0
.end method

.method public bridge synthetic call()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, LV3/x$h;->a()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
