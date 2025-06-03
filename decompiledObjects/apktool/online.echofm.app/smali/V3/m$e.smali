.class public LV3/m$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LV3/u$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LV3/m;->g0()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Ljava/util/Map;

.field public final synthetic b:Ljava/util/List;

.field public final synthetic c:LV3/m;


# direct methods
.method public constructor <init>(LV3/m;Ljava/util/Map;Ljava/util/List;)V
    .locals 0

    .line 1
    iput-object p1, p0, LV3/m$e;->c:LV3/m;

    .line 2
    .line 3
    iput-object p2, p0, LV3/m$e;->a:Ljava/util/Map;

    .line 4
    .line 5
    iput-object p3, p0, LV3/m$e;->b:Ljava/util/List;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public a(LV3/k;Ld4/n;)V
    .locals 2

    .line 1
    iget-object v0, p0, LV3/m$e;->c:LV3/m;

    .line 2
    .line 3
    invoke-static {v0}, LV3/m;->B(LV3/m;)LV3/x;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, p1, v1}, LV3/x;->J(LV3/k;Ljava/util/List;)Ld4/n;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iget-object v1, p0, LV3/m$e;->a:Ljava/util/Map;

    .line 17
    .line 18
    invoke-static {p2, v0, v1}, LV3/s;->i(Ld4/n;Ld4/n;Ljava/util/Map;)Ld4/n;

    .line 19
    .line 20
    .line 21
    move-result-object p2

    .line 22
    iget-object v0, p0, LV3/m$e;->b:Ljava/util/List;

    .line 23
    .line 24
    iget-object v1, p0, LV3/m$e;->c:LV3/m;

    .line 25
    .line 26
    invoke-static {v1}, LV3/m;->B(LV3/m;)LV3/x;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-virtual {v1, p1, p2}, LV3/x;->A(LV3/k;Ld4/n;)Ljava/util/List;

    .line 31
    .line 32
    .line 33
    move-result-object p2

    .line 34
    invoke-interface {v0, p2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 35
    .line 36
    .line 37
    iget-object p2, p0, LV3/m$e;->c:LV3/m;

    .line 38
    .line 39
    const/16 v0, -0x9

    .line 40
    .line 41
    invoke-static {p2, p1, v0}, LV3/m;->l(LV3/m;LV3/k;I)LV3/k;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    iget-object p2, p0, LV3/m$e;->c:LV3/m;

    .line 46
    .line 47
    invoke-static {p2, p1}, LV3/m;->m(LV3/m;LV3/k;)LV3/k;

    .line 48
    .line 49
    .line 50
    return-void
.end method
