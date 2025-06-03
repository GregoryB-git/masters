.class public final Lqc/j;
.super Lwb/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lwb/c;"
    }
.end annotation

.annotation runtime Lwb/e;
    c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt"
    f = "Errors.kt"
    l = {
        0x9c
    }
    m = "catchImpl"
.end annotation


# instance fields
.field public a:Lec/s;

.field public synthetic b:Ljava/lang/Object;

.field public c:I


# direct methods
.method public constructor <init>(Lub/e;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lub/e<",
            "-",
            "Lqc/j;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0, p1}, Lwb/c;-><init>(Lub/e;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lqc/j;->b:Ljava/lang/Object;

    iget p1, p0, Lqc/j;->c:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lqc/j;->c:I

    const/4 p1, 0x0

    invoke-static {p0, p1, p1}, Lx6/b;->k(Lub/e;Lqc/e;Lqc/f;)Ljava/io/Serializable;

    move-result-object p1

    return-object p1
.end method
