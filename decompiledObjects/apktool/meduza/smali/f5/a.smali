.class public final Lf5/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf5/i;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lf5/f;Lf5/e;)Lt5/f0$a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lf5/f;",
            "Lf5/e;",
            ")",
            "Lt5/f0$a<",
            "Lf5/g;",
            ">;"
        }
    .end annotation

    new-instance v0, Lf5/h;

    invoke-direct {v0, p1, p2}, Lf5/h;-><init>(Lf5/f;Lf5/e;)V

    return-object v0
.end method

.method public final b()Lt5/f0$a;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lt5/f0$a<",
            "Lf5/g;",
            ">;"
        }
    .end annotation

    new-instance v0, Lf5/h;

    sget-object v1, Lf5/f;->n:Lf5/f;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lf5/h;-><init>(Lf5/f;Lf5/e;)V

    return-object v0
.end method
