.class public abstract Lk3/n;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lk3/n$a;
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lk3/n;->b()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-nez p1, :cond_0

    const-string p1, ""

    :cond_0
    return-object p1
.end method

.method public abstract b()Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end method

.method public abstract c()Ljava/lang/Integer;
.end method

.method public abstract d()Lk3/m;
.end method

.method public abstract e()J
.end method

.method public abstract f()[B
.end method

.method public abstract g()[B
.end method

.method public final h(Ljava/lang/String;)I
    .locals 1

    invoke-virtual {p0}, Lk3/n;->b()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    :goto_0
    return p1
.end method

.method public abstract i()Ljava/lang/Integer;
.end method

.method public abstract j()Ljava/lang/String;
.end method

.method public abstract k()Ljava/lang/String;
.end method

.method public abstract l()J
.end method

.method public final m()Lk3/h$a;
    .locals 3

    .line 1
    new-instance v0, Lk3/h$a;

    .line 2
    .line 3
    invoke-direct {v0}, Lk3/h$a;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lk3/n;->k()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v0, v1}, Lk3/h$a;->d(Ljava/lang/String;)Lk3/h$a;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Lk3/n;->c()Ljava/lang/Integer;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    iput-object v1, v0, Lk3/h$a;->b:Ljava/lang/Integer;

    .line 18
    .line 19
    invoke-virtual {p0}, Lk3/n;->i()Ljava/lang/Integer;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    iput-object v1, v0, Lk3/h$a;->g:Ljava/lang/Integer;

    .line 24
    .line 25
    invoke-virtual {p0}, Lk3/n;->j()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    iput-object v1, v0, Lk3/h$a;->h:Ljava/lang/String;

    .line 30
    .line 31
    invoke-virtual {p0}, Lk3/n;->f()[B

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    iput-object v1, v0, Lk3/h$a;->i:[B

    .line 36
    .line 37
    invoke-virtual {p0}, Lk3/n;->g()[B

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    iput-object v1, v0, Lk3/h$a;->j:[B

    .line 42
    .line 43
    invoke-virtual {p0}, Lk3/n;->d()Lk3/m;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    invoke-virtual {v0, v1}, Lk3/h$a;->c(Lk3/m;)Lk3/h$a;

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0}, Lk3/n;->e()J

    .line 51
    .line 52
    .line 53
    move-result-wide v1

    .line 54
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    iput-object v1, v0, Lk3/h$a;->d:Ljava/lang/Long;

    .line 59
    .line 60
    invoke-virtual {p0}, Lk3/n;->l()J

    .line 61
    .line 62
    .line 63
    move-result-wide v1

    .line 64
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    iput-object v1, v0, Lk3/h$a;->e:Ljava/lang/Long;

    .line 69
    .line 70
    new-instance v1, Ljava/util/HashMap;

    .line 71
    .line 72
    invoke-virtual {p0}, Lk3/n;->b()Ljava/util/Map;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    invoke-direct {v1, v2}, Ljava/util/HashMap;-><init>(Ljava/util/Map;)V

    .line 77
    .line 78
    .line 79
    iput-object v1, v0, Lk3/h$a;->f:Ljava/util/Map;

    .line 80
    .line 81
    return-object v0
    .line 82
    .line 83
.end method
