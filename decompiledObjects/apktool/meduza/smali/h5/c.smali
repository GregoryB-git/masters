.class public final Lh5/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv3/g;


# static fields
.field public static final synthetic b:I


# instance fields
.field public final a:Lo7/t;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo7/t<",
            "Lh5/a;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lh5/c;

    .line 2
    .line 3
    sget-object v1, Lo7/t;->b:Lo7/t$b;

    .line 4
    .line 5
    sget-object v1, Lo7/l0;->e:Lo7/l0;

    .line 6
    .line 7
    invoke-direct {v0, v1}, Lh5/c;-><init>(Ljava/util/List;)V

    .line 8
    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    invoke-static {v0}, Lv5/e0;->E(I)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    const/4 v0, 0x1

    .line 15
    invoke-static {v0}, Lv5/e0;->E(I)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    return-void
    .line 19
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
.end method

.method public constructor <init>(Ljava/util/List;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lo7/t;->p(Ljava/util/Collection;)Lo7/t;

    move-result-object p1

    iput-object p1, p0, Lh5/c;->a:Lo7/t;

    return-void
.end method
