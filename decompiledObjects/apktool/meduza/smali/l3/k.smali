.class public final Ll3/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ll3/e;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ll3/k$a;
    }
.end annotation


# instance fields
.field public final a:Ll3/k$a;

.field public final b:Ll3/i;

.field public final c:Ljava/util/HashMap;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ll3/i;)V
    .locals 1

    new-instance v0, Ll3/k$a;

    invoke-direct {v0, p1}, Ll3/k$a;-><init>(Landroid/content/Context;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Ll3/k;->c:Ljava/util/HashMap;

    iput-object v0, p0, Ll3/k;->a:Ll3/k$a;

    iput-object p2, p0, Ll3/k;->b:Ll3/i;

    return-void
.end method


# virtual methods
.method public final declared-synchronized a(Ljava/lang/String;)Ll3/m;
    .locals 5

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Ll3/k;->c:Ljava/util/HashMap;

    .line 3
    .line 4
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Ll3/k;->c:Ljava/util/HashMap;

    .line 11
    .line 12
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    check-cast p1, Ll3/m;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    .line 18
    monitor-exit p0

    .line 19
    return-object p1

    .line 20
    :cond_0
    :try_start_1
    iget-object v0, p0, Ll3/k;->a:Ll3/k$a;

    .line 21
    .line 22
    invoke-virtual {v0, p1}, Ll3/k$a;->a(Ljava/lang/String;)Ll3/d;

    .line 23
    .line 24
    .line 25
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 26
    if-nez v0, :cond_1

    .line 27
    .line 28
    const/4 p1, 0x0

    .line 29
    monitor-exit p0

    .line 30
    return-object p1

    .line 31
    :cond_1
    :try_start_2
    iget-object v1, p0, Ll3/k;->b:Ll3/i;

    .line 32
    .line 33
    iget-object v2, v1, Ll3/i;->a:Landroid/content/Context;

    .line 34
    .line 35
    iget-object v3, v1, Ll3/i;->b:Lt3/a;

    .line 36
    .line 37
    iget-object v1, v1, Ll3/i;->c:Lt3/a;

    .line 38
    .line 39
    new-instance v4, Ll3/c;

    .line 40
    .line 41
    invoke-direct {v4, v2, v3, v1, p1}, Ll3/c;-><init>(Landroid/content/Context;Lt3/a;Lt3/a;Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    invoke-interface {v0, v4}, Ll3/d;->create(Ll3/h;)Ll3/m;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    iget-object v1, p0, Ll3/k;->c:Ljava/util/HashMap;

    .line 49
    .line 50
    invoke-virtual {v1, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 51
    .line 52
    .line 53
    monitor-exit p0

    .line 54
    return-object v0

    .line 55
    :catchall_0
    move-exception p1

    .line 56
    monitor-exit p0

    .line 57
    throw p1
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
