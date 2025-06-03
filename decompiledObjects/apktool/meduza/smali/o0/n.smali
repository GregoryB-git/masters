.class public final Lo0/n;
.super Lec/j;
.source "SourceFile"

# interfaces
.implements Ldc/l;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lec/j;",
        "Ldc/l<",
        "Ljava/lang/Throwable;",
        "Lrb/h;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic a:Ldc/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldc/l<",
            "Ljava/lang/Throwable;",
            "Lrb/h;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic b:Lo0/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo0/p<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic c:Ldc/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldc/p<",
            "Ljava/lang/Object;",
            "Ljava/lang/Throwable;",
            "Lrb/h;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lo0/r;Lo0/p;Lo0/s;)V
    .locals 0

    iput-object p1, p0, Lo0/n;->a:Ldc/l;

    iput-object p2, p0, Lo0/n;->b:Lo0/p;

    iput-object p3, p0, Lo0/n;->c:Ldc/p;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lec/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    check-cast p1, Ljava/lang/Throwable;

    .line 2
    .line 3
    iget-object v0, p0, Lo0/n;->a:Ldc/l;

    .line 4
    .line 5
    invoke-interface {v0, p1}, Ldc/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lo0/n;->b:Lo0/p;

    .line 9
    .line 10
    iget-object v0, v0, Lo0/p;->c:Lpc/b;

    .line 11
    .line 12
    invoke-virtual {v0, p1}, Lpc/b;->d(Ljava/lang/Throwable;)Z

    .line 13
    .line 14
    .line 15
    :cond_0
    iget-object v0, p0, Lo0/n;->b:Lo0/p;

    .line 16
    .line 17
    iget-object v0, v0, Lo0/p;->c:Lpc/b;

    .line 18
    .line 19
    invoke-virtual {v0}, Lpc/b;->c()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    instance-of v1, v0, Lpc/j$b;

    .line 24
    .line 25
    const/4 v2, 0x0

    .line 26
    if-nez v1, :cond_1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    move-object v0, v2

    .line 30
    :goto_0
    if-nez v0, :cond_2

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_2
    iget-object v1, p0, Lo0/n;->c:Ldc/p;

    .line 34
    .line 35
    invoke-interface {v1, v0, p1}, Ldc/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    sget-object v2, Lrb/h;->a:Lrb/h;

    .line 39
    .line 40
    :goto_1
    if-nez v2, :cond_0

    .line 41
    .line 42
    sget-object p1, Lrb/h;->a:Lrb/h;

    .line 43
    .line 44
    return-object p1
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
