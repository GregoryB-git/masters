.class public abstract Lt5/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt5/k;


# instance fields
.field public final a:Z

.field public final b:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lt5/l0;",
            ">;"
        }
    .end annotation
.end field

.field public c:I

.field public d:Lt5/n;


# direct methods
.method public constructor <init>(Z)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lt5/f;->a:Z

    new-instance p1, Ljava/util/ArrayList;

    const/4 v0, 0x1

    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    iput-object p1, p0, Lt5/f;->b:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final f(Lt5/l0;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lt5/f;->b:Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, Lt5/f;->b:Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    iget p1, p0, Lt5/f;->c:I

    .line 18
    .line 19
    add-int/lit8 p1, p1, 0x1

    .line 20
    .line 21
    iput p1, p0, Lt5/f;->c:I

    .line 22
    .line 23
    :cond_0
    return-void
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
.end method

.method public h()Ljava/util/Map;
    .locals 1

    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public final o(I)V
    .locals 4

    iget-object v0, p0, Lt5/f;->d:Lt5/n;

    sget v1, Lv5/e0;->a:I

    const/4 v1, 0x0

    :goto_0
    iget v2, p0, Lt5/f;->c:I

    if-ge v1, v2, :cond_0

    iget-object v2, p0, Lt5/f;->b:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lt5/l0;

    iget-boolean v3, p0, Lt5/f;->a:Z

    invoke-interface {v2, v0, v3, p1}, Lt5/l0;->a(Lt5/n;ZI)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final p()V
    .locals 4

    iget-object v0, p0, Lt5/f;->d:Lt5/n;

    sget v1, Lv5/e0;->a:I

    const/4 v1, 0x0

    :goto_0
    iget v2, p0, Lt5/f;->c:I

    if-ge v1, v2, :cond_0

    iget-object v2, p0, Lt5/f;->b:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lt5/l0;

    iget-boolean v3, p0, Lt5/f;->a:Z

    invoke-interface {v2, v0, v3}, Lt5/l0;->h(Lt5/n;Z)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lt5/f;->d:Lt5/n;

    return-void
.end method

.method public final q(Lt5/n;)V
    .locals 1

    const/4 p1, 0x0

    :goto_0
    iget v0, p0, Lt5/f;->c:I

    if-ge p1, v0, :cond_0

    iget-object v0, p0, Lt5/f;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lt5/l0;

    invoke-interface {v0}, Lt5/l0;->d()V

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final r(Lt5/n;)V
    .locals 3

    iput-object p1, p0, Lt5/f;->d:Lt5/n;

    const/4 v0, 0x0

    :goto_0
    iget v1, p0, Lt5/f;->c:I

    if-ge v0, v1, :cond_0

    iget-object v1, p0, Lt5/f;->b:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lt5/l0;

    iget-boolean v2, p0, Lt5/f;->a:Z

    invoke-interface {v1, p1, v2}, Lt5/l0;->i(Lt5/n;Z)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method
