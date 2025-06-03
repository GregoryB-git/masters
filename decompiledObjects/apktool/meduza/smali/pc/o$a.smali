.class public final Lpc/o$a;
.super Lwb/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lpc/o;->a(Lpc/q;Ldc/a;Lub/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lwb/e;
    c = "kotlinx.coroutines.channels.ProduceKt"
    f = "Produce.kt"
    l = {
        0x99
    }
    m = "awaitClose"
.end annotation


# instance fields
.field public a:Lpc/q;

.field public b:Ldc/a;

.field public synthetic c:Ljava/lang/Object;

.field public d:I


# direct methods
.method public constructor <init>(Lub/e;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lub/e<",
            "-",
            "Lpc/o$a;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0, p1}, Lwb/c;-><init>(Lub/e;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lpc/o$a;->c:Ljava/lang/Object;

    iget p1, p0, Lpc/o$a;->d:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lpc/o$a;->d:I

    const/4 p1, 0x0

    invoke-static {p1, p1, p0}, Lpc/o;->a(Lpc/q;Ldc/a;Lub/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
