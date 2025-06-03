.class public LT3/n$g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LT3/n$j;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LT3/n;->z0(LT3/n$n;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:LT3/n$n;

.field public final synthetic b:LT3/n;


# direct methods
.method public constructor <init>(LT3/n;LT3/n$n;)V
    .locals 0

    .line 1
    iput-object p1, p0, LT3/n$g;->b:LT3/n;

    .line 2
    .line 3
    iput-object p2, p0, LT3/n$g;->a:LT3/n$n;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public a(Ljava/util/Map;)V
    .locals 6

    .line 1
    const-string v0, "s"

    .line 2
    .line 3
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/String;

    .line 8
    .line 9
    const-string v1, "ok"

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    const-string v3, "d"

    .line 16
    .line 17
    if-eqz v2, :cond_0

    .line 18
    .line 19
    invoke-interface {p1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    check-cast v2, Ljava/util/Map;

    .line 24
    .line 25
    const-string v4, "w"

    .line 26
    .line 27
    invoke-interface {v2, v4}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v5

    .line 31
    if-eqz v5, :cond_0

    .line 32
    .line 33
    invoke-interface {v2, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    check-cast v2, Ljava/util/List;

    .line 38
    .line 39
    iget-object v4, p0, LT3/n$g;->b:LT3/n;

    .line 40
    .line 41
    iget-object v5, p0, LT3/n$g;->a:LT3/n$n;

    .line 42
    .line 43
    invoke-static {v5}, LT3/n$n;->a(LT3/n$n;)LT3/n$p;

    .line 44
    .line 45
    .line 46
    move-result-object v5

    .line 47
    invoke-static {v4, v2, v5}, LT3/n;->K(LT3/n;Ljava/util/List;LT3/n$p;)V

    .line 48
    .line 49
    .line 50
    :cond_0
    iget-object v2, p0, LT3/n$g;->b:LT3/n;

    .line 51
    .line 52
    invoke-static {v2}, LT3/n;->L(LT3/n;)Ljava/util/Map;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    iget-object v4, p0, LT3/n$g;->a:LT3/n$n;

    .line 57
    .line 58
    invoke-virtual {v4}, LT3/n$n;->d()LT3/n$p;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    invoke-interface {v2, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    check-cast v2, LT3/n$n;

    .line 67
    .line 68
    iget-object v4, p0, LT3/n$g;->a:LT3/n$n;

    .line 69
    .line 70
    if-ne v2, v4, :cond_2

    .line 71
    .line 72
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    if-nez v1, :cond_1

    .line 77
    .line 78
    iget-object v1, p0, LT3/n$g;->b:LT3/n;

    .line 79
    .line 80
    iget-object v2, p0, LT3/n$g;->a:LT3/n$n;

    .line 81
    .line 82
    invoke-virtual {v2}, LT3/n$n;->d()LT3/n$p;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    invoke-static {v1, v2}, LT3/n;->M(LT3/n;LT3/n$p;)LT3/n$n;

    .line 87
    .line 88
    .line 89
    invoke-interface {p1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    check-cast p1, Ljava/lang/String;

    .line 94
    .line 95
    iget-object v1, p0, LT3/n$g;->a:LT3/n$n;

    .line 96
    .line 97
    invoke-static {v1}, LT3/n$n;->b(LT3/n$n;)LT3/p;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    invoke-interface {v1, v0, p1}, LT3/p;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    goto :goto_0

    .line 105
    :cond_1
    iget-object p1, p0, LT3/n$g;->a:LT3/n$n;

    .line 106
    .line 107
    invoke-static {p1}, LT3/n$n;->b(LT3/n$n;)LT3/p;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    const/4 v0, 0x0

    .line 112
    invoke-interface {p1, v0, v0}, LT3/p;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    :cond_2
    :goto_0
    return-void
.end method
