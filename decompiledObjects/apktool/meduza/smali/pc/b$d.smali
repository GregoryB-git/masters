.class public final Lpc/b$d;
.super Lwb/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lpc/b;->D(Lpc/b;Lub/e;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Lwb/c;"
    }
.end annotation

.annotation runtime Lwb/e;
    c = "kotlinx.coroutines.channels.BufferedChannel"
    f = "BufferedChannel.kt"
    l = {
        0x2e3
    }
    m = "receiveCatching-JP2dKIU$suspendImpl"
.end annotation


# instance fields
.field public synthetic a:Ljava/lang/Object;

.field public final synthetic b:Lpc/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lpc/b<",
            "TE;>;"
        }
    .end annotation
.end field

.field public c:I


# direct methods
.method public constructor <init>(Lpc/b;Lub/e;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpc/b<",
            "TE;>;",
            "Lub/e<",
            "-",
            "Lpc/b$d;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lpc/b$d;->b:Lpc/b;

    invoke-direct {p0, p2}, Lwb/c;-><init>(Lub/e;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lpc/b$d;->a:Ljava/lang/Object;

    iget p1, p0, Lpc/b$d;->c:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lpc/b$d;->c:I

    iget-object p1, p0, Lpc/b$d;->b:Lpc/b;

    invoke-static {p1, p0}, Lpc/b;->D(Lpc/b;Lub/e;)Ljava/lang/Object;

    move-result-object p1

    sget-object v0, Lvb/a;->a:Lvb/a;

    if-ne p1, v0, :cond_0

    return-object p1

    :cond_0
    new-instance v0, Lpc/j;

    invoke-direct {v0, p1}, Lpc/j;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method
