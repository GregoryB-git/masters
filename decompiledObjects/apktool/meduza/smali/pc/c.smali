.class public final Lpc/c;
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
.field public final synthetic a:Ljava/lang/Object;

.field public final synthetic b:Lpc/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lpc/b<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public final synthetic c:Luc/f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Luc/f<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/Object;Lpc/b;Luc/f;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lpc/b<",
            "Ljava/lang/Object;",
            ">;",
            "Luc/f<",
            "*>;)V"
        }
    .end annotation

    iput-object p1, p0, Lpc/c;->a:Ljava/lang/Object;

    iput-object p2, p0, Lpc/c;->b:Lpc/b;

    iput-object p3, p0, Lpc/c;->c:Luc/f;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lec/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    check-cast p1, Ljava/lang/Throwable;

    .line 2
    .line 3
    iget-object p1, p0, Lpc/c;->a:Ljava/lang/Object;

    .line 4
    .line 5
    sget-object v0, Lpc/e;->l:Ld2/h0;

    .line 6
    .line 7
    if-eq p1, v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lpc/c;->b:Lpc/b;

    .line 10
    .line 11
    iget-object v0, v0, Lpc/b;->b:Ldc/l;

    .line 12
    .line 13
    iget-object v1, p0, Lpc/c;->c:Luc/f;

    .line 14
    .line 15
    invoke-interface {v1}, Luc/f;->getContext()Lub/h;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-static {v0, p1, v1}, Lp2/m0;->j(Ldc/l;Ljava/lang/Object;Lub/h;)V

    .line 20
    .line 21
    .line 22
    :cond_0
    sget-object p1, Lrb/h;->a:Lrb/h;

    .line 23
    .line 24
    return-object p1
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
.end method
