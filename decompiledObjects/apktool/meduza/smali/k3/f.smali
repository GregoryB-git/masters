.class public final Lk3/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly8/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ly8/d<",
        "Ln3/e;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:Lk3/f;

.field public static final b:Ly8/c;

.field public static final c:Ly8/c;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lk3/f;

    .line 2
    .line 3
    invoke-direct {v0}, Lk3/f;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lk3/f;->a:Lk3/f;

    .line 7
    .line 8
    new-instance v0, Lb9/a;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, v1}, Lb9/a;-><init>(I)V

    .line 12
    .line 13
    .line 14
    const-class v1, Lb9/d;

    .line 15
    .line 16
    invoke-static {v1, v0}, Lf;->n(Ljava/lang/Class;Lb9/a;)Ljava/util/HashMap;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    new-instance v1, Ly8/c;

    .line 21
    .line 22
    invoke-static {v0}, Lg;->i(Ljava/util/HashMap;)Ljava/util/Map;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    const-string v2, "currentCacheSizeBytes"

    .line 27
    .line 28
    invoke-direct {v1, v2, v0}, Ly8/c;-><init>(Ljava/lang/String;Ljava/util/Map;)V

    .line 29
    .line 30
    .line 31
    sput-object v1, Lk3/f;->b:Ly8/c;

    .line 32
    .line 33
    const/4 v0, 0x2

    .line 34
    new-instance v1, Lb9/a;

    .line 35
    .line 36
    invoke-direct {v1, v0}, Lb9/a;-><init>(I)V

    .line 37
    .line 38
    .line 39
    const-class v0, Lb9/d;

    .line 40
    .line 41
    invoke-static {v0, v1}, Lf;->n(Ljava/lang/Class;Lb9/a;)Ljava/util/HashMap;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    new-instance v1, Ly8/c;

    .line 46
    .line 47
    invoke-static {v0}, Lg;->i(Ljava/util/HashMap;)Ljava/util/Map;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    const-string v2, "maxCacheSizeBytes"

    .line 52
    .line 53
    invoke-direct {v1, v2, v0}, Ly8/c;-><init>(Ljava/lang/String;Ljava/util/Map;)V

    .line 54
    .line 55
    .line 56
    sput-object v1, Lk3/f;->c:Ly8/c;

    .line 57
    .line 58
    return-void
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
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 3

    .line 1
    check-cast p1, Ln3/e;

    .line 2
    .line 3
    check-cast p2, Ly8/e;

    .line 4
    .line 5
    sget-object v0, Lk3/f;->b:Ly8/c;

    .line 6
    .line 7
    iget-wide v1, p1, Ln3/e;->a:J

    .line 8
    .line 9
    invoke-interface {p2, v0, v1, v2}, Ly8/e;->d(Ly8/c;J)Ly8/e;

    .line 10
    .line 11
    .line 12
    sget-object v0, Lk3/f;->c:Ly8/c;

    .line 13
    .line 14
    iget-wide v1, p1, Ln3/e;->b:J

    .line 15
    .line 16
    invoke-interface {p2, v0, v1, v2}, Ly8/e;->d(Ly8/c;J)Ly8/e;

    .line 17
    .line 18
    .line 19
    return-void
    .line 20
    .line 21
    .line 22
    .line 23
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
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
.end method
