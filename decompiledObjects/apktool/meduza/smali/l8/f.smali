.class public final Ll8/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ll8/f$a;
    }
.end annotation


# static fields
.field public static final c:Ll8/f$a;


# instance fields
.field public final a:Lp8/e;

.field public b:Ll8/d;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Ll8/f$a;

    invoke-direct {v0}, Ll8/f$a;-><init>()V

    sput-object v0, Ll8/f;->c:Ll8/f$a;

    return-void
.end method

.method public constructor <init>(Lp8/e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll8/f;->a:Lp8/e;

    sget-object p1, Ll8/f;->c:Ll8/f$a;

    iput-object p1, p0, Ll8/f;->b:Ll8/d;

    return-void
.end method

.method public constructor <init>(Lp8/e;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Ll8/f;-><init>(Lp8/e;)V

    invoke-virtual {p0, p2}, Ll8/f;->a(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Ll8/f;->b:Ll8/d;

    .line 2
    .line 3
    invoke-interface {v0}, Ll8/d;->a()V

    .line 4
    .line 5
    .line 6
    sget-object v0, Ll8/f;->c:Ll8/f$a;

    .line 7
    .line 8
    iput-object v0, p0, Ll8/f;->b:Ll8/d;

    .line 9
    .line 10
    if-nez p1, :cond_0

    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    iget-object v0, p0, Ll8/f;->a:Lp8/e;

    .line 14
    .line 15
    const-string v1, "userlog"

    .line 16
    .line 17
    invoke-virtual {v0, p1, v1}, Lp8/e;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    new-instance v0, Ll8/j;

    .line 22
    .line 23
    invoke-direct {v0, p1}, Ll8/j;-><init>(Ljava/io/File;)V

    .line 24
    .line 25
    .line 26
    iput-object v0, p0, Ll8/f;->b:Ll8/d;

    .line 27
    .line 28
    return-void
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
