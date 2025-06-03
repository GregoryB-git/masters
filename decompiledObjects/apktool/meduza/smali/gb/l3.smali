.class public final Lgb/l3;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:[Lm/e;

.field public final b:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lgb/l3;

    const/4 v1, 0x0

    new-array v1, v1, [Lm/e;

    invoke-direct {v0, v1}, Lgb/l3;-><init>([Lm/e;)V

    return-void
.end method

.method public constructor <init>([Lm/e;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lgb/l3;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    iput-object p1, p0, Lgb/l3;->a:[Lm/e;

    return-void
.end method


# virtual methods
.method public final a(J)V
    .locals 4

    iget-object v0, p0, Lgb/l3;->a:[Lm/e;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    invoke-virtual {v3, p1, p2}, Lm/e;->j(J)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method
