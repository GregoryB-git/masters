.class public final Lr3/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm3/b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lm3/b<",
        "Lr3/t;",
        ">;"
    }
.end annotation


# instance fields
.field public final a:Lqb/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lqb/a<",
            "Lt3/a;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Lqb/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lqb/a<",
            "Lt3/a;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Lqb/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lqb/a<",
            "Lr3/e;",
            ">;"
        }
    .end annotation
.end field

.field public final d:Lqb/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lqb/a<",
            "Lr3/z;",
            ">;"
        }
    .end annotation
.end field

.field public final e:Lqb/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lqb/a<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lqb/a;Lqb/a;)V
    .locals 3

    sget-object v0, Lt3/b$a;->a:Lt3/b;

    sget-object v1, Lt3/c$a;->a:Lt3/c;

    sget-object v2, Lr3/h$a;->a:Lr3/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lr3/u;->a:Lqb/a;

    iput-object v1, p0, Lr3/u;->b:Lqb/a;

    iput-object v2, p0, Lr3/u;->c:Lqb/a;

    iput-object p1, p0, Lr3/u;->d:Lqb/a;

    iput-object p2, p0, Lr3/u;->e:Lqb/a;

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 8

    .line 1
    iget-object v0, p0, Lr3/u;->a:Lqb/a;

    .line 2
    .line 3
    invoke-interface {v0}, Lqb/a;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    move-object v2, v0

    .line 8
    check-cast v2, Lt3/a;

    .line 9
    .line 10
    iget-object v0, p0, Lr3/u;->b:Lqb/a;

    .line 11
    .line 12
    invoke-interface {v0}, Lqb/a;->get()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    move-object v3, v0

    .line 17
    check-cast v3, Lt3/a;

    .line 18
    .line 19
    iget-object v0, p0, Lr3/u;->c:Lqb/a;

    .line 20
    .line 21
    invoke-interface {v0}, Lqb/a;->get()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    iget-object v1, p0, Lr3/u;->d:Lqb/a;

    .line 26
    .line 27
    invoke-interface {v1}, Lqb/a;->get()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    iget-object v6, p0, Lr3/u;->e:Lqb/a;

    .line 32
    .line 33
    new-instance v7, Lr3/t;

    .line 34
    .line 35
    move-object v4, v0

    .line 36
    check-cast v4, Lr3/e;

    .line 37
    .line 38
    move-object v5, v1

    .line 39
    check-cast v5, Lr3/z;

    .line 40
    .line 41
    move-object v1, v7

    .line 42
    invoke-direct/range {v1 .. v6}, Lr3/t;-><init>(Lt3/a;Lt3/a;Lr3/e;Lr3/z;Lqb/a;)V

    .line 43
    .line 44
    .line 45
    return-object v7
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
