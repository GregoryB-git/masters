.class public LV3/x$g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LV3/x;->I(LV3/k;Ld4/n;Ld4/n;JZZ)Ljava/util/List;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic o:Z

.field public final synthetic p:LV3/k;

.field public final synthetic q:Ld4/n;

.field public final synthetic r:J

.field public final synthetic s:Ld4/n;

.field public final synthetic t:Z

.field public final synthetic u:LV3/x;


# direct methods
.method public constructor <init>(LV3/x;ZLV3/k;Ld4/n;JLd4/n;Z)V
    .locals 0

    .line 1
    iput-object p1, p0, LV3/x$g;->u:LV3/x;

    .line 2
    .line 3
    iput-boolean p2, p0, LV3/x$g;->o:Z

    .line 4
    .line 5
    iput-object p3, p0, LV3/x$g;->p:LV3/k;

    .line 6
    .line 7
    iput-object p4, p0, LV3/x$g;->q:Ld4/n;

    .line 8
    .line 9
    iput-wide p5, p0, LV3/x$g;->r:J

    .line 10
    .line 11
    iput-object p7, p0, LV3/x$g;->s:Ld4/n;

    .line 12
    .line 13
    iput-boolean p8, p0, LV3/x$g;->t:Z

    .line 14
    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public a()Ljava/util/List;
    .locals 5

    .line 1
    iget-boolean v0, p0, LV3/x$g;->o:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, LV3/x$g;->u:LV3/x;

    .line 6
    .line 7
    invoke-static {v0}, LV3/x;->c(LV3/x;)LX3/e;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget-object v1, p0, LV3/x$g;->p:LV3/k;

    .line 12
    .line 13
    iget-object v2, p0, LV3/x$g;->q:Ld4/n;

    .line 14
    .line 15
    iget-wide v3, p0, LV3/x$g;->r:J

    .line 16
    .line 17
    invoke-interface {v0, v1, v2, v3, v4}, LX3/e;->e(LV3/k;Ld4/n;J)V

    .line 18
    .line 19
    .line 20
    :cond_0
    iget-object v0, p0, LV3/x$g;->u:LV3/x;

    .line 21
    .line 22
    invoke-static {v0}, LV3/x;->j(LV3/x;)LV3/F;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    iget-object v1, p0, LV3/x$g;->p:LV3/k;

    .line 27
    .line 28
    iget-object v2, p0, LV3/x$g;->s:Ld4/n;

    .line 29
    .line 30
    iget-wide v3, p0, LV3/x$g;->r:J

    .line 31
    .line 32
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    iget-boolean v4, p0, LV3/x$g;->t:Z

    .line 37
    .line 38
    invoke-virtual {v0, v1, v2, v3, v4}, LV3/F;->b(LV3/k;Ld4/n;Ljava/lang/Long;Z)V

    .line 39
    .line 40
    .line 41
    iget-boolean v0, p0, LV3/x$g;->t:Z

    .line 42
    .line 43
    if-nez v0, :cond_1

    .line 44
    .line 45
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    return-object v0

    .line 50
    :cond_1
    iget-object v0, p0, LV3/x$g;->u:LV3/x;

    .line 51
    .line 52
    new-instance v1, LW3/f;

    .line 53
    .line 54
    sget-object v2, LW3/e;->d:LW3/e;

    .line 55
    .line 56
    iget-object v3, p0, LV3/x$g;->p:LV3/k;

    .line 57
    .line 58
    iget-object v4, p0, LV3/x$g;->s:Ld4/n;

    .line 59
    .line 60
    invoke-direct {v1, v2, v3, v4}, LW3/f;-><init>(LW3/e;LV3/k;Ld4/n;)V

    .line 61
    .line 62
    .line 63
    invoke-static {v0, v1}, LV3/x;->k(LV3/x;LW3/d;)Ljava/util/List;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    return-object v0
.end method

.method public bridge synthetic call()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, LV3/x$g;->a()Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
