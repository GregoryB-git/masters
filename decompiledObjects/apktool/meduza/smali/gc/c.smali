.class public abstract Lgc/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lgc/c$a;
    }
.end annotation


# static fields
.field public static final a:Lgc/c$a;

.field public static final b:Lgc/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lgc/c$a;

    .line 2
    .line 3
    invoke-direct {v0}, Lgc/c$a;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lgc/c;->a:Lgc/c$a;

    .line 7
    .line 8
    sget-object v0, Lyb/b;->a:Lac/a;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    sget-object v0, Lac/a$a;->a:Ljava/lang/Integer;

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    const/16 v1, 0x22

    .line 22
    .line 23
    if-lt v0, v1, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/4 v0, 0x0

    .line 27
    goto :goto_1

    .line 28
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 29
    :goto_1
    if-eqz v0, :cond_2

    .line 30
    .line 31
    new-instance v0, Lhc/a;

    .line 32
    .line 33
    invoke-direct {v0}, Lhc/a;-><init>()V

    .line 34
    .line 35
    .line 36
    goto :goto_2

    .line 37
    :cond_2
    new-instance v0, Lgc/b;

    .line 38
    .line 39
    invoke-direct {v0}, Lgc/b;-><init>()V

    .line 40
    .line 41
    .line 42
    :goto_2
    sput-object v0, Lgc/c;->b:Lgc/a;

    .line 43
    .line 44
    return-void
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

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
