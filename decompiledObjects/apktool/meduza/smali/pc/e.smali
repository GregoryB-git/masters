.class public final Lpc/e;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lpc/k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lpc/k<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public static final b:I

.field public static final c:I

.field public static final d:Ld2/h0;

.field public static final e:Ld2/h0;

.field public static final f:Ld2/h0;

.field public static final g:Ld2/h0;

.field public static final h:Ld2/h0;

.field public static final i:Ld2/h0;

.field public static final j:Ld2/h0;

.field public static final k:Ld2/h0;

.field public static final l:Ld2/h0;

.field public static final m:Ld2/h0;

.field public static final n:Ld2/h0;

.field public static final o:Ld2/h0;

.field public static final p:Ld2/h0;

.field public static final q:Ld2/h0;

.field public static final r:Ld2/h0;

.field public static final s:Ld2/h0;


# direct methods
.method public static constructor <clinit>()V
    .locals 7

    new-instance v6, Lpc/k;

    const-wide/16 v1, -0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lpc/k;-><init>(JLpc/k;Lpc/b;I)V

    sput-object v6, Lpc/e;->a:Lpc/k;

    const-string v0, "kotlinx.coroutines.bufferedChannel.segmentSize"

    const/16 v1, 0x20

    const/4 v2, 0x0

    const/16 v3, 0xc

    invoke-static {v0, v1, v2, v2, v3}, Lx6/b;->w0(Ljava/lang/String;IIII)I

    move-result v0

    sput v0, Lpc/e;->b:I

    const-string v0, "kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations"

    const/16 v1, 0x2710

    invoke-static {v0, v1, v2, v2, v3}, Lx6/b;->w0(Ljava/lang/String;IIII)I

    move-result v0

    sput v0, Lpc/e;->c:I

    new-instance v0, Ld2/h0;

    const-string v1, "BUFFERED"

    const/16 v2, 0x9

    invoke-direct {v0, v1, v2}, Ld2/h0;-><init>(Ljava/lang/Object;I)V

    sput-object v0, Lpc/e;->d:Ld2/h0;

    new-instance v0, Ld2/h0;

    const-string v1, "SHOULD_BUFFER"

    invoke-direct {v0, v1, v2}, Ld2/h0;-><init>(Ljava/lang/Object;I)V

    sput-object v0, Lpc/e;->e:Ld2/h0;

    new-instance v0, Ld2/h0;

    const-string v1, "S_RESUMING_BY_RCV"

    invoke-direct {v0, v1, v2}, Ld2/h0;-><init>(Ljava/lang/Object;I)V

    sput-object v0, Lpc/e;->f:Ld2/h0;

    new-instance v0, Ld2/h0;

    const-string v1, "RESUMING_BY_EB"

    invoke-direct {v0, v1, v2}, Ld2/h0;-><init>(Ljava/lang/Object;I)V

    sput-object v0, Lpc/e;->g:Ld2/h0;

    new-instance v0, Ld2/h0;

    const-string v1, "POISONED"

    invoke-direct {v0, v1, v2}, Ld2/h0;-><init>(Ljava/lang/Object;I)V

    sput-object v0, Lpc/e;->h:Ld2/h0;

    new-instance v0, Ld2/h0;

    const-string v1, "DONE_RCV"

    invoke-direct {v0, v1, v2}, Ld2/h0;-><init>(Ljava/lang/Object;I)V

    sput-object v0, Lpc/e;->i:Ld2/h0;

    new-instance v0, Ld2/h0;

    const-string v1, "INTERRUPTED_SEND"

    invoke-direct {v0, v1, v2}, Ld2/h0;-><init>(Ljava/lang/Object;I)V

    sput-object v0, Lpc/e;->j:Ld2/h0;

    new-instance v0, Ld2/h0;

    const-string v1, "INTERRUPTED_RCV"

    invoke-direct {v0, v1, v2}, Ld2/h0;-><init>(Ljava/lang/Object;I)V

    sput-object v0, Lpc/e;->k:Ld2/h0;

    new-instance v0, Ld2/h0;

    const-string v1, "CHANNEL_CLOSED"

    invoke-direct {v0, v1, v2}, Ld2/h0;-><init>(Ljava/lang/Object;I)V

    sput-object v0, Lpc/e;->l:Ld2/h0;

    new-instance v0, Ld2/h0;

    const-string v1, "SUSPEND"

    invoke-direct {v0, v1, v2}, Ld2/h0;-><init>(Ljava/lang/Object;I)V

    sput-object v0, Lpc/e;->m:Ld2/h0;

    new-instance v0, Ld2/h0;

    const-string v1, "SUSPEND_NO_WAITER"

    invoke-direct {v0, v1, v2}, Ld2/h0;-><init>(Ljava/lang/Object;I)V

    sput-object v0, Lpc/e;->n:Ld2/h0;

    new-instance v0, Ld2/h0;

    const-string v1, "FAILED"

    invoke-direct {v0, v1, v2}, Ld2/h0;-><init>(Ljava/lang/Object;I)V

    sput-object v0, Lpc/e;->o:Ld2/h0;

    new-instance v0, Ld2/h0;

    const-string v1, "NO_RECEIVE_RESULT"

    invoke-direct {v0, v1, v2}, Ld2/h0;-><init>(Ljava/lang/Object;I)V

    sput-object v0, Lpc/e;->p:Ld2/h0;

    new-instance v0, Ld2/h0;

    const-string v1, "CLOSE_HANDLER_CLOSED"

    invoke-direct {v0, v1, v2}, Ld2/h0;-><init>(Ljava/lang/Object;I)V

    sput-object v0, Lpc/e;->q:Ld2/h0;

    new-instance v0, Ld2/h0;

    const-string v1, "CLOSE_HANDLER_INVOKED"

    invoke-direct {v0, v1, v2}, Ld2/h0;-><init>(Ljava/lang/Object;I)V

    sput-object v0, Lpc/e;->r:Ld2/h0;

    new-instance v0, Ld2/h0;

    const-string v1, "NO_CLOSE_CAUSE"

    invoke-direct {v0, v1, v2}, Ld2/h0;-><init>(Ljava/lang/Object;I)V

    sput-object v0, Lpc/e;->s:Ld2/h0;

    return-void
.end method

.method public static final a(Lnc/k;Ljava/lang/Object;Ldc/l;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lnc/k<",
            "-TT;>;TT;",
            "Ldc/l<",
            "-",
            "Ljava/lang/Throwable;",
            "Lrb/h;",
            ">;)Z"
        }
    .end annotation

    invoke-interface {p0, p1, p2}, Lnc/k;->j(Ljava/lang/Object;Ldc/l;)Ld2/h0;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-interface {p0, p1}, Lnc/k;->n(Ljava/lang/Object;)V

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method
