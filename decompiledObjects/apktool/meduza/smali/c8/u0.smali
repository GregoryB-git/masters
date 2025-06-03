.class public final Lc8/u0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final c:Lc8/u0;


# instance fields
.field public final a:Lc8/f0;

.field public final b:Lc8/w;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lc8/u0;

    invoke-direct {v0}, Lc8/u0;-><init>()V

    sput-object v0, Lc8/u0;->c:Lc8/u0;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    sget-object v0, Lc8/f0;->d:Lc8/f0;

    .line 2
    .line 3
    sget-object v1, Lc8/w;->c:Lc8/w;

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    new-instance v1, Lc8/w;

    .line 8
    .line 9
    invoke-direct {v1}, Lc8/w;-><init>()V

    .line 10
    .line 11
    .line 12
    sput-object v1, Lc8/w;->c:Lc8/w;

    .line 13
    .line 14
    :cond_0
    sget-object v1, Lc8/w;->c:Lc8/w;

    .line 15
    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, Lc8/u0;->a:Lc8/f0;

    .line 20
    .line 21
    iput-object v1, p0, Lc8/u0;->b:Lc8/w;

    .line 22
    .line 23
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
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
.end method


# virtual methods
.method public final a(Landroid/content/Context;)V
    .locals 3

    iget-object v0, p0, Lc8/u0;->a:Lc8/f0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1}, Lm6/j;->i(Ljava/lang/Object;)V

    const-string v1, "com.google.firebase.auth.internal.ProcessDeathHelper"

    const/4 v2, 0x0

    invoke-virtual {p1, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p1

    invoke-static {p1}, Lc8/f0;->d(Landroid/content/SharedPreferences;)V

    const-wide/16 v1, 0x0

    iput-wide v1, v0, Lc8/f0;->b:J

    return-void
.end method
