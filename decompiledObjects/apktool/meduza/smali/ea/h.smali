.class public final Lea/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly8/d;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ly8/d<",
        "Lea/f0;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:Lea/h;

.field public static final b:Ly8/c;

.field public static final c:Ly8/c;

.field public static final d:Ly8/c;

.field public static final e:Ly8/c;

.field public static final f:Ly8/c;

.field public static final g:Ly8/c;

.field public static final h:Ly8/c;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lea/h;

    invoke-direct {v0}, Lea/h;-><init>()V

    sput-object v0, Lea/h;->a:Lea/h;

    const-string v0, "sessionId"

    invoke-static {v0}, Ly8/c;->a(Ljava/lang/String;)Ly8/c;

    move-result-object v0

    sput-object v0, Lea/h;->b:Ly8/c;

    const-string v0, "firstSessionId"

    invoke-static {v0}, Ly8/c;->a(Ljava/lang/String;)Ly8/c;

    move-result-object v0

    sput-object v0, Lea/h;->c:Ly8/c;

    const-string v0, "sessionIndex"

    invoke-static {v0}, Ly8/c;->a(Ljava/lang/String;)Ly8/c;

    move-result-object v0

    sput-object v0, Lea/h;->d:Ly8/c;

    const-string v0, "eventTimestampUs"

    invoke-static {v0}, Ly8/c;->a(Ljava/lang/String;)Ly8/c;

    move-result-object v0

    sput-object v0, Lea/h;->e:Ly8/c;

    const-string v0, "dataCollectionStatus"

    invoke-static {v0}, Ly8/c;->a(Ljava/lang/String;)Ly8/c;

    move-result-object v0

    sput-object v0, Lea/h;->f:Ly8/c;

    const-string v0, "firebaseInstallationId"

    invoke-static {v0}, Ly8/c;->a(Ljava/lang/String;)Ly8/c;

    move-result-object v0

    sput-object v0, Lea/h;->g:Ly8/c;

    const-string v0, "firebaseAuthenticationToken"

    invoke-static {v0}, Ly8/c;->a(Ljava/lang/String;)Ly8/c;

    move-result-object v0

    sput-object v0, Lea/h;->h:Ly8/c;

    return-void
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
    check-cast p1, Lea/f0;

    .line 2
    .line 3
    check-cast p2, Ly8/e;

    .line 4
    .line 5
    sget-object v0, Lea/h;->b:Ly8/c;

    .line 6
    .line 7
    iget-object v1, p1, Lea/f0;->a:Ljava/lang/String;

    .line 8
    .line 9
    invoke-interface {p2, v0, v1}, Ly8/e;->e(Ly8/c;Ljava/lang/Object;)Ly8/e;

    .line 10
    .line 11
    .line 12
    sget-object v0, Lea/h;->c:Ly8/c;

    .line 13
    .line 14
    iget-object v1, p1, Lea/f0;->b:Ljava/lang/String;

    .line 15
    .line 16
    invoke-interface {p2, v0, v1}, Ly8/e;->e(Ly8/c;Ljava/lang/Object;)Ly8/e;

    .line 17
    .line 18
    .line 19
    sget-object v0, Lea/h;->d:Ly8/c;

    .line 20
    .line 21
    iget v1, p1, Lea/f0;->c:I

    .line 22
    .line 23
    invoke-interface {p2, v0, v1}, Ly8/e;->c(Ly8/c;I)Ly8/e;

    .line 24
    .line 25
    .line 26
    sget-object v0, Lea/h;->e:Ly8/c;

    .line 27
    .line 28
    iget-wide v1, p1, Lea/f0;->d:J

    .line 29
    .line 30
    invoke-interface {p2, v0, v1, v2}, Ly8/e;->d(Ly8/c;J)Ly8/e;

    .line 31
    .line 32
    .line 33
    sget-object v0, Lea/h;->f:Ly8/c;

    .line 34
    .line 35
    iget-object v1, p1, Lea/f0;->e:Lea/j;

    .line 36
    .line 37
    invoke-interface {p2, v0, v1}, Ly8/e;->e(Ly8/c;Ljava/lang/Object;)Ly8/e;

    .line 38
    .line 39
    .line 40
    sget-object v0, Lea/h;->g:Ly8/c;

    .line 41
    .line 42
    iget-object v1, p1, Lea/f0;->f:Ljava/lang/String;

    .line 43
    .line 44
    invoke-interface {p2, v0, v1}, Ly8/e;->e(Ly8/c;Ljava/lang/Object;)Ly8/e;

    .line 45
    .line 46
    .line 47
    sget-object v0, Lea/h;->h:Ly8/c;

    .line 48
    .line 49
    iget-object p1, p1, Lea/f0;->g:Ljava/lang/String;

    .line 50
    .line 51
    invoke-interface {p2, v0, p1}, Ly8/e;->e(Ly8/c;Ljava/lang/Object;)Ly8/e;

    .line 52
    .line 53
    .line 54
    return-void
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
