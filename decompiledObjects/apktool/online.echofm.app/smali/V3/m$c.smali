.class public LV3/m$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LT3/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LV3/m;->V(LV3/k;Ljava/util/Map;LQ3/e$e;Ljava/util/Map;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:LV3/k;

.field public final synthetic b:Ljava/util/Map;

.field public final synthetic c:LQ3/e$e;

.field public final synthetic d:LV3/m;


# direct methods
.method public constructor <init>(LV3/m;LV3/k;Ljava/util/Map;LQ3/e$e;)V
    .locals 0

    .line 1
    iput-object p1, p0, LV3/m$c;->d:LV3/m;

    .line 2
    .line 3
    iput-object p2, p0, LV3/m$c;->a:LV3/k;

    .line 4
    .line 5
    iput-object p3, p0, LV3/m$c;->b:Ljava/util/Map;

    .line 6
    .line 7
    iput-object p4, p0, LV3/m$c;->c:LQ3/e$e;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    .line 1
    invoke-static {p1, p2}, LV3/m;->y(Ljava/lang/String;Ljava/lang/String;)LQ3/c;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object p2, p0, LV3/m$c;->d:LV3/m;

    .line 6
    .line 7
    const-string v0, "onDisconnect().updateChildren"

    .line 8
    .line 9
    iget-object v1, p0, LV3/m$c;->a:LV3/k;

    .line 10
    .line 11
    invoke-static {p2, v0, v1, p1}, LV3/m;->z(LV3/m;Ljava/lang/String;LV3/k;LQ3/c;)V

    .line 12
    .line 13
    .line 14
    if-nez p1, :cond_0

    .line 15
    .line 16
    iget-object p2, p0, LV3/m$c;->b:Ljava/util/Map;

    .line 17
    .line 18
    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 19
    .line 20
    .line 21
    move-result-object p2

    .line 22
    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-eqz v0, :cond_0

    .line 31
    .line 32
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    check-cast v0, Ljava/util/Map$Entry;

    .line 37
    .line 38
    iget-object v1, p0, LV3/m$c;->d:LV3/m;

    .line 39
    .line 40
    invoke-static {v1}, LV3/m;->k(LV3/m;)LV3/u;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    iget-object v2, p0, LV3/m$c;->a:LV3/k;

    .line 45
    .line 46
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    check-cast v3, LV3/k;

    .line 51
    .line 52
    invoke-virtual {v2, v3}, LV3/k;->T(LV3/k;)LV3/k;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    check-cast v0, Ld4/n;

    .line 61
    .line 62
    invoke-virtual {v1, v2, v0}, LV3/u;->d(LV3/k;Ld4/n;)V

    .line 63
    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_0
    iget-object p2, p0, LV3/m$c;->d:LV3/m;

    .line 67
    .line 68
    iget-object v0, p0, LV3/m$c;->c:LQ3/e$e;

    .line 69
    .line 70
    iget-object v1, p0, LV3/m$c;->a:LV3/k;

    .line 71
    .line 72
    invoke-virtual {p2, v0, p1, v1}, LV3/m;->G(LQ3/e$e;LQ3/c;LV3/k;)V

    .line 73
    .line 74
    .line 75
    return-void
.end method
