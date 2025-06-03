.class public LV3/q;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final b:LV3/q;


# instance fields
.field public final a:Ljava/util/Map;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, LV3/q;

    .line 2
    .line 3
    invoke-direct {v0}, LV3/q;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, LV3/q;->b:LV3/q;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/HashMap;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, LV3/q;->a:Ljava/util/Map;

    .line 10
    .line 11
    return-void
.end method

.method public static b(LV3/f;LV3/p;LQ3/h;)LV3/m;
    .locals 1

    .line 1
    sget-object v0, LV3/q;->b:LV3/q;

    .line 2
    .line 3
    invoke-virtual {v0, p0, p1, p2}, LV3/q;->a(LV3/f;LV3/p;LQ3/h;)LV3/m;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public static c(LV3/m;)V
    .locals 1

    .line 1
    new-instance v0, LV3/q$a;

    .line 2
    .line 3
    invoke-direct {v0, p0}, LV3/q$a;-><init>(LV3/m;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, LV3/m;->i0(Ljava/lang/Runnable;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public static d(LV3/m;)V
    .locals 1

    .line 1
    new-instance v0, LV3/q$b;

    .line 2
    .line 3
    invoke-direct {v0, p0}, LV3/q$b;-><init>(LV3/m;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, LV3/m;->i0(Ljava/lang/Runnable;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final a(LV3/f;LV3/p;LQ3/h;)LV3/m;
    .locals 4

    .line 1
    invoke-virtual {p1}, LV3/f;->k()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/lang/StringBuilder;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 7
    .line 8
    .line 9
    const-string v1, "https://"

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    iget-object v1, p2, LV3/p;->a:Ljava/lang/String;

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    const-string v1, "/"

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    iget-object v1, p2, LV3/p;->c:Ljava/lang/String;

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    iget-object v1, p0, LV3/q;->a:Ljava/util/Map;

    .line 34
    .line 35
    monitor-enter v1

    .line 36
    :try_start_0
    iget-object v2, p0, LV3/q;->a:Ljava/util/Map;

    .line 37
    .line 38
    invoke-interface {v2, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    if-nez v2, :cond_0

    .line 43
    .line 44
    new-instance v2, Ljava/util/HashMap;

    .line 45
    .line 46
    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 47
    .line 48
    .line 49
    iget-object v3, p0, LV3/q;->a:Ljava/util/Map;

    .line 50
    .line 51
    invoke-interface {v3, p1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    goto :goto_0

    .line 55
    :catchall_0
    move-exception p1

    .line 56
    goto :goto_1

    .line 57
    :cond_0
    :goto_0
    iget-object v2, p0, LV3/q;->a:Ljava/util/Map;

    .line 58
    .line 59
    invoke-interface {v2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    check-cast v2, Ljava/util/Map;

    .line 64
    .line 65
    invoke-interface {v2, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v3

    .line 69
    if-nez v3, :cond_1

    .line 70
    .line 71
    new-instance v3, LV3/m;

    .line 72
    .line 73
    invoke-direct {v3, p2, p1, p3}, LV3/m;-><init>(LV3/p;LV3/f;LQ3/h;)V

    .line 74
    .line 75
    .line 76
    invoke-interface {v2, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    monitor-exit v1

    .line 80
    return-object v3

    .line 81
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 82
    .line 83
    const-string p2, "createLocalRepo() called for existing repo."

    .line 84
    .line 85
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    throw p1

    .line 89
    :goto_1
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 90
    throw p1
.end method
