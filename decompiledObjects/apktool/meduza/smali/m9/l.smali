.class public final Lm9/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm9/z;


# static fields
.field public static final d:Leb/s0$b;

.field public static final e:Leb/s0$b;

.field public static final f:Leb/s0$b;


# instance fields
.field public final a:Lt9/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lt9/b<",
            "Lq9/f;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Lt9/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lt9/b<",
            "Lca/f;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lu7/j;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 1
    sget-object v0, Leb/s0;->d:Leb/s0$a;

    .line 2
    .line 3
    sget-object v1, Leb/s0$d;->d:Ljava/util/BitSet;

    .line 4
    .line 5
    new-instance v1, Leb/s0$b;

    .line 6
    .line 7
    const-string v2, "x-firebase-client-log-type"

    .line 8
    .line 9
    invoke-direct {v1, v2, v0}, Leb/s0$b;-><init>(Ljava/lang/String;Leb/s0$c;)V

    .line 10
    .line 11
    .line 12
    sput-object v1, Lm9/l;->d:Leb/s0$b;

    .line 13
    .line 14
    new-instance v1, Leb/s0$b;

    .line 15
    .line 16
    const-string v2, "x-firebase-client"

    .line 17
    .line 18
    invoke-direct {v1, v2, v0}, Leb/s0$b;-><init>(Ljava/lang/String;Leb/s0$c;)V

    .line 19
    .line 20
    .line 21
    sput-object v1, Lm9/l;->e:Leb/s0$b;

    .line 22
    .line 23
    new-instance v1, Leb/s0$b;

    .line 24
    .line 25
    const-string v2, "x-firebase-gmpid"

    .line 26
    .line 27
    invoke-direct {v1, v2, v0}, Leb/s0$b;-><init>(Ljava/lang/String;Leb/s0$c;)V

    .line 28
    .line 29
    .line 30
    sput-object v1, Lm9/l;->f:Leb/s0$b;

    .line 31
    .line 32
    return-void
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

.method public constructor <init>(Lt9/b;Lt9/b;Lu7/j;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lt9/b<",
            "Lca/f;",
            ">;",
            "Lt9/b<",
            "Lq9/f;",
            ">;",
            "Lu7/j;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm9/l;->b:Lt9/b;

    iput-object p2, p0, Lm9/l;->a:Lt9/b;

    iput-object p3, p0, Lm9/l;->c:Lu7/j;

    return-void
.end method
