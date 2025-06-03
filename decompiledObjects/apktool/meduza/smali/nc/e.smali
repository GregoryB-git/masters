.class public final Lnc/e;
.super Lwb/c;
.source "SourceFile"


# annotations
.annotation runtime Lwb/e;
    c = "kotlinx.coroutines.AwaitKt"
    f = "Await.kt"
    l = {
        0x42
    }
    m = "joinAll"
.end annotation


# instance fields
.field public a:Ljava/util/Iterator;

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
            "Lnc/e;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0, p1}, Lwb/c;-><init>(Lub/e;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lnc/e;->b:Ljava/lang/Object;

    iget p1, p0, Lnc/e;->c:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lnc/e;->c:I

    const/4 p1, 0x0

    invoke-static {p1, p0}, Lnc/d;->b(Ljava/util/List;Lub/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
