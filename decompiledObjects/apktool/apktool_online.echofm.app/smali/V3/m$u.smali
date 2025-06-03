.class public LV3/m$u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LV3/x$s;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LV3/m;->H()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:LV3/m;


# direct methods
.method public constructor <init>(LV3/m;)V
    .locals 0

    .line 1
    iput-object p1, p0, LV3/m$u;->a:LV3/m;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public a(La4/i;LV3/y;)V
    .locals 1

    .line 1
    iget-object p2, p0, LV3/m$u;->a:LV3/m;

    .line 2
    .line 3
    invoke-static {p2}, LV3/m;->n(LV3/m;)LT3/h;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    invoke-virtual {p1}, La4/i;->e()LV3/k;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, LV3/k;->S()Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {p1}, La4/i;->d()La4/h;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-virtual {p1}, La4/h;->k()Ljava/util/Map;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-interface {p2, v0, p1}, LT3/h;->l(Ljava/util/List;Ljava/util/Map;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public b(La4/i;LV3/y;LT3/g;LV3/x$p;)V
    .locals 7

    .line 1
    iget-object v0, p0, LV3/m$u;->a:LV3/m;

    .line 2
    .line 3
    invoke-static {v0}, LV3/m;->n(LV3/m;)LT3/h;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {p1}, La4/i;->e()LV3/k;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, LV3/k;->S()Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-virtual {p1}, La4/i;->d()La4/h;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-virtual {p1}, La4/h;->k()Ljava/util/Map;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    if-eqz p2, :cond_0

    .line 24
    .line 25
    invoke-virtual {p2}, LV3/y;->a()J

    .line 26
    .line 27
    .line 28
    move-result-wide p1

    .line 29
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    :goto_0
    move-object v5, p1

    .line 34
    goto :goto_1

    .line 35
    :cond_0
    const/4 p1, 0x0

    .line 36
    goto :goto_0

    .line 37
    :goto_1
    new-instance v6, LV3/m$u$a;

    .line 38
    .line 39
    invoke-direct {v6, p0, p4}, LV3/m$u$a;-><init>(LV3/m$u;LV3/x$p;)V

    .line 40
    .line 41
    .line 42
    move-object v4, p3

    .line 43
    invoke-interface/range {v1 .. v6}, LT3/h;->k(Ljava/util/List;Ljava/util/Map;LT3/g;Ljava/lang/Long;LT3/p;)V

    .line 44
    .line 45
    .line 46
    return-void
.end method
