.class public LD5/f;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:LE5/k;

.field public final b:LE5/k$c;


# direct methods
.method public constructor <init>(Lw5/a;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, LD5/f$a;

    .line 5
    .line 6
    invoke-direct {v0, p0}, LD5/f$a;-><init>(LD5/f;)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, LD5/f;->b:LE5/k$c;

    .line 10
    .line 11
    new-instance v1, LE5/k;

    .line 12
    .line 13
    const-string v2, "flutter/backgesture"

    .line 14
    .line 15
    sget-object v3, LE5/q;->b:LE5/q;

    .line 16
    .line 17
    invoke-direct {v1, p1, v2, v3}, LE5/k;-><init>(LE5/c;Ljava/lang/String;LE5/l;)V

    .line 18
    .line 19
    .line 20
    iput-object v1, p0, LD5/f;->a:LE5/k;

    .line 21
    .line 22
    invoke-virtual {v1, v0}, LE5/k;->e(LE5/k$c;)V

    .line 23
    .line 24
    .line 25
    return-void
.end method


# virtual methods
.method public final a(Landroid/window/BackEvent;)Ljava/util/Map;
    .locals 5

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    .line 5
    .line 6
    .line 7
    invoke-static {p1}, LD5/b;->a(Landroid/window/BackEvent;)F

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    invoke-static {p1}, LD5/c;->a(Landroid/window/BackEvent;)F

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    if-nez v3, :cond_1

    .line 20
    .line 21
    invoke-static {v2}, Ljava/lang/Float;->isNaN(F)Z

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    if-eqz v3, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    const/4 v3, 0x2

    .line 37
    new-array v3, v3, [Ljava/lang/Float;

    .line 38
    .line 39
    const/4 v4, 0x0

    .line 40
    aput-object v1, v3, v4

    .line 41
    .line 42
    const/4 v1, 0x1

    .line 43
    aput-object v2, v3, v1

    .line 44
    .line 45
    invoke-static {v3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    goto :goto_1

    .line 50
    :cond_1
    :goto_0
    const/4 v1, 0x0

    .line 51
    :goto_1
    const-string v2, "touchOffset"

    .line 52
    .line 53
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    invoke-static {p1}, LD5/d;->a(Landroid/window/BackEvent;)F

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    const-string v2, "progress"

    .line 65
    .line 66
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    invoke-static {p1}, LD5/e;->a(Landroid/window/BackEvent;)I

    .line 70
    .line 71
    .line 72
    move-result p1

    .line 73
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    const-string v1, "swipeEdge"

    .line 78
    .line 79
    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    return-object v0
.end method

.method public b()V
    .locals 3

    .line 1
    const-string v0, "BackGestureChannel"

    .line 2
    .line 3
    const-string v1, "Sending message to cancel back gesture"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lt5/b;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, LD5/f;->a:LE5/k;

    .line 9
    .line 10
    const-string v1, "cancelBackGesture"

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    invoke-virtual {v0, v1, v2}, LE5/k;->c(Ljava/lang/String;Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public c()V
    .locals 3

    .line 1
    const-string v0, "BackGestureChannel"

    .line 2
    .line 3
    const-string v1, "Sending message to commit back gesture"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lt5/b;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, LD5/f;->a:LE5/k;

    .line 9
    .line 10
    const-string v1, "commitBackGesture"

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    invoke-virtual {v0, v1, v2}, LE5/k;->c(Ljava/lang/String;Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public d(Landroid/window/BackEvent;)V
    .locals 2

    .line 1
    const-string v0, "BackGestureChannel"

    .line 2
    .line 3
    const-string v1, "Sending message to start back gesture"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lt5/b;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, LD5/f;->a:LE5/k;

    .line 9
    .line 10
    const-string v1, "startBackGesture"

    .line 11
    .line 12
    invoke-virtual {p0, p1}, LD5/f;->a(Landroid/window/BackEvent;)Ljava/util/Map;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-virtual {v0, v1, p1}, LE5/k;->c(Ljava/lang/String;Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public e(Landroid/window/BackEvent;)V
    .locals 2

    .line 1
    const-string v0, "BackGestureChannel"

    .line 2
    .line 3
    const-string v1, "Sending message to update back gesture progress"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lt5/b;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, LD5/f;->a:LE5/k;

    .line 9
    .line 10
    const-string v1, "updateBackGestureProgress"

    .line 11
    .line 12
    invoke-virtual {p0, p1}, LD5/f;->a(Landroid/window/BackEvent;)Ljava/util/Map;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-virtual {v0, v1, p1}, LE5/k;->c(Ljava/lang/String;Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method
