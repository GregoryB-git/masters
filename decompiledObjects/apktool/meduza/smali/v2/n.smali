.class public final Lv2/n;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lv2/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv2/g<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Lv2/c;

.field public final c:Lv2/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv2/g<",
            "Lt2/c;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Lv2/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv2/g<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;La3/b;)V
    .locals 7

    .line 1
    new-instance v0, Lv2/a;

    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const-string v2, "context.applicationContext"

    .line 8
    .line 9
    invoke-static {v1, v2}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-direct {v0, v1, p2}, Lv2/a;-><init>(Landroid/content/Context;La3/b;)V

    .line 13
    .line 14
    .line 15
    new-instance v1, Lv2/c;

    .line 16
    .line 17
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    invoke-static {v3, v2}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    invoke-direct {v1, v3, p2}, Lv2/c;-><init>(Landroid/content/Context;La3/b;)V

    .line 25
    .line 26
    .line 27
    const-string v3, "taskExecutor"

    .line 28
    .line 29
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    invoke-static {v4, v2}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    sget-object v5, Lv2/j;->a:Ljava/lang/String;

    .line 37
    .line 38
    invoke-static {p2, v3}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 42
    .line 43
    const/16 v6, 0x18

    .line 44
    .line 45
    if-lt v5, v6, :cond_0

    .line 46
    .line 47
    new-instance v5, Lv2/i;

    .line 48
    .line 49
    invoke-direct {v5, v4, p2}, Lv2/i;-><init>(Landroid/content/Context;La3/b;)V

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_0
    new-instance v5, Lv2/k;

    .line 54
    .line 55
    invoke-direct {v5, v4, p2}, Lv2/k;-><init>(Landroid/content/Context;La3/b;)V

    .line 56
    .line 57
    .line 58
    :goto_0
    new-instance v4, Lv2/l;

    .line 59
    .line 60
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    invoke-static {p1, v2}, Lec/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    invoke-direct {v4, p1, p2}, Lv2/l;-><init>(Landroid/content/Context;La3/b;)V

    .line 68
    .line 69
    .line 70
    invoke-static {p2, v3}, Lec/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 74
    .line 75
    .line 76
    iput-object v0, p0, Lv2/n;->a:Lv2/g;

    .line 77
    .line 78
    iput-object v1, p0, Lv2/n;->b:Lv2/c;

    .line 79
    .line 80
    iput-object v5, p0, Lv2/n;->c:Lv2/g;

    .line 81
    .line 82
    iput-object v4, p0, Lv2/n;->d:Lv2/g;

    .line 83
    .line 84
    return-void
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
