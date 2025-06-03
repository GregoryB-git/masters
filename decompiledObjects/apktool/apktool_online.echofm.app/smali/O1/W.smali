.class public final synthetic LO1/W;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx1/F$b;


# instance fields
.field public final synthetic a:[Ljava/lang/String;

.field public final synthetic b:I

.field public final synthetic c:LO1/V$e;

.field public final synthetic d:Ljava/util/concurrent/CountDownLatch;


# direct methods
.method public synthetic constructor <init>([Ljava/lang/String;ILO1/V$e;Ljava/util/concurrent/CountDownLatch;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LO1/W;->a:[Ljava/lang/String;

    .line 5
    .line 6
    iput p2, p0, LO1/W;->b:I

    .line 7
    .line 8
    iput-object p3, p0, LO1/W;->c:LO1/V$e;

    .line 9
    .line 10
    iput-object p4, p0, LO1/W;->d:Ljava/util/concurrent/CountDownLatch;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final a(Lx1/K;)V
    .locals 4

    .line 1
    iget-object v0, p0, LO1/W;->a:[Ljava/lang/String;

    .line 2
    .line 3
    iget v1, p0, LO1/W;->b:I

    .line 4
    .line 5
    iget-object v2, p0, LO1/W;->c:LO1/V$e;

    .line 6
    .line 7
    iget-object v3, p0, LO1/W;->d:Ljava/util/concurrent/CountDownLatch;

    .line 8
    .line 9
    invoke-static {v0, v1, v2, v3, p1}, LO1/V$e;->a([Ljava/lang/String;ILO1/V$e;Ljava/util/concurrent/CountDownLatch;Lx1/K;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method
