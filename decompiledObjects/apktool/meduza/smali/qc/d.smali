.class public final Lqc/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lqc/e;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lqc/e<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public final a:Lqc/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lqc/e<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final b:Ldc/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldc/l<",
            "TT;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Ldc/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldc/p<",
            "Ljava/lang/Object;",
            "Ljava/lang/Object;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lt2/f;Lqc/h$b;Lqc/h$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lqc/d;->a:Lqc/e;

    iput-object p2, p0, Lqc/d;->b:Ldc/l;

    iput-object p3, p0, Lqc/d;->c:Ldc/p;

    return-void
.end method


# virtual methods
.method public final collect(Lqc/f;Lub/e;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lqc/f<",
            "-TT;>;",
            "Lub/e<",
            "-",
            "Lrb/h;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lec/s;

    invoke-direct {v0}, Lec/s;-><init>()V

    sget-object v1, Leb/y;->b:Ld2/h0;

    iput-object v1, v0, Lec/s;->a:Ljava/lang/Object;

    iget-object v1, p0, Lqc/d;->a:Lqc/e;

    new-instance v2, Lqc/d$a;

    invoke-direct {v2, p0, v0, p1}, Lqc/d$a;-><init>(Lqc/d;Lec/s;Lqc/f;)V

    invoke-interface {v1, v2, p2}, Lqc/e;->collect(Lqc/f;Lub/e;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lvb/a;->a:Lvb/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Lrb/h;->a:Lrb/h;

    return-object p1
.end method
